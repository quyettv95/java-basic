package test_area.hello2;

import test_area.hello.Hello;

public final class Hi extends Hello {
  private String message = "Hello World2";

  public String getMessage()
  {
    return this.message;
  }

  public String getMessage(String str)
  {
    return this.message + str;
  }
}
