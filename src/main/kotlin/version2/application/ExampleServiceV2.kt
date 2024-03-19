package org.example.version2.application

import org.example.version2.domain.ExampleRepository
import org.example.version2.infrastructure.ExampleRepositoryV2

/**
 * 상위 계층(고수준 모듈)
 */
class ExampleServiceV2(
    private val exampleRepository: ExampleRepository
) {

    fun processBusiness() {
        exampleRepository.save()
    }
}