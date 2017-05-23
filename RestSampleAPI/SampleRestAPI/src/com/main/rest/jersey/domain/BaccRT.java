package com.main.rest.jersey.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BaccRT {
	private Long  id;
	private String macId;
	private String info;
	
	public BaccRT(Long id, String macId, String info1) {
		super();
		this.id = id;
		this.macId = macId;
		this.info = info1;
	}
	

	public BaccRT() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMacId() {
		return macId;
	}

	public void setMacId(String macId) {
		this.macId = macId;
	}

	

	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((macId == null) ? 0 : macId.hashCode());
		result = prime * result + ((info == null) ? 0 : info.hashCode());
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
		BaccRT other = (BaccRT) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (macId == null) {
			if (other.macId != null)
				return false;
		} else if (!macId.equals(other.macId))
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		return true;
	}

	

	
}