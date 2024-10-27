package sho03.validator_demo.controller

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
        @RequestBody userRequest: User
    ): ResponseEntity<String> {
        return ResponseEntity.ok("Hello, ${userRequest.name}!! Your age is ${userRequest.age}.")
    }

    data class User(
        val name: String,
        val age: Int
    )
}
