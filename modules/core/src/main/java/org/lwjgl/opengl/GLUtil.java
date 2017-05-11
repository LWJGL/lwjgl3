/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import java.io.*;

import static org.lwjgl.opengl.AMDDebugOutput.*;
import static org.lwjgl.opengl.ARBDebugOutput.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** OpenGL utilities. */
public final class GLUtil {

    private GLUtil() {
    }

    /**
     * Detects the best debug output functionality to use and creates a callback that prints information to {@link APIUtil#DEBUG_STREAM}. The callback
     * function is returned as a {@link Callback}, that should be {@link Callback#free freed} when no longer needed.
     */
    public static Callback setupDebugMessageCallback() {
        return setupDebugMessageCallback(APIUtil.DEBUG_STREAM);
    }

    /**
     * Detects the best debug output functionality to use and creates a callback that prints information to the specified {@link PrintStream}. The callback
     * function is returned as a {@link Callback}, that should be {@link Callback#free freed} when no longer needed.
     *
     * @param stream the output {@link PrintStream}
     */
    public static Callback setupDebugMessageCallback(PrintStream stream) {
        GLCapabilities caps = GL.getCapabilities();

        if (caps.OpenGL43) {
            apiLog("[GL] Using OpenGL 4.3 for error logging.");
            GLDebugMessageCallback proc = GLDebugMessageCallback.create((source, type, id, severity, length, message, userParam) -> {
                stream.println("[LWJGL] OpenGL debug message");
                printDetail(stream, "ID", String.format("0x%X", id));
                printDetail(stream, "Source", getDebugSource(source));
                printDetail(stream, "Type", getDebugType(type));
                printDetail(stream, "Severity", getDebugSeverity(severity));
                printDetail(stream, "Message", GLDebugMessageCallback.getMessage(length, message));
            });
            glDebugMessageCallback(proc, NULL);
            if ((glGetInteger(GL_CONTEXT_FLAGS) & GL_CONTEXT_FLAG_DEBUG_BIT) == 0) {
                apiLog("[GL] Warning: A non-debug context may not produce any debug output.");
                glEnable(GL_DEBUG_OUTPUT);
            }
            return proc;
        }

        if (caps.GL_KHR_debug) {
            apiLog("[GL] Using KHR_debug for error logging.");
            GLDebugMessageCallback proc = GLDebugMessageCallback.create((source, type, id, severity, length, message, userParam) -> {
                stream.println("[LWJGL] OpenGL debug message");
                printDetail(stream, "ID", String.format("0x%X", id));
                printDetail(stream, "Source", getDebugSource(source));
                printDetail(stream, "Type", getDebugType(type));
                printDetail(stream, "Severity", getDebugSeverity(severity));
                printDetail(stream, "Message", GLDebugMessageCallback.getMessage(length, message));
            });
            KHRDebug.glDebugMessageCallback(proc, NULL);
            if (caps.OpenGL30 && (glGetInteger(GL_CONTEXT_FLAGS) & GL_CONTEXT_FLAG_DEBUG_BIT) == 0) {
                apiLog("[GL] Warning: A non-debug context may not produce any debug output.");
                glEnable(GL_DEBUG_OUTPUT);
            }
            return proc;
        }

        if (caps.GL_ARB_debug_output) {
            apiLog("[GL] Using ARB_debug_output for error logging.");
            GLDebugMessageARBCallback proc = GLDebugMessageARBCallback.create((source, type, id, severity, length, message, userParam) -> {
                stream.println("[LWJGL] ARB_debug_output message");
                printDetail(stream, "ID", String.format("0x%X", id));
                printDetail(stream, "Source", getSourceARB(source));
                printDetail(stream, "Type", getTypeARB(type));
                printDetail(stream, "Severity", getSeverityARB(severity));
                printDetail(stream, "Message", GLDebugMessageARBCallback.getMessage(length, message));
            });
            glDebugMessageCallbackARB(proc, NULL);
            return proc;
        }

        if (caps.GL_AMD_debug_output) {
            apiLog("[GL] Using AMD_debug_output for error logging.");
            GLDebugMessageAMDCallback proc = GLDebugMessageAMDCallback.create((id, category, severity, length, message, userParam) -> {
                stream.println("[LWJGL] AMD_debug_output message");
                printDetail(stream, "ID", String.format("0x%X", id));
                printDetail(stream, "Category", getCategoryAMD(category));
                printDetail(stream, "Severity", getSeverityAMD(severity));
                printDetail(stream, "Message", GLDebugMessageAMDCallback.getMessage(length, message));
            });
            glDebugMessageCallbackAMD(proc, NULL);
            return proc;
        }

        apiLog("[GL] No debug output implementation is available.");
        return null;
    }

    private static void printDetail(PrintStream stream, String type, String message) {
        stream.printf("\t%s: %s\n", type, message);
    }

