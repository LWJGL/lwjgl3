/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>altera_compiler_mode</strong> extension.
 * 
 * <p>This extension specifies alternative device code compilation flows for OpenCL.</p>
 * 
 * <p>In standard OpenCL, there are two methods for preparing code for execution on an OpenCL device. The first is to compile OpenCL C code from source text
 * using an online compiler. The second is to load a precompiled device binary.</p>
 * 
 * <p>This extension specifies mechanisms to enable alternative workflows for compiling and loading device code. They enable simplified or optimized support
 * for the following development and deployment scenarios:</p>
 * 
 * <ul>
 * <li>The target OpenCL device is not available in the development environment.</li>
 * <li>The platform does not provide an online compiler for the target OpenCL device, or full online compilation is not desirable during host application
 * development.</li>
 * <li>The application only requires one device program, and does not need read access to the device binary.</li>
 * </ul>
 * 
 * <p>The development and deployment of a particular application may involve more than one of these scenarios.</p>
 */
public final class ALTERACompilerMode {

    /** New context properties to be used in the {@code properties} array supplied to to {@link CL10#clCreateContext CreateContext} or {@link CL10#clCreateContextFromType CreateContextFromType}. */
    public static final int
        CL_CONTEXT_COMPILER_MODE_ALTERA            = 0x40F0,
        CL_CONTEXT_PROGRAM_EXE_LIBRARY_ROOT_ALTERA = 0x40F1,
        CL_CONTEXT_OFFLINE_DEVICE_ALTERA           = 0x40F2;

    /** Values to be supplied for context property {@link #CL_CONTEXT_COMPILER_MODE_ALTERA CONTEXT_COMPILER_MODE_ALTERA}. */
    public static final int
        CL_CONTEXT_COMPILER_MODE_OFFLINE_ALTERA                    = 0,
        CL_CONTEXT_COMPILER_MODE_OFFLINE_CREATE_EXE_LIBRARY_ALTERA = 1,
        CL_CONTEXT_COMPILER_MODE_OFFLINE_USE_EXE_LIBRARY_ALTERA    = 2,
        CL_CONTEXT_COMPILER_MODE_PRELOADED_BINARY_ONLY_ALTERA      = 3;

    private ALTERACompilerMode() {}

}