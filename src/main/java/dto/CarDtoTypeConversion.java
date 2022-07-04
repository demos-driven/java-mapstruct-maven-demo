package dto;

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */

public class CarDtoTypeConversion {

  private String make;
  private int seatCount;
  private int carType;

  public CarDtoTypeConversion(String make, int seatCount, int carType) {
    this.make = make;
    this.seatCount = seatCount;
    this.carType = carType;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public int getSeatCount() {
    return seatCount;
  }

  public void setSeatCount(int seatCount) {
    this.seatCount = seatCount;
  }

  public int getCarType() {
    return carType;
  }

  public void setCarType(int carType) {
    this.carType = carType;
  }
}
