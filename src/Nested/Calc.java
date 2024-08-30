package Nested;

public enum Calc {
    SUM{
        public int action(int a, int b){
            return a + b;
        }
    },
    SUBTRACT{
        public int action(int a, int b){
            return a - b;
        }
    },
    MULTIPLY{
        public int action(int a, int b){
            return a * b;
        }
    };
    public abstract int action(int a, int b);
}
