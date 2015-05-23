/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.opengl.fbo;

import org.lwjgl.BufferUtils;
import org.lwjgl.demo.opengl.DemoUtils;
import org.lwjgl.demo.opengl.raytracing.Scene;
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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Showcases simple reconstruction of the world position from the depth buffer.
 * <p>
 * It uses a depth attachment texture to render depth-only to the FBO.
 * Afterwards, the world-space coordinates are reconstructed via the depth
 * values from the depth texture.
 * 
 * @author Kai Burjack
 */
public class ReadDepthBufferDemo {

	/**
	 * The scene as (min, max) axis-aligned boxes.
	 */
	private static Vector3f[] boxes = Scene.boxes;

	private long window;
	private int width = 1024;
	private int height = 768;
	private boolean resetFramebuffer = true;

	private int depthTexture;
	private int fullScreenQuadVao;
	private int fullScreenQuadProgram;
	private int depthOnlyProgram;
	private int fbo;
	private int vaoScene;

	private int viewMatrixUniform;
	private int projectionMatrixUniform;
	private int inverseProjectionViewMatrixUniform;

	private Camera camera;
	private float mouseDownX;
	private float mouseX;
	private boolean mouseDown;

	private float currRotationAboutY = 0.0f;
	private float rotationAboutY = 0.0f;

	private Vector3f tmpVector = new Vector3f();
	private Vector3f cameraLookAt = new Vector3f(0.0f, 0.5f, 0.0f);
	private Vector3f cameraUp = new Vector3f(0.0f, 1.0f, 0.0f);
	private ByteBuffer matrixByteBuffer = BufferUtils.createByteBuffer(4 * 16);
	private FloatBuffer matrixByteBufferFloatView = matrixByteBuffer.asFloatBuffer();

	GLFWErrorCallback errCallback;
	GLFWKeyCallback keyCallback;
	GLFWCursorPosCallback cpCallback;
	GLFWFramebufferSizeCallback fbCallback;
	GLFWMouseButtonCallback mbCallback;

