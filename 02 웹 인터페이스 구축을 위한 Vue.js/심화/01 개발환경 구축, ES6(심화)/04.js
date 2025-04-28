let p = new Promise((resolve, reject) => {
  resolve(console.log('first!'));
});

p.then((msg) => {
  msg = 'second';
  console.log(msg);
})
  .then((msg) => {
    msg = 'third';
    console.log(msg);
  })

  .catch((error) => {
    console.log('오류 발생 ==> ' + error);
  });
