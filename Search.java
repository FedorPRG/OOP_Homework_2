import java.util.ArrayList;
import java.util.Scanner;

public class Search {

    public void SearchParents(ArrayList<Surname> people) {
        while (true) {
            System.out.println("Поиск родителей человека");
            Print.PrintPeople(people);
            Scanner input = new Scanner(System.in);
            System.out.printf("Введите id человека:");
            int idPeople = input.nextInt();
            var p = people.get(idPeople);
            if (p instanceof grandchildren) {
                for (Surname parent : people) {
                    if (parent instanceof childrens) {
                        System.out.println(parent.getFullName());
                    }
                }
            }
            if (p instanceof childrens) {
                for (Surname parent : people) {
                    if (parent instanceof parents) {
                        System.out.println(parent.getFullName());
                    }
                }
            }
            if (p instanceof parents) {
                for (Surname parent : people) {
                    if (parent instanceof grandparents) {
                        System.out.println(parent.getFullName());
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
            Print.PrintPeople(people);
            Scanner input = new Scanner(System.in);
            System.out.printf("Введите id человека:");
            int idPeople = input.nextInt();
            var p = people.get(idPeople);
            if (p instanceof grandchildren) {
                for (Surname parent : people) {
                    if (parent instanceof parents) {
                        System.out.println(parent.getFullName());
                    }
                }
            }
            if (p instanceof childrens) {
                for (Surname parent : people) {
                    if (parent instanceof grandparents) {
                        System.out.println(parent.getFullName());
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
