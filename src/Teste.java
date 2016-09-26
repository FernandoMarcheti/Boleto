
public class Teste {

	public static void main(String[] args) {
		Boleto boletoSantander = TipoBoleto.SANTANDER.getTipoBoleto();
		BoletoFilter filtro = new BoletoFilter();
		filtro.setCodigoBoleto(33);
		filtro.setCodigoCliente(10);
		filtro.setDataFim("10/10/2016");
		filtro.setDataInicio("05/10/2016");
		filtro.setDataVencimento("05/11/2016");
		filtro.setDecimoTerceiro(false);
		filtro.setObservacao("Obs");
		filtro.setParcelaUm(false);
		filtro.setValorParcela(0);
		
		String teste = boletoSantander.gerarBoleto(filtro);
		System.out.println(teste);
	}

}
