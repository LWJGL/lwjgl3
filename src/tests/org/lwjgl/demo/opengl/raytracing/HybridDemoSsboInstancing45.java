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
import static org.lwjgl.opengl.GL44.*;
import static org.lwjgl.opengl.GL45.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This demo is identical to {@link HybridDemoSsboInstancing}, except that only
 * the very latest OpenGL functionality and the most modern way of doing things
 * is being used, such as DSA texture and buffer creation and update API as well
 * as the new DSA vertex binding/attribute setup functions introduced with
 * OpenGL 4.5.
 * 
 * @author Kai Burjack
 */
public class HybridDemoSsboInstancing45 {

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

	private static final int COMPUTE_UBO_BUFFER_SIZE = 4 * (4 + 4 + 4 + 4 + 4
			+ 1 + 1);
	private static final int RASTER_UBO_BUFFER_SIZE = 4 * (16 + 16);
	private static final int ALL_UBO_BUFFER_SIZES = Math.max(
			COMPUTE_UBO_BUFFER_SIZE, RASTER_UBO_BUFFER_SIZE);
	private ByteBuffer uboBuffer = BufferUtils
			.createByteBuffer(ALL_UBO_BUFFER_SIZES);
	private FloatBuffer uboBufferFv = uboBuffer.asFloatBuffer();
	private IntBuffer uboBufferIv = uboBuffer.asIntBuffer();
	private int ubo;
	private int computeUboBinding;
	private int rasterUboBinding;
	private int boxesSsboBinding;
	private int framebufferImageBinding;
	private int worldPositionImageBinding;
	private int worldNormalImageBinding;

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
		 * Tell LWJGL that we only want 4.5 functionality.
		 */
		System.setProperty("org.lwjgl.opengl.maxVersion", "4.5");
	}

	private void init() throws IOException {
		glfwSetErrorCallback(errCallback = new GLFWErrorCallback() {
			private GLFWErrorCallback delegate = Callbacks
					.errorCallbackPrint(System.err);

			@Override
			public void invoke(int error, long description) {
				if (error == GLFW_VERSION_UNAVAILABLE)
					System.err
							.println("This demo requires OpenGL 4.5 or higher.");
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
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 5);
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);

		window = glfwCreateWindow(
				width,
				height,
				"Raytracing Demo - compute shader (with SSBO) + raster (with instancing)",
				NULL, NULL);
		if (window == NULL) {
			throw new AssertionError("Failed to create the GLFW window");
		}

		System.out
				.println("Press keypad '+' or 'page up' to increase the number of bounces.");
		System.out
				.println("Press keypad '-' or 'page down' to decrease the number of bounces.");
		glfwSetKeyCallback(window, keyCallback = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action,
					int mods) {
				if (action != GLFW_RELEASE)
					return;

				if (key == GLFW_KEY_ESCAPE) {
					glfwSetWindowShouldClose(window, GL_TRUE);
				} else if (key == GLFW_KEY_KP_ADD || key == GLFW_KEY_PAGE_UP) {
					int newBounceCount = Math.min(4,
							HybridDemoSsboInstancing45.this.bounceCount + 1);
					if (newBounceCount != HybridDemoSsboInstancing45.this.bounceCount) {
						HybridDemoSsboInstancing45.this.bounceCount = newBounceCount;
						System.out.println("Ray bounce count is now: "
								+ HybridDemoSsboInstancing45.this.bounceCount);
						HybridDemoSsboInstancing45.this.frameNumber = 0;
					}
				} else if (key == GLFW_KEY_KP_SUBTRACT
						|| key == GLFW_KEY_PAGE_DOWN) {
					int newBounceCount = Math.max(1,
							HybridDemoSsboInstancing45.this.bounceCount - 1);
					if (newBounceCount != HybridDemoSsboInstancing45.this.bounceCount) {
						HybridDemoSsboInstancing45.this.bounceCount = newBounceCount;
						System.out.println("Ray bounce count is now: "
								+ HybridDemoSsboInstancing45.this.bounceCount);
						HybridDemoSsboInstancing45.this.frameNumber = 0;
					}
				}
			}
		});

		glfwSetFramebufferSizeCallback(window,
				fbCallback = new GLFWFramebufferSizeCallback() {
					@Override
					public void invoke(long window, int width, int height) {
						if (width > 0
								&& height > 0
								&& (HybridDemoSsboInstancing45.this.width != width || HybridDemoSsboInstancing45.this.height != height)) {
							HybridDemoSsboInstancing45.this.width = width;
							HybridDemoSsboInstancing45.this.height = height;
							HybridDemoSsboInstancing45.this.resetFramebuffer = true;
							HybridDemoSsboInstancing45.this.frameNumber = 0;
						}
					}
				});

		glfwSetCursorPosCallback(window,
				cpCallback = new GLFWCursorPosCallback() {
					@Override
					public void invoke(long window, double x, double y) {
						HybridDemoSsboInstancing45.this.mouseX = (float) x;
						if (mouseDown) {
							HybridDemoSsboInstancing45.this.frameNumber = 0;
						}
					}
				});

		glfwSetMouseButtonCallback(window,
				mbCallback = new GLFWMouseButtonCallback() {
					@Override
					public void invoke(long window, int button, int action,
							int mods) {
						if (action == GLFW_PRESS) {
							HybridDemoSsboInstancing45.this.mouseDownX = HybridDemoSsboInstancing45.this.mouseX;
							HybridDemoSsboInstancing45.this.mouseDown = true;
						} else if (action == GLFW_RELEASE) {
							HybridDemoSsboInstancing45.this.mouseDown = false;
							HybridDemoSsboInstancing45.this.rotationAboutY = HybridDemoSsboInstancing45.this.currRotationAboutY;
						}
					}
				});

		ByteBuffer vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
		glfwSetWindowPos(window, (GLFWvidmode.width(vidmode) - width) / 2,
				(GLFWvidmode.height(vidmode) - height) / 2);
		glfwMakeContextCurrent(window);
		glfwSwapInterval(0);
		glfwShowWindow(window);

		IntBuffer framebufferSize = BufferUtils.createIntBuffer(2);
		nglfwGetFramebufferSize(window, memAddress(framebufferSize),
				memAddress(framebufferSize) + 4);
		width = framebufferSize.get(0);
		height = framebufferSize.get(1);

		debugProc = GLContext.createFromCurrent().setupDebugMessageCallback(
				System.err);

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
		createUbo();

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
		this.ssbo = glCreateBuffers();
		ByteBuffer ssboData = BufferUtils.createByteBuffer(4 * (4 + 4 + 4)
				* boxes.length / 2);
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
		glNamedBufferData(this.ssbo, ssboData, GL_STATIC_DRAW);
	}

	/**
	 * Creates a VAO with a full-screen quad VBO.
	 */
	private void createFullScreenVao() {
		this.vao = glCreateVertexArrays();
		int vbo = glCreateBuffers();
		ByteBuffer bb = BufferUtils.createByteBuffer(4 * 2 * 6);
		FloatBuffer fv = bb.asFloatBuffer();
		fv.put(-1.0f).put(-1.0f);
		fv.put(1.0f).put(-1.0f);
		fv.put(1.0f).put(1.0f);
		fv.put(1.0f).put(1.0f);
		fv.put(-1.0f).put(1.0f);
		fv.put(-1.0f).put(-1.0f);
		glNamedBufferData(vbo, bb, GL_STATIC_DRAW);
		glEnableVertexArrayAttrib(this.vao, 0);
		glVertexArrayAttribFormat(this.vao, 0, 2, GL_FLOAT, false, 0);
		glVertexArrayVertexBuffer(this.vao, 0, vbo, 0L, 8);
		glVertexArrayAttribBinding(this.vao, 0, 0);
	}

	/**
	 * Creates a VAO for the scene.
	 */
	private void createSceneVao() {
		int vao = glCreateVertexArrays();

		/* Create vertex data */
		int vbo = glCreateBuffers();
		ByteBuffer bb = BufferUtils.createByteBuffer(4 * (3 + 3) * 6 * 6);
		FloatBuffer fv = bb.asFloatBuffer();
		DemoUtils.triangulateUnitBox(fv);
		glNamedBufferData(vbo, bb, GL_STATIC_DRAW);
		glEnableVertexArrayAttrib(vao, 0);
		glVertexArrayAttribFormat(vao, 0, 3, GL_FLOAT, false, 0);
		glVertexArrayVertexBuffer(vao, 0, vbo, 0L, 4 * (3 + 3));
		glVertexArrayAttribBinding(vao, 0, 0);
		glEnableVertexArrayAttrib(vao, 1);
		glVertexArrayAttribFormat(vao, 1, 3, GL_FLOAT, false, 0);
		glVertexArrayVertexBuffer(vao, 1, vbo, 4 * 3, 4 * (3 + 3));
		glVertexArrayAttribBinding(vao, 1, 1);

		/* Create per instance data (position and size of box) */
		int ivbo = glCreateBuffers();
		bb = BufferUtils.createByteBuffer(4 * (3 + 3) * boxes.length);
		fv = bb.asFloatBuffer();
		for (int i = 0; i < boxes.length; i += 2) {
			Vector3f min = boxes[i];
			Vector3f max = boxes[i + 1];
			fv.put((max.x + min.x) / 2.0f).put((max.y + min.y) / 2.0f)
					.put((max.z + min.z) / 2.0f);
			fv.put((max.x - min.x) / 2.0f).put((max.y - min.y) / 2.0f)
					.put((max.z - min.z) / 2.0f);
		}
		glNamedBufferData(ivbo, bb, GL_STATIC_DRAW);
		glEnableVertexArrayAttrib(vao, 2);
		glVertexArrayAttribFormat(vao, 2, 3, GL_FLOAT, false, 0);
		glVertexArrayVertexBuffer(vao, 2, ivbo, 0L, 4 * (3 + 3));
		glVertexArrayAttribBinding(vao, 2, 2);
		glVertexArrayBindingDivisor(vao, 2, 1);
		glEnableVertexArrayAttrib(vao, 3);
		glVertexArrayAttribFormat(vao, 3, 3, GL_FLOAT, false, 0);
		glVertexArrayVertexBuffer(vao, 3, ivbo, 4 * 3, 4 * (3 + 3));
		glVertexArrayAttribBinding(vao, 3, 3);
		glVertexArrayBindingDivisor(vao, 3, 1);
		this.vaoScene = vao;
	}

	/**
	 * Create the frame buffer object that our rasterizer uses to render the
	 * view-space position and normal into the textures.
	 */
	private void createRasterFrameBufferObject() {
		this.fbo = glCreateFramebuffers();
		this.depthBuffer = glCreateRenderbuffers();
		IntBuffer renderBuffers = BufferUtils.createIntBuffer(2).put(GL_COLOR_ATTACHMENT0).put(GL_COLOR_ATTACHMENT1);
		renderBuffers.flip();
		glNamedFramebufferDrawBuffers(this.fbo, renderBuffers);
		glNamedRenderbufferStorage(this.depthBuffer, GL_DEPTH_COMPONENT, width,
				height);
		glNamedFramebufferTexture(this.fbo, GL_COLOR_ATTACHMENT0,
				positionTexture, 0);
		glNamedFramebufferTexture(this.fbo, GL_COLOR_ATTACHMENT1,
				normalTexture, 0);
		glNamedFramebufferRenderbuffer(this.fbo, GL_DEPTH_ATTACHMENT,
				GL_RENDERBUFFER, depthBuffer);
		int fboStatus = glCheckNamedFramebufferStatus(this.fbo, GL_FRAMEBUFFER);
		if (fboStatus != GL_FRAMEBUFFER_COMPLETE) {
			throw new AssertionError("Could not create FBO: " + fboStatus);
		}
	}

	/**
	 * Create the full-scren quad shader.
	 *
	 * @throws IOException
	 */
	private void createQuadProgram() throws IOException {
		int program = glCreateProgram();
		int vshader = Demo.createShader("demo/raytracing/quad.vs",
				GL_VERTEX_SHADER, "330");
		int fshader = Demo.createShader("demo/raytracing/quad.fs",
				GL_FRAGMENT_SHADER, "330");
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
		int vshader = Demo.createShader(
				"demo/raytracing/rasterInstancedUbo.vs", GL_VERTEX_SHADER);
		int fshader = Demo.createShader("demo/raytracing/raster.fs",
				GL_FRAGMENT_SHADER);
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
		int cshader = Demo.createShader("demo/raytracing/hybridSsboUbo.glsl",
				GL_COMPUTE_SHADER);
		int random = Demo.createShader("demo/raytracing/random.glsl",
				GL_COMPUTE_SHADER);
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
		IntBuffer props = BufferUtils.createIntBuffer(1);
		IntBuffer params = BufferUtils.createIntBuffer(1);
		int uniformsResourceIndex = glGetProgramResourceIndex(rasterProgram,
				GL_UNIFORM_BLOCK, "Uniforms");
		computeUboBinding = params.get(0);
		props.put(0, GL_BUFFER_BINDING);
		glGetProgramResourceiv(rasterProgram, GL_UNIFORM_BLOCK,
				uniformsResourceIndex, props, null, params);
		rasterUboBinding = params.get(0);
	}

	/**
	 * Create the UBO for all programs.
	 */
	private void createUbo() {
		this.ubo = glCreateBuffers();
		glNamedBufferStorage(this.ubo, ALL_UBO_BUFFER_SIZES,
				GL_DYNAMIC_STORAGE_BIT);
	}

	/**
	 * Initialize the compute shader.
	 */
	private void initComputeProgram() {
		IntBuffer workGroupSize = BufferUtils.createIntBuffer(3);
		glGetProgramiv(computeProgram, GL_COMPUTE_WORK_GROUP_SIZE,
				workGroupSize);
		workGroupSizeX = workGroupSize.get(0);
		workGroupSizeY = workGroupSize.get(1);
		/* Query the binding point of the SSBO and UBO */
		/*
		 * First, obtain the "resource index" used for further queries on that
		 * resource.
		 */
		int boxesResourceIndex = glGetProgramResourceIndex(computeProgram,
				GL_SHADER_STORAGE_BLOCK, "Boxes");
		IntBuffer props = BufferUtils.createIntBuffer(1);
		IntBuffer params = BufferUtils.createIntBuffer(1);
		props.put(0, GL_BUFFER_BINDING);
		/* Now query the "BUFFER_BINDING" of that resource */
		glGetProgramResourceiv(computeProgram, GL_SHADER_STORAGE_BLOCK,
				boxesResourceIndex, props, null, params);
		boxesSsboBinding = params.get(0);

		int uniformsResourceIndex = glGetProgramResourceIndex(computeProgram,
				GL_UNIFORM_BLOCK, "Uniforms");
		glGetProgramResourceiv(computeProgram, GL_UNIFORM_BLOCK,
				uniformsResourceIndex, props, null, params);
		computeUboBinding = params.get(0);

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
	}

	/**
	 * Create the texture that will serve as our framebuffer for the ray tracer.
	 */
	private void createRaytracingTexture() {
		this.raytraceTexture = glCreateTextures(GL_TEXTURE_2D);
		glTextureStorage2D(this.raytraceTexture, 1, GL_RGBA32F, width, height);
	}

	/**
	 * Create the sampler to sample the framebuffer texture within the shader.
	 */
	private void createSampler() {
		this.sampler = glCreateSamplers();
		glSamplerParameteri(this.sampler, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
		glSamplerParameteri(this.sampler, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
	}

	/**
	 * Create the textures that the rasterizer renders into.
	 */
	private void createRasterizerTextures() {
		this.positionTexture = glCreateTextures(GL_TEXTURE_2D);
		glTextureStorage2D(this.positionTexture, 1, GL_RGBA32F, width, height);

		this.normalTexture = glCreateTextures(GL_TEXTURE_2D);
		glTextureStorage2D(this.normalTexture, 1, GL_RGBA16F, width, height);
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
		tmpVector.set((float) sin(-currRotationAboutY) * 3.0f, 2.0f,
				(float) cos(-currRotationAboutY) * 3.0f);
		camera.setLookAt(tmpVector, cameraLookAt, cameraUp);

		if (resetFramebuffer) {
			camera.setFrustumPerspective(60.0f, (float) width / height, 0.01f,
					100.0f);
			resizeFramebufferTexture();
			resetFramebuffer = false;
		}
	}

	private void putMatrix(Matrix4f value, FloatBuffer fb) {
		fb.put(value.m00).put(value.m10).put(value.m20).put(value.m30)
				.put(value.m01).put(value.m11).put(value.m21).put(value.m31)
				.put(value.m02).put(value.m12).put(value.m22).put(value.m32)
				.put(value.m03).put(value.m13).put(value.m23).put(value.m33);
	}

	/**
	 * Rasterize the scene and write depth and position data into framebuffer
	 * textures.
	 */
	private void raster() {
		updateRasterUbo();

		glEnable(GL_DEPTH_TEST);
		glUseProgram(rasterProgram);

		/* Rasterize the boxes into the FBO */
		glBindBufferBase(GL_UNIFORM_BUFFER, rasterUboBinding, ubo);
		glBindFramebuffer(GL_FRAMEBUFFER, fbo);
		glClear(GL_DEPTH_BUFFER_BIT);
		glBindVertexArray(vaoScene);
		glDrawArraysInstanced(GL_TRIANGLES, 0, 6 * 6, boxes.length / 2);
		glBindVertexArray(0);
		glBindFramebuffer(GL_FRAMEBUFFER, 0);
		glBindBufferBase(GL_UNIFORM_BUFFER, rasterUboBinding, 0);
		glUseProgram(0);
	}

	/**
	 * Compute one frame by tracing the scene using our compute shader.
	 */
	private void trace() {
		glUseProgram(computeProgram);
		glDisable(GL_DEPTH_TEST);

		/* Compute compute UBO */
		updateComputeUbo();

		/* Bind level 0 of framebuffer texture as writable image in the shader. */
		glBindImageTexture(framebufferImageBinding, raytraceTexture, 0, false,
				0, GL_READ_WRITE, GL_RGBA32F);
		/* Bind level 1 and 2 to our rasterized images */
		glBindImageTexture(worldPositionImageBinding, positionTexture, 0,
				false, 0, GL_READ_ONLY, GL_RGBA32F);
		glBindImageTexture(worldNormalImageBinding, normalTexture, 0, false, 0,
				GL_READ_ONLY, GL_RGBA16F);

		/* Bind the UBO */
		glBindBufferBase(GL_UNIFORM_BUFFER, computeUboBinding, ubo);
		/* Bind the SSBO containing our boxes */
		glBindBufferBase(GL_SHADER_STORAGE_BUFFER, boxesSsboBinding, ssbo);

		/* Compute appropriate invocation dimension. */
		int worksizeX = mathRoundPoT(width);
		int worksizeY = mathRoundPoT(height);

		/* Invoke the compute shader. */
		glDispatchCompute(worksizeX / workGroupSizeX, worksizeY
				/ workGroupSizeY, 1);

		/*
		 * Synchronize all writes to the framebuffer image before we let OpenGL
		 * source texels from it afterwards when rendering the final image with
		 * the full-screen quad.
		 */
		glMemoryBarrier(GL_SHADER_IMAGE_ACCESS_BARRIER_BIT);

		/* Reset bindings. */
		glBindBufferBase(GL_SHADER_STORAGE_BUFFER, boxesSsboBinding, 0);
		glBindBufferBase(GL_UNIFORM_BUFFER, computeUboBinding, 0);
		glBindImageTexture(framebufferImageBinding, 0, 0, false, 0,
				GL_READ_WRITE, GL_RGBA32F);
		glBindImageTexture(worldPositionImageBinding, 0, 0, false, 0,
				GL_READ_ONLY, GL_RGBA32F);
		glBindImageTexture(worldNormalImageBinding, 0, 0, false, 0,
				GL_READ_ONLY, GL_RGBA16F);
		glUseProgram(0);

		frameNumber++;
	}

	private void updateRasterUbo() {
		/* Update the UBO */
		Matrix4f viewMatrix = camera.getViewMatrix();
		Matrix4f projMatrix = camera.getProjectionMatrix();
		putMatrix(viewMatrix, uboBufferFv);
		putMatrix(projMatrix, uboBufferFv);
		uboBufferFv.rewind();
		glNamedBufferSubData(ubo, 0, RASTER_UBO_BUFFER_SIZE, uboBuffer);
	}

	private void updateComputeUbo() {
		long thisTime = System.nanoTime();
		float elapsedSeconds = (thisTime - firstTime) / 1E9f;

		/*
		 * We are going to average multiple successive frames, so here we
		 * compute the blend factor between old frame and new frame. 0.0 - use
		 * only the new frame > 0.0 - blend between old frame and new frame
		 */
		float blendFactor = (float) frameNumber / ((float) frameNumber + 1.0f);

		/* Update the UBO */
		uboBufferFv.put(camera.getPosition().x).put(camera.getPosition().y)
				.put(camera.getPosition().z).put(0.0f);
		camera.getEyeRay(-1, -1, tmpVector);
		uboBufferFv.put(tmpVector.x).put(tmpVector.y).put(tmpVector.z)
				.put(0.0f);
		camera.getEyeRay(-1, 1, tmpVector);
		uboBufferFv.put(tmpVector.x).put(tmpVector.y).put(tmpVector.z)
				.put(0.0f);
		camera.getEyeRay(1, -1, tmpVector);
		uboBufferFv.put(tmpVector.x).put(tmpVector.y).put(tmpVector.z)
				.put(0.0f);
		camera.getEyeRay(1, 1, tmpVector);
		uboBufferFv.put(tmpVector.x).put(tmpVector.y).put(tmpVector.z);
		uboBufferFv.put(blendFactor);
		uboBufferFv.put(elapsedSeconds);
		uboBufferIv.put(uboBufferFv.position(), bounceCount);
		uboBufferFv.rewind();
		glNamedBufferSubData(ubo, 0, COMPUTE_UBO_BUFFER_SIZE, uboBuffer);
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
		new HybridDemoSsboInstancing45().run();
	}

}
