package com.comic.catalog.config

import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import java.util.*

@Configuration
class AppConfiguration {

    @Bean
    fun messageSource(): MessageSource  {
        val messageSource : ReloadableResourceBundleMessageSource = ReloadableResourceBundleMessageSource()
        messageSource.setBasenames("classpath:/messages/message.properties")
        messageSource.setDefaultEncoding("UTF-8")
        return messageSource
    }


}