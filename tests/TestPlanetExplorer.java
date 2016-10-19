import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_createPlanet_100_100() {
		PlanetExplorer pe=new PlanetExplorer(100,100,"");
		assertEquals( "X=100", 100, pe.getGridx());
		assertEquals( "Y=100", 100, pe.getGridy());
		
	}
	/*
	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	*/
}
