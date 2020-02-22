package in.nit.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.Util.HibernateUtil;
import in.nit.model.GitSampleTestClass;

public class GitSampleTest {
	public static void main(String[] args) {
		
		Session ses = null;
		Transaction tx =null;
		
		try {
			ses = HibernateUtil.getSf().openSession();
			tx = ses.beginTransaction();
			
			GitSampleTestClass cl1 = new GitSampleTestClass();
			cl1.setStdId(10);
			cl1.setStdName("A");
			cl1.setStdFee(3.2);
			
			ses.save(cl1);
			tx.commit();
		
		}catch(HibernateException he) {
			System.out.println(he.getMessage());
			tx.rollback();
		}
		System.out.println("Congrats your record has recorded");
	}

}
