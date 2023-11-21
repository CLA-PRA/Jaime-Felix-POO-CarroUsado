package miPrincipal;

public class CarroUsado {
    // Atributos
    private int identificador;
    private String marca;
    private int kilometraje;
    private double precioBase;
    private int modelo;

    public CarroUsado( int identificador, String marca, int kilometraje, double precioBase, int modelo)
    {
        setIdentificador( identificador );
        setMarca( marca );
        setKilometraje( kilometraje );
        setPrecioBase( precioBase );
        setModelo( modelo );
    }

    // Metodos set/get
    public void setIdentificador( int identificador )
    {
        // El identificador debe ser un entero de 4 digitos
        // 1000 - 9999
        // Caso contrario, lanzar excepcion tipo CarroUsadoException
    }

    public void setMarca( String marca )
    {
        // La marca debe ser: Ford, Honda, Toyota, Chrysler, Otro
        // Caso contrario, lanzar excepcion tipo CarroUsadoException
    }

    public void setKilometraje( int kilometraje )
    {
        // El kilometraje debe ser mayor o igual a 0 (cero)
        // Caso contrario, lanzar excepcion tipo CarroUsadoException
    }

    public void setPrecioBase( double precioBase )
    {
        // El precio base debe ser mayor o igual a 0 (cero)
        // Caso contrario, lanzar excepcion tipo CarroUsadoException
    }

    public void setModelo( int modelo )
    {
        // El modelo debe estar en el rango de 1997-2023
        // Caso contrario, lanzar excepcion tipo CarroUsadoException
    }

    public int getIdentificador()
    {
        return 0;
    }

    public String getMarca()
    {
        return "";
    }

    public int getKilometraje()
    {
        return 0;
    }

    public double getPrecioBase()
    {
        return 0.0;
    }

    public int getModelo()
    {
        return 0;
    }

    // Metodos de instancia
    public double descuento()
    {
        // Metodo para obtener el porcentaje de descueto segun la tabla proporcionada
        double porcentaje = 0.0;

        return porcentaje;
    }

    public double precioFinal()
    {
        return 0.0;
    }

    // Metodo toString()
    public String toString()
    {
        String resultado = String.format("");
        return resultado;
    }
}