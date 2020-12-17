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
public class Suma
  {
    private Object obj;
    private String etq = "null";
    private Suma siguiente = null;
    private Suma abajo = null;
    private Suma prearr = null;

    public Suma(Object obj)
    {
        this.obj = obj;
    }

    public Suma(Object obj, String etq)
    {
        this.obj = obj;
        this.etq = etq;
    }
//getters ans setters

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
     * @return the siguiente
     */
    public Suma getSiguiente()
    {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Suma siguiente)
    {
        this.siguiente = siguiente;
    }

    /**
     * @return the etq
     */
    public String getEtq()
    {
        return etq;
    }

    /**
     * @param etq the etq to set
     */
    public void setEtq(String etq)
    {
        this.etq = etq;
    }

    /**
     * @return the prearr
     */
    public Suma getPrearr()
    {
        return prearr;
    }

    /**
     * @param prearr the prearr to set
     */
    public void setPrearr(Suma prearr)
    {
        this.prearr = prearr;
    }

    /**
     * @return the abajo
     */
    public Suma getAbajo()
    {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(Suma abajo)
    {
        this.abajo = abajo;
    }
  }
