/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link CL10#clBuildProgram BuildProgram}, {@link CL12#clCompileProgram CompileProgram} and {@link CL12#clLinkProgram LinkProgram} methods.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     cl_program program,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (cl_program, void *)")
public interface CLProgramCallbackI extends CallbackI.V {

    String SIGNATURE = Callback.__stdcall("(pp)v");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * Will be called when the program is built, compiled or linked.
     *
     * @param program   the program that was built, compiled or linked
     * @param user_data the user-specified value that was passed when calling {@link CL10#clBuildProgram BuildProgram}, {@link CL12#clCompileProgram CompileProgram} or {@link CL12#clLinkProgram LinkProgram}
     */
    void invoke(@NativeType("cl_program") long program, @NativeType("void *") long user_data);

}