package lession5;

import test.Hello;

public class example_1 {
  public static void main(String[] args) {
    // People p = new People();
    // p.name = "Quyet";
    Phone iphone = new Phone("Iphone", "Apple");
    Phone xaomi = new Phone("Redmi 6", "Xiaomi");

    // System.out.println(p.name);

    // Hello h = new Hello("Hi");
    // System.out.println(h.message);
    // System.out.println(h.getMessage());
    // h.setMessage("Hello");
    // System.out.println(h.getMessage());

    Student st = new Student("Tran Van Quyet", 26, 8);
    Student st2 = new Student("Nguyen Thi A", 25, 10, xaomi);
    // Worker w = new Worker();
    // w.work();
    st.setPhone(iphone);
    // st.display();
    st.work();
    st2.work();
    st2.display();
    // // System.out.println(st.getName());
    // float score = st.getScore();
    // System.out.println(score);
    // st.display();
    // String name = st.getName();
    // System.out.println(name);
  }
}
