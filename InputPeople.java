import java.util.Scanner;

public class InputPeople {
  public static String[] InputName() {
    while (true) {
      Scanner input = new Scanner(System.in);
      System.out
          .print("Введите имя, год рождения и статус (1-прародитель; 2-родитель; 3-ребенок; 4-внук) через пробелы: ");
      String[] str = input.nextLine().split(" ");

      if (Integer.parseInt(str[1]) > 2022) {
        System.out.printf("Год рождения %s введен не коректно (человек еще не родился)\n", str[2]);
        continue;
      }

      if (Integer.parseInt(str[2]) < 1 && Integer.parseInt(str[2]) > 4) {
        System.out.printf("Статус %s введен не корректно", str[2]);
        continue;
      }
      switch (Integer.parseInt(str[2])) {
        case 1:
          str[2] = "grandparents";
          break;
        case 2:
          str[2] = "parents";
          break;
        case 3:
          str[2] = "childrens";
          break;
        case 4:
          str[2] = "grandchildren";
          break;
      }
      return str;
    }
  }
  // input.close();
}

