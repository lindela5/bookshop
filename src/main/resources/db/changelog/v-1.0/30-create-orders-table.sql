CREATE TABLE orders (
    order_id         int NOT NULL,
    customer_id   int NOT NULL,
    order_date date ,
    amount    DECIMAL NOT NULL,
    PRIMARY KEY (order_id)
);
GO


ALTER TABLE orders
    ADD CONSTRAINT FK_orders_customer_id
        FOREIGN KEY (customer_id) REFERENCES customer(customer_id);
GO
