<template>
  <div class="app-container">

    <!-- 课程信息表单 TODO -->

    <div style="text-align:center">
      <el-button :disabled="saveBtnDisabled" type="primary" @click="saveAndNext()">保存并下一步</el-button>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      saveBtnDisabled: false // 按钮是否禁用
    }
  },

  methods: {
    // 保存并下一步
    saveAndNext() {
      this.saveBtnDisabled = true
      this.$parent.active = 1
    }
  }
}
</script>
