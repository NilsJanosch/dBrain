package vip.dbrain.view;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.Random;

@Route("")
public class IndexSite extends VerticalLayout {
    public IndexSite() {
        Paragraph p = new Paragraph("Click the button to generate a random number.");
        Button button = new Button("Generate");

        button.addClickListener(click -> {
            p.setText("Generated Number: " + generateNumber());
        });

        button.addClickShortcut(Key.SPACE);

        add(button, p);
    }

    public int generateNumber() {
        return new Random().nextInt();
    }
}
