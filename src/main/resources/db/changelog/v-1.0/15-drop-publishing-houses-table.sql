ALTER TABLE publishing_house
   DROP CONSTRAINT FK_books_publishing_house_id
GO

DROP TABLE IF EXISTS publishing_house CASCADE;
GO