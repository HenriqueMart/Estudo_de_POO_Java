/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josemart
 */
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Mètodos especiais
    public void ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //Métodos
    
    private int getVolume(){
        return this.volume;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setVolume(int valor){
        this.volume += valor;
        
    }
    
    private void setLigado(boolean ativo){
        this.ligado = ativo;
    }
    
    private void setTocando(boolean toque){
        this.tocando = toque;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
    System.out.println("Está ligado? " + this.getLigado());
    System.out.println("Está tocando? " + this.getTocando());
    System.out.println("Volume: " + this.getVolume());
    for(int i = 0; i <= this.getVolume(); i+=10){
        System.out.print("||");
    }
    }

    @Override
    public void fecharMenu() {  
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            setVolume(10);
        }
    }

    @Override
    public void menosVolume() {
    }

    @Override
    public void ligarMedo() {
    }

    @Override
    public void desligarMudo() {
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }
}
