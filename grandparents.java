public class grandparents extends Surname {

    public grandparents(int id, String Name, int year_of_birth, String Status) {
        super(id, Name, year_of_birth, Status);
    }

    public String PrintGrandparents() {
        return super.getFullName();
    }

    // @Override
    // public String toString() {
    // return String.format("%d %s %d года рождения %s",
    // this.id, this.Name, this.year_of_birth, this.Status);
    // }
}
