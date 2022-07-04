/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package mapper;

import dto.CarDto;
import entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * To generate a mapper for creating a CarDto object out of a Car object,
 * a mapper interface needs to be defined
  */
@Mapper
public interface CarMapper {

  CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

  // same type, different field name
  @Mapping(source = "numberOfSeats", target = "seatCount")
  // same filed name, different type, implicit type conversions
  @Mapping(source = "type", target = "type")
  CarDto carToCarDto(Car car);
}
