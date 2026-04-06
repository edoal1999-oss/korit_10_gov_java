package study.ch17;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@NoArgsConstructor 이것만 사용할 경우 Builder 사용 불가능
//@AllArgsConstructor //Builder도 NoArgs이하생략도 쓰려면 AllArgs이하생략도 써야함.
public class User {
    private Long id;
    private String username;
    private String password;
}
