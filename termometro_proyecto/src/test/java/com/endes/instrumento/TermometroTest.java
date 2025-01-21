package com.endes.instrumento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TermometroTest {

	private Termometro termometro;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Antes de todas las pruebas");
	}
	
	@BeforeEach
	void setUp() throws Exception{
		termometro = new Termometro(0);
	}
	
	@Test
	@DisplayName ("Prueba del constructor")
	void testConstructor() {
		double resultadoEsperado = 0;
		double resultado= termometro.getTemperaturaCelsius();
		assertEquals (resultadoEsperado, resultado, "No es igual al obtener la temperatura");
	
	}
	@Test
	@DisplayName ("Devuelve la temperatura")
	public void ajustarTemperatura() {
		double resultadoEsperado= 1;
		 termometro.ajustarTemperatura(1);
		 assertEquals (resultadoEsperado, termometro.getTemperaturaCelsius(), "No es igual al obtener la temperatura");
	}
	
	@Test
	@DisplayName ("Devuelve la temperatura en celsius")
	public void setTemperaturaCelsius() {
		double resultadoEsperado= 10;
		termometro.setTemperaturaCelsius(10);
		assertEquals (resultadoEsperado, termometro.getTemperaturaCelsius(), "No es igual al obtener la temperatura");
		
	}
	
	@Test
	@DisplayName("Está en ebullición")
	public void esEbullicion() {
		
	}
	


}
