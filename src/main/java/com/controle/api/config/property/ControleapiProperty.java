package com.controle.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("controle")
public class ControleapiProperty {
	
	private final Seguranca seguranca = new Seguranca();
	
	public Seguranca getSeguranca() {
		return seguranca;
	}
	
	public static class Seguranca {
		
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}		
		
	}
	
	private final Origem origem = new Origem();
	
	public Origem getOrigem() {
		return origem;
	}
	
	public static class Origem {
		
		private String origemPermitida;

		public String getOrigemPermitida() {
			return origemPermitida;
		}

		public void setOrigemPermitida(String origemPermitida) {
			this.origemPermitida = origemPermitida;
		}
	}

}
