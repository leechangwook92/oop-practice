package org.example.order;

import java.util.List;

public class Menu {

    private final List<MenuItem> menuItemes;

    public Menu(List<MenuItem> menuItemes) {
        this.menuItemes = menuItemes;
    }

    public MenuItem choose(String name) {
        return this.menuItemes.stream()
                .filter(menuItem -> menuItem.matches(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 메뉴의 이름입니다."));
    }
}
