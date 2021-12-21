package com.company;

import java.util.Calendar;

public class Relatorio {
    private Agenda agenda;

    public Relatorio(Agenda agenda) {
        this.agenda = agenda;
    }
    public int idadeMedia(){
        int idadeTotal = 0;
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        for (Cliente c: this.agenda.getClientes()) {
            int nascim = Calendar.getInstance().setTime(c.getDataNascimento()).get(Calendar.YEAR);
            idadeTotal += ano - nascim;
        }
        return idadeTotal / this.agenda.getClientes().size();
    }
    public int idadeMediaGenero(Character genero){
        int idadeTotal = 0;
        int qtdPessoas = 0;
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        for (Cliente c: this.agenda.getClientes()) {
            if (c.getGenero().equals(genero)) {
                qtdPessoas++;
                int nascim = Calendar.getInstance().setTime(c.getDataNascimento()).get(Calendar.YEAR);
                idadeTotal += ano - nascim;
            }
        }
        return  idadeTotal / qtdPessoas;
    }

}
