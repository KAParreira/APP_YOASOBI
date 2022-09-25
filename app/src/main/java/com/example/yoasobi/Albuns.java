package com.example.yoasobi;

public class Albuns {

    private String nomeAlbuns;

    private int image;

    public Albuns(String nome, int image){
        this.nomeAlbuns = nome;
        this.image = image;

    }

    public String getNomeLivro() {
        return nomeAlbuns;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeAlbuns = nomeLivro;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
