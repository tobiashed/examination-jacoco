package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	@Test
	public void testCalculateOutputBasedOnNames() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
		int j = game.calculateOutPutBasedOnNames("Rafael", "Silvaaaaa");
		assertEquals("The result should be 0", j, 0);
		int k = game.calculateOutPutBasedOnNames("Rafael", "Silvaa");
		assertEquals("The result should be 2", k, 2);
		
	}
	@Test
	public void testCalculateOutputBasedOnGender() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
		int j = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", j, 1);
		int k = game.calculateOutPutBasedOnGender('O');
		assertEquals("The result should be 2", k, 2);
		
	}
	@Test
	public void testCalculateOutputBasedOnAge() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(20);
		assertEquals("The result should be 0", i, 0);
		int j = game.calculateOutPutBasedOnAge(30);
		assertEquals("The result should be 1", j, 1);
		
	}
	@Test
	public void testCalculateOutputBasedOnHomeCity() {
		Game game = new Game();
		int i = 0; 
		i = game.calculateOutPutBasedOnHomeCity("a");
		assertEquals("The result should be 0", i, 0);
		i = game.calculateOutPutBasedOnHomeCity("b");
		assertEquals("The result should be 1", i, 1);
		i = game.calculateOutPutBasedOnHomeCity("c");
		assertEquals("The result should be 2", i, 2);
		i = game.calculateOutPutBasedOnHomeCity("d");
		assertEquals("The result should be 3", i, 3);
		i = game.calculateOutPutBasedOnHomeCity("e");
		assertEquals("The result should be 4", i, 4);
		i = game.calculateOutPutBasedOnHomeCity("f");
		assertEquals("The result should be 5", i, 5);
		i = game.calculateOutPutBasedOnHomeCity("g");
		assertEquals("The result should be 6", i, 6);
		i = game.calculateOutPutBasedOnHomeCity("h");
		assertEquals("The result should be 7", i, 7);
		i = game.calculateOutPutBasedOnHomeCity("i");
		assertEquals("The result should be 8", i, 8);
		i = game.calculateOutPutBasedOnHomeCity("j");
		assertEquals("The result should be 9", i, 9);
		i = game.calculateOutPutBasedOnHomeCity("k");
		assertEquals("The result should be 10", i, 10);
		
	}
	@Test
	public void testRun() {
		//DataAnalysis dataAnalysis = new DataAnalysis();
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		game.run(values);
		//assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
			//	result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	
}
