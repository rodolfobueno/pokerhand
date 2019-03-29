package br.com.zgsolucoes.pokerhand.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.zgsolucoes.pokerhand.domain.checker.CheckersBuilder;
import br.com.zgsolucoes.pokerhand.domain.validator.PokerHandValidator;
import br.com.zgsolucoes.pokerhand.domain.validator.Validator;

public class PokerHand {
	private String cards;

	public PokerHand(String cards) {
		super();
		this.cards = cards;
	}

	public Result compareWith(PokerHand anotherHand) {
		Validator<String> validator = new PokerHandValidator();
		validator.check(this.cards);
		validator.check(anotherHand.getCards());

		List<String> cards = Arrays.asList(this.cards.split(" "));
		List<String> anotherCards = Arrays.asList(anotherHand.getCards().split(" "));
		
		List<Card> cardsHand = cards.stream()
			.map(c -> {
				Integer indexInital = (c.length() == 3) ? 2 : 1;
				return new Card(CardNumber.get(c.substring(0, c.length() - 1)), CardType.valueOf(c.substring(indexInital, c.length())));
			}).
			collect(Collectors.toList());
		
		List<Card> cardsAnotherHand = anotherCards.stream()
				.map(c -> {
					Integer indexInital = (c.length() == 3) ? 2 : 1;
					return new Card(CardNumber.get(c.substring(0, c.length() - 1)), CardType.valueOf(c.substring(indexInital, c.length())));
				}).
				collect(Collectors.toList());
		
		return new CheckersBuilder().build().check(cardsHand, cardsAnotherHand);
	}

	public String getCards() {
		return cards;
	}

}
