drop table if exists user;
create table user (
    id int(20) unsigned not null AUTO_INCREMENT,
    login_name varchar(50) not null comment '登录名',
    password varchar(500) not null  comment '密码',
    username varchar(100) not null comment '用户名',
    user_status varchar(5) not null default 'N' comment '用户状态：N-正常，F-冻结， D-注销',
    id_type varchar(8) comment '证件类型',
    id_no varchar(50) comment '证件号码',
    sex varchar(2) comment '性别',
    phone varchar(30) comment '电话号码',
    email varchar(100) comment '邮箱',
    address varchar(500) comment '地址',
    create_date varchar(50) comment '创建日期',
    update_date varchar(50) comment '更新日期',
    who_created varchar(50) comment '创建人',
    who_modified varchar(50) comment '修改人',
    primary key (id)
)engine = InnoDB charset=utf8;