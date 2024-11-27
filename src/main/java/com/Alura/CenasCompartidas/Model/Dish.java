package com.Alura.CenasCompartidas.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

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
