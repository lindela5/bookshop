--liquibase formatted sql
--changeset sinitsa:25-insert-sections-table


INSERT INTO sections (id, name_section) VALUES
    (1, 'Detective' ),
    (2, 'Fantasy'),
    (3, 'Adventure'),
    (4, 'Classic'),
    (5, 'Drama'),
    (6, 'Horror'),
    (7, 'Mystery');
GO



--rollback DELETE FROM sections;