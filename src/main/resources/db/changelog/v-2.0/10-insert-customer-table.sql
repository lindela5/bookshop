--liquibase formatted sql
--changeset sinitsa:10-insert-customer-table

INSERT INTO customer (customer_id, first_name, last_name, address, phone, email) VALUES
    (1, 'Maksim', 'Petrov', '246000, Gomel, Sovetskaya St. 53/21', '+375258522321', 'mpetrov@gsu.by'),
    (2, 'Volga', 'Semencova', '246000, Gomel, Lienin Ave 6/14', '+375336541212', 'volga_semencova@mail.ru'),
    (3, 'Oleg', 'Rizov', '246000, Gomel, Artyom St. 10/9', '+375299636336', 'oleg_rizov@gmail.com'),
    (4, 'Myhamed', 'Ali', '246000, Gomel, Billecki St. 6/12', '+375251417845', 'mali@gsu.by'),
    (5, 'Marya', 'Koshkina', '246000, Gomel, Katunin St. 86/33', '+375331488256', 'mama_koshka@gmail.com'),
    (6, 'Ihar', 'Golovachov', '246000, Gomel, Moiseenko St. 13/13', '+375294565685', 'ihar_golovachov@mail.ru'),
    (7, 'Oksana', 'Ivanova', '246000, Gomel, Golovatskogo St. 124/57', '+375291784565', 'oivanova@gsu.by'),
    (8,'Elena','Tarasova', '246000, Gomel, Matrosova St. 4/2', '+375297878521', 'elena-tarasova@gmail.com'),
    (9,'Taras','Kolinin', '246000, Gomel, Pinskaya St. 6/44', '+375297412169', 'tkolinin@gsu.by');
GO



--rollback DELETE FROM customer;