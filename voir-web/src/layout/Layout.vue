<template>
  <el-row style="height: 60px;line-height: 60px;">
    <el-col :span="24">
      <BaseHeader/>
    </el-col>
  </el-row>
  <el-row style="min-height: calc(100vh - 120px)">
    <el-col :span="24">
      <BaseMain/>
    </el-col>
  </el-row>
  <el-row style="height: 60px;line-height: 60px;">
    <el-col :span="24">
      <BaseFooter/>
    </el-col>
  </el-row>
</template>

<script>
import BaseHeader from "@/components/BaseHeader";
import BaseFooter from "@/components/BaseFooter";
import BaseMain from "@/components/BaseMain";

export default {
  name: "Layout",
  components: {
    BaseHeader,
    BaseFooter,
    BaseMain
  }
}
</script>

<style scoped>

</style>