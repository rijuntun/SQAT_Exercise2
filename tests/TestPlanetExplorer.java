import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	PlanetExplorer pe=new PlanetExplorer(100,100,"");
	@Test
	public void test_createPlanet_100_100() {
		
		assertEquals( "X=100", 100, pe.getGridx());
		assertEquals( "Y=100", 100, pe.getGridy());
		
	}

	@Test
	public void test_execute_EmptyCommand() {
		String status = pe.executeCommand("");
		assertEquals("Status should be 0,0 facing north","0,0,N",status);
	}

	/*
	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	*/
}
