CREATE TABLE Servant (
	`id` LONG AUTO_INCREMENT PRIMARY KEY,
	`name` VARCHAR(255) UNIQUE NOT NULL,
	`class` VARCHAR(50) NOT NULL,
	rarity VARCHAR(10) NOT NULL,
	myth VARCHAR(255)
);