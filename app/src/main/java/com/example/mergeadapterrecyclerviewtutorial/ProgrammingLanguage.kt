package com.example.mergeadapterrecyclerviewtutorial

data class ProgrammingLanguage(
    val name: String,
    val paradigm: String
)

val programmingLanguages = listOf(
    ProgrammingLanguage("Kotlin", "Orientação a Objetos, Funcional"),
    ProgrammingLanguage("Java", "Orientação a Objetos"),
    ProgrammingLanguage("Swift", "Orientação a Objetos, Funcional"),
    ProgrammingLanguage("PHP", "Orientação a Objetos"),
    ProgrammingLanguage("Python", "Orientação a Objetos"),
    ProgrammingLanguage("C#", "Orientação a Objetos")
)