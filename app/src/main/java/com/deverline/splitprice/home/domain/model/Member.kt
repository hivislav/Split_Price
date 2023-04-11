package com.deverline.splitprice.home.domain.model

data class Member(
    val id: Long,
    val name: String,
    val credit: Int,
    val isPayer: Boolean
)