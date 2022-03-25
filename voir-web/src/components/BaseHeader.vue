<template>
  <el-row>
    <el-col :span="12" style="text-align: left;padding-left: 50px;">
      <el-link :underline="false">HJX's Site</el-link>
    </el-col>
    <el-col :span="12" style="text-align: right;padding-right: 50px;">
      <el-space style="color: #161209;">
        <el-link :underline="false" class="head-font">Posts</el-link>
        <el-link :underline="false" class="head-font">Categories</el-link>
        <el-link :underline="false" class="head-font">Tags</el-link>
        <el-link :underline="false" class="head-font">About</el-link>
      </el-space>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: "BaseHeader"
}
</script>

<style scoped>
.el-link{
  color: #161209;
  font-size: 15px;
}
.head-font {
  padding-left: 10px;
}
</style>ZA