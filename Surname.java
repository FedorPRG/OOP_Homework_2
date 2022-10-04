public class Surname {
    protected Integer id;
    protected String Name;
    protected Integer year_of_birth;
    protected String Status;

    public Surname(int id, String Name, int year_of_birth, String Status) {
        this.id = id;
        this.Name = Name;
        this.year_of_birth = year_of_birth;
        this.Status = Status;
    }

    public String getFullName() {
        return id + " " + Name + " " + year_of_birth + " года рождения" + " " + Status;
    }

    public String getStatus() {
        return Status;
    }

    // public String get_f_Name() {
    // return Name;
    // }

    // public Integer getIdName() {
    // return id;
    // }

    // public Integer getYear_of_birth() {
    // return year_of_birth;
    // }

    @Override
    public String toString() {
        return String.format("%d %s %d года рождения %s",
                this.id, this.Name, this.year_of_birth, this.Status);
    }
}
