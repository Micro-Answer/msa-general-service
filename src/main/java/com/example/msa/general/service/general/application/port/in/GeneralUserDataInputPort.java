package com.example.msa.general.service.general.application.port.in;

/**
 * <b> 일반 유저 정보 관리 입력 포트 </b>
 */
public interface GeneralUserDataInputPort {
    boolean signUp(String userId, String pw, String role);
}
