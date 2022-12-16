package Aula05;

public class conversorDeMinutos{
    //minutos 3456789
    public int converterAnos(int numero){

        return (int) numero/525600;
        

    }
    public int converterDias(int numero){

        return (numero/1440) % 365;
        
    }

}