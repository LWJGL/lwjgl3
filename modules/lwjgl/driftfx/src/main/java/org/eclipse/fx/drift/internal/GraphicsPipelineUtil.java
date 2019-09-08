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
package org.eclipse.fx.drift.internal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

import com.sun.prism.ResourceFactory;
import com.sun.prism.Texture;

public class GraphicsPipelineUtil {

	
	private static Class<?> cGraphicsPipeline;
	private static Method mGraphicsPipelineGetDefaultResourceFactory;

	private static Class<?> cResourceFactory;
	
	private static Object iDefaultResourceFactory;

	private static Optional<Class<?>> getClass(String className) {
		try {
			return Optional.of(Class.forName(className));
		} catch (Exception e) {
			return Optional.empty();
		}
	}
	
	private static boolean isD3D;
	private static boolean isSW;
	private static boolean isES2;
	
	private static Object iD3DContext;
	private static long contextHandleD3D;
	
	private static Object iES2Context;
	private static Object iGLContext;
	private static long contextHandleES2;

	static class D3D {
		
		private static Class<?> cD3DResourceFactory;
		private static Method mD3DResourceFactoryGetContext;
		
		private static Class<?> cD3DContext;
		private static Method mD3DContextGetContextHandle;
		
		
		static void initialize() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
			cD3DResourceFactory = Class.forName("com.sun.prism.d3d.D3DResourceFactory");
			mD3DResourceFactoryGetContext = cD3DResourceFactory.getDeclaredMethod("getContext");
			mD3DResourceFactoryGetContext.setAccessible(true);
			
			cD3DContext = Class.forName("com.sun.prism.d3d.D3DContext");
			mD3DContextGetContextHandle = cD3DContext.getDeclaredMethod("getContextHandle");
			mD3DContextGetContextHandle.setAccessible(true);
		}
		
