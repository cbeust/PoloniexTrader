package com.zoltu

import kotlin.test.assertEquals
import org.junit.Test

class MainTests {
	@Test
	fun `getGreeting returns "Hello world!"`() {
		assertEquals("Hello world!", getGreeting())
	}
}