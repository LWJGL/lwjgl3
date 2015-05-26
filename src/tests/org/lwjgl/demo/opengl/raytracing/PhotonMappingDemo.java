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
import org.lwjgl.opengl.ARBClearTexture;
import org.lwjgl.opengl.GLContext;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import static java.lang.Math.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL12.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL21.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL31.*;
import static org.lwjgl.opengl.GL33.*;
import static org.lwjgl.opengl.GL40.*;
import static org.lwjgl.opengl.GL42.*;
import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Photon mapping using cubemap array textures.
 * <p>
 * This demo uses a cube map array texture to hold a "photon map" for each of
 * the boxes in the scene.
 * <p>
 * A compute shader is used to shoot light rays into the scene and whenever they
 * hit a box the texel coordinate is computed and the "photon" is stored in the
 * corresponding face and layer of the cube map array image.
 * <p>
 * Afterwards, the scene is rasterized and the cube map array is sampled via a
 * samplerCubeArray. The boxes are rendered via hardware instancing and the
 * layer of the cube map array (i.e. the cube map for that particular box
 * instance) is obtained via the gl_InstanceID.
 * 
 * @author Kai Burjack
 */
public class PhotonMappingDemo {

	/**
	 * The boxes for both rasterization and ray tracing.
	 */
	private static Vector3f[] boxes = Scene.boxes;

	/**
	 * The resolution of the photon map for each box.
	 */
	private static int INITIAL_PHOTON_MAP_SIZE = 64;

	/**
	 * The number of photons to trace when doing a single photonmap computation.
	 * This is actually the square root of the number of photons, since we are
	 * using both dimension X and Y of the compute shader, with equal number of
	 * work items.
	 */
	private static int INITIAL_PHOTONS_PER_FRAME = 32;

	private GLContext ctx;

	private long window;
	private int width = 1024;
	private int height = 768;
	private boolean resetFramebuffer = true;
	private boolean clearPhotonMapTexture = false;
	private boolean recreatePhotonMapTexture = true;
	private int maxPhotonMapSize = 2048;
	private int maxPhotonsPerFrame = 2048;
	private int photonMapSize = INITIAL_PHOTON_MAP_SIZE;
	private int photonsPerFrame = INITIAL_PHOTONS_PER_FRAME;

	private int photonMapTexture;
	private int photonTraceProgram;
	private int rasterProgram;
	private int vaoScene;
	private int ssbo;
	private int sampler;

	private int timeUniform;
	private int lightCenterPositionUniform;
	private int lightRadiusUniform;
	private int boxesSsboBinding;
	private int photonMapsBinding;

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
	private float lightRadius = 0.4f;

	private Vector3f tmpVector = new Vector3f();
	private Vector3f cameraLookAt = new Vector3f(0.0f, 0.5f, 0.0f);
	private Vector3f cameraUp = new Vector3f(0.0f, 1.0f, 0.0f);
	private ByteBuffer matrixByteBuffer = BufferUtils.createByteBuffer(4 * 16);
	private FloatBuffer matrixByteBufferFloatView = matrixByteBuffer.asFloatBuffer();
	private Vector3f lightCenterPosition = new Vector3f(2.5f, 2.9f, 3);
	private ByteBuffer clearTexBuffer = BufferUtils.createByteBuffer(4);

