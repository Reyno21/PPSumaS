package listas;


import java.io.Serializable;
import javax.swing.JOptionPane;
import sumaSubconjuntos.Suma;

/**
 *
 * @author REYNO21
 */
public class Mlistas implements Serializable
{

    //private static Suma mover = null;
    //se debe eliminar e insetarlo en la nueva lista

    public static Suma Insertar(Suma r, Suma n, int Level, String Etqs[])
    {
        if (Level == Etqs.length - 1)
        {
            ListaSimple Lista = new ListaSimple();
            Lista.setR(r);
            Lista.Insertar(n);
            r = Lista.getR();
            return r;
        } else
        {
//            Suma aux = Buscar(r, Etqs[Level]);
//            if (aux != null)
//            {
//                aux.setAbajo(Insertar(aux.getAbajo(), n, Level + 1, Etqs));
//            } else
//            {
//                JOptionPane.showMessageDialog(null, "NO EXISTE EL DATO", " Error", JOptionPane.ERROR_MESSAGE);
//            }
            return r;
        }
    }

//    public static Suma Eliminar(Suma r, int level, String[] etqs)
//    {
//        if (level == etqs.length - 1)
//        {
//            ListaSimple Lista = new ListaSimple();
//            Lista.setR(r);
//            Suma aux = Lista.Eliminar(etqs[level]);
//            mover = aux;
//            if (aux == null)
//            {
//
//            } else
//            {
//                r = Lista.getR();
//            }
//            return r;
//        } else
//        {
//            Suma aux = Buscar(r, etqs[level]);
//            if (aux != null)
//            {
//                aux.setAbajo(Eliminar(aux.getAbajo(), level + 1, etqs));
//            } else
//            {
//                // System.out.println("No se encontro " + etqs[level] + " En el nivel " + level);
//            }
//            return r;
//        }
//    }

//    public static Suma Mover(Suma r, int nivel, String etiqs_Eli[], String etqs_Ins [])//el nivel empieza en 0
//    {
//        //codigo para mover
//        NodoGeneral arriba = Mlistas.Buscar(VntGrupos.rmulti.getR(), etqs_Ins[0]);
//        r = Eliminar(r, nivel, etiqs_Eli);
//        if (mover != null)
//        {
//            r = Insertar(r, mover, nivel, etqs_Ins);
//            mover.setPrearr(arriba);
//        }
//        return r;
//    }

//    public static NodoGeneral Buscar(NodoGeneral r, String Etq)
//    {
//        NodoGeneral aux = null;
//        while (r != null)
//        {
//            if (r.getEtq().equals(Etq))
//            {
//                return r;
//            } else
//            {
//                r = r.getSiguiente();
//            }
//        }
//        return aux;
//    }

}
