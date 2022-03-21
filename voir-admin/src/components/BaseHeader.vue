<template>
  <el-menu
      :default-active="activeIndex"
      class="el-menu-demo"
      mode="horizontal"
      style=" justify-content:space-between;"
      @select="handleSelect"
  >
    <el-menu-item index="1" style="font-weight: bold; color: dodgerblue;">Voir后台管理系统</el-menu-item>
    <el-sub-menu index="2" style="margin-right: 0px;">
      <template #title>
        <el-icon><user-filled /></el-icon>
        管理员
      </template>
      <el-menu-item index="2-1">个人信息</el-menu-item>
      <el-menu-item index="2-2">退出登录</el-menu-item>
    </el-sub-menu>
  </el-menu>
</template>

<script>
export default {
  name: "BaseHeader"
}
</script>

<style scoped>

</style>