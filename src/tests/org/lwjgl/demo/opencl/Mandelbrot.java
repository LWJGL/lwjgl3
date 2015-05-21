/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opencl;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.*;
import org.lwjgl.opencl.*;
import org.lwjgl.opencl.CLPlatform.Filter;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.libffi.Closure;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

import static org.lwjgl.demo.opencl.CLGLInteropDemo.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWLinux.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CL10GL.*;
import static org.lwjgl.opencl.CLUtil.*;
import static org.lwjgl.opencl.Info.*;
import static org.lwjgl.opencl.KHRGLSharing.*;
import static org.lwjgl.opengl.ARBCLEvent.*;
import static org.lwjgl.opengl.CGL.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL32.*;
import static org.lwjgl.opengl.WGL.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Mandelbrot {

	// The fractal bounds in world space
	private static final double
		WIDTH  = 4.0,
		HEIGHT = 3.0;

	private static final int COLOR_MAP_SIZE = 32 * 2 * 4;

	private static final ByteBuffer source;

	static {
		try {
			source = ioResourceToByteBuffer("demo/Mandelbrot.cl", 4096);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/** The event callbacks run on the main thread. We use this queue to apply any changes in the rendering thread. */
	private final Queue<Runnable> events = new ConcurrentLinkedQueue<Runnable>();

	private final GLFWWindow window;

	private final int maxIterations;

	private boolean shouldInitBuffers = true;
	private boolean rebuild;

	// OPENCL

	private final IntBuffer errcode_ret;

	private final CLPlatform platform;
	private final CLDevice   device;

	private final long clContext;
	private final long clColorMap;
	private final long clQueue;
	private       long clProgram;
	private       long clKernel;
	private       long clTexture;

	private final PointerBuffer kernel2DGlobalWorkSize = BufferUtils.createPointerBuffer(2);

	private boolean doublePrecision = true;

	// OPENGL

	private int glTexture;

	private int vao;
	private int vbo;
	private int vsh;
	private int fsh;
	private int glProgram;

	private int projectionUniform;
	private int sizeUniform;

	// VIEWPORT

	private int
		ww,
		wh;

	private int
		fbw,
		fbh;

	private double
		offsetX = -0.5,
		offsetY;

	private double zoom = 1.0;

	// EVENT SYNCING

	private final PointerBuffer syncBuffer = BufferUtils.createPointerBuffer(1);

	private boolean syncGLtoCL; // false if we can make GL wait on events generated from CL queues.
	private long    clEvent;
	private long    glFenceFromCLEvent;

	private boolean syncCLtoGL; // false if we can make CL wait on sync objects generated from GL.

	// INPUT

	private double mouseX;
	private double mouseY;

	private boolean ctrlDown;

	private boolean dragging;

	private double dragX;
	private double dragY;

	private double dragOffsetX;
	private double dragOffsetY;

	// CALLBACKS

	Closure debugProc;

	public Mandelbrot(CLPlatform platform, GLFWWindow window, int deviceType, boolean debugGL, int maxIterations) {
		this.platform = platform;

		this.window = window;
		this.maxIterations = maxIterations;

		IntBuffer size = BufferUtils.createIntBuffer(2);

		nglfwGetWindowSize(window.handle, memAddress(size), memAddress(size) + 4);
		ww = size.get(0);
		wh = size.get(1);

		nglfwGetFramebufferSize(window.handle, memAddress(size), memAddress(size) + 4);
		fbw = size.get(0);
		fbh = size.get(1);

		glfwMakeContextCurrent(window.handle);
		GLContext glContext = GLContext.createFromCurrent();

		ContextCapabilities glCaps = glContext.getCapabilities();
		if ( !glCaps.OpenGL30 )
			throw new RuntimeException("OpenGL 3.0 is required to run this demo.");

		debugProc = debugGL ? glContext.setupDebugMessageCallback() : null;

		glfwSwapInterval(0);

		errcode_ret = BufferUtils.createIntBuffer(1);

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
				devices = platform.getDevices(CL_DEVICE_TYPE_CPU, glSharingFilter);
				if ( devices == null )
					throw new RuntimeException("No OpenCL devices found with KHR_gl_sharing support.");
			}
			this.device = devices.get(0);

			PointerBuffer deviceBuffer = BufferUtils.createPointerBuffer(devices.size());
			for ( int i = 0; i < devices.size(); i++ )
				deviceBuffer.put(i, devices.get(i));

			// Create the context
			boolean useAPPLEGLSharing = false;
			for ( int i = 0; i < devices.size(); i++ ) {
				CLCapabilities caps = devices.get(i).getCapabilities();
				if ( !caps.cl_khr_gl_sharing && caps.cl_APPLE_gl_sharing ) {
					useAPPLEGLSharing = true;
					break;
				}
			}

			PointerBuffer ctxProps = BufferUtils.createPointerBuffer(useAPPLEGLSharing ? 5 : 7)
				.put(0, CL_CONTEXT_PLATFORM)
				.put(1, platform);

			if ( useAPPLEGLSharing ) {
				ctxProps
					.put(2, APPLEGLSharing.CL_CONTEXT_PROPERTY_USE_CGL_SHAREGROUP_APPLE)
					.put(3, CGLGetShareGroup(glContext.getPointer()));
			} else {
				ctxProps
					.put(2, CL_GL_CONTEXT_KHR)
					.put(3, glContext);

				switch ( LWJGLUtil.getPlatform() ) {
					case WINDOWS:
						ctxProps
							.put(4, CL_WGL_HDC_KHR)
							.put(5, wglGetCurrentDC());
						break;
					case LINUX:
						ctxProps
							.put(4, CL_GLX_DISPLAY_KHR)
							.put(5, glfwGetX11Display());
						break;
					case MACOSX:
						ctxProps
							.put(4, CL_CGL_SHAREGROUP_KHR)
							.put(5, CGLGetShareGroup(glContext.getPointer()));
						break;
				}
			}

			ctxProps.put(useAPPLEGLSharing ? 4 : 6, 0);

			clContext = clCreateContext(ctxProps, deviceBuffer, new CLCreateContextCallback() {
				@Override
				public void invoke(long errinfo, long private_info, long cb, long user_data) {
					System.err.println("[LWJGL] cl_create_context_callback");
					System.err.println("\tInfo: " + memDecodeUTF8(errinfo));
				}
			}, NULL, errcode_ret);
			checkCLError(errcode_ret);

			// create command queues for every GPU, setup colormap and init kernels

			IntBuffer colorMapBuffer = BufferUtils.createIntBuffer(32 * 2);
			initColorMap(colorMapBuffer, 32, Color.BLUE, Color.GREEN, Color.RED);

			clColorMap = clCreateBuffer(clContext, CL_MEM_READ_ONLY | CL_MEM_COPY_HOST_PTR, colorMapBuffer, errcode_ret);
			checkCLError(errcode_ret);

			// create command queue and upload color map buffer on each used device
			clQueue = clCreateCommandQueue(clContext, device.getPointer(), 0L, errcode_ret);
			checkCLError(errcode_ret);

			// load program(s)
			if ( deviceType == CL_DEVICE_TYPE_GPU )
				log("OpenCL Device Type: GPU (Use -forceCPU to use CPU)");
			else
				log("OpenCL Device Type: CPU");

			log("Max Iterations: " + maxIterations + " (Use -iterations <count> to change)");
			log("Display resolution: " + ww + "x" + wh + " (Use -res <width> <height> to change)");

			log("OpenGL glCaps.GL_ARB_sync = " + glCaps.GL_ARB_sync);
			log("OpenGL glCaps.GL_ARB_cl_event = " + glCaps.GL_ARB_cl_event);

			buildProgram();

			// Detect GLtoCL synchronization method
			syncGLtoCL = !glCaps.GL_ARB_cl_event; // GL3.2 or ARB_sync implied
			log(syncGLtoCL
				    ? "GL to CL sync: Using clFinish"
				    : "GL to CL sync: Using OpenCL events"
			);

			// Detect CLtoGL synchronization method
			syncCLtoGL = !device.getCapabilities().cl_khr_gl_event;
			log(syncCLtoGL
				    ? "CL to GL sync: Using glFinish"
				    : "CL to GL sync: Using implicit sync (cl_khr_gl_event)"
			);

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
			                    "\n" +
			                    "in vec2 posIN;\n" +
			                    "in vec2 texIN;\n" +
			                    "\n" +
			                    "out vec2 texCoord;\n" +
			                    "\n" +
			                    "void main(void) {\n" +
			                    "\tgl_Position = projection * vec4(posIN * size, 0.0, 1.0);\n" +
			                    "\ttexCoord = texIN;\n" +
			                    "}");
			glCompileShader(vsh);
			String log = glGetShaderInfoLog(vsh, glGetShaderi(vsh, GL_INFO_LOG_LENGTH));
			if ( !log.isEmpty() )
				System.err.println("VERTEX SHADER LOG: " + log);

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
				System.err.println("FRAGMENT SHADER LOG: " + log);

			glProgram = glCreateProgram();
			glAttachShader(glProgram, vsh);
			glAttachShader(glProgram, fsh);
			glLinkProgram(glProgram);
			log = glGetProgramInfoLog(glProgram, glGetProgrami(glProgram, GL_INFO_LOG_LENGTH));
			if ( !log.isEmpty() )
				System.err.println("PROGRAM LOG: " + log);

			int posIN = glGetAttribLocation(glProgram, "posIN");
			int texIN = glGetAttribLocation(glProgram, "texIN");

			glVertexAttribPointer(posIN, 2, GL_FLOAT, false, 4 * 4, 0);
			glVertexAttribPointer(texIN, 2, GL_FLOAT, false, 4 * 4, 2 * 4);

			glEnableVertexAttribArray(posIN);
			glEnableVertexAttribArray(texIN);

			projectionUniform = glGetUniformLocation(glProgram, "projection");
			sizeUniform = glGetUniformLocation(glProgram, "size");

			glUseProgram(glProgram);

			glUniform1i(glGetUniformLocation(glProgram, "mandelbrot"), 0);
		} catch (Exception e) {
			// TODO: cleanup
			throw new RuntimeException(e);
		}

		glDisable(GL_DEPTH_TEST);
		glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

		initGLObjects();
		glFinish();

		setKernelConstants();

		glfwSetWindowSizeCallback(window.handle, window.windowsizefun = new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, final int width, final int height) {
				if ( width == 0 || height == 0 )
					return;

				events.add(new Runnable() {
					@Override
					public void run() {
						Mandelbrot.this.ww = width;
						Mandelbrot.this.wh = height;

						shouldInitBuffers = true;
					}
				});
			}
		});

		glfwSetFramebufferSizeCallback(window.handle, window.framebuffersizefun = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, final int width, final int height) {
				if ( width == 0 || height == 0 )
					return;

				events.add(new Runnable() {
					@Override
					public void run() {
						Mandelbrot.this.fbw = width;
						Mandelbrot.this.fbh = height;

						shouldInitBuffers = true;
					}
				});
			}
		});

		glfwSetKeyCallback(window.handle, window.keyfun = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				switch ( key ) {
					case GLFW_KEY_LEFT_CONTROL:
					case GLFW_KEY_RIGHT_CONTROL:
						ctrlDown = action == GLFW_PRESS;
						return;
				}

				if ( action != GLFW_PRESS )
					return;

				switch ( key ) {
					case GLFW_KEY_ESCAPE:
						glfwSetWindowShouldClose(window, GL_TRUE);
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
								offsetX = -0.5;
								offsetY = 0.0;
								zoom = 1.0;
							}
						});
						break;
				}
			}
		});

		glfwSetMouseButtonCallback(window.handle, window.mousebuttonfun = new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
				if ( button != GLFW_MOUSE_BUTTON_LEFT )
					return;

				dragging = action == GLFW_PRESS;

				if ( dragging ) {
					dragging = true;

					dragX = mouseX;
					dragY = mouseY;

					dragOffsetX = offsetX;
					dragOffsetY = offsetY;
				}
			}
		});

		glfwSetCursorPosCallback(window.handle, window.cursorposfun = new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double xpos, double ypos) {
				mouseX = xpos;
				mouseY = wh - ypos;

				if ( dragging ) {
					offsetX = dragOffsetX + transformX(dragX - mouseX);
					offsetY = dragOffsetY + transformY(dragY - mouseY);
				}
			}
		});

		glfwSetScrollCallback(window.handle, window.scrollfun = new GLFWScrollCallback() {
			@Override
			public void invoke(long window, double xoffset, double yoffset) {
				if ( yoffset == 0 )
					return;

				double scrollX = mouseX - ww * 0.5;
				double scrollY = mouseY - wh * 0.5;

				double zoomX = transformX(scrollX);
				double zoomY = transformY(scrollY);

				zoom *= (1.0 - yoffset * (ctrlDown ? 0.25 : 0.05));

				offsetX += zoomX - transformX(scrollX);
				offsetY += zoomY - transformY(scrollY);
			}
		});
	}

	private void log(String msg) {
		System.err.format("[%s] %s\n", window.ID, msg);
	}

	void renderLoop() {
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
				log(String.format(
					"%s: %d frames in 5 seconds = %.2f",
					clGetPlatformInfoStringUTF8(platform.getPointer(), CL_PLATFORM_VENDOR),
					fps,
					fps / (timeUsed / 1000f)
				));
				fps = 0;
			}
		}

		cleanup();

		window.signal.countDown();
	}

	private interface CLCleaner {
		int release(long object);
	}

	private static void release(long object, CLCleaner cleaner) {
		if ( object == NULL )
			return;

		int errcode = cleaner.release(object);
		checkCLError(errcode);
	}

	private void cleanup() {
		CLCleaner memObjCleaner = new CLCleaner() {
			@Override
			public int release(long object) {
				return clReleaseMemObject(object);
			}
		};

		release(clTexture, memObjCleaner);
		release(clColorMap, memObjCleaner);

		release(clKernel, new CLCleaner() {
			@Override
			public int release(long object) {
				return clReleaseKernel(object);
			}
		});

		release(clProgram, new CLCleaner() {
			@Override
			public int release(long object) {
				return clReleaseProgram(object);
			}
		});

		release(clQueue, new CLCleaner() {
			@Override
			public int release(long object) {
				return clReleaseCommandQueue(object);
			}
		});

		release(clContext, new CLCleaner() {
			@Override
			public int release(long object) {
				return clReleaseContext(object);
			}
		});

		glDeleteProgram(glProgram);
		glDeleteShader(fsh);
		glDeleteShader(vsh);
		glDeleteBuffers(vbo);
		glDeleteVertexArrays(vao);

		if ( debugProc != null )
			debugProc.release();
	}

	private void display() {
		// make sure GL does not use our objects before we start computing
		if ( syncCLtoGL || shouldInitBuffers )
			glFinish();

		if ( shouldInitBuffers ) {
			initGLObjects();
			setKernelConstants();
		}

		if ( rebuild ) {
			buildProgram();
			setKernelConstants();
		}
		computeCL(doublePrecision);

		renderGL();
	}

	// OpenCL

	private double transformX(double x) {
		return x * zoom * (WIDTH / ww);
	}

	private double transformY(double y) {
		return y * zoom * (HEIGHT / wh);
	}

	private void computeCL(boolean is64bit) {
		double minX = transformX(-ww * 0.5) + offsetX;
		double maxX = transformX(ww * 0.5) + offsetX;
		double minY = transformY(-wh * 0.5) + offsetY;
		double maxY = transformY(wh * 0.5) + offsetY;

		double rangeX = maxX - minX;
		double rangeY = maxY - minY;

		kernel2DGlobalWorkSize.put(0, ww).put(1, wh);

		// start computation

		clSetKernelArg1i(clKernel, 0, ww);
		clSetKernelArg1i(clKernel, 1, wh);
		if ( !is64bit || !isDoubleFPAvailable(device) ) {
			clSetKernelArg1f(clKernel, 2, (float)minX);
			clSetKernelArg1f(clKernel, 3, (float)minY);

			clSetKernelArg1f(clKernel, 4, (float)rangeX);
			clSetKernelArg1f(clKernel, 5, (float)rangeY);
		} else {
			clSetKernelArg1d(clKernel, 2, minX);
			clSetKernelArg1d(clKernel, 3, minY);

			clSetKernelArg1d(clKernel, 4, rangeX);
			clSetKernelArg1d(clKernel, 5, rangeY);
		}

		// acquire GL objects, and enqueue a kernel with a probe from the list
		int errcode = clEnqueueAcquireGLObjects(clQueue, clTexture, null, null);
		checkCLError(errcode);

		errcode = clEnqueueNDRangeKernel(clQueue, clKernel, 2,
		                                 null,
		                                 kernel2DGlobalWorkSize,
		                                 null,
		                                 null, null);
		checkCLError(errcode);

		errcode = clEnqueueReleaseGLObjects(clQueue, clTexture, null, !syncGLtoCL ? syncBuffer : null);
		checkCLError(errcode);

		if ( !syncGLtoCL ) {
			clEvent = syncBuffer.get(0);
			glFenceFromCLEvent = glCreateSyncFromCLeventARB(clContext, clEvent, 0);
		}

		// block until done (important: finish before doing further gl work)
		if ( syncGLtoCL ) {
			errcode = clFinish(clQueue);
			checkCLError(errcode);
		}
	}

	// OpenGL

	private void renderGL() {
		glClear(GL_COLOR_BUFFER_BIT);

		//draw slices

		if ( !syncGLtoCL ) {
			glWaitSync(glFenceFromCLEvent, 0, 0);
			glDeleteSync(glFenceFromCLEvent);
			glFenceFromCLEvent = NULL;

			int errcode = clReleaseEvent(clEvent);
			clEvent = NULL;
			checkCLError(errcode);
		}

		glBindTexture(GL_TEXTURE_2D, glTexture);
		glDrawArrays(GL_TRIANGLE_STRIP, 0, 4);
	}

	private static boolean isDoubleFPAvailable(CLDevice device) {
		CLCapabilities caps = device.getCapabilities();
		return caps.cl_khr_fp64 || caps.cl_amd_fp64;
	}

	private void buildProgram() {
		if ( clProgram != NULL ) {
			int errcode = clReleaseProgram(clProgram);
			checkCLError(errcode);
		}

		PointerBuffer strings = BufferUtils.createPointerBuffer(1);
		PointerBuffer lengths = BufferUtils.createPointerBuffer(1);

		strings.put(0, source);
		lengths.put(0, source.remaining());

		clProgram = clCreateProgramWithSource(clContext, strings, lengths, errcode_ret);
		checkCLError(errcode_ret);

		final CountDownLatch latch = new CountDownLatch(1);

		// disable 64bit floating point math if not available
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

		final long cl_device_id = device.getPointer();
		int errcode = clBuildProgram(clProgram, cl_device_id, options, new CLProgramCallback() {
			@Override
			public void invoke(long program, long user_data) {
				System.err.printf(
					"The cl_program [0x%X] was built %s\n",
					program,
					clGetProgramBuildInfoInt(program, cl_device_id, CL_PROGRAM_BUILD_STATUS) == CL_SUCCESS ? "successfully" : "unsuccessfully"
				);
				String log = clGetProgramBuildInfoStringASCII(program, cl_device_id, CL_PROGRAM_BUILD_LOG);
				if ( !log.isEmpty() )
					System.err.printf("BUILD LOG:\n----\n%s\n-----\n", log);

				latch.countDown();
			}
		}, NULL);
		checkCLError(errcode);

		// Make sure the program has been built before proceeding
		try {
			latch.await();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		rebuild = false;

		// init kernel with constants
		clKernel = clCreateKernel(clProgram, "mandelbrot", errcode_ret);
		checkCLError(errcode_ret);
	}

	private void initGLObjects() {
		if ( clTexture != NULL ) {
			checkCLError(clReleaseMemObject(clTexture));
			glDeleteTextures(glTexture);
		}

		glTexture = glGenTextures();

		// Init textures
		glBindTexture(GL_TEXTURE_2D, glTexture);
		glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA8UI, ww, wh, 0, GL_RGBA_INTEGER, GL_UNSIGNED_BYTE, (ByteBuffer)null);

		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);

		clTexture = clCreateFromGLTexture2D(clContext, CL_MEM_WRITE_ONLY, GL_TEXTURE_2D, 0, glTexture, errcode_ret);
		checkCLError(errcode_ret);
		glBindTexture(GL_TEXTURE_2D, 0);

		glViewport(0, 0, fbw, fbh);

		glUniform2f(sizeUniform, ww, wh);

		FloatBuffer projectionMatrix = BufferUtils.createFloatBuffer(4 * 4);
		glOrtho(0.0f, ww, 0.0f, wh, 0.0f, 1.0f, projectionMatrix);
		glUniformMatrix4fv(projectionUniform, false, projectionMatrix);

		shouldInitBuffers = false;
	}

	private static void glOrtho(float l, float r, float b, float t, float n, float f, FloatBuffer m) {
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
		clSetKernelArg1p(clKernel, 6, clTexture);
		clSetKernelArg1p(clKernel, 7, clColorMap);
		clSetKernelArg1i(clKernel, 8, COLOR_MAP_SIZE);
		clSetKernelArg1i(clKernel, 9, maxIterations);
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
		colorMap.flip();
	}

}