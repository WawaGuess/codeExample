drop table IF EXISTS user;

create TABLE user
(
	id BIGINT(20) NOT NULL comment '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL comment '姓名',
	age INT(11) NULL DEFAULT NULL comment '年龄',
	email VARCHAR(50) NULL DEFAULT NULL comment '邮箱',
	PRIMARY KEY (id)
);
