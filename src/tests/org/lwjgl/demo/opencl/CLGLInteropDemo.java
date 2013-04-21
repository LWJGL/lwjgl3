/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opencl;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opencl.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.WindowCallback;
import org.lwjgl.system.glfw.WindowCallbackAdapter;

import java.io.*;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

import static java.lang.Math.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CL10GL.*;
import static org.lwjgl.opencl.CLUtil.*;
import static org.lwjgl.opencl.KHRGLEvent.*;
import static org.lwjgl.opencl.KHRGLSharing.*;
import static org.lwjgl.opencl.KHRICD.*;
import static org.lwjgl.opengl.AMDDebugOutput.*;
import static org.lwjgl.opengl.ARBCLEvent.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL21.*;
import static org.lwjgl.opengl.GL32.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.glfw.GLFW.*;

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

public class CLGLInteropDemo {

	// max number of used GPUs
	private static final int MAX_PARALLELISM_LEVEL = 8;

	private static final int COLOR_MAP_SIZE = 32 * 2 * 4;

	private static Set<String> params;

	// max per pixel iterations to compute the fractal
	private static int maxIterations = 500;

	private static int initWidth  = 512;
	private static int initHeight = 512;

	// ------------------

	/** The event callbacks run on the main thread. We use this queue to apply any changes in the rendering thread. */
	private final Queue<Runnable> events = new ConcurrentLinkedQueue<Runnable>();

	private int width;
	private int height;

	private final IntBuffer errcode_ret;

	private final CLPlatform platform;

	private final GLFWWindow window;

	private final GLContext context;

	private final CLContext        clContext;
	private final CLCommandQueue[] queues;
	private final CLKernel[]       kernels;
	private final CLProgram[]      programs;

	private final PointerBuffer kernel2DGlobalWorkSize;

	// ------------------

	private CLMem[]   glBuffers;
	private IntBuffer glIDs;

	private boolean useTextures;

	// Texture rendering
	private int dlist;
	private int vsh;
	private int fsh;
	private int program;

	private CLMem[] colorMap;

	private double minX = -2f;
	private double minY = -1.2f;
	private double maxX = 0.6f;
	private double maxY = 1.3f;

	private int slices;

	private boolean drawSeparator;
	private boolean doublePrecision   = true;
	private boolean shouldInitBuffers = true;
	private boolean rebuild;

	// EVENT SYNCING

	private final PointerBuffer syncBuffer = BufferUtils.createPointerBuffer(1);

	private boolean   syncGLtoCL; // true if we can make GL wait on events generated from CL queues.
	private CLEvent[] clEvents;
	private long[]    clSyncs;

	private boolean syncCLtoGL; // true if we can make CL wait on sync objects generated from GL.
	private long    glSync;
	private CLEvent glEvent;

