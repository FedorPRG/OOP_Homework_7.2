import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    Scanner input = new Scanner(System.in);
    Print pr = new Print();

    public void SearchParents(ArrayList<Surname> people) {

        while (true) {
            System.out.println("Поиск родителей человека");
            pr.PrintPeople(people);
            System.out.printf("Введите id человека:");
            int idPeople = input.nextInt();
            var p = people.get(idPeople);
            if (p instanceof Grandchildren) {
                for (Surname parent : people) {
                    if (parent instanceof Childrens) {
                        System.out.println(parent.GetFullName());
                    }
                }
            }
            if (p instanceof Childrens) {
                for (Surname parent : people) {
                    if (parent instanceof Parents) {
                        System.out.println(parent.GetFullName());
                    }
                }
            }
            if (p instanceof Parents) {
                for (Surname parent : people) {
                    if (parent instanceof Grandparents) {
                        System.out.println(parent.GetFullName());
                    }
                }
            }
            System.out.println("Продолжить поиск? (0-да, 1-нет):");
            int a = input.nextInt();
            if (a == 0) {
                continue;
            } else {
                return;
            }
        }

    }

    public void SearchGrandParents(ArrayList<Surname> people) {
        while (true) {
            System.out.println("Поиск прародителей человека");
            pr.PrintPeople(people);
            System.out.printf("Введите id человека:");
            int idPeople = input.nextInt();
            var p = people.get(idPeople);
            if (p instanceof Grandchildren) {
                for (Surname parent : people) {
                    if (parent instanceof Parents) {
                        System.out.println(parent.GetFullName());
                    }
                }
            }
            if (p instanceof Childrens) {
                for (Surname parent : people) {
                    if (parent instanceof Grandparents) {
                        System.out.println(parent.GetFullName());
                    }
                }
            }
            System.out.println("Продолжить поиск? (0-да, 1-нет):");
            int a = input.nextInt();
            if (a == 0) {
                continue;
            } else {
                return;
            }
        }
    }
}
