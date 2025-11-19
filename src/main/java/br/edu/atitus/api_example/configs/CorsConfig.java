//package br.edu.atitus.api_example.configs;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//public class CorsConfig {
//
//    @Bean
//    public CorsFilter corsFilter() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowCredentials(true);
//
//        // Permite todas as origens de localhost (desenvolvimento)
//        corsConfiguration.addAllowedOriginPattern("http://localhost:*");
//        corsConfiguration.addAllowedOriginPattern("http://127.0.0.1:*");
//        corsConfiguration.addAllowedOriginPattern("https://localhost:*");
//
//        // Para produção, adicione seu domínio específico
//        corsConfiguration.addAllowedOrigin("https://seufrontend.com");
//
//        corsConfiguration.addAllowedHeader("*");
//        corsConfiguration.addAllowedMethod("*");
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfiguration);
//
//        return new CorsFilter(source);
//    }
//}