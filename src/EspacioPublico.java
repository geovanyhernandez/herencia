public class  EspacioPublico {

    private String ciudad;
    private int precio;
    private String calle;
    
    public void setCiudad(String ciudad)
      {
    this.ciudad = ciudad; 
      }
    public void setPrecio(int precio)
    {
    this.precio=precio;
    }
    public void setCalle(String calle)
    {
    this.calle=calle;	
    }
    
    
      public String getCiudad()
    {
    	return ciudad;
    }
   
    public int getPrecio()
    {
        return precio;    
    }
    public String getCalle()
    {
    	return calle;
    }
}