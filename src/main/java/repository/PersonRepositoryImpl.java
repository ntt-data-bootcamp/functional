package repository;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonRepositoryImpl implements PersonRepository{
  @Override
  public List<Person> getAll() {
    List<Person> people = new ArrayList<>();
    people.add(new Person(1, "Carlos Molina", 25));
    people.add(new Person(2, "Jose Molina", 20));
    people.add(new Person(3, "Maria Molina", 15));
    people.add(new Person(4, "Juan Molina", 10));
    people.add(new Person(5, "Rosa Molina", 5));
    people.add(new Person(6, "Manuel Molina", 30));
    people.add(new Person(7, "Jesus Molina", 35));

    return people;
  }

  @Override
  public Stream<Person> getAllStream() {
    return getAll().stream();
  }
}
