
public class SantanderDecimoTerceiro extends BoletoBase implements Boleto {

	@Override
	public String gerarBoleto(BoletoFilter boletoFilter) {
		String boletos = GerarBoletosDecimoTerceiro(boletoFilter);
		return null;
	}
	
	private String GerarBoletosDecimoTerceiro(BoletoFilter boletoFilter)
    {
		
        String retorno = "";
//        var clienteDecimoTerceiro = _clienteData.ConsultaClienteDecimoTerceiro();
//
//        foreach (var item in clienteDecimoTerceiro)
//        {
//            var dadosBoleto = new BoletoFilter
//            {
//                Codigo = boletoFilter.Codigo,
//                CodigoCliente = item.Codigo,
//                DataFim = boletoFilter.DataFim,
//                DataInicio = boletoFilter.DataInicio,
//                DataVencimento = boletoFilter.DataVencimento,
//                IsDecimoTerceiro = boletoFilter.IsDecimoTerceiro,
//                Observacao = boletoFilter.Observacao,
//                IsParcelaUm = boletoFilter.IsParcelaUm,
//                ValorParcela = boletoFilter.ValorParcela
//            };
//
//            if (boletoFilter.Codigo == (short)EnumTipoBanco.Sicoob)
//                retorno += SicoobDecimoTerceiro(dadosBoleto); 
//            else
//                retorno += SantanderDecimoTerceiro(dadosBoleto);
//        }
        return retorno;
    }
}
