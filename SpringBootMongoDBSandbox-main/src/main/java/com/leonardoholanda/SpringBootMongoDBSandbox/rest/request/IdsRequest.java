package com.leonardoholanda.SpringBootMongoDBSandbox.rest.request;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.validation.constraints.NotEmpty;

public class IdsRequest {

	@NotEmpty(message = "Field \"ids\" is required.")
	private List<UUID> ids;

	public List<UUID> getIds() {
		return ids;
	}

	public void setIds(List<UUID> ids) {
		this.ids = ids;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ids);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdsRequest other = (IdsRequest) obj;
		return Objects.equals(ids, other.ids);
	}

	@Override
	public String toString() {
		return "IdsRequest [ids=" + ids + "]";
	}

	public IdsRequest() {
		super();
	}

	public IdsRequest(List<UUID> ids) {
		super();
		this.ids = ids;
	}
}
