package uk.co.o2.vo;

public class Tariff {

	private long tariffId;
	
	private String name;
	
	private String description;

	private String type;

	private String status;

	private String allowance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getAllowance() {
		return allowance;
	}

	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return "Tariff [name=" + name + ", description=" + description
				+ ", type=" + type + ", status=" + status + ","
				+ ", allowance=" + allowance + "]";
	}

	public long getTariffId() {
		return tariffId;
	}

	public void setTariffId(long tariffId) {
		this.tariffId = tariffId;
	}

}
