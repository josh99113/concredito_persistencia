-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: ec2-18-191-234-33.us-east-2.compute.amazonaws.com    Database: escuela
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `calificaciones`
--

DROP TABLE IF EXISTS `calificaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calificaciones` (
  `idcalificacion` int NOT NULL AUTO_INCREMENT,
  `idcurso` int NOT NULL,
  `idestudiante` varchar(45) NOT NULL,
  `calificacion_parcial1` decimal(19,2) NOT NULL,
  `calificacion_parcial2` decimal(19,2) NOT NULL,
  `calificacion_parcial3` decimal(19,2) NOT NULL,
  `promedio` decimal(19,2) NOT NULL,
  PRIMARY KEY (`idcalificacion`),
  KEY `idcurso_idx` (`idcurso`),
  KEY `fk_idestudiante_idx` (`idestudiante`),
  CONSTRAINT `fk_idcurso` FOREIGN KEY (`idcurso`) REFERENCES `cursos` (`idcurso`),
  CONSTRAINT `fk_idestudiante` FOREIGN KEY (`idestudiante`) REFERENCES `estudiantes` (`idestudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calificaciones`
--

LOCK TABLES `calificaciones` WRITE;
/*!40000 ALTER TABLE `calificaciones` DISABLE KEYS */;
INSERT INTO `calificaciones` VALUES (1,1,'14130311',5.60,10.00,10.00,8.53),(2,1,'14130312',8.90,8.90,7.90,8.57),(3,1,'14130313',7.90,6.90,8.90,7.90),(4,1,'14130314',8.90,7.90,9.00,8.60),(5,1,'14130315',10.00,5.50,6.60,7.37),(6,2,'14130316',9.90,6.50,8.90,8.43),(7,2,'14130317',6.90,9.90,8.00,8.27),(8,2,'14130318',8.90,8.90,7.00,8.27),(9,2,'14130319',8.56,6.60,5.10,6.75),(10,2,'14130320',8.70,8.90,8.00,8.53),(11,2,'14130345',6.10,5.50,2.20,4.60),(12,2,'14130382',3.10,9.60,9.60,7.43),(13,3,'14130383',5.50,8.70,7.00,7.07),(14,3,'14130384',8.70,9.60,8.70,9.00),(15,3,'14130385',7.00,9.40,8.00,8.13),(16,3,'14130386',8.00,6.00,8.00,7.33),(17,3,'14130387',9.60,6.00,8.00,7.87),(18,3,'14130388',9.40,8.00,7.00,8.13),(19,3,'14130389',6.80,8.00,7.00,7.27),(20,1,'14130310',7.20,4.50,10.00,7.23),(21,1,'15988318',8.00,8.00,8.00,8.00),(22,1,'15998315',5.00,7.00,7.00,4.00),(23,1,'17130310',8.00,6.00,8.00,4.00),(24,1,'17130311',8.00,7.00,8.00,8.00),(25,1,'17130312',8.00,8.00,9.00,5.00),(26,1,'17130313',8.00,6.00,9.00,6.00),(27,2,'17130314',8.00,6.00,9.00,7.00),(28,2,'17138310',8.00,8.00,7.00,8.00),(29,2,'17138311',8.00,8.00,9.00,9.00),(30,2,'17190315',8.00,8.00,9.00,8.00),(31,2,'17194316',8.00,8.00,9.00,7.00),(32,3,'17194317',8.00,8.00,9.00,6.00),(33,3,'19188319',8.00,8.00,9.00,7.00),(34,3,'19194318',8.00,7.00,9.00,8.00),(35,3,'19194319',8.00,5.00,8.00,9.00),(36,3,'19194320',8.00,9.00,9.00,9.00),(37,3,'19194345',8.00,6.00,9.00,9.00);
/*!40000 ALTER TABLE `calificaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos` (
  `idcurso` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL,
  `idmaestro` int NOT NULL,
  PRIMARY KEY (`idcurso`),
  KEY `fk_idmaestro_idx` (`idmaestro`),
  CONSTRAINT `fk_idmaestro` FOREIGN KEY (`idmaestro`) REFERENCES `maestros` (`idmaestro`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` VALUES (1,'Introducción a Tecnologías del Desarrollo',1),(2,'Clases de Ingles Basico',2),(3,'Android: Fundamentos para crear apps',3);
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiantes`
--

DROP TABLE IF EXISTS `estudiantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiantes` (
  `idestudiante` varchar(10) NOT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `apellido_paterno` varchar(50) DEFAULT NULL,
  `apellido_materno` varchar(50) DEFAULT NULL,
  `fechaingreso` datetime DEFAULT NULL,
  PRIMARY KEY (`idestudiante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiantes`
--

LOCK TABLES `estudiantes` WRITE;
/*!40000 ALTER TABLE `estudiantes` DISABLE KEYS */;
INSERT INTO `estudiantes` VALUES ('14130310','Williams','Kelly','Scott','2021-03-04 04:25:48'),('14130311','Peterson','Turner','Foster','2021-03-04 04:25:48'),('14130312','Thomas','Bell','Cook','2021-03-04 04:25:48'),('14130313','Stewart','Miller','Ward','2021-03-04 04:25:48'),('14130314','Flores','Clark','Baker','2021-03-04 04:25:48'),('14130315','Lopez','Simmons','Long','2021-03-04 04:25:48'),('14130316','Ruby','Stewart','Gonzales','2021-03-04 04:25:48'),('14130317','Pamela','Campbell','Bennett','2021-03-04 04:25:48'),('14130318','Richard','Rogers','Thompson','2021-03-04 04:25:48'),('14130319','Barbara','Parker','Roberts','2021-03-04 04:25:48'),('14130320','Kathleen','Clark','King','2021-03-04 04:25:48'),('14130345','Manuelita','Herberto','Jordán','2021-03-04 04:25:48'),('14130382','Judith','Johnson','Peterson','2021-03-04 04:25:48'),('14130383','Ruth ','Kelly','Turner','2021-03-04 04:25:48'),('14130384','Diane ','Green','Young','2021-03-04 04:25:48'),('14130385','Linda ','Campbell','Long','2021-03-04 04:25:48'),('14130386','Joe','Robinson','White','2021-03-04 04:25:48'),('14130387','Rose','Roberts','Moore','2021-03-04 04:25:48'),('14130388','Elizabeth','Powell','Sanchez','2021-03-04 04:25:48'),('14130389','Bruce','Clark','Adams','2021-03-04 04:25:48'),('14264953','Edwardo','Antoine','Keaton','2021-03-04 04:25:48'),('14264954','Lou','Devlin','Wesley','2021-03-04 04:25:48'),('14264955','Madelyn','Cranford','Cady','2021-03-04 04:25:48'),('14264956','Jannet','Kasper','Song','2021-03-04 04:25:48'),('14264957','Mayra','Weir','Navarrete','2021-03-04 04:25:48'),('14264958','Paz','Kuntz','Merchant','2021-03-04 04:25:48'),('14264959','Addie','Baughman','Peltier','2021-03-04 04:25:48'),('14294952','Katlyn','Cloud','Lavender','2021-03-04 04:25:48'),('15938312','Lupe','Goforth','Nunley','2021-03-04 04:25:48'),('15938313','Moira','Jaeger','Hanes','2021-03-04 04:25:48'),('15938314','Tequila','Cooks','Foy','2021-03-04 04:25:48'),('15988316','Laurine','Sutherland','Asher','2021-03-04 04:25:48'),('15988317','Harold','Davenport','Houle','2021-03-04 04:25:48'),('15988318','Sidney','Stephenson','Mathews','2021-03-04 04:25:48'),('15998315','Elly','Harman','Morrissey','2021-03-04 04:25:48'),('17130310','Lawrence','Morgan','Phillips','2021-03-04 04:25:48'),('17130311','Johnny','Cooper','Reed','2021-03-04 04:25:48'),('17130312','Christine','Collins','Evans','2021-03-04 04:25:48'),('17130313','Annamaria','Edwards','Jones','2021-03-04 04:25:48'),('17130314','Gail','Lockhart','Woodruff','2021-03-04 04:25:48'),('17138310','Gigi','Barkley','Montalvo','2021-03-04 04:25:48'),('17138311','Melania','Marin','Sherrill','2021-03-04 04:25:48'),('17190315','Cherilyn','Mcdade','Schuster','2021-03-04 04:25:48'),('17194316','Willette','Poulin','Alarcon','2021-03-04 04:25:48'),('17194317','Vernie','Mccall','Murrell','2021-03-04 04:25:48'),('19188319','Freddie','Grossman','Lawless','2021-03-04 04:25:48'),('19194318','Maia','Wooten','Tribble','2021-03-04 04:25:48'),('19194319','Keenan','Moon','Kearns','2021-03-04 04:25:48'),('19194320','Providencia','Linville','Seifert','2021-03-04 04:25:48'),('19194345','Reatha','Spellman','Thrash','2021-03-04 04:25:48');
/*!40000 ALTER TABLE `estudiantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maestros`
--

DROP TABLE IF EXISTS `maestros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maestros` (
  `idmaestro` int NOT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idmaestro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maestros`
--

LOCK TABLES `maestros` WRITE;
/*!40000 ALTER TABLE `maestros` DISABLE KEYS */;
INSERT INTO `maestros` VALUES (1,'Juan Lopez Verdugo'),(2,'Margarita Savala'),(3,'Emma Lizbeth Rodriguez');
/*!40000 ALTER TABLE `maestros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'escuela'
--

--
-- Dumping routines for database 'escuela'
--
/*!50003 DROP PROCEDURE IF EXISTS `PRO_GET_ALL_CALIFICACIONES` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`chacho`@`%` PROCEDURE `PRO_GET_ALL_CALIFICACIONES`(
	IN idcurso INT
)
BEGIN
	SELECT * FROM calificaciones
    WHERE calificaciones.idcurso = (CASE WHEN idcurso is null THEN calificaciones.idcurso ELSE idcurso END)
    ORDER BY promedio DESC limit 10;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `PRO_GET_ALL_CURSOS` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`chacho`@`%` PROCEDURE `PRO_GET_ALL_CURSOS`()
BEGIN
	SELECT * FROM cursos;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-04  3:13:24
