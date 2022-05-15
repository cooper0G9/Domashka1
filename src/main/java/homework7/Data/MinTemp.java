package homework7.Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MinTemp {

    @JsonProperty(value = "Value")
    private String value;
//    double min = Double.parseDouble(value);
    @JsonProperty(value = "Unit")
    private String unit;
    @JsonProperty(value = "UnitType")
    private String unitType;

}
