<template>
  <div class="common-layout">
    <el-container>
      <el-header>
        <BaseHeader/>
      </el-header>
      <el-main>Main</el-main>
      <el-footer>
        <BaseFooter/>
      </el-footer>
    </el-container>
  </div>
</template>

<script>
import BaseHeader from "@/components/BaseHeader";
import BaseFooter from "@/components/BaseFooter";

export default {
  name: "Layout",
  components:{
    BaseHeader,
    BaseFooter
  }
}
</script>

<style scoped>

</style>