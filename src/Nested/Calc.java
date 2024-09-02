package Nested;

public enum Calc {
    SUM{
        public double action(int a, int b){
            return a + b;
        }
    },
    SUBTRACT{
        public double action(int a, int b){
            return a - b;
        }
    },
    MULTIPLY{
        public double action(int a, int b){
            return a * b;
        }
    },
    DEVIDE{
        public double action(int a, int b){
            return (double) a / b;
        }
    },
    POW{
        public double action(int a, int b){
            return Math.pow(a, b);
        }
    };
    public abstract double action(int a, int b);
}
