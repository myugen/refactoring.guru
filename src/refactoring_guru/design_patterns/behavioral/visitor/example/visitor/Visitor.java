package refactoring_guru.design_patterns.behavioral.visitor.example.visitor;

import refactoring_guru.design_patterns.behavioral.visitor.example.shapes.Circle;
import refactoring_guru.design_patterns.behavioral.visitor.example.shapes.CompoundShape;
import refactoring_guru.design_patterns.behavioral.visitor.example.shapes.Dot;
import refactoring_guru.design_patterns.behavioral.visitor.example.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
