import repository.PersonRepository;
import repository.PersonRepositoryImpl;
import service.PersonService;
import service.PrintService;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Programming");
    PersonService service = new PersonService(new PersonRepositoryImpl());

    //service.showPeople();
    //service.showPeopleEach();
    //service.showPeopleLambda();
    //service.showPeopleLambdaReference();
    //service.showPeopleLambdaReferenceMinimal();
    service.showPeopleStream();
    System.out.println("---------------------");
    service.showPeopleFilter();
    System.out.println("---------------------");
    service.showPeopleMap();
    System.out.println("---------------------");
    service.showPeopleMapOther();
    System.out.println("---------------------");
    service.showPeopleMapReduce();
    System.out.println("---------------------");
  }
}
