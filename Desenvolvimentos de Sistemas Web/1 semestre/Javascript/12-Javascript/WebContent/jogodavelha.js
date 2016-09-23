var jogada = "X";

function jogar (celula, texto){
	if (celula.innerHTML != "") {
		alert("Jogada inválida!");
	}
	else{
	   if (jogada == "X"){
	      celula.innerHTML = "X";
	      celula.style.backgroundColor = "black";
	      jogada = "O";
	      texto.innerHTML = "Próximo jogador: " + jogada;
	   }
	   else {
		   celula.innerHTML = "O";
		   celula.style.backgroundColor = "blue";
		   celula.style.color = "orange";
		   jogada = "X";
		   texto.innerHTML = "Próximo jogador: " + jogada;
	   }
	}
	if (c11.innerHTML == c12.innerHTML && c12.innerHTML == c13.innerHTML && c11.innerHTML.innerHTML == c13.innerHTML && c11.innerHTML != "" && c12.innerHTML != "" && c13.innerHTML != ""){
		alert("Vencedor: " + c11.innerHTML);
	}
	else if (c21.innerHTML == c22.innerHTML && c22.innerHTML && c23.innerHTML && c21.innerHTML != "" && c22.innerHTML != ""){
		alert("Vencedor: " + c21.innerHTML);
	}
	else if (c31.innerHTML == c32.innerHTML && c32.innerHTML == c33.innerHTML && c31.innerHTML != "" && c32.innerHTML != ""){
		alert("Vencedor: " + c31.innerHTML);
	}
	else if (c11.innerHTML == c22.innerHTML && c22.innerHTML == c33.innerHTML && c11.innerHTML != "" && c22.innerHTML != ""){
		alert("Vencedor: " + c11.innerHTML);
	}
	else if (c13.innerHTML == c22.innerHTML && c22.innerHTML == c31.innerHTML && c13.innerHTML != "" && c22.innerHTML != ""){
		alert("Vencedor: " + c13.innerHTML);
	}
	else if (c11.innerHTML == c21.innerHTML && c21.innerHTML == c31.innerHTML && c11.innerHTML != "" && c21.innerHTML != ""){
		alert("Vencedor: " + c11.innerHTML);
	}
	else if (c12.innerHTML == c22.innerHTML && c22.innerHTML == c32.innerHTML && c12.innerHTML != "" && c22 != ""){
		alert("Vencedor: " + c12.innerHTML);
	}
	else if (c13.innerHTML == c23.innerHTML && c23.innerHTML == c33.innerHTML && c13.innerHTML != "" && c23.innerHTML != ""){
		alert("Vencedor: " + c13.innerHTML);
	}
	
}
