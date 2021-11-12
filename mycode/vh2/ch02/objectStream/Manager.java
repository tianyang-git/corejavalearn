package ch02.objectStream;

import java.time.LocalDate;

public class Manager extends Employee
{
    private Employee secretary;

    public Manager(Employee secretary) {
        this.secretary = secretary;
    }

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.secretary = null;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n[secretary=" + secretary + "]";
    }
}
