package programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.Carro;
import entidades.Moto;
import entidades.Produto;
import excecoes.AtualizarExcecao;
import excecoes.InsercaoExcecao;
import excecoes.PesquisaExcecao;
import excecoes.RemocaoExcecao;

public class Main {
//leitura = printar o que esta no arquivo ?
//inserir ou remover tem que atualizar o arquivo na hora 
//confirmar excecao	
//mostrar o pesquisar
//mostra classe abstrata
//botar no git
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Produto> lista = new ArrayList<>();
		//inicio
		boolean success = new File("C:\\temp").mkdir();
		System.out.println("Arquivo criado com  "+ success);
		String path = "C:\\temp\\Produtos.txt";
		
		
		int m=0;
		do {
			try
			{
				System.out.println();
				System.out.println("1-Leitura\n" + "2-Insercao\n" + "3-Pesquisa\n"
						+ "4-Remocao\n" + "5-Printar\n" + "6-Gravar\n" + "7-Sair do programa");

				System.out.println("DIGITE:");

				m = sc.nextInt();
				switch (m) 
				{
				case 1:
					leitura(path);
					break;
				case 2:
					insercao(lista);
					break;
				case 3:
					pesquisa(lista);
					break;
				case 4:
                	remocao(lista);
                	break;
				case 5:
					printar(lista);
					break;
				case 6:
					atualizar(lista,path);
					break;
				case 7:
					m = 7;
					System.out.println("Programa finalizado");
					break;
				default:
					System.out.println("error");
				}
			}
			catch(AtualizarExcecao e)
			{
				System.out.println("Erro em atualizar: " + e.getMessage());
			}
			catch(InsercaoExcecao e)
			{
				System.out.println("Erro em insercao: " + e.getMessage());
			}
			catch(PesquisaExcecao e)
			{
				System.out.println("Erro em pesquisa: " + e.getMessage());
			}
			catch(RemocaoExcecao e)
			{
				System.out.println("Erro em remocao: " + e.getMessage());
			}
        } while (m != 7);
		
       sc.close();
    }
		

	public static void leitura(String path) 
	{

		try (BufferedReader br = new BufferedReader(new FileReader(path))) 
		{
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Error: " + e.getMessage());
		}

	}

	
	public static void insercao(ArrayList<Produto> lista) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String marca;
		double preco;
		int quantidade;
		String modelo;

		System.out.println("Carro - 1\nMoto - 2");
		int t = sc.nextInt();
		sc.nextLine();
		if (t == 1 || t == 2) 
		{
			System.out.println("Digite a marca do produto: ");
			marca = sc.nextLine();
			System.out.println("Digite o preco do produto: ");
			preco = sc.nextDouble();
			System.out.println("Digite a quantidade do produto: ");
			quantidade = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o modelo do produto: ");
			modelo = sc.nextLine();

			if (t == 1) 
			{
				System.out.println("Digite o tamanho do carro:\n1-Pequeno\n2-Medio\n3-Grande\n");
				int x = sc.nextInt();
				String tamanho;

				if (x == 1) 
				{
					tamanho = "Pequeno";
					lista.add(new Carro(marca, preco, quantidade, modelo, tamanho));
				} 
				else if (x == 2) 
				{
					tamanho = "Medio";
					lista.add(new Carro(marca, preco, quantidade, modelo, tamanho));
				} 
				else if (x == 3) 
				{
					tamanho = "Grande";
					lista.add(new Carro(marca, preco, quantidade, modelo, tamanho));
				}
				else 
				{
					throw new InsercaoExcecao("Error ao escolher o tamanho para o carro");
				}
			} 
			else 
			{
				System.out.println("Digite a quantidade de cilindradas:");
				int cc = sc.nextInt();
				if (cc >= 1) 
				{
					lista.add(new Moto(marca, preco, quantidade, modelo, cc));
				} 
				else 
				{
					throw new InsercaoExcecao("Numero de cilindradas invalido");
				}
			}
		} 
		else 
		{
			throw new InsercaoExcecao("Error ao escolher o produto(Digite 1-Carro ou 2-Moto");
		}
	}

	

	public static void pesquisa(ArrayList<Produto> lista) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String marca, modelo;

		if (lista.isEmpty() == true) 
		{
			throw new PesquisaExcecao("Lista esta vazia");
		}
		else 
		{
			System.out.println("Digite a marca do produto:");
			marca = sc.nextLine();
			System.out.println("Digite o modelo do produto:");
			modelo = sc.nextLine();
			for (Produto e : lista) 
			{
				if (e.getMarca().equals(marca) && e.getModelo().equals(modelo)) 
				{
					System.out.println("Produto encontrado: \n" + e.toString());
					break;
				} 
				else 
				{
					throw new PesquisaExcecao("Não esta na lista");
				}

			}
		}

	}


	public static void remocao(ArrayList<Produto> lista)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String marca, modelo;

		if (lista.isEmpty() == true) 
		{
			throw new RemocaoExcecao("Lista esta vazia");
		} 
		else 
		{
			System.out.println("Digite a marca do produto:");
			marca = sc.nextLine();
			System.out.println("Digite o modelo do produto:");
			modelo = sc.nextLine();
			for (Produto e : lista) 
			{
				if (e.getMarca().equals(marca) && e.getModelo().equals(modelo)) 
				{
					lista.remove(e);
					System.out.println("Removido");
					break;
				} 
				else 
				{
					throw new RemocaoExcecao("Não esta na lista");
				}
			}
		}

	}

	
	public static void printar(ArrayList<Produto> lista) 
	{
		if (lista.isEmpty() == true) 
		{
			throw new RemocaoExcecao("Lista esta vazia");
		} 
		else 
		{
			for (Produto e : lista) 
			{
				System.out.println(e);
			}
		}
	}

	// atualizar o arquivo
	public static void atualizar(ArrayList<Produto> lista,String path) 
	{
		
		if(lista.isEmpty() == true)
		{
			throw new AtualizarExcecao("Lista esta vazia");
		}
		else
		{
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) 
			{
				for (Produto e : lista) 
				{
				
				bw.write(e.toString());
				bw.newLine();
				System.out.println("Produto gravado com sucesso");
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
		    }
		}
    }
}
