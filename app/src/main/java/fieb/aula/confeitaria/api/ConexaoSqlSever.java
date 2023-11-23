package fieb.aula.confeitaria.api;

import android.content.Context;
import android.os.StrictMode;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSqlSever {

    public static Connection conectar(Context context) {
        //Objeto de conexao
        Connection conn = null;
        try {
//            Adicionar Política de criacao de thread
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);


//        Verificar se o driver de Conexao está importada no projeto
            Class.forName("net.sourceforge.jtds.jdbc.Driver");

            //Obtenha o IP de seu computador e insira abaixo
            //Conexão de Teste

            conn = DriverManager.getConnection("jdbc:jtds:sqlserver://magic_ti.mssql.somee.com;" +
                    "databaseName=magic_ti;user=Jhonatan_SQLLogin_2;password=gat1pmbbbg;");


          //  conn = DriverManager.getConnection("jdbc:jtds:sqlserver://pro_magic.mssql.somee.com;" +
                    //"databaseName=pro_magic;user=Jhonatan_SQLLogin_3;password=qanlzjx3uc;");



//            workstation id=pro_magic.mssql.somee.com;packet size=4096;user id=Jhonatan_SQLLogin_3;pwd=qanlzjx3uc;
//            data source=pro_magic.mssql.somee.com;persist security info=False;initial catalog=pro_magic

        } catch (android.database.SQLException e) { // SQLException
            e.getMessage();
            Toast.makeText(context, "Servidor Indisponível", Toast.LENGTH_LONG).show();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
