import java.util.ArrayList;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws Exception {
    ArrayList<Surname> Ivanov = new ArrayList<>();
    PeopleRead p =new PeopleRead();
    p.PRead("people.txt", Ivanov);
    Print.PrintPeople(Ivanov);

    Scanner input = new Scanner(System.in);
    System.out.printf("Введите количество дополнительныйх записей (можно 0):");
    int amount = input.nextInt();
    // input.close();
    for (int i = 0; i < amount; i++) {
      String[] Data = InputPeople.InputName();
      String Name = Data[0];
      int year_of_birth = Integer.parseInt(Data[1]);
      String Status = Data[2];
      switch (Status) {
        case "grandparents":
          Ivanov.add(new grandparents(i, Name, year_of_birth, Status));
          break;
        case "parents":
          Ivanov.add(new parents(i, Name, year_of_birth, Status));
          break;
        case "childrens":
          Ivanov.add(new childrens(i, Name, year_of_birth, Status));
          break;
        case "grandchildren":
          Ivanov.add(new grandchildren(i, Name, year_of_birth, Status));
          break;
      }
    }
    Print.PrintPeople(Ivanov);
    PeopleWrit.PWrite("people.txt", Ivanov);
    Search s = new Search();
    s.SearchParents(Ivanov);
    s.SearchGrandParents(Ivanov);   
  }
}
