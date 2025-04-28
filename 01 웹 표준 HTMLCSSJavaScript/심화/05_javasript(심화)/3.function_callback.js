function recall(callback) {
  //5회 반복합니다
  for (let i = 0; i < 5; i++) {
    callback();
  }
}

let callfun = function () {
  alert('함수 호출');
};

recall(callfun);
