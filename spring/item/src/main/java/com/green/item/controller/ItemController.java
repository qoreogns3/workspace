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
}