		static Object getD3DContext(Object iResourceFactory) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			return mD3DResourceFactoryGetContext.invoke(iResourceFactory);
		}
		
		static long getContextHandle(Object iD3DContext) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			return (Long) mD3DContextGetContextHandle.invoke(iD3DContext);
		}
		
		static long getTextureHandle(Texture texture) {
			try {
				// TODO move class and method to members
				Class<?> d3dTexture = Class.forName("com.sun.prism.d3d.D3DTexture");
				Method mD3DTextureGetNativeSourceHandle = d3dTexture.getMethod("getNativeSourceHandle");
				mD3DTextureGetNativeSourceHandle.setAccessible(true);
				return (long) mD3DTextureGetNativeSourceHandle.invoke(texture);
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public static class ES2 {
		
		private static boolean isMac;
		private static boolean isX11;
		
		private static Class<?> cES2ResourceFactory;
		private static Field fES2ResourceFactory_context;
		
		private static Class<?> cES2Context;
		private static Method mES2Context_getGLContext;
		
		private static Class<?> cGLContext;
		
		// mac version
		private static Class<?> cMacGLContext;
		private static Method mMacGLContext_getNativeHandle;
		
		// x11 version
		private static Class<?> cX11GLContext;
		private static Method mX11GLContext_getNativeHandle;
		
		private static Class<?> cBaseTexture;
		private static Field fBaseTexture_resource;
		
		private static Class<?> cManagedResource;
		private static Method mManagedResource_getResource;
		
		private static Class<?> cES2TextureData;
		private static Method mES2TextureData_getTexID;
		
		private static Field fES2TextureData_texID;
		
		
		static void initialize() throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException  {
			cES2ResourceFactory = Class.forName("com.sun.prism.es2.ES2ResourceFactory");
			fES2ResourceFactory_context = cES2ResourceFactory.getDeclaredField("context");
			fES2ResourceFactory_context.setAccessible(true);
			
			cES2Context = Class.forName("com.sun.prism.es2.ES2Context");
			mES2Context_getGLContext = cES2Context.getDeclaredMethod("getGLContext");
			mES2Context_getGLContext.setAccessible(true);
			
			try {
				cMacGLContext = Class.forName("com.sun.prism.es2.MacGLContext");
				mMacGLContext_getNativeHandle = cMacGLContext.getDeclaredMethod("getNativeHandle");
				mMacGLContext_getNativeHandle.setAccessible(true);
				isMac = true;
			}
			catch (ClassNotFoundException e) {
				isMac = false;
			}
			
			try {
				cX11GLContext = Class.forName("com.sun.prism.es2.X11GLContext");
				mX11GLContext_getNativeHandle = cX11GLContext.getDeclaredMethod("getNativeHandle");
				mX11GLContext_getNativeHandle.setAccessible(true);
				isX11 = true;
			}
			catch (ClassNotFoundException e) {
				isX11 = false;
			}
			cBaseTexture = Class.forName("com.sun.prism.impl.BaseTexture");
			fBaseTexture_resource = cBaseTexture.getDeclaredField("resource");
			fBaseTexture_resource.setAccessible(true);
			
			cManagedResource = Class.forName("com.sun.prism.impl.ManagedResource");
			mManagedResource_getResource = cManagedResource.getDeclaredMethod("getResource");
			mManagedResource_getResource.setAccessible(true);
			
			cES2TextureData = Class.forName("com.sun.prism.es2.ES2TextureData");
			mES2TextureData_getTexID = cES2TextureData.getDeclaredMethod("getTexID");
			mES2TextureData_getTexID.setAccessible(true);
			
			fES2TextureData_texID = cES2TextureData.getDeclaredField("texID");
			fES2TextureData_texID.setAccessible(true);
		}
		
		static Object getES2Context(Object iES2ResourceFactory) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			return fES2ResourceFactory_context.get(iES2ResourceFactory);
		}
		
		static Object getGLContext(Object iES2Context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			return  mES2Context_getGLContext.invoke(iES2Context);
		}
		
		static long getNativeHandle(Object iGLContext) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			if (isMac) {
				return (long) mMacGLContext_getNativeHandle.invoke(iGLContext);
			}
			else if (isX11) {
				return (long) mX11GLContext_getNativeHandle.invoke(iGLContext);
			}
			else {
				throw new RuntimeException("this is neither Mac nor X11 - don't know how to handle this!");
			}
		}
		
		static Object getTextureResource(Object iTexture) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			return fBaseTexture_resource.get(iTexture);
		}
		
		static Object getResourceResource(Object iManagedResource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			return mManagedResource_getResource.invoke(iManagedResource);
		}
		
		static int getTexID(Object iES2TextureData) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			return (int) mES2TextureData_getTexID.invoke(iES2TextureData);
		}
		
		static void setTexID(Object iES2TextureData, int texID) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			fES2TextureData_texID.set(iES2TextureData, texID);
		}

		public static int getTextureName(Texture texture) {
			try {
				return getTexID(getResourceResource(getTextureResource(texture)));
			}
			catch (Exception e) {
				return 0;
			}
		}
		
		public static void updateTextureName(Texture texture, int texID) {
			try {
				setTexID(getResourceResource(getTextureResource(texture)), texID);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void initialize() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
			IllegalAccessException, IllegalArgumentException, NoSuchFieldException {

		cGraphicsPipeline = Class.forName("com.sun.prism.GraphicsPipeline");
		mGraphicsPipelineGetDefaultResourceFactory = cGraphicsPipeline.getMethod("getDefaultResourceFactory");
		cResourceFactory = Class.forName("com.sun.prism.ResourceFactory");
		iDefaultResourceFactory = mGraphicsPipelineGetDefaultResourceFactory.invoke(null);
		
		String name = iDefaultResourceFactory.getClass().getName();
		isD3D = "com.sun.prism.d3d.D3DResourceFactory".equals(name);
		isES2 = "com.sun.prism.es2.ES2ResourceFactory".equals(name);
		isSW = "com.sun.prism.sw.SWResourceFactory".equals(name);
		
		if (isD3D) {
			D3D.initialize();
			iD3DContext = D3D.getD3DContext(iDefaultResourceFactory);
			contextHandleD3D = D3D.getContextHandle(iD3DContext);
			Log.debug(" * D3D Context handle = " + contextHandleD3D);
			
			NativeAPI.initializeD3DPipeline(contextHandleD3D);
		}
		else if (isES2) {
			ES2.initialize();
			iES2Context = ES2.getES2Context(iDefaultResourceFactory);
			iGLContext = ES2.getGLContext(iES2Context);
			contextHandleES2 = ES2.getNativeHandle(iGLContext);
			
			NativeAPI.initializeES2Pipeline(contextHandleES2);
		}
		else if (isSW) {
			throw new UnsupportedOperationException("SW Support not yet implemented!");
		}
		else {
			throw new UnsupportedOperationException("Unknown JavaFX pipeline!");
		}
		
		
	}

	public static boolean isD3D() {
		return isD3D;
	}
	
	public static boolean isSW() {
		return isSW;
	}
	
	public static boolean isES2() {
		return isES2;
	}

	public static void destroy() {
		NativeAPI.destroyD3DPipeline();
	}

	
	public static long getTextureHandle(Texture texture) {
		if (isD3D()) {
			try {
				// TODO move class and method to members
				Class<?> d3dTexture = Class.forName("com.sun.prism.d3d.D3DTexture");
				Method mD3DTextureGetNativeSourceHandle = d3dTexture.getMethod("getNativeSourceHandle");
				mD3DTextureGetNativeSourceHandle.setAccessible(true);
				return (long) mD3DTextureGetNativeSourceHandle.invoke(texture);
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		if (isES2()) {
			return ES2.getTextureName(texture);
		}
		throw new UnsupportedOperationException("Not implemented");
	}

	public static ResourceFactory getResourceFactory() {
		return (ResourceFactory) iDefaultResourceFactory;
	}

	
	
	public static int onTextureCreated(Texture texture, Frame frame) {
		return NativeAPI.nOnTextureCreated(frame.surfaceId, frame.frameId, texture);
	}
	

}
