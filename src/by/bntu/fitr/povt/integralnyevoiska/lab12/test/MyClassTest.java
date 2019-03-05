package by.bntu.fitr.povt.integralnyevoiska.lab12.test;

import by.bntu.fitr.povt.integralnyevoiska.lab12.logic.LocMinCounter;

import org.junit.Test;
import org.junit.Assert;

public class MyClassTest {

    @Test
    public void testLocMinInAllTheSame()
    {
        int[][] array = {{0,0,0},{0,0,0},{0,0,0}};
        int expected = 0;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInTheCentre()
    {
        int[][] array = {{0,0,0},{0,-1,0},{0,0,0}};
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInTheRightUpCorner()
    {
        int[][] array = {{-1,0,0},{0,0,0},{0,0,0}};
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInTheMiddleUp()
    {
        int[][] array = {{0,-1,0},{0,0,0},{0,0,0}};
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInTheLeftUpCorner()
    {
        int[][] array = {{0,0,-1},{0,0,0},{0,0,0}};
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInTheMiddleLeft()
    {
        int[][] array = {{0,0,0},{-1,0,0},{0,0,0}};
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInTheMiddleRight()
    {
        int[][] array = {{0,0,0},{0,0,-1},{0,0,0}};
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInTheLeftDownCorner()
    {
        int[][] array = {{0,0,0},{0,0,0},{-1,0,0}};
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInTheMiddleDown()
    {
        int[][] array = {{0,0,0},{0,0,0},{0,-1,0}};
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInTheRightDownCorner()
    {
        int[][] array = {{0,0,0},{0,0,0},{0,0,-1}};
        int expected = 1;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testLocMinInAllDifferent()
    {
        int[][] array = {{5,-8,4},{2,3,-9},{-6,-12,-1}};
        int expected = 3;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

    @Test
    public void testOneNumber()
    {
        int [][] array = {{2}};
        int expected = 0;
        Assert.assertEquals(expected,LocMinCounter.countLocalMinimums(array));
    }

}