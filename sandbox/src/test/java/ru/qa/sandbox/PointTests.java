package ru.qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lero on 4/24/16.
 */
public class PointTests {
  @Test
  public void testPoint () {
    Point p1 = new Point(2,5);
    Point p2 = new Point(8,10);
    Assert.assertEquals(p1.getDistance(p2), 7.810249675906654);
  }
}



