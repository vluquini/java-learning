package BDExample;

public interface Database extends SqlDDL, SqlDCL, SqlDML{
    void abrirConexao();
    void fecharConexao();
}

