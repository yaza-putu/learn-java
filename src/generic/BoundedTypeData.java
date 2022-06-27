package generic;

public class BoundedTypeData {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(12);
        NumberData<Long> longNumberData = new NumberData<>(12L);

        // NumberData<String> stringNumberData = new NumberData<String>("200"); pembatasan type data
    }


    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
