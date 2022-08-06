package cajero;

public class Operaciones
{
    public int saldoactual;
    
    public void asignarSaldo(int saldoasigado)
    {
        this.saldoactual=saldoasigado;
    }
    
    public void consultarSaldo()
    {
        System.out.println("El saldo actual es: " + this.saldoactual);
    }
    
    public int retirarDinero(int dineroretirar)
    {
        this.saldoactual=this.saldoactual-dineroretirar;
        this.consultarSaldo();
        return this.saldoactual;
    }   
    
    public int consignarDinero(int dineroconsignar)
    {
        this.saldoactual=this.saldoactual+dineroconsignar;
        this.consultarSaldo();
        return this.saldoactual;
    }
    
    public static void limpiarPantalla()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println();
        }
    }
    
}
