package com.leonardom011.lecbudget.finance.service

import com.leonardom011.lecbudget.finance.entity.dto.AddCategoryDTO
import com.leonardom011.lecbudget.finance.repository.CategoryRepository
import com.leonardom011.lecbudget.finance.repository.EntryRepository
import org.springframework.stereotype.Service

@Service
class FinanceService(
    private val categoryRepository: CategoryRepository,
    private val entryRepository: EntryRepository
) {
    fun addCategory(addCategoryDTO: AddCategoryDTO) {
        categoryRepository.save(addCategoryDTO.toCategory())
    }

    fun getCategories() = categoryRepository.findAll()
}