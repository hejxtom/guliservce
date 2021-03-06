import axios from 'axios'
import { Message } from 'element-ui'
import cookie from 'js-cookie'
// 创建axios实例
const service = axios.create({
  baseURL: 'http://localhost:8110',
  timeout: 12000 // 请求超时时间
})

// （request）请求拦截器
service.interceptors.request.use(
  config => {
    // debugger
    if (cookie.get('guli_jwt_token')) { // 如果cookie中包含guli_jwt_token
      // 则发送后端api请求的时候携带token
      config.headers['token'] = cookie.get('guli_jwt_token')
    }
    return config
  },
  error => {
    return Promise.reject(error)
  }
)

// response 拦截器
service.interceptors.response.use(
  response => {
    /**
       * code为非20000是抛错 可结合自己业务进行修改
       */
    const res = response.data
    if (res.code === 20000) { // 成功
      return response.data
    } else if (res.code === 23004) { // 获取用户信息失败
      // 清除cookie
      cookie.set('guli_jwt_token', '', { domain: 'localhost' })
      return response.data // 不显示错误信息
    } else {
      Message({
        message: res.message,
        type: 'error',
        duration: 5 * 1000
      })
      return Promise.reject('error')
    }
  },
  error => {
    console.log('err：' + error) // for debug
    Message({
      message: error.message,
      type: 'error',
      duration: 5 * 1000
    })
    return Promise.reject(error)
  }
)

export default service
