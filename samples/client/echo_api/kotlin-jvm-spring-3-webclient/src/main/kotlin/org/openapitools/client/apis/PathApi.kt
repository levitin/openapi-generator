/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import com.fasterxml.jackson.annotation.JsonProperty

import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.WebClientResponseException
import org.springframework.http.codec.json.Jackson2JsonDecoder
import org.springframework.http.codec.json.Jackson2JsonEncoder
import org.springframework.http.ResponseEntity
import org.springframework.http.MediaType
import reactor.core.publisher.Mono
import org.springframework.util.LinkedMultiValueMap

import org.openapitools.client.models.StringEnumRef
import org.openapitools.client.infrastructure.*

class PathApi(client: WebClient) : ApiClient(client) {

    constructor(baseUrl: String) : this(WebClient.builder()
        .baseUrl(baseUrl)
        .codecs {
            it.defaultCodecs().jackson2JsonEncoder(Jackson2JsonEncoder(Serializer.jacksonObjectMapper, MediaType.APPLICATION_JSON))
            it.defaultCodecs().jackson2JsonDecoder(Jackson2JsonDecoder(Serializer.jacksonObjectMapper, MediaType.APPLICATION_JSON))
        }
        .build()
    )

    /**
     * enum for parameter enumNonrefStringPath
     */
    enum class EnumNonrefStringPathTestsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath(val value: kotlin.String) {
        @JsonProperty(value = "success") success("success"),
        @JsonProperty(value = "failure") failure("failure"),
        @JsonProperty(value = "unclassified") unclassified("unclassified"),
    }


    @Throws(WebClientResponseException::class)
    fun testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath(pathString: kotlin.String, pathInteger: kotlin.Int, enumNonrefStringPath: EnumNonrefStringPathTestsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath, enumRefStringPath: StringEnumRef): Mono<kotlin.String> {
        return testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathWithHttpInfo(pathString = pathString, pathInteger = pathInteger, enumNonrefStringPath = enumNonrefStringPath, enumRefStringPath = enumRefStringPath)
            .map { it.body }
    }

    @Throws(WebClientResponseException::class)
    fun testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathWithHttpInfo(pathString: kotlin.String, pathInteger: kotlin.Int, enumNonrefStringPath: EnumNonrefStringPathTestsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath, enumRefStringPath: StringEnumRef): Mono<ResponseEntity<kotlin.String>> {
        val localVariableConfig = testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathRequestConfig(pathString = pathString, pathInteger = pathInteger, enumNonrefStringPath = enumNonrefStringPath, enumRefStringPath = enumRefStringPath)
        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    fun testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathRequestConfig(pathString: kotlin.String, pathInteger: kotlin.Int, enumNonrefStringPath: EnumNonrefStringPathTestsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath, enumRefStringPath: StringEnumRef) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "text/plain"

        val params = mutableMapOf<String, Any>(
            "path_string" to pathString,
            "path_integer" to pathInteger,
            "enum_nonref_string_path" to enumNonrefStringPath.value,
            "enum_ref_string_path" to enumRefStringPath,
        )

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/path/string/{path_string}/integer/{path_integer}/{enum_nonref_string_path}/{enum_ref_string_path}",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

}
