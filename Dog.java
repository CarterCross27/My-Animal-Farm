public class Dog extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Dog(World wref)
  {
    super(wref);
    this.setWidth(10);
    this.setHeight(25);
    this.forward(-200);
    this.turnRight();
    this.forward(-20);
    this.turnRight();
    this.forward(-90);
    this.turnLeft();
    this.forward(-70);
    this.turnLeft();
    this.forward(-90);
    this.turnRight();
    this.forward(-20);
    this.turnRight();
    this.forward(-200);
    this.turnRight();
    this.forward(-20);
    this.turnRight();
    this.forward(-90);
    this.turnLeft();
    this.forward(-70);
    this.turnLeft();
    this.forward(-90);
    this.turnRight();
    this.forward(-20);
    this.turnRight();
    
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Dog(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}