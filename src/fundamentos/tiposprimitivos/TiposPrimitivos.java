package fundamentos.tiposprimitivos;
/*
*Referência das anotações: GoalKicker.com – Java® Notes for Professionals

Tipos primitivos e seu tamanho de alocação:

boolean Boolean 1 byte / 16 bytes
byte Byte 1 byte / 16 bytes
short Short 2 bytes / 16 bytes
char Char 2 bytes / 16 bytes
int Integer 4 bytes / 16 bytes
long Long 8 bytes / 16 bytes
float Float 4 bytes / 16 bytes
double Double 8 bytes / 16 bytes

Tabela com representação:

| Data Type | Numeric Representation  | Range of Values                                           | Default Value |
|-----------|-------------------------|-----------------------------------------------------------|---------------|
| boolean   | n/a                     | false and true                                            | false         |
| byte      | 8-bit signed            | -27 to 27 - 1                                             | 0             |
|           |                         | -128 to +127                                              |               |
| short     | 16-bit signed           | -215 to 215 - 1                                           | 0             |
|           |                         | -32,768 to +32,767                                        |               |
| int       | 32-bit signed           | -231 to 231 - 1                                           | 0             |
|           |                         | -2,147,483,648 to +2,147,483,647                          |               |
| char      | 16-bit unsigned         | 0 to 216 - 1                                              | 0             |
|           |                         | 0 to 65,535                                               |               |
| long      | 64-bit signed           | -263 to 263 - 1                                           | 0L            |
|           |                         | -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807   |               |
| float     | 32-bit floating point   | 1.401298464e-45 to 3.402823466e+38 (positive or negative) | 0.0F          |
| double    | 64-bit floating point   | 4.94065645841246544e-324d to 1.79769313486231570e+308d
*                                                                          (positive or negative) | 0.0D          |
 */
public class TiposPrimitivos {

    public static void main(String[] args) {

        int maxInt = Integer.MAX_VALUE; // high == 2147483647
        int minInt = Integer.MIN_VALUE; // low == -2147483648

        long maxLonghigh = Long.MAX_VALUE; // high == 9223372036854775807L
        long minLong = Long.MIN_VALUE;  // low == -9223372036854775808L

        byte maxByte = Byte.MAX_VALUE; // high == 127
        byte minByte = Byte.MIN_VALUE; // low == -128

        short maxShort = Short.MAX_VALUE; // high == 32767
        short minShort = Short.MIN_VALUE; // low == -32768

        String strObj = new String("Hello!");
        String str = "Hello!";
        // The two string references point two strings that are equal
        if (strObj.equals(str)) {
            System.out.println("As Strings são iguais!");
        }
        // The two string references do not point to the same object
        if (strObj != str) {
            System.out.println("The strings are not the same object");
        }
        // If we intern a string that is equal to a given literal, the result is
        // a string that has the same reference as the literal.
        String internedStr = strObj.intern();
        if (internedStr == str) {
            System.out.println("The interned string and the literal are the same object");
        }

        // valor default do boolean é false.
        boolean value = true;
        // unicode que representa o caractere '❤'
        char heart = '\u2764';
        System.out.println(Character.toString(heart));

        // printando letras do alfabeto
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            System.out.print(" "+ letter);
        }

        System.out.print("\n");

        // ponto flutuante não exato
        float notExactFloat = 3.1415926f;
        System.out.println(notExactFloat); // 3.1415925

        double scientificNotationDouble = 1.2e-3; // 0.0012
        double notExactDouble = 1.32 - 0.42; // result should be 0.9
        System.out.println(notExactDouble); // 0.9000000000000001
/*
        Embora o uso de float seja adequado para a maioria das aplicações, nem float nem double
        devem ser usados para armazenar representações exatas de números decimais (como valores monetários)
        ou números onde é necessária maior precisão. Em vez disso, a classe BigDecimal deve ser usada.
*/

    }
}
