package json.zad2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MenuResponse {
    private List<MenuResult> menuItems;
    private String type;
    private int offset;
    private int number;
    private int totalMenuItems;
    private int processingTimeMs;
    private long expires;
}
