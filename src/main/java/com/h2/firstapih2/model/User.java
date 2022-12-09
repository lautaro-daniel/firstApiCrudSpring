package com.h2.firstapih2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //identifica a la clase como una entidad
@Table(name = "\"user\"") //porque es una tabla en la base de datos
@Data //genera al momento de compilar los getters  / setters
@AllArgsConstructor //agrega el constructor con todos los argumentos
@NoArgsConstructor // constructor sin argumentos
public class User {

    @Id //le digo a JPA que el atributo id es clave primaria de la tabla
    @GeneratedValue(strategy=GenerationType.IDENTITY) /*
                                                          al momento de hacer una tabla, ID se va a ir
                                                          autoincrementando
                                                          */
    private Long id;
    @Column(nullable = false) //que no deje ese campo vacio
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(length = 16)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;
}
