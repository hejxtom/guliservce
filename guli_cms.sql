/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.18-log : Database - guli_cms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`guli_cms` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `guli_cms`;

/*Table structure for table `cms_ad` */

DROP TABLE IF EXISTS `cms_ad`;

CREATE TABLE `cms_ad` (
  `id` char(19) NOT NULL DEFAULT '' COMMENT 'ID',
  `title` varchar(20) DEFAULT '' COMMENT '标题',
  `type_id` char(19) NOT NULL COMMENT '类型ID',
  `image_url` varchar(500) NOT NULL DEFAULT '' COMMENT '图片地址',
  `color` varchar(10) DEFAULT NULL COMMENT '背景颜色',
  `link_url` varchar(500) DEFAULT '' COMMENT '链接地址',
  `sort` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '排序',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='广告推荐';

/*Data for the table `cms_ad` */

insert  into `cms_ad`(`id`,`title`,`type_id`,`image_url`,`color`,`link_url`,`sort`,`gmt_create`,`gmt_modified`) values ('1364485623951749121','小星学院','1','https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/ad/2021/02/24/3ce7fbbc-a2c9-41f2-8556-b4970a97558a.jpg','#000000','http://localhost:3333',1,'2021-02-24 16:01:38','2021-03-01 14:01:16'),('1366265911731843073','小星学院2','1','https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/ad/2021/03/01/6a4e4a20-49f5-45ed-a1a0-dcd4dff4232d.jpg','#000000','http://localhost:3333/',2,'2021-03-01 13:55:52','2021-03-01 14:03:59');

/*Table structure for table `cms_ad_type` */

DROP TABLE IF EXISTS `cms_ad_type`;

CREATE TABLE `cms_ad_type` (
  `id` char(19) NOT NULL COMMENT 'ID',
  `title` varchar(20) NOT NULL COMMENT '标题',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='推荐位';

/*Data for the table `cms_ad_type` */

insert  into `cms_ad_type`(`id`,`title`,`gmt_create`,`gmt_modified`) values ('1','首页幻灯片','2021-02-24 15:59:50','2021-02-24 15:59:50');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
