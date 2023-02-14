-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: sql.freedb.tech    Database: freedb_Registracija
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Registracija`
--

DROP TABLE IF EXISTS `Registracija`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Registracija` (
  `id` int NOT NULL AUTO_INCREMENT,
  `datum` date NOT NULL,
  `vozilo` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `vozilo_idx` (`vozilo`),
  CONSTRAINT `vozilo` FOREIGN KEY (`vozilo`) REFERENCES `Vozila` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Registracija`
--

LOCK TABLES `Registracija` WRITE;
/*!40000 ALTER TABLE `Registracija` DISABLE KEYS */;
INSERT INTO `Registracija` VALUES (1,'2020-01-20',1),(2,'2021-01-20',3),(3,'2022-01-20',4),(4,'2023-01-20',2),(5,'2024-01-20',5),(6,'2023-02-12',11),(9,'2023-02-13',15);
/*!40000 ALTER TABLE `Registracija` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vozaci`
--

DROP TABLE IF EXISTS `Vozaci`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Vozaci` (
  `id` int NOT NULL AUTO_INCREMENT,
  `vozacIme` varchar(15) NOT NULL,
  `vozacPrezime` varchar(25) NOT NULL,
  `adresa` varchar(30) NOT NULL,
  `vozacUser` varchar(45) NOT NULL,
  `vozacSifra` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vozaci`
--

LOCK TABLES `Vozaci` WRITE;
/*!40000 ALTER TABLE `Vozaci` DISABLE KEYS */;
INSERT INTO `Vozaci` VALUES (1,'Ali','Boudellaa','Butilska24','ali12345','ali12345'),(2,'Kenan','Dizdarevic','Butilska47','kenan123','kenan123'),(3,'Nedim','Hosic','Butilska48','nedim123','nedim123');
/*!40000 ALTER TABLE `Vozaci` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vozila`
--

DROP TABLE IF EXISTS `Vozila`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Vozila` (
  `id` int NOT NULL AUTO_INCREMENT,
  `imeVozila` varchar(45) NOT NULL,
  `cijenaVozila` int NOT NULL,
  `bojaVozila` varchar(45) NOT NULL,
  `vozac` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `vozac_idx` (`vozac`),
  CONSTRAINT `vozac` FOREIGN KEY (`vozac`) REFERENCES `Vozaci` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vozila`
--

LOCK TABLES `Vozila` WRITE;
/*!40000 ALTER TABLE `Vozila` DISABLE KEYS */;
INSERT INTO `Vozila` VALUES (1,'test',22000,'CRVENA',1),(2,'PASSAT',27000,'CRNA',1),(3,'RENAULT',25000,'PLAVA',3),(4,'SHARAN',20000,'CRNA',2),(5,'BMW',30000,'CRVENA',2),(11,'MERCEDES',35000,'SIVA',1),(15,'SKLASA',85000,'SIVA',3);
/*!40000 ALTER TABLE `Vozila` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-14 21:41:49