	GLFWErrorCallback errCallback;
	GLFWKeyCallback keyCallback;
	GLFWFramebufferSizeCallback fbCallback;
	GLFWCursorPosCallback cpCallback;
	GLFWMouseButtonCallback mbCallback;

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
				"Photon Mapping Demo - compute shader (with SSBO) + raster (with instancing)", NULL, NULL);
		if (window == NULL) {
			throw new AssertionError("Failed to create the GLFW window");
		}

		System.out.println("Press arrow 'up' to increase photon map resolution.");
		System.out.println("Press arrow 'down' to decrease the photon map resolution.");
		System.out.println("Press arrow 'right' to increase number of photons per frame.");
		System.out.println("Press arrow 'left' to decrease number of photons per frame.");
		glfwSetKeyCallback(window, keyCallback = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				if ( action != GLFW_RELEASE )
					return;

				if ( key == GLFW_KEY_ESCAPE ) {
					glfwSetWindowShouldClose(window, GL_TRUE);
				} else if ( key == GLFW_KEY_R ) {
					PhotonMappingDemo.this.clearPhotonMapTexture = true;
				} else if ( key == GLFW_KEY_UP ) {
					PhotonMappingDemo.this.photonMapSize *= 2;
					PhotonMappingDemo.this.photonMapSize = Math.min(PhotonMappingDemo.this.photonMapSize,
					                                                maxPhotonMapSize);
					PhotonMappingDemo.this.recreatePhotonMapTexture = true;
					System.out.println("Photon map resolution: " + PhotonMappingDemo.this.photonMapSize);
				} else if ( key == GLFW_KEY_DOWN ) {
					PhotonMappingDemo.this.photonMapSize /= 2;
					PhotonMappingDemo.this.photonMapSize = Math.max(PhotonMappingDemo.this.photonMapSize, 4);
					PhotonMappingDemo.this.recreatePhotonMapTexture = true;
					System.out.println("Photon map resolution: " + PhotonMappingDemo.this.photonMapSize);
				} else if ( key == GLFW_KEY_RIGHT ) {
					PhotonMappingDemo.this.photonsPerFrame *= 2;
					PhotonMappingDemo.this.photonsPerFrame = Math.min(PhotonMappingDemo.this.photonsPerFrame,
					                                                  maxPhotonsPerFrame);
					System.out.println("Photons per frame: " + PhotonMappingDemo.this.photonsPerFrame);
				} else if ( key == GLFW_KEY_LEFT ) {
					PhotonMappingDemo.this.photonsPerFrame /= 2;
					PhotonMappingDemo.this.photonsPerFrame = Math.max(PhotonMappingDemo.this.photonsPerFrame, 4);
					System.out.println("Photons per frame: " + PhotonMappingDemo.this.photonsPerFrame);
				}
			}
		});

		glfwSetFramebufferSizeCallback(window, fbCallback = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				if ( width > 0 && height > 0
				     && (PhotonMappingDemo.this.width != width || PhotonMappingDemo.this.height != height) ) {
					PhotonMappingDemo.this.width = width;
					PhotonMappingDemo.this.height = height;
					PhotonMappingDemo.this.resetFramebuffer = true;
				}
			}
		});

		glfwSetCursorPosCallback(window, cpCallback = new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double x, double y) {
				PhotonMappingDemo.this.mouseX = (float)x;
				if ( mouseDown ) {
				}
			}
		});

		glfwSetMouseButtonCallback(window, mbCallback = new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
				if ( action == GLFW_PRESS ) {
					PhotonMappingDemo.this.mouseDownX = PhotonMappingDemo.this.mouseX;
					PhotonMappingDemo.this.mouseDown = true;
				} else if ( action == GLFW_RELEASE ) {
					PhotonMappingDemo.this.mouseDown = false;
					PhotonMappingDemo.this.rotationAboutY = PhotonMappingDemo.this.currRotationAboutY;
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

		ctx = GLContext.createFromCurrent();

		/* Create all needed GL resources */
		createPhotonMapTexture();
		createSampler();
		createPhotonTraceProgram();
		initPhotonTraceProgram();
		createRasterProgram();
		initRasterProgram();
		createSceneSSBO();
		createSceneVao();

		/* Set some state */
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

	private void createPhotonTraceProgram() throws IOException {
		int program = glCreateProgram();
		int cshader = Demo.createShader("demo/raytracing/photonmap.glsl", GL_COMPUTE_SHADER);
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
		this.photonTraceProgram = program;
	}

	private void initPhotonTraceProgram() {
		glUseProgram(photonTraceProgram);
		IntBuffer workGroupSize = BufferUtils.createIntBuffer(3);
		glGetProgramiv(photonTraceProgram, GL_COMPUTE_WORK_GROUP_SIZE, workGroupSize);
		workGroupSizeX = workGroupSize.get(0);
		workGroupSizeY = workGroupSize.get(1);
		timeUniform = glGetUniformLocation(photonTraceProgram, "time");
		lightCenterPositionUniform = glGetUniformLocation(photonTraceProgram, "lightCenterPosition");
		glUniform3f(lightCenterPositionUniform, lightCenterPosition.x, lightCenterPosition.y, lightCenterPosition.z);
		lightRadiusUniform = glGetUniformLocation(photonTraceProgram, "lightRadius");
		glUniform1f(lightRadiusUniform, lightRadius);
		/* Query the binding point of the SSBO */
		/*
		 * First, obtain the "resource index" used for further queries on that
		 * resource.
		 */
		int boxesResourceIndex = glGetProgramResourceIndex(photonTraceProgram, GL_SHADER_STORAGE_BLOCK, "Boxes");
		IntBuffer props = BufferUtils.createIntBuffer(1);
		IntBuffer params = BufferUtils.createIntBuffer(1);
		props.put(0, GL_BUFFER_BINDING);
		/* Now query the "BUFFER_BINDING" of that resource */
		glGetProgramResourceiv(photonTraceProgram, GL_SHADER_STORAGE_BLOCK, boxesResourceIndex, props, null, params);
		boxesSsboBinding = params.get(0);

		/* Query the "image binding point" of the photonMaps uniform image2D */
		int loc = glGetUniformLocation(photonTraceProgram, "photonMaps");
		glGetUniformiv(photonTraceProgram, loc, params);
		photonMapsBinding = params.get(0);

		glUseProgram(0);
	}

	/**
	 * Create the cubemap texture array for our photon map.
	 */
	private void createPhotonMapTexture() {
		/* Create it */
		this.photonMapTexture = glGenTextures();
		glBindTexture(GL_TEXTURE_CUBE_MAP_ARRAY, photonMapTexture);
		glTexStorage3D(GL_TEXTURE_CUBE_MAP_ARRAY, 1, GL_RG16F, photonMapSize, photonMapSize, 6 * boxes.length / 2);
		glBindTexture(GL_TEXTURE_CUBE_MAP_ARRAY, 0);
		/* Clear it */
		clearPhotonMapTexture();
	}

	/**
	 * Clear the photon map texture.
	 */
	private void clearPhotonMapTexture() {
		/*
		 * Clear the first level of the texture with black without allocating
		 * host memory.
		 */
		if (ctx.getCapabilities().GL_ARB_clear_texture) {
			/*
			 * If ARB_clear_texture is available, we can directly clear the
			 * image of the texture.
			 */
			ARBClearTexture.glClearTexImage(photonMapTexture, 0, GL_RG, GL_HALF_FLOAT, clearTexBuffer);
		} else {
			/*
			 * If not, we create a temporary buffer object and use pixel unpack
			 * to move GPU memory from that buffer to the texture image.
			 */
			int texBuffer = glGenBuffers();
			glBindBuffer(GL_PIXEL_UNPACK_BUFFER, texBuffer);
			int size = 2 * 2 * photonMapSize * photonMapSize * 6 * boxes.length / 2;
			glBufferData(GL_PIXEL_UNPACK_BUFFER, size, null, GL_STATIC_DRAW);
			glClearBufferSubData(GL_PIXEL_UNPACK_BUFFER, GL_RG16F, 0, size, GL_RG, GL_HALF_FLOAT, (ByteBuffer) null);
			glBindTexture(GL_TEXTURE_CUBE_MAP_ARRAY, photonMapTexture);
			glTexSubImage3D(GL_TEXTURE_CUBE_MAP_ARRAY, 0, 0, 0, 0, photonMapSize, photonMapSize, 6 * boxes.length / 2,
					GL_RG, GL_HALF_FLOAT, 0L);
			glBindTexture(GL_TEXTURE_CUBE_MAP_ARRAY, 0);
			glBindBuffer(GL_PIXEL_UNPACK_BUFFER, 0);
			glDeleteBuffers(texBuffer);
		}
	}

	/**
	 * Delete the photon map texture.
	 */
	private void recreatePhotonMapTexture() {
		glDeleteTextures(this.photonMapTexture);
		createPhotonMapTexture();
	}

	/**
	 * Create the sampler to sample the cube map textures within the shader.
	 */
	private void createSampler() {
		this.sampler = glGenSamplers();
		glSamplerParameteri(this.sampler, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
		glSamplerParameteri(this.sampler, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
		glSamplerParameteri(this.sampler, GL_TEXTURE_WRAP_R, GL_CLAMP_TO_EDGE);
		glSamplerParameteri(this.sampler, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
		glSamplerParameteri(this.sampler, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
	}

	/**
	 * Create the raster shader.
	 *
	 * @throws IOException
	 */
	private void createRasterProgram() throws IOException {
		int program = glCreateProgram();
		int vshader = Demo.createShader("demo/raytracing/rasterPhotonMap.vs", GL_VERTEX_SHADER);
		int fshader = Demo.createShader("demo/raytracing/rasterPhotonMap.fs", GL_FRAGMENT_SHADER);
		glAttachShader(program, vshader);
		glAttachShader(program, fshader);
		glBindAttribLocation(program, 0, "vertexPosition");
		glBindAttribLocation(program, 1, "vertexNormal");
		glBindAttribLocation(program, 2, "boxCenter");
		glBindAttribLocation(program, 3, "boxHalfSize");
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
		this.rasterProgram = program;
	}

	private void initRasterProgram() {
		glUseProgram(rasterProgram);
		viewMatrixUniform = glGetUniformLocation(rasterProgram, "viewMatrix");
		projectionMatrixUniform = glGetUniformLocation(rasterProgram, "projectionMatrix");
		int cubeMapsUniform = glGetUniformLocation(rasterProgram, "cubeMaps");
		glUniform1i(cubeMapsUniform, 0);
		glUseProgram(0);
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
			resetFramebuffer = false;
		}
		if (recreatePhotonMapTexture) {
			recreatePhotonMapTexture();
			recreatePhotonMapTexture = false;
			clearPhotonMapTexture = false;
		} else if (clearPhotonMapTexture) {
			clearPhotonMapTexture();
			clearPhotonMapTexture = false;
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
	 * Trace some rays from the light.
	 */
	private void trace() {
		glUseProgram(photonTraceProgram);

		long thisTime = System.nanoTime();
		float elapsedSeconds = (thisTime - firstTime) / 1E9f;
		glUniform1f(timeUniform, elapsedSeconds);

		/* Bind photon maps */
		glBindImageTexture(photonMapsBinding, photonMapTexture, 0, true, 0, GL_READ_WRITE, GL_RG16F);

		/* Bind the SSBO containing our boxes */
		glBindBufferBase(GL_SHADER_STORAGE_BUFFER, boxesSsboBinding, ssbo);

		/* Compute appropriate invocation dimension. */
		int invocationsPerDimension = photonsPerFrame;
		int worksizeX = mathRoundPoT(invocationsPerDimension);
		int worksizeY = mathRoundPoT(invocationsPerDimension);

		/* Invoke the compute shader. */
		glDispatchCompute(worksizeX / workGroupSizeX, worksizeY / workGroupSizeY, 1);
		/*
		 * Synchronize all writes that the shader did on the photonMap cube map
		 * array image before we later let OpenGL source texels from it when
		 * rasterizing the scene and sampling the cube maps in the fragment
		 * shader.
		 */
		glMemoryBarrier(GL_SHADER_IMAGE_ACCESS_BARRIER_BIT);

		/* Reset bindings. */
		glBindBufferBase(GL_SHADER_STORAGE_BUFFER, boxesSsboBinding, 0);
		glBindImageTexture(photonMapsBinding, 0, 0, true, 0, GL_READ_WRITE, GL_RG16F);
		glUseProgram(0);
	}

	/**
	 * Rasterize the boxes by sampling the traced photon maps and present the
	 * final image on the screen/viewport.
	 */
	private void raster() {
		glUseProgram(rasterProgram);

		/* Update matrices in shader */
		Matrix4f viewMatrix = camera.getViewMatrix();
		matrixUniform(viewMatrixUniform, viewMatrix, false);
		Matrix4f projMatrix = camera.getProjectionMatrix();
		matrixUniform(projectionMatrixUniform, projMatrix, false);

		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		glBindTexture(GL_TEXTURE_CUBE_MAP_ARRAY, photonMapTexture);
		glBindSampler(0, this.sampler);
		glBindVertexArray(vaoScene);
		glDrawArraysInstanced(GL_TRIANGLES, 0, 6 * 6, boxes.length / 2);
		glBindVertexArray(0);
		glBindSampler(0, 0);
		glBindTexture(GL_TEXTURE_CUBE_MAP_ARRAY, 0);
		glUseProgram(0);
	}

	private void loop() {
		while (glfwWindowShouldClose(window) == GL_FALSE) {
			glfwPollEvents();
			glViewport(0, 0, width, height);

			update();
			trace();
			raster();

			glfwSwapBuffers(window);
		}
	}

	private void run() {
		try {
			init();
			loop();

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
		new PhotonMappingDemo().run();
	}

}