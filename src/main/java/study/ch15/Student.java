package study.ch15;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    @NonNull
    private String name;
    @NonNull
    private int age;
    private String address;

    public Student() {
        name = "기본값";
        age = 0;
    }


}
