# 基于ssm的仓库管理系统
- 前端虽为为jsp,但只使用了${pageContext.request.contextPath}
- 前端ui为layui
- 使用少量ajax,是前后端分离项目

# 项目需求
基本模块要求如下：

- 1）登陆功能
功能描述：实现用户登录。
要求：需执行数据库连接，能根据用户名、密码判断是否为合法用户，登陆
成功跳转到主页面，登陆失败能弹出对话框提示。

- 2）主页面设计
功能描述：登陆后将跳转到主页面，主页面上显示各功能页面的链接，点击
后进入相应功能页面。

- 3）商品基本信息维护功能
功能描述：能实现商品基本信息的添加、更新、删除和按照商品名称进行查
询。
商品查询：能按照商品编号、商品名称执行模糊查询及复合 sql 语句（多表关联查询、多条件查询等），显示模糊查询结果。
商品修改/删除：对选中的商品信息，点击修改按钮后能保存到数据库，并刷新页面；或点击删除按钮后，能删除数据库中相应记录，并刷新页面显示。

- 4）入库作业
功能描述：包括入库信息的添加与更新，查询与删除。

- 5）出库作业
功能描述：包括入库信息的添加与更新，查询与删除。


- 6）商品全程跟踪
对每批商品进行出入库跟踪，要能够查询每批商品对应的各次出库记录及库存变化。

# 项目截图
![QQ截图20220712161549](https://user-images.githubusercontent.com/91519206/178444097-4ef2c143-676d-4a8c-878b-54aa560b6bb4.png)
![QQ截图20220712161607](https://user-images.githubusercontent.com/91519206/178444111-6ec2d44c-3942-4c9c-a83d-8409028e73d2.png)
![QQ截图20220712161623](https://user-images.githubusercontent.com/91519206/178444118-585e2e3e-a6bc-4781-8772-085136c246ff.png)
![QQ截图20220712161648](https://user-images.githubusercontent.com/91519206/178444129-7b5a8c6c-6d2e-4444-b688-10aa755f97b9.png)
![QQ截图20220712161704](https://user-images.githubusercontent.com/91519206/178444135-a38ffa6d-591c-43aa-a5ac-a73c27e4594b.png)
![QQ截图20220712161717](https://user-images.githubusercontent.com/91519206/178444145-bf505306-0cdf-491c-aa36-e581b6ce3579.png)
![QQ截图20220712161727](https://user-images.githubusercontent.com/91519206/178444151-045a91e5-b507-4e31-98be-006087805365.png)
![QQ截图20220712161740](https://user-images.githubusercontent.com/91519206/178444157-51b475cf-730d-409c-9c8f-e0397d465dfe.png)
![QQ截图20220712161754](https://user-images.githubusercontent.com/91519206/178444162-b3f05829-9ad2-45d7-8371-b1f577f367b6.png)

# 数据库
/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : warehouse_management_system

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2022-07-12 16:28:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminId` varchar(255) NOT NULL,
  `adminPwd` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '1');

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `comId` varchar(255) NOT NULL,
  `comName` varchar(255) NOT NULL,
  `comNum` varchar(255) NOT NULL,
  `comKind` varchar(255) NOT NULL,
  `fragile` varchar(255) NOT NULL,
  `comTime` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('2', '2', '10', '服装', '是', '2022-07-08');
INSERT INTO `commodity` VALUES ('5', '5', '5', '服装', '是', '2022-07-08');
INSERT INTO `commodity` VALUES ('数量2', '1', '1', '1', '1', '1');
INSERT INTO `commodity` VALUES ('101', '1', '1', '服装', '是', '2022-07-08');
INSERT INTO `commodity` VALUES ('10', '10', '10', '服装', '是', '2022-07-08');
INSERT INTO `commodity` VALUES ('123', 'ces', '10', '服装', '否', '2022-07-08');
INSERT INTO `commodity` VALUES ('100', '1', '50', '服装', '是', '2022-07-08');
INSERT INTO `commodity` VALUES ('101', '101', '101', '服装', '是', '2022-07-08');
INSERT INTO `commodity` VALUES ('12346', '妮妮', '2', '玩具', '是', '2022-07-09');

-- ----------------------------
-- Table structure for ex
-- ----------------------------
DROP TABLE IF EXISTS `ex`;
CREATE TABLE `ex` (
  `exId` int NOT NULL AUTO_INCREMENT,
  `comId` varchar(255) NOT NULL,
  `exTime` varchar(255) NOT NULL,
  `exNum` int NOT NULL,
  PRIMARY KEY (`exId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ex
-- ----------------------------
INSERT INTO `ex` VALUES ('1', '2', '2', '2');
INSERT INTO `ex` VALUES ('2', '2', '2', '2');
INSERT INTO `ex` VALUES ('3', '2', '2', '2');
INSERT INTO `ex` VALUES ('4', '2', '2022-07-08', '1');
INSERT INTO `ex` VALUES ('5', '2', '2022-07-08', '2');
INSERT INTO `ex` VALUES ('6', '123', '2022-07-08', '1');
INSERT INTO `ex` VALUES ('7', '101', '2022-07-08', '1');
INSERT INTO `ex` VALUES ('8', '123', '2022-07-09', '4');
INSERT INTO `ex` VALUES ('9', '123', '2022-07-09', '4');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `userName` varchar(255) NOT NULL,
  `userSex` varchar(255) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', '4', '女');
INSERT INTO `user` VALUES ('3', '3', '女');
INSERT INTO `user` VALUES ('4', '4', '女');
INSERT INTO `user` VALUES ('5', '5', '女');
INSERT INTO `user` VALUES ('8', '8', '女');


