package com.StudyCat.StudyCatDemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jdbc.core.JdbcTemplate

@SpringBootApplication
class StudyCatDemoApplication

@Autowired
val jdbcTemplate =  JdbcTemplate()

fun main(args: Array<String>) {
	runApplication<StudyCatDemoApplication>(*args)
}
