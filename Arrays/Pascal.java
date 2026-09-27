class Pascal {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();

        long value = 1;

        list.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            value = value * (rowIndex - i + 1) / i;

            list.add((int) value);
        }

        return list;
    }
}