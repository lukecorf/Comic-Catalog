package com.comic.catalog.domain

import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


@Entity
@Table(name = "USER")
class User (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USER")
    @SequenceGenerator(name = "SEQ_USER", sequenceName = "SEQ_USER", allocationSize = 1)
    @Column(name = "ID")
    var id: Long,

    @NotNull(message = "User name cannot be null")
    @Size(max = 155, message = "The username can have a maximum of 155 characters")
    @Column(name = "NAME")
    var name: String,

    @NotNull(message = "Email cannot be null")
    @Size(max = 155, message = "The email can have a maximum of 155 characters")
    @Column(name = "EMAIL")
    var email: String,

    @NotNull(message = "Nickname cannot be null")
    @Size(max = 50, message = "The nickname can have a maximum of 50 characters")
    @Column(name = "NICKNAME")
    var nickname: String,

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, max = 20, message = "The password can have a maximum of 50 characters and minimum 8 characters")
    @Column(name = "PASSWORD")
    var password: String

)