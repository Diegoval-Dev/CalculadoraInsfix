import Model.InfixToPosfix;
import Model.Posfix;
import Model.ReadFile;
import Model.UI;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        UI ui = new UI();
        InfixToPosfix inf = new InfixToPosfix();
        Posfix calculadora = Posfix.getPosfixInstance();
        ui.print("Ingrese la Url de los documentos a leer");
        ReadFile rd = new ReadFile(ui.read());
        String StackOp = menu();
        ArrayList<String> arrayDatos;
        arrayDatos = rd.postFixExpresion;
        int cantLineas = arrayDatos.size();
        int resultado = 0;

        for (int i = 0; i < cantLineas; i++) {
            String posfixLine = inf.infixToPostfix(arrayDatos.get(i));
            resultado = calculadora.calculate(posfixLine,StackOp);
            ui.print("Linea: "+arrayDatos.get(i) + " Resultado: " + resultado);
        }

    }
    public static String menu(){
        UI ui = new UI();
        ui.print("INGRESE EL NUMERO DEL STACK QUE DESEA UTILIZAR");
        ui.print("1. ArrayList");
        ui.print("2. Vector");
        ui.print("3. SimpleLinkedList");
        ui.print("4. DoubleLinkedList");
        String  op = ui.read();
        switch (op){
            case "1":
                return "ArrayList";
            case "2":
                return "Vector";
            case "3":
                return "SimpleList";
            case "4":
                return "DoubleList";
            default:
                return "";

        }
    }
}