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

import org.eclipse.fx.drift.impl.NGDriftFXSurface;
import org.eclipse.fx.drift.internal.Configuration;
import org.eclipse.fx.drift.internal.GraphicsPipelineUtil;
import org.eclipse.fx.drift.internal.JNINativeSurface;
import org.eclipse.fx.drift.internal.Log;
import org.eclipse.fx.drift.internal.NativeAPI;
import org.eclipse.fx.drift.internal.ScreenObserver;
import org.eclipse.fx.drift.internal.SurfaceData;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.RectBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.scene.DirtyBits;
import com.sun.javafx.sg.prism.NGNode;
import com.sun.javafx.tk.Toolkit;

import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Node;

//Note: this implementation is against internal JavafX API
@SuppressWarnings({"restriction", "deprecation"})
public class DriftFXSurface extends Node {
	
	public static class TransferMode {
		private String name;
		private int id;
		
		protected TransferMode(String name, int id) {
			this.name = name;
			this.id = id;
		}
		
		@Override
		public String toString() {
			return name + " " + id;
		}
		
		public String getKey() {
			return name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TransferMode other = (TransferMode) obj;
			if (id != other.id)
				return false;
			return true;
		}
	}
	
	 private static TransferMode defaultTransferMode;
	
	private ObjectProperty<TransferMode> transferMode = new SimpleObjectProperty<>(this, "transferMode", defaultTransferMode);
	
