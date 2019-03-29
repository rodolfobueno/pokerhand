package br.com.zgsolucoes.pokerhand.domain.checker;

public abstract class AbstractChecker implements Checker {

	private Checker next;

	@Override
	public void setNext(Checker checker) {
		next = checker;
	}

	public Checker getNextChecker() {
		return next;
	}

}
