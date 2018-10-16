
package Controllers;

import Models.UsuarioModel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sql.Conexion;

public class UsuarioController {
    public static boolean validacionUsuario(String user, String pass) {
        boolean existe = false;
        try {
            Connection conexion = Conexion.getConexion();
            String query = "select * from USUARIO where USU_RUT = ? and USU_PASS = ?";
            PreparedStatement buscar = conexion.prepareStatement(query);
            buscar.setString(1, user);
            buscar.setString(2, pass);
            ResultSet rs = buscar.executeQuery();
            while (rs.next()) {
//                AdministrativoDto dto = new AdministrativoDto();
//                dto.setStrUser(rs.getString("USER_ADM"));
//                dto.setStrPass(rs.getString("PASS_ADM"));
//                dto.setStrNombre(rs.getString("NOMBRE_ADM"));
//                dto.setIntFono(rs.getInt("FONO_ADM"));
//                dto.setStrEmail(rs.getString("EMAIL_ADM"));
//                dto.setIntIdCondominio(rs.getInt("CONDOMINIO_ID_CONDOMI"));
//                dto.setIntTipoAdmin(rs.getInt("TIPO_ADMIN_ID_TIPO_ADMIN")); 
                existe = true;
            }
            buscar.close();
            conexion.close();
        } catch (Exception e) {
            existe = false;
        }
        return existe;
    }

    public static int idLocal(String text, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int idTipo(String text, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
