package refactoring_guru.design_patterns.behavioral.mediator.example.components;

import refactoring_guru.design_patterns.behavioral.mediator.example.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
