/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_spir.txt">khr_spir</a> extension.
 * 
 * <p>This extension adds support to create an OpenCL program object from a Standard Portable Intermediate Representation (SPIR) instance. SPIR is a vendor
 * neutral non-source representation for OpenCL C programs.</p>
 * 
 * <h3>Compiler Options</h3>
 * 
 * <p>The compile option {@code -x spir} must be specified to indicate that the binary is in SPIR format, and the compile option {@code -spir-std} must be
 * used to specify the version of the SPIR specification that describes the format and meaning of the binary. For example, if the binary is as described
 * in SPIR version 1.2, then {@code -spir-std=1.2} must be specified. Failing to specify these compile options may result in implementation defined
 * behavior.</p>
 */
public final class KHRSPIR {

    /**
     * Accepted by {@link CL10#clGetDeviceInfo GetDeviceInfo}. Returns a space separated list of SPIR versions supported by the device. For example returning “1.2 2.0” in this
     * query implies that SPIR version 1.2 and 2.0 are supported by the implementation.
     */
    public static final int CL_DEVICE_SPIR_VERSIONS = 0x40E0;

    /**
     * Returned by {@link CL10#clGetProgramBuildInfo GetProgramBuildInfo} when {@code param_name} is {@link CL12#CL_PROGRAM_BINARY_TYPE PROGRAM_BINARY_TYPE}.
     * 
     * <p>An intermediate (non-source) representation for the program is loaded as a binary. The program must be further processed with {@link CL12#clCompileProgram CompileProgram} or
     * {@link CL10#clBuildProgram BuildProgram}. If processed with {@link CL12#clCompileProgram CompileProgram}, the result will be a binary of type {@link CL12#CL_PROGRAM_BINARY_TYPE_COMPILED_OBJECT PROGRAM_BINARY_TYPE_COMPILED_OBJECT} or
     * {@link CL12#CL_PROGRAM_BINARY_TYPE_LIBRARY PROGRAM_BINARY_TYPE_LIBRARY}. If processed with {@link CL10#clBuildProgram BuildProgram}, the result will be a binary of type {@link CL12#CL_PROGRAM_BINARY_TYPE_EXECUTABLE PROGRAM_BINARY_TYPE_EXECUTABLE}.</p>
     */
    public static final int CL_PROGRAM_BINARY_TYPE_INTERMEDIATE = 0x40E1;

    private KHRSPIR() {}

}