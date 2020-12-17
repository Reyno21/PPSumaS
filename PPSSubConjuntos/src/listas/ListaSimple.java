/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.io.Serializable;
import sumaSubconjuntos.Suma;

/**
 *
 * @author REYNO21
 */
public class ListaSimple implements Serializable
  {

    private Suma r = null;
    
    //getters and stters

    /**
     * @return the r
     */
    public Suma getR()
      {
        return r;
      }

    /**
     * @param r the r to set
     */
    public void setR(Suma r)
      {
        this.r = r;
      }
//Insertar nodos
    public boolean Insertar(Suma n)
      {
        if (n == null)
          {
            return false;
          } else
          {
            if (r == null)
              {
                r = n;
              } else
              {
                //Si es menor al primero
                if (n.getEtq().compareTo(r.getEtq()) < 0)
                  {
                    n.setSiguiente(r);
                    r = n;
                  } else
                  {
                    //Si el dato va en medio de la lista
                    Suma aux = r;
                    boolean bool = true;
                    while (aux.getSiguiente() != null && bool)
                      {
                        if (n.getEtq().compareTo(aux.getSiguiente().getEtq()) < 0)
                          {
                            n.setSiguiente(aux.getSiguiente());
                            aux.setSiguiente(n);
                            bool = false;
                          } else
                          {
                            aux = aux.getSiguiente();
                          }
                      }
                    //Si este se va al final de la lista
                    if (bool)
                      {
                        aux.setSiguiente(n);
                      }
                  }
              }
            return true;
          }
      }
//Para eliminarlos
    public Suma Eliminar(String Etiq)
      {
        if (r == null)//No debe estar vacio
          {
            return null;
          } else
          {
            
            Suma aux = null;
            if (Etiq.compareTo(r.getEtq()) >= 0)//Si es mayor o igual a 0
              {
                if (r.getEtq().equals(Etiq))
                  {
                    aux = r;
                    r = r.getSiguiente();
                    aux.setSiguiente(null);
                  } else
                  {
                    Suma aux2 = r;
                    boolean b = true;
                    while (aux2.getSiguiente() != null && b)
                      {
                        if (aux2.getSiguiente().getEtq().equals(Etiq))
                          {
                            aux = aux2.getSiguiente();
                            aux2.setSiguiente(aux.getSiguiente());
                            aux.setSiguiente(null);
                            b = false;
                          } else
                          {
                            aux2 = aux2.getSiguiente();
                          }
                      }
                  }
              }
            return aux;
          }
      }

    public int Conta()  //Contador
      {
        int cont = 0;
        while (r != null)
          {
            cont++;
            r = r.getSiguiente();
          }
        return cont;
      }

  }
