CREATE TABLE poker_user (
    name VARCHAR(12) NOT NULL,
    password VARCHAR(255) NOT NULL,
    salt VARCHAR(255) NOT NULL,
    primary key (name)
)

CREATE TABLE poker_hand (
    hand ARRAY(5),
    eval VARCHAR(20),
    primary key (hand),
    foreign key (name) REFERENCES poker_user(name)
);

