/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Funcionarios;

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
public class TelaFuncionario extends Window {
    private Panel painel01;
    private Button botaoIncluir;
    private Button botaoAlterarExcuir;
    private Button botaoListagem;
    private Button botaoSair;
    
    private static GUIScreen guitelaFuncionario;
    
    public TelaFuncionario(GUIScreen gs) {
        super("Sistema de Controle de Vacinas");
        this.guitelaFuncionario = gs;
        init();
    }

    private void init() {
        setBorder(new Border.Standard());
        painel01 = new Panel(Panel.Orientation.VERTICAL);
        
        botaoIncluir = new Button("Incluir Funcionario", new Action() {
            @Override
            public void doAction() {
              guitelaFuncionario.showWindow(new TelaIncluirFuncionario(guitelaFuncionario));
            }
        });
        painel01.addComponent(botaoIncluir);
        
        botaoAlterarExcuir = new Button("Alterar/Excluir Funcionario", new Action() {
            @Override
            public void doAction() {
              guitelaFuncionario.showWindow(new TelaAlterarExcluirFuncionario(guitelaFuncionario));
            }
        });
        painel01.addComponent(botaoAlterarExcuir);

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
