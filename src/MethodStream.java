
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MethodStream {

  public static void forEach(List<Collection.personne> listP) {
    System.out.println("\nFor each stream");
    listP.stream().forEach(System.out::println);
  }

  public static void filter(List<Collection.personne> listP) {
    System.out.println("\nAprès le filtre");
    listP.stream()
        .filter(x -> x.getPoids() > 50)
        .forEach(System.out::println);
  }

  public static void filterMap(List<Collection.personne> listP) {
    System.out.println("\nAprès le filtre, le map");
    listP.stream()
        .filter(x -> x.getPoids() > 50)
        .map(x -> x.getPoids()).forEach(System.out::println);
  }

  public static void filterMapReduce(List<Collection.personne> listP) {
    System.out.println("\nAprès le filtre, le map et reduce");
    Double sum = listP.stream()
        .filter(x -> x.getPoids() > 50)
        .map(x -> x.getPoids())
        .reduce(0.0d,(x, y) -> x + y);
    System.out.println(sum);
  }

  public static void optionnal(List<Collection.personne> listP) {
    System.out.println("\nOptionnal");
    Optional<Double> sum2 = listP.stream().filter(x -> x.getPoids() > 250)
        .map(x -> x.getPoids())
        .reduce((x, y) -> x + y);
    if (sum2.isPresent()) {
      System.out.println(sum2.get());
    } else {
      System.out.println("Aucun aggrégat de poids ...");
    }
  }

  public static void count(List<Collection.personne> listP) {
    System.out.println("\nCount");
    long count = listP.stream().filter(x -> x.getPoids() > 60).map(x -> x.getPoids()).count();
    System.out.println("Nombre d'élément " + count);
  }

  public static void collector(List<Collection.personne> listP) {
    System.out.println("\nCollector");
    List<Double> ld = listP.stream().filter(x -> x.getPoids() > 50 ).map(x -> x.getPoids()).collect(Collectors.toList());
    System.out.println(ld);
  }

  public static void files() {
    System.out.println("\nFiles");
    String fileName = "C:/Users/Antony/Documents/OpenClassroom/FluxInOut/IO/test2.txt";
    try{
      Files.lines(Paths.get(fileName)).forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
