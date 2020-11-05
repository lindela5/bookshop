--liquibase formatted sql
--changeset sinitsa:20-insert-publishing-house-table

INSERT INTO publishing_house (publishing_house_id, name_publisher, address) VALUES
    (1, 'Penguin Clothbound Classics', '20 Vauxhall Bridge Road London, United Kingdom'),
    (2, 'BBC Books', '8 Viaduct Gardens, London,  United Kingdom'),
    (3, 'Orbit Books',' 1290 Avenue of the Americas, New York, United States'),
    (4, 'AST','21 Zvezdny Boulevard, Ostankinsky, Moscow');
GO



--rollback DELETE FROM publishing_house;



