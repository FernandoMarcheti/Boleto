
public abstract class BoletoBase {
	
	protected String vencimento;
	protected FechamentoFilter lancamentoFiltro;
	
	
	public void bind(BoletoFilter boletoFilter) {
		vencimento = boletoFilter.getDataVencimento();
		
		lancamentoFiltro = new FechamentoFilter();
		lancamentoFiltro.setPeriodoLancamentoInicio(boletoFilter.getDataInicio());
		lancamentoFiltro.setPeriodoLancamentoFimString(boletoFilter.getDataFim());
		lancamentoFiltro.setCodigoCliente(boletoFilter.getCodigoCliente());
	}
	
}
