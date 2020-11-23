package com.poem.api.repositories

import com.poem.api.model.Poem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PoemRepository : JpaRepository<Poem, Long>{
    @Query("select * from poem where poem_id = (select max(poem_id) from poem where poem_id < ?1)", nativeQuery = true)
    fun findPrevious(id:Long): Optional<Poem>
    @Query("select * from poem where poem_id = (select min(poem_id) from poem where poem_id > ?1)", nativeQuery = true)
    fun findNext(id:Long): Optional<Poem>
}