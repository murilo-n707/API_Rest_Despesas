# 💰 Gerenciador de Despesas API

Uma API REST desenvolvida em Spring Boot para controle de despesas pessoais, com cálculos estatísticos automáticos.

## 🚀 Tecnologias
*   **Java 25**
*   **Spring Boot 4.0.5**
*   **Spring Data JPA** (Persistência de dados)
*   **H2 Database** (Banco de dados em memória)
*   **Lombok** (Produtividade no código)
*   **Maven** (Gerenciador de dependências)

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
1. Clone o repositório:
   ```bash
   git clone https://github.com/murilo-n707/API_Rest_Despesas
