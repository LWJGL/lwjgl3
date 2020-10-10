/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.opengl;

import org.joml.*;
import org.lwjgl.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;
import java.util.*;

import static org.joml.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.opengl.GL30C.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Modern OpenGL port of <a href="https://www.opengl.org/archives/resources/code/samples/glut_examples/mesademos/gears.c">gears.c</a>. */
public class GLXGears {

    private final Gear
        gear1,
        gear2,
        gear3;

    private final int program;
    private final int positions;
    private final int normals;

    private final int u_NORMAL;
    private final int u_MVP;
    private final int u_LIGHT;
    private final int u_COLOR;

    // ---------------------

    private final Matrix4d
        P   = new Matrix4d(),
        MVP = new Matrix4d();
    private final Matrix4x3d
        V   = new Matrix4x3d(),
        M   = new Matrix4x3d(),
        MV  = new Matrix4x3d();

    private final Matrix3d normal = new Matrix3d();
    private final Vector3d light  = new Vector3d();

    private final FloatBuffer vec3f = BufferUtils.createFloatBuffer(3);
    private final FloatBuffer mat3f = BufferUtils.createFloatBuffer(3 * 3);
    private final FloatBuffer mat4f = BufferUtils.createFloatBuffer(4 * 4);

    // ---------------------

    private long   count;
    private double startTime;

    private double distance = 40.0f;
    private double angle;

