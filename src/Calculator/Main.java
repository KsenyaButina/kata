package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите с новой строки выражение: 2 + 2 " + " После ввода нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String tvit = scanner.nextLine();
        String calc = calc(tvit);
        System.out.println(calc);
    }

    public static String calc(String input) {
        String otvet;
        String[] arr = input.split("\s");
        if (arr.length > 3) {
            throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (arr.length != 3) {
            throw new RuntimeException("строка не является математической операцией");
        }
        int num1;
        String or = arr[1];
        int num2;
        boolean roman = false;
        try {
            num1 = Integer.parseInt(arr[0]);
            num2 = Integer.parseInt(arr[2]);
        } catch (Exception e) {
            try {
                num1 = NumberRim.valueOf(arr[0]).getNum();
                num2 = NumberRim.valueOf(arr[2]).getNum();
                roman = true;
            } catch (IllegalArgumentException q) {
                throw new RuntimeException("число от I до X");
            } catch (Exception p) {
                throw new RuntimeException("используются одновременно разные системы счисления");
            }
        }
        if (roman) {
            Rim rim = new Rim(num1, or, num2);
            otvet = rim.calculatorRimsk2();
        } else {
            Arabic arabic = new Arabic(num1, or, num2);
            otvet = arabic.znakVirajenya() + "";
        }
        return otvet;
    }

    static class Arabic {
        int num1;
        String or;
        int num2;
        int sum1;

        public Arabic(int num1, String or, int num2) {
            this.num1 = num1;
            this.or = or;
            this.num2 = num2;
            if (this.num1 < 0 || this.num1 > 10 || this.num2 < 0 || this.num2 > 10) {
                throw new RuntimeException("Неверное число");
            }
        }

        int znakVirajenya() {
            String[] or1 = {"+", "-", "*", "/"};
            for (String or0 : or1) {
            }
            switch (or) {
                case "+":
                    if (num1 >= 0 & num1 <= 10 & num2 >= 0 & num2 <= 10) {
                        sum1 = num1 + num2;

                    } else {
                        System.out.println("Вы неверно ввели число");
                        break;
                    }
                    break;
                case "-":
                    if (num1 >= 0 & num1 <= 10 & num2 >= 0 & num2 <= 10) {
                        sum1 = num1 - num2;

                    } else {
                        System.out.println("Вы неверно ввели число");
                        break;
                    }
                    break;
                case "*":
                    if (num1 >= 0 & num1 <= 10 & num2 >= 0 & num2 <= 10) {
                        sum1 = num1 * num2;

                    } else {
                        System.out.println("Вы неверно ввели число");
                        break;
                    }
                    break;
                case "/":
                    if (num1 >= 0 & num1 <= 10 & num2 > 0 & num2 <= 10) {
                        sum1 = num1 / num2;

                    } else if (num2 == 0) {
                        try {
                            num2 = 0;
                        } catch (Exception e) {
                        }
                        System.out.println("Делить на 0 нельзя");
                        break;
                    } else {
                        System.out.println("Вы неверно ввели число");
                        break;
                    }
                    break;

                default:
                    System.out.println("Введите верный оператор: +,-,*,/");
            }
            return sum1;

        }
    }

    static class Rim {
        int numI;
        String or;
        int numII;
        int sumI = 0;

        public Rim(int numI, String or, int numII) {
            this.numI = numI;
            this.or = or;
            this.numII = numII;
            if (this.numI < 0 || this.numI > 10 || this.numII < 0 || this.numII > 10) {
                throw new RuntimeException("Неверное число");
            }
        }

        String calculatorRimsk2() {
            String[] orI = {"+", "-", "*", "/"};
            for (String or0 : orI) {
            }
            switch (or) {
                case "+":
                    sumI = numI + numII;
                    break;
                case "-":
                    sumI = numI - numII;
                    //  System.out.println(sumI);
                    break;
                case "*":
                    sumI = numI * numII;
                    //   System.out.println(sumI);
                    break;
                case "/":
                    sumI = numI / numII;
                    // System.out.println(sumI);
                    break;
                default:
                    System.out.println("Введите верный оператор: +,-,*,/");
            }

            switch (sumI) {
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    return "II";
                case 3:
                    return "III";
                case 4:
                    return "IV";
                case 5:
                    return "V";
                case 6:
                    return "VI";
                case 7:
                    return "VII";
                case 8:
                    return "VIII";
                case 9:
                    return "IX";
                case 10:
                    return "X";
                case 11:
                    return "XI";
                case 12:
                    return "XII";
                case 13:
                    return "XIII";
                case 14:
                    return "XIV";
                case 15:
                    return "XV";
                case 16:
                    return "XVI";
                case 17:
                    return "XVII";
                case 18:
                    return "XVIII";
                case 19:
                    return "XIX";
                case 20:
                    return "XX";
                case 21:
                    return "XXI";
                case 22:
                    return "XXII";
                case 23:
                    return "XXIII";
                case 24:
                    return "XXIV";
                case 25:
                    return "XXV";
                case 26:
                    return "XXVI";
                case 27:
                    return "XXVII";
                case 28:
                    return "XXVIII";
                case 29:
                    return "XXIX";
                case 30:
                    return "XXX";
                case 31:
                    return "XXXI";
                case 32:
                    return "XXXII";
                case 33:
                    return "XXXIII";
                case 34:
                    return "XXXIV";
                case 35:
                    return "XXXV";
                case 36:
                    return "XXXVI";
                case 37:
                    return "XXXVII";
                case 38:
                    return "XXXVIII";
                case 39:
                    return "XXXIX";
                case 40:
                    return "XL";
                case 41:
                    return "XLI";
                case 42:
                    return "XLII";
                case 43:
                    return "XLIII";
                case 44:
                    return "XLIV";
                case 45:
                    return "XLV";
                case 46:
                    return "XLVI";
                case 47:
                    return "XLVII";
                case 48:
                    return "XLVIII";
                case 49:
                    return "XLIX";
                case 50:
                    return "L";
                case 51:
                    return "LI";
                case 52:
                    return "LII";
                case 53:
                    return "LIII";
                case 54:
                    return "LIV";
                case 55:
                    return "LV";
                case 56:
                    return "LVI";
                case 57:
                    return "LVII";
                case 58:
                    return "LVIII";
                case 59:
                    return "LIX";
                case 60:
                    return "LX";
                case 61:
                    return "LXI";
                case 62:
                    return "LXII";
                case 63:
                    return "LXIII";
                case 64:
                    return "LXIV";
                case 65:
                    return "LXV";
                case 66:
                    return "LXVI";
                case 67:
                    return "LXVII";
                case 68:
                    return "LXVIII";
                case 69:
                    return "LXIX";
                case 70:
                    return "LXX";
                case 71:
                    return "LXXI";
                case 72:
                    return "LXXII";
                case 73:
                    return "LXXIII";
                case 74:
                    return "LXXIV";
                case 75:
                    return "LXXV";
                case 76:
                    return "LXXVI";
                case 77:
                    return "LXXVII";
                case 78:
                    return "LXXVIII";
                case 79:
                    return "LXXIX";
                case 80:
                    return "LXXX";
                case 81:
                    return "LXXXI";
                case 82:
                    return "LXXXII";
                case 83:
                    return "LXXXIII";
                case 84:
                    return "LXXXIV";
                case 85:
                    return "LXXXV";
                case 86:
                    return "LXXXVI";
                case 87:
                    return "LXXXVII";
                case 88:
                    return "LXXXVIII";
                case 89:
                    return "LXXXIX";
                case 90:
                    return "XXC";
                case 91:
                    return "XCI";
                case 92:
                    return "XCII";
                case 93:
                    return "XCIII";
                case 94:
                    return "XCIV";
                case 95:
                    return "XCV";
                case 96:
                    return "XCVI";
                case 97:
                    return "XCVII";
                case 98:
                    return "XCVIII";
                case 99:
                    return "XCIX";
                case 100:
                    return "C";
                default:
                    throw new RuntimeException("римской системе нет отрицательных чисел");

            }
            return null;
        }

    }

    enum NumberRim {
        I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

        int numberRim;
        int num;

        NumberRim(int numRim) {
            this.numberRim = numRim;
            this.num = numRim;
        }

        public int getNumberRim() {
            return numberRim;
        }

        public int getNum() {
            return num;
        }
    }
}







