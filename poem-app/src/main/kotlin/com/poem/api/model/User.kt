package com.poem.api.model

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "_user")
class User (
    @Column(name="username", nullable=false)
    val username: String,
    @Column(name="password", nullable=true)
    val password: String?,
    @Column(name="email", nullable=true)
    val email: String?,
    @Column(name="creation_date", nullable=true)
    val creationDate: Date?,
    @Column(name="last_login", nullable=true)
    var lastLogin: Date?,
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "poem_poem_id_seq")
    @SequenceGenerator(name = "poem_poem_id_seq", sequenceName = "poem_poem_id_seq", allocationSize = 1)
    val user_id: Long = 0
){
    constructor() : this("", null, null, null, null)
    constructor(user:String) : this(user, null, null, null, null)
}