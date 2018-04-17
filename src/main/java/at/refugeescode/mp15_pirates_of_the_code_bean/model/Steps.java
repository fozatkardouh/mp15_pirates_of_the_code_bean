package at.refugeescode.mp15_pirates_of_the_code_bean.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class Steps {

    private Boolean stepOne;
    private Boolean stepTwo;
    private Boolean stepThree;
    private Boolean stepFour;

}
