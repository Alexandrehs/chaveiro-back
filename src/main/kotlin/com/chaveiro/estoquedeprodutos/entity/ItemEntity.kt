package com.chaveiro.estoquedeprodutos.entity

import com.chaveiro.estoquedeprodutos.rest.ItemRequest
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "items")
data class ItemEntity (
    @Id
    val id : String?,
    val name : String?,
    val brand : String?,
    val price : String?,
    val storage : String?
) {
    constructor(itemRequest: ItemRequest) : this (
        id = UUID.randomUUID().toString(),
        name = itemRequest.name,
        brand = itemRequest.brand,
        price = itemRequest.price,
        storage = itemRequest.storage
    )
}