import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<Integer, List<String>> collect = Stream.of("jlk", "trdj", "ewrt", "sdfafsaf", "lklkl",
                                                        "sdfafsaf", "jlk", "vnbc", "kjllk")
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(collect);

        // {3=[jlk, jlk], 4=[trdj, ewrt, vnbc], 5=[lklkl, kjllk], 8=[sdfafsaf, sdfafsaf]}

        Map<Integer, Set<String>> collect1 = Stream.of("jlk", "trdj", "ewrt", "sdfafsaf", "lklkl",
                                                        "sdfafsaf", "jlk", "vnbc", "kjllk")
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.toSet()));
        System.out.println(collect1);

        // {3=[jlk], 4=[trdj, ewrt, vnbc], 5=[kjllk, lklkl], 8=[sdfafsaf]}

        Map<Integer, Long> collect2 = Stream.of("jlk", "trdj", "ewrt", "sdfafsaf", "lklkl",
                                                "sdfafsaf", "jlk", "vnbc", "kjllk")
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.counting()));
        System.out.println(collect2);

        //{3=2, 4=3, 5=2, 8=2}

        Map<Integer, String> collect3 = Stream.of("jlk", "trdj", "ewrt", "sdfafsaf", "lklkl",
                                                    "sdfafsaf", "jlk", "vnbc", "kjllk")
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.joining("|")));
        System.out.println(collect3);

        // {3=jlk|jlk, 4=trdj|ewrt|vnbc, 5=lklkl|kjllk, 8=sdfafsaf|sdfafsaf}

        Integer collect4 = Stream.of("jlk", "trdj", "ewrt", "sdfafsaf", "lklkl",
                                    "sdfafsaf", "jlk", "vnbc", "kjllk")
                .collect(Collectors.collectingAndThen(Collectors.toList(), s -> s.size()));
        System.out.println(collect4);

        //  9

        System.out.println(Stream.of(1,3,6,2,8,2,3,65,64,34,32,56,21,97,13,87,80)
                .collect(Collectors.groupingBy(i->i%8)));

        //  {0=[8, 64, 32, 56, 80], 1=[1, 65, 97], 2=[2, 2, 34], 3=[3, 3], 5=[21, 13], 6=[6], 7=[87]}

        Map<Boolean, List<String>> collect5 = Stream.of("jlk", "trdj", "ewrt", "sdfafsaf",
                                                        "lklkl", "sdfafsaf", "jlk", "vnbc", "kjllk")
                .collect(Collectors.partitioningBy(s -> s.length() > 4));
        System.out.println(collect5);

        //{false=[jlk, trdj, ewrt, jlk, vnbc], true=[sdfafsaf, lklkl, sdfafsaf, kjllk]}
    }
}