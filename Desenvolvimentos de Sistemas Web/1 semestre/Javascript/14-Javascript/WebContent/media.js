function calcular(){	
	 //var n1, n2, n3, nAm, nPs, media;
	
	 var n1 = parseFloat(nac1.value);
	 var n2 = parseFloat(nac2.value);
	 var n3 = parseFloat(nac20.value);
	 var nAm = parseFloat(am.value);
	 var nPs = parseFloat(ps.value);
	
	 if(n1 > n2){
	   	var media = ((n1+n3*2)/3)*0.2 + nAm*0.3 + nPs*0.5;
	   	mediaf.innerHTML = media;
	   	
	 }
	 else{
		var media = ((n2+n3*2)/3)*0.2 + nAm*0.3 + nPs*0.5;
		mediaf.innerHTML = media;
	 }	
}

function validar(tag){
	var flag = true;
	if(isNaN(tag.value)){
		tag.style.border = "1px solid red";
		flag = false;
		return flag;
	}
	else{
		tag.style.border = "1px solid black";
		flag = true;
		return flag;
	}
}