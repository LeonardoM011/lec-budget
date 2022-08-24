package com.leonardom011.lecbudget.authentication.entity

import com.leonardom011.lecbudget.finance.entity.Category
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "client")
class Client (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    val id: Long = 0L,
    @Column(nullable = false, unique = true)
    val username: String = "",
    @Column(nullable = false)
    val password: String = "",
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authority_id", nullable = false)
    val authority: Authority = Authority(),
    @Column(nullable = false)
    val created_at: LocalDateTime = LocalDateTime.now(),
    @Column(nullable = false)
    val last_login: LocalDateTime = LocalDateTime.now()
)