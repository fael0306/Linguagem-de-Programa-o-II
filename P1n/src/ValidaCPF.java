public class ValidaCPF {

  static boolean isCPF(String CPF) {

    CPF = CPF.replaceAll("[^0-9]", "");
    if (CPF.length() != 11) {
      return false;
    }

    if (CPF.equals("00000000000") ||
      CPF.equals("11111111111") ||
      CPF.equals("22222222222") || CPF.equals("33333333333") ||
      CPF.equals("44444444444") || CPF.equals("55555555555") ||
      CPF.equals("66666666666") || CPF.equals("77777777777") ||
      CPF.equals("88888888888") || CPF.equals("99999999999")) {
      return false;
    }

    int soma = 0;
    for (int i = 0; i < 9; i++) {
      soma += Character.getNumericValue(CPF.charAt(i)) * (10 - i);
    }
    int primeiroDigito = 11 - (soma % 11);
    if (primeiroDigito >= 10) {
      primeiroDigito = 0;
    }

    soma = 0;
    for (int i = 0; i < 10; i++) {
      soma += Character.getNumericValue(CPF.charAt(i)) * (11 - i);
    }
    int segundoDigito = 11 - (soma % 11);
    if (segundoDigito >= 10) {
      segundoDigito = 0;
    }

    if (Character.getNumericValue(CPF.charAt(9)) != primeiroDigito && Character.getNumericValue(CPF.charAt(10)) != segundoDigito) {
      return false;
    }

    return true;
  }

  static long toLong(String CPF) {
  
    long CPFconvertido;

    CPF = CPF.replaceAll("[^0-9]", "");

    CPFconvertido = Long.parseLong(CPF);
    return CPFconvertido;
  }
}