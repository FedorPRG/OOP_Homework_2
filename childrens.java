public class childrens extends Surname {
    public childrens(int id, String Name, int year_of_birth, String Status) {
        super(id, Name, year_of_birth, Status);
    }

    public String PrintChildren() {
        return super.getFullName();
    }

    public String getName() {
        return super.getFullName();
    }
}
