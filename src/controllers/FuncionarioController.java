package controllers;

import java.text.SimpleDateFormat;
import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Funcionario;
import enums.TipoContratacao;
import repositories.FuncionarioRepository;

public class FuncionarioController {

	public void cadastrarFuncionario() {

		try {

			var funcionario = new Funcionario();

			funcionario.setId(UUID.randomUUID());
			funcionario.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário:"));
			funcionario.setMatricula(JOptionPane.showInputDialog("Informe a matrícula:"));
			funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse(JOptionPane.showInputDialog("Informe a data de admissão:")));
			
			var opcao = JOptionPane.showInputDialog ("Informe (1)Estágio, (2)CLT ou (3)Terceirizado:");
			
			switch(opcao) {
			
			case "1": funcionario.setTipo(TipoContratacao.ESTAGIO); break;
			case "2": funcionario.setTipo(TipoContratacao.CLT); break;
			case "3": funcionario.setTipo(TipoContratacao.TERCEIRIZADO); break;
			}
			
			var funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);

		} catch (Exception e) {
			System.out.println("\nFalha ao cadastrar funcionário: " + e.getMessage());
		}
	}

}
