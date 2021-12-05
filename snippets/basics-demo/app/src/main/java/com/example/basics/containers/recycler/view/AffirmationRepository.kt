package com.example.basics.containers.recycler.view

class AffirmationRepository {

    data class Affirmation(val message: String) {}

    fun findAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation("Text A"),
            Affirmation("Text B"),
            Affirmation("Text C")
        )
    }

}