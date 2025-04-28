let date = new Date();
let hour = date.getHours();
hour = 24;

if (hour >= 5 && hour < 7) {
  alert('준비');
} else if (hour >= 7 && hour < 9) {
  alert('출근');
} else if (hour >= 9 && hour < 12) {
  alert('빈둥 빈둥');
} else if (hour >= 12 && hour < 14) {
  alert('빈둥 빈둥');
} else if (hour >= 14 && hour < 24) {
  alert('여러 가지 업무를 수행합니다');
} else {
  alert('잠을 자렴');
}
