package com.jed.point;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point() {}

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public double distance() {
    return distance(0,0);
  }

  public double distance(Point point) {

    return distance(point.x, point.y);
  }

  public double distance (int x, int y) {
    return Math.sqrt(Math.pow(x - getX(),2) + Math.pow(y - getY(),2));
  }
}
