/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opengl.raytracing;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.demo.util.Camera;
import org.lwjgl.demo.util.Vector3f;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.libffi.Closure;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import static java.lang.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL33.*;
import static org.lwjgl.opengl.GL42.*;
import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Raytracing demo.
 *
 * @author Kai Burjack
 */
public class Demo {

	private long window;
	private int width = 1024;
	private int height = 768;
	private boolean resetFramebuffer = true;

	private int tex;
	private int vao;
	private int computeProgram;
	private int quadProgram;
	private int sampler;

	private int eyeUniform;
	private int ray00Uniform;
	private int ray10Uniform;
	private int ray01Uniform;
	private int ray11Uniform;
	private int timeUniform;
	private int blendFactorUniform;
	private int bounceCountUniform;
	private int framebufferImageBinding;

	private int workGroupSizeX;
	private int workGroupSizeY;

	private Camera camera;
	private float mouseDownX;
	private float mouseX;
	private boolean mouseDown;

	private float currRotationAboutY = 0.0f;
	private float rotationAboutY = 0.8f;

	private long firstTime;
	private int frameNumber;
	private int bounceCount = 1;

	private Vector3f tmpVector = new Vector3f();
	private Vector3f cameraLookAt = new Vector3f(0.0f, 0.5f, 0.0f);
	private Vector3f cameraUp = new Vector3f(0.0f, 1.0f, 0.0f);

	GLFWErrorCallback errCallback;
	GLFWKeyCallback keyCallback;
	GLFWFramebufferSizeCallback fbCallback;
	GLFWCursorPosCallback cpCallback;
	GLFWMouseButtonCallback mbCallback;

	Closure debugProc;

	static {
		/*
		 * Tell LWJGL that we only want 4.3 functionality.
		 */
		System.setProperty("org.lwjgl.opengl.maxVersion", "4.3");
	}

