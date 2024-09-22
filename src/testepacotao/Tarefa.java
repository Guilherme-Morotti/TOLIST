package testepacotao;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Tarefa {
 
	private String Titulo;
    private String descricao;
    private static ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

    public Tarefa(String Titulo, String descricao) {
        this.Titulo = Titulo;
        this.descricao = descricao;
    }
    
    public void ListaTarefas(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Descrição: " + getDescricao());
    }
    
    public void AdicionarTarefa(Tarefa tarefa) {
        listaDeTarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa.getTitulo());

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tarefas.txt", true))) {
            writer.write("Titulo: " + tarefa.getTitulo() + ", Descrição: " + tarefa.getDescricao());
            writer.newLine(); 
        } catch (IOException e) {
            System.out.println("Erro ao salvar a tarefa: " + e.getMessage());
        }
    }
    
    public String getTitulo() {
        return this.Titulo;
    }
    
    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}