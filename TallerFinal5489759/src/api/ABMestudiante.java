package api;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ABMestudiante {
	public boolean agregarproducto(String nombre_completo, String ci,String facultad, int promocion){
		Basededatos bd = new Basededatos();
		Connection conexion;
		try {
			conexion=bd.conectar();
			
			String sql = "INSERT INTO public.taller_rest_java (nombre_completo,ci,facultad,promocion)"
					+"VALUES (?,?,?,?)";
			PreparedStatement sentencia= conexion.prepareStatement(sql);
			sentencia.setString(1,nombre_completo);
			sentencia.setString(2, ci);
			sentencia.setString(3, facultad);
			sentencia.setInt(4, promocion);
			int resultado= sentencia.executeUpdate();
			sentencia.close();
			if (resultado > 0)
				System.out.println("true");
				return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("false");
		return false;
}
}