package com.consume.api.client

import com.consume.api.model.Slip
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "adviceslip", url = "https://api.kanye.rest")
interface SlipClient {

    @RequestMapping(method = [RequestMethod.GET])
    fun getSlip(): Slip

}