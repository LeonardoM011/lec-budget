package com.leonardom011.lecbudget.finance.entity

import com.leonardom011.lecbudget.authentication.entity.Client
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "category")
class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    val id: Long = 0L,
    @Column(nullable = false)
    val name: String,
    @Column(nullable = false)
    val created_at: LocalDateTime,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", nullable = false)
    val created_by: Client,
    @Column(nullable = false)
    val modified_at: LocalDateTime,
) {
    constructor() : this(
        name = "",
        created_at = LocalDateTime.now(),
        created_by = Client(),
        modified_at = LocalDateTime.now()
    )
}