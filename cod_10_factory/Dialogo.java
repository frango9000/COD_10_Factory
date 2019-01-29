package cod_10_factory;
//@author fsancheztemprano
public abstract class Dialogo implements Dialogable {
    @Override
    public abstract void mostrar(String str);

    enum Tipo{CONSOLA,VENTANA}
    
    public static Dialogo crearDialogo(Tipo tipo){
        switch(tipo){
            case CONSOLA:
                return new ConsDialog();
            case VENTANA:
                return new WinDialog();
            default:
                return null;
        }
    }
    

}
