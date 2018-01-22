/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.nanovg;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.lang.reflect.*;

import static org.lwjgl.system.MemoryUtil.*;

final class NanoVGGLConfig {

    private NanoVGGLConfig() {
    }

    // Use reflection to be able to compile without GL or GLES.

    static void configGL(long pointersAddress) {
        config(pointersAddress, getFunctionProvider("org.lwjgl.opengl.GL"));
    }

    static void configGLES(long pointersAddress) {
        config(pointersAddress, getFunctionProvider("org.lwjgl.opengles.GLES"));
    }

    private static FunctionProvider getFunctionProvider(String className) {
        try {
            Class<?> c = Class.forName(className);

            // verify context is current
            Method getCapabilities = c.getMethod("getCapabilities");
            getCapabilities.invoke(null);

            Method getFunctionProvider = c.getMethod("getFunctionProvider");
            return (FunctionProvider)getFunctionProvider.invoke(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void config(long pointersAddress, FunctionProvider fp) {
        String[] functions = new String[] {
            "glActiveTexture",
            "glAttachShader",
            "glBindAttribLocation",
            "glBindBuffer",
            "glBindBufferRange",
            "glBindFramebuffer",
            "glBindRenderbuffer",
            "glBindTexture",
            "glBindVertexArray",
            "glBlendFunc",
            "glBlendFuncSeparate",
            "glBufferData",
            "glCheckFramebufferStatus",
            "glColorMask",
            "glCompileShader",
            "glCreateProgram",
            "glCreateShader",
            "glCullFace",
            "glDeleteBuffers",
            "glDeleteFramebuffers",
            "glDeleteProgram",
            "glDeleteRenderbuffers",
            "glDeleteShader",
            "glDeleteTextures",
            "glDeleteVertexArrays",
            "glDetachShader",
            "glDisable",
            "glDisableVertexAttribArray",
            "glDrawArrays",
            "glEnable",
            "glEnableVertexAttribArray",
            "glFinish",
            "glFlush",
            "glFramebufferRenderbuffer",
            "glFramebufferTexture2D",
            "glFrontFace",
            "glGenBuffers",
            "glGenFramebuffers",
            "glGenRenderbuffers",
            "glGenTextures",
            "glGenVertexArrays",
            "glGenerateMipmap",
            "glGetError",
            "glGetIntegerv",
            "glGetProgramiv",
            "glGetProgramInfoLog",
            "glGetShaderiv",
            "glGetShaderInfoLog",
            "glGetUniformBlockIndex",
            "glGetUniformLocation",
            "glLinkProgram",
            "glPixelStorei",
            "glRenderbufferStorage",
            "glShaderSource",
            "glStencilFunc",
            "glStencilMask",
            "glStencilOp",
            "glStencilOpSeparate",
            "glTexImage2D",
            "glTexParameteri",
            "glTexSubImage2D",
            "glUniform1i",
            "glUniform2fv",
            "glUniform4fv",
            "glUniformBlockBinding",
            "glUseProgram",
            "glVertexAttribPointer"
        };

        PointerBuffer pointers = memPointerBuffer(pointersAddress, functions.length);
        for (int i = 0; i < functions.length; i++) {
            pointers.put(i, fp.getFunctionAddress(functions[i]));
        }
    }

}