import java.util.ArrayList;
import java.util.Scanner;

public class Program {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    ArrayList<Surname> ivanov = new ArrayList<>();
    PeopleRead p = new PeopleRead();
    InputPeople inp = new InputPeople();
    Print pr = new Print();
    PeopleWrit pw = new PeopleWrit();

    p.PRead("people.txt", ivanov);
    pr.PrintPeople(ivanov);
    inp.InputPeopl(ivanov);    
    pr.PrintPeople(ivanov);
    pw.PWrite("people.txt", ivanov);
    Search s = new Search();
    s.SearchParents(ivanov);
    s.SearchGrandParents(ivanov);
  }
}
