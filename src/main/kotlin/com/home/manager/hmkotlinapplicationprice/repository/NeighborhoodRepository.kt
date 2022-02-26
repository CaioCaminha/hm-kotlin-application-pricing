package com.home.manager.hmkotlinapplicationprice.repository

import com.home.manager.hmkotlinapplicationprice.entity.NeighborhoodEntity
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface NeighborhoodRepository: MongoRepository<NeighborhoodEntity, String> {

    fun findByName(name: String): Optional<NeighborhoodEntity>

}