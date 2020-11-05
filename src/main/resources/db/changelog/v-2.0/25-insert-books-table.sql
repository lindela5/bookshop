--liquibase formatted sql
--changeset sinitsa:02-insert-books-table


INSERT INTO books (book_id, title, isbn, section_id, year_of_issue,publishing_house_id,price,stock_balances) VALUES
    (1, 'The Adventures of Sherlock Holmes', '9780241347782', 1, 2018, 1, 23, 2),
    (2, 'Good Omens', '9781910281918', 7, 2015, 2, 23.16, 1),
    (3, 'The Lord of the Rings', '9780553714777', 2, 2015, 4, 43.5, 1),
    (4, 'The Hobbit', '9780007525508', 2, 2013, 4, 33.8, 2),
    (5, 'The Hobbit','0-618-00221-9', 2, 1937, 1, 213, 1),
    (6, 'The Adventures of Tom Sawyer', '9781094015231', 3, 2020, 3, 15, 5),
    (7, 'The Mysterious Stranger', '9781977555175', 7, 2017, 3, 17.4, 2),
    (8, 'Harry Potter and the Deathly Hallows', '9780553714777', 3, 2017, 4, 24.1, 6),
    (9, 'Fantastic Beasts and Where to Find Them', '9780368500039', 7, 2019, 2, 35, 1),
    (10, 'Nineteen Eighty-Four','9780822235927', 4, 2017, 2, 21.3, 2),
    (11, 'Animal Farm', '9780241341667', 4, 2019, 4, 19.5, 1),
    (12, 'The Murder at the Vicarage', '9780008196516', 1, 2016, 1, 17.3, 1),
    (13, 'Fathers and Sons', '9780553714777', 4, 2017, 4, 25, 4),
    (14, 'The Graveyard Book', '9788897141761', 7, 2016, 2, 28.7, 10),
    (15, 'The Colour of Magic','9788499892849', 7, 2011, 3, 8, 1);
GO


--rollback DELETE FROM books;