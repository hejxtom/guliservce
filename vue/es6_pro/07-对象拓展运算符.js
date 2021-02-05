let person = {name: 'Amy', age: 15}
// let someone = person //引用赋值
let someone = { ...person } //对象拷贝
someone.name = 'Helen' 
console.log(person)  //{name: 'Amy', age: 15}
console.log(someone)  //{name: 'Helen', age: 15}