public class Person{
    private int id;
    private String name;
    private char sex;
    private int salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Person(int id, String name, char sex, int salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", sex=" + sex + ", salary=" + salary + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + sex;
        result = prime * result + salary;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (sex != other.sex)
            return false;
        if (salary != other.salary)
            return false;
        return true;
    }
    
}
