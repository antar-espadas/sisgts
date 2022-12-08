package mx.uam.ayd.proyecto;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;

@DisabledIf("java.awt.GraphicsEnvironment.isHeadless()")
@SpringBootTest
class ProyectoApplicationTests {

	@BeforeAll
	static void setUp(){
		System.setProperty("java.awt.headless", "false");
	}

	@Test
	void contextLoads() {
	}

}
