package com.vikas.tagms.entity;

import java.util.List;

import com.vikas.tagms.utils.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    private Long id;
    private Long userId;
    private Double totalAmount;
    private List<Long> bookIdList;
    private OrderStatus status;
}
