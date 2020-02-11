package pixLab;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images\\beach.jpg");
    beach.explore();
    //beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testNegate() {
	  Picture beach = new Picture("images\\beach.jpg");
	  beach.explore();
	  beach.Negate();
	  beach.explore();

  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("images\\beach.jpg");
	  beach.explore();
	  beach.KeepOnlyBlue();
	  beach.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testMirrorVertical();
    //testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
	//testHorizontalBotToTop();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }

private static void testMirrorDiagonal() {
	Picture beach = new Picture("images\\beach.jpg");
	  beach.explore();
	  beach.MirrorDiagonal();
	  beach.explore();
	
	
}

private static void testHorizontalBotToTop() {
	Picture beach = new Picture("images\\beach.jpg");
	  beach.explore();
	  beach.HorizontalBotToTop();
	  beach.explore();
	
}

@SuppressWarnings("unused")
private static void testFixUnderwater() {
	Picture beach = new Picture("images\\water.jpg");
	  beach.explore();
	  beach.fixUnderwater();
	  beach.explore();
	
}

public static void testGrayscale() {
	Picture beach = new Picture("images\\beach.jpg");
	  beach.explore();
	  beach.Grayscale();
	  beach.explore();
	
}
}