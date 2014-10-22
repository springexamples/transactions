package transactions.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import transactions.domain.Member;

@Repository
public class MemberDaoImpl implements MemberDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addMember(Member member) {
		em.persist(member);
	}

}
