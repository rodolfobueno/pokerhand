package br.com.zgsolucoes.pokerhand.domain.checker;

import java.util.List;

import br.com.zgsolucoes.pokerhand.domain.Card;
import br.com.zgsolucoes.pokerhand.domain.Result;

public interface Checker {
	
	void setNext(Checker checker);
	
	Result check(List<Card> cardsHand, List<Card> cardsAnotherHand);

}
