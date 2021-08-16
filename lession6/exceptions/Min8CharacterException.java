package lession6.exceptions;

public class Min8CharacterException extends Exception {
  public String str;
  public Min8CharacterException(String str)
  {
    this.str = str;
  }

  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    return "Chuổi bạn nhập không đủ dài, yêu cầu tối thiểu 8 ký tự, bạn chỉ nhập " + this.str.length() + " ký tự";
  }
}
