CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(45) NOT NULL COMMENT '订单号',
  `user_id` int(11) NOT NULL COMMENT '所属用户ID',
  `product_id` int(11) NOT NULL COMMENT '所属产品ID',
  `count` int(11) NOT NULL COMMENT '产品数量',
  `total_cost` double NOT NULL COMMENT '订单总价',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `t_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_number` varchar(45) NOT NULL COMMENT '商品编号',
  `product_name` varchar(45) NOT NULL COMMENT '商品名称',
  `category` varchar(45) NOT NULL COMMENT '商品类别',
  `price` double NOT NULL COMMENT '商品单价',
  `weight` double NOT NULL COMMENT '商品重量',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `product_number_UNIQUE` (`product_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(45) NOT NULL COMMENT '用户名',
  `password` varchar(45) NOT NULL COMMENT '密码',
  `nickname` varchar(45) NOT NULL COMMENT '昵称',
  `idcard` char(18) NOT NULL COMMENT '身份证号',
  `phone` char(11) NOT NULL COMMENT '手机号',
  `email` varchar(45) NOT NULL COMMENT '邮箱',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
