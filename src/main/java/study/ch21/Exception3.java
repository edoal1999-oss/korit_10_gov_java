package study.ch21;

import java.util.List;

public class Exception3 {
    static void main() {
        List<String> usernames = List.of("aaa","bbb","ccc");

        String username = null;

        try {
            if (username == null) {
                throw new NullPointerException();
            } else {
                boolean isEmpty = usernames.stream().filter(u -> u.equals(username)).count() == 0;

                if (isEmpty) {
                    throw new UsenameNotFoundException();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("username이 null입니다.");
        }catch(UsenameNotFoundException e){
                System.out.println("사용자 아이디를 찾지 못했습니다.");
        }
        System.out.println("프로그램 정상 종료");
    }
    }

