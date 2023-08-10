/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventario.clases;

import gestioninventario.helper.HelperAleatorio;

/**
 *
 * @author profo1601
 */
public class VestidoParaDama extends Vestimenta {

    public boolean requiereCobertor;
    
    public VestidoParaDama(String talla, String color) {
        super(talla, color);
        this.requiereCobertor = talla == "L" ? true : false;
    }

    @Override
    public void calcularInventario() {
        this.cantidad = HelperAleatorio.getNumeroAleatorioImPar(160, 290);
    }
    
    @Override
    public String getDatos() {
        return super.getDatos() + ", TIPO: VESTIDO PARA DAMA"
                + ", REQUIERE COVERTOR: " + this.requiereCobertor;
    }
}

