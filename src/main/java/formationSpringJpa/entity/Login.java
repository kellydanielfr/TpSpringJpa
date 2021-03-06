package formationSpringJpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "login")
@SequenceGenerator(name = "seqLogin", sequenceName = "seq_login", initialValue = 10, allocationSize = 1)
public class Login implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLogin")
	private Integer id;
	@Column(unique=true)
	private String login;
	private String motDePasse;
	private Role role;
	@Version
	private int version;

	public Login() {
	}

	
	public Login(String login, String motDePasse, Role role) {
		this.login = login;
		this.motDePasse = motDePasse;
		this.role = role;
	}


	public Login(Integer id, String login, String motDePasse, Role role) {
		this.id = id;
		this.login = login;
		this.motDePasse = motDePasse;
		this.role = role;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((motDePasse == null) ? 0 : motDePasse.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		Login other = (Login) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (motDePasse == null) {
			if (other.motDePasse != null)
				return false;
		} else if (!motDePasse.equals(other.motDePasse))
			return false;
		if (role != other.role)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Login [id=" + id + ", login=" + login + ", motDePasse=" + motDePasse + ", role=" + role + "]";
	}
	
	
}
