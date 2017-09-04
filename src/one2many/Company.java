package one2many;

import java.util.HashSet;
import java.util.Set;

/**
 * 演示一对多的关系
 * @author Administrator
 *
 */
public class Company {
	private Integer id;
	private String name;
	private String location;
	private Set<Employee> set = new HashSet<Employee>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Employee> getSet() {
		return set;
	}
	public void setSet(Set<Employee> set) {
		this.set = set;
	}
}
