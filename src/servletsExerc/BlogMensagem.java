package servletsExerc;

import java.time.LocalTime;
import java.util.Date;

public class BlogMensagem {
	private String usuario;
	private int id;
	private String mensagem;
	private Date dataMensagem;
	private LocalTime horaMensagem;
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Date getDataMensagem() {
		return dataMensagem;
	}
	public void setDataMensagem(Date dataMensagem) {
		this.dataMensagem = dataMensagem;
	}
	public LocalTime getHoraMensagem() {
		return horaMensagem;
	}
	public void setHoraMensagem(LocalTime horaMensagem) {
		this.horaMensagem = horaMensagem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
