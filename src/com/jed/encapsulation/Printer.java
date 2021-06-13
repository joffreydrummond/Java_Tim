package com.jed.encapsulation;

public class Printer {
  private int tonerLevel = 0;
  private int numOfPagesPrinted = 0;
  private boolean isDuplex;

  public boolean isDuplex() {
    return isDuplex;
  }

  public Printer(boolean isDuplex) {

    this.isDuplex = isDuplex;
  }

  public int fillToner(int tonerRefill) {
    if (tonerLevel < 0 || tonerLevel >= 100) return tonerLevel;
    return tonerLevel += tonerRefill;
  }

  public int printPage(int pagesPrinted){
    return numOfPagesPrinted += pagesPrinted;
  }

}
