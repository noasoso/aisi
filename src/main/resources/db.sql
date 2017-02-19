/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.1.46-community : Database - aisi
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`aisi` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `aisi`;

/*Table structure for table `group` */

DROP TABLE IF EXISTS `group`;

CREATE TABLE `group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '名称',
  `agent_amount` decimal(10,2) DEFAULT NULL COMMENT '代理金额',
  `agent_discount` decimal(10,2) DEFAULT NULL COMMENT '代理折扣',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `group` */

insert  into `group`(`id`,`name`,`agent_amount`,`agent_discount`) values (1,'管理员','10000000.00','0.00'),(2,'股东','265000.00',NULL),(5,'董事','88000.00',NULL),(20,'全国总代','31000.00',NULL),(30,'区域代理','4500.00',NULL),(40,'一级代理','699.00',NULL),(50,'经销商','299.00',NULL);

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(255) NOT NULL,
  `order_amount` decimal(10,2) DEFAULT NULL,
  `order_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` smallint(6) DEFAULT '0',
  `user_id` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

/*Table structure for table `order_detail` */

DROP TABLE IF EXISTS `order_detail`;

CREATE TABLE `order_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(255) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `real_price` double DEFAULT NULL,
  `count` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_detail` */

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  `price` double DEFAULT '0',
  `stock` int(11) DEFAULT '0',
  `status` smallint(6) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`id`,`name`,`type_id`,`price`,`stock`,`status`) values (1,'玻尿酸原液',1,0,0,0),(2,'罗马洋甘菊纯露',1,0,0,0),(3,'大马士革玫瑰纯露',1,0,0,0);

/*Table structure for table `product_price` */

DROP TABLE IF EXISTS `product_price`;

CREATE TABLE `product_price` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `group_id` int(11) DEFAULT NULL,
  `price` double DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `product_price` */

insert  into `product_price`(`id`,`product_id`,`group_id`,`price`) values (1,1,2,50),(2,1,5,55),(3,1,20,65),(4,1,30,75);

/*Table structure for table `product_type` */

DROP TABLE IF EXISTS `product_type`;

CREATE TABLE `product_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `status` smallint(6) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `product_type` */

insert  into `product_type`(`id`,`name`,`status`) values (1,'化妆品',0);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '姓名',
  `password` varchar(255) DEFAULT NULL,
  `wechat` varchar(255) NOT NULL COMMENT '微信',
  `mobile_phone` varchar(255) NOT NULL COMMENT '手机',
  `cardid` varchar(255) NOT NULL COMMENT '身份证',
  `city` varchar(255) NOT NULL COMMENT '收货地址',
  `group_id` int(11) NOT NULL COMMENT '代理等级',
  `status` smallint(6) DEFAULT NULL COMMENT '用户状态',
  `agentid` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`password`,`wechat`,`mobile_phone`,`cardid`,`city`,`group_id`,`status`,`agentid`) values (2,'123',NULL,'123','123','123','123',40,40,0),(3,'123',NULL,'123','123','123','213',40,1,0),(4,'123',NULL,'123','123','123','123',40,1,0),(10000,'admin','','admin','13333333333','111111',' ',0,NULL,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
