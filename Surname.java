public abstract class Surname {
    protected Integer id;
    protected String name;
    protected Integer year_of_birth;
    protected String status;

    public Surname(int id, String name, int year_of_birth, String status) {
        this.id = id;
        this.name = name;
        this.year_of_birth = year_of_birth;
        this.status = status;
    }

    public String GetFullName() {
        return id + " " + name + " " + year_of_birth + " года рождения" + " " + status;
    }

    public String GetStatus() {
        return status;
    }

    public Integer GetId() {
        return id;
    }


    @Override
    public String toString() {
        return String.format("%d %s %d года рождения %s",
                this.id, this.name, this.year_of_birth, this.status);
    }
}
