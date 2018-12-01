package Model;

import Controller.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteModel {
    public EntityManager getEm(){
        EntityManagerFactory f = Persistence.createEntityManagerFactory("ContaDeEnergiaPU");
        return f.createEntityManager();
    }
    
    public List<Cliente> listarClientes(){
        EntityManager em = getEm();
        try{
            List cliente =  em.createQuery("select c from Cliente c order by c.nome_cliente").getResultList();
            return cliente;
        }finally{
            em.close();
        }
    }
    
    public void salvar(Cliente c){
        EntityManager em = getEm();
        try{
            em.getTransaction().begin();
            if(c.getId_cliente() == null){
                em.persist(c);
            }else{
                em.merge(c);
            }
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
}
