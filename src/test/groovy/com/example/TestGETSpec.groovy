package com.example


import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Shared
import spock.lang.Specification

@MicronautTest
class TestGetSpec extends Specification {

    @Shared
    @Inject
    HttpClient httpClient

    def cleanup() {
        println("TestGETSpec:: Calling cleanup() function")

        executeGetRequest()
    }

    def cleanupSpec() {
        println("TestGETSpec:: Calling cleanupSpec() function")

        executeGetRequest()
    }

    def "test HTTP request with ReactorHttpClient"() {
        when:
        HttpResponse<Object> response = executeGetRequest()

        then:
        response.status.code == 200
    }

    private HttpResponse<Object> executeGetRequest() {
        return httpClient.toBlocking().exchange(
                HttpRequest.GET("https://jsonplaceholder.typicode.com/posts/1")
                        .accept(MediaType.APPLICATION_JSON),
                Object
        )

    }
}