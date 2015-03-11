import java.awt.Color;

public class CartersDolphin extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public CartersDolphin(World wref)
  {
    super(wref);
    Color shellColor = new Color(100, 149, 237); 
    this.setShellColor(shellColor);
    Color bodyColor = new Color(100, 149, 237);
    this.setBodyColor(bodyColor);
    Color infoColor = new Color(10, 10, 10);
    this.setInfoColor(infoColor);
    //Color infoColor = new Color(10, 10, 10);
    this.setWidth(10);
    this.setHeight(25);
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public CartersDolphin(int x, int y, World wref)
  {
    super(x, y, wref);
  }
  
  public void drawH()
  {
    //this.forward(200);
    this.animateForward(200,50);
    this.turnRight();
    this.animateForward(20,25);
    this.turnRight();
    this.animateForward(90,30);
    this.turnLeft();
    this.animateForward(70,30);
    this.turnLeft();
    this.animateForward(90,30);
    this.turnRight();
    this.animateForward(20,25);
    this.turnRight();
    this.animateForward(200,50);
    this.turnRight();
    this.animateForward(20,25);
    this.turnRight();
    this.animateForward(90,30);
    this.turnLeft();
    this.animateForward(70,30);
    this.turnLeft();
    this.animateForward(90,30);
    this.turnRight();
    this.animateForward(20,25);
    this.turnRight();
  }
  
  private void animateForward(int x, int y)
  {
    x = x/20;
    System.out.println(x);
    for(int i = 0; i < 20; i++)
    {
     this.forward(x);
     try
     {
       Thread.sleep(y);
     } catch (InterruptedException ex) {}
    }
  }
}