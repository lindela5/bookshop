--liquibase formatted sql
--changeset sinitsa:35-insert-supply-table

INSERT INTO supply (supply_id, supplier_id, supply_date, supplier_price) VALUES
    (1, 1, '2019-10-15 00:00:00',129.1),
    (2, 2,'2020-01-10 00:00:00', 108.3),
    (3, 3,'2020-01-10 00:00:00', 450),
    (4, 2,'2008-03-01 00:00:00', 152.3),
    (5, 1,'2008-03-13 00:00:00', 238.8);
GO




--rollback DELETE FROM supply;