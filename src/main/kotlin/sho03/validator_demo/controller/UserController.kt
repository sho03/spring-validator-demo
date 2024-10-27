package sho03.validator_demo.controller

import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {

    @PostMapping
    fun registerUser(
        @Valid @RequestBody userRequest: User
    ): ResponseEntity<String> {
        return ResponseEntity.ok("Hello, ${userRequest.name}!! Your age is ${userRequest.age}.")
    }

    data class User(
        @field:NotBlank
        val name: String,
        val age: Int
    )
}
