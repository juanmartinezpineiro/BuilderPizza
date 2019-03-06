/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_pattern_pizza;

/**
 *
 * @author Juan Martínez
 */
public class Builder_Pattern_Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamos dos objetos de la clase Pizza
        Pizza miPizzaMargarita;
        //Instanciamos un builder con los obligatorios más los sets que quieras añadir.
        miPizzaMargarita = new PizzaBuilder(200, 200)
                .setGrPinha(43)
                .setGrSal(20)
                .createPizza();
    }

}
