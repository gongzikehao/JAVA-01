CREATE DATABASE `business_0` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE DATABASE `business_1` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `t_order_0` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_1` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_2` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_3` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_4` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_5` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_6` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_7` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_8` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_9` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_10` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_11` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_12` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_13` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_14` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_15` (
  `id`  bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id`  bigint NOT NULL COMMENT '所属用户ID',
  `product_id`  bigint NOT NULL COMMENT '所属产品ID',
  `count`  bigint NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
