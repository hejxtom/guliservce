/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.18-log : Database - guli_edu
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`guli_edu` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `guli_edu`;

/*Table structure for table `edu_chapter` */

DROP TABLE IF EXISTS `edu_chapter`;

CREATE TABLE `edu_chapter` (
  `id` char(19) NOT NULL COMMENT '章节ID',
  `course_id` char(19) NOT NULL COMMENT '课程ID',
  `title` varchar(50) NOT NULL COMMENT '章节名称',
  `sort` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '显示排序',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='课程';

/*Data for the table `edu_chapter` */

insert  into `edu_chapter`(`id`,`course_id`,`title`,`sort`,`gmt_create`,`gmt_modified`) values ('1363743274036486145','1358340015993999361','第一章',1,'2021-02-22 14:51:48','2021-02-22 14:51:48'),('1363777120094130177','1358340015993999361','第二章',2,'2021-02-22 17:06:18','2021-02-22 17:06:18'),('1364118694732775426','1358339511880601601','第一章 ',1,'2021-02-23 15:43:36','2021-02-23 15:43:36'),('1364118730736680961','1358339511880601601','第二章',0,'2021-02-23 15:43:44','2021-02-23 15:43:44'),('1364453556576661506','1364409026410205186','第一章',1,'2021-02-24 13:54:13','2021-02-24 13:54:13'),('1364454042251898882','1358338030955745282','第一章',1,'2021-02-24 13:56:09','2021-02-24 13:56:09');

/*Table structure for table `edu_comment` */

DROP TABLE IF EXISTS `edu_comment`;

CREATE TABLE `edu_comment` (
  `id` char(19) NOT NULL COMMENT '讲师ID',
  `course_id` char(19) NOT NULL DEFAULT '' COMMENT '课程id',
  `teacher_id` char(19) NOT NULL DEFAULT '' COMMENT '讲师id',
  `member_id` char(19) NOT NULL DEFAULT '' COMMENT '会员id',
  `nickname` varchar(50) DEFAULT NULL COMMENT '会员昵称',
  `avatar` varchar(255) DEFAULT NULL COMMENT '会员头像',
  `content` varchar(500) DEFAULT NULL COMMENT '评论内容',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_course_id` (`course_id`),
  KEY `idx_teacher_id` (`teacher_id`),
  KEY `idx_member_id` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='评论';

/*Data for the table `edu_comment` */

/*Table structure for table `edu_course` */

DROP TABLE IF EXISTS `edu_course`;

CREATE TABLE `edu_course` (
  `id` char(19) NOT NULL COMMENT '课程ID',
  `teacher_id` char(19) NOT NULL COMMENT '课程讲师ID',
  `subject_id` char(19) NOT NULL COMMENT '课程专业ID',
  `subject_parent_id` char(19) NOT NULL COMMENT '课程专业父级ID',
  `title` varchar(50) NOT NULL COMMENT '课程标题',
  `price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '课程销售价格，设置为0则可免费观看',
  `lesson_num` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '总课时',
  `cover` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '课程封面图片路径',
  `buy_count` bigint(10) unsigned NOT NULL DEFAULT '0' COMMENT '销售数量',
  `view_count` bigint(10) unsigned NOT NULL DEFAULT '0' COMMENT '浏览数量',
  `version` bigint(20) unsigned NOT NULL DEFAULT '1' COMMENT '乐观锁',
  `status` varchar(10) NOT NULL DEFAULT 'Draft' COMMENT '课程状态 Draft未发布  Normal已发布',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_title` (`title`),
  KEY `idx_subject_id` (`subject_id`),
  KEY `idx_teacher_id` (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='课程';

/*Data for the table `edu_course` */

insert  into `edu_course`(`id`,`teacher_id`,`subject_id`,`subject_parent_id`,`title`,`price`,`lesson_num`,`cover`,`buy_count`,`view_count`,`version`,`status`,`gmt_create`,`gmt_modified`) values ('1358241470418780161','5','1356843204678516737','1356843204615602178','SpringMVC视频教程','300.00',60,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/cover/2021/02/07/01b73d8e-4873-4d91-9ec1-96dc68c046b4.jpg',11,3,1,'Normal','2021-02-07 10:29:36','2021-02-24 13:52:02'),('1358251496898400257','1','1356843204930174978','1356843204921786370','Linux视频教程','399.00',76,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/cover/2021/02/07/abbb86ac-3d2c-4d88-8508-984eb8bc4e53.jpg',12,9,1,'Normal','2021-02-07 11:09:27','2021-02-24 14:35:51'),('1358252483079933954','3','1356843204678516737','1356843204615602178','30天搞定Java核心技术','399.00',755,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/cover/2021/02/07/4ad9f3a6-5f8b-4c48-93fc-3a6b8f408447.jpg',0,1,1,'Normal','2021-02-07 11:13:22','2021-02-24 13:52:43'),('1358261440234229762','7','1356843205148278785','1356843205131501570','RBAC','199.00',62,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/cover/2021/02/07/64445eda-e9a2-4415-80ca-55305dae7d17.jpg',0,3,1,'Normal','2021-02-07 11:48:57','2021-03-01 14:15:49'),('1358328431707947010','1355022980618772482','1356843204678516737','1356843204615602178','图解Java数据结构和算法','99.00',142,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/cover/2021/02/07/b215f189-62a1-41ed-92ec-ad4ea95fa4ba.jpg',0,1,1,'Normal','2021-02-07 16:15:09','2021-02-24 13:52:47'),('1358338030955745282','8','1356843205148278785','1356843205131501570','互联网大厂高频重点面试题','299.00',120,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/cover/2021/02/07/1c8fe687-23e6-4fb4-ae43-018a93545b6d.jpg',0,14,1,'Normal','2021-02-07 16:53:18','2021-03-03 21:01:49'),('1358339511880601601','6','1356843204678516737','1356843204615602178','消息中间件之ActiveMQ','0.01',0,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/cover/2021/02/07/6d2b457b-d18f-4085-9224-3f66bd3cd886.jpg',9,9,1,'Normal','2021-02-07 16:59:11','2021-02-24 14:46:47'),('1358340015993999361','1','1356843204678516737','1356843204615602178','Java11新特性','99.00',16,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/cover/2021/02/07/b4c0acc3-2ef1-4ac4-84cf-810e4416a7ba.jpg',10,10,1,'Normal','2021-02-07 17:01:11','2021-03-01 14:15:46'),('1364409026410205186','5','1356843204728848385','1356843204615602178','面试宝典','9.99',66,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/cover/2021/02/24/916c17e8-ca58-4c59-b248-89d7868ac0aa.jpg',0,3,1,'Normal','2021-02-24 10:57:16','2021-02-27 20:46:03');

/*Table structure for table `edu_course_collect` */

DROP TABLE IF EXISTS `edu_course_collect`;

CREATE TABLE `edu_course_collect` (
  `id` char(19) NOT NULL COMMENT '收藏ID',
  `course_id` char(19) NOT NULL COMMENT '课程讲师ID',
  `member_id` char(19) NOT NULL DEFAULT '' COMMENT '课程专业ID',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='课程收藏';

/*Data for the table `edu_course_collect` */

/*Table structure for table `edu_course_description` */

DROP TABLE IF EXISTS `edu_course_description`;

CREATE TABLE `edu_course_description` (
  `id` char(19) NOT NULL COMMENT '课程ID',
  `description` text COMMENT '课程简介',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程简介';

/*Data for the table `edu_course_description` */

insert  into `edu_course_description`(`id`,`description`,`gmt_create`,`gmt_modified`) values ('1358241470418780161','<p>基于Spring4.x、涵盖企业开发技术点、源码级讲授的尚硅谷_SpringMVC。<br />本套视频涵盖 SpringMVC 开发过程中的技术问题，多个技术点更是从源代码级别进行分析，授之以渔。学习本套视频后，你会真正理解 SpringMVC 的优雅和简洁，并使你具备开发 SpringMVC 企业级项目的能力。 SpringMVC采取松散耦合可插拔组件结构，比其它MVC框架更具扩展性和灵活性。SpringMVC通过一套MVC注解，让POJO成为处理请求的控制器，而不需要实现任何接口，同时SpringMVC还支持REST风格的URL请求。SpringMVC在框架设计、扩展性、灵活性方面全面超越了Struts、WebWork MVC框架，从原来的追赶者一跃成为MVC框架的领跑者。</p>','2021-02-07 10:29:36','2021-02-20 11:01:29'),('1358251496898400257','<p>本套课程兼顾JavaEE、大数据和Python程序员使用Linux的需要，既可以让初学者快速掌握Linux，也能让Linux老手更全面、系统地学习到更多技术细节，堪称Linux课程的得意之作。</p>','2021-02-07 11:09:27','2021-02-07 11:09:27'),('1358252483079933954','<p>本教程特点：<br />1.更适合零基础学员：<br />&middot;自Java语言起源始，循序渐进，知识点剖析细致且每章配备大量随堂练习，让你步步为营，学得透彻、练得明白<br />&middot;拒绝晦涩难懂的呆板教学，宋老师语言生动幽默，举例形象生动深入浅出，迅速让你把握问题本质，四两拨千斤<br /><br />2.课程内容推陈出新：<br />&middot;<strong>基于JDK 11</strong>，将Java8、Java9、Java10、Java11新特性一网打尽<br />&middot;课程中，<strong>Eclipse</strong>和<strong>IDEA</strong>这两种企业一线开发环境都使用到了<br /><br />3.技术讲解更深入、更全面：<br />&middot;课程共30天，715个知识视频小节，涉及主流Java使用的方方面面，全而不冗余<br />&middot;全程内容涵盖<strong>数据结构、设计模式、JVM</strong>内存结构等深度技术<br />&middot;企业级笔试面试题目深入源码级讲解，拒绝死记硬背<br /><br />4.代码量更大、案例更丰富、更贴近实战：<br />&middot;Java语言基础阶段：<strong>12720</strong>行代码，Java语言高级阶段：<strong>11684</strong>行代码<br />&middot;课堂实战项目<strong>3套</strong>，课后实战项目<strong>2套</strong><br />&middot;近百道企业面试真题精讲精练</p>','2021-02-07 11:13:22','2021-02-07 11:13:22'),('1358261440234229762','<p>本视频讲授RBAC权限模型的设计、以及在项目中的应用 。<br />1. 使用Maven进行项目构建 。<br />2. 页面设计采用响应式前端框架BootStrap 。<br />3. 采用多种方式展现用户数据：树形结构（ztree）、图表(echarts) 等 。<br />4. 基础业务功能采用异步数据操作，增强用户体验效果 。</p>','2021-02-07 11:48:57','2021-02-07 11:48:57'),('1358328431707947010','<p>1.算法是程序的灵魂，优秀的程序在对海量数据处理时，依然保持高速计算，就需要高效的数据结构和算法支撑。<br /><br />2.网上数据结构和算法的课程不少，但存在两个问题：<br /><br />1)授课方式单一，大多是照着代码念一遍，数据结构和算法本身就比较难理解，对基础好的学员来说，还好一点，对基础不好的学生来说，基本上就是听天书了<br />2)说是讲数据结构和算法，但大多是挂羊头卖狗肉，算法讲的很少。 本课程针对上述问题，有针对性的进行了升级<br />3)授课方式采用图解+算法游戏的方式，让课程生动有趣好理解<br />4)系统全面的讲解了数据结构和算法, 除常用数据结构和算法外，还包括程序员常用10大算法：二分查找算法（非递归）、分治算法、动态规划算法、KMP算法、贪心算法、普里姆算法、克鲁斯卡尔算法、迪杰斯特拉算法、弗洛伊德算法、马踏棋盘算法。可以解决面试遇到的最短路径、最小生成树、最小连通图、动态规划等问题及衍生出的面试题，让你秒杀其他面试小伙伴<br /><br />3.如果你不想永远都是代码工人，就需要花时间来研究下数据结构和算法。<br /><br />教程内容：<br />本教程是使用Java来讲解数据结构和算法，考虑到数据结构和算法较难，授课采用图解加算法游戏的方式。内容包括: 稀疏数组、单向队列、环形队列、单向链表、双向链表、环形链表、约瑟夫问题、栈、前缀、中缀、后缀表达式、中缀表达式转换为后缀表达式、递归与回溯、迷宫问题、八皇后问题、算法的时间复杂度、冒泡排序、选择排序、插入排序、快速排序、归并排序、希尔排序、基数排序(桶排序)、堆排序、排序速度分析、二分查找、插值查找、斐波那契查找、散列、哈希表、二叉树、二叉树与数组转换、二叉排序树(BST)、AVL树、线索二叉树、赫夫曼树、赫夫曼编码、多路查找树(B树B+树和B*树)、图、图的DFS算法和BFS、程序员常用10大算法、二分查找算法(非递归)、分治算法、动态规划算法、KMP算法、贪心算法、普里姆算法、克鲁斯卡尔算法、迪杰斯特拉算法、弗洛伊德算法马踏棋盘算法。<br /><br />学习目标：<br />通过学习，学员能掌握主流数据结构和算法的实现机制，开阔编程思路，提高优化程序的能力。</p>','2021-02-07 16:15:09','2021-02-07 16:15:36'),('1358338030955745282','<p>斩offer、拿高薪、跳槽神器，对标阿里P6的《尚硅谷_互联网大厂高频重点面试题（第2季）》发布。<br /><br />知其然，更要知其所以然！本套课程总结分析了2019年大厂互联网公司常见常考的技术点，通过对40多个题目共计120集视频详细全面的讲解，让大家深刻掌握、扎实吃透当前的主流Java高级技术。<br /><br />本期内容包括JUC多线程并发、JVM和GC等目前大厂笔试中会考、面试中会问、工作中会用的高频难点知识。上半场，从多线程并发入手，分层递进讲解，逐步让大家掌握volatile、原子类和原子引用、CAS、ABA、Java锁机制、阻塞队列、线程池等重点；下半场，逐步过渡到JVM和GC的知识，深度讲解多种常见OOM异常和JVM参数调优，以及串行并行并发G1等各种垃圾收集器的优化实践。<br /><br />无论是进入职场不久的初级程序员，还是技术长期没有成长、正在吃老本走下坡路但还想涨薪的&ldquo;潜牛&rdquo;，请你跟着尚硅谷视频拼命复习一个月，下个月有自信有底气地升职加薪，加油吧！</p>','2021-02-07 16:53:18','2021-02-24 14:03:55'),('1358339511880601601','<p>消息中间件已经成为互联网企业应用系统内部通信的核心手段，是目前企业内主流标配技术，它具有解耦、异步、削峰、签收、事务、流量控制、最终一致性等一系列高性能架构所需功能。<br /><br />当前使用较多的消息中间件有RabbitMQ、RocketMQ、ActiveMQ、Kafka、ZeroMQ、MetaMQ等，本次以Apache的ActiveMQ作为切入点，分为基础/实战/面试上中下三大部分，将带着同学们从零基础入门到熟练掌握ActiveMQ，能够结合Spring/SpringBoot进行实际开发配置并能够进行MQ多节点集群的部署，最后学习MQ的高级特性和高频面试题的分析。<br /><br />希望通过本次学习，能够帮助同学们取得更大的进步，加油O(&cap;_&cap;)O</p>','2021-02-07 16:59:11','2021-02-23 15:44:46'),('1358340015993999361','<p>还在苦恼跟不上JDK更新速度？<br />还在苦恼看不懂官方文档？<br />本套视频语调轻快、讲解深入，带你一睹Java11的风采：新的局部变量的语法、更方便的调试运行程序的方式jshell及直接运行源代码、令人瞩目的ZGC, JFR、新HttpClient API、兼容Unicode10的新的字符串API等。</p>','2021-02-07 17:01:11','2021-02-20 09:17:45'),('1364409026410205186','<p>面试宝典-python版</p>','2021-02-24 10:57:16','2021-02-24 10:57:16');

/*Table structure for table `edu_subject` */

DROP TABLE IF EXISTS `edu_subject`;

CREATE TABLE `edu_subject` (
  `id` char(19) NOT NULL COMMENT '课程类别ID',
  `title` varchar(10) NOT NULL COMMENT '类别名称',
  `parent_id` char(19) NOT NULL DEFAULT '0' COMMENT '父ID',
  `sort` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '排序字段',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_parent_id` (`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='课程科目';

/*Data for the table `edu_subject` */

insert  into `edu_subject`(`id`,`title`,`parent_id`,`sort`,`gmt_create`,`gmt_modified`) values ('1356843204615602178','后端开发','0',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204678516737','Java','1356843204615602178',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204728848385','Python','1356843204615602178',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204762402818','前端开发','0',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204779180034','HTML/CSS','1356843204762402818',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204821123073','JavaScript','1356843204762402818',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204837900290','云计算','0',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204863066114','Docker','1356843204837900290',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204896620545','Linux','1356843204837900290',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204921786370','系统/运维','0',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204930174978','Linux','1356843204921786370',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204972118017','Windows','1356843204921786370',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843204988895234','数据库','0',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843205005672450','MySQL','1356843204988895234',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843205030838274','MongoDB','1356843204988895234',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843205047615490','大数据','0',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843205064392706','Hadoop','1356843205047615490',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843205089558530','Spark','1356843205047615490',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843205106335745','人工智能','0',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843205114724353','Python','1356843205106335745',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843205131501570','编程语言','0',0,'2021-02-03 13:53:24','2021-02-03 13:53:24'),('1356843205148278785','Java','1356843205131501570',0,'2021-02-03 13:53:24','2021-02-03 13:53:24');

/*Table structure for table `edu_teacher` */

DROP TABLE IF EXISTS `edu_teacher`;

CREATE TABLE `edu_teacher` (
  `id` char(19) NOT NULL COMMENT '讲师ID',
  `name` varchar(20) NOT NULL COMMENT '讲师姓名',
  `intro` varchar(500) NOT NULL DEFAULT '' COMMENT '讲师简介',
  `career` varchar(500) DEFAULT NULL COMMENT '讲师资历,一句话说明讲师',
  `level` int(10) unsigned NOT NULL COMMENT '头衔 1高级讲师 2首席讲师',
  `avatar` varchar(255) DEFAULT NULL COMMENT '讲师头像',
  `sort` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '排序',
  `join_date` date DEFAULT NULL COMMENT '入驻时间',
  `is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '逻辑删除 1（true）已删除， 0（false）未删除',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='讲师';

/*Data for the table `edu_teacher` */

insert  into `edu_teacher`(`id`,`name`,`intro`,`career`,`level`,`avatar`,`sort`,`join_date`,`is_deleted`,`gmt_create`,`gmt_modified`) values ('1','刘德华','毕业于师范大学数学系，热爱教育事业，执教数学思维6年有余','具备深厚的数学思维功底、丰富的小学教育经验，授课风格生动活泼，擅长用形象生动的比喻帮助理解、简单易懂的语言讲解难题，深受学生喜欢',2,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/01/31/d35d6f02-7255-4e19-8b38-c46f7d73b809.jpg',10,'2019-10-29',0,'2018-03-30 17:15:57','2021-01-31 10:56:33'),('10','唐嫣','北京师范大学法学院副教授','北京师范大学法学院副教授、清华大学法学博士。自2004年至今已有9年的司法考试培训经验。长期从事司法考试辅导，深知命题规律，了解解题技巧。内容把握准确，授课重点明确，层次分明，调理清晰，将法条法理与案例有机融合，强调综合，深入浅出。',2,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/01/31/13c1dc51-4e4b-4d87-99a0-f5123423d442.jpg',20,'2019-10-29',0,'2018-04-03 14:32:19','2021-02-01 08:43:08'),('1320352940363440129','周军','string','string',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/02/02/5c640220-c925-4d63-b6a0-b80de2a8f3d4.jpg',1,'2020-10-25',1,'2020-10-25 21:14:07','2021-02-02 18:33:38'),('1355022980618772482','周州','武汉大学研究生','传智播客优秀讲师',2,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/02/23/b69e576c-3b97-476b-ad81-a9b45bf53ac3.jpg',20,'2021-01-29',0,'2021-01-29 13:20:28','2021-02-23 14:33:27'),('1355026116297220097','何炅','华中科技大学研究生','华为云存储资深学者',2,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/01/31/4187d962-fddc-4997-85f8-abe110f00326.jpg',30,'2021-01-01',0,'2021-01-29 13:32:56','2021-01-31 11:00:05'),('1355028485156233218','1','1','1',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/default.jpg',5,'2021-01-05',1,'2021-01-29 13:42:21','2021-01-29 13:42:21'),('1356551584880107521','9','9','9',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/02/09/7f52a874-4618-41e1-8d9d-5576827d8a71.jpg',1,'2021-02-10',1,'2021-02-02 18:34:36','2021-02-09 13:19:26'),('1358742463761874945','100','1','1',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/02/08/45c3bf00-751d-41e8-a1e5-83fbf2fb61e2.jpg',1,'2021-02-03',1,'2021-02-08 19:40:22','2021-02-08 19:40:22'),('1359009196527603713','90','1','1',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/02/09/eb840e19-614a-457b-ae47-99ba71964fb2.jpg',1,'2021-02-27',1,'2021-02-09 13:20:16','2021-02-09 13:20:16'),('1359009713660121089','刘德华1','1','1',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/02/09/6f84aa69-8d7b-44c0-9125-c5cc4564fa66.jpg',0,'2021-02-10',1,'2021-02-09 13:22:20','2021-02-09 13:22:20'),('2','周润发','中国人民大学附属中学数学一级教师','中国科学院数学与系统科学研究院应用数学专业博士，研究方向为数字图像处理，中国工业与应用数学学会会员。参与全国教育科学“十五”规划重点课题“信息化进程中的教育技术发展研究”的子课题“基与课程改革的资源开发与应用”，以及全国“十五”科研规划全国重点项目“掌上型信息技术产品在教学中的运用和开发研究”的子课题“用技术学数学”。',2,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/01/31/4782d953-8027-4d7f-abb1-fbca804fbf03.jpg',25,'2019-10-28',0,'2018-03-30 18:28:26','2021-01-31 10:59:19'),('3','钟汉良','钟汉良钟汉良钟汉良钟汉良','中教一级职称。讲课极具亲和力。',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/01/31/2cca2ca7-86b8-4515-a45b-e4e56de24a1d.jpg',2,'2019-10-29',0,'2018-03-31 09:20:46','2021-01-31 10:55:58'),('4','周杰伦','长期从事考研政治课讲授和考研命题趋势与应试对策研究。考研辅导新锐派的代表。','政治学博士、管理学博士后，北京师范大学马克思主义学院副教授。多年来总结出了一套行之有效的应试技巧与答题方法，针对性和实用性极强，能帮助考生在轻松中应考，在激励的竞争中取得高分，脱颖而出。',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/02/21/49be486b-c25c-4eef-8e27-d584d09b93e3.jpg',1,'2019-10-27',0,'2018-04-03 14:13:51','2021-02-21 16:55:14'),('5','陈伟霆','人大附中2009届毕业生','北京大学数学科学学院2008级本科生，2012年第八届学生五四奖章获得者，在数学领域取得多项国际国内奖项，学术研究成绩突出。曾被两次评为北京大学三好学生、一次评为北京大学三好标兵，获得过北京大学国家奖学金、北京大学廖凯原奖学金、北京大学星光国际一等奖学金、北京大学明德新生奖学金等。',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/02/23/24e7f6e0-eb52-4a45-bdb1-bea9701baf39.jpg',1,'2019-10-29',0,'2018-04-03 14:15:36','2021-02-23 14:34:40'),('6','姚晨','华东师范大学数学系硕士生导师，中国数学奥林匹克高级教练','曾参与北京市及全国多项数学活动的命题和组织工作，多次带领北京队参加高中、初中、小学的各项数学竞赛，均取得优异成绩。教学活而新，能够调动学生的学习兴趣并擅长对学生进行思维点拨，对学生学习习惯的养成和非智力因素培养有独到之处，是一位深受学生喜爱的老师。',1,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/01/31/ff512e64-889e-4c79-af09-9ab0c9802303.jpg',1,'2019-10-29',0,'2018-04-01 14:19:28','2021-01-31 10:55:42'),('7','胡歌','考研政治辅导实战派专家，全国考研政治命题研究组核心成员。','法学博士，北京师范大学马克思主义学院副教授，专攻毛泽东思想概论、邓小平理论，长期从事考研辅导。出版著作两部，发表学术论文30余篇，主持国家社会科学基金项目和教育部重大课题子课题各一项，参与中央实施马克思主义理论研究和建设工程项目。',2,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/01/31/bf4f349c-ec19-44df-850f-9e888c7c2c0b.jpg',8,'2019-09-04',0,'2018-04-03 14:21:03','2021-01-31 10:56:15'),('8','谢娜','资深课程设计专家，专注10年AACTP美国培训协会认证导师','十年课程研发和培训咨询经验，曾任国企人力资源经理、大型外企培训经理，负责企业大学和培训体系搭建；曾任专业培训机构高级顾问、研发部总监，为包括广东移动、东莞移动、深圳移动、南方电网、工商银行、农业银行、民生银行、邮储银行、TCL集团、清华大学继续教育学院、中天路桥、广西扬翔股份等超过200家企业提供过培训与咨询服务，并担任近50个大型项目的总负责人。',2,'https://guli-file-hejx.oss-cn-beijing.aliyuncs.com/avatar/2021/01/31/b50a1dc7-0525-4ae9-b816-2927debb5455.jpg',10,'2019-10-29',0,'2018-04-03 14:23:33','2021-02-01 08:42:59');

/*Table structure for table `edu_video` */

DROP TABLE IF EXISTS `edu_video`;

CREATE TABLE `edu_video` (
  `id` char(19) NOT NULL COMMENT '视频ID',
  `course_id` char(19) NOT NULL COMMENT '课程ID',
  `chapter_id` char(19) NOT NULL COMMENT '章节ID',
  `title` varchar(50) NOT NULL COMMENT '节点名称',
  `video_source_id` varchar(100) DEFAULT NULL COMMENT '云端视频资源',
  `video_original_name` varchar(100) DEFAULT NULL COMMENT '原始文件名称',
  `sort` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '排序字段',
  `play_count` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '播放次数',
  `is_free` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否可以试听：0收费 1免费',
  `duration` float NOT NULL DEFAULT '0' COMMENT '视频时长（秒）',
  `status` varchar(20) NOT NULL DEFAULT 'Empty' COMMENT '状态',
  `size` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '视频源文件大小（字节）',
  `version` bigint(20) unsigned NOT NULL DEFAULT '1' COMMENT '乐观锁',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_course_id` (`course_id`),
  KEY `idx_chapter_id` (`chapter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='课程视频';

/*Data for the table `edu_video` */

insert  into `edu_video`(`id`,`course_id`,`chapter_id`,`title`,`video_source_id`,`video_original_name`,`sort`,`play_count`,`is_free`,`duration`,`status`,`size`,`version`,`gmt_create`,`gmt_modified`) values ('1363777038519111681','1358340015993999361','1363743274036486145','1.1 简介','4be181b868fd43e6bb348316f058444d','1.mp4',0,0,1,0,'Empty',0,1,'2021-02-22 17:05:58','2021-02-22 17:05:58'),('1364118782158848002','1358339511880601601','1364118730736680961','第一节','0b5f80ee88664d1796af4eca3e56c488','6.mp4',0,0,1,0,'Empty',0,1,'2021-02-23 15:43:56','2021-02-24 13:55:14'),('1364453669340524546','1364409026410205186','1364453556576661506','第一节 简介','0c5e932f8c0342b2a919db31b95534fd','2.mp4',1,0,1,0,'Empty',0,1,'2021-02-24 13:54:40','2021-02-27 20:45:42'),('1364453891311480834','1358339511880601601','1364118694732775426','第一节','7293dd204c024a8d8c6f8c58763fec8f','4.mp4',1,0,1,0,'Empty',0,1,'2021-02-24 13:55:33','2021-02-24 13:55:39'),('1364454104214351874','1358338030955745282','1364454042251898882','第一节','c87ebd3a67e54a5dae807aa6feadedc8','3.mp4',0,0,0,0,'Empty',0,1,'2021-02-24 13:56:23','2021-02-24 13:57:18');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
