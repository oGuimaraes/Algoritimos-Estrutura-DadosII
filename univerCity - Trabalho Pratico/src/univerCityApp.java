import java.util.*;

public class univerCityApp {
    private static int chaveCurso = 1;
    private static CDicionario cursos = new CDicionario();
    private static Scanner entrada;
    private static Random gerador;
    private static Scanner sc;

    public static void menu() {
        System.out.println("======================================================");
        System.out.println("\t\t Sistema Universidade");
        System.out.println("1. Cadastrar Curso");
        System.out.println("2. Cadastrar Disciplina no Curso");
        System.out.println("3. Matricular aluno");
        System.out.println("4. Matricular aluno em uma Disciplina");
        System.out.println("5. Exibir cursos");
        System.out.println("6. Exibir Disciplinas de um Curso");
        System.out.println("7. Exibir Alunos de um Curso");
        System.out.println("8. Exibir lista de presenca");
        System.out.println("9. Exibir alunos regulares");
        System.out.println("0. Sair");

    }

    public static void main(String[] args) {
        cursos.adiciona(chaveCurso, inicializaBancoCursos());
        inicializaBancoDisciplinas();
        inicializaBancoAlunos();

        int opcao;
        entrada = new Scanner(System.in);

        do {
            menu();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println();
                    cursos.adiciona(chaveCurso, cadastrarCurso());
                    break;

                case 2:
                    System.out.println();
                    cadastrarDisciplina();
                    break;

                case 3:
                    System.out.println();
                    matricularAluno();
                    break;

                case 4:
                    System.out.println();
                    matricularAlunoDisciplina();
                    break;
                case 5:
                    System.out.println();
                    cursos.printKeysAndValues();
                    break;
                case 6:
                    System.out.println();
                    exibeDisciplinas();
                    break;
                case 7:
                    System.out.println();
                    exibeAlunos();
                    break;
                case 8:
                    System.out.println();
                    listaPresenca();
                    break;
                case 9:
                    System.out.println();
                    alunosRegulares();
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

    }

    private static Curso cadastrarCurso() {
        System.out.println("======================================================");
        System.out.println("Digite um nome para o curso: ");
        sc = new Scanner(System.in);
        String inputNome = sc.nextLine();
        Curso c = new Curso(inputNome);
        c.disciplinas = new CDicionario();
        c.alunosCurso = new CDicionario();
        chaveCurso++;
        System.out.println("Curso " + c.getNome() + " cadastrado com sucesso!");
        return c;
    }

    private static void cadastrarDisciplina() {

        sc = new Scanner(System.in);
        int op = 666;
        Disciplina disciplina;
        Curso cursoEscolhido;
        cursoEscolhido = escolheCurso();
        System.out.println("Curso escolhido: " + cursoEscolhido.getNome());

        while (op != 0) {
            String nomeDisciplina = " ";
            System.out.println("Digite um nome para a disciplina: ");
            nomeDisciplina = sc.next();
            System.out.println("Digite o periodo da disciplina: ");
            op = sc.nextInt();
            disciplina = new Disciplina(nomeDisciplina, op);
            cursoEscolhido.disciplinas.adiciona(cursoEscolhido.chaveDisciplina, disciplina);
            cursoEscolhido.incrementaChave();
            System.out.println("\n Disciplinas cadastradas no curso " + cursoEscolhido.getNome());
            cursoEscolhido.disciplinas.printKeysAndValues();
            disciplina.turma = new CDicionario();
            disciplina.matriculas = new ArrayList<Integer>();
            System.out.println("\nEscolha sua opcao:");
            System.out.println("1 - Cadastra mais disciplinas.");
            System.out.println("0 - Voltar a tela inicial.");
            op = sc.nextInt();
        }

    }



    private static void matricularAluno() {
        sc = new Scanner(System.in);
        gerador = new Random();
        Aluno aluno;
        Curso cursoEscolhido;
        cursoEscolhido = escolheCurso();
        System.out.println("Curso escolhido: " + cursoEscolhido.getNome());
        String nomeAluno = " ";
        System.out.println("Digite o nome do novo aluno: ");
        nomeAluno = sc.next();
        aluno = new Aluno(nomeAluno, gerador.nextInt(999999)+100000,1);

        System.out.println("\n Alunos cadastradas no curso " + cursoEscolhido.getNome());
        cursoEscolhido.alunosCurso.adiciona(aluno.getMatricula(), aluno);
        cursoEscolhido.alunosCurso.printKeysAndValues();
        int op = 666;
        while (op != 0) {
            System.out.println("Escolha uma opcao: ");
            System.out.println("1 - Matricular " + aluno.getNome() + " em uma disciplina do curso.");
            System.out.println("0 - Voltar a tela inicial.");
            op = sc.nextInt();
            if (op != 0) {
                matricularAlunoDisciplina(cursoEscolhido, aluno);
            }
        }
    }

    private static void matricularAlunoDisciplina() {
        Curso cursoEscolhido = escolheCurso();
        Aluno alunoEscolhido = escolheAluno(cursoEscolhido);
        Disciplina disciplinaEscolhida = escolheDisciplina(cursoEscolhido);
        disciplinaEscolhida.turma.adiciona(alunoEscolhido.getMatricula(), alunoEscolhido);
        disciplinaEscolhida.matriculas.add(alunoEscolhido.getMatricula());
    }

    private static void matricularAlunoDisciplina(Curso curso, Aluno aluno) {
        Disciplina disciplinaEscolhida;
        disciplinaEscolhida = escolheDisciplina(curso);
        disciplinaEscolhida.turma.adiciona(aluno.getMatricula(), aluno);
        disciplinaEscolhida.matriculas.add(aluno.getMatricula());
    }

    private static void exibeDisciplinas() {
        System.out.println("\n");
        int op = 0;
        Curso cursoEscolhido = escolheCurso();
        System.out.println("\nDisciplinas cadastradas no curso " + cursoEscolhido.getNome() + ":");
        cursoEscolhido.disciplinas.printKeysAndValues();
    }

    private static void exibeAlunos() {
        System.out.println("\n");
        int op = 0;
        Curso cursoEscolhido = escolheCurso();
        System.out.println("\nAlunos matriculados no curso " + cursoEscolhido.getNome() + ":");
        cursoEscolhido.alunosCurso.imprimeValores();
    }

    private static Curso inicializaBancoCursos() {
        Curso c;
        String inputNome = "Engenharia de Software";
        c = new Curso(inputNome);
        chaveCurso++;
        c.disciplinas = new CDicionario();
        c.alunosCurso = new CDicionario();
        return c;
    }

    private static void inicializaBancoAlunos() {
        Curso cursoEscolhido = (Curso) cursos.recebeValor(1);
        Aluno[] Aluno = new Aluno[20];

        String[] nomeAlunos = {"Daniel Lyncon", "Pedro Henrique", "Matheus Santos", "Igor Vinicius", "Tadeu Antônio",
                "Maria Silva", "Jessica Nunes", "Otávio Guimarães", "Jorge Henrique", "Marina Barbosa",
                "Vanessa Luiza", "Hugo Afonso", "Marcos André", "Júlia Lopes", "Barbara Caetano",
                "Douglas Santos", "Wesley Costa", "Jonas Veiga", "Breno Peixoto", "Carlos André"};

        int[] numerosMatriculas = {101065, 571751, 284121, 123154, 978451, 452151, 231854, 789465, 645132, 945501, 451215,
                512812, 714521, 541225, 845212, 218951, 2132151, 8451321, 151231, 455321};

        for (int i = 0; i < Aluno.length; i++) {
            Aluno[i] = new Aluno(nomeAlunos[i], numerosMatriculas[i], 1);
            cursoEscolhido.alunosCurso.adiciona(Aluno[i].getMatricula(), Aluno[i]);
        }

        Disciplina disciplinaEscolhida;

        for (int i = 1; i < 8; i++) {
            disciplinaEscolhida = (Disciplina) cursoEscolhido.disciplinas.recebeValor(i);
            for (int j = 0; j < nomeAlunos.length; j++) {
                if (j % 2 == 0) {
                    disciplinaEscolhida.turma.adiciona(Aluno[j].getMatricula(), Aluno[j]);
                    disciplinaEscolhida.matriculas.add(Aluno[j].getMatricula());
                }
            }
        }
    }

    private static void inicializaBancoDisciplinas() {
        Curso cursoEscolhido = (Curso) cursos.recebeValor(1);
        Disciplina[] disciplina = new Disciplina[14];

        String[] nomeDisciplinas1P = {"Algoritmos e Estrutura de Dados I", "Laboratorio de Computacao I", "Fundamentos de Engenharia de Software",
                "Calculo I", "Trabalho Interdisciplinar de Software I", "Desenvolvimento de Interfaces WEB", "Introdução a Computaçao"};

        String[] nomeDisciplinas2P = {"Algoritimos e Estruturas de Dados II", "Laboratorio de Computação II", "Calculo II", "Arquitetura de Computadores",
                "Programaçao Modular", "Trabalho Interdisciplinar de Software II", "Modelagem de Processos de Negocios"};

        for (int i = 0; i < disciplina.length/2; i++) {
            disciplina[i] = new Disciplina(nomeDisciplinas1P[i], 1);
            cursoEscolhido.disciplinas.adiciona(cursoEscolhido.chaveDisciplina, disciplina[i]);
            disciplina[i].turma = new CDicionario();
            disciplina[i].matriculas = new ArrayList<>();
            cursoEscolhido.chaveDisciplina++;
        }

        for (int i = 0; i < disciplina.length/2; i++) {
            disciplina[i] = new Disciplina(nomeDisciplinas2P[i], 2);
            cursoEscolhido.disciplinas.adiciona(cursoEscolhido.chaveDisciplina, disciplina[i]);
            disciplina[i].turma = new CDicionario();
            disciplina[i].matriculas = new ArrayList<>();
            cursoEscolhido.chaveDisciplina++;
        }
    }

    private static void listaPresenca() {
        sc = new Scanner(System.in);
        int op = 0;
        Curso cursoEscolhido = escolheCurso();
        Disciplina disciplinaEscolhida = escolheDisciplina(cursoEscolhido);
        disciplinaEscolhida.turma.imprimeNomeAluno();
    }

    private static Curso escolheCurso() {
        sc = new Scanner(System.in);
        Curso c;
        int op;
        System.out.println("======================================================");
        System.out.println("Selecione um curso digitando seu codigo: ");
        cursos.printKeysAndValues();
        op = sc.nextInt();
        c = (Curso) cursos.recebeValor(op);
        return c;
    }

    private static Aluno escolheAluno(Curso c) {
        Aluno aux;
        int op;
        System.out.println("======================================================");
        System.out.println("Selecione um Aluno digitando sua matricula: ");
        c.alunosCurso.printKeysAndValues();
        op = sc.nextInt();
        aux = (Aluno) c.alunosCurso.recebeValor(op);
        return aux;
    }

    private static Disciplina escolheDisciplina(Curso c) {
        Disciplina aux;
        int op;
        System.out.println("Selecione uma disciplina digitando seu codigo:");
        c.disciplinas.printKeysAndValues();
        op = sc.nextInt();
        aux = (Disciplina) c.disciplinas.recebeValor(op);
        System.out.println("Disciplina escolhida: " + aux.getNome());
        return aux;
    }

    private static void alunosRegulares() {
        CDicionario alunosRegulares = new CDicionario();
        sc = new Scanner(System.in);

        Curso c;
        Aluno a;
        Disciplina d;

        int periodoEscolhido = 1;
        c = escolheCurso();
        Integer[] matriculas = c.alunosCurso.retornarChaves();
        Integer[] materias = c.disciplinas.retornarChaves();

        if (c.disciplinas.qtde > 1) {
            System.out.println("Defina o periodo para realizar a busca: ");
            periodoEscolhido = sc.nextInt();

            for (int i = 0; i < matriculas.length; i++) {
                a = (Aluno) c.alunosCurso.recebeValor(matriculas[i]);
                for (int j = 0; j < materias.length; j++) {
                    d = (Disciplina) c.disciplinas.recebeValor((materias[j]));
                    if ((a.getSemestre() == periodoEscolhido) && (d.getPeriodo() == periodoEscolhido) && d.matriculas.contains(a.getMatricula()) && !(alunosRegulares.contemChave(a.getMatricula()))){
                        alunosRegulares.adiciona(a.getMatricula(),a);
                    }
                }
            }

        }
        System.out.println("Alunos Regulares do " + periodoEscolhido
                + "º periodo do curso " + c.getNome() + ":");
        alunosRegulares.printKeysAndValues();
    }
}