CREATE TABLE produto (
                       codigo TEXT PRIMARY KEY UNIQUE NOT NULL,
                       nome TEXT NOT NULL,
                       descricao TEXT NOT NULL,
                       preco DOUBLE PRECISION NOT NULL,
                       estoque INT NOT NULL
);