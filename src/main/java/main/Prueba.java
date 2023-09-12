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
		
		
		Query query=em.createNativeQuery("{call usp_validaAcceso(?,?)}",TbUsuario.class);
		query.setParameter(1, "U001@gmail.com");
		query.setParameter(2, "10001");
		TbUsuario u=(TbUsuario)query.getSingleResult();
		if(u==null){
			
			System.out.println("El usuario no existe");
		}else{
			System.out.println("Bienvenido"+u.getNomUsua()+""+u.getApeUsua());
		}
		
	}
}
