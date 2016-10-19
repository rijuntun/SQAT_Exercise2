import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	
	@Test
	public void test_createPlanet_100_100() {
		PlanetExplorer pe=new PlanetExplorer(100,100,"");
		assertEquals( "X=100", 100, pe.getGridx());
		assertEquals( "Y=100", 100, pe.getGridy());
		
	}

	@Test
	public void test_execute_EmptyCommand() {
		PlanetExplorer pe=new PlanetExplorer(100,100,"");
		String status = pe.executeCommand("");
		assertEquals("Status should be 0,0 facing north","0,0,N",status);
	}

	@Test
	public void test_execute_CommandRight() {
		PlanetExplorer pe=new PlanetExplorer(100,100,"");
		String status = pe.executeCommand("r");
		assertEquals("Status should be 0,0 facing east","0,0,E",status);
	}
	
	@Test
	public void test_execute_CommandLeft() {
		PlanetExplorer pe=new PlanetExplorer(100,100,"");
		String status = pe.executeCommand("l");
		assertEquals("Status should be 0,0 facing west","0,0,W",status);
	}

	@Test
	public void test_execute_CommandForward() {
		PlanetExplorer pe=new PlanetExplorer(7,6,"");
		String status = pe.executeCommand("f");
		assertEquals("Status should be 7,7 facing North","7,7,W",status);
	}

	/*
	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	*/
}
