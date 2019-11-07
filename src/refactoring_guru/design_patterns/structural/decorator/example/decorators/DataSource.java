package refactoring_guru.design_patterns.structural.decorator.example.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
