package com.example.msa.general.service.adapter.in.web.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <b> 역할: 일반 유저 회원가입 응답 </b>
 * <p>
 * - HTTP 응답 바디에 매핑 <br>
 * </p>
 */
@Getter
@Setter
@NoArgsConstructor
public class GeneralSignUpResponse {
    private String result;

    public GeneralSignUpResponse(String result) {
        this.result = result;
    }
}
