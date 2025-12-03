package com.vikas.tagms.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private Long id;
    private String name;
    private String type;
    //this will be later an enum with selller and buyer currently only one buyer.
    //after multiple buyer book also will have buyer same for order.

    // User History purchase.
    private List<Long> orderIdList;
}
