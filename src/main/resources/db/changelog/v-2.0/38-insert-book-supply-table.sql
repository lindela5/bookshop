--liquibase formatted sql
--changeset sinitsa:38-insert-book-supply-table

INSERT INTO book_supply (supply_id, book_id, quantity) VALUES
    (1, 1, 4),
    (1, 2, 2),
    (1, 3, 2),
    (1, 4, 3),
    (2, 8, 8),
    (2, 9, 2),
    (3, 5, 2),
    (3, 6, 6),
    (3, 7, 3),
    (4, 13, 5),
    (4, 14, 11),
    (4, 15, 3),
    (5, 10, 5),
    (5, 11, 2),
    (5, 12, 2);
GO

--rollback DELETE FROM book_supply;