    public GLXGears() {
        System.err.println("GL_VENDOR: " + glGetString(GL_VENDOR));
        System.err.println("GL_RENDERER: " + glGetString(GL_RENDERER));
        System.err.println("GL_VERSION: " + glGetString(GL_VERSION));

        GLCapabilities caps = GL.getCapabilities();
        if (!caps.OpenGL20) {
            throw new IllegalStateException("This demo requires OpenGL 2.0 or higher.");
        }

        glEnable(GL_CULL_FACE);
        glEnable(GL_DEPTH_TEST);

        P.setFrustum(-1.0, 1.0, -1.0, 1.0, 5.0, 100.0);

        try {
            ByteBuffer vs = ioResourceToByteBuffer("demo/gears/gears.vert", 4096);
            ByteBuffer fs = ioResourceToByteBuffer("demo/gears/gears.frag", 4096);

            int version;
            if (caps.OpenGL33) {
                version = 330;
            } else if (caps.OpenGL21) {
                version = 120;
            } else {
                version = 110;
            }

            program = compileShaders(version, vs, fs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        u_MVP = glGetUniformLocation(program, "u_MVP");
        u_NORMAL = glGetUniformLocation(program, "u_NORMAL");
        u_LIGHT = glGetUniformLocation(program, "u_LIGHT");
        u_COLOR = glGetUniformLocation(program, "u_COLOR");

        positions = glGetAttribLocation(program, "in_Position");
        normals = glGetAttribLocation(program, "in_Normal");

        if (caps.OpenGL30) {
            int vao = glGenVertexArrays();
            glBindVertexArray(vao); // bind and forget
        }
        glEnableVertexAttribArray(positions);
        glEnableVertexAttribArray(normals);

        gear1 = new Gear(1.0, 4.0, 1.0, 20, 0.7, new float[] {0.8f, 0.1f, 0.0f, 1.0f});
        gear2 = new Gear(0.5, 2.0, 2.0, 10, 0.7, new float[] {0.0f, 0.8f, 0.2f, 1.0f});
        gear3 = new Gear(1.3, 2.0, 0.5, 10, 0.7, new float[] {0.2f, 0.2f, 1.0f, 1.0f});

        startTime = System.currentTimeMillis() / 1000.0;
    }

    public void animate() {
        angle += 2.0;
    }

    public void setSize(int width, int height) {
        float h = height / (float)width;

        glViewport(0, 0, width, height);
        if (h < 1.0f) {
            P.setFrustum(-1.0 / h, 1.0 / h, -1.0, 1.0, 5.0, 100.0);
        } else {
            P.setFrustum(-1.0, 1.0, -h, h, 5.0, 100.0);
        }
    }

    public void render() {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

        // VIEW
        V.translation(0.0, 0.0, -distance)
         .rotateX(20.0f * PI / 180)
         .rotateY(30.0f * PI / 180);
        //V.rotateZ(0.0f * PI / 180);

        // LIGHT
        glUniform3fv(u_LIGHT, V.transformDirection(light.set(5.0, 5.0, 10.0)).normalize().get(vec3f));

        // GEAR 1
        M.translation(-3.0, -2.0, 0.0)
         .rotateZ(angle * PI / 180);
        drawGear(gear1);

        // GEAR 2
        M.translation(3.1, -2.0, 0.0)
         .rotateZ((-2.0 * angle - 9.0) * PI / 180);
        drawGear(gear2);

        // GEAR 3
        M.translation(-3.1, 4.2, 0.0)
         .rotateZ((-2.0 * angle - 25.0) * PI / 180);
        drawGear(gear3);

        count++;

        double theTime = System.currentTimeMillis() / 1000.0;
        if (theTime >= startTime + 1.0) {
            System.out.format("%d fps\n", count);
            startTime = theTime;
            count = 0;
        }
    }

    private void drawGear(Gear gear) {
        glUniformMatrix3fv(u_NORMAL, false, V.mul(M, MV).normal(normal).get(mat3f));
        glUniformMatrix4fv(u_MVP, false, P.mul(MV, MVP).get(mat4f));
        glUniform4fv(u_COLOR, gear.color);

        gear.bind(positions, normals);
        glDrawArrays(GL_TRIANGLES, 0, gear.vertexCount);
    }

    private static void printShaderInfoLog(int obj) {
        int infologLength = glGetShaderi(obj, GL_INFO_LOG_LENGTH);
        if (infologLength > 0) {
            glGetShaderInfoLog(obj);
            System.out.format("%s\n", glGetShaderInfoLog(obj));
        }
    }

    private static void printProgramInfoLog(int obj) {
        int infologLength = glGetProgrami(obj, GL_INFO_LOG_LENGTH);
        if (infologLength > 0) {
            glGetProgramInfoLog(obj);
            System.out.format("%s\n", glGetProgramInfoLog(obj));
        }
    }

    private static void compileShader(int version, int shader, ByteBuffer code) {
        try (MemoryStack stack = stackPush()) {
            ByteBuffer header = stack.ASCII("#version " + version + "\n#line 0\n", false);

            glShaderSource(
                shader,
                stack.pointers(header, code),
                stack.ints(header.remaining(), code.remaining())
            );

            glCompileShader(shader);
            printShaderInfoLog(shader);

            if (glGetShaderi(shader, GL_COMPILE_STATUS) != GL_TRUE) {
                throw new IllegalStateException("Failed to compile shader.");
            }
        }
    }

    private static int compileShaders(int version, ByteBuffer vs, ByteBuffer fs) {
        int v = glCreateShader(GL_VERTEX_SHADER);
        int f = glCreateShader(GL_FRAGMENT_SHADER);

        compileShader(version, v, vs);
        compileShader(version, f, fs);

        int p = glCreateProgram();
        glAttachShader(p, v);
        glAttachShader(p, f);
        glLinkProgram(p);
        printProgramInfoLog(p);

        if (glGetProgrami(p, GL_LINK_STATUS) != GL_TRUE) {
            throw new IllegalStateException("Failed to link program.");
        }

        glUseProgram(p);
        return p;
    }

    private static class Gear {

        final FloatBuffer color;

        final int positionVBO;
        final int normalVBO;

        final int vertexCount;

        private Gear(
            double inner_radius, double outer_radius, double width, int teeth, double tooth_depth,
            float[] color
        ) {
            this.color = BufferUtils.createFloatBuffer(4);
            this.color.put(color).flip();

            positionVBO = glGenBuffers();
            normalVBO = glGenBuffers();

            vertexCount = new Builder()
                .build(inner_radius, outer_radius, width, teeth, tooth_depth)
                .updateVBO(positionVBO, normalVBO);
        }

        private static class Builder {
            private int vertexCount;

            private FloatBuffer positions;
            private FloatBuffer normals;

            private double
                normalX,
                normalY,
                normalZ;

            private final double[] quads = new double[4 * 3];

            private int quadCount;

            Builder build(double inner_radius, double outer_radius, double width, int teeth, double tooth_depth) {
                positions = memAllocFloat(2000 * 3);
                normals = memAllocFloat(2000 * 3);

                double r0, r1, r2;
                double angle, da;
                double u, v, len;

                r0 = inner_radius;
                r1 = outer_radius - tooth_depth / 2.0;
                r2 = outer_radius + tooth_depth / 2.0;

                da = 2.0 * PI / teeth / 4.0;

                normal3f(0.0, 0.0, 1.0);

                /* draw front face */
                quadCount = 0;
                for (int i = 0; i <= teeth; i++) {
                    angle = i * 2.0 * PI / teeth;
                    vertex3f(r0 * cos(angle), r0 * sin(angle), width * 0.5);
                    vertex3f(r1 * cos(angle), r1 * sin(angle), width * 0.5);
                    if (i < teeth) {
                        vertex3f(r0 * cos(angle), r0 * sin(angle), width * 0.5);
                        vertex3f(r1 * cos(angle + 3 * da), r1 * sin(angle + 3 * da), width * 0.5);
                    }
                }

                /* draw front sides of teeth */
                da = 2.0 * PI / teeth / 4.0;
                for (int i = 0; i < teeth; i++) {
                    angle = i * 2.0 * PI / teeth;

                    quadCount = 0;

                    vertex3f(r1 * cos(angle), r1 * sin(angle), width * 0.5);
                    vertex3f(r2 * cos(angle + da), r2 * sin(angle + da), width * 0.5);
                    vertex3f(r1 * cos(angle + 3 * da), r1 * sin(angle + 3 * da), width * 0.5);
                    vertex3f(r2 * cos(angle + 2 * da), r2 * sin(angle + 2 * da), width * 0.5);
                }

                normal3f(0.0, 0.0, -1.0);

                /* draw back face */
                quadCount = 0;
                for (int i = 0; i <= teeth; i++) {
                    angle = i * 2.0 * PI / teeth;
                    vertex3f(r1 * cos(angle), r1 * sin(angle), -width * 0.5);
                    vertex3f(r0 * cos(angle), r0 * sin(angle), -width * 0.5);
                    if (i < teeth) {
                        vertex3f(r1 * cos(angle + 3 * da), r1 * sin(angle + 3 * da), -width * 0.5);
                        vertex3f(r0 * cos(angle), r0 * sin(angle), -width * 0.5);
                    }
                }

                /* draw back sides of teeth */
                da = 2.0 * PI / teeth / 4.0;
                for (int i = 0; i < teeth; i++) {
                    angle = i * 2.0 * PI / teeth;

                    quadCount = 0;

                    vertex3f(r1 * cos(angle + 3 * da), r1 * sin(angle + 3 * da), -width * 0.5);
                    vertex3f(r2 * cos(angle + 2 * da), r2 * sin(angle + 2 * da), -width * 0.5);
                    vertex3f(r1 * cos(angle), r1 * sin(angle), -width * 0.5);
                    vertex3f(r2 * cos(angle + da), r2 * sin(angle + da), -width * 0.5);
                }

                /* draw outward faces of teeth */
                quadCount = 0;
                for (int i = 0; i < teeth; i++) {
                    angle = i * 2.0 * PI / teeth;

                    vertex3f(r1 * cos(angle), r1 * sin(angle), width * 0.5);
                    vertex3f(r1 * cos(angle), r1 * sin(angle), -width * 0.5);
                    u = r2 * cos(angle + da) - r1 * cos(angle);
                    v = r2 * sin(angle + da) - r1 * sin(angle);
                    len = sqrt(u * u + v * v);
                    u /= len;
                    v /= len;
                    normal3f(v, -u, 0.0);
                    vertex3f(r2 * cos(angle + da), r2 * sin(angle + da), width * 0.5);
                    vertex3f(r2 * cos(angle + da), r2 * sin(angle + da), -width * 0.5);

                    normal3f(cos(angle), sin(angle), 0.0);
                    vertex3f(r2 * cos(angle + 2 * da), r2 * sin(angle + 2 * da), width * 0.5);
                    vertex3f(r2 * cos(angle + 2 * da), r2 * sin(angle + 2 * da), -width * 0.5);

                    u = r1 * cos(angle + 3 * da) - r2 * cos(angle + 2 * da);
                    v = r1 * sin(angle + 3 * da) - r2 * sin(angle + 2 * da);
                    normal3f(v, -u, 0.0);
                    vertex3f(r1 * cos(angle + 3 * da), r1 * sin(angle + 3 * da), width * 0.5);
                    vertex3f(r1 * cos(angle + 3 * da), r1 * sin(angle + 3 * da), -width * 0.5);

                    normal3f(cos(angle), sin(angle), 0.0);
                }

                vertex3f(r1 * cos(0), r1 * sin(0), width * 0.5);
                vertex3f(r1 * cos(0), r1 * sin(0), -width * 0.5);

                /* draw inside radius cylinder */
                quadCount = 0;
                for (int i = 0; i <= teeth; i++) {
                    angle = (i == teeth ? 0 : i) * 2.0 * PI / teeth; // Map 2*PI to 0 to get an exact hash below
                    normal3f(-cos(angle), -sin(angle), 0.0);
                    vertex3f(r0 * cos(angle), r0 * sin(angle), -width * 0.5);
                    vertex3f(r0 * cos(angle), r0 * sin(angle), width * 0.5);
                }

                /* Emulate glShadeModel(GL_SMOOTH) for inside radius cylinder */
                Map<Vector3f, Vector3f> smoothMap = new HashMap<>(teeth * 2);
                // Sum normals around same position
                for (int i = vertexCount - teeth * 6; i < vertexCount; i++) {
                    float
                        x = normals.get(i * 3),
                        y = normals.get(i * 3 + 1),
                        z = normals.get(i * 3 + 2);

                    smoothMap.compute(new Vector3f(
                        positions.get(i * 3),
                        positions.get(i * 3 + 1),
                        positions.get(i * 3 + 2)
                    ), (key, normal) -> normal == null
                        ? new Vector3f(x, y, z)
                        : normal.add(x, y, z));
                }
                // Normalize
                smoothMap.values().forEach(Vector3f::normalize);
                // Apply smooth normals
                for (int i = vertexCount - teeth * 6; i < vertexCount; i++) {
                    Vector3f normal = smoothMap.get(new Vector3f(
                        positions.get(i * 3),
                        positions.get(i * 3 + 1),
                        positions.get(i * 3 + 2)
                    ));

                    normals.put(i * 3, normal.x);
                    normals.put(i * 3 + 1, normal.y);
                    normals.put(i * 3 + 2, normal.z);
                }

                return this;
            }

            private void normal3f(double x, double y, double z) {
                normalX = x;
                normalY = y;
                normalZ = z;
            }

            private void vertex3f(double x, double y, double z) {
                quads[quadCount * 3] = x;
                quads[quadCount * 3 + 1] = y;
                quads[quadCount * 3 + 2] = z;

                if (++quadCount == 4) {
                    addVertex(quads[0], quads[1], quads[2]);
                    addVertex(quads[3], quads[4], quads[5]);
                    addVertex(quads[6], quads[7], quads[8]);

                    addVertex(quads[6], quads[7], quads[8]);
                    addVertex(quads[3], quads[4], quads[5]);
                    addVertex(quads[9], quads[10], quads[11]);

                    System.arraycopy(quads, 2 * 3, quads, 0, 2 * 3);
                    quadCount = 2;
                }
            }

            private void addVertex(double x, double y, double z) {
                positions.put(vertexCount * 3, (float)x);
                positions.put(vertexCount * 3 + 1, (float)y);
                positions.put(vertexCount * 3 + 2, (float)z);

                normals.put(vertexCount * 3, (float)normalX);
                normals.put(vertexCount * 3 + 1, (float)normalY);
                normals.put(vertexCount * 3 + 2, (float)normalZ);

                vertexCount++;
            }

            int updateVBO(int positionVBO, int normalVBO) {
                // VBO for vertex data
                positions.limit(vertexCount * 3);

                glBindBuffer(GL_ARRAY_BUFFER, positionVBO);
                glBufferData(GL_ARRAY_BUFFER, positions, GL_STATIC_DRAW);

                // VBO for normals data
                normals.limit(vertexCount * 3);

                glBindBuffer(GL_ARRAY_BUFFER, normalVBO);
                glBufferData(GL_ARRAY_BUFFER, normals, GL_STATIC_DRAW);

                memFree(positions);
                memFree(normals);

                positions = null;
                normals = null;

                return vertexCount;
            }
        }

        void bind(int positions, int normals) {
            glBindBuffer(GL_ARRAY_BUFFER, positionVBO);
            glVertexAttribPointer(positions, 3, GL_FLOAT, false, 0, 0);

            glBindBuffer(GL_ARRAY_BUFFER, normalVBO);
            glVertexAttribPointer(normals, 3, GL_FLOAT, false, 0, 0);
        }
    }

}