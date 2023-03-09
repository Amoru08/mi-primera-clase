public class Playlist{
    
    private String nombre;
    private int numeroCanciones;
    private boolean reproduciendo;
    
    
    public Playlist (String elNombre, int numeroCancion){
        nombre = elNombre;
        numeroCanciones = numeroCancion;
        reproduciendo = false;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNumeroCancion(){
        return numeroCanciones;
    }
    
    public boolean reproductor(){
        return reproduciendo;
    }
    
    public void setNombres(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarCancion(int numeroCancion){
        this.numeroCanciones = numeroCanciones + numeroCancion;
    }
    
    public void paraOreproduce(){
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



    