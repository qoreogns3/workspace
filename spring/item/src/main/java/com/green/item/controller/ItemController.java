package com.green.item.controller;

import com.green.item.dto.ItemDTO;
import com.green.item.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //객체생성 + 이 클래스가 controller 역할하는 클래스에요
@RequestMapping("/items") //모든 url은 '/items'로 시작하겠다.
public class ItemController {
    private ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    //상품 등록 api
    //URL (POST) localhost:8080/items
    @PostMapping("")
    public void regItem(@RequestBody ItemDTO itemDTO){
        itemService.regItem(itemDTO);
    }

    //상품 목록 조회 api
    // (GET) localhost:8080/items
    @GetMapping("")
    public List<ItemDTO> getItemList(){
        List<ItemDTO> list = itemService.getItemList();
        return list;
    }

    //상품 상세 정보 조회 api
    // (GET) localhost:8080/items/1
    @GetMapping("/{itemNum}")
    public ItemDTO getDetail(@PathVariable("itemNum") int itemNum){
        ItemDTO result = itemService.getDetail(itemNum);
        return result;
    }

    //상품 정보 수정 api
    // (PUT) localhost:8080/items/3
    @PutMapping("/{itemNum}")
    public void updateItem(@RequestBody ItemDTO itemDTO, @PathVariable("itemNum") int itemNum){
        itemDTO.setItemNum(itemNum);
        itemService.updateItem(itemDTO);
    }

    //상품 삭제 api
    // (DELETE) localhost:8080/items/3
    @DeleteMapping("/{itemNum}")
    public void deleteItem(@PathVariable ("itemNum") int itemNum){
        itemService.deleteItem(itemNum);
    }

}
