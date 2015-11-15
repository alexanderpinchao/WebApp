package controladores;

import dto.UsuarioDTO;


public class Prueba {

	public static void main(String[] args) {
		String user="alex";
		String pass="juan";
		UsuarioDTO dto=new ControladorUsuario().consultarUsuario(1);
System.out.println("hola <3 "+dto.toString());
new ControladorUsuario().eliminarUsuario(user, pass);
	}

}
