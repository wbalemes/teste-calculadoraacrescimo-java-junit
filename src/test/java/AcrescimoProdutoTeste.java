import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calcularacrescimo.AcrescimoProduto;

class AcrescimoProdutoTeste {

	@Test
	void acrescimo10() {
		AcrescimoProduto acrescimo = new AcrescimoProduto();
		
		double valorOriginal = 50;
		double novoValor = acrescimo.acrescimo10(valorOriginal);
	
		assertEquals(55,00 , novoValor);
	}

}
