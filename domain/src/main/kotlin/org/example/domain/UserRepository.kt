package org.example.domain

import org.springframework.data.repository.NoRepositoryBean

interface UserRepository {
    fun save()
}