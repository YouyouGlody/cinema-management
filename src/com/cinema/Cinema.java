package com.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cinema
{
    //Attributs privés pour encapsuler les données du cinéma
    private List<Film> films;
    private List<Salle> salles;
    private List<Reservation> reservations;
    private List<Client> clients;

    //Constructeur pour initialiser un nouvel objet Cinema
    public Cinema()
    {
     this.films = new ArrayList<>();
     this.salles = new ArrayList<>();
     this.reservations = new ArrayList<>();
     this.clients = new ArrayList<>();
    }

    //Méthode pour ajouter un film à la liste des films
    public void ajouterFilm(Film film)
    {
        if (film != null) {
            films.add(film);
        } else {
            throw new IllegalArgumentException("Le film ne peut pas être null.");
        }
    }

    // Méthode pour ajouter une salle à la liste des salles
    public void ajouterSalle(Salle salle)
    {
       if (salle !=null) {
           salles.add(salle);
       } else {
           throw new IllegalArgumentException("La salle ne peut pas être null.");
       }
    }

    //Méthode pour ajouter un client à la liste des clients
    public void ajouterClient(Client client) {
        if (client != null) {
            clients.add(client);
        } else {
            throw new IllegalArgumentException("Le client ne peut pas être null.");
        }
    }

    // Méthode pour créer une réservation
    public void creerReservation(int id, Client client, Film film, Salle salle, int placesReservees)
    {
        if (client !=null && film != null && salle != null) {
            Reservation reservation = new Reservation(id, client, film, salle, placesReservees);
            reservations.add(reservation);
            System.out.println("Réservation créée avec succès.");
        }  else {
            throw new IllegalArgumentException("Le client, le film et la salle ne peuvent pas être null.");
        }
    }

    //Méthodes pour afficher toutes les informations du cinéma
    public void afficherInfos()
    {
        System.out.println("===Films===");
        for (Film film : films)
        {
            film.afficherInfos();
        }
        System.out.println("===Salles===");
        for (Salle salle : salles)
        {
            salle.afficherFilm();
        }
        System.out.println("===Reservations===");
        for (Reservation reservation : reservations)
        {
            reservation.afficherInfos();
        }

        System.out.println("=== Clients ===");
        for (Client client : clients) {
            client.afficherInfos();
        }
    }

    // Getters pour accéder aux listes
    public List<Reservation> getReservations() {
        return reservations;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public List<Film> getFilms() {
        return films;
    }

    // Méthode pour trouver une réservation par ID
    public Reservation trouverReservationParId(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == id) {
                return reservation;
            }
        }
        return null; // Retourne null si aucune réservation trouvée
    }

    // Méthode pour annuler une réservation par ID
    public void annulerReservation(int id) {
        Reservation reservation = trouverReservationParId(id);
        if (reservation != null) {
            reservations.remove(reservation);
            System.out.println("Réservation " + id + " annulée avec succès.");
        } else {
            System.out.println("Réservation " + id + " non trouvée.");
        }
    }



}
