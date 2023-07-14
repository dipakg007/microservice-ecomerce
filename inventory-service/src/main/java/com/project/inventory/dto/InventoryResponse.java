package com.project.inventory.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class InventoryResponse {

    private String skuCode;
    private Boolean isInStock;
}
