package com.example.module20_test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Module20TestApplicationTests {

	@Test
	void contextLoads() {
		String expectedTitle = "Title";
		String content = "Content";

		Note note = new Note(expectedTitle, content);

		assertEquals(expectedTitle, note.getTitle());
	}

}
