/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion2eva;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GuardarInformacion {

    int diaDelMes;
    String efectos;
    boolean afirmacion;

    public int getDiaDelMes() {
        return diaDelMes;
    }

    public void setDiaDelMes(int diaDelMes) {
        this.diaDelMes = diaDelMes;
    }

    public String getEfectos() {
        return efectos;
    }

    public void setEfectos(String efectos) {
        this.efectos = efectos;
    }

    public boolean isAfirmacion() {
        return afirmacion;
    }

    public void setAfirmacion(boolean afirmacion) {
        this.afirmacion = afirmacion;
    }

    public String GuardarDia(int diaDelMes, boolean afirmacion) {
        String[] guardarDia = {String.valueOf(diaDelMes), String.valueOf(afirmacion)};

        return diaDelMes+" "+ afirmacion;
    }

//    public String GuardarDias() {
//        ArrayList<Array> ListaDeDias = new ArrayList();
////   ListaDeDias.add();
//        return ListaDeDias;
//    }

//    public String codificacion(String efectos) {
//
//        switch (efectos) {
//            case Estornudos:
//                efectos="E";
//                break;
//            case 2:
//                efectos="P";
//                break;
//            case 3:
//                efectos="I";
//            case 4;
//            efectos="T";
//                break;
//            default:
//
//        }
//
//    }

    
}
