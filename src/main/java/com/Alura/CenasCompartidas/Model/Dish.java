package com.Alura.CenasCompartidas.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "dish")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dish {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idDish;
private String userName;
private String nameDish;
private TypeDish typeDish;
private String chefName;

}
