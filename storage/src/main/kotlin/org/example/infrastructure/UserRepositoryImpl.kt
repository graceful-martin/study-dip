package org.example.infrastructure

import org.example.domain.UserRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl : UserRepository {
    override fun save() {
        println("UserRepository save")
    }
}