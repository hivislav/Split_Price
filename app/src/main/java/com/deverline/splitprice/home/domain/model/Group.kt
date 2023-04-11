package com.deverline.splitprice.home.domain.model

data class Group(
    val id: Long,
    val name: String,
    val members: List<Member>,
    val expenses: List<Expense>
)
