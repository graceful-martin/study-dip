package org.example.version1.application

import org.example.version1.infrastructure.ExampleRepositoryV1

/**
 * 상위 계층(고수준 모듈)
 */
class ExampleServiceV1(
    private val exampleRepository: ExampleRepositoryV1
) {

    fun processBusiness() {
        exampleRepository.save()
    }
}