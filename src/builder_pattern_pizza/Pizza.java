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
public class Pizza {
    //Atributos

    private int grHarina;
    private int mlAgua;
    private int grSal;
    private int mlAceite;
    private String tipoAceite;
    private int grTomate;
    private int grQueso;
    private String tipoQueso;
    private int grPinha;
//En el constructor los parámetros se describen como final para que no se le pueda cambiar el parámetro asignado  

    public Pizza(final int grHarina, final int mlAgua, final int grSal, final int mlAceite, final String tipoAceite, final int grTomate, final int grQueso, final String tipoQueso, final int grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }
}
