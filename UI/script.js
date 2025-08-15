function showTime() {
	document.getElementById('currentTime').innerHTML = new Date().toUTCString();
}
showTime();
setInterval(function () {
	showTime();
}, 1000);

function calculateArea() {
  function rectangle() {
    area = parseInt(document.getElementById('len').value)*parseInt(document.getElementById('wid').value);
    document.getElementById('areaRec').innerHTML = "Area of the Rectangle is: "+area;
    console.log(area);
  }
  rectangle();
  function triangleRight() {
    area = parseInt(document.getElementById('len').value)*parseInt(document.getElementById('wid').value)*0.5;
    document.getElementById('areaTri').innerHTML = "Area of the Triangle is: "+area;
    console.log(area);
  }
  triangleRight();
}

function maxSum(nums) {
  let sum = 0;
  let nl = []
  let unique = [...new Set(nums)].sort((a, b) => b - a);
  for (let i=0; i<=unique.length; i++) {
      sum+=i;
      nl.push(sum);
  }
  return Math.max(...nl);
}