package com.comic.catalog.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ResourceBundleMessageSource



@Configuration
class AppConfig {

    @Bean
    fun messageSource(): ResourceBundleMessageSource {
        val source = ResourceBundleMessageSource()
        source.setBasenames("messages/messages")
        source.setUseCodeAsDefaultMessage(true)
        return source
    }

}