package modelo;

import java.time.LocalDate;
import java.util.Date;


public class Funcionario {
		private String cpf;
		private int idcargos;
		private String hotel_cnpj;
		private String nome;
		private Date data_nascimento;
		private Date data_admissao;
		private Date data_demissao;
		private String logradouro;
		private int numero;
		private String complemento;
		private String bairro;
		private String cidade;
		private String uf;
		private String cep;
		
		public Funcionario(String cpf, int idcargos, String hotel_cnpj, String nome, Date data_nascimento,
				Date data_admissao, Date data_demissao, String logradouro, int numero, String complemento,
				String bairro, String cidade, String uf, String cep) {
		
			this.cpf = cpf;
			this.idcargos = idcargos;
			this.hotel_cnpj = hotel_cnpj;
			this.nome = nome;
			this.data_nascimento = data_nascimento;
			this.data_admissao = data_admissao;
			this.data_demissao = data_demissao;
			this.logradouro = logradouro;
			this.numero = numero;
			this.complemento = complemento;
			this.bairro = bairro;
			this.cidade = cidade;
			this.uf = uf;
			this.cep = cep;
		}

		@Override
		public String toString() {
			return "CPF: " + cpf + "\n ID Cargo: " + idcargos + "\n CNPJ: " + hotel_cnpj + "\n Nome: "
					+ nome + "\n Data de Nascimento: " + data_nascimento + "\n Data de Admissao: " + data_admissao
					+ "\n Data de Demissão: " + data_demissao + "\n Endereço, " + logradouro + " nº " + numero
					+ ", Complemento: " + complemento + ", Bairro: " + bairro + ", Cidade: " + cidade + ", UF: " + uf
					+ ", CEP: " + cep + "\n------";
		}
		
		


}

