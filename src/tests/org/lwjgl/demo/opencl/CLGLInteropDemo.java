/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.Platform;
import org.lwjgl.glfw.*;
import org.lwjgl.opencl.CL;
import org.lwjgl.opencl.CLCapabilities;
import org.lwjgl.opencl.CLDevice;
import org.lwjgl.opencl.CLPlatform;
import org.lwjgl.opencl.CLPlatform.Filter;
import org.lwjgl.opengl.GLContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.Info.*;
import static org.lwjgl.opencl.KHRICD.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

/*
		THIS DEMO USES CODE PORTED FROM JogAmp.org
		Original code: http://github.com/mbien/jocl-demos
		Original author: Michael Bien

   ___         ___                      ___
	  /  /\       /  /\         ___        /  /\    http://jocl.jogamp.org/
	 /  /:/      /  /::\       /__/\      /  /::\   a http://jogamp.org/ project.
	/__/::\     /  /:/\:\      \  \:\    /  /:/\:\
	\__\/\:\   /  /:/~/::\      \  \:\  /  /:/~/::\
	   \  \:\ /__/:/ /:/\:\ ___  \__\:\/__/:/ /:/\:\
		\__\:\\  \:\/:/__\//__/\ |  |:|\  \:\/:/__\/
		/  /:/ \  \::/     \  \:\|  |:| \  \::/
	   /__/:/   \  \:\      \  \:\__|:|  \  \:\
	   \__\/     \  \:\      \__\::::/    \  \:\
				  \__\/          ~~~~      \__\/
			   ___          ___       ___          ___          ___
			  /  /\        /  /\     /  /\        /__/\        /  /\
			 /  /::\      /  /::\   /  /:/_       \  \:\      /  /:/
			/  /:/\:\    /  /:/\:\ /  /:/ /\       \  \:\    /  /:/      ___     ___
		   /  /:/  \:\  /  /:/~/://  /:/ /:/_  _____\__\:\  /  /:/  ___ /__/\   /  /\
		  /__/:/ \__\:\/__/:/ /://__/:/ /:/ /\/__/::::::::\/__/:/  /  /\\  \:\ /  /:/
		  \  \:\ /  /:/\  \:\/:/ \  \:\/:/ /:/\  \:\~~\~~\/\  \:\ /  /:/ \  \:\  /:/
		   \  \:\  /:/  \  \::/   \  \::/ /:/  \  \:\  ~~~  \  \:\  /:/   \  \:\/:/
			\  \:\/:/    \  \:\    \  \:\/:/    \  \:\       \  \:\/:/     \  \::/
			 \  \::/      \  \:\    \  \::/      \  \:\       \  \::/       \__\/
			  \__\/        \__\/     \__\/        \__\/        \__\/

		 _____          ___           ___           ___           ___
		/  /::\        /  /\         /__/\         /  /\         /  /\
	   /  /:/\:\      /  /:/_       |  |::\       /  /::\       /  /:/_
	  /  /:/  \:\    /  /:/ /\      |  |:|:\     /  /:/\:\     /  /:/ /\
	 /__/:/ \__\:|  /  /:/ /:/_   __|__|:|\:\   /  /:/  \:\   /  /:/ /::\
	 \  \:\ /  /:/ /__/:/ /:/ /\ /__/::::| \:\ /__/:/ \__\:\ /__/:/ /:/\:\
	  \  \:\  /:/  \  \:\/:/ /:/ \  \:\~~\__\/ \  \:\ /  /:/ \  \:\/:/~/:/
	   \  \:\/:/    \  \::/ /:/   \  \:\        \  \:\  /:/   \  \::/ /:/
		\  \::/      \  \:\/:/     \  \:\        \  \:\/:/     \__\/ /:/
		 \__\/        \  \::/       \  \:\        \  \::/        /__/:/
					   \__\/         \__\/         \__\/         \__\/
*/

public final class CLGLInteropDemo {

	private static final Set<String> params = new HashSet<String>(8);

	// max per pixel iterations to compute the fractal
	private static int maxIterations = 500;

	private static int initWidth  = 512;
	private static int initHeight = 512;

	// ------------------

	private CLGLInteropDemo() {
	}

