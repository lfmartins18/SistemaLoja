package ifal.edu.tarde.br.SistemaLoja.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue
	private Integer id;
   
	@Column
    private String nomeCompleto;
    @Column
    private Date dataNascimento;
    @Column
    private String email;
    @Column
    private Integer senha;


	public Cliente() {
		super();
	}

	public Cliente(String nomeCompleto, Date dataNasc, String email, Integer senha) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNasc;
		this.email = email;
		this.senha = senha;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Date getDataNasc() {
		return dataNascimento;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNascimento = dataNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getSenha() {
		return senha;
	}
	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nomeCompleto=" + nomeCompleto + ", dataNascimento=" + dataNascimento
				+ ", email=" + email + ", senha=" + senha + "]";
	}

}
