import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PeopleRead {
  public void PRead(String text, ArrayList<Surname> Ivanov) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.printf("Загрузить список людей из файла? (0-да, 1-нет):");
    int a = input.nextInt();
    // input.close();
    if (a == 0) {
      FileReader pr = new FileReader(text);
      Scanner scan = new Scanner(pr);
      while (scan.hasNextLine()) {
        String[] Data = scan.nextLine().split(" ");
        int id = Integer.parseInt(Data[0]);
        String Name = Data[1];
        int year_of_birth = Integer.parseInt(Data[2]);
        String Status = Data[5];
        switch (Status) {
          case "grandparents":
            Ivanov.add(new grandparents(id, Name, year_of_birth, Status));
            break;
          case "parents":
            Ivanov.add(new parents(id, Name, year_of_birth, Status));
            break;
          case "childrens":
            Ivanov.add(new childrens(id, Name, year_of_birth, Status));
            break;
          case "grandchildren":
            Ivanov.add(new grandchildren(id, Name, year_of_birth, Status));
            break;
        }
      }
      scan.close();
      pr.close();
    }
  }
}
