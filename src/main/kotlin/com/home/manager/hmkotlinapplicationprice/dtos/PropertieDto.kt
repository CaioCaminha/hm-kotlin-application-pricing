package com.home.manager.hmkotlinapplicationprice.dtos

import com.home.manager.constants.RegionalPriceEnum
import java.math.BigDecimal

class PropertieDto(
        val neighborhood: String,
        val region: RegionalPriceEnum,
        val size: Double,
) {
}