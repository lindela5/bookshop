ALTER TABLE orders
   DROP CONSTRAINT FK_orders_customer_id
GO


DROP TABLE IF EXISTS orders CASCADE;
GO