	public CLGLInteropDemo(CLPlatform platform, GLFWWindow window, boolean forceCPU) {
		this.platform = platform;

		this.window = window;

		IntBuffer windowSize = BufferUtils.createIntBuffer(2);
		nglfwGetWindowSize(window.handle, memAddress(windowSize), memAddress(windowSize) + 4);

		width = windowSize.get(0);
		height = windowSize.get(1);

		glfwMakeContextCurrent(window.handle);
		context = GLContext.createFromCurrent();

		ContextCapabilities caps = GL.getCapabilities();

		if ( !caps.OpenGL20 )
			throw new RuntimeException("OpenGL 2.0 is required to run this demo.");

		if ( params.contains("debugGL") ) {
			/*if ( caps.GL_ARB_debug_output )
				glDebugMessageCallbackARB(new ARBDebugOutputCallback());
			else */
			if ( caps.GL_AMD_debug_output )
				glDebugMessageCallbackAMD(new DEBUGPROCAMD());
		}

		glfwSwapInterval(0);

		errcode_ret = BufferUtils.createIntBuffer(1);
		int errcode;

		try {
			// Find devices with GL sharing support
			Filter<CLDevice> glSharingFilter = new Filter<CLDevice>() {
				@Override
				public boolean accept(CLDevice device) {
					CLCapabilities caps = device.getCapabilities();
					return caps.cl_khr_gl_sharing;
				}
			};
			//int device_type = params.contains("forceCPU") ? CL_DEVICE_TYPE_CPU : CL_DEVICE_TYPE_GPU;
			int device_type = forceCPU ? CL_DEVICE_TYPE_CPU : CL_DEVICE_TYPE_GPU;
			List<CLDevice> devices = platform.getDevices(device_type, glSharingFilter);
			if ( devices == null ) {
				device_type = CL_DEVICE_TYPE_CPU;
				devices = platform.getDevices(device_type, glSharingFilter);
				if ( devices == null )
					throw new RuntimeException("No OpenCL devices found with KHR_gl_sharing support.");
			}

			PointerBuffer deviceBuffer = BufferUtils.createPointerBuffer(devices.size());
			for ( int i = 0; i < devices.size(); i++ )
				deviceBuffer.put(i, devices.get(i).getPointer());

			// Create the context
			PointerBuffer ctxProps = BufferUtils.createPointerBuffer(5)
				.put(0, CL_CONTEXT_PLATFORM)
				.put(1, platform.getPointer())
				.put(2, CL_GL_CONTEXT_KHR)
				.put(3, context.getHandle())
				.put(4, 0);

			clContext = clCreateContext(ctxProps, deviceBuffer, new CLContextCallback(), errcode_ret);
			checkCLError(errcode_ret);

			slices = min(devices.size(), MAX_PARALLELISM_LEVEL);

			// create command queues for every GPU, setup colormap and init kernels
			queues = new CLCommandQueue[slices];
			kernels = new CLKernel[slices];
			colorMap = new CLMem[slices];

			for ( int i = 0; i < slices; i++ ) {
				colorMap[i] = clCreateBuffer(clContext, CL_MEM_READ_ONLY, COLOR_MAP_SIZE, errcode_ret);
				checkCLError(errcode_ret);

				// create command queue and upload color map buffer on each used device
				queues[i] = clCreateCommandQueue(clContext, devices.get(i), 0L, errcode_ret);
				checkCLError(errcode_ret);

				ByteBuffer colorMapBuffer = clEnqueueMapBuffer(
					queues[i], colorMap[i],
					CL_TRUE, CL_MAP_WRITE,
					0L, COLOR_MAP_SIZE,
					null, null, errcode_ret, null
				);
				checkCLError(errcode_ret);

				initColorMap(colorMapBuffer.asIntBuffer(), 32, Color.BLUE, Color.GREEN, Color.RED);

				errcode = clEnqueueUnmapMemObject(queues[i], colorMap[i], colorMapBuffer, null, null);
				checkCLError(errcode);
			}

			// check if we have 64bit FP support on all devices
			// if yes we can use only one program for all devices + one kernel per device.
			// if not we will have to create (at least) one program for 32 and one for 64bit devices.
			// since there are different vendor extensions for double FP we use one program per device.
			boolean all64bit = true;
			for ( CLDevice device : devices ) {
				if ( !isDoubleFPAvailable(device) ) {
					all64bit = false;
					break;
				}
			}

			// load program(s)
			programs = new CLProgram[all64bit ? 1 : slices];

			if ( device_type == CL_DEVICE_TYPE_CPU && !caps.OpenGL21 )
				throw new RuntimeException("OpenGL 2.1 is required to run this demo.");

			if ( device_type == CL_DEVICE_TYPE_GPU )
				log("OpenCL Device Type: GPU (Use -forceCPU to use CPU)");
			else
				log("OpenCL Device Type: CPU");

			log("Max Iterations: " + maxIterations + " (Use -iterations <count> to change)");
			log("Display resolution: " + width + "x" + height + " (Use -res <width> <height> to change)");

			log("OpenGL caps.GL_ARB_sync = " + caps.GL_ARB_sync);
			log("OpenGL caps.GL_ARB_cl_event = " + caps.GL_ARB_cl_event);

			// Use PBO if we're on a CPU implementation
			useTextures = device_type == CL_DEVICE_TYPE_GPU && (!caps.OpenGL21 || !params.contains("forcePBO"));
			if ( useTextures ) {
				log("CL/GL Sharing method: TEXTURES (use -forcePBO to use PBO + DrawPixels)");
				log("Rendering method: Shader on a fullscreen quad");
			} else {
				log("CL/GL Sharing method: PIXEL BUFFER OBJECTS");
				log("Rendering method: DrawPixels");
			}

			buildPrograms();

			// Detect GLtoCL synchronization method
			syncGLtoCL = caps.GL_ARB_cl_event; // GL3.2 or ARB_sync implied
			if ( syncGLtoCL ) {
				clEvents = new CLEvent[slices];
				clSyncs = new long[slices];
				log("GL to CL sync: Using OpenCL events");
			} else
				log("GL to CL sync: Using clFinish");

			// Detect CLtoGL synchronization method
			syncCLtoGL = caps.OpenGL32 || caps.GL_ARB_sync;
			if ( syncCLtoGL ) {
				for ( CLDevice device : devices ) {
					if ( !device.getCapabilities().cl_khr_gl_event ) {
						syncCLtoGL = false;
						break;
					}
				}
			}
			if ( syncCLtoGL ) {
				log("CL to GL sync: Using OpenGL sync objects");
			} else
				log("CL to GL sync: Using glFinish");

			if ( useTextures ) {
				dlist = glGenLists(1);

				vsh = glCreateShader(GL_VERTEX_SHADER);
				glShaderSource(vsh, "varying vec2 texCoord;\n" +
				                    "\n" +
				                    "void main(void) {\n" +
				                    "\tgl_Position = ftransform();\n" +
				                    "\ttexCoord = gl_MultiTexCoord0.xy;\n" +
				                    "}");
				glCompileShader(vsh);

				fsh = glCreateShader(GL_FRAGMENT_SHADER);
				glShaderSource(fsh, "uniform sampler2D mandelbrot;\n" +
				                    "\n" +
				                    "varying vec2 texCoord;\n" +
				                    "\n" +
				                    "void main(void) {\n" +
				                    "\tgl_FragColor = texture2D(mandelbrot, texCoord);" +
				                    "}");
				glCompileShader(fsh);

				program = glCreateProgram();
				glAttachShader(program, vsh);
				glAttachShader(program, fsh);
				glLinkProgram(program);

				glUseProgram(program);
				glUniform1i(glGetUniformLocation(program, "mandelbrot"), 0);
			}
		} catch (Exception e) {
			// TODO: cleanup
			throw new RuntimeException(e);
		}

		glDisable(GL_DEPTH_TEST);
		glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

		initGLObjects();
		glFinish();

		kernel2DGlobalWorkSize = BufferUtils.createPointerBuffer(2);

		setKernelConstants();

		setupInput();
	}

