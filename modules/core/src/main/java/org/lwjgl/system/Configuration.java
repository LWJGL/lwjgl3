/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.MemoryUtil.MemoryAllocator;

import java.io.File;
import java.io.PrintStream;
import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;

/**
 * This class can be used to programmatically set the LWJGL runtime configuration. It is an alternative to using system properties.
 *
 * <p>Care must be taken when setting <em>static</em> options. Such options are only read once or cached in {@code static final} fields. They must be
 * configured through this class before touching any other LWJGL class.</p>
 */
public enum Configuration {

	/**
	 * Takes priority over {@code java.library.path}. It may contain one or more directory paths, separated by {@link File#pathSeparator}.
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.librarypath</b><br>
	 * &nbsp; &nbsp; Type: String<br>
	 * &nbsp; &nbsp;Usage: Dynamic<br>
	 */
	LIBRARY_PATH("org.lwjgl.librarypath", StateInit.STRING),

	/**
	 * Changes the temporary directory name created by LWJGL when extracting shared libraries from JAR files. If this option is not set, it defaults to
	 * {@code lwjgl&lt;user name&gt;}.
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.SharedLibraryTempDirectory</b><br>
	 * &nbsp; &nbsp; Type: String<br>
	 * &nbsp; &nbsp;Usage: Dynamic<br>
	 */
	SHARED_LIBRARY_TEMP_DIRECTORY("org.lwjgl.SharedLibraryTempDirectory", StateInit.STRING),

	/**
	 * Can be used to override the LWJGL library name. It can be an absolute path.
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.libname</b><br>
	 * &nbsp; &nbsp; Type: String<br>
	 * &nbsp; &nbsp;Usage: Dynamic<br>
	 */
	LIBRARY_NAME_LWJGL("org.lwjgl.libname", StateInit.STRING),
	/** Similar to {@link #LIBRARY_NAME_LWJGL} for the jemalloc library (<b>org.lwjgl.system.jemalloc.libname</b>). */
	LIBRARY_NAME_JEMALLOC("org.lwjgl.system.jemalloc.libname", StateInit.STRING),
	/** Similar to {@link #LIBRARY_NAME_LWJGL} for the GLFW library (<b>org.lwjgl.glfw.libname</b>). */
	LIBRARY_NAME_GLFW("org.lwjgl.glfw.libname", StateInit.STRING),
	/** Similar to {@link #LIBRARY_NAME_LWJGL} for the EGL library (<b>org.lwjgl.egl.libname</b>). */
	LIBRARY_NAME_EGL("org.lwjgl.egl.libname", StateInit.STRING),
	/** Similar to {@link #LIBRARY_NAME_LWJGL} for the OpenAL library (<b>org.lwjgl.openal.libname</b>). */
	LIBRARY_NAME_OPENAL("org.lwjgl.openal.libname", StateInit.STRING),
	/** Similar to {@link #LIBRARY_NAME_LWJGL} for the OpenCL library (<b>org.lwjgl.opencl.libname</b>). */
	LIBRARY_NAME_OPENCL("org.lwjgl.opencl.libname", StateInit.STRING),
	/** Similar to {@link #LIBRARY_NAME_LWJGL} for the OpenGL library (<b>org.lwjgl.opengl.libname</b>). */
	LIBRARY_NAME_OPENGL("org.lwjgl.opengl.libname", StateInit.STRING),
	/** Similar to {@link #LIBRARY_NAME_LWJGL} for the OpenGL ES library (<b>org.lwjgl.opengles.libname</b>). */
	LIBRARY_NAME_OPENGLES("org.lwjgl.opengles.libname", StateInit.STRING),

	/**
	 * Sets the alignment of buffers allocated by {@link org.lwjgl.BufferUtils BufferUtils}. By default, buffer allocations will be unaligned (whatever
	 * {@link ByteBuffer#allocateDirect} returns). Supported values:
	 *
	 * <ul>
	 * <li><em>cache-line</em> Cache-line alignment (usually 64 bytes)</li>
	 * <li><em>default</em> Default alignment. The JDK uses 8 byte alignment for all direct {@link ByteBuffer}s.</li>
	 * <li><em>&lt;number&gt;</em> Custom alignment. Must be a power-of-two integer, greater than 8.</li>
	 * </ul>
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.util.BufferAlign</b><br>
	 * &nbsp; &nbsp; Type: String<br>
	 * &nbsp; &nbsp;Usage: Static<br>
	 */
	MEMORY_DEFAULT_ALIGNMENT("org.lwjgl.util.BufferAlign", StateInit.STRING),

