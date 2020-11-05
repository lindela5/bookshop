ALTER TABLE book_order
   DROP CONSTRAINT FK_book_order_order_id
GO

ALTER TABLE book_order
   DROP CONSTRAINT FK_book_order_book_id
GO

DROP TABLE IF EXISTS book_order CASCADE;
GO