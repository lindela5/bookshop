CREATE TABLE author
(
    author_id         int   NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name  VARCHAR(100) NOT NULL,
    country VARCHAR(50),

    PRIMARY KEY (author_id)
);
GO