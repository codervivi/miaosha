package com.wangwi.miaosha.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemSalesPO {
    private Integer id;

    private Integer itemId;

    private Integer sales;
    
}