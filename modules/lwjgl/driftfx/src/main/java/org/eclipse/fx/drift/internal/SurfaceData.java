/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.eclipse.fx.drift.internal;

public class SurfaceData {
	public final float width;
	public final float height;
	public final float renderScaleX;
	public final float renderScaleY;
	public final float userScaleX;
	public final float userScaleY;
	public final int transferMode;
	
	public SurfaceData(float width, float height, float renderScaleX, float renderScaleY, float userScaleX, float userScaleY, int transferMode) {
		super();
		this.width = width;
		this.height = height;
		this.renderScaleX = renderScaleX;
		this.renderScaleY = renderScaleY;
		this.userScaleX = userScaleX;
		this.userScaleY = userScaleY;
		this.transferMode = transferMode;
	}
	
	@Override
	public String toString() {
		return String.format("SurfaceData[%5.3f x %5.3f] (%5.3f x %5.3f, %5.3f x %5.3f)", width, height, renderScaleX, renderScaleY, userScaleX, userScaleY);
	}

}
