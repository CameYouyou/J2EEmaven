package com.example.demo;

public class Tigre {
    private String nom;
    private int age;
    private char sexe;

    //CONSTRUCTEUR
    public Tigre(String nom, int age, char sexe) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
    }

    public Tigre(){

    }

    //GETTER & SETTER
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
}
