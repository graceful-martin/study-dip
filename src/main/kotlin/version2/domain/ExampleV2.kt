package org.example.version2.domain

data class ExampleV2(
    val id: Int,
    var name: String
) {
    fun updateName(name: String) {
        this.name = name
    }
}