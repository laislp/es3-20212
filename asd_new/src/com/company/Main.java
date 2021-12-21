package com.company;

import java.time.LocalDateTime;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Agenda a = new Agenda("aoba");
        Cliente m = new Cliente("mat","123","10/09/1921", 'M');
        Cliente b = new Cliente("d", "444", "11/11/1951", 'F');
        a.AdicionarCliente(m);
        a.AdicionarCliente(b);
        a.ListarPorGenero('M');
    }
}
