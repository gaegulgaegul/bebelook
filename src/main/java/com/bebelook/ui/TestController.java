package com.bebelook.ui;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "테스트 API", description = "테스트 API 입니다.")
@RestController
class TestController {

	@Operation(
		summary = "엔드포인트 테스트",
		description = "서버에 요청이 정상적으로 들어오는지 확인합니다."
	)
	@GetMapping("/test")
	ResponseEntity<String> test() {
		return ResponseEntity.ok("test");
	}
}
