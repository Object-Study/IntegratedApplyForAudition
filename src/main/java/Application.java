import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Application {
    String applicantName;
    //List<String> enterpriseList = new ArrayList<>();
    String birthDate;
    String gender; //자료형 더 적합한 걸로 바꿀 수 있음 바꾸기
    String affiliation; //보통 정치,종교적 소속을 의미하는 듯하나 용례를 찾아본 결과 적게나마 학교 의미로도 쓰는 듯하여.
    String residence; //거주지
    String phoneNumber;
    String career; //경력
    Video video;

    Scanner scan = new Scanner(System.in);

    //지원할 회사 목록 보여주고 선택하게 하는 메서드 작성
    //public void chooseEnterpriseFromList

    //공통 양식을 작성하는 것이다! 나중에 그에 맞게 변수명 바꾸기
    public void create() {
        //모든 데이터 입력 받음
        System.out.print("Applicant Name: ");
        this.applicantName = scan.nextLine();
        System.out.print("Birth Date: ");
        this.birthDate = scan.nextLine();
        System.out.print("Gender: ");
        this.gender = scan.nextLine();
        System.out.print("Affiliation: ");
        this.affiliation = scan.nextLine();
        System.out.print("Residence: ");
        this.residence = scan.nextLine();
        System.out.print("Phone Number: ");
        this.phoneNumber = scan.nextLine();
        System.out.print("Career: ");
        this.career = scan.nextLine();

        LocalComputer com = new LocalComputer();
        this.video = com.attachVideo();

        //지원할 회사 고르는 로직
    }
}
