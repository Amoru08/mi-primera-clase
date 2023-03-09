public class Playlist{
    
    private String nombre;
    private int numeroCanciones;
    private boolean reproduciendo;
    
    
    public Playlist (String ElNombre, int NumeroCancion){
        nombre = ElNombre;
        numeroCanciones = NumeroCancion;
        reproduciendo = false;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNumeroCancion(){
        return numeroCanciones;
    }
    
    public boolean Reproductor(){
        return reproduciendo;
    }
    
    public void setNombres(String nombre){
        this.nombre = nombre;
    }
    
    public void AgregarCancion(int numeroCancion){
        this.numeroCanciones = numeroCanciones + numeroCancion;
    }
    
    public void paraOreproducir(){
        this.reproduciendo = reproduciendo;
    }
    
    public void imprimirCaracteristicas(){
        String caracteristicas ="Nombre de playlist: " + nombre + "| Numero de canciones: " + numeroCanciones;
         if(reproduciendo == true){
            System.out.println(caracteristicas + "| Reproduciendo: si");
        }
        else{
            System.out.println(caracteristicas + "| Reproduciendo: no");
        }
    }
        
        public String getCaracteristicas (){
        String caracteristicas ="Nombre de playlist: " + nombre + "| Numero de canciones: " + numeroCanciones;
         if(reproduciendo == true){
            caracteristicas = caracteristicas + "| Reproduciendo: si";
        }
        else{
            caracteristicas = caracteristicas + "| Reproduciendo: no";
        }
        return caracteristicas;
    }






}



    