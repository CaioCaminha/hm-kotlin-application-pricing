package com.home.manager.hmkotlinapplicationprice.dtos

import com.home.manager.hmkotlinapplicationprice.entity.NeighborhoodEntity
import java.math.BigDecimal

class PricingDto(
        val neighborhoodEntity: NeighborhoodEntity,
        val price: BigDecimal
) {
}