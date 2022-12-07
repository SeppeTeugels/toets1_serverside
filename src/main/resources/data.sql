insert into BOOK (TITLE) values ('Oryx and Crake'); /*1*/
insert into BOOK (TITLE) values ('The year of the flood');/*2*/
insert into BOOK (TITLE) values ('MaddAddam');/*3*/
insert into BOOK (TITLE) values ('1Q84');/*4*/
insert into BOOK (TITLE) values ('De opwindvogelkronieken');/*5*/
insert into BOOK (TITLE) values ('Design Patterns');/*6*/

insert into AUTHOR (NAME) values ('Margaret Atwood'); /*1*/
insert into AUTHOR (NAME) values ('Haruki Murakami'); /*2*/
insert into AUTHOR (NAME) values ('Erich Gamma'); /*3*/
insert into AUTHOR (NAME) values ('Richard Helm'); /*4*/
insert into AUTHOR (NAME) values ('Ralph Johnson'); /*5*/
insert into AUTHOR (NAME) values ('John Vlissides'); /*6*/

insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (1, 1);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (2, 1);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (3, 1);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (4, 2);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (5, 2);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (6, 3);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (6, 4);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (6, 5);
insert into BOOK_AUTHORS (BOOKS_ID, AUTHORS_ID) values (6, 6);

insert into GENRE(NAME)values ('fantasy');
insert into GENRE(NAME)values ('non-fiction');
insert into GENRE(NAME)values ('programming');

INSERT INTO BOOKSUSER (USERNAME, PASSWORD, ROLE)
VALUES ('admin', '$2a$10$9MIX8kYPkuB7uE/H5nHF8.KG6.YdjBA/voOnjSZnZDxLXL/2BIerS', 'ADMIN'); -- admin

INSERT INTO BOOKSUSER (USERNAME, PASSWORD, ROLE)
VALUES ('marie', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'USER'); -- password

INSERT INTO BOOKSUSER (USERNAME, PASSWORD, ROLE)
VALUES ('vera', '$2y$12$KF3spKP4kgf59.6zYkmjyeYaW2.4ZxV16Grpw1FPsFnzYq68kswJ6', 'USER'); -- vera

INSERT INTO AWARD (title,info,country) values ('tesing title', 'testinginfo', 'Belgium');
INSERT INTO AWARD (title,info,country) values ('The Paris Literary Prize', 'The Paris Literary Prize was a biennial literary prize for unpublished novellas by new authors from anywhere in the world.', 'France');
INSERT INTO AWARD (title,info,country) values ('Ovid Prize', 'The Ovid Prize, established in 2002, is a literary prize awarded annually to an author from any country, in recognition of a body of work.', 'Romania');
INSERT INTO AWARD (title,info,country) values ('Common Wealth Award of Distinguished Service', 'The Common Wealth Awards of Distinguished Service (or Common Wealth Awards) were created under the will of the late Ralph Hayes, an influential American business executive and philanthropist. ', 'United States');

insert into BOOK_AWARDS (BOOKS_ID, AWARDS_ID) values (1, 1);
insert into BOOK_AWARDS (BOOKS_ID, AWARDS_ID) values (1, 2);
insert into BOOK_AWARDS (BOOKS_ID, AWARDS_ID) values (2, 3);
insert into BOOK_AWARDS (BOOKS_ID, AWARDS_ID) values (3, 4);


