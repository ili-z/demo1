package cn.bdqn.entity;
/**
   * ��ɫ
 * @author Lenovo
 *
 */
public class Role {
	//id  role  
	private int id;//��ɫid
	private String role;//��ɫ����
	
	public Role() {}
	
	
	public Role(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", getId()=" + getId() + ", getRole()=" + getRole()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
