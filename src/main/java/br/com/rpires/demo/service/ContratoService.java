package br.com.rpires.demo.service;

import br.com.rpires.demo.dao.IContratoDao;

public class ContratoService implements IContratoService {

	private IContratoDao contratoDao;

	public ContratoService(IContratoDao dao) {
		this.contratoDao = dao;
	}

	@Override
	public String salvar() {
		contratoDao.salvar();
		return "Sucesso";
	}

	@Override
	public String buscar() {
		return "Sucesso";
	}

	@Override
	public String excluir() {
		return "Sucesso";
	}

	@Override
	public String atualizar() {
		return "Sucesso";
	}

}
