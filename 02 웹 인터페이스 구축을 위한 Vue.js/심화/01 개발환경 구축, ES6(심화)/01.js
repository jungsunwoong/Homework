let obj1 = { name: '박문수', age: 29 };
let obj2 = obj1;
console.log(obj2);

obj2 = { ...obj1, email: 'mspark@gmail.com' };
console.log(obj2);
