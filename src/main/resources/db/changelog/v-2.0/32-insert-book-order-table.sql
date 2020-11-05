--liquibase formatted sql
--changeset sinitsa:18-insert-book-order-table


INSERT INTO book_order (order_id, book_id, quantity) VALUES
    (1, 5, 1),
    (2, 8, 2),
    (2, 9, 1),
    (3, 1, 1),
    (4, 4, 1),
    (5, 13, 1),
    (5, 14, 1),
    (5, 15, 1),
    (6, 10, 2),
    (6, 11, 1),
    (7, 1, 1),
    (7, 12, 1),
    (8, 6, 1),
    (9, 2, 1),
    (9, 3, 1),
    (10, 7, 1),
    (10, 10, 1),
    (11, 15, 1);
GO



--rollback DELETE FROM book-order;