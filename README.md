## Criação do Projeto

- Fui no site https://start.spring.io/ e gerei o projeto base com as dependências.

![alt text](image.png)

- O que é o Maven ? 

    O Maven é uma ferramenta que auxilia o desenvolvedor no gerenciamento das dependências do projeto, disponibilização de plugins para criação de executáveis (JAR, WAR, EAR/ se tratando do Java), geração de documentação, execução de testes automatizados.
    
    O Maven também ajuda a padronizar a estrutura do projeto, o que facilita a colaboração entre os membros da equipe e o desenvolvimento de projetos maiores. Ele utiliza um arquivo de configuração chamado pom.xml (Project Object Model) para definir as dependências do projeto, as configurações de compilação, os plugins necessários e outras informações relevantes.

# Resumo do Funcionamento do HelloWorldController

Este código utiliza o framework **Spring Boot** para criar um serviço simples que responde a requisições HTTP GET.

### Passos:

1. **Importação das Anotações**:
   - `@RestController`: Indica que a classe é um controlador REST, combinando as anotações `@Controller` e `@ResponseBody`.
   - `@RequestMapping("/Hello-world")`: Mapeia a URL base para todas as requisições nesta classe. Neste caso, todas as requisições terão o prefixo `/Hello-world`.
   - `@GetMapping`: Mapeia o método `helloWorld()` para requisições HTTP GET.

2. **Funcionamento**:
   - O Spring Boot inicializa a classe `HelloWordController` por causa da anotação `@RestController`.
   - Quando um cliente acessa `http://localhost:8080/Hello-world` via **GET**, o método `helloWorld()` é chamado.
   - O método retorna a string **"Hello Word!"**, que é enviada como resposta ao cliente.

### Exemplo de Código:

```java
@RestController
@RequestMapping("/Hello-world")
public class HelloWordController {

    @GetMapping
    public String helloWorld(){
        return "Hello Word!";
    }
}
```