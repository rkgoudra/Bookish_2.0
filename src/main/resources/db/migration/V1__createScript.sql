CREATE TABLE login (
  user_id int NOT NULL,
  email varchar(255) DEFAULT NULL,
  first_name varchar(255) DEFAULT NULL,
  last_name varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  phone_number int DEFAULT NULL,
  PRIMARY KEY (user_id)
);

CREATE TABLE gener (
  gener_id int NOT NULL,
  gener_name varchar(255) DEFAULT NULL,
  gener_status int DEFAULT NULL,
  PRIMARY KEY (gener_id)
);

CREATE TABLE books (
  book_id int NOT NULL,
  book_name varchar(250) DEFAULT NULL,
  book_author varchar(250) DEFAULT NULL,
  expected_return_date datetime(6) DEFAULT NULL,
  receiver_name varchar(255) DEFAULT NULL,
  delet_status int DEFAULT NULL,
  description varchar(255) DEFAULT NULL,
  gener_id int DEFAULT NULL,
  isbn int DEFAULT NULL,
  language varchar(255) DEFAULT NULL,
  status int DEFAULT NULL,
  user_id int DEFAULT NULL,
  PRIMARY KEY (book_id),
  FOREIGN KEY (user_id) REFERENCES login(user_id),
  FOREIGN KEY (gener_id) REFERENCES gener(gener_id)
);

CREATE TABLE borrowedbooks (
  borrowed_books_id int NOT NULL,
  book_id int DEFAULT NULL,
  book_return_status varchar(255) DEFAULT NULL,
  borrow_from varchar(255) DEFAULT NULL,
  date datetime(6) DEFAULT NULL,
  due_date datetime(6) DEFAULT NULL,
  phone_no int DEFAULT NULL,
  user_id int DEFAULT NULL,
  PRIMARY KEY (borrowed_books_id),
  FOREIGN KEY (book_id) REFERENCES books(book_id),
  FOREIGN KEY (user_id) REFERENCES login(user_id)
);

CREATE TABLE lentbook (
  lentbook_id int NOT NULL,
  book_return_status varchar(255) DEFAULT NULL,
  date datetime(6) DEFAULT NULL,
  due_date datetime(6) DEFAULT NULL,
  lent_to varchar(255) DEFAULT NULL,
  phone_no int DEFAULT NULL,
  user_id int DEFAULT NULL,
  book_id int DEFAULT NULL,
  PRIMARY KEY (lentbook_id),
  FOREIGN KEY (book_id) REFERENCES books(book_id),
  FOREIGN KEY (user_id) REFERENCES login(user_id)
);
