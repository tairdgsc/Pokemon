/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linguagens.programacao.pokemon;

/**
 *
 * @author Taila
 */
public class Pokemon {

    private String nome;
    private String tipo;
    private double defesa;
    private double ataque;
    private double vida;
    private double level;

    public Pokemon(String nome, String tipo, double level, double vida) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        this.vida = vida;
    }

    public void CalculaAtributos() {
        switch (this.tipo) {
            case "Fogo":
                this.vida = this.vida - 15;
                this.ataque = 50;
                this.defesa = 10;
                break;
            case "Água":
                this.vida = this.vida - 5;
                this.ataque = 30;
                this.defesa = 25;
                break;
            case "Planta":
                this.vida = this.vida + 25;
                this.ataque = 20;
                this.defesa = 55;
                break;
            case "Pedra":
                this.vida = this.vida + 20;
                this.ataque = 35;
                this.defesa = 65;
            default:
                break;
        }
    }

    public void CalculaLevel() {
        this.vida = this.vida + (this.level / 2);
        this.ataque = this.ataque + (this.level / 3);
        this.defesa = this.defesa + (this.level / 4);
    }

    public String Imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Level: " + this.level);
        System.out.println("Vida: " + this.vida);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defesa: " + this.defesa);

        return "Nome: " + this.nome + "\nTipo: " + this.tipo + "\nLevel: " + 
                this.level + "\nVida: " + this.vida + "\nAtaque: " + 
                this.ataque + "\nDefesa: " + this.defesa;
    }

    public double getVida() {
        return vida;
    }
}
