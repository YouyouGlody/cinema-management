package com.cinema;

public class Client
{
    //Attributs privés pour encapsuler les données du client
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    //Constructeur pour initialiser un nouvel objet Client
    public Client(String nom, String prenom, String email, String telephone)
    {
        setNom(nom); // Utilisation du setter pour la validation
        setPrenom(prenom); // Utilisation du setter pour la validation
        this.email = email; // Utilisation du setter pour la validation
        setTelephone(telephone); // Utilisation du setter pour la validation
    }

    //Getters et Setters

    // Getter pour obtenir le nom du client
    public String getNom()
    {
        return nom;
    }

    // Setter pour définir le nom du client avec validation
    public void setNom(String nom) {
        if (nom != null && !nom.trim().isEmpty()) {
            this.nom = nom;
        } else {
            throw new IllegalArgumentException("Le nom ne peut pas être vide ou null.");
        }
    }

    // Getter pour obtenir le prénom du client
    public String getPrenom()
    {
        return prenom;
    }

    // Setter pour définir le prénom du client avec validation
    public void setPrenom(String prenom) {
        if (prenom != null && !prenom.trim().isEmpty()) {
            this.prenom = prenom;
        } else {
            throw new IllegalArgumentException("Le prénom ne peut pas être vide ou null.");
        }
    }

    // Getter pour obtenir l'email du client
    public String getEmail()
    {
        return email;
    }

    // Setter pour obtenir l'email du client avec la validation
    public void setEmail(String email) {
        if (email != null && !email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("L'email ne peut pas être vide oul null.");
        }
    }

    // Getter pour obtenir le numéro de téléphone du client
    public String getTelephone()
    {
        return telephone;
    }

    // Setter pour définir le numéro de téléphone du client avec validation
    public void setTelephone(String telephone) {
        if (telephone != null && !telephone.trim().isEmpty()) {
            this.telephone = telephone;
        } else {
            throw new IllegalArgumentException("Le numéro de téléphone ne peut pas être vide ou null.");
        }
    }

    //Méthode pour afficher les infos du client
    public void afficherInfos()
    {
        System.out.println("Client: " + prenom + " " + nom);
        System.out.println("Email: " + email);
        System.out.println("Téléphone: " + telephone);
    }

    // Surcharge de la méthode toString pour fournir une représentation textuelle de l'objet Client
    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

}
