
public class BoletoFilter {

	private int codigoBoleto;
	private String observacao;
	private String dataVencimento;
	private int codigoCliente;
	private String dataInicio;
	private String dataFim;
	private boolean isDecimoTerceiro;
	private boolean isParcelaUm;
	private double valorParcela;
	
	public int getCodigoBoleto() {
		return codigoBoleto;
	}
	public void setCodigoBoleto(int codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public boolean isDecimoTerceiro() {
		return isDecimoTerceiro;
	}
	public void setDecimoTerceiro(boolean isDecimoTerceiro) {
		this.isDecimoTerceiro = isDecimoTerceiro;
	}
	public boolean isParcelaUm() {
		return isParcelaUm;
	}
	public void setParcelaUm(boolean isParcelaUm) {
		this.isParcelaUm = isParcelaUm;
	}
	public double getValorParcela() {
		return valorParcela;
	}
	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	
}
