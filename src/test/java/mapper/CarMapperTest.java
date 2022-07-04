/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package mapper;

import dto.CarDto;
import entity.Car;
import entity.CarType;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CarMapperTest {

  @Test
  public void shouldMapCarToDto() {
    // given
    Car car = new Car("Morris", 5, CarType.BIG);

    // when
    CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

    // then
    assertThat(carDto).isNotNull();
    assertThat(carDto.getMake()).isEqualTo(car.getMake());
    assertThat(carDto.getSeatCount()).isEqualTo(car.getNumberOfSeats());
    assertThat(carDto.getType()).isEqualTo(car.getType().name());
  }
}
