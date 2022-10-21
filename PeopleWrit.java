import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PeopleWrit {
  Scanner input = new Scanner(System.in);

  public void PWrite(String text, ArrayList<Surname> people) throws Exception {
    System.out.printf("Записать список людей в файл? (0-да, 1-нет):");
    int a = input.nextInt();
    if (a == 0) {
      FileWriter pw = new FileWriter(text, false);
      for (Surname human : people) {
        pw.write(human.GetFullName() + "\n");
      }
      pw.flush();
      pw.close();
    }
  }
}
