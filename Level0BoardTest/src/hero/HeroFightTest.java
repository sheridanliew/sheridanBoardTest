package hero;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class HeroFightTest {
	
	@Test
	public void testvalues() {
	 assertEquals(HeroFight.hero(10, 5), true);
	 assertEquals(HeroFight.hero(7, 4), false);
	 assertEquals(HeroFight.hero(4, 5), false);
	 assertEquals(HeroFight.hero(100, 40), true);
	 assertEquals(HeroFight.hero(1500, 751), false);
	 assertEquals(HeroFight.hero(0, 1), false);
	}
	
	

	boolean sol(int bullets, int dragons) {
	  return bullets/2>=dragons;
	}
	
	public void test2() {
	  for(int i=0; i<100; i++) {
	    int bullets=(int)Math.random()*1000|0;
	    int dragons=(int)Math.random()*bullets|0;
	    assertEquals(HeroFight.hero(bullets,dragons),sol(bullets,dragons));
	  }
	}
}