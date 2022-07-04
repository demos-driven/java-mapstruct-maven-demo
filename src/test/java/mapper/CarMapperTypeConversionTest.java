/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package mapper;

import dto.CarDto;
import dto.CarDtoTypeConversion;
import entity.Car;
import entity.CarType;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CarMapperTypeConversionTest {

  @Test
  public void shouldMapCarToDtoTypeConversion() {
    // given
    Car car = new Car("Morris", 5, CarType.BIG);

    // when
    CarDtoTypeConversion carDtoTypeConversion = CarMapperTypeConversion.INSTANCE.carToCarDtoTypeConversion(car);

    // then
    assertThat(carDtoTypeConversion).isNotNull();
    assertThat(carDtoTypeConversion.getMake()).isEqualTo(car.getMake());
    assertThat(carDtoTypeConversion.getSeatCount()).isEqualTo(car.getNumberOfSeats());
    assertThat(carDtoTypeConversion.getCarType()).isEqualTo(car.getType().ordinal());
  }

  @Test
  public void shouldMapDtoTypeConversionToCar() {
    // given
    CarDtoTypeConversion carDtoTypeConversion = new CarDtoTypeConversion("Morris", 5, 1);

    // when
    Car car = CarMapperTypeConversion.INSTANCE.carDtoTypeConversionToCar(carDtoTypeConversion);

    // then
    assertThat(car).isNotNull();
    assertThat(car.getMake()).isEqualTo(carDtoTypeConversion.getMake());
    assertThat(car.getNumberOfSeats()).isEqualTo(carDtoTypeConversion.getSeatCount());
    assertThat(car.getType()).isEqualTo(CarType.getCarTypeById(carDtoTypeConversion.getCarType()));
  }
}
