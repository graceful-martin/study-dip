package org.example.domain

import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun saveUser() {
        userRepository.save()
    }
}