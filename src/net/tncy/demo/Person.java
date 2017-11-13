package net.tncy.demo;

//import com.sun.istack.internal.NotNull;   ==> à ne jamais utiliser !!
import java.util.Date;
import javax.validation.constraints.*;

public class Person {

    @NotNull
    @Size(min=1)
    String prenom;

    @NotNull
    @Size(min=1)
    private String nom;

    @NotNull
    private Date naissance;

    private String citoyennete;

    @NotNull
    @Min(value=18)
    private transient Integer age;


    public Person (String prenom, String nom, Date naissance, String citoyennete, Integer age) {
        this.prenom = prenom;
        this.nom = nom;
        this.naissance = naissance;
        this.citoyennete = citoyennete;
        this.age = age;
    }

}
