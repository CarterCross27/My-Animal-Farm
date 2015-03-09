public class Farm
{
    public static void main(String[] a)
    {
       Picture pic = new Picture("jumping_dolphin.jpg");
       World wref = new World();
       wref.setPicture(pic);
       CartersDolphin ex1 = new CartersDolphin(wref);
       ex1.drawH();
       Dog doug = new Dog(wref);
       doug.getDistance(100,100);
       doug.turnToFace(ex1);

    }
}
