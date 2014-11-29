/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;

/** This interface must be implemented by objects that manage external resources and use reference counting to trigger the release of those resources. */
public interface Retainable {

	/**
	 * Increments the reference count. Each call to {@code retain} must be matched with a call to {@link #release}.
	 * <p/>
	 * When a {@code Retainable} object is first instantiated the reference count is equal to {@code 1}.
	 */
	void retain();

	/**
	 * Decrements the reference count.
	 * <p/>
	 * When the reference count reaches zero, any resources held by the {@code Retainable} object are released. After this happens, calling any other method on
	 * the object has undefined results.
	 */
	void release();

	abstract class Default implements Retainable {

		private int refCount = 1;

		@Override
		public void retain() {
			if ( LWJGLUtil.DEBUG && refCount == 0 )
				throw new IllegalStateException("This object has been released already.");

			refCount++;
		}

		@Override
		public void release() {
			if ( LWJGLUtil.DEBUG && refCount == 0 )
				throw new IllegalStateException("This object has been released already.");

			if ( --refCount == 0 )
				destroy();
		}

		/** Destroys any resources held by this Retainable instance. */
		protected abstract void destroy();

	}

}