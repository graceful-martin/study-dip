package org.example.core

import org.example.domain.UserService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.ObjectProvider
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DipApplicationKtTest @Autowired constructor(
    private val userService: UserService,
    private val provider: ObjectProvider<Any>
) {
    @Test
    fun `서비스 테스트`() {
        userService.saveUser()
    }
}