package br.edu.atitus.api_example.repositories;

import java.util.List;
import java.util.UUID;

import br.edu.atitus.api_example.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.atitus.api_example.entities.PointEntity;

@Repository
public interface PointRepository extends JpaRepository<PointEntity, UUID>{


    List<PointEntity> findByUser(UserEntity user);
}
