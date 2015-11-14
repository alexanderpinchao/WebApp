package interfaces;

import dto.UsuarioDTO;


public interface InterfaceUsuario {
public void agregarUsuario(String user, String pass, String nombre,String apellido,String direccion,String pregunta, String email,String respuesta);
public  UsuarioDTO consultarUsuario(int iduser);
public void eliminarUsuario(String user,String pass);
public void actualizarUsuario(int id,String user, String pass, String nombre,String apellido,String direccion,String pregunta, String email,String respuesta);
}
