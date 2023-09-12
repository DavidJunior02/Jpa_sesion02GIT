package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.TbUsuario;

public class Prueba {

	public static void main(String[] args){
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_Clase2x");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		
		
		Query query=em.createNativeQuery("{call findall_usuarios()}",TbUsuario.class);
		List<TbUsuario> tabusu=query.getResultList();
				
		
		System.out.println("===JAVA LIST====");
		System.out.println("=====================================");
		System.out.println("Numero de Usuarios: " + tabusu.size());
		System.out.println("=====================================");
	}
}
