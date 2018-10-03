INSERT INTO PUBLIC.BOOK (NAME, PRINT_YEAR)
VALUES ('First book', 2010),
       ('Second book', 2011),
       ('Third book', 2012);

INSERT INTO PUBLIC.AUTHOR (FIRST_NAME, SECOND_NAME)
VALUES ('Pablo', 'Lambado'),
       ('Pazo', 'Zopa'),
       ('Lika', 'Vika');

INSERT INTO PUBLIC.HAS (BOOK_ID, AUTHOR_ID)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 2),
       (3, 1),
       (3, 2);
