package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Carro Usado");
        System.out.println("===========");

        System.out.println();

        // Datos del carro usado
        System.out.print("Proporcione el identificador:");
        entrada.nextLine();     // Eliminar <Enter> pendiente
        System.out.print("Proporcione la marca:");
        System.out.print("Proporcione el kilometraje:");
        System.out.print("Proporcione el precio base:");
        System.out.print("Proporcione el modelo:");

        try
        {
            // Crear CarroUsado
            CarroUsado cu = new CarroUsado( identificador, marca, kilometraje, precioBase, modelo );
            
            // Mostrar los datos del carro usado
            System.out.println();
        }
        catch (CarroUsadoException cue )
        {
            // Mostrar mensaje de la excepcion
        }
        finally
        {
            entrada.close();
        }
    }
}