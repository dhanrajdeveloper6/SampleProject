package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stdtab22")
public class GitSampleTestClass {
	@Id
	@Column(name="sid")
	private Integer stdId;
	@Column(name="sname")
	private String stdName;
	@Column(name="sfee")
	private Double stdFee;
	
	public GitSampleTestClass() {
		super();
		
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Double getStdFee() {
		return stdFee;
	}

	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}

	@Override
	public String toString() {
		return "GitSampleTestClass [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}
	
	

}
