<template>
  <el-row >
    <el-col :span="24" style="text-align: center;">
      <img
          style="width: 128px;height: auto;border-radius: 100%;"
          alt="Vue logo" src="../assets/images/avatar.jpg">
      <div class="nickname">Huang Jianxian</div>
      <div>If you wait, all that happens is you getting older.</div>
      <div style="margin-top: 15px;">
        <el-space style="color: #161209;">
          <el-link :underline="false" class="head-font">CSDN</el-link>
          <el-link :underline="false" class="head-font">Weibo</el-link>
          <el-link :underline="false" class="head-font">Gmail</el-link>
          <el-link :underline="false" class="head-font">GitHub</el-link>
        </el-space>
      </div>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: "BaseMain",
  data() {
    return {
      url: 'avatar.jpg'
    }
  }
}
</script>

<style scoped>
.head-font {
  padding-left: 10px;
}

.nickname {
  font-size: 2em;
  font-weight: normal;
}
</style>