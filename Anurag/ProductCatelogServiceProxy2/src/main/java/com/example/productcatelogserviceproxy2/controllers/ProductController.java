package com.example.productcatelogserviceproxy2.controllers;

import com.example.productcatelogserviceproxy2.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public String getProducts(){
        return "Get All products";
    }

    @GetMapping("/{id}")
    public String getProduct(@PathVariable("id") Long id1){
        return "returning product with id "+id1;
    }

    @PostMapping()
    public String createProduct(@RequestBody ProductDto productDto){
        return "creating product entry for "+productDto;
    }

    @PatchMapping
    public String updateProduct(@RequestBody ProductDto productDto){
        return "updating the product "+productDto;
    }
}
