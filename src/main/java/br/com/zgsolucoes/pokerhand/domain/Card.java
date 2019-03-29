package br.com.zgsolucoes.pokerhand.domain;

public class Card {

	private CardNumber number;
	private CardType type;
	
	public Card(CardNumber number, CardType type) {
		super();
		this.number = number;
		this.type = type;
	}

	public CardNumber getNumber() {
		return number;
	}

	public void setNumber(CardNumber number) {
		this.number = number;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

}
