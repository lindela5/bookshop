ALTER TABLE books
   DROP CONSTRAINT FK_books_sections_id
GO

ALTER TABLE books
   DROP CONSTRAINT FK_books_publishing_house_id
GO

DROP TABLE IF EXISTS books CASCADE;
GO