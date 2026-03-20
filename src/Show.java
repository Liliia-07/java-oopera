import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private  ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        System.out.println("Список актеров учавствующие в спектакле " + title + ": ");

        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActorInShow(Actor newActor){
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Этот актер уже учавствует в спектакле!");
                return;
            }
        }

       listOfActors.add(newActor);
        System.out.println("Актер " + newActor.name + " " + newActor.surname + " добавлен в спектакль " + title);
    }

    public void replaceActorInShow(Actor replaceableActor,Actor newActor){
        boolean isRemove = listOfActors.remove(replaceableActor);

        if (!isRemove){
            System.out.println("Aктера "+ replaceableActor.name + " " + replaceableActor.surname + " нет в этом спектакле!");
            return;
        }

        listOfActors.add(newActor);
    }
}
