package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.Conta;

public class CriaConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TreinamentoJPA");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setAgencia(7772);
		conta.setTitular("Herick");
		conta.setNumero(202789);
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();

	}

}
