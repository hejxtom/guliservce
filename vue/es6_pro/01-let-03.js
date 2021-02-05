// var 会变量提升
// let 不存在变量提升
console.log(x)  //undefined
var x = 'apple'
console.log(x)
// console.log(y)  //ReferenceError: y is not defined
// let y = 'banana'