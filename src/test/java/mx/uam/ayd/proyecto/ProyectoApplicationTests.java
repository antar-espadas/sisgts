package mx.uam.ayd.proyecto;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;

@DisabledIfSystemProperty( named = "java.awt.headless", matches = "true")
@SpringBootTest
class ProyectoApplicationTests {

	@BeforeAll
	static void setUp(){
		if (!GraphicsEnvironment.isHeadless())
			System.setProperty("java.awt.headless", "false");
	}

	@Test
	void contextLoads() {
	}

}
