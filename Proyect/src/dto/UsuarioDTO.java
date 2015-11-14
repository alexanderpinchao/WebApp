package dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUsuario;
	private String apeUsuario;
	private String dirUsuario;
	private String emailUsuario;
	private String nomUsuario;
	private String passUsuario;
	private String pregUsuario;
	private String respUsuario;
	private String userUsuario;
	public UsuarioDTO() {
		
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getApeUsuario() {
		return apeUsuario;
	}
	public void setApeUsuario(String apeUsuario) {
		this.apeUsuario = apeUsuario;
	}
	public String getDirUsuario() {
		return dirUsuario;
	}
	public void setDirUsuario(String dirUsuario) {
		this.dirUsuario = dirUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public String getNomUsuario() {
		return nomUsuario;
	}
	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	public String getPassUsuario() {
		return passUsuario;
	}
	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}
	public String getPregUsuario() {
		return pregUsuario;
	}
	public void setPregUsuario(String pregUsuario) {
		this.pregUsuario = pregUsuario;
	}
	public String getRespUsuario() {
		return respUsuario;
	}
	public void setRespUsuario(String respUsuario) {
		this.respUsuario = respUsuario;
	}
	public String getUserUsuario() {
		return userUsuario;
	}
	public void setUserUsuario(String userUsuario) {
		this.userUsuario = userUsuario;
	}
	

	
	

}
