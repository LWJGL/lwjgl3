package org.eclipse.fx.drift.internal;

import javafx.scene.Node;
import javafx.stage.Screen;

public class ScreenObserver extends BaseScreenObserver {

	public ScreenObserver(Node node) {
		super(node);
	}

	@Override
	protected double getRenderScale(Screen screen) {
		System.err.println("Java 11 :: getRenderScale");
		return screen.getOutputScaleX();
	}

}
