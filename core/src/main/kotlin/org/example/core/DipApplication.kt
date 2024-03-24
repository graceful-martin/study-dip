package org.example.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication(scanBasePackages = ["org.example"])
class DipApplication

fun main(args: Array<String>) {
    runApplication<DipApplication>(*args)
}
