package lession7;

import java.io.Serializable;

import lession4.Point;

public class Triangle implements Serializable {
  private Point p1;
  private Point p2;
  private Point p3;

  public Triangle(Point p1, Point p2, Point p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  public double getChuVi() {
    double p1p2 = this.p1.getDistance(this.p2);
    double p2p3 = this.p2.getDistance(this.p3);
    double p3p1 = this.p3.getDistance(this.p1);
    return p1p2 + p2p3 + p3p1;
  }
  @Override
  public String toString() {
    return "@Triangle[p1=" + this.p1 + ",p2=" + this.p2 + ",p3=" +this.p3 + "]";
  }

  public double getDienTich() {
    double p1p2 = this.p1.getDistance(this.p2);
    double p2p3 = this.p2.getDistance(this.p3);
    double p3p1 = this.p3.getDistance(this.p1);
    double chuvi = this.getChuVi();
    double nuaChuvi = chuvi / 2;
    return Math.sqrt(nuaChuvi * (nuaChuvi - p1p2) * (nuaChuvi - p2p3) * (nuaChuvi - p3p1));
  }
}
