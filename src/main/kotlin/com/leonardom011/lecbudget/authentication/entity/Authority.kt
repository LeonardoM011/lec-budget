package com.leonardom011.lecbudget.authentication.entity

import jakarta.persistence.*

@Entity
@Table(name = "authority")
class Authority(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    val id: Long = 0L,
    @Column(nullable = false, unique = true)
    val name: String = ""
)