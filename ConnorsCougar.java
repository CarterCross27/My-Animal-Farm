public class Cougar extends Turtle
{ 
  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
  public Cougar(World wref)
  {
    super(wref);
    Picture pic = new Picture("/Users/nwestfall/Downloads/cartoon-character-seahorse-22315033.jpg");
    this.drop(pic);
    this.hide();
  }
  
  /**
   * Constructor that takes the x and y position and the
   * model displayer
   * @param x the x pos
   * @param y the y pos
   * @param display the model display
   */
  public Cougar(int x, int y, World wref)
  {
    super(x, y, wref);
  }
}