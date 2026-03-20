import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        ArrayList<Actor> listOfActors = new ArrayList<>();
        ArrayList<Actor> listOfActorsBallet = new ArrayList<>();
        ArrayList<Actor> listOfActorsOpera = new ArrayList<>();

        String textBallet = "Буря стихает. К берегу острова подплывает Конрад. На его руках Али, потерявший сознание. Конрад выбирается на берег и падает без чувств.";
        String textOpera = "С о л д а т ы\n" +
                            "Оживленною толпою все снует и бежит.\n" +
                            "Странный народ! Куда спешит?\n" +
                            "Странный народ! Куда спешит?\n" +
                            "\n" +
                            "М о р а л е с\n" +
                            "Чтоб скорей проходило время, любим мы подчас\n" +
                            "Курить, болтать и над прохожим подшутить не раз.\n" +
                            "Оживленною толпою все снует и бежит.";

        int hightActor1 = 178;
        int hightActor2 = 175;
        int hightActor3 = 167;

        Actor actor1 = new Actor("Василий","Кузнецов",Gender.MALE,hightActor1);
        Actor actor2 = new Actor("Андрей","Антонов",Gender.MALE,hightActor2);
        Actor actor3 = new Actor("Екатерина","Марченко",Gender.FEMALE,hightActor3);

        Director directorOpera = new Director("Антон","Андреев",Gender.MALE,2);
        Director director = new Director("Валерий","Николаев",Gender.MALE,2);

        Person musicAuthor = new Person("Мария","Сверидова",Gender.FEMALE);
        Person choreographer = new Person("Анна","Маркова",Gender.FEMALE);

        Ballet ballet = new Ballet("Корсар",135,director,listOfActorsBallet,musicAuthor,textBallet,choreographer);
        Opera opera = new Opera("Кармен",200,directorOpera,listOfActorsOpera,musicAuthor,textOpera,2);
        Show show = new Show("Одиссея",120,director,listOfActors);

        ballet.addActorInShow(actor1);
        ballet.addActorInShow(actor3);

        opera.addActorInShow(actor1);
        opera.addActorInShow(actor2);

        show.addActorInShow(actor1);
        show.addActorInShow(actor2);
        show.addActorInShow(actor3);

        ballet.printListOfActors();
        opera.printListOfActors();
        show.printListOfActors();

        ballet.replaceActorInShow(actor3,actor2);
        ballet.printListOfActors();

        opera.replaceActorInShow(actor3,actor2);

        opera.printLibrettoText();
        System.out.println();
        ballet.printLibrettoText();

    }
}
