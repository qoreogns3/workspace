package com.green.car_shop.car.mapper;

import com.green.car_shop.car.dto.CarDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {
  //차량 등록 메서드
  void regCar(CarDTO carDTO);

  //차량 조회 메서드
  List<CarDTO> getCars();
}
