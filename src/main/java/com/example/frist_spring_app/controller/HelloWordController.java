package com.example.frist_spring_app.controller;

import org.springframework.web.bind.annotation.RestController;
//Importa a anotação @RestController da biblioteca Spring.
import org.springframework.web.bind.annotation.RequestMapping;
//Importa a anotação @RequestMapping usada para mapear URLs para classes ou métodos específicos no Controller
import org.springframework.web.bind.annotation.GetMapping;
//Importa a anotação @GetMapping, usada para mapear requisições HTTP GET para um método.
// Sem ela o metodo helloword não pode ser acessado via requisição get


//O que é o Rest Controller?
/* É uma anotação do Framework Spring MVC que serve para desenvolver serviços RESTful. Ela é uma combinação das anotações @Controller e @ResponseBody.  */
@RestController
@RequestMapping("/Hello-world")

public class HelloWordController {

    @GetMapping
    public String helloWorld(){
        return "Hello Word!";
    }
    
    
    
}

/*Resumo do Funcionamento:

O Spring inicializa o HelloWordController por causa da anotação @RestController.

A anotação @RequestMapping("/Hello-world") define que todas as requisições dentro desta classe terão o prefixo /Hello-world.

A anotação @GetMapping mapeia o método helloWorld para requisições HTTP GET em /Hello-world.

Quando um cliente acessa http://localhost:8080/Hello-world via GET, o método helloWorld é executado.

O método retorna "Hello Word!", que é enviado como resposta ao cliente. */
