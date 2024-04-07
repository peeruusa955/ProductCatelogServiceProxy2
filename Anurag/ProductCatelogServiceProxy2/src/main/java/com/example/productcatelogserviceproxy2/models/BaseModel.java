package com.example.productcatelogserviceproxy2.models;

import java.util.Date;

public abstract class BaseModel {
    private Long id;
    private Date createdAt;
    private Date lastUpdateAt;
    private Status status;
}