	/**
	 * Sets the allocator used for the {@link MemoryUtil} explicit memory management API
	 * ({@link MemoryUtil#memAlloc memAlloc}/{@link MemoryUtil#memFree memFree}/etc). Supported values:
	 *
	 * <ul>
	 * <li><em>jemalloc</em> The allocator provided by the jemalloc library</li>
	 * <li><em>system</em> The default system memory allocator</li>
	 * <li><em>&lt;classpath&gt;</em> A class that implements the {@link MemoryAllocator} interface. It will be instantiated using reflection.</li>
	 * </ul>
	 *
	 * <p>When set programmatically, it can also be a {@link MemoryAllocator} instance.</p>
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.system.allocator</b><br>
	 * &nbsp; &nbsp; Type: String or a {@link MemoryAllocator} instance<br>
	 * &nbsp; &nbsp;Usage: Static<br>
	 */
	MEMORY_ALLOCATOR("org.lwjgl.system.allocator", StateInit.STRING),

	/**
	 * Set to true to disable LWJGL's basic checks. These are trivial checks that LWJGL performs to avoid JVM crashes, very useful during development.
	 * Their performance impact is usually minimal, but may they be disabled for release builds.
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.util.NoChecks</b><br>
	 * &nbsp; &nbsp; Type: boolean<br>
	 * &nbsp; &nbsp;Usage: Static<br>
	 */
	DISABLE_CHECKS("org.lwjgl.util.NoChecks", StateInit.BOOLEAN),

	/**
	 * Set to true to enable LWJGL's debug mode. Information messages will be printed to the {@link LWJGLUtil#DEBUG_STREAM} and extra runtime checks will
	 * be performed (some potentially expensive, performance-wise).
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.util.Debug</b><br>
	 * &nbsp; &nbsp; Type: boolean<br>
	 * &nbsp; &nbsp;Usage: Static<br>
	 */
	DEBUG("org.lwjgl.util.Debug", StateInit.BOOLEAN),

	/**
	 * Can be set to override the default {@link LWJGLUtil#DEBUG_STREAM}. It must be the name of a class that implements the
	 * {@link DebugStreamFactory DebugStreamFactory} interface. The class will be instantiated using reflection and the result of
	 * {@link DebugStreamFactory#create DebugStreamFactory.create} will become the {@link #DEBUG_STREAM} used by LWJGL.
	 *
	 * <p>When set programmatically, it can also be a {@link PrintStream} instance.</p>
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.util.DebugStream</b><br>
	 * &nbsp; &nbsp; Type: String or a {@link PrintStream} instance<br>
	 * &nbsp; &nbsp;Usage: Static<br>
	 */
	DEBUG_STREAM("org.lwjgl.util.DebugStream", StateInit.STRING),

	/**
	 * Set to true to enable LWJGL's debug mode for the {@link MemoryUtil} explicit memory management API
	 * ({@link MemoryUtil#memAlloc memAlloc}/{@link MemoryUtil#memFree memFree}/etc). All memory allocations through that API will be tracked and leaks
	 * will be reported on JVM exit. The {@code memReport} methods can also be used.
	 *
	 * <p>The debug allocator generates stack traces on every allocation, which may negatively impact performance. If this becomes a serious issue, the
	 * JVM options {@code -XX:-StackTraceInThrowable} and {@code -XX:MaxJavaStackTraceDepth=d} (where {@code d >= 6}) can be used to reduce the
	 * overhead.</p>
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.util.DebugAllocator</b><br>
	 * &nbsp; &nbsp; Type: boolean<br>
	 * &nbsp; &nbsp;Usage: Static<br>
	 */
	DEBUG_MEMORY_ALLOCATOR("org.lwjgl.util.DebugAllocator", StateInit.BOOLEAN),

