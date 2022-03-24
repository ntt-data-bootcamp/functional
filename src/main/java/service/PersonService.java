package service;

import lombok.AllArgsConstructor;
import model.Person;
import repository.PersonRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class PersonService {
  private final PersonRepository personRepository;

  public void showPeople() {
    List<Person> people = personRepository.getAll();
    for (int i = 0; i < people.size(); i++) {
      Person person = people.get(i);
      System.out.println(person.getId() + ": " + person.getName() + " (" + person.getAge() + ")");
    }
  }

  public void showPeopleEach() {
    List<Person> people = personRepository.getAll();
    for (Person person : people) {
      PrintService.printSout(person);
    }
  }

  public void showPeopleLambda() {
    List<Person> people = personRepository.getAll();
    people.forEach(person -> PrintService.printSout(person));
  }

  public void showPeopleLambdaReference() {
    List<Person> people = personRepository.getAll();
    people.forEach(PrintService::printSout);
  }

  public void showPeopleLambdaReferenceMinimal() {
    personRepository.getAll()
        .forEach(PrintService::printSout);
  }

  public void showPeopleStream() {
    personRepository.getAllStream()
        .collect(Collectors.toList())
        .forEach(PrintService::printSout);
  }

  public void showPeopleFilter() {
    personRepository.getAllStream()
        .filter(person -> person.getAge() > 20)
        .collect(Collectors.toList())
        .forEach(PrintService::printSout);
  }

  public void showPeopleMap() {
    personRepository.getAllStream()
        .filter(person -> person.getAge() > 20)
        .map(PrintService::idReturn)
        .collect(Collectors.toList())
        .forEach(PrintService::printSout);
  }

  public void showPeopleMapOther() {
    personRepository.getAllStream()
        .filter(person -> person.getAge() > 20)
        .map(this::getPair)
        .collect(Collectors.toList())
        .forEach(PrintService::printSout);
  }

  public String getPair(Person person) {
    if (person.getId() % 2 == 0) {
      return "par";
    } else {
      return "impar";
    }
  }

  public void showPeopleMapReduce() {
    Optional<Integer> opcional = personRepository.getAllStream()
        .filter(person -> person.getAge() > 20)
        .map(PrintService::idReturn)
        .reduce(Integer::max);

    System.out.println(opcional.get());
  }





}
