package fundamentals.wrappers;

/*
Classes Wrappers (invólucros) representam os tipos primitivos de dados.
 */
public class Main {
    public static void main(String[] args) {
        // Tipos primitivos de dados
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        float num5 = 3.5f;
        double num6 = 3.555;
        boolean flag = true;
        char a = 'a';

//		Formas de instanciar antes do java 9
//		Short num7 = new Short(num1);
//		Byte num8 = new Byte((byte)10);
//		Integer num9 = new Integer(100);
//		Long num10 = new Long(10000l);
//		Float num11 = new Float(3.5f);
//		Double num12 = new Double(3.553);
//		Boolean flag2 = new Boolean(true);
//		Character b = new Character ('b');

        // Depois do java 9..
        Integer n1 = Integer.valueOf(100);
        Short n2 = Short.valueOf((short) 120);// converte o 120 para short
        Byte n3 = Byte.valueOf((byte) 3);

        System.out.println(n1);

        Integer myInteger = 5; // Autoboxing (conversão automática de int para Integer)
        int myInt = myInteger; // Unboxing (conversão automática de Integer para int)
    }

}