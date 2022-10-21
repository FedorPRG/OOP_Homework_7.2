import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PeopleRead {
  Scanner input = new Scanner(System.in);

  public void PRead(String text, ArrayList<Surname> ivanov) throws Exception {
    System.out.printf("Загрузить список людей из файла? (0-да, 1-нет):");
    int a = input.nextInt();
    if (a == 0) {
      FileReader pr = new FileReader(text);
      Scanner scan = new Scanner(pr);
      while (scan.hasNextLine()) {
        String[] data = scan.nextLine().split(" ");
        int id = Integer.parseInt(data[0]);
        String name = data[1];
        int year_of_birth = Integer.parseInt(data[2]);
        String Status = data[5];
        switch (Status) {
          case "grandparents":
            ivanov.add(new Grandparents(id, name, year_of_birth, Status));
            break;
          case "parents":
            ivanov.add(new Parents(id, name, year_of_birth, Status));
            break;
          case "childrens":
            ivanov.add(new Childrens(id, name, year_of_birth, Status));
            break;
          case "grandchildren":
            ivanov.add(new Grandchildren(id, name, year_of_birth, Status));
            break;
        }
      }
      scan.close();
      pr.close();
    }
  }
}
