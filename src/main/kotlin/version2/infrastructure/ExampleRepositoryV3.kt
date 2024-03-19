package org.example.version2.infrastructure

import org.example.version2.domain.ExampleRepository

/**
 * 하위 계층(저수준 모듈)
 */
class ExampleRepositoryV3 : ExampleRepository {
    override fun save() {
        println("RepositoryV3 save")
    }
}