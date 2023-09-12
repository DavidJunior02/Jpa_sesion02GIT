package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbUsuario;

public class Prueba {

	public static void main(String[] args){
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_Clase2x");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		System.out.println("===JAVA LIST====");
		List<TbUsuario> listado = em.createQuery("Select a from TbUsuario a", TbUsuario.class).getResultList();
		System.out.println("=====================================");
		System.out.println("Numero de Usuarios: " + listado.size());
		System.out.println("=====================================");
	}
}
