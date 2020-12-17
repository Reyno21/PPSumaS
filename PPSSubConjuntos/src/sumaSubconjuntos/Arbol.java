/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaSubconjuntos;

/**
 *
 * @author REYNO21
 */
public class Arbol
  {
    private String etqs;
    private Object obj;
    private Arbol izq = null;
    private Arbol dere = null;
    private Suma arr = null;

    public Arbol(String Etq, Object Obj)
      {
        this.etqs = Etq;
        this.obj = Obj;
      }
//gettera ans setters

    /**
     * @return the etqs
     */
    public String getEtqs()
      {
        return etqs;
      }

    /**
     * @param etqs the etqs to set
     */
    public void setEtqs(String etqs)
      {
        this.etqs = etqs;
      }

    /**
     * @return the obj
     */
    public Object getObj()
      {
        return obj;
      }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
      {
        this.obj = obj;
      }

    /**
     * @return the izq
     */
    public Arbol getIzq()
      {
        return izq;
      }

    /**
     * @param izq the izq to set
     */
    public void setIzq(Arbol izq)
      {
        this.izq = izq;
      }

    /**
     * @return the dere
     */
    public Arbol getDere()
      {
        return dere;
      }

    /**
     * @param dere the dere to set
     */
    public void setDere(Arbol dere)
      {
        this.dere = dere;
      }

    /**
     * @return the arr
     */
    public Suma getArr()
      {
        return arr;
      }

    /**
     * @param arr the arr to set
     */
    public void setArr(Suma arr)
      {
        this.arr = arr;
      }
    
    
  }