	private void log(String msg) {
		System.out.println("[" + window.ID + "] " + msg);
	}

	public static void main(String... args) {
		parseArgs(args);

		CL.create();

		// Skip Intel in case there's a platform with a discrete GPU available.
		List<CLPlatform> platforms = CLPlatform.getPlatforms(new Filter<CLPlatform>() {
			@Override
			public boolean accept(CLPlatform platform) {
				return platform.getCapabilities().cl_khr_gl_sharing && !platform.getInfoStringUTF8(CL_PLATFORM_VENDOR).startsWith("Intel");
			}
		});

		if ( platforms.isEmpty() ) {
			// Nope, try Intel.
			platforms = CLPlatform.getPlatforms(new Filter<CLPlatform>() {
				@Override
				public boolean accept(CLPlatform platform) {
					return platform.getCapabilities().cl_khr_gl_sharing;
				}
			});
		}

		if ( platforms.isEmpty() )
			throw new IllegalStateException("No OpenCL platforms found that support KHR_gl_sharing.");

		if ( glfwInit() != GL11.GL_TRUE ) {
			System.out.println("Unable to initialize glfw");
			System.exit(-1);
		}

		glfwSetErrorCallback(new ErrorCallback());
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);

		Thread[] threads = new Thread[platforms.size() * 2];
		GLFWWindow[] windows = new GLFWWindow[threads.length];

