public class Farm
{
    public static void main(String[] a)
    {
       Picture pic = new Picture("jumping_dolphin.jpg");
       World wref = new World();
       wref.setPicture(pic);
       CartersDolphin ex1 = new CartersDolphin(wref);
       Squirrel russell=new Squirrel(wref);
       russell.setWidth(10);
    russell.setHeight(25);
    russell.forward(100);
    russell.turnRight();
    russell.forward(50);
    russell.turnRight();
    russell.forward(100);
    russell.turnLeft();
    russell.forward(70);
    russell.turnLeft();
    russell.forward(90);
    russell.turnRight();
    russell.forward(20);
    russell.turnRight();
    russell.forward(100);
    russell.turnRight();
    russell.forward(20);
    russell.turnRight();
    russell.forward(90);
    russell.turnLeft();
    russell.forward(80);
    russell.turnLeft();
    russell.forward(100);
    russell.turnRight();
    russell.forward(20);
    russell.turnRight();

       ex1.drawH();
       Dog doug = new Dog(wref);
       doug.getDistance(100,100);
       doug.turnToFace(ex1);

    }
}
