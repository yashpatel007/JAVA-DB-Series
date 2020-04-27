-- GET all records from todo
SELECT * FROM todo;

-- GET records by id
SELECT * FROM todo WHERE id = 1;

-- GET records by title
SELECT * FROM todo WHERE title = 'Hello world';

-- GET records by Status
SELECT * FROM todo WHERE status = 1;

-- ADD {POST} new record
INSERT INTO todo (title,description,status) VALUES ('Hola Hombre','Spanish for hello man!',1);

-- UPDATE {PUT} record
UPDATE todo SET title='Hola Mundo',description='Spanish for hello world',status=1 WHERE id=1;

-- DELETE record by id
DELETE FROM todo Where id=1;

-- DELETE record by status
DELETE FROM todo Where status=0;