	Closure debugProc;

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
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);

		window = glfwCreateWindow(width, height, "Sample depth buffer", NULL, NULL);
		if (window == NULL) {
			throw new AssertionError("Failed to create the GLFW window");
		}

		glfwSetKeyCallback(window, keyCallback = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				if (action != GLFW_RELEASE)
					return;

				if (key == GLFW_KEY_ESCAPE) {
					glfwSetWindowShouldClose(window, GL_TRUE);
				}
			}
		});

		glfwSetCursorPosCallback(window, cpCallback = new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double x, double y) {
				ReadDepthBufferDemo.this.mouseX = (float) x;
			}
		});

		glfwSetFramebufferSizeCallback(window, fbCallback = new GLFWFramebufferSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				if (width > 0 && height > 0 && (ReadDepthBufferDemo.this.width != width || ReadDepthBufferDemo.this.height != height)) {
					ReadDepthBufferDemo.this.width = width;
					ReadDepthBufferDemo.this.height = height;
					ReadDepthBufferDemo.this.resetFramebuffer = true;
				}
			}
		});

		glfwSetMouseButtonCallback(window, mbCallback = new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
				if (action == GLFW_PRESS) {
					ReadDepthBufferDemo.this.mouseDownX = ReadDepthBufferDemo.this.mouseX;
					ReadDepthBufferDemo.this.mouseDown = true;
				} else if (action == GLFW_RELEASE) {
					ReadDepthBufferDemo.this.mouseDown = false;
					ReadDepthBufferDemo.this.rotationAboutY = ReadDepthBufferDemo.this.currRotationAboutY;
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
		createDepthTexture();
		createFramebufferObject();
		createFullScreenVao();
		createSceneVao();
		createDepthOnlyProgram();
		initDepthOnlyProgram();
		createFullScreenQuadProgram();
		initFullScreenQuadProgram();

		glEnable(GL_DEPTH_TEST);
		glEnable(GL_CULL_FACE);

		/* Setup camera */
		camera = new Camera();
	}

	private void createFullScreenVao() {
		this.fullScreenQuadVao = glGenVertexArrays();
		int vbo = glGenBuffers();
		glBindVertexArray(fullScreenQuadVao);
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

	private void createSceneVao() {
		int vao = glGenVertexArrays();
		int vbo = glGenBuffers();
		glBindVertexArray(vao);
		glBindBuffer(GL_ARRAY_BUFFER, vbo);
		ByteBuffer bb = BufferUtils.createByteBuffer(boxes.length / 2 * 4 * (3 + 3) * 6 * 6);
		FloatBuffer fv = bb.asFloatBuffer();
		for (int i = 0; i < boxes.length; i += 2) {
			DemoUtils.triangulateBox(boxes[i], boxes[i + 1], fv);
		}
		glBufferData(GL_ARRAY_BUFFER, bb, GL_STATIC_DRAW);
		glEnableVertexAttribArray(0);
		glVertexAttribPointer(0, 3, GL_FLOAT, false, 4 * (3 + 3), 0L);
		glBindBuffer(GL_ARRAY_BUFFER, 0);
		glBindVertexArray(0);
		this.vaoScene = vao;
	}

	private void createFramebufferObject() {
		this.fbo = glGenFramebuffers();
		glBindFramebuffer(GL_FRAMEBUFFER, fbo);
		glDrawBuffer(GL_NONE); // we are not rendering to color buffers!
		glReadBuffer(GL_NONE); // we are also not reading from color buffers!
		glFramebufferTexture2D(GL_FRAMEBUFFER, GL_DEPTH_ATTACHMENT, GL_TEXTURE_2D, depthTexture, 0);
		int fboStatus = glCheckFramebufferStatus(GL_FRAMEBUFFER);
		if (fboStatus != GL_FRAMEBUFFER_COMPLETE) {
			throw new AssertionError("Could not create FBO: " + fboStatus);
		}
		glBindFramebuffer(GL_FRAMEBUFFER, 0);
	}

	private void createFullScreenQuadProgram() throws IOException {
		int program = glCreateProgram();
		int vshader = DemoUtils.createShader("demo/fbo/quadDepth.vs", GL_VERTEX_SHADER);
		int fshader = DemoUtils.createShader("demo/fbo/quadDepth.fs", GL_FRAGMENT_SHADER);
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
		this.fullScreenQuadProgram = program;
	}

	private void createDepthOnlyProgram() throws IOException {
		int program = glCreateProgram();
		int vshader = DemoUtils.createShader("demo/fbo/rasterDepth.vs", GL_VERTEX_SHADER);
		int fshader = DemoUtils.createShader("demo/fbo/rasterDepth.fs", GL_FRAGMENT_SHADER);
		glAttachShader(program, vshader);
		glAttachShader(program, fshader);
		glBindAttribLocation(program, 0, "vertexPosition");
		glLinkProgram(program);
		int linked = glGetProgrami(program, GL_LINK_STATUS);
		String programLog = glGetProgramInfoLog(program);
		if (!programLog.trim().isEmpty()) {
			System.err.println(programLog);
		}
		if (linked == 0) {
			throw new AssertionError("Could not link program");
		}
		this.depthOnlyProgram = program;
	}

	private void initDepthOnlyProgram() {
		glUseProgram(depthOnlyProgram);
		viewMatrixUniform = glGetUniformLocation(depthOnlyProgram, "viewMatrix");
		projectionMatrixUniform = glGetUniformLocation(depthOnlyProgram, "projectionMatrix");
		glUseProgram(0);
	}

	private void initFullScreenQuadProgram() {
		glUseProgram(fullScreenQuadProgram);
		int texUniform = glGetUniformLocation(fullScreenQuadProgram, "tex");
		inverseProjectionViewMatrixUniform = glGetUniformLocation(fullScreenQuadProgram, "inverseProjectionViewMatrix");
		glUniform1i(texUniform, 0);
		glUseProgram(0);
	}

	private void createDepthTexture() {
		this.depthTexture = glGenTextures();
		glBindTexture(GL_TEXTURE_2D, depthTexture);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
		glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		glTexImage2D(GL_TEXTURE_2D, 0, GL_DEPTH_COMPONENT, width, height, 0, GL_DEPTH_COMPONENT, GL_FLOAT, (ByteBuffer) null);
		glBindTexture(GL_TEXTURE_2D, 0);
	}

	private void resizeFramebufferTexture() {
		glDeleteTextures(depthTexture);
		glDeleteFramebuffers(fbo);

		createDepthTexture();
		createFramebufferObject();
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

	private void matrixUniform(int location, Matrix4f value, boolean transpose) {
		matrixByteBufferFloatView.put(value.m00).put(value.m10).put(value.m20).put(value.m30).put(value.m01).put(value.m11).put(value.m21)
				.put(value.m31).put(value.m02).put(value.m12).put(value.m22).put(value.m32).put(value.m03).put(value.m13).put(value.m23)
				.put(value.m33);
		matrixByteBufferFloatView.rewind();
		glUniformMatrix4fv(location, 1, transpose, matrixByteBuffer);
	}

	private void renderDepthOnly() {
		glEnable(GL_DEPTH_TEST);
		glUseProgram(depthOnlyProgram);

		/* Update matrices in shader */
		Matrix4f viewMatrix = camera.getViewMatrix();
		matrixUniform(viewMatrixUniform, viewMatrix, false);
		Matrix4f projMatrix = camera.getProjectionMatrix();
		matrixUniform(projectionMatrixUniform, projMatrix, false);

		/* Rasterize the boxes into the FBO */
		glBindFramebuffer(GL_FRAMEBUFFER, fbo);
		glClear(GL_DEPTH_BUFFER_BIT);
		glBindVertexArray(vaoScene);
		glDrawArrays(GL_TRIANGLES, 0, 6 * 6 * boxes.length / 2);
		glBindVertexArray(0);
		glBindFramebuffer(GL_FRAMEBUFFER, 0);
		glUseProgram(0);
	}

	private void present() {
		glDisable(GL_DEPTH_TEST);
		glUseProgram(fullScreenQuadProgram);

		/* Set the inverse(proj * view) matrix in the shader */
		Matrix4f inverseProjectionViewMatrix = camera.getInverseProjectionViewMatrix();
		matrixUniform(inverseProjectionViewMatrixUniform, inverseProjectionViewMatrix, false);

		glBindVertexArray(fullScreenQuadVao);
		glBindTexture(GL_TEXTURE_2D, depthTexture);
		glDrawArrays(GL_TRIANGLES, 0, 6);
		glBindTexture(GL_TEXTURE_2D, 0);
		glBindVertexArray(0);
		glUseProgram(0);
	}

	private void loop() {
		while (glfwWindowShouldClose(window) == GL_FALSE) {
			glfwPollEvents();
			glViewport(0, 0, width, height);

			update();
			renderDepthOnly();
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
			cpCallback.release();
			fbCallback.release();
			mbCallback.release();
			glfwDestroyWindow(window);
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			glfwTerminate();
		}
	}

	public static void main(String[] args) {
		new ReadDepthBufferDemo().run();
	}

}