	/**
	 * Can be used to limit the maximum available OpenGL version. This can be useful to ensure that an application has not accidentally used features only
	 * available in a higher OpenGL version.
	 *
	 * <p>When set programmatically, it can also be an {@link APIUtil.APIVersion} instance.</p>
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.opengl.maxVersion</b><br>
	 * &nbsp; &nbsp; Type: String (M.n) or an {@link APIUtil.APIVersion} instance<br>
	 * &nbsp; &nbsp;Usage: Static<br>
	 */
	MAXVERSION_OPENGL("org.lwjgl.opengl.maxVersion", StateInit.STRING),
	/** Similar to {@link #MAXVERSION_OPENGL} for the OpenGL ES library (<b>org.lwjgl.opengles.maxVersion</b>). */
	MAXVERSION_OPENGLES("org.lwjgl.opengles.maxVersion", StateInit.STRING),

	/**
	 * By default, LWJGL will automatically initialize the EGL library, when it is first accessed. Set this property to disable this behavior.
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.egl.explicitInit</b><br>
	 * &nbsp; &nbsp; Type: boolean<br>
	 * &nbsp; &nbsp;Usage: Static<br>
	 */
	EXPLICIT_INIT_EGL("org.lwjgl.egl.explicitInit", StateInit.BOOLEAN),
	/** Similar to {@link #EXPLICIT_INIT_EGL} for the OpenAL library (<b>org.lwjgl.openal.explicitInit</b>). */
	EXPLICIT_INIT_OPENAL("org.lwjgl.openal.explicitInit", StateInit.BOOLEAN),
	/** Similar to {@link #EXPLICIT_INIT_EGL} for the OpenCL library (<b>org.lwjgl.opencl.explicitInit</b>). */
	EXPLICIT_INIT_OPENCL("org.lwjgl.opencl.explicitInit", StateInit.BOOLEAN),
	/** Similar to {@link #EXPLICIT_INIT_EGL} for the OpenGL library (<b>org.lwjgl.opengl.explicitInit</b>). */
	EXPLICIT_INIT_OPENGL("org.lwjgl.opengl.explicitInit", StateInit.BOOLEAN),
	/** Similar to {@link #EXPLICIT_INIT_EGL} for the OpenGL ES library (<b>org.lwjgl.opengles.explicitInit</b>). */
	EXPLICIT_INIT_OPENGLES("org.lwjgl.opengles.explicitInit", StateInit.BOOLEAN),

	/**
	 * Set to true to use the EGL context API. The {@link #LIBRARY_NAME_GLFW} option must also be set to a GLFW implementation that supports EGL.
	 *
	 * <p style="font-family: monospace">
	 * Property: <b>org.lwjgl.glfw.EGL</b><br>
	 * &nbsp; &nbsp; Type: boolean<br>
	 * &nbsp; &nbsp;Usage: Static<br>
	 */
	GLFW_EGL("org.lwjgl.glfw.EGL", StateInit.BOOLEAN);

	private enum StateInit {
		STRING {
			@Override
			Object getState(String property) {
				return System.getProperty(property);

			}
		},
		BOOLEAN {
			@Override
			Object getState(String property) {
				return Boolean.getBoolean(property);
			}
		};

		abstract Object getState(String property);
	}

	private final String property;

	private Object state;

	Configuration(String property, StateInit init) {
		this.property = property;
		this.state = init.getState(property);
	}

	public String getProperty() {
		return property;
	}

	/**
	 * Sets the option value.
	 *
	 * @param value the value to set
	 */
	public void set(Object value) {
		this.state = value;
	}

	/**
	 * Returns the option value.
	 *
	 * @param <T> the value type
	 */
	@SuppressWarnings("unchecked")
	public <T> T get() {
		return (T)state;
	}

	/**
	 * Returns the value of the specified option.
	 *
	 * @param defaultValue the default value
	 * @param <T>          the value type
	 */
	@SuppressWarnings("unchecked")
	public <T> T get(T defaultValue) {
		T state = (T)this.state;
		if ( state == null )
			state = defaultValue;

		return state;
	}

	/**
	 * Returns the {@link APIVersion} value of the specified option.
	 *
	 * @param option the option to query
	 */
	public static APIVersion getAPIVersion(Configuration option) {
		APIVersion version;

		Object state = option.get();
		if ( state instanceof String )
			version = apiParseVersion((String)state, null);
		else if ( state instanceof APIVersion )
			version = (APIVersion)state;
		else
			version = null;

		return version;
	}

	/** An implementation of this interface may be set to the {@link #DEBUG_STREAM} option. */
	public interface DebugStreamFactory {
		/** Returns a {@link PrintStream} instance. */
		PrintStream create();
	}

}