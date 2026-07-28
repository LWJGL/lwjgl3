/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLSLangResourceLimits {

    private static final SharedLibrary SHADERC = Library.loadNative(GLSLangResourceLimits.class, "org.lwjgl.shaderc", Configuration.GLSLANG_RESOURCE_LIBRARY_NAME, Shaderc::getLibrary);

    /** Contains the function pointers loaded from the shaderc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            resource                = apiGetFunctionAddress(SHADERC, "glslang_resource"),
            default_resource        = apiGetFunctionAddress(SHADERC, "glslang_default_resource"),
            default_resource_string = apiGetFunctionAddress(SHADERC, "glslang_default_resource_string"),
            decode_resource_limits  = apiGetFunctionAddress(SHADERC, "glslang_decode_resource_limits");

    }

    /** Returns the shaderc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    protected GLSLangResourceLimits() {
        throw new UnsupportedOperationException();
    }

    // --- [ glslang_resource ] ---

    /** {@code glslang_resource_t * glslang_resource(void)} */
    public static long nglslang_resource() {
        long __functionAddress = Functions.resource;
        return invokeP(__functionAddress);
    }

    /** {@code glslang_resource_t * glslang_resource(void)} */
    @NativeType("glslang_resource_t *")
    public static @Nullable GLSLangResource glslang_resource() {
        long __result = nglslang_resource();
        return GLSLangResource.createSafe(__result);
    }

    // --- [ glslang_default_resource ] ---

    /** {@code glslang_resource_t const * glslang_default_resource(void)} */
    public static long nglslang_default_resource() {
        long __functionAddress = Functions.default_resource;
        return invokeP(__functionAddress);
    }

    /** {@code glslang_resource_t const * glslang_default_resource(void)} */
    @NativeType("glslang_resource_t const *")
    public static @Nullable GLSLangResource glslang_default_resource() {
        long __result = nglslang_default_resource();
        return GLSLangResource.createSafe(__result);
    }

    // --- [ glslang_default_resource_string ] ---

    /** {@code const char * glslang_default_resource_string(void)} */
    @NativeType("const char *")
    public static long glslang_default_resource_string() {
        long __functionAddress = Functions.default_resource_string;
        return invokeP(__functionAddress);
    }

    // --- [ glslang_decode_resource_limits ] ---

    /** {@code void glslang_decode_resource_limits(glslang_resource_t * resources, char * config)} */
    public static void nglslang_decode_resource_limits(long resources, long config) {
        long __functionAddress = Functions.decode_resource_limits;
        invokePPV(resources, config, __functionAddress);
    }

    /** {@code void glslang_decode_resource_limits(glslang_resource_t * resources, char * config)} */
    public static void glslang_decode_resource_limits(@NativeType("glslang_resource_t *") GLSLangResource resources, @NativeType("char *") ByteBuffer config) {
        if (CHECKS) {
            checkNT1(config);
        }
        nglslang_decode_resource_limits(resources.address(), memAddress(config));
    }

}