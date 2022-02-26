package com.home.manager.hmkotlinapplicationprice.controller

import com.home.manager.hmkotlinapplicationprice.dtos.PricingDto
import com.home.manager.hmkotlinapplicationprice.dtos.PropertieDto
import com.home.manager.hmkotlinapplicationprice.service.PricingService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/princing")
class PrincingController(
        private val pricingService: PricingService
) {

    @GetMapping()
    fun getPricing(@RequestBody propertieDto: PropertieDto): ResponseEntity<Any>{
        try{
            val pricingDto:PricingDto = this.pricingService.getPricing(propertieDto)
            return ResponseEntity.ok(pricingDto)
        }catch (ex: Exception){
            return ResponseEntity.badRequest().body("Propertie's wrong | Try again")
        }
    }

}