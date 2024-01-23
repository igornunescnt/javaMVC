package model;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private Date dtNascimento;
	private ArrayList<Item> itens = new ArrayList<Item>();
}
