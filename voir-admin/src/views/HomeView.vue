<template>
  <!--  搜索框按钮区域-->
  <el-row style="padding-left: 10px;margin-top: 10px;margin-bottom: -20px;">
    <el-col :span="3" style="margin-right: -30px;">
      <el-button type="primary" @click="add">新增博客</el-button>
    </el-col>
    <el-col :span="21">
      <el-form :inline="true" class="demo-form-inline">
        <el-form-item style="margin-right: 10px;">
          <el-input v-model="input" placeholder="请输入博客标题..."/>
        </el-form-item>
        <el-form-item>
          <el-button type="primary">搜索</el-button>
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
  <div style="padding: 10px;">
    <el-table :data="tableData"
              stripe border height="75vh"
              style="width: 100%">
      <el-table-column sortable prop="id" label="ID"/>
      <el-table-column prop="title" label="标题"/>
      <el-table-column prop="content" label="内容"/>
      <el-table-column fixed="right" label="Operations" width="120">
        <template #default>
          <el-button type="text" @click="handleClick">编辑</el-button>
          <el-popconfirm title="确认删除？">
            <template #reference>
              <el-button type="text">删除</el-button>
            </template>
          </el-popconfirm>
        </template>
      </el-table-column>
    </el-table>
  </div>
  <div style="padding-left: 10px;">
    <div class="demo-pagination-block">
      <el-pagination
          v-model:currentPage="currentPage4"
          v-model:page-size="pageSize4"
          :page-sizes="[5, 10, 20, 50]"
          :small="small"
          :disabled="disabled"
          :background="background"
          layout="total, sizes, prev, pager, next, jumper"
          :total="100"
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
      />
    </div>
  </div>

  <el-dialog
      v-model="dialogVisible"
      title="Tips"
      width="30%"
  >
    <el-form :model="form" label-width="120px">
      <el-form-item label="博客标题">
        <el-input v-model="form.title"/>
      </el-form-item>
      <el-form-item label="博客分类">
        <el-select v-model="form.categoryId" placeholder="请选择分类">
          <el-option label="Java" value="Java"/>
          <el-option label="Spring" value="Spring"/>
        </el-select>
      </el-form-item>
      <el-form-item label="博客内容">
        <el-input v-model="form.content" type="textarea"/>
      </el-form-item>
    </el-form>
    <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogVisible = false">取消</el-button>
        <el-button type="primary" @click="save">确定</el-button>
      </span>
    </template>
  </el-dialog>

</template>

<script>
import request from "@/utils/request";

export default {
  name: "HomeView",
  data() {
    return {
      form: {},
      dialogVisible: false,
      tableData: [
        {
          id: 1,
          title: "学习mybatis",
          content: "内容"
        }
      ]
    }
  },
  methods: {
    add() {
      this.dialogVisible = true
      // 把表单内容取消
      this.form = {}
    },
    save(){
      // 请求返回之后，res操作
      request.post("/blog/add",this.form).then(res => {
        console.log(res)
      })
    }
  }
}
</script>
<script lang="ts" setup>

</script>

<style scoped>
</style>