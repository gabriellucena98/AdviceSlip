package com.consume.api.controller

import com.consume.api.converter.SlipConverter
import com.consume.api.dto.SlipDTO
import com.consume.api.model.Slip
import com.consume.api.service.SlipService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/advices")
class SlipController(
    private val slipService: SlipService
) {

    @GetMapping
    fun getSlip(): Slip {
        return slipService.getSlip()//.let { SlipConverter.toDTO(it) }
    }

}