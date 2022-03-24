package service;

import model.Person;

public class PrintService {
  public static void printSout(Person person) {
    System.out.println(person.getId() + ": " + person.getName() + " (" + person.getAge() + ")");
  }
  public static int idReturn(Person person) {
    return person.getId();
  }
  public static void printSout(Integer id) {
    System.out.println(id);
  }
  public static void printSout(String string) {
    System.out.println(string);
  }
}
