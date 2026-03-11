package com.green.car_shop.sale.mapper;

import com.green.car_shop.sale.dto.SaleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SaleMapper {

  // 판매 정보 등록 메서드
  void regSale(SaleDTO saleDTO);

  // 판매 목록 조회 메서드
  List<SaleDTO> getSales();
}
