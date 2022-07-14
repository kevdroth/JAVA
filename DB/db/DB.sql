-- MariaDB dump 10.19  Distrib 10.7.4-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: movistar
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detalle_factura`
--

DROP TABLE IF EXISTS `detalle_factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_factura` (
  `id_detalle_factura` int NOT NULL AUTO_INCREMENT,
  `id_linea` int DEFAULT NULL,
  `id_factura` int NOT NULL,
  `minutos` double DEFAULT NULL,
  `adicional_mensaje` double DEFAULT NULL,
  `adicional_extra` double DEFAULT NULL,
  `roaming` double DEFAULT NULL,
  `seguro` double DEFAULT NULL,
  `iva` double DEFAULT NULL,
  `impuesto_interno` double DEFAULT NULL,
  `iibb_caba` double DEFAULT NULL,
  `iibb_gba` double DEFAULT NULL,
  `percepcion_iva` double DEFAULT NULL,
  `redondeo` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`id_detalle_factura`),
  UNIQUE KEY `uc_detalle_factura` (`id_linea`,`id_factura`),
  KEY `fk_id_factura` (`id_factura`),
  CONSTRAINT `fk_id_factura` FOREIGN KEY (`id_factura`) REFERENCES `factura` (`id_factura`),
  CONSTRAINT `fk_id_linea` FOREIGN KEY (`id_detalle_factura`) REFERENCES `linea` (`id_linea`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_factura`
--

