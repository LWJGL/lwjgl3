/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openxr;

import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.system.MemoryStack.*;

final class ShadersGL {

    static final String texVertShader = "#version 330 core\n" +
                                        "layout (location = 0) in vec3 aPos;\n" +
                                        "layout (location = 1) in vec2 aTexCoord;\n" +
                                        "\n" +
                                        "out vec2 TexCoord;\n" +
                                        "\n" +
                                        "uniform mat4 model;\n" +
                                        "uniform mat4 view;\n" +
                                        "uniform mat4 projection;\n" +
                                        "\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    gl_Position = projection * view * model * vec4(aPos, 1.0);\n" +
                                        "    TexCoord = vec2(aTexCoord.x, aTexCoord.y);\n" +
                                        "}";

    static final String screenVertShader = "#version 330 core\n" +
                                           "layout (location = 0) in vec2 aPos;\n" +
                                           "layout (location = 1) in vec2 aTexCoords;\n" +
                                           "\n" +
                                           "out vec2 TexCoords;\n" +
                                           "\n" +
                                           "void main()\n" +
                                           "{\n" +
                                           "    TexCoords = aTexCoords;\n" +
                                           "    gl_Position = vec4(aPos.x, aPos.y, 0.0, 1.0); \n" +
                                           "}";

    static final String texFragShader = "#version 330 core\n" +
                                        "out vec4 FragColor;\n" +
                                        "\n" +
                                        "in vec2 TexCoords;\n" +
                                        "\n" +
                                        "uniform sampler2D textureSampler;\n" +
                                        "\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    vec3 col = texture(textureSampler, TexCoords).rgb;\n" +
                                        "    FragColor = vec4(col, 1.0);\n" +
                                        "}";

    static final String colVertShader = "#version 330 core\n" +
                                        "layout (location = 0) in vec3 aPos;\n" +
                                        "layout (location = 1) in vec3 aColorIn;\n" +
                                        "\n" +
                                        "out vec3 Color;\n" +
                                        "\n" +
                                        "uniform mat4 model;\n" +
                                        "uniform mat4 view;\n" +
                                        "uniform mat4 projection;\n" +
                                        "\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "    //gl_Position = transform * vec4(aPos, 1.0f);\n" +
                                        "    gl_Position = projection * view * model * vec4(aPos, 1.0);\n" +
                                        "    Color = aColorIn;\n" +
                                        "}";

    static final String colFragShader = "#version 330 core\n" +
                                        "in vec3 Color;" +
                                        "out vec4 FragColor;\n" +
                                        "void main()\n" +
                                        "{\n" +
                                        "   FragColor = vec4(Color, 1.0f);\n" +
                                        "}";


    private ShadersGL() {
    }

    static int createShaderProgram(String vertexShaderGlsl, String fragmentShaderGlsl) {
        int vertexShader = glCreateShader(GL_VERTEX_SHADER);
        glShaderSource(vertexShader, vertexShaderGlsl);
        glCompileShader(vertexShader);
        checkShader(vertexShader);

        int fragmentShader = glCreateShader(GL_FRAGMENT_SHADER);
        glShaderSource(fragmentShader, fragmentShaderGlsl);
        glCompileShader(fragmentShader);
        checkShader(fragmentShader);

        int program = glCreateProgram();

        glAttachShader(program, vertexShader);
        glAttachShader(program, fragmentShader);
        glLinkProgram(program);
        checkProgram(program);

        glDeleteShader(vertexShader);
        glDeleteShader(fragmentShader);

        return program;
    }

    static void checkShader(int shader) {
        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);
            glGetShaderiv(shader, GL_COMPILE_STATUS, pi);
            if (pi.get(0) == GL_FALSE) {
                throw new IllegalStateException("Compile shader failed: " + glGetShaderInfoLog(shader, 4096));
            }
        }
    }

    static void checkProgram(int program) {
        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);
            glGetProgramiv(program, GL_LINK_STATUS, pi);
            if (pi.get(0) == GL_FALSE) {
                throw new IllegalStateException("Link program failed: " + glGetProgramInfoLog(program, 4096));
            }
        }
    }

}
