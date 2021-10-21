/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.par;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.par.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.stb.STBEasyFont.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.nfd.NativeFileDialog.*;
import static org.lwjgl.util.par.ParShapes.*;

public final class ParShapesDemo {

    private long window;

    private int width  = 1024;
    private int height = 768;

    private ParShapesMesh mesh;

    private Callback debugCB;

    private int vbo;
    private int ibo;

    private boolean hasNormals;

    private int program;

    private int meshKey;

    private int
        slices       = 32,
        stacks       = 32,
        seed         = 1,
        subdivisions = 4;

    private boolean wireframe;

    private int hudVBO;
    private int hudVertexCount;

    private ParShapesDemo() {
    }

    private void init() {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);

        window = glfwCreateWindow(width, height, "par_shapes demo", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        debugCB = GLUtil.setupDebugMessageCallback();
        if (debugCB != null && GL.getCapabilities().OpenGL43) {
            GL43.glDebugMessageControl(GL43.GL_DEBUG_SOURCE_API, GL43.GL_DEBUG_TYPE_OTHER, GL43.GL_DEBUG_SEVERITY_NOTIFICATION, (IntBuffer)null, false);
        }

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if (action != GLFW_RELEASE) {
                return;
            }

            int scale;
            if ((mods & GLFW_MOD_CONTROL) != 0) {
                scale = 100;
            } else if ((mods & GLFW_MOD_SHIFT) != 0) {
                scale = 10;
            } else {
                scale = 1;
            }
            switch (key) {
                case GLFW_KEY_DOWN:
                    if (slices > 3) {
                        slices -= scale;
                        if (slices < 3) {
                            slices = 3;
                        }
                        updateMesh();
                    }
                    break;
                case GLFW_KEY_UP:
                    slices += scale;
                    updateMesh();
                    break;
                case GLFW_KEY_LEFT:
                    if (stacks > 1) {
                        stacks -= scale;
                        if (stacks < 1) {
                            stacks = 1;
                        }
                        updateMesh();
                    }
                    break;
                case GLFW_KEY_RIGHT:
                    stacks += scale;
                    updateMesh();
                    break;
                case GLFW_KEY_PAGE_DOWN:
                    seed--;
                    updateMesh();
                    break;
                case GLFW_KEY_PAGE_UP:
                    seed++;
                    updateMesh();
                    break;
                case GLFW_KEY_KP_SUBTRACT:
                    if (subdivisions > 1) {
                        subdivisions--;
                        updateMesh();
                    }
                    break;
                case GLFW_KEY_KP_ADD:
                    subdivisions++;
                    updateMesh();
                    break;
                case GLFW_KEY_0:
                case GLFW_KEY_1:
                case GLFW_KEY_2:
                case GLFW_KEY_3:
                case GLFW_KEY_4:
                case GLFW_KEY_5:
                case GLFW_KEY_6:
                case GLFW_KEY_7:
                case GLFW_KEY_8:
                case GLFW_KEY_9:
                    updateMesh(key);
                    break;
                case GLFW_KEY_E:
                    if (mesh != null) {
                        exportMesh();
                    }
                    break;
                case GLFW_KEY_W:
                    wireframe = !wireframe;
                    updateHUD();
                    break;
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(window, true);
                    break;
            }
        });

        glfwSetFramebufferSizeCallback(window, (window, width, height) -> {
            this.width = width;
            this.height = height;
            updateViewport(width, height);
        });

        // center window
        GLFWVidMode vidmode = Objects.requireNonNull(glfwGetVideoMode(glfwGetPrimaryMonitor()));
        glfwSetWindowPos(
            window,
            (vidmode.width() - width) / 2,
            (vidmode.height() - height) / 2
        );

        glfwShowWindow(window);

        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

        glDisable(GL_CULL_FACE);

        glEnable(GL_DEPTH_TEST);
        glDepthFunc(GL_LEQUAL);

        updateViewport(width, height);

        glLoadIdentity();
        glTranslatef(0.0f, 0.0f, -3.0f);
        glRotatef(45.0f, 1.0f, 0.0f, 0.0f);

        vbo = glGenBuffers();
        ibo = glGenBuffers();
        hudVBO = glGenBuffers();

        par_shapes_set_epsilon_welded_normals(0.00001f);
        par_shapes_set_epsilon_degenerate_sphere(0.000001f);

        updateMesh(GLFW_KEY_0);

        int vshader = glCreateShader(GL_VERTEX_SHADER);
        glShaderSource(vshader,
            "#version 110\n" +
            "\n" +
            "attribute vec3 position;\n" +
            "attribute vec3 normal;\n" +
            "\n" +
            "varying vec3 viewNormal;\n" +
            "\n" +
            "void main(void) {\n" +
            "  viewNormal = gl_NormalMatrix * normal;\n" +
            "  gl_Position = gl_ModelViewProjectionMatrix * vec4(position, 1.0);\n" +
            "}\n"
        );
        glCompileShader(vshader);
        if (glGetShaderi(vshader, GL_COMPILE_STATUS) == GL_FALSE) {
            throw new IllegalStateException(glGetShaderInfoLog(vshader));
        }

        int fshader = glCreateShader(GL_FRAGMENT_SHADER);
        glShaderSource(fshader,
            "#version 110\n" +
            "\n" +
            "varying vec3 viewNormal;\n" +
            "\n" +
            "void main(void) {\n" +
            "  gl_FragColor = vec4(normalize(viewNormal), 1.0);\n" +
            "}\n"
        );
        glCompileShader(fshader);
        if (glGetShaderi(fshader, GL_COMPILE_STATUS) == GL_FALSE) {
            throw new IllegalStateException(glGetShaderInfoLog(fshader));
        }

        program = glCreateProgram();
        glAttachShader(program, vshader);
        glAttachShader(program, fshader);
        glBindAttribLocation(program, 0, "position");
        glBindAttribLocation(program, 1, "normal");
        glLinkProgram(program);
        if (glGetProgrami(program, GL_LINK_STATUS) == GL_FALSE) {
            throw new IllegalStateException(glGetProgramInfoLog(program));
        }

        glDeleteShader(fshader);
        glDeleteShader(vshader);
    }

    private static void updateViewport(int width, int height) {
        glViewport(0, 0, width, height);

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();

        double fovY  = 45.0;
        double zNear = 0.01;
        double zFar  = 100.0;

        double aspect = (double)width / (double)height;

        double fH = Math.tan(fovY / 360 * Math.PI) * zNear;
        double fW = fH * aspect;
        glFrustum(-fW, fW, -fH, fH, zNear, zFar);

        glMatrixMode(GL_MODELVIEW);
    }

    private void updateMesh() {
        updateMesh(meshKey);
    }

    private void updateMesh(int key) {
        meshKey = key;

        if (mesh != null) {
            par_shapes_free_mesh(mesh);
            mesh = null;
        }

        switch (key) {
            case GLFW_KEY_0:
                mesh = par_shapes_create_parametric_sphere(slices, stacks);
                break;
            case GLFW_KEY_1:
                mesh = par_shapes_create_hemisphere(slices, stacks);
                break;
            case GLFW_KEY_2:
                mesh = par_shapes_create_cylinder(slices, stacks);
                break;
            case GLFW_KEY_3:
                mesh = par_shapes_create_cone(slices, stacks);
                break;
            case GLFW_KEY_4:
                mesh = par_shapes_create_parametric_disk(slices, stacks);
                break;
            case GLFW_KEY_5:
                mesh = par_shapes_create_torus(slices, stacks, 0.25f);
                break;
            case GLFW_KEY_6:
                mesh = par_shapes_create_trefoil_knot(slices, stacks, 1.0f);
                break;
            case GLFW_KEY_7:
                mesh = par_shapes_create_klein_bottle(slices, stacks);
                if (mesh != null) {
                    par_shapes_scale(mesh, 0.1f, 0.1f, 0.1f);
                }
                break;
            case GLFW_KEY_8:
                String program =
                    "sx 2 sy 2\n" +
                    "ry 90 rx 90\n" +
                    "shape tube rx 15  call rlimb rx -15\n" +
                    "shape tube rx -15 call llimb rx 15\n" +
                    "shape tube ry 15  call rlimb ry -15\n" +
                    "shape tube ry 15  call llimb ry -15\n" +
                    "rule rlimb\n" +
                    "    sx 0.925 sy 0.925 tz 1 rx 1.2\n" +
                    "    call rlimb2\n" +
                    "rule rlimb2.1\n" +
                    "    shape connect\n" +
                    "    call rlimb\n" +
                    "rule rlimb2.1\n" +
                    "    rx 15  shape tube call rlimb rx -15\n" +
                    "    rx -15 shape tube call llimb rx 15\n" +
                    "rule rlimb.1\n" +
                    "    call llimb\n" +
                    "rule llimb.1\n" +
                    "    call rlimb\n" +
                    "rule llimb.10\n" +
                    "    sx 0.925 sy 0.925\n" +
                    "    tz 1\n" +
                    "    rx -1.2\n" +
                    "    shape connect\n" +
                    "    call llimb";

                mesh = par_shapes_create_lsystem(program, slices, 60, null, NULL);
                if (mesh != null) {
                    par_shapes_scale(mesh, 0.05f, 0.05f, 0.05f);
                    par_shapes_translate(mesh, 0.0f, -1.0f, 0.0f);
                }
                break;
            case GLFW_KEY_9:
                mesh = par_shapes_create_rock(seed, subdivisions);
                break;
        }

        if (mesh != null) {
            int vc = mesh.npoints();

            glBindBuffer(GL_ARRAY_BUFFER, vbo);
            glBufferData(GL_ARRAY_BUFFER, vc * (3 + 3 + 2) * 4, GL_STATIC_DRAW);

            glBufferSubData(GL_ARRAY_BUFFER, vc * (0 + 0) * 4, mesh.points(vc * 3));
            glVertexAttribPointer(0, 3, GL_FLOAT, false, 0, vc * (0 + 0) * 4);

            FloatBuffer normals = mesh.normals(vc * 3);
            if (hasNormals = normals != null) {
                glBufferSubData(GL_ARRAY_BUFFER, vc * (3 + 0) * 4, normals);
                glVertexAttribPointer(1, 3, GL_FLOAT, false, 0, vc * (3 + 0) * 4);
            }

            int tc = mesh.ntriangles();

            glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ibo);
            glBufferData(GL_ELEMENT_ARRAY_BUFFER, mesh.triangles(tc * 3), GL_STATIC_DRAW);
        }

        updateHUD();
    }

    private void updateHUD() {
        ByteBuffer color  = memAlloc(4);
        ByteBuffer buffer = memAlloc(1024 * 60);

        setColor(color, 255, 255, 255, 0);
        String[] meshes = {
            "Sphere",
            "Hemisphere",
            "Cylinder",
            "Cone",
            "Disc",
            "Torus",
            "Trefoil knot",
            "Klein bottle",
            "l-system",
            "Rock"
        };

        for (int i = 0; i < meshes.length; i++) {
            if (i == meshKey - GLFW_KEY_0) {
                setColor(color, 255, 0, 255, 255);
            } else {
                setColor(color, 255, 255, 255, 255);
            }

            print(0, i * 10, "(" + i + ") " + meshes[i], color, buffer);
        }

        if (mesh != null) {
            setColor(color, 255, 255, 255, 255);
            print(0, meshes.length * 10 + 20, "Triangles: " + mesh.ntriangles(), color, buffer);
            print(4, meshes.length * 10 + 10, "Vertices: " + mesh.npoints(), color, buffer);
        }

        String[] controls = {
            "(E) Export to .obj",
            "(W) Wireframe:",
            "(up/down) Slices:",
            "(left/right) Stacks:",
            "(page up/down) Seed:",
            "(-/+) Subdivisions:"
        };

        int alignment = stb_easy_font_width(controls[4]);

        int y = height / 2 - controls.length * 10 - 4;

        setColor(color, 255, 255, 0, 255);
        y = print(alignment - stb_easy_font_width(controls[0]), y, controls[0], color, buffer);
        y = print(alignment - stb_easy_font_width(controls[1]), y, controls[1] + " " + (wireframe ? "ON" : "OFF"), color, buffer);

        if (meshKey == GLFW_KEY_8) {
            setColor(color, 64, 64, 0, 255);
        }
        y = print(alignment - stb_easy_font_width(controls[2]), y, controls[2] + " " + slices, color, buffer);
        if (meshKey == GLFW_KEY_7) {
            setColor(color, 64, 64, 0, 255);
        }
        y = print(alignment - stb_easy_font_width(controls[3]), y, controls[3] + " " + stacks, color, buffer);

        if (meshKey == GLFW_KEY_8) {
            setColor(color, 255, 255, 0, 255);
        } else {
            setColor(color, 64, 64, 0, 255);
        }
        y = print(alignment - stb_easy_font_width(controls[4]), y, controls[4] + " " + seed, color, buffer);
        print(alignment - stb_easy_font_width(controls[5]), y, controls[5] + " " + subdivisions, color, buffer);

        if (mesh == null) {
            String msg = "Error in mesh generation!";

            setColor(color, 255, 0, 0, 255);
            print(
                (width / 2 - stb_easy_font_width(msg)) / 2,
                (height / 2 - 5) / 2,
                msg, color, buffer
            );
        }

        buffer.flip();
        hudVertexCount = buffer.limit() >> 4;

        glBindBuffer(GL_ARRAY_BUFFER, hudVBO);
        glBufferData(GL_ARRAY_BUFFER, buffer, GL_STATIC_DRAW);

        glVertexPointer(2, GL_FLOAT, 4 * 4, 0);
        glColorPointer(4, GL_UNSIGNED_BYTE, 4 * 4, 3 * 4);

        memFree(color);
        memFree(buffer);
    }

    private static void setColor(ByteBuffer color, int r, int g, int b, int a) {
        color
            .put(0, (byte)r)
            .put(1, (byte)g)
            .put(2, (byte)b)
            .put(3, (byte)a);
    }

    private static int print(int x, int y, String text, ByteBuffer color, ByteBuffer buffer) {
        int quads = stb_easy_font_print(x, y, text, color, buffer);
        buffer.position(buffer.position() + quads * (4 * 4 * 4));
        return y + 10;
    }

    private void cleanup() {
        if (mesh != null) {
            par_shapes_free_mesh(mesh);
            mesh = null;
        }

        glDeleteProgram(program);

        glDeleteBuffers(hudVBO);
        glDeleteBuffers(ibo);
        glDeleteBuffers(vbo);

        GL.setCapabilities(null);

        glfwFreeCallbacks(window);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();

        if (debugCB != null) {
            debugCB.free();
        }
    }

    private void run() {
        init();

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

            if (mesh != null) {
                glUseProgram(program);
                glEnableVertexAttribArray(0);
                if (hasNormals) {
                    glEnableVertexAttribArray(1);
                } else {
                    glVertexAttrib3f(1, 1.0f, 1.0f, 1.0f);
                }

                glBindBuffer(GL_ARRAY_BUFFER, vbo);
                glDrawElements(GL_TRIANGLES, mesh.ntriangles() * 3, GL_UNSIGNED_INT, 0);

                if (hasNormals) {
                    glDisableVertexAttribArray(1);
                }
                glUseProgram(0);

                if (wireframe) {
                    glEnable(GL_POLYGON_OFFSET_LINE);
                    glPolygonMode(GL_FRONT_AND_BACK, GL_LINE);
                    glPolygonOffset(-1, -1);

                    glColor3f(1.0f, 1.0f, 1.0f);
                    glDrawElements(GL_TRIANGLES, mesh.ntriangles() * 3, GL_UNSIGNED_INT, 0);

                    glPolygonOffset(0.0f, 0.0f);
                    glPolygonMode(GL_FRONT_AND_BACK, GL_FILL);
                    glDisable(GL_POLYGON_OFFSET_LINE);
                }

                glDisableVertexAttribArray(0);
            }

            // HUD

            glEnableClientState(GL_VERTEX_ARRAY);
            glEnableClientState(GL_COLOR_ARRAY);

            glMatrixMode(GL_PROJECTION);
            glPushMatrix();
            glLoadIdentity();
            glOrtho(0.0, width, height, 0.0, -1.0, 1.0);

            glMatrixMode(GL_MODELVIEW);
            glPushMatrix();
            glLoadIdentity();
            glTranslatef(4.0f, 4.0f, 0.0f);
            glScalef(2.0f, 2.0f, 1.0f);

            glBindBuffer(GL_ARRAY_BUFFER, hudVBO);
            glDrawArrays(GL_QUADS, 0, hudVertexCount);

            glPopMatrix();
            glMatrixMode(GL_PROJECTION);
            glPopMatrix();

            glDisableClientState(GL_COLOR_ARRAY);
            glDisableClientState(GL_VERTEX_ARRAY);

            glfwSwapBuffers(window);
        }

        cleanup();
    }

    private void exportMesh() {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);

            int result = NFD_SaveDialog("obj", null, pp);
            switch (result) {
                case NFD_OKAY:
                    long path = pp.get(0);
                    npar_shapes_export(mesh.address(), path);
                    nNFD_Free(path);
                    break;
                case NFD_ERROR:
                    System.err.format("Error: %s\n", NFD_GetError());
            }
        }
    }

    public static void main(String[] args) {
        new ParShapesDemo().run();
    }

}