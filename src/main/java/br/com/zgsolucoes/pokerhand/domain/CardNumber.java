package br.com.zgsolucoes.pokerhand.domain;

import java.util.Arrays;

public enum CardNumber {

  DOIS("2", 1),
  TRES("3", 2),
  QUATRO("4", 3),
  CINCO("5", 4),
  SEIS("6", 5),
  SETE("7", 6),
  OITO("8", 7),
  NOVE("9", 8),
  T("T", 9),
  J("J", 10),
  Q("Q", 11),
  K("K", 12),
  A("A", 13);

  private String value;
  private Integer strength;

  private CardNumber(String value, Integer strength) {
    this.value = value;
    this.strength = strength;
  }

  public String getValue() {
    return value;
  }

  public Integer getStrength() {
    return strength;
  }

  public static boolean isValid(String number) {
    return Arrays.asList(values()).stream().anyMatch(n -> n.getValue().equals(number));
  }

  public static CardNumber get(String number) {
    return Arrays.asList(values()).stream()
      .filter(n -> n.getValue().equals(number)).findAny()
      .orElseThrow(() -> new IllegalArgumentException());
  }

}
