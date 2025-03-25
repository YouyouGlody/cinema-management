package com.cinema;

public class Reservation
{
    // Attributs privés pour encapsuler les données de la réservation
    private int id;
    private Client client;
    private Film film;
    private Salle salle;
    private int placesReservees;
    private boolean estPaye;

    //Constructeur pour initialiser un nouvel objet Reservation avec statut de paiement
    public Reservation(int id, Client client, Film film, Salle salle, int placesReservees, boolean estPaye)
    {
        this.id = id;
        this.client = client;
        this.film = film;
        this.salle = salle;
        setPlacesReservees(placesReservees); // Utilisation du setter pour la validation
        this.estPaye = estPaye;
    }

    // Constructeur pour initialiser un nouvel objet Reservation sans statut de paiement
    public Reservation(int id, Client client, Film film, Salle salle, int placesReservees)
    {
        this(id, client, film, salle, placesReservees, false); // Appel du constructeur principal avec estPaye = false

        /*this.id = id;
        this.client = client;
        this.film = film;
        this.salle = salle;
        this.placesReservees = placesReservees; */

    }

    //Getters et Setters

    // Getter pour obtenir l'ID de la réservation
    public int getId()
    {
        return id;
    }

    // Getter pour obtenir le client associé à la réservation
    public Client getClient()
    {
        return client;
    }

    // Getter pour obtenir le film réservé
    public Film getFilm()
    {
        return film;
    }

    // Getter pour obtenir la salle de la réservation
    public Salle getSalle()
    {
        return salle;
    }

    // Getter pour obtenir le nombre de places réservées
    public int getPlacesReservees()
    {
        return placesReservees;
    }

    // Setter pour définir le nombre de places réservées avec validation
    public void setPlacesReservees(int placesReservees)
    {
        if (placesReservees > 0) {
            this.placesReservees = placesReservees;
        } else {
            throw new IllegalArgumentException("Le nombre de places réservées doit être positif.");
        }
    }

    // Getter pour vérifier si la réservation est payée
    public boolean isEstPaye() {
        return estPaye;
    }

    //Méthode pour payer la reservation
    public void payer()
    {
        this.estPaye = true;
        System.out.println("Réservation " + id + "payé avec succès.");
    }

    //Méthode pour afficher les informations de la reservation
    public void afficherInfos()
    {
        System.out.println("Réservation Id: " + id);
        client.afficherInfos();
        film.afficherInfos();
        System.out.println("Salle: " + salle.getNumero());
        System.out.println("Places réservées " + placesReservees);
        System.out.println("Statut de paiement: " + (estPaye ? "Payé" : "Non payé"));

    }

    // Surcharge de la méthode toString pour fournir une représentation textuelle de l'objet Reservation
    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", client=" + client.getNom() + " " + client.getPrenom() +
                ", film='" + film.getTitre() + '\'' +
                ", salle=" + salle.getNumero() +
                ", placesReservees=" + placesReservees +
                ", estPaye=" + estPaye +
                '}';
    }

}
