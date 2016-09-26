
public enum TipoBoleto {

	SANTANDER {
		@Override
		public Boleto getTipoBoleto() {
			return new Santander();
		}
	},
	SANTANDER_DECIMO_TERCEIRO {
		@Override
		public Boleto getTipoBoleto() {
			return null;
		}
	},
	SICOOB {
		@Override
		public Boleto getTipoBoleto() {
			return null;
		}
	},
	SICOOB_DECIMO_TERCEIRO {
		@Override
		public Boleto getTipoBoleto() {
			return null;
		}
	};
	
	public abstract Boleto getTipoBoleto();
}
