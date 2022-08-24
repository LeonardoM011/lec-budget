package com.leonardom011.lecbudget.finance.repository

import com.leonardom011.lecbudget.finance.entity.Entry
import org.springframework.data.jpa.repository.JpaRepository

interface EntryRepository : JpaRepository<Entry, Long> { }