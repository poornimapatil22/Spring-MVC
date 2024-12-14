package com.xworkz.ProductApplication.controller;


import com.xworkz.ProductApplication.service.ProductService;
import com.xworkz.ProductApplication.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class ProductController {
    ProductController() {
        System.out.println("const of product controller");
    }
    @Qualifier("productServiceImpl")
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/order", method = {RequestMethod.GET, RequestMethod.POST})
    public String productController(ProductDto productDto, Model model) {
        System.out.println("product controller method");
        if (productService.validSave(productDto)) {
            System.out.println("product order successful");
            model.addAttribute("Successmessage", "Your Order is Success");
            return "Success.jsp";
        } else {
            System.err.println("order cancel");
            model.addAttribute("msg", "Order Cancel!");
            model.addAttribute("message", productDto);
            return "Product.jsp";
        }
    }
}
