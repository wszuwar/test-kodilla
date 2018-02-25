package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    // addFigure(Shape shape), removeFigure(Shape shape), getFigure(int n) oraz showFigures()
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        //When
        shapeCollector.getShapes().add(circle);
        ArrayList<Shape> result = shapeCollector.getShapes();
        //Then
        Assert.assertTrue(result.contains(circle));

    }
    @Test
    public void testRemoveFigure(){
        //Given
        Triangle triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.getShapes().add(triangle);
        //When
        shapeCollector.getShapes().remove(triangle);
        ArrayList<Shape> result = new ArrayList<>();
        //Then
        Assert.assertEquals(result,shapeCollector.getShapes());
    }
    @Test
    public void testGetFigure(){
        //Given
        Square square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.getShapes().add(square);
        //When
        shapeCollector.getShapes().get(0);
        //Then
        Assert.assertEquals(square, shapeCollector.getShapes().get(0));

    }
    @Test
    public void testShowFigures(){
        //Given
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.getShapes().add(circle);
        shapeCollector.getShapes().add(triangle);
        shapeCollector.getShapes().add(square);
        //When
        String s = " ";
        for (int i=0; i<shapeCollector.getShapes().size(); i++){

            s += shapeCollector.getShapes().get(i).getShapeName()+ " ";

        }
        String allRemoved = s.replaceAll("^\\s+|\\s+$", "");
        String result = "Circle Triangle Square";
        //Then
        Assert.assertEquals(result,allRemoved);
    }
}
