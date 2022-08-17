package com.leonardom011.lecbudget.finance.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController {

    @GetMapping("/")
    fun index() : ResponseEntity<String> {
        return ResponseEntity.ok("Hello World!")
    }
}