		final CountDownLatch latch = new CountDownLatch(windows.length);
		final CyclicBarrier barrier = new CyclicBarrier(windows.length + 1);

		for ( int i = 0; i < threads.length; i++ ) {
			final CLPlatform platform = platforms.get(0);

			String platformID;
			if ( platform.getCapabilities().cl_khr_icd )
				platformID = platform.getInfoStringASCII(CL_PLATFORM_ICD_SUFFIX_KHR); // less spammy
			else
				platformID = platform.getInfoStringUTF8(CL_PLATFORM_VENDOR);
			platformID += " - " + ((i & 1) == 1 ? "CPU" : "GPU");

			final GLFWWindow window = new GLFWWindow(
				glfwCreateWindow(initWidth, initHeight, platformID, 0L, 0L),
				platformID,
				new CountDownLatch(1)
			);
			glfwSetWindowPos(window.handle, 200 + initWidth * i + 32 * i, 200);

			final int index = i;
			windows[i] = window;
			threads[i] = new Thread(platformID) {
				@Override
				public void run() {
					CLGLInteropDemo demo = null;
					try {
						demo = new CLGLInteropDemo(platform, window, (index & 1) == 1);
					} catch (Exception e) {
						e.printStackTrace();
					}

					try {
						barrier.await();
						if ( demo != null )
							demo.run();
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
				if ( windows[i] == null )
					continue;

				if ( windows[i].signal.getCount() == 0 ) {
					glfwDestroyWindow(windows[i].handle);
					windows[i] = null;
				}
			}
		}

		CL.destroy();
		System.out.println("GAME OVER!");
	}

	private static void parseArgs(String... args) {
		params = new HashSet<String>(8);

		for ( int i = 0; i < args.length; i++ ) {
			String arg = args[i];

			if ( arg.charAt(0) != '-' && arg.charAt(0) != '/' )
				throw new IllegalArgumentException("Invalid command-line argument: " + args[i]);

			String param = arg.substring(1);

			if ( "forcePBO".equalsIgnoreCase(param) )
				params.add("forcePBO");
			else if ( "forceCPU".equalsIgnoreCase(param) )
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

	private void buildPrograms() {
		try {
			createPrograms();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		// disable 64bit floating point math if not available
		for ( int i = 0; i < programs.length; i++ ) {
			CLDevice device = queues[i].getParent();

			StringBuilder options = new StringBuilder(useTextures ? "-D USE_TEXTURE" : "");
			CLCapabilities caps = device.getCapabilities();
			if ( doublePrecision && isDoubleFPAvailable(device) ) {
				//cl_khr_fp64
				options.append(" -D DOUBLE_FP");

				// AMD's verson of double precision floating point math
				if ( !caps.cl_khr_fp64 && caps.cl_amd_fp64 )
					options.append(" -D AMD_FP");
			}

			log("OpenCL COMPILER OPTIONS: " + options);

			try {
				int errcode = clBuildProgram(programs[i], device, options, null);
				checkCLError(errcode);
			} finally {
				log("BUILD LOG: " + programs[i].getBuildInfoString(device, CL_PROGRAM_BUILD_LOG));
			}
		}

		rebuild = false;

		// init kernel with constants
		for ( int i = 0; i < kernels.length; i++ ) {
			kernels[i] = clCreateKernel(programs[min(i, programs.length)], "mandelbrot", errcode_ret);
			checkCLError(errcode_ret);
		}
	}

	private void initGLObjects() {
		if ( glBuffers == null ) {
			glBuffers = new CLMem[slices];
			glIDs = BufferUtils.createIntBuffer(slices);
		} else {
			for ( CLMem mem : glBuffers ) {
				int errcode = clReleaseMemObject(mem);
				checkCLError(errcode);
			}

			if ( useTextures )
				glDeleteTextures(glIDs);
			else
				glDeleteBuffers(glIDs);
		}

		if ( useTextures ) {
			glNewList(dlist, GL_COMPILE);
			glBegin(GL_QUADS);
			{
				glTexCoord2f(0.0f, 0.0f);
				glVertex2f(0, 0);

				glTexCoord2f(0.0f, 1.0f);
				glVertex2i(0, height);

				glTexCoord2f(1.0f, 1.0f);
				glVertex2f(width, height);

				glTexCoord2f(1.0f, 0.0f);
				glVertex2f(width, 0);
			}
			glEnd();
			glEndList();

			glGenTextures(glIDs);

			// Init textures
			for ( int i = 0; i < slices; i++ ) {
				glBindTexture(GL_TEXTURE_2D, glIDs.get(i));
				glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, width / slices, height, 0, GL_RGBA, GL_UNSIGNED_BYTE, (ByteBuffer)null);
				glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
				glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);

				glBuffers[i] = clCreateFromGLTexture2D(clContext, CL_MEM_WRITE_ONLY, GL_TEXTURE_2D, 0, glIDs.get(i), errcode_ret);
				checkCLError(errcode_ret);
			}
			glBindTexture(GL_TEXTURE_2D, 0);
		} else {
			glGenBuffers(glIDs);

			// setup one empty PBO per slice
			for ( int i = 0; i < slices; i++ ) {
				glBindBuffer(GL_PIXEL_UNPACK_BUFFER, glIDs.get(i));
				glBufferData(GL_PIXEL_UNPACK_BUFFER, width * height * 4 / slices, GL_STREAM_DRAW);

				glBuffers[i] = clCreateFromGLBuffer(clContext, CL_MEM_WRITE_ONLY, glIDs.get(i), errcode_ret);
				checkCLError(errcode_ret);
			}
			glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 0);
		}

		glViewport(0, 0, width, height);

		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0.0, width, 0.0, height, 0.0, 1.0);

		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();

		shouldInitBuffers = false;
	}

