public abstract class Surname {
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

    @Override
    public String toString() {
        return String.format("%d %s %d года рождения %s",
                this.id, this.Name, this.year_of_birth, this.Status);
    }
}
