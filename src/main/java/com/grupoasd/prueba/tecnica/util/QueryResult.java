package com.grupoasd.prueba.tecnica.util;

import java.util.List;

public class QueryResult {
	
	private int totalRegistros;
	public int getTotalRegistros() {
		return totalRegistros;
	}
	public void setTotalRegistros(int totalRegistros) {
		this.totalRegistros = totalRegistros;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	private List<Object> list;

}