	// init kernels with constants

	private void setKernelConstants() {
		for ( int i = 0; i < slices; i++ ) {
			kernels[i]
				.setArg(6, glBuffers[i])
				.setArg(7, colorMap[i])
				.setArg(8, COLOR_MAP_SIZE)
				.setArg(9, maxIterations);
		}
	}

	// rendering cycle

	private void run() {
		long startTime = System.currentTimeMillis() + 5000;
		long fps = 0;

		while ( glfwWindowShouldClose(window.handle) == GL_FALSE ) {
			Runnable event;
			while ( (event = events.poll()) != null )
				event.run();

			display();

			glfwSwapBuffers(window.handle);

			if ( startTime > System.currentTimeMillis() ) {
				fps++;
			} else {
				long timeUsed = 5000 + (startTime - System.currentTimeMillis());
				startTime = System.currentTimeMillis() + 5000;
				log(platform.getInfoStringUTF8(CL_PLATFORM_VENDOR) + ": " + fps + " frames in 5 seconds = " + (fps / (timeUsed / 1000f)));
				fps = 0;
			}
		}

		// TODO: more CL cleanup
		int errcode = clReleaseContext(clContext);
		checkCLError(errcode);

		if ( useTextures ) {
			glDeleteProgram(program);
			glDeleteShader(fsh);
			glDeleteShader(vsh);

			glDeleteLists(dlist, 1);
		}

		window.signal.countDown();
	}

