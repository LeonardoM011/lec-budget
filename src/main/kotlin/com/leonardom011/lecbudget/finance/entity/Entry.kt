package com.leonardom011.lecbudget.finance.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "entry")
class Entry(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    val id: Long = 0L,
    @Column(nullable = false)
    val description: String,
    @Column(nullable = false)
    val price: Float,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    val category: Category,
    @Column(nullable = false)
    val created_at: LocalDateTime,
    @Column(nullable = false)
    val modified_at: LocalDateTime
) {
    constructor() : this(
        description = "",
        price = 0f,
        category = Category(),
        created_at = LocalDateTime.now(),
        modified_at = LocalDateTime.now()
    )
}