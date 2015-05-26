/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opengl.raytracing;

import org.lwjgl.BufferUtils;
import org.lwjgl.demo.opengl.DemoUtils;
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
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL31.*;
import static org.lwjgl.opengl.GL33.*;
import static org.lwjgl.opengl.GL42.*;
import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This demo is used to showcase hybrid rasterization and ray tracing to make
 * the first bounce faster.
 * <p>
 * It works like the {@link HybridDemoSsbo}, but uses hardware instancing to
 * rasterize the boxes. It won't be any faster, but will use less GPU memory as
 * we only need to create a small VBO containing a unit axis-aligned box and a
 * buffer with per-instance box data (position and size).
 * 
 * @author Kai Burjack
 */
public class HybridDemoSsboInstancing {

	/**
	 * The boxes for both rasterization and ray tracing.
	 */
	private static Vector3f[] boxes = Scene.boxes;

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
	private int ssbo;
	private int sampler;

	private int eyeUniform;
	private int ray00Uniform;
	private int ray10Uniform;
	private int ray01Uniform;
	private int ray11Uniform;
	private int timeUniform;
	private int blendFactorUniform;
	private int bounceCountUniform;
	private int boxesSsboBinding;
	private int framebufferImageBinding;
	private int worldPositionImageBinding;
	private int worldNormalImageBinding;

	private int viewMatrixUniform;
	private int projectionMatrixUniform;

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
	private ByteBuffer matrixByteBuffer = BufferUtils.createByteBuffer(4 * 16);
	private FloatBuffer matrixByteBufferFloatView = matrixByteBuffer.asFloatBuffer();

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
					System.err.println("This demo requires OpenGL 4.3 or higher.");
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

		window = glfwCreateWindow(width, height,
				"Raytracing Demo - compute shader (with SSBO) + raster (with instancing)", NULL, NULL);
		if (window == NULL) {
			throw new AssertionError("Failed to create the GLFW window");
		}

