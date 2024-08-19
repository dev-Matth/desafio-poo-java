import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descricao curso Python");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descricao mentoria Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Python");
        mentoria2.setDescricao("Descricao mentoria Python");
        mentoria2.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);        
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}