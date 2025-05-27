function showTime() {
	document.getElementById('currentTime').innerHTML = new Date().toUTCString();
}
showTime();
setInterval(function () {
	showTime();
}, 1000);

function calculateArea() {
  area = parseInt(document.getElementById('len').value)*parseInt(document.getElementById('wid').value);
  document.getElementById('areaRec').innerHTML = area;
  console.log(area);
}