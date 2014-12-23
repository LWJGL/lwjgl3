/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opengl.raytracing;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.demo.util.Camera;
import org.lwjgl.demo.util.Matrix4f;
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
import static org.lwjgl.opengl.GL42.*;
import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This demo is used to showcase hybrid rasterization and ray tracing to make
 * the first bounce faster.
 * <p>
 * The idea behind this is not new, others have done it, too, like in <a
 * href="https://www.youtube.com/watch?v=LyH4yBm6Z9g">Hybrid Rendering Demo -
 * PowerVR Ray Tracing - GDC 2014</a>.
 * <p>
 * The benefit of doing it this way is to use the rasterizer to rasterize the
 * depth/view position and normal information of a potentially complex model
 * first, storing it in a A-buffer. This essentially saves us one bounce of path
 * tracing for the first hit of the eye ray into the scene.
 * <p>
 * From there on we can use the ray tracer again and compute shadow rays and
 * reflection rays as usual.
 * 
 * @author Kai Burjack
 */
public class HybridDemo {

	private static Vector3f[] boxes = { new Vector3f(-5.0f, -0.1f, -5.0f), new Vector3f(5.0f, 0.0f, 5.0f),
			new Vector3f(-0.5f, 0.0f, -0.5f), new Vector3f(0.5f, 1.0f, 0.5f), new Vector3f(-5.1f, 0.0f, -5.0f),
			new Vector3f(-5.0f, 5.0f, 5.0f), new Vector3f(5.0f, 0.0f, -5.0f), new Vector3f(5.1f, 5.0f, 5.0f),
			new Vector3f(-5.0f, 0.0f, -5.1f), new Vector3f(5.0f, 5.0f, -5.0f), new Vector3f(-5.0f, 0.0f, 5.0f),
			new Vector3f(5.0f, 5.0f, 5.1f), new Vector3f(-5.0f, 5.0f, -5.0f), new Vector3f(5.0f, 5.1f, 5.0f) };

	private long window;
	private int width = 1024;
	private int height = 768;
	private boolean resetFramebuffer = true;

	private int raytraceTexture;
	private int vao;
	private int computeProgram;
	private int quadProgram;
	private int rasterProgram;
	private int fbo;
	private int depthBuffer;
	private int vaoScene;
	private int positionTexture;
	private int normalTexture;

	private int eyeUniform;
	private int ray00Uniform;
	private int ray10Uniform;
	private int ray01Uniform;
	private int ray11Uniform;
	private int timeUniform;
	private int blendFactorUniform;
	private int samplesPerFrameCountUniform;
	private int bounceCountUniform;

	private int modelViewMatrixUniform;
	private int projectionMatrixUniform;
	private int normalMatrixUniform;

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
	private int samplesPerFrameCount = 1;
	private int bounceCount = 1;

	private Vector3f tmpVector = new Vector3f();
	private Vector3f cameraLookAt = new Vector3f(0.0f, 0.5f, 0.0f);
	private Vector3f cameraUp = new Vector3f(0.0f, 1.0f, 0.0f);
	private ByteBuffer matrixByteBuffer = BufferUtils.createByteBuffer(4 * 16);
	private FloatBuffer matrixByteBufferFloatView = matrixByteBuffer.asFloatBuffer();
	private Matrix4f normalMatrix = new Matrix4f();

	private ByteBuffer renderBuffers;

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
							.println("This demo requires OpenGL 4.3 or higher. The HybridDemo33 version works on OpenGL 3.3 or higher.");
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

		window = glfwCreateWindow(width, height, "Raytracing Demo (compute shader + raster)", NULL, NULL);
		if (window == NULL) {
			throw new AssertionError("Failed to create the GLFW window");
		}

