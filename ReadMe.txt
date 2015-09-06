1) To start the application required Intellij Idea with customized Tomkat on the start screen http://localhost:8080/Blog
HTTP Port 8080
JMX port 1099

2) MySQL is a database attached using the Connector J

3) Requests are processed within the program
The scripts create the database :

CREATE DATABASE `hodor` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `articles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fdata` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` varchar(45) NOT NULL,
  `text` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `comments` (
  `id_c` int(11) NOT NULL,
  `num` int(11) NOT NULL AUTO_INCREMENT,
  `comm` varchar(4000) NOT NULL,
  PRIMARY KEY (`num`),
  UNIQUE KEY `num_UNIQUE` (`num`),
  KEY `id_idx` (`id_c`),
  CONSTRAINT `id` FOREIGN KEY (`id_c`) REFERENCES `articles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;