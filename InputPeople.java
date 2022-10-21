import java.util.ArrayList;
import java.util.Scanner;

public class InputPeople {
  Scanner input = new Scanner(System.in);

  public void InputPeopl(ArrayList<Surname> ivanov) {
    System.out.printf("Введите количество дополнительныйх записей (можно 0):");
    int amount = input.nextInt();
    for (int i = 0; i < amount; i++) {
      String[] data = InputName();
      String name = data[0];
      int year_of_birth = Integer.parseInt(data[1]);
      String status = data[2];
      Integer id = ivanov.get(ivanov.size()-1).GetId();
      id=id+1;
      switch (status) {
        case "grandparents":
          ivanov.add(new Grandparents(id, name, year_of_birth, status));
          break;
        case "parents":
          ivanov.add(new Parents(id, name, year_of_birth, status));
          break;
        case "childrens":
          ivanov.add(new Childrens(id, name, year_of_birth, status));
          break;
        case "grandchildren":
          ivanov.add(new Grandchildren(id, name, year_of_birth, status));
          break;
      }
    }
  }

  public String[] InputName() {
    while (true) {

      System.out      
          .print("Введите имя, год рождения и статус (1-прародитель; 2-родитель; 3-ребенок; 4-внук) через пробелы: ");
      input.nextLine();
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
}
