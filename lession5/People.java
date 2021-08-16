package lession5;

public abstract class People {
  protected String name;
  protected int age;

  public void display()
  {
    System.out.println("Name:" + this.name);
    System.out.println("Age:" + this.age);
  }

  public abstract void work();
}
