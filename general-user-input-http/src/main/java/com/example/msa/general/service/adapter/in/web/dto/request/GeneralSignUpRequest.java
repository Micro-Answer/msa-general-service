package com.example.msa.general.service.adapter.in.web.dto.request;

import lombok.Getter;
import lombok.Setter;

/**
 * <b> 역할: 일반 유저 회원가입 요청 </b>
 * <p>
 * - HTTP 요청 바디에 매핑 <br>
 * </p>
 */
@Getter
@Setter
public class GeneralSignUpRequest {
    String userId;
    String pw;
    String role;
}
