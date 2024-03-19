package org.example

import org.example.version1.application.ExampleServiceV1
import org.example.version1.infrastructure.ExampleRepositoryV1
import org.example.version1.presentation.ExampleControllerV1
import org.example.version2.application.ExampleServiceV2
import org.example.version2.domain.ExampleRepository
import org.example.version2.infrastructure.ExampleRepositoryV2
import org.example.version2.infrastructure.ExampleRepositoryV3
import org.example.version2.presentation.ExampleControllerV2


fun main() {

    // DIP가 존재하지 않는 경우
    ExampleControllerV1(ExampleServiceV1(ExampleRepositoryV1())).getBusiness()

    // DIP가 존재하는 경우 (Service가 직접적으로 Repository를 의존하지 않음, 변경 가능)
    ExampleControllerV2(ExampleServiceV2(ExampleRepositoryV2())).getBusiness()
    ExampleControllerV2(ExampleServiceV2(ExampleRepositoryV3())).getBusiness()

}