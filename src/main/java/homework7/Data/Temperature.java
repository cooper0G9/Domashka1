package homework7.Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Temperature {

    @JsonProperty(value = "Minimum")
    private MinTemp minimum;
    @JsonProperty(value = "Maximum")
    private MaxTemp  maximum;

}
