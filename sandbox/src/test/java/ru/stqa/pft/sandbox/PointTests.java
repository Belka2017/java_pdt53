package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {
        Point p1 = new Point (30, 20);
        Point p2 = new Point (90, 45);
        assert p1.distance(p2) == 65;
    }

}
