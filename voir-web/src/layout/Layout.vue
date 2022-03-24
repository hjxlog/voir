<template>
  <div class="common-layout">
    <el-container>
      <el-header>
        <BaseHeader/>
      </el-header>
      <el-main>
        <BaseMain/>
      </el-main>
      <el-footer>
        <BaseFooter/>
      </el-footer>
    </el-container>
  </div>
</template>

<script>
import BaseHeader from "@/components/BaseHeader";
import BaseFooter from "@/components/BaseFooter";
import BaseMain from "@/components/BaseMain";

export default {
  name: "Layout",
  components:{
    BaseHeader,
    BaseFooter,
    BaseMain
  }
}
</script>

<style scoped>

</style>