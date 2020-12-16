package br.edu.infnet.appCoCorretora.model.exception;

@SuppressWarnings("serial")
public class LoteInvalidoException extends Exception {
	
		public LoteInvalidoException(String mensagem) {
			super(mensagem);
		}
}