package com.green.legacy.controller;

import com.green.legacy.dto.DeliveryDTO;
import com.green.legacy.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class OrderController {

  @RequestMapping("/getOrder")
  public String getOrder(){
    return "order";
  }

  @RequestMapping("/setOrder")
  public String setOrder(@ModelAttribute OrderDTO order, Model model){
    System.out.println(order);
    model.addAttribute("order", order);
    return "delivery";
  }

  @RequestMapping("delivery")
  public String setDelivery(@ModelAttribute DeliveryDTO delivery,@ModelAttribute OrderDTO orderDTO, Model model){
    System.out.println(delivery);

    model.addAttribute("delivery", delivery);
    model.addAttribute("order", orderDTO);

    return "order_info";
  }

}
