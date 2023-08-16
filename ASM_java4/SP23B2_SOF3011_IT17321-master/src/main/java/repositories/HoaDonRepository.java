package repositories;

import domain_models.HoaDon;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;
import view_model.QLHoaDon;

import java.util.ArrayList;
import java.util.List;

public class HoaDonRepository {
    private ArrayList<HoaDon> list;
    private Session hsession;

    public HoaDonRepository()
    {
        this.list = new ArrayList<>();
        this.hsession = HibernateUtil.getFACTORY().openSession();

    }

    public void insert(HoaDon hd)
    {
        Transaction transaction = this.hsession.getTransaction();
        try {
            transaction.begin();
            this.hsession.persist(hd);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void update(HoaDon hd)
    {
        Transaction transaction = this.hsession.getTransaction();
        try {
            transaction.begin();
            this.hsession.merge(hd);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(HoaDon hd)
    {
        Transaction transaction = this.hsession.getTransaction();
        try {
            transaction.begin();
            this.hsession.delete(hd);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public HoaDon findById(String id)
    {
        return this.hsession.find(HoaDon.class, id);
    }


    public List<HoaDon> findAll()
    {
        String hql = "SELECT obj FROM HoaDon obj";
        TypedQuery<HoaDon> query = this.hsession.createQuery(hql, HoaDon.class);
        return query.getResultList();
    }

    public HoaDon findByMa(String ma)
    {
        String hql = "SELECT obj FROM HoaDon obj WHERE obj.Ma = ?1";
        TypedQuery<HoaDon> query = this.hsession.createQuery(hql, HoaDon.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
}
