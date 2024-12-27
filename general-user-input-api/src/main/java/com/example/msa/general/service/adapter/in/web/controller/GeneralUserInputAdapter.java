package com.example.msa.general.service.adapter.in.web.controller;

import com.example.msa.general.service.adapter.in.web.dto.request.GeneralSignUpRequest;
import com.example.msa.general.service.adapter.in.web.dto.response.GeneralSignUpResponse;
import org.springframework.http.ResponseEntity;

public interface GeneralUserInputAdapter {
    ResponseEntity<GeneralSignUpResponse> signUp(GeneralSignUpRequest body);
}
