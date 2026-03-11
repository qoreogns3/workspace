package com.green.car_shop.sale.controller;

import com.green.car_shop.sale.dto.SaleDTO;
import com.green.car_shop.sale.service.SaleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sales")
public class SaleController {
  private final SaleService saleService;

  //판매 정보 등록 api
  @PostMapping("")
  public ResponseEntity<?> regSale(@RequestBody SaleDTO saleDTO){
    try {
      saleService.regSale(saleDTO);
      return ResponseEntity.status(HttpStatus.CREATED).build();
    }catch (Exception e){
      log.error("판매 정보 등록 실패", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //판매 목록 조회 api
  @GetMapping("")
  public ResponseEntity<?> getSales(){
    try {
      return ResponseEntity.status(HttpStatus.OK).body(saleService.getSales());
    }catch (Exception e){
      log.error("판매 목록 조회 실패", e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
