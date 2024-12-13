package com.example.msa.general.service.general.adapter.out.hashmap.ordinary;

import com.example.msa.general.service.general.application.port.out.GeneralUserDataOutputPort;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * <b> 일반 유저 영속성 어댑터 </b>
 *
 * - 데이터베이스 대신 해시맵을 활용한 어댑터
 */
@Component
public class HashMapPersistenceAdapter implements GeneralUserDataOutputPort {
    private final Map<String, GeneralUserEntity> users;

    HashMapPersistenceAdapter() {
        users = new HashMap<>();
    }

    /**
     * <b> 일반 유저의 추가 정보 저장 </b>
     * <p>
     * - 현재는 회원에 대한 추가 정보 없음
     * - 이메일과 나이는 예시 데이터
     * </p>
     *
     * @param id 아이디
     * @param email 예시 데이터
     * @param age 예시 데이터
     */
    @Override
    public void saveGeneralUser(String id, String email, int age) {
        users.put(id, new GeneralUserEntity(email, age));
        System.out.printf("저장된 데이터: 아이디 = %s, 이메일 = %s, 나이 = %d \n", id, email, age);
    }
}
