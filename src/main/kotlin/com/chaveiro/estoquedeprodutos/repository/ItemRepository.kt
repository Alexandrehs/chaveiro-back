package com.chaveiro.estoquedeprodutos.repository

import com.chaveiro.estoquedeprodutos.entity.ItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository : JpaRepository<ItemEntity, String> {
}