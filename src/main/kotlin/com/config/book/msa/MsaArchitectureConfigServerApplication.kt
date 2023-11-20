package com.config.book.msa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class MsaArchitectureConfigServerApplication

fun main(args: Array<String>) {
    runApplication<MsaArchitectureConfigServerApplication>(*args)
}
