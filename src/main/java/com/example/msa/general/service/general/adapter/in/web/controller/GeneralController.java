package com.example.msa.general.service.general.adapter.in.web.controller;

import com.example.msa.general.service.general.adapter.in.web.dto.request.GeneralSignUpRequest;
import com.example.msa.general.service.general.adapter.in.web.dto.response.GeneralSignUpResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b> 역할: 일반 유저 컨트롤러 </b>
 * <p>
 * - 일반 유저 정보 관리 <br>
 * </p>
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class GeneralController {

    @PostMapping("/v1/general/sign-up")
    public ResponseEntity<GeneralSignUpResponse> signUp(@RequestBody GeneralSignUpRequest body) {
        final var response = new GeneralSignUpResponse("message");
        return ResponseEntity.ok(response);
    }
}