LOCK TABLES `detalle_factura` WRITE;
/*!40000 ALTER TABLE `detalle_factura` DISABLE KEYS */;
INSERT INTO `detalle_factura` VALUES
(1,1,1,1529,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(2,2,1,395,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(3,3,1,0,NULL,NULL,NULL,NULL,NULL,NULL,12.19,NULL,NULL,NULL,1033.26),
(4,4,1,842,NULL,192.06,NULL,NULL,NULL,NULL,18.27,NULL,NULL,NULL,1548.63),
(5,5,1,131,NULL,NULL,NULL,NULL,NULL,NULL,53.36,NULL,NULL,NULL,4523.53),
(6,6,1,13,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(7,7,1,812,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(8,8,1,225,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(9,9,1,161,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(10,10,1,0,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(11,11,1,0,NULL,NULL,NULL,NULL,NULL,NULL,12.19,NULL,NULL,NULL,1033.26),
(12,12,1,71,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(13,13,1,27,NULL,NULL,NULL,NULL,NULL,NULL,45.98,NULL,NULL,NULL,3897.48),
(14,14,1,0,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(15,15,1,4,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58),
(16,16,1,210,NULL,NULL,NULL,NULL,NULL,NULL,15.24,NULL,NULL,NULL,1291.58);
/*!40000 ALTER TABLE `detalle_factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleado` (
  `id_empleado` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES
(1,'RIVERO ALICIA'),
(2,'RIOS MARIA TERESA'),
(3,'EX SCIOSCIA NATALIN'),
(4,'GIRARD GABRIEL'),
(5,'GOYENA JAVIER'),
(6,'GISELLE GABRIELE'),
(7,'CONTRERAS MARCELA'),
(8,'ARIAS MARCELA'),
(9,'KARINA'),
(10,'MKT VANESA'),
(11,'MAP'),
(12,'EX ROLON ROCIO'),
(13,'PERELLI CINTHIA');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipo` (
  `id_equipo` int NOT NULL AUTO_INCREMENT,
  `registrado` varchar(45) DEFAULT NULL,
  `imei_registrado` varchar(45) DEFAULT NULL,
  `marca_trafica` varchar(45) DEFAULT NULL,
  `modelo_trafica` varchar(45) DEFAULT NULL,
  `imei_trafica` varchar(45) DEFAULT NULL,
  `sim` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_equipo`),
  UNIQUE KEY `uc_imei_registrado` (`imei_registrado`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
INSERT INTO `equipo` VALUES
(1,'Samsung Galaxy J1 Ace 4g Lte Blanco','356438086518265','Samsung','Galaxy A02s','358008303736376','8954078144700707212'),
(2,'Samsung Galaxy A02s 4g Azul','358008303736376','Samsung','Samsung SM-J111M','358678077268226','8954079144222024889'),
(3,'Lg K8 2017 4g Lte Indigo','354651080708821','Motorola','Moto G (3rd Gen), CA12459545','358991062031032','8954073144402237984'),
(4,'Samsung Galaxy A02s 4g Azul','358008303662200','Samsung','Samsung Galaxy A02s 4g Azul','358008303662200','8954076144485786599'),
(5,'Motorola Moto G8 4g Azul','353576111350528','Motorola','Motorola Moto G8 4g Azul','353576111350528','8954075144220503300'),
(6,'Samsung J2 Prime 16gb 4g Dorado Metalico','359978090210141','Samsung','Samsung SM-J111M','358678078321347','8954078144135730524'),
(7,'Samsung J2 Prime 16gb 4g Negro','352940099168776','Samsung','Samsung J2 Prime 16gb 4g Negro','352940099168776','8954073144276631791'),
(8,'Samsung Galaxy A03s Azul','355924409131531','Samsung','Samsung Galaxy A03s Azul','355924409131531','8954073144346230459'),
(9,'Samsung Galaxy A10s 4g Negro','357079109951890','Motorola','Guam20','357809931656113','8954071144515308609'),
(10,'Samsung Galaxy J3 2016 4g Lte Negro','359931074644983','Samsung','Samsung Galaxy J3 2016 4g Lte Negro','359931074644983','8954073144179584709'),
(11,'Nokia 302 Blanco -2gb','354146050000440','Samsung','Samsung SM-G532M','359978090210141','8954073144278150568'),
(12,'Motorola Motokey Social-2gb','359492040677797','Blackview','BLACKVIEW, BV8000 Pro','359705081172620','8954075144196964882'),
(13,'Samsung Galaxy A50 4g Blanco','357647100195087','Samsung','Samsung Galaxy A50 4g Blanco','357647100195087','8954071144023026131'),
(14,'Samsung Galaxy J5 Prime 4g Lte Negro','354621085918030','Samsung','Samsung Galaxy J2 Prime','352940097699871','8954073144278165764'),
(15,'Samsung Galaxy A02 64gb 4g Negro','353256482133569','Samsung','Samsung Galaxy A02 64gb 4g Negro','353256482133569','8954076144537970365'),
(16,'Samsung Galaxy J7 Neo 4g Negro','352825094524075','Samsung','Samsung Galaxy J7 Neo 4g Negro','352825094524075','8954078100331562673');
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `id_factura` int NOT NULL AUTO_INCREMENT,
  `fecha_vencimiento` date NOT NULL,
  `monto_total` double NOT NULL,
  `punto_venta` varchar(20) NOT NULL,
  `numero_factura` int NOT NULL,
  PRIMARY KEY (`id_factura`),
  UNIQUE KEY `uc_factura` (`numero_factura`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES
(1,'2022-05-16',26243.5,'2470',637018);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `linea`
--

DROP TABLE IF EXISTS `linea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `linea` (
  `id_linea` int NOT NULL AUTO_INCREMENT,
  `id_plan` int NOT NULL,
  `numero` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_linea`),
  KEY `fk_id_plan` (`id_plan`),
  CONSTRAINT `fk_id_plan` FOREIGN KEY (`id_plan`) REFERENCES `plan` (`id_plan`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linea`
--

LOCK TABLES `linea` WRITE;
/*!40000 ALTER TABLE `linea` DISABLE KEYS */;
INSERT INTO `linea` VALUES
(1,3,'1151615361'),
(2,3,'1151653819'),
(3,4,'1151655430'),
(4,3,'1151657653'),
(5,2,'1153276861'),
(6,3,'1140472441'),
(7,3,'1150472566'),
(8,3,'1140472674'),
(9,3,'1150876318'),
(10,3,'1540428233'),
(11,4,'1540428253'),
(12,3,'1540428338'),
(13,1,'1540428445'),
(14,3,'1540428572'),
(15,3,'1540428586'),
(16,3,'1541708803');
/*!40000 ALTER TABLE `linea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `linea_x_empleado`
--

DROP TABLE IF EXISTS `linea_x_empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `linea_x_empleado` (
  `id_linea_x_empleado` int NOT NULL AUTO_INCREMENT,
  `id_empleado` int DEFAULT NULL,
  `id_linea` int DEFAULT NULL,
  `id_equipo` int DEFAULT NULL,
  `id_plan` int DEFAULT NULL,
  PRIMARY KEY (`id_linea_x_empleado`),
  KEY `id_linea_idx` (`id_linea`),
  KEY `id_usuario_idx` (`id_empleado`),
  KEY `id_plan_idx` (`id_plan`),
  KEY `id_equipo_idx` (`id_equipo`),
  CONSTRAINT `id_equipo` FOREIGN KEY (`id_equipo`) REFERENCES `equipo` (`id_equipo`),
  CONSTRAINT `id_linea` FOREIGN KEY (`id_linea`) REFERENCES `linea` (`id_linea`),
  CONSTRAINT `id_plan` FOREIGN KEY (`id_plan`) REFERENCES `plan` (`id_plan`),
  CONSTRAINT `id_usuario` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linea_x_empleado`
--

LOCK TABLES `linea_x_empleado` WRITE;
/*!40000 ALTER TABLE `linea_x_empleado` DISABLE KEYS */;
INSERT INTO `linea_x_empleado` VALUES
(1,1,1,1,3),
(2,2,2,NULL,3),
(3,3,3,NULL,4),
(4,4,4,4,3),
(5,5,5,5,2),
(6,6,6,NULL,3),
(7,7,7,7,3),
(8,8,8,8,3),
(9,9,9,NULL,3),
(10,10,10,10,3),
(11,8,11,6,4),
(12,11,12,NULL,3),
(13,11,13,13,1),
(14,8,14,NULL,3),
(15,12,15,15,3),
(16,13,16,16,3);
/*!40000 ALTER TABLE `linea_x_empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plan`
--

DROP TABLE IF EXISTS `plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plan` (
  `id_plan` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `internet` varchar(45) DEFAULT NULL,
  `minutos` varchar(45) DEFAULT NULL,
  `sms` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_plan`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plan`
--

LOCK TABLES `plan` WRITE;
/*!40000 ALTER TABLE `plan` DISABLE KEYS */;
INSERT INTO `plan` VALUES
(1,'COMUNIDAD 12GB',2912,'12GB','10000','5000'),
(2,'COMUNIDAD 30GB',3379.75,'30GB','10000','5000'),
(3,'COMUNIDAD 5GB',965,'5GB','10000','5000'),
(4,'COMUNIDAD 5GB II',772,'5GB','10000','5000');
/*!40000 ALTER TABLE `plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rol` (
  `id_rol` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES
(1,'ROLE_ADMIN'),
(2,'ROLE_USER');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `username` varchar(25) NOT NULL,
  `password` varchar(50) NOT NULL,
  `id_rol` int DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `usuario_fk` (`id_rol`),
  CONSTRAINT `usuario_fk` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id_rol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES
(1,'kevin','123',2),
(2,'admin','123',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-14 19:10:24
