import com.cinema.Cinema;
import com.cinema.Client;
import com.cinema.Film;
import com.cinema.Salle;

public class Main {
    public static void main(String[] args) {
        //Créantion d'une instance de cinéma
        Cinema cinema = new Cinema();

        //Création de films
        Film film1 = null;
        Film film2 = null;
        try {
            film1 = new Film("Inception", 148, "Science-Fiction", "Adulte");
            film2 = new Film("Toy Story", 81, "Animation", "Enfant");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur l'ors de l'ajout d'un film : " + e.getMessage());
        }


        //Ajout des films au cinéma
        cinema.ajouterFilm(film1);
        cinema.ajouterFilm(film2);

        //Création des salles
        Salle salle1 = new Salle(1, 100);
        Salle salle2 = new Salle(2, 80);

        // Ajout des salles au cinéma
        try {
            cinema.ajouterSalle(salle1);
            cinema.ajouterSalle(salle2);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur l'ors de l'ajout d'une salle : " + e.getMessage());
        }


        // Programmation des films dans la salle

        //Ajout des films en salle
        salle1.ajouterFilm(film1);
        salle2.ajouterFilm(film2);

        /* //suppression du film en salle
        salle1.supprimerFilm(film1);
        salle2.supprimerFilm(film2); */

        // Création de clients
        Client client1 = new Client("Youyou Mpia", "Glody", "youyoustyve@gmail.com", "693535260");
        Client client2 = new Client("Martin", "Alice", "alicemartin@exemple.com", "0123456789");

        // Création des reservation par les clients au cinéma
        try {
            cinema.creerReservation(1, client1, film1, salle1, 2);
            cinema.creerReservation(2, client2, film2, salle2, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de la création d'une réservation : " + e.getMessage());
        }


        // Paiement des reservations

        cinema.getReservations().get(0).payer(); //Payer la première reservation

        // Affichage des informations du cinéma
        cinema.afficherInfos();


    }
}