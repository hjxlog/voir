/*
 Navicat Premium Data Transfer

 Source Server         : pgsql-localhost
 Source Server Type    : PostgreSQL
 Source Server Version : 130003
 Source Host           : localhost:5432
 Source Catalog        : voir
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 130003
 File Encoding         : 65001

 Date: 19/03/2022 13:58:57
*/

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS "public"."blog";
CREATE TABLE "public"."blog" (
  "id" serial,
  "title" varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
  "content" text COLLATE "pg_catalog"."default" NOT NULL,
  "category_id" int4 NOT NULL,
  "create_time" timestamptz(6) NOT NULL,
  "update_time" timestamptz(6) NOT NULL
)
;
COMMENT ON COLUMN "public"."blog"."id" IS '主键id';
COMMENT ON COLUMN "public"."blog"."title" IS '文章标题';
COMMENT ON COLUMN "public"."blog"."content" IS '文章内容';
COMMENT ON COLUMN "public"."blog"."category_id" IS '分类id';
COMMENT ON COLUMN "public"."blog"."create_time" IS '创建时间';
COMMENT ON COLUMN "public"."blog"."update_time" IS '更新时间';

-- ----------------------------
-- Table structure for blog_tag
-- ----------------------------
DROP TABLE IF EXISTS "public"."blog_tag";
CREATE TABLE "public"."blog_tag" (
  "blog_id" int4 NOT NULL,
  "tag_id" int4 NOT NULL
)
;
COMMENT ON COLUMN "public"."blog_tag"."blog_id" IS '博客id';
COMMENT ON COLUMN "public"."blog_tag"."tag_id" IS '标签id';

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS "public"."category";
CREATE TABLE "public"."category" (
  "id" serial,
  "name" varchar(20) COLLATE "pg_catalog"."default" NOT NULL,
  "create_time" timestamptz(6) NOT NULL,
  "update_time" timestamptz(6) NOT NULL
)
;
COMMENT ON COLUMN "public"."category"."id" IS '主键id';
COMMENT ON COLUMN "public"."category"."name" IS '分类名称';
COMMENT ON COLUMN "public"."category"."create_time" IS '创建时间';
COMMENT ON COLUMN "public"."category"."update_time" IS '更新时间';

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS "public"."tag";
CREATE TABLE "public"."tag" (
  "id" serial,
  "name" varchar(20) COLLATE "pg_catalog"."default" NOT NULL,
  "create_time" timestamptz(6) NOT NULL,
  "update_time" timestamptz(6) NOT NULL
)
;
COMMENT ON COLUMN "public"."tag"."id" IS '主键id';
COMMENT ON COLUMN "public"."tag"."name" IS '标签名称';
COMMENT ON COLUMN "public"."tag"."create_time" IS '创建时间';
COMMENT ON COLUMN "public"."tag"."update_time" IS '更新时间';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS "public"."user";
CREATE TABLE "public"."user" (
  "id" serial,
  "user_name" varchar(20) COLLATE "pg_catalog"."default" NOT NULL,
  "password" varchar(50) COLLATE "pg_catalog"."default" NOT NULL,
  "create_time" timestamptz(6) NOT NULL,
  "update_time" timestamptz(6) NOT NULL
)
;
COMMENT ON COLUMN "public"."user"."id" IS '主键id';
COMMENT ON COLUMN "public"."user"."user_name" IS '用户名';
COMMENT ON COLUMN "public"."user"."password" IS '密码';
COMMENT ON COLUMN "public"."user"."create_time" IS '创建时间';
COMMENT ON COLUMN "public"."user"."update_time" IS '更新时间';

-- ----------------------------
-- Primary Key structure for table blog
-- ----------------------------
ALTER TABLE "public"."blog" ADD CONSTRAINT "blog_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table blog_tag
-- ----------------------------
ALTER TABLE "public"."blog_tag" ADD CONSTRAINT "blog_tag_pkey" PRIMARY KEY ("blog_id", "tag_id");

-- ----------------------------
-- Primary Key structure for table category
-- ----------------------------
ALTER TABLE "public"."category" ADD CONSTRAINT "category_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table tag
-- ----------------------------
ALTER TABLE "public"."tag" ADD CONSTRAINT "category_copy1_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table user
-- ----------------------------
ALTER TABLE "public"."user" ADD CONSTRAINT "category_copy1_pkey1" PRIMARY KEY ("id");
