package sho03.validator_demo.controller

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    fun registerUser(
        @RequestBody userRequest: UserRequest
    ) {
        // TODO register User
    }

    data class UserRequest(
        val name: String,
        val age: Int
    )
}
