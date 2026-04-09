package study.ch18;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Builder
@Data
public class ErrorResponse {
    private int code;
    private Object body; //어느 유형의 자료든 들어갈 수 있으니 오브젝트를 선택

    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <T, R> R print2(T data, R returnData) {
        System.out.println(data);
        return returnData;
    }
}
