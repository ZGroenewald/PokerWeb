CREATE TABLE poker_game(
    id INTEGER NOT NULL AUTO_INCREMENT,
    game_id INTEGER NOT NULL,
    player_name VARCHAR(12),
    host_name VARCHAR(12),
    primary key (id)
)

CREATE TABLE poker_playerHand(
    id INTEGER NOT NULL AUTO_INCREMENT,
    foreign key (player) REFERENCES poker_game(player_name),
    primary key (id)
)

CREATE TABLE poker_card(

);
