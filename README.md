# 💰 Gerenciador de Despesas API

Uma API REST desenvolvida em Spring Boot para controle de despesas pessoais, com cálculos estatísticos automáticos.

## 🚀 Tecnologias
*   **Java 25**
*   **Spring Boot 4.0.5**
*   **Spring Data JPA** (Persistência de dados)
*   **H2 Database** (Banco de dados em memória)
*   **Lombok** (Produtividade no código)
*   **Maven** (Gerenciador de dependências)
*   **Swagger** (Gerador de requisições)

## 🛠️ Funcionalidades (CRUD + Estatísticas)
- [x] **Cadastrar despesa**: Salva descrição, valor e categoria.
- [x] **Listar todas**: Retorna todas as despesas salvas.
- [x] **Filtrar por categoria**: Busca despesas específicas (ex: Alimentação).
- [x] **Estatísticas**:
    - Soma total de gastos.
    - Média de valores.
    - Maior e menor despesa registrada.
- [x] **Atualizar e Deletar**: Controle total sobre os registros.

## 🔌 Endpoints da API

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| POST | `/api/despesas` | Cadastra uma nova despesa |
| GET | `/api/despesas/listaDespesas` | Lista todas as despesas |
| GET | `/api/despesas/dashboard` | Filtra por categoria |
| GET | `/api/despesas/categoria/{cat}` | Filtra por categoria |
| PUT | `/api/despesas/atualizar/{id}` | Atualiza uma despesa por ID |
| DELETE | `/api/despesas/deletar/{id}` | Remove uma despesa por ID |

## 📦 Como rodar o projeto
1. Baixe o .jar disponível nas releases do repositório
2. Rode a partir do terminal usando java -jar ProjetoSB-v1.0-.jar
3. Gere requisições a partir do swagger em [http://localhost:8080/swagger-ui/index.html]
4. Veja o resultado das requisiçẽos nos endpoins disponíveis nesse arquivo listados acima usando a porta 8080 (exemplo: localhost:8080/api/despesas/listaDespesas)