	public void display() {
		// make sure GL does not use our objects before we start computing
		if ( syncCLtoGL && glEvent != null ) {
			for ( CLCommandQueue queue : queues ) {
				int errcode = clEnqueueWaitForEvents(queue, glEvent);
				checkCLError(errcode);

				errcode = clReleaseEvent(glEvent);
				checkCLError(errcode);

				glDeleteSync(glSync);
			}
		} else
			glFinish();

		if ( shouldInitBuffers ) {
			initGLObjects();
			setKernelConstants();
		}

		if ( rebuild ) {
			buildPrograms();
			setKernelConstants();
		}
		compute(doublePrecision);

		render();
	}

	// OpenCL

	private void compute(boolean is64bit) {
		int sliceWidth = (int)(width / (float)slices);
		double rangeX = (maxX - minX) / slices;
		double rangeY = (maxY - minY);

		kernel2DGlobalWorkSize.put(0, sliceWidth).put(1, height);

		// start computation
		for ( int i = 0; i < slices; i++ ) {
			kernels[i].setArg(0, sliceWidth).setArg(1, height);
			if ( !is64bit || !isDoubleFPAvailable(queues[i].getParent()) ) {
				kernels[i]
					.setArg(2, (float)(minX + rangeX * i)).setArg(3, (float)minY)
					.setArg(4, (float)rangeX).setArg(5, (float)rangeY);
			} else {
				kernels[i]
					.setArg(2, minX + rangeX * i).setArg(3, minY)
					.setArg(4, rangeX).setArg(5, rangeY);
			}

			// acquire GL objects, and enqueue a kernel with a probe from the list
			int errcode = clEnqueueAcquireGLObjects(queues[i], glBuffers[i], null, null);
			checkCLError(errcode);

			errcode = clEnqueueNDRangeKernel(queues[i], kernels[i], 2,
			                                 null,
			                                 kernel2DGlobalWorkSize,
			                                 null,
			                                 null, null);
			checkCLError(errcode);

			errcode = clEnqueueReleaseGLObjects(queues[i], glBuffers[i], null, syncGLtoCL ? syncBuffer : null);
			checkCLError(errcode);

			if ( syncGLtoCL ) {
				clEvents[i] = CLEvent.create(syncBuffer.get(0), clContext);
				clSyncs[i] = glCreateSyncFromCLeventARB(clContext, clEvents[i], 0);
			}
		}

		// block until done (important: finish before doing further gl work)
		if ( !syncGLtoCL ) {
			for ( int i = 0; i < slices; i++ ) {
				int errcode = clFinish(queues[i]);
				checkCLError(errcode);
			}
		}
	}

	// OpenGL

	private void render() {
		glClear(GL_COLOR_BUFFER_BIT);

		if ( syncGLtoCL ) {
			for ( int i = 0; i < slices; i++ ) {
				glWaitSync(clSyncs[i], 0, 0);
				glDeleteSync(clSyncs[i]);

				int errcode = clReleaseEvent(clEvents[i]);
				checkCLError(errcode);
			}
		}

		//draw slices
		int sliceWidth = width / slices;

		if ( useTextures ) {
			for ( int i = 0; i < slices; i++ ) {
				int seperatorOffset = drawSeparator ? i : 0;

				glBindTexture(GL_TEXTURE_2D, glIDs.get(i));
				glCallList(dlist);
			}
		} else {
			for ( int i = 0; i < slices; i++ ) {
				int seperatorOffset = drawSeparator ? i : 0;

				glBindBuffer(GL_PIXEL_UNPACK_BUFFER, glIDs.get(i));
				glRasterPos2i(sliceWidth * i + seperatorOffset, 0);

				glDrawPixels(sliceWidth, height, GL_RGBA, GL_UNSIGNED_BYTE, 0);
			}
			glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 0);
		}

