public class Applicant {
    EntertainmentEnterprise entertainmentEnterprise;

    public void applyAudition() {
        //null 로 호출되는 문제가 있을 것이다. 긍까 생성자 만들어주고 값 없을 때 기본으로 반환하는 객체 만들어라!
        Application application = new Application();
        application.create();
        entertainmentEnterprise.receiveApplication(application);
    }
}
