package repositories;

import domain_models.ChiTietSP;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;
import view_model.QLChiTietSanPham;
import java.util.ArrayList;
import java.util.List;

public class ChiTietSanPhamRepository {
    private ArrayList<QLChiTietSanPham> list;
    private Session hSession;

    public ChiTietSanPhamRepository() {

        this.list = new ArrayList<>();
        this.hSession = HibernateUtil.getFACTORY().openSession();
    }

    public void insert(ChiTietSP ctsp) {

        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(ctsp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void update(ChiTietSP ctsp) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(ctsp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(ChiTietSP ctsp) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(ctsp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public ChiTietSP findById(String id) {

        return this.hSession.find(ChiTietSP.class, id);
    }

    public List<ChiTietSP> findAll() {
        String hql = "SELECT obj FROM ChiTietSP obj";
        TypedQuery<ChiTietSP> query = this.hSession.createQuery(hql, ChiTietSP.class);
        return query.getResultList();
    }

    public ChiTietSP findByMa(String moTa) {
        String hql = "SELECT obj FROM ChiTietSP obj WHERE obj.moTa = ?1";
        TypedQuery<ChiTietSP> query = this.hSession.createQuery(hql, ChiTietSP.class);
        query.setParameter(1, moTa);
        return query.getSingleResult();
    }
}
