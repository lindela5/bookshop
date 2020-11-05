ALTER TABLE book_supply
   DROP CONSTRAINT FK_book_supply_supply_id
GO

ALTER TABLE book_supply
   DROP CONSTRAINT FK_book_supply_book_id
GO

DROP TABLE IF EXISTS book_supply CASCADE;
GO