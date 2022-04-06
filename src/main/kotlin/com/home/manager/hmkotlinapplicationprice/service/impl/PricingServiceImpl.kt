package com.home.manager.hmkotlinapplicationprice.service.impl

import com.home.manager.hmkotlinapplicationprice.dtos.PricingDto
import com.home.manager.hmkotlinapplicationprice.dtos.PropertieDto
import com.home.manager.hmkotlinapplicationprice.service.PricingService
import org.springframework.stereotype.Service
import java.util.Optional


@Service
class PricingServiceImpl(
): PricingService {

    override fun getPricing(propertieDto: PropertieDto):PricingDto{

        val price = propertieDto.region.price.multiply(propertieDto.size.toBigDecimal())

        return PricingDto(propertieDto = propertieDto, price = price)
    }



}









