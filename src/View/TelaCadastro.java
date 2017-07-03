/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Compras.TelaCompra;
import View.Fornecedores.TelaFornecedor;
import View.Funcionarios.TelaFuncionario;
import View.Pacientes.TelaPaciente;
import View.Vacinas.TelaVacina;
import com.googlecode.lanterna.gui.Action;
import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.Panel;

/**
 *
 * @author Jefferson Vantuir
 */
public class TelaCadastro extends Window {
    private Panel painel01;
    
    private Button botaoCliente;
    private Button botaoFornecedores;
    private Button botaoFuncionarios;
    private Button botaoVacinas;
    private Button botaoCompra;
    private Button botaoSair;

    private static GUIScreen guitelaCadastros;
    
    public TelaCadastro(GUIScreen gs) {
        super("Sistema de Controle de Vacinas");
        this.guitelaCadastros = gs;
        init();
    }

    private void init() {
        setBorder(new Border.Standard());
        painel01 = new Panel(Panel.Orientation.VERTICAL);
        
        botaoCompra = new Button("Comprar", new Action() {
            @Override
            public void doAction() {
              guitelaCadastros.showWindow(new TelaCompra(guitelaCadastros));
            }
        });
        painel01.addComponent(botaoCompra);
        
        botaoFornecedores = new Button("Fornecedores", new Action() {
            @Override
            public void doAction() {
              guitelaCadastros.showWindow(new TelaFornecedor(guitelaCadastros));
            }
        });
        painel01.addComponent(botaoFornecedores);
        
        botaoFuncionarios = new Button("Funcionarios", new Action() {
            @Override
            public void doAction() {
              guitelaCadastros.showWindow(new TelaFuncionario(guitelaCadastros));
            }
        });
        painel01.addComponent(botaoFuncionarios);
        
        botaoCliente = new Button("Pacientes", new Action() {
            @Override
            public void doAction() {
              guitelaCadastros.showWindow(new TelaPaciente(guitelaCadastros));
            }
        });
        painel01.addComponent(botaoCliente);

        botaoVacinas = new Button("Vacinas", new Action() {
            @Override
            public void doAction() {
              guitelaCadastros.showWindow(new TelaVacina(guitelaCadastros));
            }
        });
        painel01.addComponent(botaoVacinas);

        botaoSair = new Button("Voltar", new Action() {
             @Override
            public void doAction() {
                close();
            }
         });
        
        painel01.addComponent(botaoSair);
        addComponent(painel01);
    }   
}
