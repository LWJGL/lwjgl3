/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.eclipse.fx.drift.internal;

public class FrameData {
	public long frameId;
	
	public SurfaceData surfaceData;	
	
	public long d3dShareHandle;
	public long ioSurfaceHandle;
	public int width;
	public int height;
	public int textureName;
	
	public int placementHint;
	
	public long memoryPointer;
	public long memorySize;
	
	public FrameData() {
	}
	

	public FrameData(long frameId, int width, int height, SurfaceData surfaceData, 
			long d3dShareHandle, 
			long ioSurfaceHandle, 
			int textureName, 
			int placementHint,
			long memoryPointer,
			long memorySize) {
		this.frameId = frameId;
		this.width = width;
		this.height = height;
		this.surfaceData = surfaceData;
		this.d3dShareHandle = d3dShareHandle;
		this.ioSurfaceHandle = ioSurfaceHandle;
		this.textureName = textureName;
		this.placementHint = placementHint;
		this.memoryPointer = memoryPointer;
		this.memorySize = memorySize;
	}

	//TODO fix this!!!! (equals)
	

	@Override
	public String toString() {
		return String.format("FrameData[%d: %d x %d] (%d,%d,%d) %s", frameId, width, height, d3dShareHandle, ioSurfaceHandle, textureName, surfaceData);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (d3dShareHandle ^ (d3dShareHandle >>> 32));
		result = prime * result + (int) (frameId ^ (frameId >>> 32));
		result = prime * result + height;
		result = prime * result + (int) (ioSurfaceHandle ^ (ioSurfaceHandle >>> 32));
		result = prime * result + (int) (memoryPointer ^ (memoryPointer >>> 32));
		result = prime * result + (int) (memorySize ^ (memorySize >>> 32));
		result = prime * result + placementHint;
		result = prime * result + ((surfaceData == null) ? 0 : surfaceData.hashCode());
		result = prime * result + textureName;
		result = prime * result + width;
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
		FrameData other = (FrameData) obj;
		if (d3dShareHandle != other.d3dShareHandle)
			return false;
		if (frameId != other.frameId)
			return false;
		if (height != other.height)
			return false;
		if (ioSurfaceHandle != other.ioSurfaceHandle)
			return false;
		if (memoryPointer != other.memoryPointer)
			return false;
		if (memorySize != other.memorySize)
			return false;
		if (placementHint != other.placementHint)
			return false;
		if (surfaceData == null) {
			if (other.surfaceData != null)
				return false;
		} else if (!surfaceData.equals(other.surfaceData))
			return false;
		if (textureName != other.textureName)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
}