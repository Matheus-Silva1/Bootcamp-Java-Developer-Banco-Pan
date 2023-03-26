package com.pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No noAuxiliar = refNoEntradaPilha;

        refNoEntradaPilha = novoNo;

        refNoEntradaPilha.setRefNo(noAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }

        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        if (refNoEntradaPilha == null){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        String stringRetorno = "----------------------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "-----------------------------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado =" + + noAuxiliar.getDado()
                + "}]\n";
            }

            else{
                break;
            }
        }

        stringRetorno += "===================================\n";
        return stringRetorno;
    }
}
