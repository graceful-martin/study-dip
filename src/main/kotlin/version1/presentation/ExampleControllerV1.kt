package org.example.version1.presentation

import org.example.version1.application.ExampleServiceV1
import org.example.version2.domain.ExampleV2

class ExampleControllerV1(
    private val exampleService: ExampleServiceV1
) {

    fun getBusiness() {
        val example = ExampleV2(1, "jdbc")
        example.updateName("jpa")
        exampleService.processBusiness()
    }
}