import java.util.Scanner;
public class  Main{
    public static void main(String[] args){
        
    
        Scanner sc= new Scanner(System.in);
        Parque parque = new Parque();
        
        System.out.println("Ciudad de EspacioPublico");
        String ciudad=sc.next();
        parque.setCiudad(ciudad);
        
        System.out.println("precio de espacio publico");
        int precio= sc.nextInt();
        parque.setPrecio(precio);
        
        System.out.println("calle de espacio publico");
        String calle=sc.next();
        parque.setCalle(calle);
        
        System.out.println("************************");
        System.out.println("Nombre de ciudad : "+ parque.getCiudad()+"\nprecio: "+ parque.getPrecio()+"\ncalle: "+ parque.getCalle());
    
    }
}