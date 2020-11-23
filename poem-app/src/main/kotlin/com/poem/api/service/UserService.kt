package com.poem.api.service

import com.poem.api.model.User
import com.poem.api.repositories.UserRepository
import java.util.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {
    @Autowired
    private lateinit var userRep: UserRepository

    fun getUsers(): List<User> = userRep.findAll()

    fun getProfile(username: String): User {
        var user = userRep.findByUsername(username).orElse(null)
        if (user == null) {
            return userRep.save(User(username))
        } else {
            user.lastLogin = Date()
            return user
        }
    }

    fun register(user: User) = userRep.save(user)

    fun update(user: User) = userRep.saveAndFlush(user)
}