	private void init() throws IOException {
		glfwSetErrorCallback(errCallback = new GLFWErrorCallback() {
			private GLFWErrorCallback delegate = Callbacks.errorCallbackPrint(System.err);

			@Override
			public void invoke(int error, long description) {
				if (error == GLFW_VERSION_UNAVAILABLE)
					System.err
							.println("This demo requires OpenGL 4.3 or higher. The Demo33 version works on OpenGL 3.3 or higher.");
				delegate.invoke(error, description);
			}

			@Override
			public void release() {
				delegate.release();
				super.release();
			}
		});

		if (glfwInit() != GL_TRUE)
			throw new IllegalStateException("Unable to initialize GLFW");

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
		glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GL_TRUE);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3);
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);

		window = glfwCreateWindow(width, height, "Raytracing Demo (compute shader)", NULL, NULL);
		if (window == NULL) {
			throw new AssertionError("Failed to create the GLFW window");
		}

		System.out.println("Press keypad '+' or 'page up' to increase the number of bounces.");
		System.out.println("Press keypad '-' or 'page down' to decrease the number of bounces.");
		glfwSetKeyCallback(window, keyCallback = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				if (action != GLFW_RELEASE) {
					return;
				}

				if (key == GLFW_KEY_ESCAPE) {
					glfwSetWindowShouldClose(window, GL_TRUE);
				} else if (key == GLFW_KEY_KP_ADD || key == GLFW_KEY_PAGE_UP) {
					int newBounceCount = Math.min(4, Demo.this.bounceCount + 1);
					if (newBounceCount != Demo.this.bounceCount) {
						Demo.this.bounceCount = newBounceCount;
						System.out.println("Ray bounce count is now: " + Demo.this.bounceCount);
						Demo.this.frameNumber = 0;
					}
				} else if (key == GLFW_KEY_KP_SUBTRACT || key == GLFW_KEY_PAGE_DOWN) {
					int newBounceCount = Math.max(1, Demo.this.bounceCount - 1);
					if (newBounceCount != Demo.this.bounceCount) {
						Demo.this.bounceCount = newBounceCount;
						System.out.println("Ray bounce count is now: " + Demo.this.bounceCount);
						Demo.this.frameNumber = 0;
					}
				}
			}
		});

		glfwSetFramebufferSizeCallback(window, fbCallback = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				if ( width > 0 && height > 0 && (Demo.this.width != width || Demo.this.height != height) ) {
					Demo.this.width = width;
					Demo.this.height = height;
					Demo.this.resetFramebuffer = true;
					Demo.this.frameNumber = 0;
				}
			}
		});

		glfwSetCursorPosCallback(window, cpCallback = new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double x, double y) {
				Demo.this.mouseX = (float)x;
				if ( mouseDown ) {
					Demo.this.frameNumber = 0;
				}
			}
		});

		glfwSetMouseButtonCallback(window, mbCallback = new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
				if ( action == GLFW_PRESS ) {
					Demo.this.mouseDownX = Demo.this.mouseX;
					Demo.this.mouseDown = true;
				} else if ( action == GLFW_RELEASE ) {
					Demo.this.mouseDown = false;
					Demo.this.rotationAboutY = Demo.this.currRotationAboutY;
				}
			}
		});

		ByteBuffer vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
		glfwSetWindowPos(window, (GLFWvidmode.width(vidmode) - width) / 2, (GLFWvidmode.height(vidmode) - height) / 2);
		glfwMakeContextCurrent(window);
		glfwSwapInterval(0);
		glfwShowWindow(window);

		IntBuffer framebufferSize = BufferUtils.createIntBuffer(2);
		nglfwGetFramebufferSize(window, memAddress(framebufferSize), memAddress(framebufferSize) + 4);
		width = framebufferSize.get(0);
		height = framebufferSize.get(1);

		debugProc = GLContext.createFromCurrent().setupDebugMessageCallback(System.err);

		/* Create all needed GL resources */
		createFramebufferTexture();
		createSampler();
		quadFullScreenVao();
		createComputeProgram();
		initComputeProgram();
		createQuadProgram();
		initQuadProgram();

		/* Setup camera */
		camera = new Camera();

		firstTime = System.nanoTime();
	}

	/**
	 * Create a VAO with a full-screen quad VBO.
	 */
	private void quadFullScreenVao() {
		this.vao = glGenVertexArrays();
		int vbo = glGenBuffers();
		glBindVertexArray(vao);
		glBindBuffer(GL_ARRAY_BUFFER, vbo);
		ByteBuffer bb = BufferUtils.createByteBuffer(4 * 2 * 6);
		FloatBuffer fv = bb.asFloatBuffer();
		fv.put(-1.0f).put(-1.0f);
		fv.put(1.0f).put(-1.0f);
		fv.put(1.0f).put(1.0f);
		fv.put(1.0f).put(1.0f);
		fv.put(-1.0f).put(1.0f);
		fv.put(-1.0f).put(-1.0f);
		glBufferData(GL_ARRAY_BUFFER, bb, GL_STATIC_DRAW);
		glEnableVertexAttribArray(0);
		glVertexAttribPointer(0, 2, GL_FLOAT, false, 0, 0L);
		glBindBuffer(GL_ARRAY_BUFFER, 0);
		glBindVertexArray(0);
	}

	/**
	 * Create a shader object from the given classpath resource.
	 *
	 * @param resource
	 *            the class path
	 * @param type
	 *            the shader type
	 *
	 * @return the shader object id
	 *
	 * @throws IOException
	 */
	static int createShader(String resource, int type) throws IOException {
		return createShader(resource, type, null);
	}

	/**
	 * Create a shader object from the given classpath resource.
	 *
	 * @param resource
	 *            the class path
	 * @param type
	 *            the shader type
	 * @param version
	 *            the GLSL version to prepend to the shader source, or null
	 *
	 * @return the shader object id
	 *
	 * @throws IOException
	 */
	static int createShader(String resource, int type, String version) throws IOException {
		int shader = glCreateShader(type);

		ByteBuffer source = ioResourceToByteBuffer(resource, 8192);

		if ( version == null ) {
			PointerBuffer strings = BufferUtils.createPointerBuffer(1);
			IntBuffer lengths = BufferUtils.createIntBuffer(1);

			strings.put(0, source);
			lengths.put(0, source.remaining());

			glShaderSource(shader, strings, lengths);
		} else {
			PointerBuffer strings = BufferUtils.createPointerBuffer(2);
			IntBuffer lengths = BufferUtils.createIntBuffer(2);

			ByteBuffer preamble = memEncodeUTF8("#version " + version + "\n", false);

			strings.put(0, preamble);
			lengths.put(0, preamble.remaining());

			strings.put(1, source);
			lengths.put(1, source.remaining());

			glShaderSource(shader, strings, lengths);
		}

		glCompileShader(shader);
		int compiled = glGetShaderi(shader, GL_COMPILE_STATUS);
		String shaderLog = glGetShaderInfoLog(shader);
		if (!shaderLog.trim().isEmpty()) {
			System.err.println(shaderLog);
		}
		if (compiled == 0) {
			throw new AssertionError("Could not compile shader");
		}
		return shader;
	}

	/**
	 * Create the full-scren quad shader.
	 *
	 * @throws IOException
	 */
	private void createQuadProgram() throws IOException {
		int program = glCreateProgram();
		int vshader = Demo.createShader("demo/raytracing/quad.vs", GL_VERTEX_SHADER, "330");
		int fshader = Demo.createShader("demo/raytracing/quad.fs", GL_FRAGMENT_SHADER, "330");
		glAttachShader(program, vshader);
		glAttachShader(program, fshader);
		glBindAttribLocation(program, 0, "vertex");
		glBindFragDataLocation(program, 0, "color");
		glLinkProgram(program);
		int linked = glGetProgrami(program, GL_LINK_STATUS);
		String programLog = glGetProgramInfoLog(program);
		if (!programLog.trim().isEmpty()) {
			System.err.println(programLog);
		}
		if (linked == 0) {
			throw new AssertionError("Could not link program");
		}
		this.quadProgram = program;
	}

	/**
	 * Create the tracing compute shader program.
	 *
	 * @throws IOException
	 */
	private void createComputeProgram() throws IOException {
		int program = glCreateProgram();
		int cshader = createShader("demo/raytracing/raytracing.glslcs", GL_COMPUTE_SHADER);
		int random = createShader("demo/raytracing/random.glsl", GL_COMPUTE_SHADER);
		int randomCommon = createShader("demo/raytracing/randomCommon.glsl", GL_COMPUTE_SHADER);
		glAttachShader(program, cshader);
		glAttachShader(program, random);
		glAttachShader(program, randomCommon);
		glLinkProgram(program);
		int linked = glGetProgrami(program, GL_LINK_STATUS);
		String programLog = glGetProgramInfoLog(program);
		if (!programLog.trim().isEmpty()) {
			System.err.println(programLog);
		}
		if (linked == 0) {
			throw new AssertionError("Could not link program");
		}
		this.computeProgram = program;
	}

	/**
	 * Initialize the full-screen-quad program.
	 */
	private void initQuadProgram() {
		glUseProgram(quadProgram);
		int texUniform = glGetUniformLocation(quadProgram, "tex");
		glUniform1i(texUniform, 0);
		glUseProgram(0);
	}

	/**
	 * Initialize the compute shader.
	 */
	private void initComputeProgram() {
		glUseProgram(computeProgram);
		IntBuffer workGroupSize = BufferUtils.createIntBuffer(3);
		glGetProgramiv(computeProgram, GL_COMPUTE_WORK_GROUP_SIZE, workGroupSize);
		workGroupSizeX = workGroupSize.get(0);
		workGroupSizeY = workGroupSize.get(1);
		eyeUniform = glGetUniformLocation(computeProgram, "eye");
		ray00Uniform = glGetUniformLocation(computeProgram, "ray00");
		ray10Uniform = glGetUniformLocation(computeProgram, "ray10");
		ray01Uniform = glGetUniformLocation(computeProgram, "ray01");
		ray11Uniform = glGetUniformLocation(computeProgram, "ray11");
		timeUniform = glGetUniformLocation(computeProgram, "time");
		blendFactorUniform = glGetUniformLocation(computeProgram, "blendFactor");
		bounceCountUniform = glGetUniformLocation(computeProgram, "bounceCount");

		/* Query the "image binding point" of the image uniform */
		IntBuffer params = BufferUtils.createIntBuffer(1);
		int loc = glGetUniformLocation(computeProgram, "framebufferImage");
		glGetUniformiv(computeProgram, loc, params);
		framebufferImageBinding = params.get(0);

		glUseProgram(0);
	}

	/**
	 * Create the texture that will serve as our framebuffer.
	 */
	private void createFramebufferTexture() {
		this.tex = glGenTextures();
		glBindTexture(GL_TEXTURE_2D, tex);
		glTexStorage2D(GL_TEXTURE_2D, 1, GL_RGBA32F, width, height);
		glBindTexture(GL_TEXTURE_2D, 0);
	}

	/**
	 * Create the sampler to sample the framebuffer texture within the shader.
	 */
	private void createSampler() {
		this.sampler = glGenSamplers();
		glSamplerParameteri(this.sampler, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
		glSamplerParameteri(this.sampler, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
	}

	/**
	 * Recreate the framebuffer when the window size changes.
	 */
	private void resizeFramebufferTexture() {
		glDeleteTextures(tex);
		createFramebufferTexture();
	}

	/**
	 * Compute one frame by tracing the scene using our compute shader and
	 * presenting that image on the screen.
	 */
	private void trace() {
		glUseProgram(computeProgram);

		if (mouseDown) {
			/*
			 * If mouse is down, compute the camera rotation based on mouse
			 * cursor location.
			 */
			currRotationAboutY = rotationAboutY + (mouseX - mouseDownX) * 0.01f;
		} else {
			currRotationAboutY = rotationAboutY;
		}

		/* Rotate camera about Y axis. */
		tmpVector.set((float) sin(-currRotationAboutY) * 3.0f, 2.0f, (float) cos(-currRotationAboutY) * 3.0f);
		camera.setLookAt(tmpVector, cameraLookAt, cameraUp);

		if (resetFramebuffer) {
			camera.setFrustumPerspective(60.0f, (float) width / height, 1f, 2f);
			resizeFramebufferTexture();
			resetFramebuffer = false;
		}

		long thisTime = System.nanoTime();
		float elapsedSeconds = (thisTime - firstTime) / 1E9f;
		glUniform1f(timeUniform, elapsedSeconds);

		/*
		 * We are going to average multiple successive frames, so here we
		 * compute the blend factor between old frame and new frame. 0.0 - use
		 * only the new frame > 0.0 - blend between old frame and new frame
		 */
		float blendFactor = (float) frameNumber / ((float) frameNumber + 1.0f);
		glUniform1f(blendFactorUniform, blendFactor);
		glUniform1i(bounceCountUniform, bounceCount);

		/* Set viewing frustum corner rays in shader */
		glUniform3f(eyeUniform, camera.getPosition().x, camera.getPosition().y, camera.getPosition().z);
		camera.getEyeRay(-1, -1, tmpVector);
		glUniform3f(ray00Uniform, tmpVector.x, tmpVector.y, tmpVector.z);
		camera.getEyeRay(-1, 1, tmpVector);
		glUniform3f(ray01Uniform, tmpVector.x, tmpVector.y, tmpVector.z);
		camera.getEyeRay(1, -1, tmpVector);
		glUniform3f(ray10Uniform, tmpVector.x, tmpVector.y, tmpVector.z);
		camera.getEyeRay(1, 1, tmpVector);
		glUniform3f(ray11Uniform, tmpVector.x, tmpVector.y, tmpVector.z);

		/* Bind level 0 of framebuffer texture as writable image in the shader. */
		glBindImageTexture(framebufferImageBinding, tex, 0, false, 0, GL_READ_WRITE, GL_RGBA32F);

		/* Compute appropriate invocation dimension. */
		int worksizeX = mathRoundPoT(width);
		int worksizeY = mathRoundPoT(height);

		/* Invoke the compute shader. */
		glDispatchCompute(worksizeX / workGroupSizeX, worksizeY / workGroupSizeY, 1);
		/*
		 * Synchronize all writes to the framebuffer image before we let OpenGL
		 * source texels from it afterwards when rendering the final image with
		 * the full-screen quad.
		 */
		glMemoryBarrier(GL_SHADER_IMAGE_ACCESS_BARRIER_BIT);

		/* Reset bindings. */
		glBindImageTexture(framebufferImageBinding, 0, 0, false, 0, GL_READ_WRITE, GL_RGBA32F);
		glUseProgram(0);

		frameNumber++;
	}

	/**
	 * Present the final image on the screen/viewport.
	 */
	private void present() {
		/*
		 * Draw the rendered image on the screen using textured full-screen
		 * quad.
		 */
		glUseProgram(quadProgram);
		glBindVertexArray(vao);
		glBindTexture(GL_TEXTURE_2D, tex);
		glBindSampler(0, this.sampler);
		glDrawArrays(GL_TRIANGLES, 0, 6);
		glBindSampler(0, 0);
		glBindTexture(GL_TEXTURE_2D, 0);
		glBindVertexArray(0);
		glUseProgram(0);
	}

	private void loop() {
		while (glfwWindowShouldClose(window) == GL_FALSE) {
			glfwPollEvents();
			glViewport(0, 0, width, height);

			trace();
			present();

			glfwSwapBuffers(window);
		}
	}

	private void run() {
		try {
			init();
			loop();

			if (debugProc != null)
				debugProc.release();

			errCallback.release();
			keyCallback.release();
			fbCallback.release();
			cpCallback.release();
			mbCallback.release();
			glfwDestroyWindow(window);
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			glfwTerminate();
		}
	}

	public static void main(String[] args) {
		new Demo().run();
	}

}