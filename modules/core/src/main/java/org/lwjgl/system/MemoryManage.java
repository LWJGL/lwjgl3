/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;

import static org.lwjgl.system.jemalloc.JEmalloc.*;
import static org.lwjgl.system.libc.Stdlib.*;

/** Provides {@link MemoryAllocator} implementations for {@link MemoryUtil} to use. */
final class MemoryManage {

	private MemoryManage() {
	}

	static MemoryAllocator getInstance() {
		String allocator = System.getProperty("org.lwjgl.system.allocator", "jemalloc");

		if ( "jemalloc".equals(allocator) ) {
			try {
				// check if the jemalloc library is available
				Class.forName("org.lwjgl.system.jemalloc.JEmalloc").getMethod("getInstance").invoke(null);
				return new JEmallocAllocator();
			} catch (Exception e) {
				e.printStackTrace();
				LWJGLUtil.log("MemoryUtil allocator: failed to load the jemalloc library.");
			}
		}

		return new StdlibAllocator();
	}

	interface MemoryAllocator {

		long malloc(long size);
		long calloc(long num, long size);
		long realloc(long ptr, long size);
		void free(long ptr);

		long aligned_alloc(long alignment, long size);
		void aligned_free(long ptr);

	}

	/** stdlib memory allocator. */
	private static class StdlibAllocator implements MemoryAllocator {

		@Override
		public long malloc(long size) {
			return nmalloc(size);
		}

		@Override
		public long calloc(long num, long size) {
			return ncalloc(num, size);
		}

		@Override
		public long realloc(long ptr, long size) {
			return nrealloc(ptr, size);
		}

		@Override
		public void free(long ptr) {
			nfree(ptr);
		}

		@Override
		public long aligned_alloc(long alignment, long size) {
			return naligned_alloc(alignment, size);
		}

		@Override
		public void aligned_free(long ptr) {
			naligned_free(ptr);
		}

	}

	/** jemalloc memory allocator. */
	private static class JEmallocAllocator implements MemoryAllocator {

		@Override
		public long malloc(long size) {
			return nje_malloc(size);
		}

		@Override
		public long calloc(long num, long size) {
			return nje_calloc(num, size);
		}

		@Override
		public long realloc(long ptr, long size) {
			return nje_realloc(ptr, size);
		}

		@Override
		public void free(long ptr) {
			nje_free(ptr);
		}

		@Override
		public long aligned_alloc(long alignment, long size) {
			return nje_aligned_alloc(alignment, size);
		}

		@Override
		public void aligned_free(long ptr) {
			nje_free(ptr);
		}

	}

}