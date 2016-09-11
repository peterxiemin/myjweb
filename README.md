# myjweb
##一、对mvc进行细粒度划分，文件目录如下，增加框架的层级和复用能力
- controler
- actions
- models
--  dao
  service
    page
    data
library

##二、增加jdbctemplate封装，可以支持多数据库多表的查询
