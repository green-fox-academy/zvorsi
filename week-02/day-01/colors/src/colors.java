import java.util.Arrays;

public class colors {
    public static void main(String[] args) {

        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`

        String[][] colorsArray = new String[][] {{"lime", "forest green", "olive", "pale green", "spring green"}, {"orange red", "red", "tomato"},
        {"orchid", "violet", "pink", "hot pink"}};
        for (int i = 0; i < colorsArray.length ; i++) {
            for (int j = 0; j <colorsArray[i].length ; j++) {
                System.out.print(colorsArray[i][j] + " ");
            }
        }
        }
    }
