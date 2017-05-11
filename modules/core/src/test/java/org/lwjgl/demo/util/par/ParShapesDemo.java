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

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.stb.STBEasyFont.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.nfd.NativeFileDialog.*;
import static org.lwjgl.util.par.ParShapes.*;

public final class ParShapesDemo {

    private long window;

    private int width  = 1024;
    private int height = 768;

    private ParShapesMesh mesh;

    private Callback debugCB;

    private int vao;
    private int vbo;
    private int ibo;

    private boolean hasNormals;

    private int program;

    private int meshKey = 1;

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
            glDebugMessageControl(GL_DEBUG_SOURCE_API, GL_DEBUG_TYPE_OTHER, GL_DEBUG_SEVERITY_NOTIFICATION, (IntBuffer)null, false);
        }

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if (action != GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_DOWN:
                    if (slices > 3) {
                        slices -= (mods & GLFW_MOD_SHIFT) != 0 ? 10 : 1;
                        if (slices < 3) {
                            slices = 3;
                        }
                        updateMesh();
                    }
                    break;
                case GLFW_KEY_UP:
                    slices += (mods & GLFW_MOD_SHIFT) != 0 ? 10 : 1;
                    updateMesh();
                    break;
                case GLFW_KEY_LEFT:
                    if (stacks > 1) {
                        stacks -= (mods & GLFW_MOD_SHIFT) != 0 ? 10 : 1;
                        if (stacks < 1) {
                            stacks = 1;
                        }
                        updateMesh();
                    }
                    break;
                case GLFW_KEY_RIGHT:
                    stacks += (mods & GLFW_MOD_SHIFT) != 0 ? 10 : 1;
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
                case GLFW_KEY_1:
                case GLFW_KEY_2:
                case GLFW_KEY_3:
                case GLFW_KEY_4:
                case GLFW_KEY_5:
                case GLFW_KEY_6:
                case GLFW_KEY_7:
                case GLFW_KEY_8:
                    updateMesh(key);
                    break;
                case GLFW_KEY_E:
                    if (mesh != null) {
                        exportMesh();
                    }
                    break;
                case GLFW_KEY_W:
                    wireframe = !wireframe;
                    updateHUD(mesh == null);
                    break;
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(window, true);
                    break;
            }
        });

        glfwSetFramebufferSizeCallback(window, (window, width, height) -> glViewport(0, 0, width, height));

        // center window
        long monitor = glfwGetPrimaryMonitor();

        GLFWVidMode vidmode = glfwGetVideoMode(monitor);

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

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();

        perspectiveGL(45.0, 4.0 / 3.0, 0.01, 100.0);

        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        glTranslatef(0.0f, 0.0f, -3.0f);
        glRotatef(45.0f, 1.0f, 0.0f, 0.0f);

        vao = glGenVertexArrays();
        glBindVertexArray(vao);

        vbo = glGenBuffers();
        ibo = glGenBuffers();
        hudVBO = glGenBuffers();

        updateMesh(GLFW_KEY_1);

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
            "  gl_Position = ftransform();\n" +
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
        glLinkProgram(program);
        if (glGetProgrami(program, GL_LINK_STATUS) == GL_FALSE) {
            throw new IllegalStateException(glGetProgramInfoLog(program));
        }

        glDeleteShader(fshader);
        glDeleteShader(vshader);
    }

    private static void perspectiveGL(double fovY, double aspect, double zNear, double zFar) {
        double fH = Math.tan(fovY / 360 * Math.PI) * zNear;
        double fW = fH * aspect;
        glFrustum(-fW, fW, -fH, fH, zNear, zFar);
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
            case GLFW_KEY_1:
                mesh = par_shapes_create_parametric_sphere(slices, stacks);
                break;
            case GLFW_KEY_2:
                mesh = par_shapes_create_hemisphere(slices, stacks);
                break;
            case GLFW_KEY_3:
                mesh = par_shapes_create_cylinder(slices, stacks);
                break;
            case GLFW_KEY_4:
                mesh = par_shapes_create_torus(slices, stacks, 0.25f);
                break;
            case GLFW_KEY_5:
                mesh = par_shapes_create_trefoil_knot(slices, stacks, 1.0f);
                break;
            case GLFW_KEY_6:
                mesh = par_shapes_create_klein_bottle(slices, stacks);
                if (mesh != null) {
                    par_shapes_scale(mesh, 0.1f, 0.1f, 0.1f);
                }
                break;
            case GLFW_KEY_7:
                String program =
                    " sx 2 sy 2" +
                    " ry 90 rx 90" +
                    " shape tube rx 15  call rlimb rx -15" +
                    " shape tube rx -15 call llimb rx 15" +
                    " shape tube ry 15  call rlimb ry -15" +
                    " shape tube ry 15  call llimb ry -15" +
                    " rule rlimb" +
                    "     sx 0.925 sy 0.925 tz 1 rx 1.2" +
                    "     call rlimb2" +
                    " rule rlimb2.1" +
                    "     shape connect" +
                    "     call rlimb" +
                    " rule rlimb2.1" +
                    "     rx 15  shape tube call rlimb rx -15" +
                    "     rx -15 shape tube call llimb rx 15" +
                    " rule rlimb.1" +
                    "     call llimb" +
                    " rule llimb.1" +
                    "     call rlimb" +
                    " rule llimb.10" +
                    "     sx 0.925 sy 0.925" +
                    "     tz 1" +
                    "     rx -1.2" +
                    "     shape connect" +
                    "     call llimb";

                mesh = par_shapes_create_lsystem(program, slices, 60);
                if (mesh != null) {
                    par_shapes_scale(mesh, 0.05f, 0.05f, 0.05f);
                    par_shapes_translate(mesh, 0.0f, -1.0f, 0.0f);
                }
                break;
            case GLFW_KEY_8:
                mesh = par_shapes_create_rock(seed, subdivisions);
                break;
        }

        if (mesh != null) {
            int vc = mesh.npoints();

            glBindBuffer(GL_ARRAY_BUFFER, vbo);
            glBufferData(GL_ARRAY_BUFFER, vc * (3 + 3 + 2) * 4, GL_STATIC_DRAW);

            glBufferSubData(GL_ARRAY_BUFFER, vc * (0 + 0) * 4, mesh.points(vc * 3));
            glVertexAttribPointer(0, 3, GL_FLOAT, false, 0, vc * (0 + 0) * 4);

            hasNormals = memGetAddress(mesh.address() + ParShapesMesh.NORMALS) != NULL;
            if (hasNormals) {
                glBufferSubData(GL_ARRAY_BUFFER, vc * (3 + 0) * 4, mesh.normals(vc * 3));
                glVertexAttribPointer(1, 3, GL_FLOAT, false, 0, vc * (3 + 0) * 4);
            }

            int tc = mesh.ntriangles();

            glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ibo);
            glBufferData(GL_ELEMENT_ARRAY_BUFFER, mesh.triangles(tc * 3), GL_STATIC_DRAW);
        }

        updateHUD(mesh == null);
    }

    private void updateHUD(boolean error) {
        ByteBuffer color  = memAlloc(4);
        ByteBuffer buffer = memAlloc(1024 * 60);

        setColor(color, 255, 255, 255, 0);
        String[] meshes = {
            "Sphere",
            "Hemisphere",
            "Cylinder",
            "Torus",
            "Trefoil knot",
            "Klein bottle",
            "l-system",
            "Rock"
        };

        for (int i = 0; i < meshes.length; i++) {
            if (i == meshKey - GLFW_KEY_1) {
                setColor(color, 255, 0, 255, 255);
            } else {
                setColor(color, 255, 255, 255, 255);
            }

            print(0, i * 10, "(" + (i + 1) + ") " + meshes[i], color, buffer);
        }

        if (mesh != null) {
            setColor(color, 255, 255, 255, 255);
            print(0, meshes.length * 10 + 20, "Triangle count: " + mesh.ntriangles(), color, buffer);
            if (0xFFFF < mesh.npoints()) // GL_UNSIGNED_SHORT
            {
                setColor(color, 255, 0, 0, 255);
            }
            print(0, meshes.length * 10 + 10, "Vertex count: " + mesh.npoints(), color, buffer);
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

        int y = height / 2 - 6 * 10 - 4;

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

        if (error) {
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
        glDeleteVertexArrays(vao);

        glfwFreeCallbacks(window);
        glfwTerminate();
        glfwSetErrorCallback(null).free();

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
                glDrawElements(GL_TRIANGLES, mesh.ntriangles() * 3, GL_UNSIGNED_SHORT, 0);

                if (hasNormals) {
                    glDisableVertexAttribArray(1);
                }
                glUseProgram(0);

                if (wireframe) {
                    glEnable(GL_POLYGON_OFFSET_LINE);
                    glPolygonMode(GL_FRONT_AND_BACK, GL_LINE);
                    glPolygonOffset(-1, -1);

                    glColor3f(1.0f, 1.0f, 1.0f);
                    glDrawElements(GL_TRIANGLES, mesh.ntriangles() * 3, GL_UNSIGNED_SHORT, 0);

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
        PointerBuffer outPath = memAllocPointer(1);

        try {
            int result = NFD_SaveDialog("obj", null, outPath);
            switch (result) {
                case NFD_OKAY:
                    long path = outPath.get(0);
                    npar_shapes_export(mesh.address(), path);
                    nNFDi_Free(path);
                    break;
                case NFD_ERROR:
                    System.err.format("Error: %s\n", NFD_GetError());
            }
        } finally {
            memFree(outPath);
        }
    }

    public static void main(String[] args) {
        new ParShapesDemo().run();
    }

}