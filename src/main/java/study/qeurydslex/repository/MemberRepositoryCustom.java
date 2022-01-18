package study.qeurydslex.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.qeurydslex.dto.MemberSearchCondition;
import study.qeurydslex.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);
}
