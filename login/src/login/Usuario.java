package login;


import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {
		String usuario;
		String senha;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Usuario: ");
		usuario = entrada.next();
		System.out.println("Senha: ");
		senha = entrada.next();
		
		if(usuario.contains("Wanderson") && senha.contains("20102010")){
			System.out.println("Usuario lougado com sucesso");
		}else{
			System.out.println("Por favor Verificar usuario ou senha invalido!");
		}
		
		entrada.close();
	
	}

	
	

}
