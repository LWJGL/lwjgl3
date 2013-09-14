/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opencl;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.Platform;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opencl.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.WindowCallback;
import org.lwjgl.system.glfw.WindowCallbackAdapter;

import java.io.*;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
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
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL32.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.glfw.GLFW.*;
import static org.lwjgl.system.macosx.CGL.*;

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

	private final PointerBuffer kernel2DGlobalWorkSize = BufferUtils.createPointerBuffer(2);

	// ------------------

	private CLMem[]   glBuffers;
	private IntBuffer glIDs;

	// Texture rendering
	private int vao;
	private int vbo;
	private int vsh;
	private int fsh;
	private int program;

	private int projectionUniform;
	private int sizeUniform;
	private int offsetUniform;

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
	private CLEvent[] clEvent;
	private long[]    fenceFromEvent;

	private boolean syncCLtoGL; // true if we can make CL wait on sync objects generated from GL.
	private long    glFence;
	private CLEvent eventFromFence;

	public CLGLInteropDemo(CLPlatform platform, GLFWWindow window, int deviceType) {
		this.platform = platform;

		this.window = window;

		IntBuffer windowSize = BufferUtils.createIntBuffer(2);
		nglfwGetWindowSize(window.handle, memAddress(windowSize), memAddress(windowSize) + 4);

		width = windowSize.get(0);
		height = windowSize.get(1);

		glfwMakeContextCurrent(window.handle);
		context = GLContext.createFromCurrent();

		ContextCapabilities caps = GL.getCapabilities();

		if ( !caps.OpenGL32 )
			throw new RuntimeException("OpenGL 3.2 is required to run this demo.");

		if ( params.contains("debugGL") ) {
			/*if ( caps.GL_ARB_debug_output )
				glDebugMessageCallbackARB(new ARBDebugOutputCallback());
			else */
			if ( caps.GL_AMD_debug_output )
				glDebugMessageCallbackAMD(DEBUGPROCAMD.Util.getDefault());
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
					return caps.cl_khr_gl_sharing || caps.cl_APPLE_gl_sharing;
				}
			};
			List<CLDevice> devices = platform.getDevices(deviceType, glSharingFilter);
			if ( devices == null ) {
				deviceType = CL_DEVICE_TYPE_CPU;
				devices = platform.getDevices(deviceType, glSharingFilter);
				if ( devices == null )
					throw new RuntimeException("No OpenCL devices found with KHR_gl_sharing support.");
			}

			PointerBuffer deviceBuffer = BufferUtils.createPointerBuffer(devices.size());
			for ( int i = 0; i < devices.size(); i++ )
				deviceBuffer.put(i, devices.get(i).getPointer());

			// Create the context
			PointerBuffer ctxProps = BufferUtils.createPointerBuffer(5)
				.put(0, CL_CONTEXT_PLATFORM)
				.put(1, platform.getPointer());

			boolean useAPPLEGLSharing = false;
			for ( CLDevice device : devices ) {
				if ( !device.getCapabilities().cl_khr_gl_sharing ) {
					useAPPLEGLSharing = true;
					break;
				}
			}

			if ( useAPPLEGLSharing ) {
				ctxProps
					.put(2, APPLEGLSharing.CL_CONTEXT_PROPERTY_USE_CGL_SHAREGROUP_APPLE)
					.put(3, CGLGetShareGroup(context.getHandle()));
			} else {
				ctxProps
					.put(2, CL_GL_CONTEXT_KHR)
					.put(3, context.getHandle());
			}

			ctxProps.put(4, 0);

			clContext = clCreateContext(ctxProps, deviceBuffer, CLContextCallback.Util.getDefault(), errcode_ret);
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

			if ( deviceType == CL_DEVICE_TYPE_GPU )
				log("OpenCL Device Type: GPU (Use -forceCPU to use CPU)");
			else
				log("OpenCL Device Type: CPU");

			log("Max Iterations: " + maxIterations + " (Use -iterations <count> to change)");
			log("Display resolution: " + width + "x" + height + " (Use -res <width> <height> to change)");

			log("OpenGL caps.GL_ARB_sync = " + caps.GL_ARB_sync);
			log("OpenGL caps.GL_ARB_cl_event = " + caps.GL_ARB_cl_event);

			buildPrograms();

			// Detect GLtoCL synchronization method
			syncGLtoCL = caps.GL_ARB_cl_event; // GL3.2 or ARB_sync implied
			if ( syncGLtoCL ) {
				clEvent = new CLEvent[slices];
				fenceFromEvent = new long[slices];
				log("GL to CL sync: Using OpenCL events");
			} else
				log("GL to CL sync: Using clFinish");

			// Detect CLtoGL synchronization method
			/*
				NOTE: We do not have to explicitly synchronize if cl_khr_gl_event is exposed, because it modifies the behavior of clEnqueueAcquireGLObjects
				and clEnqueueReleaseGLObjects to implicitly guarantee synchronization with an OpenGL context bound in the same thread as the OpenCL context.
				For this demo we do it anyway, for demostration purposes.
			*/
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

			vao = glGenVertexArrays();
			glBindVertexArray(vao);

			vbo = glGenBuffers();
			glBindBuffer(GL_ARRAY_BUFFER, vbo);

			FloatBuffer quad = BufferUtils.createFloatBuffer(4 * 4).put(new float[] {
				0.0f, 0.0f, 0.0f, 0.0f,
				1.0f, 0.0f, 1.0f, 0.0f,
				0.0f, 1.0f, 0.0f, 1.0f,
				1.0f, 1.0f, 1.0f, 1.0f,
			});
			quad.flip();
			glBufferData(GL_ARRAY_BUFFER, quad, GL_STATIC_DRAW);

			vsh = glCreateShader(GL_VERTEX_SHADER);
			glShaderSource(vsh, "#version 150\n" +
			                    "\n" +
			                    "uniform mat4 projection;\n" +
			                    "\n" +
			                    "uniform vec2 size;\n" +
			                    "uniform vec2 offset;\n" +
			                    "\n" +
			                    "in vec2 posIN;\n" +
			                    "in vec2 texIN;\n" +
			                    "\n" +
			                    "out vec2 texCoord;\n" +
			                    "\n" +
			                    "void main(void) {\n" +
			                    "\tgl_Position = projection * vec4((posIN + offset) * size, 0.0, 1.0);\n" +
			                    "\ttexCoord = texIN;\n" +
			                    "}");
			glCompileShader(vsh);
			String log = glGetShaderInfoLog(vsh, glGetShaderi(vsh, GL_INFO_LOG_LENGTH));
			if ( !log.isEmpty() )
				System.out.println("VERTEX SHADER LOG: " + log);

			fsh = glCreateShader(GL_FRAGMENT_SHADER);
			glShaderSource(fsh, "#version 150\n" +
			                    "\n" +
			                    "uniform isampler2D mandelbrot;\n" +
			                    "\n" +
			                    "in vec2 texCoord;\n" +
			                    "\n" +
			                    "out vec4 fragColor;\n" +
			                    "\n" +
			                    "void main(void) {\n" +
			                    "\tfragColor = texture(mandelbrot, texCoord) / 255.0;\n" +
			                    "}");
			glCompileShader(fsh);
			log = glGetShaderInfoLog(fsh, glGetShaderi(fsh, GL_INFO_LOG_LENGTH));
			if ( !log.isEmpty() )
				System.out.println("FRAGMENT SHADER LOG: " + log);

			program = glCreateProgram();
			glAttachShader(program, vsh);
			glAttachShader(program, fsh);
			glLinkProgram(program);
			log = glGetProgramInfoLog(program, glGetProgrami(program, GL_INFO_LOG_LENGTH));
			if ( !log.isEmpty() )
				System.out.println("PROGRAM LOG: " + log);

			int posIN = glGetAttribLocation(program, "posIN");
			int texIN = glGetAttribLocation(program, "texIN");

			glVertexAttribPointer(posIN, 2, GL_FLOAT, false, 4 * 4, 0);
			glVertexAttribPointer(texIN, 2, GL_FLOAT, false, 4 * 4, 2 * 4);

			glEnableVertexAttribArray(posIN);
			glEnableVertexAttribArray(texIN);

			projectionUniform = glGetUniformLocation(program, "projection");
			sizeUniform = glGetUniformLocation(program, "size");
			offsetUniform = glGetUniformLocation(program, "offset");

			glUseProgram(program);

			glUniform1i(glGetUniformLocation(program, "mandelbrot"), 0);
		} catch (Exception e) {
			// TODO: cleanup
			throw new RuntimeException(e);
		}

		glDisable(GL_DEPTH_TEST);
		glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

		initGLObjects();
		glFinish();

		setKernelConstants();

		setupInput();
	}

	private void log(String msg) {
		System.out.println("[" + window.ID + "] " + msg);
	}

	public static void main(String... args) {
		parseArgs(args);

		CL.create();

		final Filter<CLPlatform> platformFilter = new Filter<CLPlatform>() {
			@Override
			public boolean accept(CLPlatform platform) {
				CLCapabilities caps = platform.getCapabilities();
				return caps.cl_khr_gl_sharing || caps.cl_APPLE_gl_sharing;
			}
		};

		// Skip Intel in case there's a platform with a discrete GPU available.
		List<CLPlatform> platforms = CLPlatform.getPlatforms(new Filter<CLPlatform>() {
			@Override
			public boolean accept(CLPlatform platform) {
				return platformFilter.accept(platform) && !platform.getInfoStringUTF8(CL_PLATFORM_VENDOR).startsWith("Intel");
			}
		});

		if ( platforms.isEmpty() ) {
			// Nope, try Intel.
			platforms = CLPlatform.getPlatforms(platformFilter);
		}

		if ( platforms.isEmpty() )
			throw new IllegalStateException("No OpenCL platforms found that support KHR_gl_sharing.");

		if ( glfwInit() != GL11.GL_TRUE ) {
			System.out.println("Unable to initialize glfw");
			System.exit(-1);
		}

		glfwSetErrorCallback(ErrorCallback.Util.getDefault());
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);
		glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
		glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GL_TRUE);
		if ( params.contains("debugGL") )
			glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GL_TRUE);

		final CLPlatform platform = platforms.get(0);

		String platformID;
		if ( platform.getCapabilities().cl_khr_icd )
			platformID = platform.getInfoStringASCII(CL_PLATFORM_ICD_SUFFIX_KHR); // less spammy
		else
			platformID = platform.getInfoStringUTF8(CL_PLATFORM_VENDOR);

		boolean hasCPU = false;
		boolean hasGPU = false;
		for ( CLDevice device : platform.getDevices(CL_DEVICE_TYPE_ALL) ) {
			long type = device.getInfoLong(CL_DEVICE_TYPE);
			if ( type == CL_DEVICE_TYPE_CPU )
				hasCPU = true;
			else if ( type == CL_DEVICE_TYPE_GPU )
				hasGPU = true;
		}

		Thread[] threads = new Thread[platforms.size() * (hasCPU && hasGPU ? 2 : 1)];
		GLFWWindow[] windows = new GLFWWindow[threads.length];

		final CountDownLatch latch = new CountDownLatch(windows.length);
		final CyclicBarrier barrier = new CyclicBarrier(windows.length + 1);

		for ( int i = 0; i < threads.length; i++ ) {
			final int deviceType = i == 1 || !hasGPU ? CL_DEVICE_TYPE_CPU : CL_DEVICE_TYPE_GPU;

			String ID = platformID + " - " + (deviceType == CL_DEVICE_TYPE_CPU ? "CPU" : "GPU");
			final GLFWWindow window = new GLFWWindow(glfwCreateWindow(initWidth, initHeight, ID, 0L, 0L), ID, new CountDownLatch(1));
			glfwSetWindowPos(window.handle, 200 + initWidth * i + 32 * i, 200);

			windows[i] = window;
			threads[i] = new Thread(platformID) {
				@Override
				public void run() {
					CLGLInteropDemo demo = null;
					try {
						demo = new CLGLInteropDemo(platform, window, deviceType);
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

	private void buildPrograms() {
		try {
			createPrograms();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		// disable 64bit floating point math if not available
		for ( int i = 0; i < programs.length; i++ ) {
			final CLDevice device = queues[i].getParent();

			StringBuilder options = new StringBuilder("-D USE_TEXTURE");
			CLCapabilities caps = device.getCapabilities();
			if ( doublePrecision && isDoubleFPAvailable(device) ) {
				//cl_khr_fp64
				options.append(" -D DOUBLE_FP");

				// AMD's verson of double precision floating point math
				if ( !caps.cl_khr_fp64 && caps.cl_amd_fp64 )
					options.append(" -D AMD_FP");
			}

			log("OpenCL COMPILER OPTIONS: " + options);

			final CLProgram program = programs[i];
			int errcode = clBuildProgram(program, device, options, new CLProgramCallback() {
				@Override
				public void invoke(long cl_program) {
					System.out.printf(
						"The cl_program [0x%X] was built %s\n",
						cl_program,
						program.getBuildInfoInt(device, CL_PROGRAM_BUILD_STATUS) == CL_SUCCESS ? "successfully" : "unsuccessfully"
					);
					String log = program.getBuildInfoString(device, CL_PROGRAM_BUILD_LOG);
					if ( !log.isEmpty() )
						System.out.printf("\tBUILD LOG: %s\n", log);
				}
			});
			checkCLError(errcode);
		}

		// Make sure the programs have been built before proceeding
		for ( CLCommandQueue queue : queues )
			clFinish(queue);

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

			glDeleteTextures(glIDs);
		}

		glGenTextures(glIDs);

		// Init textures
		for ( int i = 0; i < slices; i++ ) {
			glBindTexture(GL_TEXTURE_2D, glIDs.get(i));
			glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA8UI, width / slices, height, 0, GL_RGBA_INTEGER, GL_UNSIGNED_BYTE, (ByteBuffer)null);

			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);

			glBuffers[i] = clCreateFromGLTexture2D(clContext, CL_MEM_WRITE_ONLY, GL_TEXTURE_2D, 0, glIDs.get(i), errcode_ret);
			checkCLError(errcode_ret);
		}
		glBindTexture(GL_TEXTURE_2D, 0);

		glViewport(0, 0, width, height);

		glUniform2f(sizeUniform, width / slices, height);

		FloatBuffer projectionMatrix = BufferUtils.createFloatBuffer(4 * 4);
		glOrtho(0.0f, width, 0.0f, height, 0.0f, 1.0f, projectionMatrix);
		glUniformMatrix4(projectionUniform, false, projectionMatrix);

		shouldInitBuffers = false;
	}

	public static void glOrtho(float l, float r, float b, float t, float n, float f, FloatBuffer m) {
		m.put(new float[] {
			1.0f, 0.0f, 0.0f, 0.0f,
			0.0f, 1.0f, 0.0f, 0.0f,
			0.0f, 0.0f, 1.0f, 0.0f,
			0.0f, 0.0f, 0.0f, 1.0f,
		});
		m.flip();

		m.put(0 * 4 + 0, 2.0f / (r - l));
		m.put(1 * 4 + 1, 2.0f / (t - b));
		m.put(2 * 4 + 2, -2.0f / (f - n));

		m.put(3 * 4 + 0, -(r + l) / (r - l));
		m.put(3 * 4 + 1, -(t + b) / (t - b));
		m.put(3 * 4 + 2, -(f + n) / (f - n));
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

	private void renderLoop() {
		long startTime = System.currentTimeMillis() + 5000;
		long fps = 0;

		while ( glfwWindowShouldClose(window.handle) == GL_FALSE ) {
			Runnable event;
			while ( (event = events.poll()) != null )
				event.run();

			try {
				display();
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}

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

		glDeleteProgram(program);
		glDeleteShader(fsh);
		glDeleteShader(vsh);
		glDeleteBuffers(vbo);
		glDeleteVertexArrays(vao);

		window.signal.countDown();
	}

	public void display() {
		// make sure GL does not use our objects before we start computing
		if ( eventFromFence == null || shouldInitBuffers )
			glFinish();

		if ( shouldInitBuffers ) {
			initGLObjects();
			setKernelConstants();
		}

		if ( rebuild ) {
			buildPrograms();
			setKernelConstants();
		}
		computeCL(doublePrecision);

		try {
			if ( LWJGLUtil.getPlatform() == Platform.MACOSX )
				CGLLockContext(context.getHandle());

			renderGL();
		} finally {
			if ( LWJGLUtil.getPlatform() == Platform.MACOSX )
				CGLUnlockContext(context.getHandle());
		}
	}

	// OpenCL

	private void computeCL(boolean is64bit) {
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

			if ( eventFromFence != null )
				syncBuffer.put(0, eventFromFence.getPointer());

			// acquire GL objects, and enqueue a kernel with a probe from the list
			int errcode = clEnqueueAcquireGLObjects(queues[i], glBuffers[i], eventFromFence != null ? syncBuffer : null, null);
			checkCLError(errcode);

			if ( eventFromFence != null ) {
				errcode = clReleaseEvent(eventFromFence);
				checkCLError(errcode);

				glDeleteSync(glFence);
			}

			errcode = clEnqueueNDRangeKernel(queues[i], kernels[i], 2,
			                                 null,
			                                 kernel2DGlobalWorkSize,
			                                 null,
			                                 null, null);
			checkCLError(errcode);

			errcode = clEnqueueReleaseGLObjects(queues[i], glBuffers[i], null, syncGLtoCL ? syncBuffer : null);
			checkCLError(errcode);

			if ( syncGLtoCL ) {
				clEvent[i] = CLEvent.create(syncBuffer.get(0), clContext);
				fenceFromEvent[i] = glCreateSyncFromCLeventARB(clContext, clEvent[i], 0);
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

	private void renderGL() {
		glClear(GL_COLOR_BUFFER_BIT);

		//draw slices
		int sliceWidth = width / slices;

		for ( int i = 0; i < slices; i++ ) {
			glUniform2f(offsetUniform, i * sliceWidth, 0.0f);

			if ( syncGLtoCL ) {
				glWaitSync(fenceFromEvent[i], 0, 0);
				glDeleteSync(fenceFromEvent[i]);

				int errcode = clReleaseEvent(clEvent[i]);
				checkCLError(errcode);
			}

			glBindTexture(GL_TEXTURE_2D, glIDs.get(i));
			glDrawArrays(GL_TRIANGLE_STRIP, 0, 4);
		}

		if ( syncCLtoGL ) {
			glFence = glFenceSync(GL_SYNC_GPU_COMMANDS_COMPLETE, 0);
			eventFromFence = clCreateEventFromGLsyncKHR(clContext, glFence, errcode_ret);
			checkCLError(errcode_ret);
		}
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
				if ( width == 0 || height == 0 )
					return;

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
			public void key(long window, int key, int scancode, int action, int mods) {
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
						case GLFW_KEY_ESCAPE:
							glfwSetWindowShouldClose(window, GL_TRUE);
							break;
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
			public void mouseButton(long window, int button, int action, int mods) {
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
			public void scroll(long window, double xoffset, double yoffset) {
				if ( yoffset != 0 ) {
					double scaleFactor = ctrlDown ? 0.25 : 0.05;
					double scale = yoffset > 0 ? scaleFactor : -scaleFactor;

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