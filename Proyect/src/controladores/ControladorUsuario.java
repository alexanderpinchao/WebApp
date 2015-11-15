package controladores;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



import dto.UsuarioDTO;
import modelo.Usuario;
import interfaces.InterfaceUsuario;

public class ControladorUsuario implements InterfaceUsuario{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Proyect");
	EntityManager em=emf.createEntityManager();
	
	
	
	@Override
	public void agregarUsuario(String user, String pass, String nombre,
			String apellido, String direccion, String pregunta, String email,
			String respuesta) {
		// TODO Auto-generated method stub
		
	}

	public  UsuarioDTO consultarUsuario(int iduser) {
		Usuario user=em.find(Usuario.class, iduser);
		UsuarioDTO dto=new UsuarioDTO();
		dto.setApeUsuario(user.getApeUsuario());
		dto.setIdUsuario(user.getIdUsuario());
		dto.setPassUsuario(user.getPassUsuario());
		dto.setNomUsuario(user.getNomUsuario());
		return dto;
	}

	@Override
	public void eliminarUsuario(String user,String pass) {
		Query query=em.createQuery("select u from Usuario u where u.userUsuario='"+user+"'");
		
		Usuario us=(Usuario) query.getSingleResult();
		String clave=us.getPassUsuario();
		if(clave.contentEquals(pass)){
			int id=us.getIdUsuario();
			try{
				em.getTransaction().begin();
				em.remove(id);
				em.getTransaction().commit();
				System.out.println("usuario eliminado exitosamente");
			System.out.println("-------------------------------/n"+us.getIdUsuario());
			}catch(Exception e){
				System.out.println("no se pudo borrar el usuario");
			}
			
			
			}
		else {
			
			System.out.println("El usuario no coincide con el password");
		}
		
	}

	@Override
	public void actualizarUsuario(int id, String user, String pass,
			String nombre, String apellido, String direccion, String pregunta,
			String email, String respuesta) {
		// TODO Auto-generated method stub
		
	}

}
