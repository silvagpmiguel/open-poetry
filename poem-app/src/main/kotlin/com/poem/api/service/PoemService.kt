package com.poem.api.service

import com.poem.api.model.Poem
import com.poem.api.repositories.PoemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PoemService {
    @Autowired
    private lateinit var poemRep: PoemRepository

    fun getPoems(): List<Poem> = poemRep.findAll()

    fun nextPoem(id:Long): Poem? = poemRep.findNext(id).orElse(null)

    fun previousPoem(id:Long): Poem? = poemRep.findPrevious(id).orElse(null)

    fun createPoem(poem:Poem): Poem = poemRep.saveAndFlush(poem)
}
