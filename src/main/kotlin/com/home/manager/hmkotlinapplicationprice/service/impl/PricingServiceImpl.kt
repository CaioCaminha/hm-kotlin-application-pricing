package com.home.manager.hmkotlinapplicationprice.service.impl

import com.home.manager.constants.RegionalPriceEnum
import com.home.manager.hmkotlinapplicationprice.dtos.PricingDto
import com.home.manager.hmkotlinapplicationprice.dtos.PropertieDto
import com.home.manager.hmkotlinapplicationprice.entity.NeighborhoodEntity
import com.home.manager.hmkotlinapplicationprice.repository.NeighborhoodRepository
import com.home.manager.hmkotlinapplicationprice.service.PricingService
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class PricingServiceImpl(
        val repository: NeighborhoodRepository
): PricingService {

    override fun getPricing(propertieDto: PropertieDto):PricingDto{
        var optionalEntity:Optional<NeighborhoodEntity> = repository.findByName(propertieDto.neighborhood)

        var entity:NeighborhoodEntity;

        if(optionalEntity.isPresent){
           entity = optionalEntity.get();
        }else{
            throw java.lang.Exception("Propertie not founded")
        }

        val price = entity.region.price.multiply(propertieDto.size.toBigDecimal())

        return PricingDto(neighborhoodEntity = entity, price = price)
    }



}









