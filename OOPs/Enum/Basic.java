package com.aryan.OOPs.Enum;

public class Basic {
    enum Week implements Hello {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are constants
        // Every variable is public static and final by default
        // since it's final you can't create child enums

        Week() {
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected, only private or default
        // why? we don't want to create new objects
        // bcz this not the enum concept, that's why

        // internally: public static final Week Monday = new Week();

        @Override
        public void hello() {
            System.out.println("Hey, how are you");
        }
    }

    enum Level {
        LOW(1), MEDIUM(2), HIGH(3);

        private final int value;

        Level(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum Calculator implements Operation {
        ADD {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        },
        SUB {
            @Override
            public int operation(int a, int b) {
                return a - b;
            }
        },
        MUL {
            @Override
            public int operation(int a, int b) {
                return a * b;
            }
        },
        DIV {
            @Override
            public int operation(int a, int b) {
                return a / b;
            }
        };
    }

    public static void main(String[] args) {

//        Week week;
//        week = Week.Friday;
//        week.hello();
//        System.out.println(Week.valueOf("Monday"));
//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal());

//        Level l = Level.HIGH;
//        System.out.println("Level: " + l + ", Value: " + l.getValue());
        for (Level l: Level.values()) {
            System.out.println("Level: " + l + ", Value: " + l.getValue());
        }

//        int a = 10, b = 20;
//        System.out.println(Arrays.toString(Calculator.values()));
//        for (Calculator cal : Calculator.values()) {
//            System.out.println(cal.operation(a, b));
//        }
    }
}
