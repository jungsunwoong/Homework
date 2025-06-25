package org.scoula.security.account.mapper;

import org.scoula.security.account.domain.MemberVO;

public interface UserDetailsMapper {

    //로그인 처리할 때 연동할 db기능을 정의하면 됨
    // username(id) 주소 회원정보를 검색하자
    public MemberVO get(String username);
}
