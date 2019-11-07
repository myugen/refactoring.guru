package refactoring_guru.design_patterns.behavioral.visitor.example.shapes;

import refactoring_guru.design_patterns.behavioral.visitor.example.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
