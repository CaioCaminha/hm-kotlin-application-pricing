package com.home.manager.hmkotlinapplicationprice.dtos

import java.math.BigDecimal

class PricingDto(
        val propertieDto: PropertieDto,
        val price: BigDecimal
) {
}