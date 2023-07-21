package controllers;

import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller {
	
	public static void form() {
		render();
	}
	
	public static void listar() {
		List<Postagem> lista = Postagem.findAll();
		render(lista);
	}
	
	public static void salvar(Postagem p) {
		p.save();
		form();
	}
	
	public static void deletar(Long id) {
		Postagem pos = Postagem.findById(id);
		pos.delete();
		listar();
		
	}


}
