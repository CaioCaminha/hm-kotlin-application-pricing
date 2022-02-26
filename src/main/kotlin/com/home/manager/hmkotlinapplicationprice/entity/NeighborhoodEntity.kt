package com.home.manager.hmkotlinapplicationprice.entity

import com.home.manager.constants.RegionalPriceEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.swing.plaf.synth.Region

@Document(collection = "neighborhood")
class NeighborhoodEntity(
        @Id
        val id: String,
        val name: String,
        val region: RegionalPriceEnum,
) {

}