		System.out.println("Press 1 through 9 to change the number of samples per frame.");
		System.out.println("Press keypad '+' or 'page up' to increase the number of bounces.");
		System.out.println("Press keypad '-' or 'page down' to decrease the number of bounces.");
		glfwSetKeyCallback(window, keyCallback = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				if (action != GLFW_RELEASE)
					return;

				if (key == GLFW_KEY_ESCAPE)
					glfwSetWindowShouldClose(window, GL_TRUE);
				else if (GLFW_KEY_1 <= key && key <= GLFW_KEY_9) {
					int newSamplesPerFrameCount = key - GLFW_KEY_1 + 1;
					if (newSamplesPerFrameCount != HybridDemo.this.samplesPerFrameCount) {
						HybridDemo.this.samplesPerFrameCount = newSamplesPerFrameCount;
						System.out.println("Samples per frame is now: " + HybridDemo.this.samplesPerFrameCount);
						HybridDemo.this.frameNumber = 0;
					}
				} else if (key == GLFW_KEY_KP_ADD || key == GLFW_KEY_PAGE_UP) {
					int newBounceCount = Math.min(4, HybridDemo.this.bounceCount + 1);
					if (newBounceCount != HybridDemo.this.bounceCount) {
						HybridDemo.this.bounceCount = newBounceCount;
						System.out.println("Ray bounce count is now: " + HybridDemo.this.bounceCount);
						HybridDemo.this.frameNumber = 0;
					}
				} else if (key == GLFW_KEY_KP_SUBTRACT || key == GLFW_KEY_PAGE_DOWN) {
					int newBounceCount = Math.max(1, HybridDemo.this.bounceCount - 1);
					if (newBounceCount != HybridDemo.this.bounceCount) {
						HybridDemo.this.bounceCount = newBounceCount;
						System.out.println("Ray bounce count is now: " + HybridDemo.this.bounceCount);
						HybridDemo.this.frameNumber = 0;
					}
				}
			}
		});

		glfwSetFramebufferSizeCallback(window, fbCallback = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				if (width > 0 && height > 0 && (HybridDemo.this.width != width || HybridDemo.this.height != height)) {
					HybridDemo.this.width = width;
					HybridDemo.this.height = height;
					HybridDemo.this.resetFramebuffer = true;
					HybridDemo.this.frameNumber = 0;
				}
			}
		});

		glfwSetCursorPosCallback(window, cpCallback = new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double x, double y) {
				HybridDemo.this.mouseX = (float) x;
				if (mouseDown) {
					HybridDemo.this.frameNumber = 0;
				}
			}
		});

		glfwSetMouseButtonCallback(window, mbCallback = new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
				if (action == GLFW_PRESS) {
					HybridDemo.this.mouseDownX = HybridDemo.this.mouseX;
					HybridDemo.this.mouseDown = true;
				} else if (action == GLFW_RELEASE) {
					HybridDemo.this.mouseDown = false;
					HybridDemo.this.rotationAboutY = HybridDemo.this.currRotationAboutY;
				}
			}
		});

		ByteBuffer vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
		glfwSetWindowPos(window, (GLFWvidmode.width(vidmode) - width) / 2, (GLFWvidmode.height(vidmode) - height) / 2);
		glfwMakeContextCurrent(window);
		glfwSwapInterval(0);
		glfwShowWindow(window);
		debugProc = GLContext.createFromCurrent().setupDebugMessageCallback(System.err);

		/* Create all needed GL resources */
		createRaytracingTexture();
		createRasterizerTextures();
		createRasterFrameBufferObject();
		vao = createFullScreenVao();
		vaoScene = createSceneVao();
		rasterProgram = createRasterProgram();
		initRasterProgram();
		computeProgram = createComputeProgram();
		initComputeProgram();
		quadProgram = createQuadProgram();
		initQuadProgram();

		glEnable(GL_DEPTH_TEST);
		glEnable(GL_CULL_FACE);

		/*
		 * Our rasterizer wants to output color attchment 0 and 1.
		 */
		renderBuffers = BufferUtils.createByteBuffer(4 * 2);
		renderBuffers.putInt(GL_COLOR_ATTACHMENT0).putInt(GL_COLOR_ATTACHMENT1);
		renderBuffers.flip();

		/* Setup camera */
		camera = new Camera();

		firstTime = System.nanoTime();
	}

	/**
	 * Creates a VAO with a full-screen quad VBO.
	 */
	private static int createFullScreenVao() {
		int vao = glGenVertexArrays();
		int vbo = glGenBuffers();
		glBindVertexArray(vao);
		glBindBuffer(GL_ARRAY_BUFFER, vbo);
		ByteBuffer bb = BufferUtils.createByteBuffer(4 * 2 * 6);
		bb.putFloat(-1.0f).putFloat(-1.0f);
		bb.putFloat(1.0f).putFloat(-1.0f);
		bb.putFloat(1.0f).putFloat(1.0f);
		bb.putFloat(1.0f).putFloat(1.0f);
		bb.putFloat(-1.0f).putFloat(1.0f);
		bb.putFloat(-1.0f).putFloat(-1.0f);
		bb.flip();
		glBufferData(GL_ARRAY_BUFFER, bb, GL_STATIC_DRAW);
		glEnableVertexAttribArray(0);
		glVertexAttribPointer(0, 2, GL_FLOAT, false, 0, 0L);
		glBindVertexArray(0);
		return vao;
	}

	/**
	 * Creates a VAO for the scene.
	 */
	private static int createSceneVao() {
		int vao = glGenVertexArrays();
		int vbo = glGenBuffers();
		glBindVertexArray(vao);
		glBindBuffer(GL_ARRAY_BUFFER, vbo);
		ByteBuffer bb = BufferUtils.createByteBuffer(boxes.length * 4 * (3 + 3) * 6 * 6);
		FloatBuffer fv = bb.asFloatBuffer();
		for (int i = 0; i < boxes.length; i += 2) {
			triangulateBox(boxes[i], boxes[i + 1], fv);
		}
		glBufferData(GL_ARRAY_BUFFER, bb, GL_STATIC_DRAW);
		glEnableVertexAttribArray(0);
		glVertexAttribPointer(0, 3, GL_FLOAT, false, 4 * (3 + 3), 0L);
		glEnableVertexAttribArray(1);
		glVertexAttribPointer(1, 3, GL_FLOAT, false, 4 * (3 + 3), 4 * 3);
		glBindVertexArray(0);
		return vao;
	}

	private static void triangulateBox(Vector3f min, Vector3f max, FloatBuffer fv) {
		/* Front face */
		fv.put(min.x).put(min.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(max.x).put(min.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(max.x).put(max.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(max.x).put(max.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(min.x).put(max.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		fv.put(min.x).put(min.y).put(max.z).put(0.0f).put(0.0f).put(1.0f);
		/* Back face */
		fv.put(max.x).put(min.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(min.x).put(min.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(min.x).put(max.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(min.x).put(max.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(max.x).put(max.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		fv.put(max.x).put(min.y).put(min.z).put(0.0f).put(0.0f).put(-1.0f);
		/* Left face */
		fv.put(min.x).put(min.y).put(min.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(min.y).put(max.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(max.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(max.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(min.z).put(-1.0f).put(0.0f).put(0.0f);
		fv.put(min.x).put(min.y).put(min.z).put(-1.0f).put(0.0f).put(0.0f);
		/* Right face */
		fv.put(max.x).put(min.y).put(max.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(min.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(min.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(min.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(max.z).put(1.0f).put(0.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(max.z).put(1.0f).put(0.0f).put(0.0f);
		/* Top face */
		fv.put(min.x).put(max.y).put(max.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(max.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(min.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(max.x).put(max.y).put(min.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(min.z).put(0.0f).put(1.0f).put(0.0f);
		fv.put(min.x).put(max.y).put(max.z).put(0.0f).put(1.0f).put(0.0f);
		/* Bottom face */
		fv.put(min.x).put(min.y).put(min.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(min.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(max.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(max.x).put(min.y).put(max.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(min.x).put(min.y).put(max.z).put(0.0f).put(-1.0f).put(0.0f);
		fv.put(min.x).put(min.y).put(min.z).put(0.0f).put(-1.0f).put(0.0f);
	}

	/**
	 * Create the frame buffer object that our rasterizer uses to render the
	 * view-space position and normal into the textures.
	 *
	 * @return the FBO id
	 */
	private void createRasterFrameBufferObject() {
		this.fbo = glGenFramebuffers();
		this.depthBuffer = glGenRenderbuffers();
		glBindFramebuffer(GL_FRAMEBUFFER, fbo);
		glBindRenderbuffer(GL_RENDERBUFFER, depthBuffer);
		glRenderbufferStorage(GL_RENDERBUFFER, GL_DEPTH_COMPONENT, width, height);
		glFramebufferTexture2D(GL_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, GL_TEXTURE_2D, positionTexture, 0);
		glFramebufferTexture2D(GL_FRAMEBUFFER, GL_COLOR_ATTACHMENT1, GL_TEXTURE_2D, normalTexture, 0);
		glFramebufferRenderbuffer(GL_FRAMEBUFFER, GL_DEPTH_ATTACHMENT, GL_RENDERBUFFER, depthBuffer);
		int fboStatus = glCheckFramebufferStatus(GL_FRAMEBUFFER);
		if (fboStatus != GL_FRAMEBUFFER_COMPLETE) {
			throw new AssertionError("Could not create FBO: " + fboStatus);
		}
		glBindFramebuffer(GL_FRAMEBUFFER, 0);
		glBindRenderbuffer(GL_RENDERBUFFER, 0);
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
	private static int createShader(String resource, int type) throws IOException {
		int shader = glCreateShader(type);

		ByteBuffer source = ioResourceToByteBuffer(resource, 8192);

		PointerBuffer strings = BufferUtils.createPointerBuffer(1);
		IntBuffer lengths = BufferUtils.createIntBuffer(1);

		strings.put(0, source);
		lengths.put(0, source.remaining());

		glShaderSource(shader, strings, lengths);
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
	 * @return that program id
	 *
	 * @throws IOException
	 */
	private static int createQuadProgram() throws IOException {
		int quadProgram = glCreateProgram();
		int vshader = createShader("demo/raytracing/quad.vs", GL_VERTEX_SHADER);
		int fshader = createShader("demo/raytracing/quad.fs", GL_FRAGMENT_SHADER);
		glAttachShader(quadProgram, vshader);
		glAttachShader(quadProgram, fshader);
		glBindAttribLocation(quadProgram, 0, "vertex");
		glBindFragDataLocation(quadProgram, 0, "color");
		glLinkProgram(quadProgram);
		int linked = glGetProgrami(quadProgram, GL_LINK_STATUS);
		String programLog = glGetProgramInfoLog(quadProgram);
		if (!programLog.trim().isEmpty()) {
			System.err.println(programLog);
		}
		if (linked == 0) {
			throw new AssertionError("Could not link program");
		}
		return quadProgram;
	}

	/**
	 * Create the raster shader.
	 *
	 * @return that program id
	 *
	 * @throws IOException
	 */
	private static int createRasterProgram() throws IOException {
		int quadProgram = glCreateProgram();
		int vshader = createShader("demo/raytracing/raster.vs", GL_VERTEX_SHADER);
		int fshader = createShader("demo/raytracing/raster.fs", GL_FRAGMENT_SHADER);
		glAttachShader(quadProgram, vshader);
		glAttachShader(quadProgram, fshader);
		glBindAttribLocation(quadProgram, 0, "vertexPosition");
		glBindAttribLocation(quadProgram, 1, "vertexNormal");
		glBindFragDataLocation(quadProgram, 0, "worldPosition_out");
		glBindFragDataLocation(quadProgram, 1, "worldNormal_out");
		glLinkProgram(quadProgram);
		int linked = glGetProgrami(quadProgram, GL_LINK_STATUS);
		String programLog = glGetProgramInfoLog(quadProgram);
		if (!programLog.trim().isEmpty()) {
			System.err.println(programLog);
		}
		if (linked == 0) {
			throw new AssertionError("Could not link program");
		}
		return quadProgram;
	}

	/**
	 * Create the tracing compute shader program.
	 *
	 * @return that program id
	 *
	 * @throws IOException
	 */
	private static int createComputeProgram() throws IOException {
		int program = glCreateProgram();
		int cshader = createShader("demo/raytracing/hybrid.glsl", GL_COMPUTE_SHADER);
		int random = createShader("demo/raytracing/random.glsl", GL_COMPUTE_SHADER);
		glAttachShader(program, cshader);
		glAttachShader(program, random);
		glLinkProgram(program);
		int linked = glGetProgrami(program, GL_LINK_STATUS);
		String programLog = glGetProgramInfoLog(program);
		if (!programLog.trim().isEmpty()) {
			System.err.println(programLog);
		}
		if (linked == 0) {
			throw new AssertionError("Could not link program");
		}
		return program;
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
	 * Initialize the raster program.
	 */
	private void initRasterProgram() {
		glUseProgram(rasterProgram);
		modelViewMatrixUniform = glGetUniformLocation(rasterProgram, "modelViewMatrix");
		projectionMatrixUniform = glGetUniformLocation(rasterProgram, "projectionMatrix");
		normalMatrixUniform = glGetUniformLocation(rasterProgram, "normalMatrix");
		glUseProgram(0);
	}

	/**
	 * Initialize the compute shader.
	 */
	private void initComputeProgram() {
		glUseProgram(computeProgram);
		IntBuffer workGroupSize = BufferUtils.createIntBuffer(3);
		glGetProgram(computeProgram, GL_COMPUTE_WORK_GROUP_SIZE, workGroupSize);
		workGroupSizeX = workGroupSize.get(0);
		workGroupSizeY = workGroupSize.get(1);
		eyeUniform = glGetUniformLocation(computeProgram, "eye");
		ray00Uniform = glGetUniformLocation(computeProgram, "ray00");
		ray10Uniform = glGetUniformLocation(computeProgram, "ray10");
		ray01Uniform = glGetUniformLocation(computeProgram, "ray01");
		ray11Uniform = glGetUniformLocation(computeProgram, "ray11");
		timeUniform = glGetUniformLocation(computeProgram, "time");
		blendFactorUniform = glGetUniformLocation(computeProgram, "blendFactor");
		samplesPerFrameCountUniform = glGetUniformLocation(computeProgram, "sampleCount");
		bounceCountUniform = glGetUniformLocation(computeProgram, "bounceCount");
		glUseProgram(0);
	}

	/**
	 * Create the textures that will serve as our framebuffer.
	 *
	 * @return the texture id
	 */
	private void createRaytracingTexture() {
		this.raytraceTexture = glGenTextures();
		glBindTexture(GL_TEXTURE_2D, raytraceTexture);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
		glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA32F, width, height, 0, GL_RGBA, GL_FLOAT, (ByteBuffer) null);
		glBindTexture(GL_TEXTURE_2D, 0);
	}

	private void createRasterizerTextures() {
		this.positionTexture = glGenTextures();
		glBindTexture(GL_TEXTURE_2D, positionTexture);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
		glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA32F, width, height, 0, GL_RGBA, GL_FLOAT, (ByteBuffer) null);
		glBindTexture(GL_TEXTURE_2D, 0);

		this.normalTexture = glGenTextures();
		glBindTexture(GL_TEXTURE_2D, normalTexture);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
		glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA16F, width, height, 0, GL_RGBA, GL_FLOAT, (ByteBuffer) null);
		glBindTexture(GL_TEXTURE_2D, 0);
	}

	private void resizeFramebufferTexture() {
		glDeleteTextures(raytraceTexture);
		glDeleteTextures(positionTexture);
		glDeleteTextures(normalTexture);
		glDeleteRenderbuffers(depthBuffer);
		glDeleteFramebuffers(fbo);

		createRaytracingTexture();
		createRasterizerTextures();
		createRasterFrameBufferObject();
	}

	private void update() {
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
			camera.setFrustumPerspective(60.0f, (float) width / height, 0.01f, 100.0f);
			resizeFramebufferTexture();
			resetFramebuffer = false;
		}
	}

	private void setUniform(int location, Matrix4f value, boolean transpose) {
		matrixByteBufferFloatView.rewind();
		matrixByteBufferFloatView.put(value.m00).put(value.m10).put(value.m20).put(value.m30).put(value.m01)
				.put(value.m11).put(value.m21).put(value.m31).put(value.m02).put(value.m12).put(value.m22)
				.put(value.m32).put(value.m03).put(value.m13).put(value.m23).put(value.m33);
		glUniformMatrix4f(location, 1, transpose, matrixByteBuffer);
	}

	private void raster() {
		glEnable(GL_DEPTH_TEST);
		glUseProgram(rasterProgram);

		/* Update matrices in shader */
		Matrix4f viewMatrix = camera.getViewMatrix();
		setUniform(modelViewMatrixUniform, viewMatrix, false);
		Matrix4f projMatrix = camera.getProjectionMatrix();
		setUniform(projectionMatrixUniform, projMatrix, false);
		normalMatrix.set(camera.getViewMatrix());
		normalMatrix.invert();
		setUniform(normalMatrixUniform, normalMatrix, true);

		glBindFramebuffer(GL_FRAMEBUFFER, fbo);
		glDrawBuffers(2, renderBuffers);
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		glBindVertexArray(vaoScene);
		glDrawArrays(GL_TRIANGLES, 0, 6 * 6 * boxes.length);
		glBindVertexArray(0);
		glBindFramebuffer(GL_FRAMEBUFFER, 0);
		glUseProgram(0);
	}

	/**
	 * Compute one frame by tracing the scene using our compute shader and
	 * presenting that image on the screen.
	 */
	private void trace() {
		glUseProgram(computeProgram);
		glDisable(GL_DEPTH_TEST);

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

		glUniform1i(samplesPerFrameCountUniform, samplesPerFrameCount);
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
		glBindImageTexture(0, raytraceTexture, 0, false, 0, GL_READ_WRITE, GL_RGBA32F);
		/* Bind level 1 and 2 to our rasterized images */
		glBindImageTexture(1, positionTexture, 0, false, 0, GL_READ_ONLY, GL_RGBA32F);
		glBindImageTexture(2, normalTexture, 0, false, 0, GL_READ_ONLY, GL_RGBA16F);

		/* Compute appropriate invocation dimension. */
		int worksizeX = mathRoundPoT(width);
		int worksizeY = mathRoundPoT(height);

		/* Invoke the compute shader. */
		glDispatchCompute(worksizeX / workGroupSizeX, worksizeY / workGroupSizeY, 1);

		/* Reset image binding. */
		glBindImageTexture(0, 0, 0, false, 0, GL_READ_WRITE, GL_RGBA32F);
		glBindImageTexture(1, 0, 0, false, 0, GL_READ_ONLY, GL_RGBA32F);
		glBindImageTexture(2, 0, 0, false, 0, GL_READ_ONLY, GL_RGBA16F);
		glMemoryBarrier(GL_SHADER_IMAGE_ACCESS_BARRIER_BIT);
		glUseProgram(0);

		/*
		 * Draw the rendered image on the screen using textured full-screen
		 * quad.
		 */
		glUseProgram(quadProgram);
		glBindVertexArray(vao);
		glBindTexture(GL_TEXTURE_2D, raytraceTexture);
		glDrawArrays(GL_TRIANGLES, 0, 6);
		glBindTexture(GL_TEXTURE_2D, 0);
		glBindVertexArray(0);
		glUseProgram(0);

		frameNumber++;
	}

	private void loop() {
		while (glfwWindowShouldClose(window) == GL_FALSE) {
			glfwPollEvents();
			glViewport(0, 0, width, height);

			update();
			raster();
			trace();

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
		new HybridDemo().run();
	}

}