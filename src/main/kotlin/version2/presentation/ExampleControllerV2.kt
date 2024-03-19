package org.example.version2.presentation

import org.example.version2.domain.ExampleV2
import org.example.version2.application.ExampleServiceV2

class ExampleControllerV2(
    private val exampleService: ExampleServiceV2
) {

    fun getBusiness() {
        val example = ExampleV2(1, "jdbc")
        example.updateName("jpa")
        exampleService.processBusiness()
    }
}