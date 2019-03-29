package br.com.zgsolucoes.pokerhand.domain.validator;

import java.util.Arrays;

import br.com.zgsolucoes.pokerhand.domain.CardNumber;

public class PokerHandValidator implements Validator<String> {

	@Override
	public boolean check(String cardsStr) {
		String[] cards = cardsStr.split(" ");
		return hasFiveElements(cards) && isValidNumbersAndTypes(cards);
	}

	private boolean hasFiveElements(String[] cards) {
		if (cards.length != 5) {
			throw new IllegalArgumentException("Não foi informado cinco cartas.");
		}
		return true;
	}

	private boolean isValidNumbersAndTypes(String[] cards) {
		Arrays.asList(cards).stream().forEach(c -> {
			if (c.length() != 2 && c.length() != 3) {
				throw new IllegalArgumentException("Não foi informado o número e o naipe.");
			}
			String card = (c.length() == 3) ? c.substring(0, 2) : c.substring(0, 1);
			if(!CardNumber.isValid(card)) {
				throw new IllegalArgumentException(String.format("Carta %s inválida.", c));
			}
		});
		return true;
	}

}
