package com.cinema;

import java.util.ArrayList;
import java.util.List;

public class Salle
{
    //Attributs privés pour encapsuler les données de la salle
    private int numero;
    private int places;
    private List<Film> films;

    //Constructeur pour initialiser une salle avec un numéro et un nombre de places
    public Salle(int numero, int places)
    {
        // Validation des entrées pour s'assurer que les valeurs sont positives
        if (numero <= 0) {
            throw new IllegalArgumentException("Le numéro de salle doit être positif.");
        }
        if (places <= 0) {
            throw new IllegalArgumentException("Le nombre de places doit être positif.");
        }

        this.numero = numero;
        this.places = places;
        this.films = new ArrayList<>(); // Initialisation de la liste des films
    }

    // Getter pour obtenir le numéro de la salle
    public int getNumero()
    {
        return numero;
    }

    // Setter pour définir le numéro de la salle avec validation
    public void setNumero(int numero)
    {
        if(numero > 0) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("Le numéro de salle doit être positif.");
        }
    }

    // Getter pour obtenir le nombre de places dans la salle
    public int getPlaces()
    {
        return places;
    }

    // Setter pour obtenir le nombre de places dans la salle avec validation
    public void setPlaces(int places)  {
        if (places > 0){
            this.places = places;
        } else {
            throw new IllegalArgumentException("Le nombre de places doit être positif.");
        }
    }

    // Méthode pour ajouter un film à la salle
    public void ajouterFilm(Film film)
    {
        if (film != null){
            films.add(film); // Ajout du film à la liste
        } else {
            throw new IllegalArgumentException("Le film à ajouter ne peut pas être null.");
        }
    }

    //Méthode pour supprimer un film de la salle
    public void supprimerFilm(Film film)
    {
        /* film != null : Cette partie vérifie que l'objet film passé en paramètre n'est pas null.
         Cela évite les erreurs si quelqu'un essaie de supprimer un film inexistant.

        contains(film): Cette méthode vérifie si l'objet film est présent dans la liste films.
        Elle retourne true si le film est trouvé, sinon false.*/
        if (film != null && films.contains(film)){
            films.remove(film); // Suppression du film de la liste
        } else {
            throw new IllegalArgumentException("Le film à supprimer n'existe pas dans la liste.");
        }
    }

    //Méthode pour afficher les films programmés dans la salle
    public void afficherFilm()
    {
        System.out.println("Films programmés dans la sallle" + numero + ":");
        for (Film film : films)
        {
            film.afficherInfos();
        }

    }


}
