package com.leonardom011.lecbudget

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
@ConfigurationPropertiesScan
class LecBudgetApplication

fun main(args: Array<String>) {
	runApplication<LecBudgetApplication>(*args)
}
