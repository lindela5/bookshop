--liquibase formatted sql
--changeset sinitsa:01-insert-authors-table


INSERT INTO author (author_id, first_name, last_name, country) VALUES
    (1, 'Mark', 'Twain', 'United States'),
    (2, 'Joanne', 'Rowling', 'United Kingdom'),
    (3, 'George', 'Orwell', 'United Kingdom'),
    (4, 'John Ronald Reuel', 'Tolkien', 'United Kingdom'),
    (5, 'Arthur Conan', 'Doyle', 'United Kingdom'),
    (6, 'Agatha', 'Christie', 'United Kingdom'),
    (7, 'Ivan', 'Turgenev', 'Russia'),
    (8,'Neil','Gaiman', 'United Kingdom'),
    (9,'Terry','Pratchett', 'United Kingdom');
GO


--rollback DELETE FROM author;