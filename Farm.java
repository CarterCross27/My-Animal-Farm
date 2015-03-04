public class Farm
{
    public static void main(String[] a)
    {
       World wref = new World();
       CartersDolphin ex1 = new CartersDolphin(wref);
<<<<<<< HEAD
       ex1.drawH();
=======
       Dog doug = new Dog(wref);
       doug.getDistance(100,100);
       doug.turnToFace(ex1);
       
>>>>>>> FETCH_HEAD
    }
}
