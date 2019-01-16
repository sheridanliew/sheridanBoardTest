package banjo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BanjoTest {
  @Test
  public void PeopleThatDontPlayBanjo() {
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Adam"), "Adam does not play banjo");
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Paul"), "Paul does not play banjo");
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("bravo"), "bravo does not play banjo");
  }
  @Test
  public void PeopleThatDoPlayBanjo() {
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Ringo"), "Ringo plays banjo");
    assertEquals( "Nope! Remember lower case counts, too!" , Banjo.areYouPlayingBanjo("rolf"), "rolf plays banjo");
  }
}