package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/item")
public class ItemController {
  private List<ItemDTO> itemDTOList;


  public ItemController(){
    itemDTOList = new ArrayList<>();

    itemDTOList.add(new ItemDTO(1, "aaa", 10000, "aa"));
    itemDTOList.add(new ItemDTO(2, "bbb", 20000, "bb"));
    itemDTOList.add(new ItemDTO(3, "ccc", 30000, "cc"));
    itemDTOList.add(new ItemDTO(4, "ddd", 40000, "dd"));
    itemDTOList.add(new ItemDTO(5, "eee", 50000, "ee"));
  }

  @GetMapping("")
  public List<ItemDTO> getItemDTOList(){
    System.out.println("모든 정보 조회");
    return itemDTOList;
  }


  @GetMapping("/{num}")
  public ItemDTO getItemDetail(@PathVariable("num") int num){
    System.out.println(num + "번 상품 조회");

    ItemDTO result = null;
    for (ItemDTO itemDTO : itemDTOList){
      if (num == itemDTO.getItemNum()){
        result = itemDTO;
      }
    }
    return result;
  }

  @DeleteMapping("/{num}")
  public List<ItemDTO> deleteItemDto(@PathVariable("num") int num){
    System.out.println(num + "번 삭제");
    for (int i = 0; i < itemDTOList.size(); i++){
      if (num == itemDTOList.get(i).getItemNum()){
        itemDTOList.remove(i);
      }
    }
    return itemDTOList;
  }

}
