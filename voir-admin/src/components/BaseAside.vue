<template>
  <el-row class="tac">
    <el-col :span="24">
      <el-menu
          default-active="2"
          class="el-menu-vertical-demo"
          style="min-height: calc(100vh - 60px)"
      >
        <el-sub-menu index="1">
          <template #title>
            <el-icon><notebook /></el-icon>
            <span>博客管理</span>
          </template>
          <el-menu-item index="1-1">内容管理</el-menu-item>
          <el-menu-item index="1-2">评论管理</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="2">
          <template #title>
            <el-icon><management /></el-icon>
            <span>归类管理</span>
          </template>
          <el-menu-item index="2-1">分类管理</el-menu-item>
          <el-menu-item index="2-2">标签管理</el-menu-item>
        </el-sub-menu>
      </el-menu>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: "BaseAside"
}
</script>

<style scoped>
.el-sub-menu .el-menu-item{
  min-width: 0px;
}
</style>