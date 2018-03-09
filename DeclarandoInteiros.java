package Unipezinha;

import java.math.BigDecimal;

public class DeclarandoInteiros {
	
	public static void main(String[] args) {
		byte valor = 127;
		int valorInt = 1;
		short valorPequeno = -20;
		long grande = 123455;
		long outroValor = 123456663345l;
		float preco = 3.34F;
		double medida = 12342.45566;
		
		
		valorInt = valor;
		valor = (byte)valorInt;

		char caracter = 'Y';
		char unicode = '\u0059';		
		
		System.out.println(unicode); 
		
		
		BigDecimal valorUm = new BigDecimal("10.7");
		BigDecimal valorDois = new BigDecimal("7.5");
		
		System.out.println(valorUm.add(valorDois));
		
	
	}
		

}
