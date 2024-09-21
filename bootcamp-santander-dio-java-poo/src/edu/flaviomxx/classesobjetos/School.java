package edu.flaviomxx.classesobjetos;

public class School {
    public static void main(String[] args) {
      //Classe  objeto = nova Classe();
        Student student1 = new Student(); //Criando objeto student1 a partir da minha Classe student
        student1.name = "John";  // meu objeto student1 tem o nome John;
        student1.age = 12;       // meu objeto student1 tem 12 anos;
        student1.sex = "Male";   // meu objeto student1 é do sexo masculino;


        Student student2 = new Student(); //Criando objeto student2 a partir da minha Classe student
        student2.name = "Sophia";   // meu objeto student2 tem o nome Sophia;
        student2.age = 10;          // meu objeto student2 tem 10 anos;
        student2.sex = "Female";    // meu objeto student2 é do sexo masculino;

        Student student3 = new Student(); //Criando objeto student3 a partir da minha Classe student
        student3.name = "Lily";   // meu objeto student3 tem o nome Lily;
        student3.age = 11;          // meu objeto student3 tem 11 anos;
        student3.sex = "Female";    // meu objeto student3 é do sexo masculino;
    }
}
