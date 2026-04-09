package study.ch22;

class HomeButton implements ButtonClick {
    @Override
    public void onClick() {
        System.out.println("홈으로 이동");
    }
}

class BackButton implements ButtonClick {
    @Override
    public void onClick() {
        System.out.println("뒤로 이동");
    }
}

class LoginButton implements ButtonClick {
    @Override
    public void onClick() {
        System.out.println("로그인 요청");
    }
}

public class ButtonMain {
    static void main() {
        ButtonClick btn1 = new HomeButton();
        ButtonClick btn2 = new BackButton();
        ButtonClick btn3 = new LoginButton();
        ButtonClick btn4 = new ButtonClick() {
            @Override
            public void onClick() {
                System.out.println("로그인 요청");
            }
        };
        ButtonClick btn5 = () -> System.out.println("로그인 요청"); //익명클래스도 람다식도 정의와 동시에 객체생성함

        btn1.onClick();
        btn2.onClick();
        btn3.onClick();
        btn4.onClick();
        btn5.onClick();
    }
}
