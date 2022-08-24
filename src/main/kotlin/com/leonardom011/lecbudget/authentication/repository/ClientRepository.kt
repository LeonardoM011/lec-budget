package com.leonardom011.lecbudget.authentication.repository

import com.leonardom011.lecbudget.authentication.entity.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository : JpaRepository<Client, Long> {}