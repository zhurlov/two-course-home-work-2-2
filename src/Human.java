import java.time.LocalDate;

public class Human {
    public String name, jobTitle;
    private int yearOfBirth, dob;
    private String town;

    Human(String name, String jobTitle, int yearOfBirth, String town) {
        if (name == null || jobTitle == null) {
            throw new IllegalArgumentException("Информация не указана при выводе в консоль");
        }
        this.name = name;
        this.jobTitle = jobTitle;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        // LocalDate.now().getYear();


    }

    int getYearOfBirth() {
        return yearOfBirth;
    }

    void setYearOfBirth() {
        if (yearOfBirth <= 0) {
            throw new IllegalArgumentException("не правильно задан год");
        }
    }

    String getTown() {
        return this.town;
    }

    void setTown() {
        if (town == null || town.isEmpty()) {
            throw new IllegalArgumentException("Информация не указана при выводе в консоль");
        }
    }

    void men() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + " .Будем знакомы!");
    }

    void girls() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родилась в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + " .Будем знакомы!");
    }

    int getDob() {
        this.dob = LocalDate.now().getYear() - yearOfBirth;
        return dob;
    }
}




