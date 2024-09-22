import testepacotao.Tarefa;

public class App {
    public static void main(String[] args) throws Exception {
         Tarefa tarefa1 = new Tarefa("lavar carro", "Jogar bola");
	        Tarefa tarefa2 = new Tarefa("Bater bolo", "Compras mercado");

	        tarefa1.AdicionarTarefa(tarefa1);
	        tarefa2.AdicionarTarefa(tarefa2);
	        tarefa1.ListaTarefas();
	        tarefa2.ListaTarefas();
    }
}
