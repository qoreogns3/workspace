package com.green.item.service;

import com.green.item.dto.ItemDTO;
import com.green.item.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //객체 생성 + 이 클래스에서는 핵심 기능이 있어요
public class ItemService {
    private ItemMapper itemMapper;

    // @Autowired 클래스에 생성자가 하나만 존재하면 해당 생성자에 @Autowired
    //            어노테이션 자동으로 붙는다
    public ItemService(ItemMapper itemMapper){
        this.itemMapper = itemMapper;
    }

    //상품 등록 기능 실행 메서드
    public void regItem(ItemDTO itemDTO){
        System.out.println("상품 등록 기능을 시작합니다.");
        System.out.println("아래는 상품 등록 시 전달되는 데이터입니다.");
        System.out.println(itemDTO);
        //상품 등록 쿼리를 실행
        itemMapper.insertItem(itemDTO);
        System.out.println("상품등록 쿼리 실행이 완료되었습니다.");
    }

    //상품 목록 조회 기능 메서드
    public List<ItemDTO> getItemList(){
        List<ItemDTO> list = itemMapper.selectItemList();
        return list;
    }

    //상품 상세 정보 조회 기능 메서드
    public ItemDTO getDetail(int itemNum){
        ItemDTO result = itemMapper.selectItem(itemNum);
        return result;
    }

    //상품 정보 수정 기능
    public void updateItem(ItemDTO itemDTO){
        itemMapper.updateItem(itemDTO);
    }

    //상품 삭제 기능
    public void deleteItem(int itemNum){
        itemMapper.deleteItem(itemNum);
    }

}
