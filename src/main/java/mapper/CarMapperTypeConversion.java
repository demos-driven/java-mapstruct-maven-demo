/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */
package mapper;

import java.util.Arrays;

import dto.CarDto;
import dto.CarDtoTypeConversion;
import entity.Car;
import entity.CarType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapperTypeConversion {

  CarMapperTypeConversion INSTANCE = Mappers.getMapper(CarMapperTypeConversion.class);

  // different name, different type, custom conversion
  @Mapping(
      source = "type", // ENUM
      target = "carType" // int
  )
  @Mapping(source = "numberOfSeats", target = "seatCount")
  CarDtoTypeConversion carToCarDtoTypeConversion(Car car);

  /**
   * custom conversion method: tell mapstruct how to map between the custom types
   */
  default int map(CarType type) {
    return type.ordinal();
  }

  // different name, different type, custom conversion
  @Mapping(
      source = "carType", // int
      target = "type" // ENUM
  )
  @Mapping(source = "seatCount", target = "numberOfSeats")
  Car carDtoTypeConversionToCar(CarDtoTypeConversion carDtoTypeConversion);

  /**
   * custom conversion method: tell mapstruct how to map between the custom types
   */
  default CarType map(int type) {
    return CarType.getCarTypeById(type);
  }
}
