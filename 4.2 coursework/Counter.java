
/**
 * Write a description of class Counter here.
 * 
 * @author (Donatas Stonys, 11834559)
 */

public class Counter
{
  long counter;
  public long getValue()
  {
       return counter;
  }
  
  public void reset()
  {
      counter = 0;
  }
  
  public void inc()
  {
      counter ++;
  }
  
  public void dec()
  {
      counter --;
  }
  
  public void add5()
  {
      counter = counter + 5;
  }
  
  public void add10()
  {
      counter = counter + 10;
  }
  // Extra button to round the output to the nearest ten
  public void round()
  {
      counter = ((counter + 5)/10)*10;
  }
}
