package com.comic.catalog.resource

import com.comic.catalog.domain.User
import com.comic.catalog.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserResource (private val service: UserService) {

    @GetMapping("{id}")
    fun findById(@PathVariable id: Long): User {
        return service.findById(id);
    }

    @PostMapping
    fun insert(@RequestBody user: User): User {
        return service.save(user);
    }

    @DeleteMapping("{id}")
    fun deleteById(@PathVariable id: Long) {
        service.deleteById(id)
    }

}