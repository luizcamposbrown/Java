package com.company;
public class Prova {
    private int dificuldade, energiaNecessaria;
    public boolean podeRealizar(Atleta atleta){

        if((atleta.getNivel() >= this.dificuldade) && (atleta.getEnergia()>=this.energiaNecessaria)){
            return true;
        }else{
            return false;}
    }

    public int getDificuldade() {return dificuldade;}
    public void setDificuldade(int dificuldade) {this.dificuldade = dificuldade;}

    public int getEnergiaNecessaria() {return energiaNecessaria;}
    public void setEnergiaNecessaria(int energiaNecessaria) {this.energiaNecessaria = energiaNecessaria;}
}
