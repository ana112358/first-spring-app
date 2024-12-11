## O Controller é responsável por:
- Receber as requisições: Ele captura as solicitações HTTP enviadas pelo cliente (como um navegador ou aplicativo).
    Chamar os serviços adequados: Ele utiliza a lógica de negócios, geralmente definida na camada de serviço, para processar os dados.
    Preparar e enviar a resposta: Após processar os dados, o Controller organiza a resposta (como um JSON ou uma página HTML) e a retorna ao cliente.

## O que é Entity

- Uma entidade no Spring Boot é uma classe Java que representa uma tabela ou coleção no banco de dados. Para que uma classe seja considerada uma entidade, ela deve ser anotada com @Entity, e seus atributos devem ser mapeados para colunas da tabela ou campos da coleção no banco de dados.
