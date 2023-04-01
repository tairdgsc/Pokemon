/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linguagens.programacao.pokemon;

/**
 *
 * @author Taila
 */
public class Batalha {

    public String IniciarBatalha(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("Dados do primeiro pokemon: ");
        pokemon1.Imprimir();

        System.out.println("Dados do segundo pokemon: ");
        pokemon2.Imprimir();

        if (pokemon1.getVida() > pokemon2.getVida()) {
            return "O primeiro pokemon venceu essa batalha";

        } else if (pokemon2.getVida() > pokemon1.getVida()) {
            return "O segundo pokemon venceu essa batalha";

        }

        return "Ambos os pokemons perderam";

    }
}
