package br.com.zgsolucoes.pokerhand.domain.checker;

public class CheckersBuilder {
	
	public Checker build() {
		StraightFlushChecker straightFlushChecker = new StraightFlushChecker();
		RoyalFlushChecker royalFlushChecker = new RoyalFlushChecker();
		royalFlushChecker.setNext(straightFlushChecker);
		
		return royalFlushChecker;
	}

}
