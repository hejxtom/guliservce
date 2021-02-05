let age = 12
let name = 'Amy'

// 传统
let person1 = {
    age: age, 
    name: name
}
console.log(person1)

// ES6
let person2 = {
    age, 
    name
}
console.log(person2) //{age: 12, name: 'Amy'}