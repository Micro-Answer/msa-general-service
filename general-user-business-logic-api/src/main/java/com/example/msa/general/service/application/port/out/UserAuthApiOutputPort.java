package com.example.msa.general.service.application.port.out;

import java.io.IOException;
import java.net.http.HttpResponse;

/**
 * <b> 유저 auth 서비스에 요청하는 출력 포트 </b>
 */
public interface UserAuthApiOutputPort {
    HttpResponse<String> requestUserSignUp(String userId, String pw, String role) throws IOException, InterruptedException;
}
