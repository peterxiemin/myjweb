# myjweb
##一、对mvc进行细粒度划分，文件目录如下，增加框架的层级和复用能力
- controllers
- actions
- models
- --- dao
- --- service
- --------   page
- --------   data
- library

##二、存储层方面
增加jdbctemplate封装，可以支持多个mysql操作
增加redistemplate封装，支持多redis操作
