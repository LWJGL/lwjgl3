/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda

import org.lwjgl.generator.*
import java.io.*

val NVRTC_BINDING = object : SimpleBinding(Module.CUDA, "NVRTC") {
    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        print  ("\n${t}private static final SharedLibrary NVRTC          = CUDA.getToolkitLibrary(NVRTC.class, Configuration.CUDA_NVRTC_LIBRARY_NAME, \"nvrtc\");")
        println("\n${t}private static final SharedLibrary NVRTC_BUILTINS = CUDA.getToolkitLibrary(NVRTC.class, Configuration.CUDA_NVRTC_BUILTINS_LIBRARY_NAME, \"nvrtc-builtins\");")
        generateFunctionsClass(nativeClass, "\n$t/** Contains the function pointers loaded from the NVRTC {@link SharedLibrary}. */")
        println("""
    /** Returns the NVRTC {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return NVRTC;
    }""")
    }
}

val nvrtcResult = "nvrtcResult".enumType
val nvrtcProgram = "nvrtcProgram".handle