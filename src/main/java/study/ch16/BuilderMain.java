package study.ch16;

import lombok.Builder;

@Builder
class UserEntity2 {
    private String username;
    private String password;
}

public class BuilderMain {
    static void main() {
        UserEntity userEntity = new UserEntity("aaa", "1234", "노푸른", "aa@gmail.com");
        UserEntity userEntity2 = new UserEntity("aaa", null, null, "aa@gmail.com");
        UserEntity userEntity3 = new UserEntity();
        userEntity3.setUsername("bbb");
        UserEntity userEntity4 = UserEntity.builder()
                .username("ccc")
                .email("ccc.gmail.com")
                .password("1111")
                .name("노푸른")
                .build();
    }
}
