package br.edu.atitus.api_example.services;

import br.edu.atitus.api_example.entities.UserEntity;
import br.edu.atitus.api_example.repositories.UserRepository;

import java.util.regex.Pattern;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{

    private final UserRepository repository;
    private final PasswordEncoder encoder;

    public UserService(UserRepository repository, PasswordEncoder encoder) {
        super();
        this.repository = repository;
        this.encoder = encoder;
    }

    public UserEntity save(UserEntity user) throws Exception {

        if (user == null)
            throw new Exception("Objeto nulo");

        if (user.getName() == null || user.getName().isEmpty())
            throw new Exception("Nome inválido");

        user.setName(user.getName().trim());

        if (user.getEmail() == null || user.getEmail().isEmpty()||!isEmailValid(user.getEmail()))
            throw new Exception("Email inválido");
        
        user.setEmail(user.getEmail().trim());

        if (user.getPassword() == null || user.getPassword().isEmpty() || user.getPassword().length() < 8||!isPasswordValid(user.getPassword()))
            throw new Exception("Digite uma senha com pelo menos 8 caracteres, 1 maiúscula, 1 minúscula, 1 número e 1 símbolo");

        user.setPassword(encoder.encode(user.getPassword()));

        if (repository.existsByEmail(user.getEmail()))
            throw new Exception("Já existe usuário cadastrado com esse email");

        repository.save(user);
        return user;
    }

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		var user= repository.findByEmail(email)
				.orElseThrow(()->new UsernameNotFoundException("Usuário não encontrado com esse email"));
		return user;
	}
	
	public boolean isEmailValid(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(emailRegex, email);

	}
	
	public boolean isPasswordValid(String password) {
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
		return Pattern.matches(passwordRegex, password);
	}

}
