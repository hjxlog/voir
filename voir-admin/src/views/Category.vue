<template>
  <!--  搜索框按钮区域-->
  <el-row style="padding-left: 10px;margin-top: 10px;margin-bottom: -20px;">
    <el-col :span="3" style="margin-right: -30px;">
      <el-button type="primary" @click="add">新增分类</el-button>
    </el-col>
    <el-col :span="21">
      <el-form :inline="true" class="demo-form-inline">
        <el-form-item style="margin-right: 10px;">
          <el-input v-model="name" placeholder="请输入分类名称..."/>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="load">搜索</el-button>
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
  <div style="padding: 10px;">
    <el-table :data="tableData"
              stripe border height="75vh"
              style="width: 100%">
      <el-table-column sortable prop="id" label="ID"/>
      <el-table-column prop="name" label="分类名称"/>
      <el-table-column fixed="right" label="Operations" width="120">
        <template #default = "categoryInfo">
          <el-button type="text" @click="handleEdit(categoryInfo.row)">编辑</el-button>
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
          v-model:currentPage="currentPage"
          v-model:page-size="pageSize"
          :page-sizes="[5, 10, 20, 50]"
          :small="small"
          :disabled="disabled"
          :background="background"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total"
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
      <el-form-item label="分类名称">
        <el-input v-model="form.name"/>
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
  name: "Category",
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
      request.post("/category/list", {
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
    handleEdit(row) {
      this.form = JSON.parse(JSON.stringify(row))
      this.dialogVisible = true
    },
    handleSizeChange(pageSize) {   // 改变当前每页的个数触发
      this.pageSize = pageSize
      this.load()
    },
    handleCurrentChange(pageNum) {  // 改变当前页码触发
      this.currentPage = pageNum
      this.load()
    },
    add() {
      this.dialogVisible = true
      // 把表单内容取消
      this.form = {}
    },
    save() {
      if(this.form.id){ // 更新
        // 请求返回之后，res操作
        request.post("/category/update", this.form).then(res => {
          if (res.code === '0') {
            this.$message({
              type: "success",
              message: "更新成功"
            })
          } else {
            this.$message({
              type: "error",
              message: res.msg
            })
          }
          // this.load() // 刷新表格的数据
          this.dialogVisible = false  // 关闭弹窗
        })
      }else{ // 新增
        // 请求返回之后，res操作
        request.post("/category/add", this.form).then(res => {
          if (res.code === '0') {
            this.$message({
              type: "success",
              message: "添加成功"
            })
          } else {
            this.$message({
              type: "error",
              message: res.msg
            })
          }
          // this.load() // 刷新表格的数据
          this.dialogVisible = false  // 关闭弹窗
        })
      }
    }
  }
}
</script>

<style scoped>

</style>