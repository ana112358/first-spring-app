package com.example.frist_spring_app.config; // Pacote onde você coloca a classe (opcional)

// Importações necessárias
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Torna esta classe uma classe de configuração
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite requisições do frontend que está rodando em http://localhost:5500
        registry.addMapping("/**").allowedOrigins("http://127.0.0.1:5500");
    }
}
