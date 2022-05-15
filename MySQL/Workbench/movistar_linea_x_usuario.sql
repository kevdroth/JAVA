-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: movistar
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `linea_x_usuario`
--

DROP TABLE IF EXISTS `linea_x_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `linea_x_usuario` (
  `id_linea_x_usuario` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int DEFAULT NULL,
  `id_linea` int DEFAULT NULL,
  `id_equipo` int DEFAULT NULL,
  `id_plan` int DEFAULT NULL,
  PRIMARY KEY (`id_linea_x_usuario`),
  KEY `id_linea_idx` (`id_linea`),
  KEY `id_usuario_idx` (`id_usuario`),
  KEY `id_plan_idx` (`id_plan`),
  KEY `id_equipo_idx` (`id_equipo`),
  CONSTRAINT `id_equipo` FOREIGN KEY (`id_equipo`) REFERENCES `equipos` (`id_equipo`),
  CONSTRAINT `id_linea` FOREIGN KEY (`id_linea`) REFERENCES `lineas` (`id_linea`),
  CONSTRAINT `id_plan` FOREIGN KEY (`id_plan`) REFERENCES `planes` (`id_plan`),
  CONSTRAINT `id_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linea_x_usuario`
--

LOCK TABLES `linea_x_usuario` WRITE;
/*!40000 ALTER TABLE `linea_x_usuario` DISABLE KEYS */;
INSERT INTO `linea_x_usuario` VALUES (1,1,1,1,3),(2,2,2,2,3),(3,3,3,3,4),(4,4,4,4,3),(5,5,5,5,2),(6,6,6,6,3),(7,7,7,7,3),(8,8,8,8,3),(9,9,9,9,3),(10,10,10,10,3),(11,11,11,11,4),(12,12,12,12,3),(13,13,13,13,1),(14,14,14,14,3),(15,15,15,15,3),(16,16,16,16,3);
/*!40000 ALTER TABLE `linea_x_usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-14 20:18:22
