package com.home.manager.hmkotlinapplicationprice.service

import com.home.manager.hmkotlinapplicationprice.dtos.PricingDto
import com.home.manager.hmkotlinapplicationprice.dtos.PropertieDto

interface PricingService {

    fun getPricing(propertieDto: PropertieDto): PricingDto

}