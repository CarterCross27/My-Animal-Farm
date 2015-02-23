public class CartersDolphin extends Dolphin
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public CartersDolphin(World wref)
  {
    super(wref);
    Color shellColor = new Color(200, 50, 10); 
    this.setShellColor(shellColor);
    Color bodyColor = new Color(250, 30, 10);
    this.setBodyColor(bodyColor);
    Color infoColor = new Color(10, 10, 10);
    this.setInfoColor(infoColor);
    Color infoColor = new Color(10, 10, 10);
    this.setWidth(10);
    this.setHeight(25):
    
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
}