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
