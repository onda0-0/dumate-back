# 🗓️ Calendar-based ToDo App

#### 📌 프로젝트 소개 : 어떤 문제를 해결하고자 했는지, 어떤 서비스인지 한 줄 요약
#### 🛠 기술 스택 : 사용한 언어, 프레임워크, DB, 툴 등을 항목별로 정리
#### 🗂 프로젝트 구조: 디렉토리 구조를 계층/도메인 단위로 설명
#### ✅ 주요 기능 목록 및 구현된 기능
#### 🧠 트러블슈팅 : 기술적 도전	막혔던 부분과 해결 방법을 요약
#### ▶ 실행 방법 : 클론, 실행 순서, .env 설정 등 안내
#### 📘 API 문서 링크	: Swagger, Postman, Notion, API 명세서 등
#### 🚀 배포 주소 : 웹서비스 링크, 테스트 계정 등

## 📌 프로젝트 개요
- 일/주/월 단위 할 일 관리 웹 애플리케이션
- Spring Boot 기반 백엔드 개발 중
- 추후 Redis + Spring Security를 활용한 세션 기반 인증 기능 추가 예정

## 🧱 현재 구조(구조계획) - 미완
#### 📁 global/config
전역 설정 파일들이 들어가는 공간
- SecurityConfig.java (인증 추가 시)
- RedisConfig.java (Redis 관련 설정)
- WebMvcConfig.java (CORS, 인터셉터 등)
- SwaggerConfig.java (API 문서용)

#### 📁 global/exception
예외 처리와 관련된 전역 클래스
- GlobalExceptionHandler.java
- CustomException.java
- ErrorCode.java (enum)

#### 📁 global/response
공통 API 응답 포맷 관리

#### 📁 global/util
유틸 함수들
- 날짜 관련 DateUtil.java
- 이메일 유효성 검사 등

#### 📁 global/support
AOP, ArgumentResolver, 커스텀 애노테이션 등 특별한 기술 요소 분리

## ✅ 기능 현황
- [x] 프로젝트 기본 구조 설계
- [ ] 할 일 생성/조회/수정/삭제 기능
- [ ] 일간/주간/월간 조회 API
- [ ] 인증/인가 연동 (추후)

## 🔧 기술 스택
- Spring Boot
- Spring Data JPA
- MySQL
- Gradle

## 커밋컨벤션