import request from '~/utils/request'
export default {

  getList(searchObj) {
    return request({
      url: '/api/edu/course/list',
      method: 'get',
      params: searchObj
    })
  },
  getSubjectNestedList() {
    return request({
      url: '/api/edu/subject/nested-list',
      method: 'get'
    })
  }
}
