class Converter {
  public String bin(int decimal) {
    String bin = "";
    while (decimal > 0) {
      bin = decimal % 2 + bin;
      decimal /= 2;
    }
    return bin;
  }
}