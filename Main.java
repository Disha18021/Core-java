class Room
{
  float length;
  float breadth;
  Room(float x, float y)
  {
    length = x;
    breadth = y;
  }
  Room(float x)
  {
    length = breadth = x;
  }
  float area()
  {
    return (length * breadth);
  }
}

public class Main 
{
  public static void main(String args[])
  {
    Room rect = new Room(10,5);
    System.out.println(rect.area());
    Room square = new Room(10);
    System.out.println(square.area());
  }
}
