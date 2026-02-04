package com.green.restApi_test.controller;

import com.green.restApi_test.dto.BookDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
  private List<BookDTO> list;

  public BookController(){
    list = new ArrayList<>();

    list.add(new BookDTO(1,"가","kim","a",1000));
    list.add(new BookDTO(2,"나","lee","b",1000));
    list.add(new BookDTO(3,"다","kim","c",1000));
    list.add(new BookDTO(4,"라","kim","d",1000));
    list.add(new BookDTO(5,"마","kim","e",1000));
  }

  //모든 도서정보 조회
  @GetMapping("")
  public List<BookDTO> getList(){
    System.out.println("모든 도서 정보 조회");
    return list;
  }

  //하나의 도서정보 조회
  @GetMapping("/{bookNum}")
  public BookDTO getBook(@PathVariable("bookNum") int bookNum){
    System.out.println(bookNum + "번 책 조회");
    BookDTO result = null;

    for (BookDTO bookDTO : list){
      if (bookNum == bookDTO.getBookNum()){
        result = bookDTO;
      }
    }
    return result;
  }

  //하나의 도서정보 등록
  @PostMapping("")
  public void postBook(@RequestBody BookDTO bookDTO){
    System.out.println("책 등록");
    list.add(bookDTO);
  }

  //하나의 도서정보 삭제
  @DeleteMapping("/{num}")
  public void deleteBook(@PathVariable("num") int num){
    System.out.println(num + "번 책 삭제");
    for (int i = 0; i < list.size(); i++){
      if (num == list.get(i).getBookNum()){
        list.remove(i);
        break;
      }
    }
  }

  //하나의 도서정보에서 도서명과, 저자 도서가격 수정
  @PutMapping("/{num}")
  public void updateBook(@RequestBody BookDTO bookDTO, @PathVariable("num") int num){
    System.out.println(num + "번 책 수정");
    for (BookDTO book : list){
      if (book.getBookNum() == num){
        book.setBookTitle(bookDTO.getBookTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setBookPrice(bookDTO.getBookPrice());
      }
    }
  }

}
