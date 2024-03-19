package org.example.version1.domain

data class ExampleV1(
    val id: Int,
    var name: String
) {
    fun updateName(name: String) {
        this.name = name
    }
}