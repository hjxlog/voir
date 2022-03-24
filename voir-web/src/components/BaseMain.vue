<template>
  <el-row>
    <el-col :span="24">
      <el-image :src="url" />
    </el-col>
  </el-row>

</template>

<script>
export default {
  name: "BaseMain",
  data(){
    return{
      url: 'avatar.jpg'
    }
  }
}
</script>

<style scoped>
.el-link {
  color: #161209;
  font-size: 15px;
}

.head-font {
  padding-left: 10px;
}
</style>