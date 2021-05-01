# API-REST-Forum
simulação de API-REST baseado no curso de mesmo nome fornecido pela Alura.

Controller para tópicos cuidando das principais actions como listagem com paginação, busca pelo Id, cadastro, atualização e remoção.
Controller para autenticação recebe as credencias no corpo da requisição e devolve token Bearer (stateless).

Padrão Repository para armazenar os métodos de consulta "findBy" e fazer injeção de dependência.
Padrão DTO para receber dados via request body e devolver respostas adequadas ao usuário

Handler com anotação @RestControllerAdvice para tratar MethodArgumentNotValidException, quando forem informados dados errados mostrar mensagem mais amigável ao usuário e em português

