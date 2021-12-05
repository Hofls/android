package com.example.basics.containers.recycler.view

import com.example.basics.R

class AffirmationRepository {

    fun findAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3)
        )
    }

}