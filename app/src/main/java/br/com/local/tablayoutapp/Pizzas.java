package br.com.local.tablayoutapp;

public class Pizzas {

    private String nomePizza;
    private String saborPizza;
    private double valorPizza;
    private int imgPizza;

    public Pizzas(String nomePizza, String saborPizza, double valorPizza, int imgPizza) {
        this.nomePizza = nomePizza;
        this.saborPizza = saborPizza;
        this.valorPizza = valorPizza;
        this.imgPizza = imgPizza;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public String getSaborPizza() {
        return saborPizza;
    }

    public void setSaborPizza(String saborPizza) {
        this.saborPizza = saborPizza;
    }

    public double getValorPizza() {
        return valorPizza;
    }

    public void setValorPizza(double valorPizza) {
        this.valorPizza = valorPizza;
    }

    public int getImgPizza() {
        return imgPizza;
    }

    public void setImgPizza(int imgPizza) {
        this.imgPizza = imgPizza;
    }
}