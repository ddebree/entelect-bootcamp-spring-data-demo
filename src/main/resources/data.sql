DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS classroom;

CREATE TABLE classroom (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  grade int NOT NULL,
  teacher_name VARCHAR(250) NOT NULL
);

CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  age int NOT NULL,
  class_id int NOT NULL,
  FOREIGN KEY (class_id) REFERENCES classroom(id)
);

INSERT INTO classroom (id, grade, teacher_name) VALUES
(1, 1, 'Mr Spock'),
(2, 2, 'Miss Long Stockings'),
(3, 3, 'Colonel Saunders');

INSERT INTO student (first_name, age, class_id) VALUES
('Chuck Norris', 6, 1),
('Darth Vader', 7, 1),
('Arthur Dent', 8, 1),
('Hairy Plopper', 8, 2),
('Frodo Baggins', 8, 2),
('Matilda', 9, 3),
('Albie', 10, 3)

