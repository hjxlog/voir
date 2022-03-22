<template>
  <div class="common-layout">
    <el-container>
      <el-aside width="200px">
        <BaseAside/>
      </el-aside>
      <el-container>
        <el-header style="padding: 0">
          <BaseHeader/>
        </el-header>
        <el-main>Main</el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import BaseHeader from "@/components/BaseHeader";
import BaseAside from "@/components/BaseAside";

export default {
  name: "Layout",
  components: {
    BaseHeader,
    BaseAside
  }
}
</script>

<style scoped>

</style>