package repositories;

import domain_models.DongSP;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;
import view_model.QLDongSP;

import java.util.ArrayList;
import java.util.List;

public class DongSPRepository {
    private ArrayList<QLDongSP> list;
    private Session hSession;

    public DongSPRepository()
    {
        this.list = new ArrayList<>();
        this.hSession = HibernateUtil.getFACTORY().openSession();

    }

    public void insert(DongSP dsp)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(dsp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void update(DongSP dsp)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(dsp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(DongSP dsp)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(dsp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public DongSP findById(String id)
    {
        return this.hSession.find(DongSP.class, id);
    }

    public List<DongSP> findAll()
    {
        String hql = "SELECT obj FROM DongSP obj";
        TypedQuery<DongSP> query = this.hSession.createQuery(hql, DongSP.class);
        return query.getResultList();
    }

    public DongSP findByMa(String ma)
    {
        String hql = "SELECT obj FROM DongSP obj WHERE obj.Ma = ?1";
        TypedQuery<DongSP> query = this.hSession.createQuery(hql, DongSP.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
}
