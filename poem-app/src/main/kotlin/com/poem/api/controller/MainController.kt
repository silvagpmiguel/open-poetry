package com.poem.api.controller

import com.poem.api.model.Poem
import com.poem.api.model.User
import com.poem.api.service.PoemService
import com.poem.api.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
class MainController(val userService: UserService, val poemService: PoemService) {

    @GetMapping("/user")
    fun getUsers(): List<User> = userService.getUsers()

    @GetMapping("/user/get")
    fun getUserProfile(@RequestParam user: String): User = userService.getProfile(user)

    @PostMapping("/user/create")
    fun registerUser(@RequestBody user: User) = userService.register(user)

    @PostMapping("/user/update")
    fun updateUser(@RequestBody user: User) = userService.update(user)

    @GetMapping("/poem")
    fun getPoems(): List<Poem> = poemService.getPoems()

    @GetMapping("/poem/previous")
    fun getPreviousPoem(@RequestParam id: Long): Poem? = poemService.previousPoem(id)

    @GetMapping("/poem/next")
    fun getNextPoem(@RequestParam id: Long): Poem? = poemService.nextPoem(id)

    @PostMapping("/poem/create")
    fun createPoem(@RequestBody poem: Poem): Poem = poemService.createPoem(poem)
}
