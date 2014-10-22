package transactions.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import transactions.dao.MemberDao;
import transactions.domain.Member;

@Service
@Transactional
public class MemberService {

	@Inject
	private MemberDao memberDao;

	public void addMember(final Member member) {
		memberDao.addMember(member);
	}
}
