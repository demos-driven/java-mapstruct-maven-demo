package entity;

import java.util.Arrays;

/**
 * Copyright (C) 2022 Urban Compass, Inc.
 */

public enum CarType {
  BIG("big"),
  MEDIUM("medium"),
  SMALL("small")
  ;

  private String name;

  CarType(String name) {
    this.name = name;
  }

  public static CarType getCarTypeById(int typeId) {
    return Arrays.stream(values())
        .filter(type -> type.ordinal() == typeId)
        .findFirst()
        .orElse(null);
  }
}
