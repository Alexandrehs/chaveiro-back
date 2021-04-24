package com.chaveiro.estoquedeprodutos.rest

import javax.validation.constraints.NotBlank

data class ItemRequest(
    @field:NotBlank
    val name : String?,
    @field:NotBlank
    val brand : String?,
    @field:NotBlank
    val price : String?,
    @field:NotBlank
    val storage : String?
)