	public static void main(String... args) {
		parseArgs(args);

		GLFWErrorCallback errorfun;
		glfwSetErrorCallback(errorfun = errorCallbackPrint(System.err));
		if ( glfwInit() != GL_TRUE ) {
			System.out.println("Unable to initialize glfw");
			System.exit(-1);
		}

		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
		if ( LWJGLUtil.getPlatform() == Platform.MACOSX ) {
			glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);
			glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
		} else
			glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 1);
		glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GL_TRUE);
		final boolean debugGL = params.contains("debugGL");
		if ( debugGL )
			glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GL_TRUE);

		final String vendorGL = getOpenGLVendor();

		final Filter<CLPlatform> platformFilter = new Filter<CLPlatform>() {
			@Override
			public boolean accept(CLPlatform platform) {
				CLCapabilities caps = platform.getCapabilities();
				return caps.cl_khr_gl_sharing || caps.cl_APPLE_gl_sharing;
			}
		};

		// Try to match GL_VENDOR and CL_PLATFORM_VENDOR
		List<CLPlatform> platforms = CLPlatform.getPlatforms(new Filter<CLPlatform>() {
			@Override
			public boolean accept(CLPlatform platform) {
				return platformFilter.accept(platform) && clGetPlatformInfoStringUTF8(platform.getPointer(), CL_PLATFORM_VENDOR).contains(vendorGL);
			}
		});

		if ( platforms.isEmpty() ) {
			// Nope, try again without the filter.
			platforms = CLPlatform.getPlatforms(platformFilter);
		}

		if ( platforms.isEmpty() )
			throw new IllegalStateException("No OpenCL platforms found that support KHR_gl_sharing.");

		final CLPlatform platform = platforms.get(0);

		String platformID;
		if ( platform.getCapabilities().cl_khr_icd )
			platformID = clGetPlatformInfoStringASCII(platform.getPointer(), CL_PLATFORM_ICD_SUFFIX_KHR); // less spammy
		else
			platformID = clGetPlatformInfoStringUTF8(platform.getPointer(), CL_PLATFORM_VENDOR);

		boolean hasCPU = false;
		boolean hasGPU = false;
		for ( CLDevice device : platform.getDevices(CL_DEVICE_TYPE_ALL) ) {
			long type = clGetDeviceInfoLong(device.getPointer(), CL_DEVICE_TYPE);
			if ( type == CL_DEVICE_TYPE_CPU )
				hasCPU = true;
			else if ( type == CL_DEVICE_TYPE_GPU )
				hasGPU = true;
		}

		Thread[] threads = new Thread[hasCPU && hasGPU ? 2 : 1];
		GLFWWindow[] windows = new GLFWWindow[threads.length];

		final CountDownLatch latch = new CountDownLatch(windows.length);
		final CyclicBarrier barrier = new CyclicBarrier(windows.length + 1);

		for ( int i = 0; i < threads.length; i++ ) {
			final int deviceType = i == 1 || !hasGPU ? CL_DEVICE_TYPE_CPU : CL_DEVICE_TYPE_GPU;

			String ID = platformID + " - " + (deviceType == CL_DEVICE_TYPE_CPU ? "CPU" : "GPU");
			final GLFWWindow window = new GLFWWindow(glfwCreateWindow(initWidth, initHeight, ID, NULL, NULL), ID, new CountDownLatch(1));
			glfwSetWindowPos(window.handle, 200 + initWidth * i + 32 * i, 200);

			windows[i] = window;
			threads[i] = new Thread(platformID) {
				@Override
				public void run() {
					Mandelbrot demo = null;
					try {
						demo = new Mandelbrot(platform, window, deviceType, debugGL, maxIterations);
					} catch (Exception e) {
						e.printStackTrace();
					}

					try {
						barrier.await();
						if ( demo != null )
							demo.renderLoop();
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						latch.countDown();
					}
				}
			};
			threads[i].start();
		}

		try {
			barrier.await();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for ( int i = 0; i < windows.length; i++ )
			glfwShowWindow(windows[i].handle);

		System.out.println("GAME ON!");

		while ( latch.getCount() != 0 ) {
			glfwPollEvents();

			for ( int i = 0; i < windows.length; i++ ) {
				if ( windows[i] != null && windows[i].signal.getCount() == 0 ) {
					windows[i].destroy();
					windows[i] = null;
				}
			}
		}

		CL.destroy();
		glfwTerminate();
		errorfun.release();

		System.out.println("GAME OVER!");
	}

	private static void parseArgs(String... args) {
		for ( int i = 0; i < args.length; i++ ) {
			String arg = args[i];

			if ( arg.charAt(0) != '-' && arg.charAt(0) != '/' )
				throw new IllegalArgumentException("Invalid command-line argument: " + args[i]);

			String param = arg.substring(1);

			if ( "forceCPU".equalsIgnoreCase(param) )
				params.add("forceCPU");
			else if ( "debugGL".equalsIgnoreCase(param) )
				params.add("debugGL");
			else if ( "iterations".equalsIgnoreCase(param) ) {
				if ( args.length < i + 1 + 1 )
					throw new IllegalArgumentException("Invalid iterations argument specified.");

				try {
					maxIterations = Integer.parseInt(args[++i]);
				} catch (NumberFormatException e) {
					throw new IllegalArgumentException("Invalid number of iterations specified.");
				}
			} else if ( "res".equalsIgnoreCase(param) ) {
				if ( args.length < i + 2 + 1 )
					throw new IllegalArgumentException("Invalid res argument specified.");

				try {
					initWidth = Integer.parseInt(args[++i]);
					initHeight = Integer.parseInt(args[++i]);

					if ( initWidth < 1 || initHeight < 1 )
						throw new IllegalArgumentException("Invalid res dimensions specified.");
				} catch (NumberFormatException e) {
					throw new IllegalArgumentException("Invalid res dimensions specified.");
				}
			}
		}
	}

	private static String getOpenGLVendor() {
		long window = glfwCreateWindow(100, 100, "dummy", NULL, NULL);

		try {
			glfwMakeContextCurrent(window);
			GLContext.createFromCurrent();

			return glGetString(GL_VENDOR);
		} finally {
			glfwDestroyWindow(window);
		}
	}

	static class GLFWWindow {

		final long handle;

		final String ID;

		/** Used to signal that the rendering thread has completed. */
		final CountDownLatch signal;

		GLFWWindowSizeCallback      windowsizefun;
		GLFWFramebufferSizeCallback framebuffersizefun;
		GLFWKeyCallback             keyfun;
		GLFWMouseButtonCallback     mousebuttonfun;
		GLFWCursorPosCallback       cursorposfun;
		GLFWScrollCallback          scrollfun;

		private GLFWWindow(long handle, String ID, CountDownLatch signal) {
			this.handle = handle;
			this.ID = ID;
			this.signal = signal;
		}

		void destroy() {
			Callbacks.releaseAllCallbacks(handle);
			glfwDestroyWindow(handle);
		}

	}

}