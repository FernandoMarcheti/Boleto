
public class Santander extends BoletoBase implements Boleto {

	
	@Override
	public String gerarBoleto(BoletoFilter boletoFilter) {
		
		//BoletoBancario.CodigoBanco = (short)EnumTipoBanco.Santander;

		bind(boletoFilter);
		
		return "Santander\n" + vencimento + "\n" + lancamentoFiltro.getCodigoCliente() + "\n"
				+ lancamentoFiltro.getPeriodoLancamentoFimString() + "\n" + lancamentoFiltro.getPeriodoLancamentoInicio();
	}

}
