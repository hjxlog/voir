<template>
  <el-row>
    <el-col :span="24">
      <BaseHeader/>
    </el-col>
  </el-row>
  <el-row>
    <el-col :span="3">
      <BaseAside/>
    </el-col>
    <el-col :span="21">
      <router-view style="flex: 1"/>
    </el-col>
  </el-row>
</template>

<script>
import BaseHeader from "@/components/BaseHeader";
import BaseAside from "@/components/BaseAside";
import Blog from "@/views/Blog";
import Category from "@/views/Category";

export default {
  name: "Layout",
  components: {
    BaseHeader,
    BaseAside,
    Blog,
    Category
  }
}
</script>

<style scoped>

</style>