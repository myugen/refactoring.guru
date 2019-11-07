package refactoring_guru.design_patterns.behavioral.observer.example.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
