package com.perseuschat.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PerseusChatServerApplication

fun main(args: Array<String>) {
	runApplication<PerseusChatServerApplication>(*args)
}
