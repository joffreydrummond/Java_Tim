package com.jed.complexOperations;

public class ComplexNumber {
  private double real;
  private double imaginary;

  public ComplexNumber(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public void add(double real, double imaginary) {
    this.real = this.real + real;
    this.imaginary = this.imaginary + imaginary;
  }

  public void add(ComplexNumber complexNumber) {
//    real = real + complexNumber.getReal();
//    imaginary = imaginary + complexNumber.getImaginary();

    add(complexNumber.getReal(), complexNumber.getImaginary());
    }

  public void subtract(double real, double imaginary) {
    this.real = this.real - real;
    this.imaginary = this.imaginary - imaginary;
  }

  public void subtract(ComplexNumber complexNumber) {
//    real = real - complexNumber.getReal();
//    imaginary = imaginary - complexNumber.getImaginary();
    subtract(complexNumber.getReal(), complexNumber.getImaginary());
  }
}