    private static String getDebugSource(int source) {
        switch (source) {
            case GL_DEBUG_SOURCE_API:
                return "API";
            case GL_DEBUG_SOURCE_WINDOW_SYSTEM:
                return "WINDOW SYSTEM";
            case GL_DEBUG_SOURCE_SHADER_COMPILER:
                return "SHADER COMPILER";
            case GL_DEBUG_SOURCE_THIRD_PARTY:
                return "THIRD PARTY";
            case GL_DEBUG_SOURCE_APPLICATION:
                return "APPLICATION";
            case GL_DEBUG_SOURCE_OTHER:
                return "OTHER";
            default:
                return apiUnknownToken(source);
        }
    }

    private static String getDebugType(int type) {
        switch (type) {
            case GL_DEBUG_TYPE_ERROR:
                return "ERROR";
            case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR:
                return "DEPRECATED BEHAVIOR";
            case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR:
                return "UNDEFINED BEHAVIOR";
            case GL_DEBUG_TYPE_PORTABILITY:
                return "PORTABILITY";
            case GL_DEBUG_TYPE_PERFORMANCE:
                return "PERFORMANCE";
            case GL_DEBUG_TYPE_OTHER:
                return "OTHER";
            case GL_DEBUG_TYPE_MARKER:
                return "MARKER";
            default:
                return apiUnknownToken(type);
        }
    }

    private static String getDebugSeverity(int severity) {
        switch (severity) {
            case GL_DEBUG_SEVERITY_HIGH:
                return "HIGH";
            case GL_DEBUG_SEVERITY_MEDIUM:
                return "MEDIUM";
            case GL_DEBUG_SEVERITY_LOW:
                return "LOW";
            case GL_DEBUG_SEVERITY_NOTIFICATION:
                return "NOTIFICATION";
            default:
                return apiUnknownToken(severity);
        }
    }

    private static String getSourceARB(int source) {
        switch (source) {
            case GL_DEBUG_SOURCE_API_ARB:
                return "API";
            case GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB:
                return "WINDOW SYSTEM";
            case GL_DEBUG_SOURCE_SHADER_COMPILER_ARB:
                return "SHADER COMPILER";
            case GL_DEBUG_SOURCE_THIRD_PARTY_ARB:
                return "THIRD PARTY";
            case GL_DEBUG_SOURCE_APPLICATION_ARB:
                return "APPLICATION";
            case GL_DEBUG_SOURCE_OTHER_ARB:
                return "OTHER";
            default:
                return apiUnknownToken(source);
        }
    }

    private static String getTypeARB(int type) {
        switch (type) {
            case GL_DEBUG_TYPE_ERROR_ARB:
                return "ERROR";
            case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB:
                return "DEPRECATED BEHAVIOR";
            case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB:
                return "UNDEFINED BEHAVIOR";
            case GL_DEBUG_TYPE_PORTABILITY_ARB:
                return "PORTABILITY";
            case GL_DEBUG_TYPE_PERFORMANCE_ARB:
                return "PERFORMANCE";
            case GL_DEBUG_TYPE_OTHER_ARB:
                return "OTHER";
            default:
                return apiUnknownToken(type);
        }
    }

    private static String getSeverityARB(int severity) {
        switch (severity) {
            case GL_DEBUG_SEVERITY_HIGH_ARB:
                return "HIGH";
            case GL_DEBUG_SEVERITY_MEDIUM_ARB:
                return "MEDIUM";
            case GL_DEBUG_SEVERITY_LOW_ARB:
                return "LOW";
            default:
                return apiUnknownToken(severity);
        }
    }

    private static String getCategoryAMD(int category) {
        switch (category) {
            case GL_DEBUG_CATEGORY_API_ERROR_AMD:
                return "API ERROR";
            case GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD:
                return "WINDOW SYSTEM";
            case GL_DEBUG_CATEGORY_DEPRECATION_AMD:
                return "DEPRECATION";
            case GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD:
                return "UNDEFINED BEHAVIOR";
            case GL_DEBUG_CATEGORY_PERFORMANCE_AMD:
                return "PERFORMANCE";
            case GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD:
                return "SHADER COMPILER";
            case GL_DEBUG_CATEGORY_APPLICATION_AMD:
                return "APPLICATION";
            case GL_DEBUG_CATEGORY_OTHER_AMD:
                return "OTHER";
            default:
                return apiUnknownToken(category);
        }
    }

    private static String getSeverityAMD(int severity) {
        switch (severity) {
            case GL_DEBUG_SEVERITY_HIGH_AMD:
                return "HIGH";
            case GL_DEBUG_SEVERITY_MEDIUM_AMD:
                return "MEDIUM";
            case GL_DEBUG_SEVERITY_LOW_AMD:
                return "LOW";
            default:
                return apiUnknownToken(severity);
        }
    }

}