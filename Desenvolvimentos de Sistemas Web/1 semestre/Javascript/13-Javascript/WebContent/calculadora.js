function calcular(){
	//Recuperar a operação
	var op = document.getElementById("operacao").value;
	//var op = operacao.value;
	//Recuperar os valores dos campos númericos
	var numero1 = parseFloat(n1.value);
	var numero2 = parseFloat(n2.value);
	//Validar a operação e realiza-la
	var estaBlz = true;
	if(isNaN(n1.value)){
		n1.style.border = "1px red solid";
		erro.innerHTML = "Número inválido!";
		estaBlz = false;
	}
	else{
		n1.style.border = "1px silver solid";
		erro.innerHTML = "";
	}
	if(isNaN(n2.value)){
		n2.style.border = "1px red solid";
		erro.innerHTML = "Número inválido!";
		estaBlz = false;
	}
	else {
		n2.style.border = "1px silver solid";
		erro.innerHTML = "";
	}
	if(estaBlz == false){
		return;
	}
	
//	switch(op){
//		case "0":
//		
//		break;
//		case "1":
//			
//		break;
//		default:
//	}
	var resultado;
	if (op == "0"){ //Soma
		resultado = numero1 + numero2;
	}else if (op == "1"){//Subtração
		resultado = numero1 - numero2;
	}else if (op == "3"){//Multiplicação
		resultado = numero1 * numero2; 
	}else if (op == "2"){//Divisão
		resultado = numero1 / numero2;
	}
	//Exibir o resultado
	resposta.value = resultado;
}
function validar (clic){
	if(isNaN(clic.value)){
		clic.style.border = "1px solid red";
	}
	else{
		clic.style.border = "1px solid silver";
	}
}