package xmp;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TestObjectDto {

    private Long id;
    private String name;
    private boolean trueOrFalse;
    private TestObject.RankLabel rankLabel;
}
