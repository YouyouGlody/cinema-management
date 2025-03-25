package com.cinema;

public class Film
{
    //Attributs
    private String titre;
    private int duree; // Durée en minutes
    private String genre;
    private String classification; // Ex: "Enfant", "Adulte"

    //constructeur pour initialiser un nouvel objet Film
    public Film(String titre, int duree, String genre, String classification)
    {
        this.titre = titre;
        /*Le setter setDuree(int duree) contient une logique de validation
         qui vérifie que la durée est positive. Cela garantit que l'objet est toujours
          dans un état valide dès sa création
         */
        setDuree(duree);  // Utilisation du setter pour la validation
        this.genre = genre;
        this.classification = classification;
    }

    // Getter pour obtenir le titre du film
    public String getTitre()
    {
        return titre;
    }

    // Setter pour définir le titre du film avec validation
    public void setTitre(String titre)
    {
        if (titre != null && !titre.trim().isEmpty()){
            this.titre = titre;
        } else {
            throw new IllegalArgumentException("Le titre ne peut pas être vide ou null.");
        }
    }

    // Getter pour obtenir la durée du film
    public int getDuree()
    {
        return duree;
    }

    // Setter pour définir la durée du film avec validation
    public void setDuree(int duree)
    {
        if (duree > 0) {
            this.duree = duree;
        } else {
            throw new IllegalArgumentException("La durée doit être positive.");
        }
    }

    // Getter pour obtenir le genre du film
    public String getGenre()
    {
        return genre;
    }

    // Setter pour définir le genre du film avec validation
    public void setGenre(String genre)
    {
        if (genre != null && !genre.trim().isEmpty()) {
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Le genre ne peut pas être vide ou null.");
        }
    }

    // Getter pour obtenir la classification du film
    public String getClassification()
    {
        return classification;
    }

    // Setter pour définir la classification du film avec validation
    public void setClassification(String classification)
    {
        if (classification != null && !classification.trim().isEmpty()) {
            this.classification = classification;
        } else {
            throw new IllegalArgumentException("La classification ne peut pas être vide ou null.");
        }
    }

    //Methode pour afficher les informations du film
    public void afficherInfos()
    {
        System.out.println("Film: " + titre);
        System.out.println("Durée: " + duree + " minutes");
        System.out.println("Genre: " + genre);
        System.out.println("Classification " + classification);
    }

    // Surcharge de la méthode toString
    @Override
    public String toString () {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", duree=" + duree +
                ", genre='" + genre + '\'' +
                ", classification='" + classification + '\'' +
                '}';
    }


}
