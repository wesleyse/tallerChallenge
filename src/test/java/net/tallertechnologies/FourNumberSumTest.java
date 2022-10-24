package net.tallertechnologies;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class FourNumberSumTest {

    @Test
    public void shouldReturnNonEmptyValidResponses() {
        assertThatList(FourNumberSum.fourNumberSum(new int[]{7 , 6,  4, -1, 1 ,2}, 16))
                  .hasSameElementsAs(List.of(new Integer[]{7, 6, 4, -1}, new Integer[]{7, 6, 1, 2}));

        Integer[] arrayResponse1 = {7 , 6,  4, -1};
        List<Integer[]> listArrayResponse1 = new ArrayList<>();
        listArrayResponse1.add(arrayResponse1);
        assertThatList(FourNumberSum.fourNumberSum(new int[]{7 , 6,  4, -1}, 16))
                .hasSameElementsAs(listArrayResponse1);

        Integer[] arrayResponse2 = {1, 2, 3, 4};
        List<Integer[]> listArrayResponse2 = new ArrayList<>();
        listArrayResponse2.add(arrayResponse2);
        assertThatList(FourNumberSum.fourNumberSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 10))
                .hasSameElementsAs(listArrayResponse2);


        assertThatList(FourNumberSum.fourNumberSum(new int[]{5, -5, -2, 2, 3, -3}, 0))
                .hasSameElementsAs(List.of(new Integer[]{5, -5, -2, 2}, new Integer[]{5, -5, 3, -3}, new Integer[]{-2, 2, 3, -3}));

        assertThatList(FourNumberSum.fourNumberSum(new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 4))
                .hasSameElementsAs(List.of(new Integer[]{-2, -1, 1, 6}, new Integer[]{-2, 1, 2, 3}, new Integer[]{-2, -1, 2, 5}
                        , new Integer[]{-2, -1, 3, 4}));

        assertThatList(FourNumberSum.fourNumberSum(new int[]{-1, 22, 18, 4, 7, 11, 2, -5, -3}, 30))
                .hasSameElementsAs(List.of(new Integer[]{-1, 22, 7, 2}, new Integer[]{22, 4, 7, -3}, new Integer[]{-1, 18, 11, 2}
                        , new Integer[]{18, 4, 11, -3}, new Integer[]{22, 11, 2, -5}));

        assertThatList(FourNumberSum.fourNumberSum(new int[]{-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5}, 20))
                .hasSameElementsAs(List.of(new Integer[]{-5, 2, 15, 8}, new Integer[]{-3, 2, -7, 28}, new Integer[]{-10, -3, 28, 5}
                        , new Integer[]{-10, 28, -6, 8}, new Integer[]{-7, 28, -6, 5}, new Integer[]{-5, 2, 12, 11}, new Integer[]{-5, 12, 8, 5}));

        assertThatList(FourNumberSum.fourNumberSum(new int[]{1, 2, 3, 4, 5, -5, 6, -6}, 5))
                .hasSameElementsAs(List.of(new Integer[]{2, 3, 5, -5}, new Integer[]{1, 4, 5, -5}, new Integer[]{2, 4, 5, -6}
                        , new Integer[]{1, 3, -5, 6}, new Integer[]{2, 3, 6, -6}, new Integer[]{1, 4, 6, -6}));
    }

    @Test
    public void shouldReturnEmptyValidResponses() {
        assertThatList(FourNumberSum.fourNumberSum(new int[]{1, 2, 3, 4, 5}, 100))
                .hasSameElementsAs(List.of());

        assertThatList(FourNumberSum.fourNumberSum(new int[]{1, 2, 3, 4, 5, -5, 6, -6}, -10))
                .hasSameElementsAs(List.of());

        assertThatList(FourNumberSum.fourNumberSum(new int[]{-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5}, -23))
                .hasSameElementsAs(List.of());
    }

    @Test
    public void shouldValidateMinArraySize() {
        assertThatList(FourNumberSum.fourNumberSum(new int[]{1, 2, 3}, 6))
                .hasSameElementsAs(List.of());

        assertThatList(FourNumberSum.fourNumberSum(new int[]{}, 0))
                .hasSameElementsAs(List.of());
    }

    @Test
    public void shouldWorkForBigValues() {
        assertThatList(FourNumberSum.fourNumberSum(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 1}, 6))
                .hasSameElementsAs(List.of());
    }
}
