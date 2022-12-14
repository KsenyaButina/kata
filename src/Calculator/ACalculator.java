package Calculator;

import java.util.Scanner;

public class ACalculator {

    public static void main(String[] args) {
        System.out.println("Введите с новой строки выражение: 2 + 2 " + " После ввода нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String tvit = scanner.nextLine();
        String[] arr = tvit.split("\s");
        if (arr.length > 3) {
            throw new RuntimeException ("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if ( arr.length !=3){
            throw new RuntimeException ("строка не является математической операцией");
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
            } catch (IllegalArgumentException q){
                throw new RuntimeException ("число от I до X");
            }
            catch (Exception p) {
                throw new RuntimeException("используются одновременно разные системы счисления");
            }
        }
        if (roman) {
            Rim rim = new Rim(num1, or, num2);
        } else {
            Arabic arabic = new Arabic(num1, or, num2);
        }

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
            znakVirajenya();
        }

        void znakVirajenya() {
            String[] or1 = {"+", "-", "*", "/"};
            for (String or0 : or1) {
            }
            switch (or) {
                case "+":
                    if (num1 >= 0 & num1 <= 10 & num2 >= 0 & num2 <= 10) {
                        sum1 = num1 + num2;
                        System.out.println(sum1);
                    } else {
                        System.out.println("Вы неверно ввели число");
                        break;
                    }
                    break;
                case "-":
                    if (num1 >= 0 & num1 <= 10 & num2 >= 0 & num2 <= 10) {
                        sum1 = num1 - num2;
                        System.out.println(sum1);
                    } else {
                        System.out.println("Вы неверно ввели число");
                        break;
                    }
                    break;
                case "*":
                    if (num1 >= 0 & num1 <= 10 & num2 >= 0 & num2 <= 10) {
                        sum1 = num1 * num2;
                        System.out.println(sum1);
                    } else {
                        System.out.println("Вы неверно ввели число");
                        break;
                    }
                    break;
                case "/":
                    if (num1 >= 0 & num1 <= 10 & num2 > 0 & num2 <= 10) {
                        sum1 = num1 / num2;
                        System.out.println(sum1);
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
            calculatorRimsk2();
        }

        void calculatorRimsk2() {
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
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    break;
                case 11:
                    System.out.println("XI");
                    break;
                case 12:
                    System.out.println("XII");
                    break;
                case 13:
                    System.out.println("XIII");
                    break;
                case 14:
                    System.out.println("XIV");
                    break;
                case 15:
                    System.out.println("XV");
                    break;
                case 16:
                    System.out.println("XVI");
                    break;
                case 17:
                    System.out.println("XVII");
                    break;
                case 18:
                    System.out.println("XVIII");
                    break;
                case 19:
                    System.out.println("XIX");
                    break;
                case 20:
                    System.out.println("XX");
                    break;
                case 21:
                    System.out.println("XXI");
                    break;
                case 22:
                    System.out.println("XXII");
                    break;
                case 23:
                    System.out.println("XXIII");
                    break;
                case 24:
                    System.out.println("XXIV");
                    break;
                case 25:
                    System.out.println("XXV");
                    break;
                case 26:
                    System.out.println("XXVI");
                    break;
                case 27:
                    System.out.println("XXVII");
                    break;
                case 28:
                    System.out.println("XXVIII");
                    break;
                case 29:
                    System.out.println("XXIX");
                    break;
                case 30:
                    System.out.println("XXX");
                    break;
                case 31:
                    System.out.println("XXXI");
                    break;
                case 32:
                    System.out.println("XXXII");
                    break;
                case 33:
                    System.out.println("XXXIII");
                    break;
                case 34:
                    System.out.println("XXXIV");
                    break;
                case 35:
                    System.out.println("XXXV");
                    break;
                case 36:
                    System.out.println("XXXVI");
                    break;
                case 37:
                    System.out.println("XXXVII");
                    break;
                case 38:
                    System.out.println("XXXVIII");
                    break;
                case 39:
                    System.out.println("XXXIX");
                    break;
                case 40:
                    System.out.println("XL");
                    break;
                case 41:
                    System.out.println("XLI");
                    break;
                case 42:
                    System.out.println("XLII");
                    break;
                case 43:
                    System.out.println("XLIII");
                    break;
                case 44:
                    System.out.println("XLIV");
                    break;
                case 45:
                    System.out.println("XLV");
                    break;
                case 46:
                    System.out.println("XLVI");
                    break;
                case 47:
                    System.out.println("XLVII");
                    break;
                case 48:
                    System.out.println("XLVIII");
                    break;
                case 49:
                    System.out.println("XLIX");
                    break;
                case 50:
                    System.out.println("L");
                    break;
                case 51:
                    System.out.println("LI");
                    break;
                case 52:
                    System.out.println("LII");
                    break;
                case 53:
                    System.out.println("LIII");
                    break;
                case 54:
                    System.out.println("LIV");
                    break;
                case 55:
                    System.out.println("LV");
                    break;
                case 56:
                    System.out.println("LVI");
                    break;
                case 57:
                    System.out.println("LVII");
                    break;
                case 58:
                    System.out.println("LVIII");
                    break;
                case 59:
                    System.out.println("LIX");
                    break;
                case 60:
                    System.out.println("LX");
                    break;
                case 61:
                    System.out.println("LXI");
                    break;
                case 62:
                    System.out.println("LXII");
                    break;
                case 63:
                    System.out.println("LXIII");
                    break;
                case 64:
                    System.out.println("LXIV");
                    break;
                case 65:
                    System.out.println("LXV");
                    break;
                case 66:
                    System.out.println("LXVI");
                    break;
                case 67:
                    System.out.println("LXVII");
                    break;
                case 68:
                    System.out.println("LXVIII");
                    break;
                case 69:
                    System.out.println("LXIX");
                    break;
                case 70:
                    System.out.println("LXX");
                    break;
                case 71:
                    System.out.println("LXXI");
                    break;
                case 72:
                    System.out.println("LXXII");
                    break;
                case 73:
                    System.out.println("LXXIII");
                    break;
                case 74:
                    System.out.println("LXXIV");
                    break;
                case 75:
                    System.out.println("LXXV");
                    break;
                case 76:
                    System.out.println("LXXVI");
                    break;
                case 77:
                    System.out.println("LXXVII");
                    break;
                case 78:
                    System.out.println("LXXVIII");
                    break;
                case 79:
                    System.out.println("LXXIX");
                    break;
                case 80:
                    System.out.println("LXXX");
                    break;
                case 81:
                    System.out.println("LXXXI");
                    break;
                case 82:
                    System.out.println("LXXXII");
                    break;
                case 83:
                    System.out.println("LXXXIII");
                    break;
                case 84:
                    System.out.println("LXXXIV");
                    break;
                case 85:
                    System.out.println("LXXXV");
                    break;
                case 86:
                    System.out.println("LXXXVI");
                    break;
                case 87:
                    System.out.println("LXXXVII");
                    break;
                case 88:
                    System.out.println("LXXXVIII");
                    break;
                case 89:
                    System.out.println("LXXXIX");
                    break;
                case 90:
                    System.out.println("XXC");
                    break;
                case 91:
                    System.out.println("XCI");
                    break;
                case 92:
                    System.out.println("XCII");
                    break;
                case 93:
                    System.out.println("XCIII");
                    break;
                case 94:
                    System.out.println("XCIV");
                    break;
                case 95:
                    System.out.println("XCV");
                    break;
                case 96:
                    System.out.println("XCVI");
                    break;
                case 97:
                    System.out.println("XCVII");
                    break;
                case 98:
                    System.out.println("XCVIII");
                    break;
                case 99:
                    System.out.println("XCIX");
                    break;
                case 100:
                    System.out.println("C");
                    break;
                default:
                    throw new RuntimeException ("римской системе нет отрицательных чисел");

            }

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







