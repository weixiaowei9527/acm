function runtime(startTime) {
	var endTime = new Date(startTime);
	var nowTime = new Date();
	var t = nowTime.getTime() - endTime.getTime();

	var d = Math.floor(t / 1000 / 60 / 60 / 24);
	var h = Math.floor(t / 1000 / 60 / 60 % 24);
	var m = Math.floor(t / 1000 / 60 % 60);
	var s = Math.floor(t / 1000 % 60);
	var month = Math.ceil(d / 30);
	var year = Math.ceil(d / 365);

	document.getElementById("t_d").innerHTML = d;
	document.getElementById("t_h").innerHTML = h;
	document.getElementById("t_m").innerHTML = m;
	document.getElementById("t_s").innerHTML = s;
	document.getElementById("t_month").innerHTML = month;
	document.getElementById("t_year").innerHTML = year;
}
setInterval("runtime('2018/11/2 12:00:00')", 1000);
