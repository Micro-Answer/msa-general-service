package com.example.msa.general.service.general.application.service.port.out;

/**
 * <b> 일반 유저 정보 관리 출력 포트 </b>
 */
public interface GeneralUserDataOutputPort {
    void saveGeneralUser(String id, String email, int age);
}
