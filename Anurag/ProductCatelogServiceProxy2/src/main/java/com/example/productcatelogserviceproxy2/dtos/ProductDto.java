package com.example.productcatelogserviceproxy2.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String image;
    private String category;
    //private RatingDto ratingDto;
}
