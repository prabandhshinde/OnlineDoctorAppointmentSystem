-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: wecare
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booked_slots`
--

DROP TABLE IF EXISTS `booked_slots`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booked_slots` (
  `booked_slot_id` bigint NOT NULL AUTO_INCREMENT,
  `booked_slot_date` date DEFAULT NULL,
  `booked_slot_interval` time DEFAULT NULL,
  `booked_slot_time` time DEFAULT NULL,
  `resp_doctor_id` bigint NOT NULL,
  `resp_patient_id` bigint NOT NULL,
  PRIMARY KEY (`booked_slot_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booked_slots`
--

LOCK TABLES `booked_slots` WRITE;
/*!40000 ALTER TABLE `booked_slots` DISABLE KEYS */;
/*!40000 ALTER TABLE `booked_slots` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clinic_info`
--

DROP TABLE IF EXISTS `clinic_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clinic_info` (
  `clinic_id` int NOT NULL,
  `builing_details` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `clinic_name` varchar(255) DEFAULT NULL,
  `contact_no` bigint DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `landmark` varchar(255) DEFAULT NULL,
  `pin_code` int DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`clinic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clinic_info`
--

LOCK TABLES `clinic_info` WRITE;
/*!40000 ALTER TABLE `clinic_info` DISABLE KEYS */;
INSERT INTO `clinic_info` VALUES (8,'Shri Apartment','losangeles','Shinde Clinic',2500000,'pune','Ganpati Mandir',0,'mh',''),(10,'Sanjivani Plaza','Chalisgaon','Atharva Clinic',25552200155,'Jalgaon','Jd',424101,'Maharashatra','Bhadgaon Road'),(12,'Shri Apartment','Panvel','Alhat Clinic',2550011445,'New Mumbai','Ganpati Mandir',421140,'Maharashtra','Dole Marg'),(14,'Shri Apartment','Chopra','More Clinic',2500155,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(16,'Shri Apartment','','Shri Clinic',52525,'Jalgaon','Ganpati Mandir',0,'','Main Road'),(18,'Shri Apartment','','Shri Clinic',45324534,'Jalgaon','Ganpati Mandir',0,'','Main Road'),(20,'sad','asdasd','asdsad',2255001,'asdd','asd',443333,'asd',''),(24,'sdfds','','fsdf',2501010,'sdfsd','dsfsd',0,'Maharashtra','sdfsd'),(26,'Shri Apartment','','Shinde Clinic',2525252,'Jalgaon','Ganpati Mandir',0,'','KOLIWADA GHATROAD'),(28,'Shri Apartment','','Shinde Clinic',2525252,'Jalgaon','Ganpati Mandir',0,'','KOLIWADA GHATROAD'),(30,'Shri Apartment','','Shinde Clinic',2525252,'Jalgaon','Ganpati Mandir',0,'','KOLIWADA GHATROAD'),(32,'Shri Apartment','sdsd','Shri Clinic',250000,'sadsd','xcvxc',4241100,'sadsa','sad'),(34,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(36,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(38,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(40,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(42,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(44,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(46,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(48,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(50,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(52,'Shri Apartment','Nanded','Shinde Clinic',25000251,'Jalgaon','Ganpati Mandir',0,'Maharashtra','Main Road'),(54,'Shri Apartment','csn','Shri Clinic',225500255,'Jal','Ganpati Mandir',424101,'Mah','dfsdf'),(56,'Shri Apartment','Los Angeles','Shinde Clinic',25101010,'Jalgaon','Ganpati Mandir',413721,'Maharashtra','Main Road'),(58,'Shri Apartment','dsfds','Shinde Clinic',2500255544,'dsfds','Ganpati Mandir',424101,'dsfsd','dfs');
/*!40000 ALTER TABLE `clinic_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `created_sub_slot_saver`
--

DROP TABLE IF EXISTS `created_sub_slot_saver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `created_sub_slot_saver` (
  `created_slot_id` bigint NOT NULL AUTO_INCREMENT,
  `is_booked` bit(1) NOT NULL,
  `ref_doctor_id` bigint NOT NULL,
  `ref_patient_id` bigint NOT NULL,
  `slot_date` date DEFAULT NULL,
  `slot_end_time` time DEFAULT NULL,
  `slot_start_time` time DEFAULT NULL,
  `dr_scheduled_slot_id` bigint DEFAULT NULL,
  PRIMARY KEY (`created_slot_id`),
  KEY `FKkxmu2tvvhb0khpqtt6apo1wiv` (`dr_scheduled_slot_id`),
  CONSTRAINT `FKkxmu2tvvhb0khpqtt6apo1wiv` FOREIGN KEY (`dr_scheduled_slot_id`) REFERENCES `doctor_scheduled_slots` (`slot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `created_sub_slot_saver`
--

LOCK TABLES `created_sub_slot_saver` WRITE;
/*!40000 ALTER TABLE `created_sub_slot_saver` DISABLE KEYS */;
INSERT INTO `created_sub_slot_saver` VALUES (1,_binary '\0',11,0,'2022-09-21','11:20:00','11:00:00',NULL),(3,_binary '\0',11,0,'2022-09-21','12:20:00','12:00:00',NULL),(5,_binary '\0',11,0,'2022-09-21','13:20:00','13:00:00',NULL),(7,_binary '\0',11,0,'2022-09-21','14:20:00','14:00:00',NULL),(8,_binary '\0',11,0,'2022-09-21','14:50:00','14:30:00',NULL),(10,_binary '\0',13,0,'2022-09-21','16:05:00','16:00:00',NULL),(11,_binary '\0',13,0,'2022-09-21','16:12:00','16:07:00',NULL),(12,_binary '\0',13,0,'2022-09-21','16:19:00','16:14:00',NULL),(13,_binary '\0',13,0,'2022-09-21','16:26:00','16:21:00',NULL),(14,_binary '\0',13,0,'2022-09-21','16:33:00','16:28:00',NULL),(15,_binary '\0',13,0,'2022-09-21','16:40:00','16:35:00',NULL),(16,_binary '\0',13,0,'2022-09-21','16:47:00','16:42:00',NULL),(17,_binary '\0',13,0,'2022-09-21','16:54:00','16:49:00',NULL),(18,_binary '\0',13,0,'2022-09-21','17:01:00','16:56:00',NULL),(19,_binary '\0',13,0,'2022-09-21','17:08:00','17:03:00',NULL),(21,_binary '\0',13,0,'2022-09-21','17:22:00','17:17:00',NULL),(22,_binary '\0',13,0,'2022-09-21','17:29:00','17:24:00',NULL),(23,_binary '\0',13,0,'2022-09-21','17:36:00','17:31:00',NULL),(24,_binary '\0',13,0,'2022-09-21','17:43:00','17:38:00',NULL),(25,_binary '\0',13,0,'2022-09-21','17:50:00','17:45:00',NULL),(26,_binary '\0',13,0,'2022-09-21','17:57:00','17:52:00',NULL),(27,_binary '\0',13,0,'2022-09-21','18:04:00','17:59:00',NULL),(28,_binary '\0',13,0,'2022-09-21','18:11:00','18:06:00',NULL),(29,_binary '\0',13,0,'2022-09-21','18:18:00','18:13:00',NULL),(31,_binary '\0',13,0,'2022-09-21','18:32:00','18:27:00',NULL),(32,_binary '\0',13,0,'2022-09-21','18:39:00','18:34:00',NULL),(34,_binary '\0',13,0,'2022-09-21','18:53:00','18:48:00',NULL),(35,_binary '\0',13,0,'2022-09-21','19:00:00','18:55:00',NULL),(36,_binary '\0',13,0,'2022-09-21','19:07:00','19:02:00',NULL),(37,_binary '\0',13,0,'2022-09-21','19:14:00','19:09:00',NULL),(39,_binary '\0',13,0,'2022-09-21','19:28:00','19:23:00',NULL),(40,_binary '\0',13,0,'2022-09-21','19:35:00','19:30:00',NULL),(41,_binary '\0',13,0,'2022-09-21','19:42:00','19:37:00',NULL),(42,_binary '\0',13,0,'2022-09-21','19:49:00','19:44:00',NULL),(43,_binary '\0',13,0,'2022-09-21','19:56:00','19:51:00',NULL),(44,_binary '\0',13,0,'2022-09-21','20:03:00','19:58:00',NULL),(45,_binary '\0',13,0,'2022-09-21','20:10:00','20:05:00',NULL),(46,_binary '\0',13,0,'2022-09-21','20:17:00','20:12:00',NULL),(47,_binary '\0',13,0,'2022-09-21','20:24:00','20:19:00',NULL),(48,_binary '\0',13,0,'2022-09-22','11:45:00','11:30:00',NULL),(49,_binary '\0',13,0,'2022-09-22','12:05:00','11:50:00',NULL),(51,_binary '\0',13,0,'2022-09-22','12:45:00','12:30:00',NULL),(52,_binary '\0',13,0,'2022-09-22','13:05:00','12:50:00',NULL),(53,_binary '\0',13,0,'2022-09-22','13:25:00','13:10:00',NULL),(54,_binary '\0',13,0,'2022-09-22','13:45:00','13:30:00',NULL),(56,_binary '\0',13,0,'2022-09-22','14:25:00','14:10:00',NULL),(58,_binary '\0',13,0,'2022-09-22','15:05:00','14:50:00',NULL),(59,_binary '\0',9,0,'2022-09-24','10:40:00','10:30:00',NULL),(60,_binary '\0',9,0,'2022-09-24','11:00:00','10:50:00',NULL),(61,_binary '\0',9,0,'2022-09-24','11:20:00','11:10:00',NULL),(62,_binary '\0',9,0,'2022-09-24','11:40:00','11:30:00',NULL),(64,_binary '\0',9,0,'2022-09-24','12:20:00','12:10:00',NULL),(65,_binary '\0',9,0,'2022-09-24','12:40:00','12:30:00',NULL),(66,_binary '\0',9,0,'2022-09-24','13:00:00','12:50:00',NULL),(67,_binary '\0',9,0,'2022-09-24','13:20:00','13:10:00',NULL),(68,_binary '\0',9,0,'2022-09-24','13:40:00','13:30:00',NULL),(69,_binary '\0',9,0,'2022-09-24','14:00:00','13:50:00',NULL),(70,_binary '\0',9,0,'2022-09-24','14:20:00','14:10:00',NULL),(71,_binary '\0',9,0,'2022-09-24','14:40:00','14:30:00',NULL),(72,_binary '\0',9,0,'2022-09-24','15:00:00','14:50:00',NULL),(73,_binary '\0',9,0,'2022-09-24','15:20:00','15:10:00',NULL),(74,_binary '\0',9,0,'2022-09-24','15:40:00','15:30:00',NULL),(75,_binary '',9,7,'2022-09-25','10:40:00','10:30:00',NULL),(76,_binary '\0',9,0,'2022-09-25','11:00:00','10:50:00',NULL),(77,_binary '\0',9,0,'2022-09-25','11:20:00','11:10:00',NULL),(78,_binary '\0',9,0,'2022-09-25','11:40:00','11:30:00',NULL),(79,_binary '\0',9,0,'2022-09-25','12:00:00','11:50:00',NULL),(81,_binary '\0',9,0,'2022-09-25','12:40:00','12:30:00',NULL),(82,_binary '',9,7,'2022-09-25','13:00:00','12:50:00',NULL),(83,_binary '\0',9,0,'2022-09-25','13:20:00','13:10:00',NULL),(85,_binary '',9,23,'2022-09-25','14:00:00','13:50:00',NULL),(86,_binary '',9,7,'2022-09-25','14:20:00','14:10:00',NULL),(87,_binary '\0',9,0,'2022-09-25','14:40:00','14:30:00',NULL),(88,_binary '\0',9,0,'2022-09-25','15:00:00','14:50:00',NULL),(89,_binary '\0',9,0,'2022-09-25','15:20:00','15:10:00',NULL),(90,_binary '\0',9,0,'2022-09-25','15:40:00','15:30:00',NULL);
/*!40000 ALTER TABLE `created_sub_slot_saver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_info`
--

DROP TABLE IF EXISTS `doctor_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor_info` (
  `doctor_id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `is_valid` bit(1) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `licence_copy` varchar(255) DEFAULT NULL,
  `licence_number` varchar(255) DEFAULT NULL,
  `mob_number` bigint DEFAULT NULL,
  `passing_year` datetime(6) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `qualification` varchar(255) DEFAULT NULL,
  `specilization` varchar(255) DEFAULT NULL,
  `university` varchar(255) DEFAULT NULL,
  `clinic_id` int DEFAULT NULL,
  PRIMARY KEY (`doctor_id`),
  KEY `FKqnlmo8ecosnrh03krr6dw25tn` (`clinic_id`),
  CONSTRAINT `FKqnlmo8ecosnrh03krr6dw25tn` FOREIGN KEY (`clinic_id`) REFERENCES `clinic_info` (`clinic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_info`
--

LOCK TABLES `doctor_info` WRITE;
/*!40000 ALTER TABLE `doctor_info` DISABLE KEYS */;
INSERT INTO `doctor_info` VALUES (9,'abs@gmail.com','prabhandh','D:\\cdac\\IET\\JAVA\\SpringWorkSpace\\WeCare/image/0annabhau_sathe_1.jpg',_binary '\0','Shinde','','ajkhsdkasjh',9689361857,'1970-01-01 05:30:02.002000','Prabandh','MBBS','General','SPPU',8),(13,'abs@gmail.com','Pratik','',_binary '\0','Alhat','','Jhhjkasdasd',7387697939,'1970-01-01 05:30:01.989000','fgdfgdf','MD','Gynac','Mumbai University',12),(33,'asda@gmail.com','Mange','C:\\fakepath\\Tanmay.jpg',_binary '\0','Gang','','sadsa',8484822216,'2002-01-01 00:00:00.000000','mangesh','MBBS','General','SPPu',32),(57,'abs@gmail.com','prabhandh',NULL,_binary '\0','Shinde','C:\\fakepath\\Ankit Jadhav Resume 2022.pdf','sdfsdf',968936187,'2002-01-01 00:00:00.000000','Ankit','MD','General','SPPU',56);
/*!40000 ALTER TABLE `doctor_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_scheduled_slots`
--

DROP TABLE IF EXISTS `doctor_scheduled_slots`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor_scheduled_slots` (
  `slot_id` bigint NOT NULL AUTO_INCREMENT,
  `avg_patient_check_time` time DEFAULT NULL,
  `buffer_time` time DEFAULT NULL,
  `doctor_id_fk` bigint NOT NULL,
  `end_date` date DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  PRIMARY KEY (`slot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_scheduled_slots`
--

LOCK TABLES `doctor_scheduled_slots` WRITE;
/*!40000 ALTER TABLE `doctor_scheduled_slots` DISABLE KEYS */;
INSERT INTO `doctor_scheduled_slots` VALUES (1,'00:20:00','00:10:00',0,NULL,'15:30:00','2022-09-21','11:00:00'),(2,'00:20:00','00:10:00',11,NULL,'15:30:00','2022-09-21','11:00:00'),(3,'00:05:00','00:02:00',13,NULL,'20:30:00','2022-09-21','16:00:00'),(4,'00:15:00','00:05:00',13,NULL,'15:00:00','2022-09-22','11:30:00'),(5,'00:10:00','00:10:00',9,NULL,'15:50:00','2022-09-24','10:30:00'),(6,'00:10:00','00:10:00',9,NULL,'15:50:00','2022-09-25','10:30:00');
/*!40000 ALTER TABLE `doctor_scheduled_slots` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (60),(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_info`
--

DROP TABLE IF EXISTS `patient_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_info` (
  `patient_id` int NOT NULL,
  `blood_group` varchar(255) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mob_number` bigint DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_info`
--

LOCK TABLES `patient_info` WRITE;
/*!40000 ALTER TABLE `patient_info` DISABLE KEYS */;
INSERT INTO `patient_info` VALUES (7,'AB+','2022-09-16','Ankit','M','Jadhav',9665340359,'NehaMore'),(22,'AB+','2022-09-07','Ankit','M','Jadhav',6653002259,'Ankit'),(23,'AB+','2022-09-06','Neha','F','More',52884522,'Ankit');
/*!40000 ALTER TABLE `patient_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `slot_table`
--

DROP TABLE IF EXISTS `slot_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `slot_table` (
  `slot_id` int NOT NULL,
  `doctor_id` int DEFAULT NULL,
  `is_booked` bit(1) DEFAULT NULL,
  `patient_id` int DEFAULT NULL,
  `slot_date` date DEFAULT NULL,
  `slot_time` time DEFAULT NULL,
  PRIMARY KEY (`slot_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `slot_table`
--

LOCK TABLES `slot_table` WRITE;
/*!40000 ALTER TABLE `slot_table` DISABLE KEYS */;
INSERT INTO `slot_table` VALUES (1,9,_binary '\0',0,'2022-09-19','12:00:00'),(2,9,_binary '',7,'2022-09-19','12:15:00'),(3,9,_binary '',7,'2022-09-19','12:30:00'),(4,9,_binary '\0',0,'2022-09-19','12:45:00'),(5,9,_binary '',7,'2022-09-19','13:00:00'),(6,9,_binary '',7,'2022-09-19','13:15:00');
/*!40000 ALTER TABLE `slot_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `upload_file`
--

DROP TABLE IF EXISTS `upload_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `upload_file` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `data` longblob,
  `doctorid` bigint NOT NULL,
  `file_name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `upload_file`
--

LOCK TABLES `upload_file` WRITE;
/*!40000 ALTER TABLE `upload_file` DISABLE KEYS */;
/*!40000 ALTER TABLE `upload_file` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-01 22:46:58