		System.out.println("Press keypad '+' or 'page up' to increase the number of bounces.");
		System.out.println("Press keypad '-' or 'page down' to decrease the number of bounces.");
		glfwSetKeyCallback(window, keyCallback = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				if (action != GLFW_RELEASE)
					return;

				if (key == GLFW_KEY_ESCAPE) {
					glfwSetWindowShouldClose(window, GL_TRUE);
				} else if (key == GLFW_KEY_KP_ADD || key == GLFW_KEY_PAGE_UP) {
					int newBounceCount = Math.min(4, HybridDemoSsboInstancing.this.bounceCount + 1);
					if (newBounceCount != HybridDemoSsboInstancing.this.bounceCount) {
						HybridDemoSsboInstancing.this.bounceCount = newBounceCount;
						System.out.println("Ray bounce count is now: " + HybridDemoSsboInstancing.this.bounceCount);
						HybridDemoSsboInstancing.this.frameNumber = 0;
					}
				} else if (key == GLFW_KEY_KP_SUBTRACT || key == GLFW_KEY_PAGE_DOWN) {
					int newBounceCount = Math.max(1, HybridDemoSsboInstancing.this.bounceCount - 1);
					if (newBounceCount != HybridDemoSsboInstancing.this.bounceCount) {
						HybridDemoSsboInstancing.this.bounceCount = newBounceCount;
						System.out.println("Ray bounce count is now: " + HybridDemoSsboInstancing.this.bounceCount);
						HybridDemoSsboInstancing.this.frameNumber = 0;
					}
				}
			}
		});

		glfwSetFramebufferSizeCallback(window, fbCallback = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				if ( width > 0
				     && height > 0
				     && (HybridDemoSsboInstancing.this.width != width || HybridDemoSsboInstancing.this.height != height) ) {
					HybridDemoSsboInstancing.this.width = width;
					HybridDemoSsboInstancing.this.height = height;
					HybridDemoSsboInstancing.this.resetFramebuffer = true;
					HybridDemoSsboInstancing.this.frameNumber = 0;
				}
			}
		});

		glfwSetCursorPosCallback(window, cpCallback = new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double x, double y) {
				HybridDemoSsboInstancing.this.mouseX = (float)x;
				if ( mouseDown ) {
					HybridDemoSsboInstancing.this.frameNumber = 0;
				}
			}
		});

		glfwSetMouseButtonCallback(window, mbCallback = new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
				if ( action == GLFW_PRESS ) {
					HybridDemoSsboInstancing.this.mouseDownX = HybridDemoSsboInstancing.this.mouseX;
					HybridDemoSsboInstancing.this.mouseDown = true;
				} else if ( action == GLFW_RELEASE ) {
					HybridDemoSsboInstancing.this.mouseDown = false;
					HybridDemoSsboInstancing.this.rotationAboutY = HybridDemoSsboInstancing.this.currRotationAboutY;
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
		createRaytracingTexture();
		createSampler();
		createRasterizerTextures();
		createRasterFrameBufferObject();
		createSceneSSBO();
		createFullScreenVao();
		createSceneVao();
		createRasterProgram();
		initRasterProgram();
		createComputeProgram();
		initComputeProgram();
		createQuadProgram();
		initQuadProgram();

		glEnable(GL_DEPTH_TEST);
		glEnable(GL_CULL_FACE);

		/* Setup camera */
		camera = new Camera();

		firstTime = System.nanoTime();
	}

	/**
	 * Create a Shader Storage Buffer Object which will hold our boxes to be
	 * read by our Compute Shader.
	 */
	private void createSceneSSBO() {
		this.ssbo = glGenBuffers();
		glBindBuffer(GL_SHADER_STORAGE_BUFFER, ssbo);
		ByteBuffer ssboData = BufferUtils.createByteBuffer(4 * (4 + 4) * boxes.length / 2);
		FloatBuffer fv = ssboData.asFloatBuffer();
		for (int i = 0; i < boxes.length; i += 2) {
			Vector3f min = boxes[i];
			Vector3f max = boxes[i + 1];
			/*
			 * NOTE: We need to write vec4 here, because SSBOs have specific
			 * alignment requirements for struct members (vec3 is always treated
			 * as vec4 in memory!)
			 * 
			 * See:
			 * "https://www.safaribooksonline.com/library/view/opengl-programming-guide/9780132748445/app09lev1sec3.html"
			 */
			fv.put(min.x).put(min.y).put(min.z).put(0.0f);
			fv.put(max.x).put(max.y).put(max.z).put(0.0f);
		}
		glBufferData(GL_SHADER_STORAGE_BUFFER, ssboData, GL_STATIC_DRAW);
		glBindBuffer(GL_SHADER_STORAGE_BUFFER, 0);
	}

	/**
	 * Creates a VAO with a full-screen quad VBO.
	 */
	private void createFullScreenVao() {
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
	 * Creates a VAO for the scene.
	 */
	private void createSceneVao() {
		int vao = glGenVertexArrays();

		/* Create vertex data */
		int vbo = glGenBuffers();
		glBindVertexArray(vao);
		glBindBuffer(GL_ARRAY_BUFFER, vbo);
		ByteBuffer bb = BufferUtils.createByteBuffer(4 * (3 + 3) * 6 * 6);
		FloatBuffer fv = bb.asFloatBuffer();
		DemoUtils.triangulateUnitBox(fv);
		glBufferData(GL_ARRAY_BUFFER, bb, GL_STATIC_DRAW);
		glEnableVertexAttribArray(0);
		glVertexAttribPointer(0, 3, GL_FLOAT, false, 4 * (3 + 3), 0L);
		glEnableVertexAttribArray(1);
		glVertexAttribPointer(1, 3, GL_FLOAT, false, 4 * (3 + 3), 4 * 3);
		glBindBuffer(GL_ARRAY_BUFFER, 0);

		/* Create per instance data (position and size of box) */
		int ivbo = glGenBuffers();
		glBindBuffer(GL_ARRAY_BUFFER, ivbo);
		bb = BufferUtils.createByteBuffer(4 * (3 + 3) * boxes.length);
		fv = bb.asFloatBuffer();
		for (int i = 0; i < boxes.length; i += 2) {
			Vector3f min = boxes[i];
			Vector3f max = boxes[i + 1];
			fv.put((max.x + min.x) / 2.0f).put((max.y + min.y) / 2.0f).put((max.z + min.z) / 2.0f);
			fv.put((max.x - min.x) / 2.0f).put((max.y - min.y) / 2.0f).put((max.z - min.z) / 2.0f);
		}
		glBufferData(GL_ARRAY_BUFFER, bb, GL_STATIC_DRAW);
		glEnableVertexAttribArray(2);
		glVertexAttribPointer(2, 3, GL_FLOAT, false, 4 * (3 + 3), 0L);
		glVertexAttribDivisor(2, 1);
		glEnableVertexAttribArray(3);
		glVertexAttribPointer(3, 3, GL_FLOAT, false, 4 * (3 + 3), 4 * 3);
		glVertexAttribDivisor(3, 1);
		glBindBuffer(GL_ARRAY_BUFFER, 0);
		glBindVertexArray(0);
		this.vaoScene = vao;
	}

	/**
	 * Create the frame buffer object that our rasterizer uses to render the
	 * view-space position and normal into the textures.
	 */
	private void createRasterFrameBufferObject() {
		this.fbo = glGenFramebuffers();
		this.depthBuffer = glGenRenderbuffers();
		glBindFramebuffer(GL_FRAMEBUFFER, fbo);
		IntBuffer renderBuffers = BufferUtils.createIntBuffer(2).put(GL_COLOR_ATTACHMENT0).put(GL_COLOR_ATTACHMENT1);
		renderBuffers.flip();
		glDrawBuffers(renderBuffers);
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
	 * Create the raster shader.
	 *
	 * @throws IOException
	 */
	private void createRasterProgram() throws IOException {
		int program = glCreateProgram();
		int vshader = Demo.createShader("demo/raytracing/rasterInstanced.vs", GL_VERTEX_SHADER);
		int fshader = Demo.createShader("demo/raytracing/raster.fs", GL_FRAGMENT_SHADER);
		glAttachShader(program, vshader);
		glAttachShader(program, fshader);
		glBindAttribLocation(program, 0, "vertexPosition");
		glBindAttribLocation(program, 1, "vertexNormal");
		glBindAttribLocation(program, 2, "boxCenter");
		glBindAttribLocation(program, 3, "boxHalfSize");
		glBindFragDataLocation(program, 0, "worldPosition_out");
		glBindFragDataLocation(program, 1, "worldNormal_out");
		glLinkProgram(program);
		int linked = glGetProgrami(program, GL_LINK_STATUS);
		String programLog = glGetProgramInfoLog(program);
		if (!programLog.trim().isEmpty()) {
			System.err.println(programLog);
		}
		if (linked == 0) {
			throw new AssertionError("Could not link program");
		}
		this.rasterProgram = program;
	}

	/**
	 * Create the tracing compute shader program.
	 *
	 * @throws IOException
	 */
	private void createComputeProgram() throws IOException {
		int program = glCreateProgram();
		int cshader = Demo.createShader("demo/raytracing/hybridSsbo.glsl", GL_COMPUTE_SHADER);
		int random = Demo.createShader("demo/raytracing/random.glsl", GL_COMPUTE_SHADER);
		int randomCommon = Demo.createShader("demo/raytracing/randomCommon.glsl", GL_COMPUTE_SHADER);
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
	 * Initialize the raster program.
	 */
	private void initRasterProgram() {
		glUseProgram(rasterProgram);
		viewMatrixUniform = glGetUniformLocation(rasterProgram, "viewMatrix");
		projectionMatrixUniform = glGetUniformLocation(rasterProgram, "projectionMatrix");
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
		/* Query the binding point of the SSBO */
		/*
		 * First, obtain the "resource index" used for further queries on that
		 * resource.
		 */
		int boxesResourceIndex = glGetProgramResourceIndex(computeProgram, GL_SHADER_STORAGE_BLOCK, "Boxes");
		IntBuffer props = BufferUtils.createIntBuffer(1);
		IntBuffer params = BufferUtils.createIntBuffer(1);
		props.put(0, GL_BUFFER_BINDING);
		/* Now query the "BUFFER_BINDING" of that resource */
		glGetProgramResourceiv(computeProgram, GL_SHADER_STORAGE_BLOCK, boxesResourceIndex, props, null, params);
		boxesSsboBinding = params.get(0);

		/* Query the "image binding point" of the image uniforms */
		int loc = glGetUniformLocation(computeProgram, "framebufferImage");
		glGetUniformiv(computeProgram, loc, params);
		framebufferImageBinding = params.get(0);
		loc = glGetUniformLocation(computeProgram, "worldPositionImage");
		glGetUniformiv(computeProgram, loc, params);
		worldPositionImageBinding = params.get(0);
		loc = glGetUniformLocation(computeProgram, "worldNormalImage");
		glGetUniformiv(computeProgram, loc, params);
		worldNormalImageBinding = params.get(0);

		glUseProgram(0);
	}

	/**
	 * Create the texture that will serve as our framebuffer for the ray tracer.
	 */
	private void createRaytracingTexture() {
		this.raytraceTexture = glGenTextures();
		glBindTexture(GL_TEXTURE_2D, raytraceTexture);
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
	 * Create the textures that the rasterizer renders into.
	 */
	private void createRasterizerTextures() {
		this.positionTexture = glGenTextures();
		glBindTexture(GL_TEXTURE_2D, positionTexture);
		glTexStorage2D(GL_TEXTURE_2D, 1, GL_RGBA32F, width, height);
		glBindTexture(GL_TEXTURE_2D, 0);

		this.normalTexture = glGenTextures();
		glBindTexture(GL_TEXTURE_2D, normalTexture);
		glTexStorage2D(GL_TEXTURE_2D, 1, GL_RGBA16F, width, height);
		glBindTexture(GL_TEXTURE_2D, 0);
	}

	/**
	 * Resize the framebuffer textures for both rasterization and ray tracing.
	 */
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

	/**
	 * Set the given {@link Matrix4f matrix} as a 4x4 uniform in the active
	 * shader.
	 * 
	 * @param location
	 *            the uniform location of the mat4 uniform
	 * @param value
	 *            the {@link Matrix4f matrix} to set
	 * @param transpose
	 *            whether the matrix should be transposed (automatic row-major
	 *            to column-major transposition is done automatically on top of
	 *            that)
	 */
	private void matrixUniform(int location, Matrix4f value, boolean transpose) {
		matrixByteBufferFloatView.put(value.m00).put(value.m10).put(value.m20).put(value.m30).put(value.m01)
				.put(value.m11).put(value.m21).put(value.m31).put(value.m02).put(value.m12).put(value.m22)
				.put(value.m32).put(value.m03).put(value.m13).put(value.m23).put(value.m33);
		matrixByteBufferFloatView.rewind();
		glUniformMatrix4fv(location, 1, transpose, matrixByteBuffer);
	}

	/**
	 * Rasterize the scene and write depth and position data into framebuffer
	 * textures.
	 */
	private void raster() {
		glEnable(GL_DEPTH_TEST);
		glUseProgram(rasterProgram);

		/* Update matrices in shader */
		Matrix4f viewMatrix = camera.getViewMatrix();
		matrixUniform(viewMatrixUniform, viewMatrix, false);
		Matrix4f projMatrix = camera.getProjectionMatrix();
		matrixUniform(projectionMatrixUniform, projMatrix, false);

		/* Rasterize the boxes into the FBO */
		glBindFramebuffer(GL_FRAMEBUFFER, fbo);
		glClear(GL_DEPTH_BUFFER_BIT);
		glBindVertexArray(vaoScene);
		glDrawArraysInstanced(GL_TRIANGLES, 0, 6 * 6, boxes.length / 2);
		glBindVertexArray(0);
		glBindFramebuffer(GL_FRAMEBUFFER, 0);
		glUseProgram(0);
	}

	/**
	 * Compute one frame by tracing the scene using our compute shader.
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
		glBindImageTexture(framebufferImageBinding, raytraceTexture, 0, false, 0, GL_READ_WRITE, GL_RGBA32F);
		/* Bind level 1 and 2 to our rasterized images */
		glBindImageTexture(worldPositionImageBinding, positionTexture, 0, false, 0, GL_READ_ONLY, GL_RGBA32F);
		glBindImageTexture(worldNormalImageBinding, normalTexture, 0, false, 0, GL_READ_ONLY, GL_RGBA16F);

		/* Bind the SSBO containing our boxes */
		glBindBufferBase(GL_SHADER_STORAGE_BUFFER, boxesSsboBinding, ssbo);

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
		glBindBufferBase(GL_SHADER_STORAGE_BUFFER, boxesSsboBinding, 0);
		glBindImageTexture(framebufferImageBinding, 0, 0, false, 0, GL_READ_WRITE, GL_RGBA32F);
		glBindImageTexture(worldPositionImageBinding, 0, 0, false, 0, GL_READ_ONLY, GL_RGBA32F);
		glBindImageTexture(worldNormalImageBinding, 0, 0, false, 0, GL_READ_ONLY, GL_RGBA16F);
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
		glBindTexture(GL_TEXTURE_2D, raytraceTexture);
		glBindSampler(0, this.sampler);
		glDrawArrays(GL_TRIANGLES, 0, 6);
		glBindSampler(0, 0);
		glBindTexture(GL_TEXTURE_2D, 0);
		glBindVertexArray(0);
		glUseProgram(0);
	}

	/**
	 * This is the main loop, continuously updating the camera and rendering the
	 * scene.
	 */
	private void loop() {
		while (glfwWindowShouldClose(window) == GL_FALSE) {
			glfwPollEvents();
			glViewport(0, 0, width, height);

			/* Update everything */
			update();
			/* Raster the scene */
			raster();
			/* Trace the scene */
			trace();
			/* Render and present the final image */
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
		new HybridDemoSsboInstancing().run();
	}

}
