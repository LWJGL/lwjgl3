/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.eclipse.fx.drift.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.fx.drift.DriftFXSurface.TransferMode;

import com.sun.prism.Texture;

//Note: this implementation is against internal JavafX API
@SuppressWarnings("restriction")
public class NativeAPI {

	static {
		//Log.info("Loading driftfx " + System.getProperty("java.library.path"));
		//System.loadLibrary("driftfx");
		try {
            Class.forName("org.lwjgl.driftfx.DriftFX");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
		Initialize();
	}
	
	
	
	private static native TransferMode[] nGetTransferModes();
	private static List<TransferMode> transferModes;
	public static List<TransferMode> getTransferModes() {
		if (transferModes == null) {
			transferModes = Collections.unmodifiableList(Arrays.asList(nGetTransferModes()));
		}
		return transferModes;
	}
	
	private static native TransferMode nGetFallbackTransferMode();
	private static TransferMode fallbackTransferMode;
	public static TransferMode getFallbackTransferMode() {
		if (fallbackTransferMode == null) {
			fallbackTransferMode = nGetFallbackTransferMode();
		}
		return fallbackTransferMode;
	}
	
	private static native TransferMode nGetPlatformDefaultTransferMode();
	private static TransferMode platformDefaultTransferMode;
	public static TransferMode getPlatformDefaultTransferMode() {
		if (platformDefaultTransferMode == null) {
			platformDefaultTransferMode = nGetPlatformDefaultTransferMode();
		}
		return platformDefaultTransferMode;
	}
	
	
	public static native long nGetD3DTextureHandle(long fxTextureHandle);

	
	
	private static native void nUpdateSurface(long nativeSurfaceId, double width, double height, double screenScaleX, double screenScaleY, double userScaleX, double userScaleY, int transferMode);
	public static void updateSurface(long nativeSurfaceId, SurfaceData surfaceData) {
		nUpdateSurface(nativeSurfaceId, surfaceData.width, surfaceData.height, surfaceData.renderScaleX, surfaceData.renderScaleY, surfaceData.userScaleX, surfaceData.userScaleY, surfaceData.transferMode);
	}
	
	private static native long nCreateSharedTexture(long nativeSurfaceId, long jfxTextureHandle);
	public static long createSharedTexture(long nativeSurfaceId, long jfxTextureHandle) {
		return nCreateSharedTexture(nativeSurfaceId, jfxTextureHandle);
	}
	
	private static native void nCleanFXSharedTextures(long nativeSurfaceId);
	public static void cleanFXSharedTextures(long nativeSurfaceId) {
		nCleanFXSharedTextures(nativeSurfaceId);
	}
	
	private static native void nDestroySharedTexture(long nativeSurfaceId, long sharedTextureId);
	public static void destroySharedTexture(long nativeSurfaceId, long sharedTextureId) {
		nDestroySharedTexture(nativeSurfaceId, sharedTextureId);
	}
	
	private static native void nInitializeD3DPipeline(long pContext);
	public static void initializeD3DPipeline(long pContext) {
		nInitializeD3DPipeline(pContext);
	}
	
	private static native void nDestroyD3DPipeline();
	public static void destroyD3DPipeline() {
		nDestroyD3DPipeline();
	}
	
	private static native void nInitializeES2Pipeline(long pContext);
	public static void initializeES2Pipeline(long pContext) {
		nInitializeES2Pipeline(pContext);
	}
	
	private static native int nD3DRecreateTextureAsShared(Texture fxTexture, long d3dShareHandle);
	public static int d3dRecreateTextureAsShared(Texture fxTexture, long d3dShareHandle) {
		return nD3DRecreateTextureAsShared(fxTexture, d3dShareHandle);
	}
	
	private static native long nD3DRecreateTexture(long textureResourceHandle);
	public static long d3dRecreateTexture(long textureResourceHandle) {
		return nD3DRecreateTexture(textureResourceHandle);
	}
	
	private static native void nInitialize();
	public static void Initialize() {
		nInitialize();
	}
	
	private static native void nDestroy();
	public static void Destroy() {
		nDestroy();
	}
	
	private static native long nCreateNativeSurface(JNINativeSurface surface);
	public static long createNativeSurface(JNINativeSurface surface) {
		return nCreateNativeSurface(surface);
	}
	
	private static native long nDestroyNativeSurface(long nativeSurfaceHandle);
	public static void destroyNativeSurface(long nativeSurfaceHandle) {
		nDestroyNativeSurface(nativeSurfaceHandle);
	}

	private static native int nES2CopyTexture(int sourceTexture, int targetTexture, int w, int h);
	public static int es2CopyTexture(int sourceTexture, int targetTexture, int w, int h) {
		return nES2CopyTexture(sourceTexture, targetTexture, w, h);
	}
	
	
	public static native void nES2UploadTexture(int targetTexture, int width, int height, long memoryPointer, long memorySize);

	private static native int nES2ConnectTextureToIOSurface(int textureName, int w, int h, long ioSurfaceHandle);
	public static int es2ConnectTextureToIOSurface(int textureName, int w, int h, long ioSurfaceHandle) {
		return nES2ConnectTextureToIOSurface(textureName, w, h, ioSurfaceHandle);
	}

	private static native void nES2DeleteTexture(int textureName);
	public static void es2DeleteTexture(int textureName) {
		nES2DeleteTexture(textureName);
	}
	
	
	private static native void nDisposeFrame(long surfaceId, long frameId);
	public static void disposeFrame(Frame frame) {
		nDisposeFrame(frame.surfaceId, frame.frameId);
	}

	
	public static native int nOnTextureCreated(long surfaceId, long frameId, Texture fxTexture);



	
}
