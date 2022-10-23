import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{   
    public Main()
    {
        Scanner sc=new Scanner(System.in);

        // Variables for dates

        // variable for ExceptionA handling

        // variable for looking up userNames
        List<Pessoa> Pessoas = new ArrayList<>();
        List<Aluno> Alunos = new ArrayList<>();
        
        
        // people for testing
        Pessoa Person1 = new Pessoa("John doe", "+456432456", "23/5432/45654", "14/01/2022", "14/01/2022", -1);
        Pessoa Person2 = new Pessoa("Admin", "+456432456", "23/5432/45654", "14/01/2022", "14/01/2022", -1);
        Pessoas.add(Person1);
        Pessoas.add(Person2);
        
        // students for testing
        Aluno Student1 = new Aluno("John doe (student)", "+456432456", "23/5432/45654", "14/01/2022", "14/01/2022", 45);
        Aluno Student2 = new Aluno("Admin (student)", "+456432456", "23/5432/45654", "14/01/2022", "14/01/2022", 90);
        Alunos.add(Student1);
        Alunos.add(Student2);
        
        // secondary Commands

        CommandProcessor ProcessCommands = new CommandProcessor();

        while(true)
        {
            LocalDateTime.now();
            System.out.print("\n============================================================\n");
            System.out.print("Escreva 'criar' para criar uma Pessoa ou Aluno\n");
            System.out.print("Escreva 'ver' para mostrar Alunos e Pessoas\n");
            System.out.print("Escreva 'editar' para mudar os dados de uma Pessoa ou Aluno\n");
            System.out.print("Escreva 'deletar' para deletar uma Pessoa ou Aluno\n");
            System.out.print("Escreva '0' para sair\n\n");
            System.out.print("Comando: ");
            String Command = sc.nextLine();
            
            if(Command.equals("0"))
            {
                break;
            }

            ProcessCommands.ProcessCommand(Command, Pessoas, Alunos);
        }
    }
}
