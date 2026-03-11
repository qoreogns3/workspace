package com.green.car_shop.sale.service;

import com.green.car_shop.sale.dto.SaleDTO;
import com.green.car_shop.sale.mapper.SaleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleService {
  private final SaleMapper saleMapper;

  //판매 정보 등록 기능
  public void regSale(SaleDTO saleDTO){
    saleMapper.regSale(saleDTO);
  }

  //판매 목록 조회 기능
  public List<SaleDTO> getSales(){
    return saleMapper.getSales();
  }
}
