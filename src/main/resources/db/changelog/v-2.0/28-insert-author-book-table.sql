--liquibase formatted sql
--changeset sinitsa:08-insert-author-books-table


INSERT INTO author_book (book_id, author_id) VALUES
    (1, 5),    (2, 8),
    (2, 9),    (3, 4),
    (4, 4),    (5, 4),
    (6, 1),    (7, 1),
    (8, 2),    (9, 2),
    (10, 3),    (11, 3),
    (12, 6),    (13, 7),
    (14, 8),    (15, 9);
GO


--rollback DELETE FROM author_book;