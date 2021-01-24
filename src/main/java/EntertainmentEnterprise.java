import java.lang.reflect.Field;
import java.util.Optional;
import java.util.Scanner;

public class EntertainmentEnterprise {
    Scanner scan = new Scanner(System.in);
    String str;

    /* 사실 이 동작을 수행하는 행위자는 Applicant 인데, 코드상 거기로 책임 넘기고 있진 않음.
    왜냐면 이 코드는 화면 밖 real user 와 interaction 하고 있기 때문. */
    String fillNullSpace(Field fieldName) {
        System.out.print("Fill in the " + fieldName + " space!\n" + fieldName + ": ");
        this.str = scan.nextLine();
        return this.str;
    }

    public void receiveApplication(Application application) {
        //채워야 하는 항목 중 빈칸이 없으면 성공적으로 지원했다고 알려줄 것
        //P: 빈칸 검사 책임을 수행하는 객체는 대체 누가 되어야 하는가...?
        Field[] fieldList = application.getClass().getDeclaredFields();

        /*
        Optional.of(application)
                .map(Application::getApplicantName)
                .orElse(fillNullSpace(fieldList[0]));
         */
    }
}
