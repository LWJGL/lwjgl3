/*******************************************************************************
 * Copyright (c) 2019 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.drift;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.fx.drift.DriftFXSurface.TransferMode;
import org.eclipse.fx.drift.impl.NGDriftFXSurface;
import org.eclipse.fx.drift.internal.Configuration;
import org.eclipse.fx.drift.internal.GraphicsPipelineUtil;
import org.eclipse.fx.drift.internal.JNINativeSurface;
import org.eclipse.fx.drift.internal.Log;
import org.eclipse.fx.drift.internal.NativeAPI;
import org.eclipse.fx.drift.internal.ScreenObserver;
import org.eclipse.fx.drift.internal.SurfaceData;

import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Node;

//Note: this implementation is against internal JavafX API
public abstract class BaseDriftFXSurface extends Node {

	public static List<TransferMode> getAvailableTransferModes() {
		return NativeAPI.getTransferModes();
	}

	public static TransferMode getPlatformDefaultTransferMode() {
		return NativeAPI.getPlatformDefaultTransferMode();
	}

	public static TransferMode getFallbackTransferMode() {
		return NativeAPI.getFallbackTransferMode();
	}

	private static TransferMode defaultTransferMode;

	private static boolean initialized = false;

	public static void initialize(DriftFXConfig config) {
		if (initialized)
			return;

		Configuration.initialize(config);

		Log.debug("Initializing NativeSurface system");
		try {
			GraphicsPipelineUtil.initialize();
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

		if (GraphicsPipelineUtil.isD3D()) {
			Log.debug(" * D3D Prism Pipeline active");

		} else if (GraphicsPipelineUtil.isSW()) {
			Log.debug(" * SW Prism Pipline active");
		}

		drift_addShutdownHook(BaseDriftFXSurface::destroy);

		if (config.isFallbackMode()) {
			defaultTransferMode = NativeAPI.getFallbackTransferMode();
		} else {
			defaultTransferMode = NativeAPI.getPlatformDefaultTransferMode();
		}

		initialized = true;
	}

	public static void initialize() {
		initialize(DriftFXConfig.initSystemProperties());
	}

	public static void destroy() {
		if (!initialized)
			return;
		Log.debug("Destroying NativeSurface system");
		GraphicsPipelineUtil.destroy();
	}
	
	private ObjectProperty<TransferMode> transferMode = new SimpleObjectProperty<>(this, "transferMode",
			defaultTransferMode);

	protected AtomicReference<SurfaceData> surfaceData = new AtomicReference<>(null);

	private final ReadOnlyDoubleWrapper screenScaleFactor = new ReadOnlyDoubleWrapper(this, "screenScaleFactor", 1.0);
	private final DoubleProperty userScaleFactor = new SimpleDoubleProperty(this, "userScaleFactor", 1.0);
	
	private double detaultWidth;
	private ReadOnlyDoubleWrapper width;
	
	private double defaultHeight;
	private ReadOnlyDoubleWrapper height;
	
	protected long nativeSurfaceId;

	private ScreenObserver screenObserver;
	
	public BaseDriftFXSurface() {
		
	}
	
	protected void init() {
		screenObserver = new ScreenObserver(this);
		JNINativeSurface jni = new JNINativeSurface(frame -> {
			Platform.runLater(() -> {
				drift_beginPeerAccess();
				try {
					NGDriftFXSurface ngSurface = drift_getPeer();
					ngSurface.present(frame);
					drift_markDirtyContent();
				} finally {
					drift_endPeerAccess();
				}
			});
		});
		
		nativeSurfaceId = NativeAPI.createNativeSurface(jni);

		// observe current screen render factor
		screenScaleFactor.bind(screenObserver.currentRenderScaleProperty());
		screenScaleFactor.addListener((x, o, n) -> updateSurfaceData());

		transferMode.addListener((x, o, n) -> handleTransferModeChange());
	}
	
	public ObjectProperty<TransferMode> transferModeProperty() {
		return transferMode;
	}

	public void setTransferMode(TransferMode mode) {
		transferMode.set(mode);
	}

	public TransferMode getTransferMode() {
		return transferMode.get();
	}

	public ReadOnlyDoubleProperty screenScaleFactorProperty() {
		return screenScaleFactor.getReadOnlyProperty();
	}

	public double getScreenScaleFactor() {
		return screenScaleFactorProperty().get();
	}

	public DoubleProperty userScaleFactorProperty() {
		return userScaleFactor;
	}

	public double getUserScaleFactor() {
		return userScaleFactorProperty().get();
	}

	public void setUserScaleFactor(double value) {
		userScaleFactorProperty().set(value);
	}

	public long getNativeSurfaceHandle() {
		return nativeSurfaceId;
	}

	private void handleTransferModeChange() {
		Platform.runLater(this::updateSurfaceData);
	}

	@Override
	public double minHeight(double width) {
		return 0;
	}

	@Override
	public double minWidth(double height) {
		return 0;
	}

	@Override
	public double prefWidth(double height) {
		return 100;
	}

	@Override
	public double prefHeight(double width) {
		return 100;
	}

	@Override
	public double maxWidth(double height) {
		return Double.MAX_VALUE;
	}

	@Override
	public double maxHeight(double width) {
		return Double.MAX_VALUE;
	}

	private void widthChanged(double value) {
		if (value != detaultWidth) {
			detaultWidth = value;

			drift_layoutBoundsChanged();
			drift_geomChanged();
			updateSurfaceData();
			drift_markDirtyGeometry();
		}
	}

	public final double getWidth() {
		return width == null ? detaultWidth : width.get();
	}

	public final ReadOnlyDoubleProperty widthProperty() {
		if (width == null) {
			width = new ReadOnlyDoubleWrapper(detaultWidth) {
				@Override
				protected void invalidated() {
					widthChanged(get());
				}

				@Override
				public Object getBean() {
					return BaseDriftFXSurface.this;
				}

				@Override
				public String getName() {
					return "width";
				}
			};
		}
		return width.getReadOnlyProperty();
	}

	protected void setWidth(double value) {
		if (width == null) {
			widthChanged(value);
		} else {
			width.set(value);
		}
	}

	private void heightChanged(double value) {
		if (defaultHeight != value) {
			defaultHeight = value;

			drift_geomChanged();
			drift_layoutBoundsChanged();
			updateSurfaceData();
			drift_markDirtyGeometry();
		}
	}

	public final double getHeight() {
		return height == null ? defaultHeight : height.get();
	}

	public final ReadOnlyDoubleProperty heightProperty() {
		if (height == null) {
			height = new ReadOnlyDoubleWrapper(defaultHeight) {
				@Override
				protected void invalidated() {
					heightChanged(get());
				}

				@Override
				public Object getBean() {
					return BaseDriftFXSurface.this;
				}

				@Override
				public String getName() {
					return "height";
				}
			};
		}
		return height.getReadOnlyProperty();
	}

	protected void setHeight(double value) {
		if (height == null) {
			heightChanged(value);
		} else {
			height.set(value);
		}
	}

	private int getTransferModeId() {
		return transferMode.get().id;
	}

	private SurfaceData computeSurfaceData() {
		return new SurfaceData((float) getWidth(), (float) getHeight(), (float) getScreenScaleFactor(),
				(float) getScreenScaleFactor(), (float) getUserScaleFactor(), (float) getUserScaleFactor(),
				getTransferModeId());
	}

	@Override
	public boolean isResizable() {
		return true;
	}

	@Override
	public void resize(double width, double height) {
		setWidth(width);
		setHeight(height);
		updateSurfaceData();
	}

	private void updateSurfaceData() {
		surfaceData.set(computeSurfaceData());
		drift_markDirtyGeometry();
	}

	public void dirty() {
		drift_markDirtyContent();
	}
	
	// Internal Type access
	
	@SuppressWarnings("restriction")
	private void drift_markDirtyContent() {
		drift_markDirty(com.sun.javafx.scene.DirtyBits.NODE_CONTENTS);
	}
	
	@SuppressWarnings("restriction")
	private void drift_markDirtyGeometry() {
		drift_markDirty(com.sun.javafx.scene.DirtyBits.NODE_GEOMETRY);
	}
	
	@SuppressWarnings("restriction")
	private static void drift_addShutdownHook(Runnable hook) {
		com.sun.javafx.tk.Toolkit.getToolkit().addShutdownHook(hook);
	}

	// JDK-Version specific methods
	
	@SuppressWarnings("restriction")
	public com.sun.javafx.geom.BaseBounds drift_computeGeomBounds(com.sun.javafx.geom.BaseBounds bounds, com.sun.javafx.geom.transform.BaseTransform tx) {
		com.sun.javafx.geom.BaseBounds rv = new com.sun.javafx.geom.RectBounds(0f, 0f, (float) getWidth(), (float) getHeight());
		rv = tx.transform(rv, rv);
		return rv;
	}

	protected boolean drift_computeContains(double localX, double localY) {
		double w = getWidth();
		double h = getHeight();
		return (w > 0 && h > 0 && localX >= 0 && localY >= 0 && localX < w && localY < h);
	}

	protected abstract void drift_updatePeer();

	@SuppressWarnings("restriction")
	protected abstract com.sun.javafx.sg.prism.NGNode drift_createPeer();

	@SuppressWarnings("restriction")
	protected abstract void drift_markDirty(com.sun.javafx.scene.DirtyBits dirtyBit);

	protected abstract NGDriftFXSurface drift_getPeer();
	
	protected void drift_beginPeerAccess() {}
	protected void drift_endPeerAccess() {}

	protected abstract void drift_geomChanged();

	protected abstract void drift_layoutBoundsChanged();
}
