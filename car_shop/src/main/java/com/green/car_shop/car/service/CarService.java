package com.green.car_shop.car.service;

import com.green.car_shop.car.dto.CarDTO;
import com.green.car_shop.car.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
  private final CarMapper carMapper;

  //차량 등록 기능
  public void regCar(CarDTO carDTO){
    carMapper.regCar(carDTO);
  }

  //차량 조회 기능
  public List<CarDTO> getCars(){
    return carMapper.getCars();
  }
}
