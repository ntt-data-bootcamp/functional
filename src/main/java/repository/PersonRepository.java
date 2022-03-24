package repository;

import model.Person;

import java.util.List;
import java.util.stream.Stream;

public interface PersonRepository {
  List<Person> getAll();
  Stream<Person> getAllStream();
}
