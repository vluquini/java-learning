package fundamentos.exceptions;

// Exception = Superclasse das Exceptions.
public class DivisaoNaoExataException extends Exception {
    protected int num;
    protected int denom;

    public DivisaoNaoExataException(int num, int denom) {
        super();
        this.num = num;
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + denom + " não é inteiro.";
    }

}