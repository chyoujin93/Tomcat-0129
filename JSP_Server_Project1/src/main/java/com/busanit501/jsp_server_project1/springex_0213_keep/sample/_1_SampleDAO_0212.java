//package com.busanit501.jsp_server_project1.springex_0213.sample;
//
//// @Repository // DAO 역할. 시스템에 등록. 서버 시작하면 해당 클래스를 DAO 객체로 미리 등록해서 사용.
//// IOC. 인버젼 오브 컨트롤러 . 제어권 역전.
//
////public class _1_SampleDAO_0212 {
////}
//// ==================================================================================================
//// 느슨한 결합을 이용하기 위해서, 인터페이스 개념을 도입.
//// 인터페이스를 구현할(implement) 클래스 :  1) _3_SampleDAOImpl_0212    2) _4_EventSampleDAOImpl_0212
//// 시스템 입장에서는 누가 진짜 @Repository 담당하는 클래스야?? -> 오류 발생
//// 오류 해결 방법1) 하나의 클래스에 @Primary 지정하면 됨.
//// 오류 해결 방법2)
//public interface _1_SampleDAO_0212 {
//
//}