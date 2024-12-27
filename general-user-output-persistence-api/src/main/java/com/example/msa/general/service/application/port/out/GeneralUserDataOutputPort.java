package com.example.msa.general.service.application.port.out;

/**
 * <b> 일반 유저 정보 관리 출력 포트 </b>
 */
public interface GeneralUserDataOutputPort {
    void saveGeneralUser(String userId, String email, int age);
}
