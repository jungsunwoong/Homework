package org.scoula.security.account.domain;

import org.springframework.security.core.GrantedAuthority;

public class AuthVo implements GrantedAuthority {

    private String username; // 사용자 ID
    private String auth; // role, ROLE_ --> 여기까지 같아야함.
    // ROLE_ADMIN , ROLE_MEMBER (대문자)

    @Override
    public String getAuthority() {
        return "";
    }
}
