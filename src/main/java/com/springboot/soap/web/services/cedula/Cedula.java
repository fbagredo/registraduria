package com.springboot.soap.web.services.cedula;

public class Cedula {
	private String tipoId;
	private String numCedula;
	private Boolean isValido;

	public Cedula() {
		super();
	}

	public Cedula(String numCedula, Boolean isValido) {
		super();
		this.numCedula = numCedula;
		this.isValido = isValido;
	}

	public String getNumCedula() {
		return numCedula;
	}

	public void setName(String name) {
		this.numCedula = name;
	}

	public Boolean getIsValido() {
		return isValido;
	}

	public void setIsValido(Boolean isValido) {
		this.isValido = isValido;
	}

		public String getTipoId() {
		return tipoId;
	}

	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	@Override
	public String toString() {
		return String.format("numCedula=%s, isValido=%s]", numCedula, isValido);
	}

}
