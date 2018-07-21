package com.shaadi.profile

import io.kotlintest.specs.ShouldSpec
import io.kotlintest.*

class ProfileTests : StringSpec({
    "act should be done" {
        ShaadiProfile().act() shouldBe "DONE"
    }

}