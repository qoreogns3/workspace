package com.green.car_shop.car.controller;

import com.green.car_shop.car.dto.CarDTO;
import com.green.car_shop.car.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {
  private final CarService carService;

  //차량 등록 api
  @PostMapping("")
  public ResponseEntity<?> regCar(@RequestBody CarDTO carDTO){
    try {
      carService.regCar(carDTO);
      return ResponseEntity.status(HttpStatus.CREATED).build();
    }catch (Exception e){
      log.error("차량 등록 실패", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //차량 조회 api
  @GetMapping("")
  public ResponseEntity<?> getCars(){
    try {
      return ResponseEntity.status(HttpStatus.OK).body(carService.getCars());
    }catch (Exception e){
      log.error("차량 조회 실패", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
