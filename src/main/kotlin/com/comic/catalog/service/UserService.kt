package com.comic.catalog.service

import com.comic.catalog.domain.User
import com.comic.catalog.enum.MessageEnum
import com.comic.catalog.exception.EntityNotFoundException
import com.comic.catalog.repository.UserRepository
import org.springframework.context.MessageSource
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(private val repository: UserRepository, private val messageSource: MessageSource) {

    fun findById(id: Long): User {
        return repository.findById(id).orElseThrow{ EntityNotFoundException(messageSource.getMessage(MessageEnum.ENTITY_NOT_FOUND.message,arrayOf(User::class.toString(),id),Locale.ROOT)) }
    }

    fun save(user: User): User {
        return repository.save(user)
    }

}