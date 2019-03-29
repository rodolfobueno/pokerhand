package br.com.zgsolucoes.pokerhand.builder;

import java.util.List;
import java.util.stream.Collectors;

import br.com.zgsolucoes.pokerhand.domain.Card;
import br.com.zgsolucoes.pokerhand.domain.CardNumber;
import br.com.zgsolucoes.pokerhand.domain.CardType;

public class CardBuilder {

  public static Card create(CardNumber number, CardType type) {
    return new Card(number, type);
  }

  public static List<Card> create(List<CardNumber> numbers, CardType type) {
    return numbers.stream().map(n -> CardBuilder.create(n, type)).collect(Collectors.toList());
  }

}
