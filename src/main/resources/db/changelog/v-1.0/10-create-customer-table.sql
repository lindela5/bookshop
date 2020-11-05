CREATE TABLE customer
(
    customer_id int         NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name  VARCHAR(100) NOT NULL,
    address VARCHAR(50),
    phone VARCHAR(15) ,
    email VARCHAR(50),
    PRIMARY KEY (customer_id)
);
GO