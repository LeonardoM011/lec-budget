package com.leonardom011.lecbudget.finance.entity.dto

import com.leonardom011.lecbudget.finance.entity.Category
import org.jetbrains.annotations.NotNull
import java.time.LocalDateTime

data class AddCategoryDTO(
    @field:NotNull
    //@field:Size(min=2, max=30)
    val name: String
) {
    constructor(category: Category): this(
        name = category.name
    )

    fun toCategory() = Category(
        name = name,
        created_at = LocalDateTime.now()
    )
}