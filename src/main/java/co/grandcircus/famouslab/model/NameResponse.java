package co.grandcircus.famouslab.model;

import java.util.List;

public class NameResponse {

	private List<Complete> complete;

	private List<Tinyint> tiny;

	public List<Complete> getComplete() {

		return complete;
	}

	public void setComplete(List<Complete> complete) {

		this.complete = complete;
	}

	public List<Tinyint> getTiny() {

		return tiny;
	}

	public void setTinyint(List<Tinyint> tiny) {

		this.tiny = tiny;
	}
}
