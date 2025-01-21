import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
  @Test
  public void testLAppears3TimesInHelloWorld(){
    // arrange
    CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello world");
    // act
    int actual = counter.getFrequency('l');
    // assert
    assertEquals(3, actual);
  }    

  @Test
  public void testNonOccurringCharacterPercentageIsZero(){
    // arrange
    CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");
    // act
    double actualPercent = counter.getRelativePercentage('z');
    // assert
    assertEquals(0.0, actualPercent, 0.0001);
  }    
}