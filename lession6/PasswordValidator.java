package lession6;

import lession6.exceptions.Min8CharacterException;

public class PasswordValidator {
  //Tạo ngoại lệ để validate các trường hợp sau:
  // 1. Tối thiểu 8 ký tự =>>>>>>>>>>>>>>> Min8CharacterException
  // 2. Tối thiểu có 1 chữ Hoa  =>>>>>>>>>>>>>>> HasLeastOneUppercaseException
  // 3. Tối thiểu có 1 chữ thường  =>>>>>>>>>>>>>>> HasLeastOneLowercaseException
  // 4. Tối thiểu có 1 ký tự đặc biệt  =>>>>>>>>>>>>>>> HasLeastSpecialCharacterException

  // public boolean check(String password) throws Min8CharacterException, HasLeastOneUppercaseException, HasLeastOneLowercaseException, HasLeastSpecialCharacterException
  public boolean check(String password) throws Min8CharacterException
  {
    if (password.length() < 8) {
      throw new Min8CharacterException(password);
    }
    return true;
  }

  public static void main(String[] args) {
    PasswordValidator pv = new PasswordValidator();
    try {
      boolean isCheck = pv.check("123");
    } catch (Min8CharacterException e) {
      System.out.println(e.getMessage());
    }
  }
}
