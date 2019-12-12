import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {

      List<Collection.personne> listP = Arrays.asList(
          new Collection.personne(1.80, 70, "A", "Nicolas", Collection.couleur.BLEU),
          new Collection.personne(1.56, 50, "B", "Nicole", Collection.couleur.VERRON),
          new Collection.personne(1.75, 65, "C", "Germain", Collection.couleur.VERT),
          new Collection.personne(1.68, 50, "D", "Michel", Collection.couleur.ROUGE),
          new Collection.personne(1.96, 65, "E", "Cyrille", Collection.couleur.BLEU),
          new Collection.personne(2.10, 120, "F", "Denis", Collection.couleur.ROUGE),
          new Collection.personne(1.90, 90, "G", "Olivier", Collection.couleur.VERRON)
      );

    MethodStream.forEach(listP);

    MethodStream.filter(listP);

    MethodStream.filterMap(listP);

    MethodStream.filterMapReduce(listP);

    MethodStream.optionnal(listP);

    MethodStream.count(listP);

    MethodStream.collector(listP);

//    MethodStream.files();
  }
}
