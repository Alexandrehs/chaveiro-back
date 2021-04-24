package com.chaveiro.estoquedeprodutos.rest

import com.chaveiro.estoquedeprodutos.entity.ItemEntity
import com.chaveiro.estoquedeprodutos.repository.ItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/item")
class ItemResource {

    @Autowired
    lateinit var repository: ItemRepository

    @PostMapping
    fun itemCreate(@RequestBody item : ItemRequest) : ResponseEntity<HttpStatus> {
        repository.save(ItemEntity(item))
        return ResponseEntity(HttpStatus.CREATED)
    }

    @GetMapping
    fun ItemsCreated() : ResponseEntity<List<ItemEntity>> {
        val items = repository.findAll()

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(items)
    }
}