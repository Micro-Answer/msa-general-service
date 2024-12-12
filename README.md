# msa-general-service
## 도전과제 
### 설계
- [ ] 육각형 아키텍처로 전환 (Issue #7)
- [ ] 포트와 포트 내부를 하나의 모듈로 분리 (Issue #8)
- [ ] 포트를 인터페이스 모듈로 분리 (Issue #9)
- [ ] 출력 어댑터 분리 (Issue #10)
- [ ] 입력 어댑터 분리 (Issue #11)

### 유스케이스 
- [ ] 일반 유저 회원 정보 수정 

### 성능 테스트
- [ ] User 서비스와 함께 로컬 호스트에서 k6로 부하테스트 진행 (Issue #12)

### 단위 테스트
- [ ] 입력 어댑터 단위 테스트 작성 (Issue #13)
- [ ] 서비스 단위 테스트 작성 (Issue #14)
- [ ] 출력 어댑터 단위 테스트 작성 (Issue #15)

### 동시성 
- [ ] HashMap 출력 어댑터에 대한 동기화 (Issue #16)
  - ConcurrentHashMap
  - synchronized
  - ReentrantLock
  - ReadWriteLock
  - StampedLock
  - Semaphore
