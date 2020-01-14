package br.com.rodolfobueno.pokerhand.domain.validator;

import java.util.Arrays;

import br.com.rodolfobueno.pokerhand.domain.CardNumber;
import br.com.rodolfobueno.pokerhand.domain.validator.config.Validator;

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
      if (c.length() != 2) {
        throw new IllegalArgumentException("Não foi informado o número e o naipe.");
      }
      if (!CardNumber.isValid(c.substring(0, 1))) {
        throw new IllegalArgumentException(String.format("Carta %s inválida.", c));
      }
    });
    return true;
  }

}
