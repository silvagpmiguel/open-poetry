package com.poem.api.repositories

import com.poem.api.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : JpaRepository<User, Long>{
    fun findByUsername(username:String): Optional<User>
}