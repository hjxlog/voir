<template>
  <el-row>
    <el-col :span="12">
      <el-link :underline="false">HJX's Site</el-link>
    </el-col>
    <el-col :span="12">
      <el-space size="large">
      <el-link :underline="false">Posts</el-link>
      <el-link :underline="false">Categories</el-link>
      <el-link :underline="false">Tags</el-link>
      <el-link :underline="false">About</el-link>
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

</style>