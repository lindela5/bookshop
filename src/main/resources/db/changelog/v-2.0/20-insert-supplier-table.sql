--liquibase formatted sql
--changeset sinitsa:30-insert-supplier-table


INSERT INTO supplier (id, supplier_name, address, phone) VALUES
    (1, 'Perfect books', '14 Pinskaya Street, Gomel, Belarus','+375291251256'),
    (2, 'All you need', '10 Kozlova Street, Minsk, Belarus','+375253625252'),
    (3, 'Houses of the Book','23 Zvezdny Boulevard, Ostankinsky, Moscow','');
GO



--rollback DELETE FROM supplier;