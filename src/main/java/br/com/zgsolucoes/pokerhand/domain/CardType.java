package br.com.zgsolucoes.pokerhand.domain;

import java.util.Arrays;

public enum CardType {

  S,
  H,
  D,
  C;

  public static CardType get(String value) {
    return Arrays.asList(values()).stream()
      .filter(n -> n.name().equals(value)).findAny()
      .orElseThrow(() -> new IllegalArgumentException());
  }

}
