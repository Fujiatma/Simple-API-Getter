/*
SQLyog Community v12.5.0 (64 bit)
MySQL - 10.1.38-MariaDB : Database - homecredit
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`homecredit` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `homecredit`;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  `module_name` varchar(255) DEFAULT NULL,
  `module_order` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`category_id`),
  KEY `group_id` (`group_id`),
  CONSTRAINT `category_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `user_group` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `category` */

insert  into `category`(`category_id`,`group_id`,`module_name`,`module_order`,`description`,`created_at`,`updated_at`) values 
(1,1,'PromoCard',1,'Belongs to the user A','2019-07-16 09:09:53','2019-07-16 09:09:53'),
(2,1,'CategoryCard',2,'Belongs to the user A','2019-07-16 09:10:14','2019-07-16 09:10:14'),
(3,1,'FlashSaleCard',3,'Belongs to the user A','2019-07-16 09:14:59','2019-07-16 09:14:59'),
(4,1,'HistoryCard',4,'Belongs to the user A','2019-07-16 09:15:52','2019-07-16 09:15:52'),
(5,1,'NewsCard',5,'Belongs to the user A','2019-07-16 09:15:54','2019-07-16 09:15:54'),
(6,2,'PromoCard',1,'Belongs to the user B','2019-07-16 09:11:59','2019-07-16 09:11:59'),
(7,2,'NewsCard',2,'Belongs to the user B','2019-07-16 09:15:56','2019-07-16 09:15:56'),
(8,2,'FlashSaleCard',3,'Belongs to the user B','2019-07-16 09:15:58','2019-07-16 09:15:58'),
(9,2,'CategoryCard',4,'Belongs to the user B','2019-07-16 09:15:59','2019-07-16 09:15:59'),
(10,2,'NewsCard',5,'Belongs to the user B','2019-07-16 09:16:01','2019-07-16 09:16:01'),
(11,3,'PromoCard',1,'Belongs to the user C','2019-07-16 09:16:03','2019-07-16 09:16:03'),
(12,3,'FlashSaleCard',2,'Belongs to the user C','2019-07-16 09:13:46','2019-07-16 09:13:46'),
(13,3,'CategoryCard',3,'Belongs to the user C','2019-07-16 09:16:04','2019-07-16 09:16:04'),
(14,3,'NewsCard',4,'Belongs to the user C','2019-07-16 09:16:06','2019-07-16 09:16:06'),
(15,3,'HistoryCard',5,'Belongs to the user C','2019-07-16 09:16:11','2019-07-16 09:16:11');

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=latin1;

/*Data for the table `contact` */

insert  into `contact`(`id`,`email`,`name`,`phone`) values 
(41,'contact1@email.com','Contact 1','(111) 111-1111'),
(42,'contact2@email.com','Contact 2','(111) 111-1111'),
(43,'contact3@email.com','Contact 3','(111) 111-1111'),
(44,'contact4@email.com','Contact 4','(111) 111-1111'),
(45,'contact5@email.com','Contact 5','(111) 111-1111'),
(46,'contact6@email.com','Contact 6','(111) 111-1111'),
(47,'contact7@email.com','Contact 7','(111) 111-1111'),
(48,'contact8@email.com','Contact 8','(111) 111-1111'),
(49,'contact9@email.com','Contact 9','(111) 111-1111'),
(50,'contact10@email.com','Contact 10','(111) 111-1111');

/*Table structure for table `flash_sale` */

DROP TABLE IF EXISTS `flash_sale`;

CREATE TABLE `flash_sale` (
  `flash_sale_id` varchar(255) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `end_at` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `productid` varchar(255) DEFAULT NULL,
  `promo_id` varchar(255) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `start_at` datetime DEFAULT NULL,
  `status` bit(1) NOT NULL,
  `updated_at` datetime DEFAULT NULL,
  `product_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`flash_sale_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `flash_sale` */

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` varchar(255) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `end_at` datetime DEFAULT NULL,
  `head_line` varchar(255) DEFAULT NULL,
  `news_content` varchar(255) DEFAULT NULL,
  `start_at` datetime DEFAULT NULL,
  `status` bit(1) NOT NULL,
  `updated_at` datetime DEFAULT NULL,
  `news_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `news` */

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `promo_id` varchar(255) DEFAULT NULL,
  `flash_sale_id` varchar(255) DEFAULT NULL,
  `quantity` bigint(20) DEFAULT NULL,
  `price_order` double DEFAULT NULL,
  `created_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `order` */

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(50) DEFAULT NULL,
  `quantity` bigint(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `product_category` varchar(50) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `product` */

/*Table structure for table `promo` */

DROP TABLE IF EXISTS `promo`;

CREATE TABLE `promo` (
  `promo_id` varchar(255) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `end_at` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `start_at` datetime DEFAULT NULL,
  `status` bit(1) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`promo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `promo` */

/*Table structure for table `transaction_history` */

DROP TABLE IF EXISTS `transaction_history`;

CREATE TABLE `transaction_history` (
  `th_id` varchar(255) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `orderid` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`th_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transaction_history` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` varchar(255) NOT NULL,
  `group_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`),
  KEY `group_id` (`group_id`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`group_id`) REFERENCES `user_group` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`user_id`,`group_id`,`name`,`email`,`username`,`password`,`created_at`,`updated_at`) values 
('u001',1,'fujiatma','fujiatma@gmail.com','fuji','fuji123','2019-07-16 10:19:08','2019-07-16 10:19:08'),
('u002',2,'yusuf','yusuf@gmail.com','yusuf','yusuf123','2019-07-16 10:19:12','2019-07-16 10:19:12'),
('u003',3,'dian','dian@gmail.com','dian','dian123','2019-07-16 10:19:17','2019-07-16 10:19:17');

/*Table structure for table `user_group` */

DROP TABLE IF EXISTS `user_group`;

CREATE TABLE `user_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(50) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `group_id` (`group_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `user_group` */

insert  into `user_group`(`id`,`group_name`,`created_at`,`updated_at`) values 
(1,'UserA','2019-07-15 15:47:47','2019-07-15 15:47:47'),
(2,'UserB','2019-07-15 15:47:50','2019-07-15 15:47:50'),
(3,'UserC','2019-07-15 15:47:53','2019-07-15 15:47:53');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
