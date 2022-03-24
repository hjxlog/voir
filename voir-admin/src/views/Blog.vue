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
      <el-table-column type="index" width="100" label="序号"/>
      <el-table-column v-if="false" prop="id" label="ID"/>
      <el-table-column prop="title" label="标题"/>
      <el-table-column prop="category.name" label="分类"/>
<!--      <el-table-column prop="tagList" label="分类"/>-->
      <el-table-column fixed="right" label="操作" width="120">
        <template #default = "blogInfo">
          <el-button type="text" @click="handleClick">查看</el-button>
          <el-button type="text" @click="handleClick">编辑</el-button>
          <el-popconfirm title="确认删除？" @confirm="handleDelete(categoryInfo.row.id)">
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
          <el-option label="Java" value="1"/>
          <el-option label="Spring" value="2"/>
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
  name: "Blog",
  data() {
    return {
      form: {},
      dialogVisible: false,
      name: '',
      currentPage: 1,
      pageSize: 10,
      total: 0,
      tableData: []
    }
  },
  created() {
    this.load()
  },
  methods: {
    load() {
      this.loading = true
      request.post("/blog/list", {
        pageNum: this.currentPage,
        pageSize: this.pageSize,
        name: this.name
      }).then(res => {
        console.log(res)
        // this.loading = false
        this.tableData = res.body.data
        this.total = res.body.total
      })
    },
    add() {
      this.dialogVisible = true
      // 把表单内容取消
      this.form = {}
    },
    save() {
      // 请求返回之后，res操作
      request.post("/blog/add", this.form).then(res => {
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