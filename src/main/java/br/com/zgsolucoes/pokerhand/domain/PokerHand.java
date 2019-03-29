package br.com.zgsolucoes.pokerhand.domain;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import br.com.zgsolucoes.pokerhand.domain.checker.config.CheckersBuilder;
import br.com.zgsolucoes.pokerhand.domain.validator.PokerHandValidator;
import br.com.zgsolucoes.pokerhand.domain.validator.config.Validator;

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
    List<Card> cardsHand = cards.stream()
        .map(createCard())
        .collect(Collectors.toList());

    List<String> anotherCards = Arrays.asList(anotherHand.getCards().split(" "));
    List<Card> cardsAnotherHand = anotherCards.stream()
        .map(createCard())
        .collect(Collectors.toList());

    return new CheckersBuilder().build().check(cardsHand, cardsAnotherHand);
  }

  private Function<? super String, ? extends Card> createCard() {
    return c -> new Card(getCardNumber(c), getType(c));
  }

  private CardNumber getCardNumber(String c) {
    return CardNumber.get(c.substring(0, c.length() - 1));
  }

  private CardType getType(String c) {
    return CardType.valueOf(c.substring(1, c.length()));
  }

  public String getCards() {
    return cards;
  }

}
