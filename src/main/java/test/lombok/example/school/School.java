package test.lombok.example.school;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Valid
public class School {
    @NotNull
    @Min(1)
    private Integer id;
    @NotBlank
    private String name;
    private String pwd;

//    @Singular // 리스트 요소의 한 데이터만 넣고싶을 때
    private List<Integer> clazzs;
}
