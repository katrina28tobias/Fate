package com.menaces.fate.data

import com.menaces.fate.R
import com.menaces.fate.model.Story

object StoryList {
    val stories: List<Story> = listOf(
        Story(
            R.drawable.unexpected_encounter_image,
            "An Unexpected Encounter",
            "Romance",
            "You meet the love of your life one way or other",
            0
        ),
        Story(
            R.drawable.trees_story,
            "Trees: Friends or Foes",
            "Sci-Fi",
            "Strange things keep happening to you - who, or what, is behind it?",
            0
        )
    )
}