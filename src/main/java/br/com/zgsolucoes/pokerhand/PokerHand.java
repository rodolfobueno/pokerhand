package br.com.zgsolucoes.pokerhand;

public class PokerHand {
  private String cards;

  public PokerHand(String cards) {
    super();
    this.cards = cards;
  }

  public Result compareWith(PokerHand anotherHand) {
    return Result.DRAW;
  }

  public String getCards() {
    return cards;
  }

}