		if ( syncCLtoGL ) {
			glSync = glFenceSync(GL_SYNC_GPU_COMMANDS_COMPLETE, 0);
			glEvent = clCreateEventFromGLsyncKHR(clContext, glSync, errcode_ret);
			checkCLError(errcode_ret);
		}

		//draw info text
		/*
		textRenderer.beginRendering(width, height, false);

		textRenderer.draw("device/time/precision", 10, height - 15);

		for ( int i = 0; i < slices; i++ ) {
			CLDevice device = queues[i].getDevice();
			boolean doubleFP = doublePrecision && isDoubleFPAvailable(device);
			CLEvent event = probes.getEvent(i);
			long start = event.getProfilingInfo(START);
			long end = event.getProfilingInfo(END);
			textRenderer.draw(device.getType().toString() + i + " "
			                  + (int)((end - start) / 1000000.0f) + "ms @"
			                  + (doubleFP ? "64bit" : "32bit"), 10, height - (20 + 16 * (slices - i)));
		}

		textRenderer.endRendering();
		*/
	}

	private void setupInput() {
		WindowCallback.set(window.handle, new WindowCallbackAdapter() {
			private boolean ctrlDown;

			private boolean dragging;
			private double dragX;
			private double dragY;
			private double dragMinX;
			private double dragMinY;
			private double dragMaxX;
			private double dragMaxY;

			private double mouseX;
			private double mouseY;

			@Override
			public void windowSize(long window, final int width, final int height) {
				events.add(new Runnable() {
					@Override
					public void run() {
						CLGLInteropDemo.this.width = width;
						CLGLInteropDemo.this.height = height;

						shouldInitBuffers = true;
					}
				});
			}

			@Override
			public void key(long window, int key, int action) {
				switch ( key ) {
					case GLFW_KEY_LEFT_CONTROL:
					case GLFW_KEY_RIGHT_CONTROL:
						ctrlDown = action == GLFW_PRESS;
						return;
				}

				if ( action != GLFW_PRESS )
					return;

				if ( GLFW_KEY_1 <= key && key <= GLFW_KEY_8 ) {
					final int number = key - GLFW_KEY_1 + 1;
					events.offer(new Runnable() {
						@Override
						public void run() {
							slices = min(number, min(queues.length, MAX_PARALLELISM_LEVEL));
							log("NEW PARALLELISM LEVEL: " + slices);
							shouldInitBuffers = true;
						}
					});
				} else {
					switch ( key ) {
						case GLFW_KEY_SPACE:
							events.offer(new Runnable() {
								@Override
								public void run() {
									drawSeparator = !drawSeparator;
									log("SEPARATOR DRAWING IS NOW: " + (drawSeparator ? "ON" : "OFF"));
								}
							});
							break;
						case GLFW_KEY_D:
							events.offer(new Runnable() {
								@Override
								public void run() {
									doublePrecision = !doublePrecision;
									log("DOUBLE PRECISION IS NOW: " + (doublePrecision ? "ON" : "OFF"));
									rebuild = true;
								}
							});
							break;
						case GLFW_KEY_HOME:
							events.offer(new Runnable() {
								@Override
								public void run() {
									minX = -2f;
									minY = -1.2f;
									maxX = 0.6f;
									maxY = 1.3f;
								}
							});
							break;
					}
				}
			}

			@Override
			public void mouseButton(long window, int button, int action) {
				if ( button != GLFW_MOUSE_BUTTON_LEFT )
					return;

				dragging = action == GLFW_PRESS;

				if ( dragging ) {
					dragging = true;

					dragX = mouseX;
					dragY = mouseY;

					dragMinX = minX;
					dragMinY = minY;
					dragMaxX = maxX;
					dragMaxY = maxY;
				}
			}

			@Override
			public void cursorPos(long window, double xpos, double ypos) {
				mouseX = xpos;
				mouseY = height - ypos;

				if ( dragging ) {
					double offsetX = (mouseX - dragX) * (maxX - minX) / width;
					double offsetY = (mouseY - dragY) * (maxY - minY) / height;

					minX = dragMinX - offsetX;
					minY = dragMinY - offsetY;

					maxX = dragMaxX - offsetX;
					maxY = dragMaxY - offsetY;
				}
			}

			@Override
			public void scroll(long window, double xpos, double ypos) {
				if ( ypos != 0 ) {
					double scaleFactor = ctrlDown ? 0.25 : 0.05;
					double scale = ypos > 0 ? scaleFactor : -scaleFactor;

					double deltaX = scale * (maxX - minX);
					double deltaY = scale * (maxY - minY);

					if ( 0 < deltaX && deltaX < 1e-10 || 0 < deltaY && deltaY < 1e-10 )
						return;

					// offset for "zoom to cursor"
					double offsetX = (mouseX / (double)width - 0.5) * deltaX * 2.0;
					double offsetY = (mouseY / (double)height - 0.5) * deltaY * 2.0;

					minX += deltaX + offsetX;
					minY += deltaY + offsetY;

					maxX += -deltaX + offsetX;
					maxY += -deltaY + offsetY;
				}
			}
		});
	}

	private static boolean isDoubleFPAvailable(CLDevice device) {
		CLCapabilities caps = device.getCapabilities();
		return caps.cl_khr_fp64 || caps.cl_amd_fp64;
	}

	private void createPrograms() throws IOException {
		String source = getProgramSource("demo/Mandelbrot.cl");
		for ( int i = 0; i < programs.length; i++ ) {
			if ( programs[i] != null ) {
				int errcode = clReleaseProgram(programs[i]);
				checkCLError(errcode);
			}

			programs[i] = clCreateProgramWithSource(clContext, source, errcode_ret);
			checkCLError(errcode_ret);
		}
	}

	private static String getProgramSource(String file) throws IOException {
		URL sourceURL = Thread.currentThread().getContextClassLoader().getResource(file);
		if ( sourceURL == null )
			throw new FileNotFoundException(file);

		InputStream source = sourceURL.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(source));

		StringBuilder sb = new StringBuilder(4 * 1024);
		String line;
		try {
			while ( (line = reader.readLine()) != null )
				sb.append(line).append("\n");
		} finally {
			source.close();
		}

		return sb.toString();
	}

	private static class GLFWWindow {

		final long handle;

		final String ID;

		/** Used to signal that the rendering thread has completed. */
		final CountDownLatch signal;

		private GLFWWindow(long handle, String ID, CountDownLatch signal) {
			this.handle = handle;
			this.ID = ID;
			this.signal = signal;
		}

	}

	private static enum Color {

		RED(255, 0, 0),
		GREEN(0, 255, 0),
		BLUE(0, 0, 255);

		final int red;
		final int green;
		final int blue;

		Color(int red, int green, int blue) {
			this.red = red;
			this.green = green;
			this.blue = blue;
		}

		private int getRed() {
			return red;
		}

		private int getGreen() {
			return green;
		}

		private int getBlue() {
			return blue;
		}

	}

	private static void initColorMap(IntBuffer colorMap, int stepSize, Color... colors) {
		for ( int n = 0; n < colors.length - 1; n++ ) {
			Color color = colors[n];
			int r0 = color.getRed();
			int g0 = color.getGreen();
			int b0 = color.getBlue();

			color = colors[n + 1];
			int r1 = color.getRed();
			int g1 = color.getGreen();
			int b1 = color.getBlue();

			int deltaR = r1 - r0;
			int deltaG = g1 - g0;
			int deltaB = b1 - b0;

			for ( int step = 0; step < stepSize; step++ ) {
				float alpha = (float)step / (stepSize - 1);
				int r = (int)(r0 + alpha * deltaR);
				int g = (int)(g0 + alpha * deltaG);
				int b = (int)(b0 + alpha * deltaB);
				colorMap.put((r << 0) | (g << 8) | (b << 16));
			}
		}
	}

}