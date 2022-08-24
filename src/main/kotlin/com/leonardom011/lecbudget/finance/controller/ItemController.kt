package com.leonardom011.lecbudget.finance.controller

import com.leonardom011.lecbudget.finance.entity.Category
import com.leonardom011.lecbudget.finance.entity.dto.AddCategoryDTO
import com.leonardom011.lecbudget.finance.service.FinanceService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController(private val financeService: FinanceService) {

    @GetMapping("/")
    fun index() : ResponseEntity<String> {
        return ResponseEntity.ok("Hello World!")
    }

    @PostMapping("/category")
    fun addCategory(@RequestBody @Validated addCategoryDTO: AddCategoryDTO) : ResponseEntity<Unit> {
        financeService.addCategory(addCategoryDTO)
        return ResponseEntity(HttpStatus.OK)
    }

    @GetMapping("/category")
    fun getCategories() : ResponseEntity<List<Category>> {
        return ResponseEntity.ok(financeService.getCategories())
    }
}