package com.consume.api.service

import com.consume.api.client.SlipClient
import com.consume.api.model.Slip
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class SlipService(
    private val slipClient: SlipClient
) {

    fun getSlip(): Slip{
        return slipClient.getSlip()
    }
}