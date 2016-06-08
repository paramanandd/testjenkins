-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.34


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema mydatabase
--

CREATE DATABASE IF NOT EXISTS mydatabase;
USE mydatabase;

--
-- Definition of table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bookname` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `price` int(10) unsigned NOT NULL,
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` (`bookid`,`bookname`,`author`,`price`) VALUES 
 (1,'c','kanetkar',1221),
 (3,'os','grig',234);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;


--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(45) DEFAULT 'user',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`username`,`password`,`role`) VALUES 
 ('parma','123','admin'),
 ('rahul','123','user'),
 ('rohit','123','user');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Definition of table `review`
--

DROP TABLE IF EXISTS `review`;
CREATE TABLE `review` (
  `reviewid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `comment` varchar(45) DEFAULT NULL,
  `bookname` varchar(45) NOT NULL,
  `user` varchar(45) NOT NULL,
  PRIMARY KEY (`reviewid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `review`
--

/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` (`reviewid`,`comment`,`bookname`,`user`) VALUES 
 (1,'very good book','c','rahul'),
 (2,'good','c','rohit'),
 (3,'','c','rohit');
/*!40000 ALTER TABLE `review` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
