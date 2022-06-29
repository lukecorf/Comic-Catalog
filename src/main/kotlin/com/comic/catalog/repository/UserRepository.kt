package com.comic.catalog.repository

import com.comic.catalog.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}