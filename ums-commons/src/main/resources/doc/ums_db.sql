drop database if exists ums_db;
create database ums_db character set 'utf8mb4';
use ums_db;

drop table if exists sys_user;
create table sys_user(
    user_id int (10) not null auto_increment comment '用户主键',
    username varchar(255) not null comment '用户姓名',
    cellphone varchar(100) not null comment '手机号码',
    password varchar(500) not null comment '登录密码',
    gender varchar(10) not null comment '性别：M-男，F-女',
    email varchar(500) comment '电子邮件',
    birthday date comment '出生日期',
    create_time timestamp not null default current_timestamp comment '添加时间',
    update_time timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key(user_id)
)Engine=InnoDB charset='utf8mb4' comment='用户信息表';