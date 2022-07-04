# [MapStruct](https://mapstruct.org/)

## MapStruct 是什么

MapStruct 是一个代码生成器，它基于约定优于配置的方法，极大地简化了 Java bean 类型之间的映射实现。

生成的映射代码使用普通的方法调用，因此速度快、类型安全且易于理解。

## 为什么使用 MapStruct

多层应用程序通常需要在不同的对象模型（例如实体和 DTO）之间进行映射。 编写这样的映射代码是一项乏味且容易出错的任务。
MapStruct 旨在通过尽可能地自动化来简化这项工作。

与其他映射框架相比，MapStruct 在编译时生成 bean 映射，这确保了高性能，允许快速的开发人员反馈和彻底的错误检查。

## 如何使用 MapStruct

MapStruct 是一个注解处理器，它插入到 Java 编译器中，可用于命令行构建（Maven、Gradle 等）以及在 IDE 中。

MapStruct 使用合理的默认值，但在配置或实现特殊行为时会采取措施。

## 使用本 Demo

触发单测验证 MapStruct：

```
mvn clean test
```

查看 mapper 定义：

基本使用：[CarMapper](./src/main/java/mapper/CarMapper.java)  
自定义类型转换：[CarMapperTypeConversion](./src/main/java/mapper/CarMapperTypeConversion.java)
