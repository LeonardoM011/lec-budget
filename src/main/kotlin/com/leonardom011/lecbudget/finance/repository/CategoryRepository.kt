package com.leonardom011.lecbudget.finance.repository

import com.leonardom011.lecbudget.finance.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long> { }