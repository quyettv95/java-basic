package lession5;

public class Student extends People {
  private float score;
  private float maxscore = 10;
  public Phone phone;

  Student(String name, int age, float score)
  {
    this.name = name;
    this.age = age;
    this.score = score;
  }

  Student(String name, int age, float score, Phone phone)
  {
    this.name = name;
    this.age = age;
    this.score = score;
    this.phone = phone;
  }

  public void setPhone(Phone phone)
  {
    this.phone = phone;
  }

  void setScore(float score)
  {
    this.score = score;
  }

  void setMaxScore(float score)
  {
    this.maxscore = score;
  }

  public float getScore() {
    return this.score;
  }

  public String getName()
  {
    return this.name;
  }

  public void work()
  {
    System.out.println("Work in school");
  }

  public void display() {
    super.display();
    float score = this.getScore();
    System.out.println("Score:" + score);
    System.out.println("Phone:" + this.phone.name + "-" + this.phone.manufacture);

  }
}
