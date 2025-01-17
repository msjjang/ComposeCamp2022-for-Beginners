package com.example.android.unscramble.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false,
    val score: Int = 0,
    var currentWordCount: Int = 0,
    var isGameOver: Boolean = false
)
