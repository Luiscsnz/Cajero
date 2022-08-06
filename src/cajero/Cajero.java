package cajero;

import java.util.Scanner;

public class Cajero
{
    public static void main(String[] args)
    {
        //Si el metodo se declara estático
        Cajero.menu();
        //Si el metodo no se declara estático
        //Cajero mimenu = new Cajero();
        //mimenu.menu();
    }
    private static void menu()
    {
        int opcion;
        int valorretiro;
        int valorconsignacion;
        //Se crea un objeto de clase Scanner llamado leernumero
        //al cual se le envia como parametro el ingreso por teclado System.in
        Scanner leernumero = new Scanner(System.in);
        Operaciones usuariocajero = new Operaciones();
        usuariocajero.asignarSaldo(1000000);
        do
        {
            //Operaciones.limpiarPantalla();
            System.out.println("*** MENU PRINCIPAL ***");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");           
            System.out.println("3. Consignar dinero");           
            System.out.println("4. Salir");           
            System.out.print("Seleccione una opcion: ");
            opcion = leernumero.nextInt();
            switch(opcion)
            {
                case 1: 
                        usuariocajero.consultarSaldo();
                        break;
                case 2: 
                        System.out.print("Escriba el dinero a retirar: ");
                        valorretiro=leernumero.nextInt();
                        if(valorretiro<=usuariocajero.saldoactual)
                        {
                            usuariocajero.retirarDinero(valorretiro);
                        }
                        else
                        {
                            System.out.println("Fondos insuficientes para ese retiro!");
                        }
                        break;                
                case 3: 
                        System.out.print("Escriba el dinero a consignar: ");
                        valorconsignacion=leernumero.nextInt();
                        if(valorconsignacion>0)
                        {
                            usuariocajero.consignarDinero(valorconsignacion);
                        }
                        else
                        {
                            System.out.println("Valor incorrecto!");
                        }
                        break;
                case 4: break;
                default: opcion=4; break;
            }
        }
        while(opcion!=4);
    }
}
