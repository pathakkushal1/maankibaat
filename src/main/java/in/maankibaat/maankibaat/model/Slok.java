package in.maankibaat.maankibaat.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Slok {
    private String name;
    private int num;
    private String line1;
    private String line2;
    private String line3;
    private String line4;
}
