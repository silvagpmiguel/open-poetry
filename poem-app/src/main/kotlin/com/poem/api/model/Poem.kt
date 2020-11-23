package com.poem.api.model

import java.util.Date
import javax.persistence.*

@Entity
class Poem(
    @Column(name = "title", nullable = false, length = 48)
    val title: String,
    @Column(name = "poem", nullable = false, length = 255)
    val poem: String,
    @Column(name = "likes")
    val likes: Long = 0,
    @Column(name = "creation_date")
    val creationDate: Date?,
    @ManyToOne(cascade = [(CascadeType.MERGE)])
    @JoinColumn(name = "user_id")
    val user: User,
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "_user_user_id_seq")
    @SequenceGenerator(name = "_user_user_id_seq", sequenceName = "_user_user_id_seq", allocationSize = 1)
    val poem_id: Long = 0
) {
    constructor() : this("", "", 0, null, User(), -1)
}
