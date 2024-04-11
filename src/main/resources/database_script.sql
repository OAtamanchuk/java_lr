CREATE DATABASE IF NOT EXISTS UniversityDatabase;

USE UniversityDatabase;

CREATE TABLE IF NOT EXISTS students
(
    id              INT PRIMARY KEY,
    name            VARCHAR(255)        NOT NULL,
    surname         VARCHAR(255)        NOT NULL,
    patronymic      VARCHAR(255)        NOT NULL,
    sex             DATE                NOT NULL
);

INSERT INTO students (id, name, surname, patronymic, sex)
VALUES (960163, 'Evans', 'Emery', 'Strong', 1),
       (850686, 'Atamanchuk', 'Oleksandra', 'Smart', 2),
       (743512, 'Smith', 'Ava', 'Clever', 2),
       (519304, 'Johnson', 'Liam', 'Brave', 1),
       (261807, 'Williams', 'Olivia', 'Wise', 2),
       (871942, 'Brown', 'Noah', 'Cool', 1),
       (629041, 'Jones', 'Emma', 'Bright', 2),
       (453278, 'Garcia', 'Ethan', 'Happy', 1),
       (372649, 'Davis', 'Sophia', 'Kind', 2),
       (707925, 'Rodriguez', 'Mason', 'Sunny', 1),
       (885734, 'Martinez', 'Isabella', 'Cheerful', 2),
       (135860, 'Hernandez', 'Jacob', 'Calm', 1),
       (673429, 'Lopez', 'Ava', 'Jolly', 2),
       (574638, 'Gonzalez', 'Michael', 'Calm', 1),
       (217896, 'Wilson', 'Emily', 'Gentle', 2),
       (491753, 'Anderson', 'William', 'Merry', 1)

;