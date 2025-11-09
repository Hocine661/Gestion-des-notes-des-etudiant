package com.s4m.poo.basics;


import java.util.Scanner;

public class TestEtudiant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Veuillez entrer le nom de l'étudiant : ");
        String nom = sc.nextLine();
        Etudiant etudiant = new Etudiant(nom);

        System.out.println("Combien de matiére voulez-vous calculer la moyenne?");
        int nbMatiere = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nbMatiere; i++) {
            System.out.println("\n Matière " + (i + 1) + ":");
            System.out.println("Nom de la matiére :");
            String matiere = sc.nextLine();
            System.out.println("Coefficient :");
            int coef = sc.nextInt();
            System.out.println("Note :");
            float note = sc.nextFloat();
            sc.nextLine();
            etudiant.ajouterNotation(new Notation(matiere, coef, note));
        }

        etudiant.calculerMoyenne();
        etudiant.genereAvis();
        etudiant.afficher();

        sc.close();
    }
}