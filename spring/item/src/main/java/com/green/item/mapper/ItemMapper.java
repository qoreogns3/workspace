package com.green.item.mapper;

import com.green.item.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //객체생성 + 이 인터페이스 파일이 쿼리 실행 메서드 들어있는 파일이에요
public interface ItemMapper {

    //상품 등록 쿼리 실행 메서드
    void insertItem(ItemDTO itemDTO);

    //상품 목록 조회 쿼리 실행 메서드
    List<ItemDTO> selectItemList();
}
