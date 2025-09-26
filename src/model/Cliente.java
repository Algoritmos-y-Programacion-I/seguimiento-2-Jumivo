package model;

public class Cliente {
    
    
private Cuenta[] cuentas;

    public Cliente(){


        }
    private String nombre;
    private String cedula;
    private int edad;


    public Cuenta(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.int = edad;

        }

    public String getNombre() {
        return nombre;
        }

    public void setNombre(String nombre) {
        this.nombre = nombre;
     }

    public String cedula() {
        return cedula;
        }

    public String getcedula(String cedula) {
        this.cedula = cedula;
         }

    public int getEdad() {
        return saldo;
        }
    public int setEdad(){
        this.edad = edad
        }
    public Cuenta[] getCuentasList() {
        return cuentas;
        }

}
