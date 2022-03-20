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
    <el-col :span="19">
      main
    </el-col>
  </el-row>
<!--  <router-view/>-->
</template>

<script>
import BaseHeader from "@/components/BaseHeader";
import BaseAside from "@/components/BaseAside";

export default {
  name: "AdminLayout",
  components: {
    BaseHeader,
    BaseAside
  }
}
</script>

<style>

</style>
