public class ValidaData {
    
  static boolean isDia(int dia) {
    if (dia > 31 || dia < 1) {
      return false;
    }
    return true;
  }

  static boolean isMes(int mes) {
    if (mes > 12 || mes < 1) {
      return false;
    }
    return true;
  }

  static boolean isAno(int ano) {
    if (ano < 1900 || ano > 2023) {
      return false;
    }
    return true;
  }

  static boolean isDia(String dia) {

    int diaint;

    try {
      diaint = Integer.parseInt(dia);

      if (diaint > 31 || diaint < 1) {
        return false;
      }
    } catch (NumberFormatException e) {
      System.out.println(e.getCause());
      return false;
    }

    return true;
  }

  static boolean isMes(String mes) {
    int mesint;

    try {
      mesint = Integer.parseInt(mes);

      if (mesint > 12 || mesint < 1) {
        return false;
      }
    } catch (NumberFormatException e) {
      System.out.println(e.getCause());
      return false;
    }
    return true;
  }

  static boolean isAno(String ano) {
    int anoint;

    try {
      anoint = Integer.parseInt(ano);

      if (anoint > 2023 || anoint < 1900) {
        return false;
      }
    } catch (NumberFormatException e) {
      System.out.println(e.getCause());
      return false;
    }
    return true;
  }
}