	public static List<TransferMode> getAvailableTransferModes() {
		return NativeAPI.getTransferModes();
	}
	public static TransferMode getPlatformDefaultTransferMode() {
		return NativeAPI.getPlatformDefaultTransferMode();
	}
	public static TransferMode getFallbackTransferMode() {
		return NativeAPI.getFallbackTransferMode();
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
	
	private AtomicReference<SurfaceData> surfaceData = new AtomicReference<>(null);
	
	private final ReadOnlyDoubleWrapper screenScaleFactor = new ReadOnlyDoubleWrapper(this, "screenScaleFactor", 1.0);
	private final DoubleProperty userScaleFactor = new SimpleDoubleProperty(this, "userScaleFactor", 1.0);
	
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
	
	private long nativeSurfaceId;
	
	private ScreenObserver screenObserver = new ScreenObserver(this);
	
	public DriftFXSurface() {
		JNINativeSurface jni = new JNINativeSurface(
		(frame) -> {
			NGDriftFXSurface ngSurface = impl_getPeer();
			ngSurface.present(frame);
			Platform.runLater(() -> {
				impl_markDirty(DirtyBits.NODE_CONTENTS);
			});
		});
		nativeSurfaceId = NativeAPI.createNativeSurface(jni);
		
		// observe current screen render factor
		screenScaleFactor.bind(screenObserver.currentRenderScaleProperty());
		screenScaleFactor.addListener((x, o, n) -> updateSurfaceData());
		
		
		transferMode.addListener((x, o, n) -> {
			Platform.runLater(() -> {
				updateSurfaceData();
			});
		});
	}

	@Override
	protected NGNode impl_createPeer() {
		NGDriftFXSurface peer = new NGDriftFXSurface(this, nativeSurfaceId);
		return peer;
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

	
	@Override
	public BaseBounds impl_computeGeomBounds(BaseBounds bounds, BaseTransform tx) {
		bounds = new RectBounds(0f, 0f, (float) getWidth(), (float) getHeight());
		bounds = tx.transform(bounds, bounds);
		return bounds;
	}

	@Override
	protected boolean impl_computeContains(double localX, double localY) {
		double w = getWidth();
		double h = getHeight();
		return (w > 0 && h > 0 && localX >= 0 && localY >= 0 && localX < w && localY < h);
	}

	@Override
	public Object impl_processMXNode(MXNodeAlgorithm alg, MXNodeAlgorithmContext ctx) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	private void widthChanged(double value) {
        if (value != _width) {
            _width = value;
            
            impl_layoutBoundsChanged();
            impl_geomChanged();
            updateSurfaceData();
            impl_markDirty(DirtyBits.NODE_GEOMETRY);
        }
	}
	
	private double _width;
	private ReadOnlyDoubleWrapper width;
	public final double getWidth() { return width == null ? _width : width.get(); }
	public final ReadOnlyDoubleProperty widthProperty() {
        if (width == null) {
            width = new ReadOnlyDoubleWrapper(_width) {
                @Override protected void invalidated() { widthChanged(get()); }
                @Override public Object getBean() { return DriftFXSurface.this; }
                @Override public String getName() { return "width"; }
            };
        }
        return width.getReadOnlyProperty();
    }
	protected void setWidth(double value) {
        if(width == null) {
            widthChanged(value);
        } else {
            width.set(value);
        }
    }
	
	private void heightChanged(double value) {
	        if (_height != value) {
	            _height = value;
	            
	            impl_geomChanged();
	            impl_layoutBoundsChanged();
	            updateSurfaceData();
	            impl_markDirty(DirtyBits.NODE_GEOMETRY);
	        }
	    }
	private double _height;
	private ReadOnlyDoubleWrapper height;
	public final double getHeight() { return height == null ? _height : height.get(); }
	public final ReadOnlyDoubleProperty heightProperty() {
       if (height == null) {
           height = new ReadOnlyDoubleWrapper(_height) {
               @Override protected void invalidated() { heightChanged(get()); }
               @Override public Object getBean() { return DriftFXSurface.this; }
               @Override public String getName() { return "height"; }
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
   
   private static boolean initialized = false;
   
  
   
   public static void initialize(DriftFXConfig config) {
	   if (initialized) return;
	   
	   Configuration.initialize(config);
	   
	   Log.debug("Initializing NativeSurface system");
	   try {
		   GraphicsPipelineUtil.initialize();
	   }
	   catch (Exception e) {
		   throw new RuntimeException(e);
	   }

	   if (GraphicsPipelineUtil.isD3D()) {
		   Log.debug(" * D3D Prism Pipeline active");
		   
	   }
	   else if (GraphicsPipelineUtil.isSW()) {
		   Log.debug(" * SW Prism Pipline active");
	   }
	   
	   Toolkit.getToolkit().addShutdownHook(DriftFXSurface::destroy);
	   
	   if (config.isFallbackMode()) {
		   defaultTransferMode = NativeAPI.getFallbackTransferMode();
	   }
	   else {
		   defaultTransferMode = NativeAPI.getPlatformDefaultTransferMode();
	   }
	   
	   initialized = true;
   }
   
   public static void initialize() {
	   initialize(DriftFXConfig.initSystemProperties());
   }
   
   public static void destroy() {
	   if (!initialized) return;
	   Log.debug("Destroying NativeSurface system");
	   GraphicsPipelineUtil.destroy();
   }
   
   
   private int getTransferModeId() {
	   return transferMode.get().id;
   }

   private SurfaceData computeSurfaceData() {
	   return new SurfaceData(
			   (float) getWidth(), (float) getHeight(), 
			   (float) getScreenScaleFactor(), (float) getScreenScaleFactor(), 
			   (float) getUserScaleFactor(), (float) getUserScaleFactor(), getTransferModeId());
	   
   }
   
	@Deprecated
	@Override
	public void impl_updatePeer() {
		super.impl_updatePeer();
		NGDriftFXSurface peer = impl_getPeer();
		
		if (impl_isDirty(DirtyBits.NODE_GEOMETRY)) {
			SurfaceData data = surfaceData.get();
			peer.updateSurface(data);
			peer.markDirty();
		}
		
		if (impl_isDirty(DirtyBits.NODE_CONTENTS)) {
			peer.markDirty();
		}
		
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
	   impl_markDirty(DirtyBits.NODE_GEOMETRY);
   }
   
   @Override
	public void relocate(double x, double y) {
		super.relocate(x, y);
	}
   
	public void dirty() {
		impl_markDirty(DirtyBits.NODE_CONTENTS);
	}
	
}
