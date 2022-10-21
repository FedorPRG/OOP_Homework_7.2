import java.util.ArrayList;
import java.util.Scanner;

public class Print {
  Scanner input = new Scanner(System.in);

  public void PrintPeople(ArrayList<Surname> people) {
    System.out.printf("Вывести на экран список людей? (0-да, 1-нет):");
    int a = input.nextInt();
    if (a == 0) {
      for (Surname human : people) {
        System.out.println(human);
      }
    }
  }
}
