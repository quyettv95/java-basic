package test;

public class Hello {
  String message = "Xin chào";
  float money;

  public Hello(String message)
  {
    this.message = message;
  }

  String getMessage() {
    return this.message;
  }

  void setMessage(String message) {
    this.message = message;
  }
}
