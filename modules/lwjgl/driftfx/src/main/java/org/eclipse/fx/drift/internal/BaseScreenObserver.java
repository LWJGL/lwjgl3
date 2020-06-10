/*
 * Copyright (c) 2019 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 */
package org.eclipse.fx.drift.internal;

import java.util.Optional;
import java.util.function.Function;


import javafx.beans.binding.Bindings;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Window;

// this class should track on which screen the node is and update the screen and renderscale properies
// TODO verify if it is working..
public abstract class BaseScreenObserver {

	private final ReadOnlyObjectWrapper<Screen> currentScreen = new ReadOnlyObjectWrapper<>();
	private final ReadOnlyDoubleWrapper currentRenderScale = new ReadOnlyDoubleWrapper(1.0);
	
	public ReadOnlyObjectProperty<Screen> currentScreenProperty() {
		return currentScreen.getReadOnlyProperty();
	}
	
	public Screen getCurrentScreen() {
		return currentScreenProperty().get();
	}
	
	public final ReadOnlyDoubleProperty currentRenderScaleProperty() {
		return currentRenderScale.getReadOnlyProperty();
	}
	
	public double getCurrentRenderScale() {
		return currentRenderScaleProperty().get();
	}
	
	private static <T, V> ObjectBinding<V> flatMap(ObservableValue<T> obs, Function<T, ObservableValue<V>> map) {
		return new ObjectBinding<V>() {
			private T oldCurrent;
			private V oldValue;
			{
				bind(obs);
			}
			@Override
			protected V computeValue() {
				T current = obs.getValue();
				if (oldCurrent != current) {
					// update
					if (oldCurrent != null) {
						unbind(map.apply(oldCurrent));
						oldCurrent = null;
					}
					if (current != null) {
						bind(map.apply(current));
						oldCurrent = current;
					}
				}
				if (current != null) {
					return map.apply(current).getValue();
				}
				return null;
			}
		};
	}
	
	public BaseScreenObserver(Node node) {
		ObjectBinding<Window> bWindow = flatMap(node.sceneProperty(), Scene::windowProperty);
		ObjectBinding<Number> windowX = flatMap(bWindow, Window::xProperty);
		ObjectBinding<Number> windowY = flatMap(bWindow, Window::yProperty);
		
		currentScreen.bind(Bindings.createObjectBinding(() -> {
			Point2D screenPoint = node.localToScreen(0, 0);
			Optional<Screen> currentScreen = Screen.getScreens().stream().filter(s -> s.getBounds().contains(screenPoint)).findFirst();
			return currentScreen.orElse(Screen.getPrimary());
		}, 
				windowX, windowY,
				node.boundsInParentProperty(),
				node.boundsInLocalProperty(),
				node.layoutBoundsProperty(),
				node.sceneProperty(),
				Screen.getScreens()));
		currentRenderScale.bind(Bindings.createDoubleBinding(() -> {
			return (double) getRenderScale(getCurrentScreen());
		}, currentScreen));
	}
	
	protected abstract double getRenderScale(Screen screen);
}
