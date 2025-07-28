package com.ibm.bluepoints.order_service.dto;

import java.math.BigDecimal;

public record OrderRequest(Long Id, String orderNumber,
                           String skuCode, BigDecimal price, Integer quantity) {
}
