# Project03_PDG





#### Description : 숫자 4개를 입력받음 => 각 클래스의 Field , Constructor, Method 로 Data -> Main(연산 결과를 출력).

* 팀장 : 박동근 

* 참여 팀원 : 박정민, 박지환

>------Contribution----------


* 박정민 : Addition, AddSub class 구현

* 박지환 : AddSubMul ~ AddSubMulDiv class 구현 

* 박동근 : Main,  AddSubMulRemainder class  구현

* 소스 코드의 특징 :
* 
      1. Addition 클래스에서만 Field 변수를 생성함
  
      2. Sub class 는 Add 에서 Mul 은 Sub 에서 상속받는다.
  
      3. Main 에서는 입출력만 담당한다.(연산식을 쓰지 않는다.)

>----------------------------

>>>>>> Output Screens<<
Ver01 _Updated : 2023.12.07

<img width="548" alt="스크린샷 2023-12-08 오전 10 29 01" src="https://github.com/BigDataTeam01/Project03_PDG/assets/149550771/ea958e5f-feac-45b3-8ab4-080077dd1dbc">

Ver02 _Updated : 2023.12.07 ( addition erro 해결 : constructor 에서 사용하는 파라미터가 this.num3,4  로 안가고 this.num 1,2 로 전달되어 해결함  )

<img width="523" alt="스크린샷 2023-12-08 오후 12 12 34" src="https://github.com/ForrestDPark/Project03_PDG/assets/149550771/602a7058-07a0-4a97-b822-9b2147796976">



