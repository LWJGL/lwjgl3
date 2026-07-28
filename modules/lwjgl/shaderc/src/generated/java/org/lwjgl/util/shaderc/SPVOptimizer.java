/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SPVOptimizer {

    private static final SharedLibrary SHADERC = Library.loadNative(SPVOptimizer.class, "org.lwjgl.shaderc", Configuration.SPIRV_TOOLS_OPTIMIZER_LIBRARY_NAME, Shaderc::getLibrary);

    /** Contains the function pointers loaded from the shaderc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OptimizerCreate                                             = apiGetFunctionAddress(SHADERC, "spvOptimizerCreate"),
            OptimizerDestroy                                            = apiGetFunctionAddress(SHADERC, "spvOptimizerDestroy"),
            OptimizerSetMessageConsumer                                 = apiGetFunctionAddress(SHADERC, "spvOptimizerSetMessageConsumer"),
            OptimizerRegisterLegalizationPasses                         = apiGetFunctionAddress(SHADERC, "spvOptimizerRegisterLegalizationPasses"),
            OptimizerRegisterPerformancePasses                          = apiGetFunctionAddress(SHADERC, "spvOptimizerRegisterPerformancePasses"),
            OptimizerRegisterSizePasses                                 = apiGetFunctionAddress(SHADERC, "spvOptimizerRegisterSizePasses"),
            OptimizerRegisterPassFromFlag                               = apiGetFunctionAddress(SHADERC, "spvOptimizerRegisterPassFromFlag"),
            OptimizerRegisterPassesFromFlags                            = apiGetFunctionAddress(SHADERC, "spvOptimizerRegisterPassesFromFlags"),
            OptimizerRegisterPassesFromFlagsWhilePreservingTheInterface = apiGetFunctionAddress(SHADERC, "spvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface"),
            OptimizerRun                                                = apiGetFunctionAddress(SHADERC, "spvOptimizerRun");

    }

    /** Returns the shaderc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    protected SPVOptimizer() {
        throw new UnsupportedOperationException();
    }

    // --- [ spvOptimizerCreate ] ---

    /** {@code spv_optimizer_t * spvOptimizerCreate(spv_target_env env)} */
    @NativeType("spv_optimizer_t *")
    public static long spvOptimizerCreate(@NativeType("spv_target_env") int env) {
        long __functionAddress = Functions.OptimizerCreate;
        return invokeP(env, __functionAddress);
    }

    // --- [ spvOptimizerDestroy ] ---

    /** {@code void spvOptimizerDestroy(spv_optimizer_t * optimizer)} */
    public static void spvOptimizerDestroy(@NativeType("spv_optimizer_t *") long optimizer) {
        long __functionAddress = Functions.OptimizerDestroy;
        if (CHECKS) {
            check(optimizer);
        }
        invokePV(optimizer, __functionAddress);
    }

    // --- [ spvOptimizerSetMessageConsumer ] ---

    /** {@code void spvOptimizerSetMessageConsumer(spv_optimizer_t * optimizer, spv_message_consumer consumer)} */
    public static void nspvOptimizerSetMessageConsumer(long optimizer, long consumer) {
        long __functionAddress = Functions.OptimizerSetMessageConsumer;
        if (CHECKS) {
            check(optimizer);
        }
        invokePPV(optimizer, consumer, __functionAddress);
    }

    /** {@code void spvOptimizerSetMessageConsumer(spv_optimizer_t * optimizer, spv_message_consumer consumer)} */
    public static void spvOptimizerSetMessageConsumer(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("spv_message_consumer") @Nullable SPVMessageConsumerI consumer) {
        nspvOptimizerSetMessageConsumer(optimizer, memAddressSafe(consumer));
    }

    // --- [ spvOptimizerRegisterLegalizationPasses ] ---

    /** {@code void spvOptimizerRegisterLegalizationPasses(spv_optimizer_t * optimizer)} */
    public static void spvOptimizerRegisterLegalizationPasses(@NativeType("spv_optimizer_t *") long optimizer) {
        long __functionAddress = Functions.OptimizerRegisterLegalizationPasses;
        if (CHECKS) {
            check(optimizer);
        }
        invokePV(optimizer, __functionAddress);
    }

    // --- [ spvOptimizerRegisterPerformancePasses ] ---

    /** {@code void spvOptimizerRegisterPerformancePasses(spv_optimizer_t * optimizer)} */
    public static void spvOptimizerRegisterPerformancePasses(@NativeType("spv_optimizer_t *") long optimizer) {
        long __functionAddress = Functions.OptimizerRegisterPerformancePasses;
        if (CHECKS) {
            check(optimizer);
        }
        invokePV(optimizer, __functionAddress);
    }

    // --- [ spvOptimizerRegisterSizePasses ] ---

    /** {@code void spvOptimizerRegisterSizePasses(spv_optimizer_t * optimizer)} */
    public static void spvOptimizerRegisterSizePasses(@NativeType("spv_optimizer_t *") long optimizer) {
        long __functionAddress = Functions.OptimizerRegisterSizePasses;
        if (CHECKS) {
            check(optimizer);
        }
        invokePV(optimizer, __functionAddress);
    }

    // --- [ spvOptimizerRegisterPassFromFlag ] ---

    /** {@code bool spvOptimizerRegisterPassFromFlag(spv_optimizer_t * optimizer, char const * flag)} */
    public static boolean nspvOptimizerRegisterPassFromFlag(long optimizer, long flag) {
        long __functionAddress = Functions.OptimizerRegisterPassFromFlag;
        if (CHECKS) {
            check(optimizer);
        }
        return invokePPZ(optimizer, flag, __functionAddress);
    }

    /** {@code bool spvOptimizerRegisterPassFromFlag(spv_optimizer_t * optimizer, char const * flag)} */
    @NativeType("bool")
    public static boolean spvOptimizerRegisterPassFromFlag(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("char const *") ByteBuffer flag) {
        if (CHECKS) {
            checkNT1(flag);
        }
        return nspvOptimizerRegisterPassFromFlag(optimizer, memAddress(flag));
    }

    /** {@code bool spvOptimizerRegisterPassFromFlag(spv_optimizer_t * optimizer, char const * flag)} */
    @NativeType("bool")
    public static boolean spvOptimizerRegisterPassFromFlag(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("char const *") CharSequence flag) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(flag, true);
            long flagEncoded = stack.getPointerAddress();
            return nspvOptimizerRegisterPassFromFlag(optimizer, flagEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvOptimizerRegisterPassesFromFlags ] ---

    /** {@code bool spvOptimizerRegisterPassesFromFlags(spv_optimizer_t * optimizer, char const ** flags, size_t const flag_count)} */
    public static boolean nspvOptimizerRegisterPassesFromFlags(long optimizer, long flags, long flag_count) {
        long __functionAddress = Functions.OptimizerRegisterPassesFromFlags;
        if (CHECKS) {
            check(optimizer);
        }
        return invokePPPZ(optimizer, flags, flag_count, __functionAddress);
    }

    /** {@code bool spvOptimizerRegisterPassesFromFlags(spv_optimizer_t * optimizer, char const ** flags, size_t const flag_count)} */
    @NativeType("bool")
    public static boolean spvOptimizerRegisterPassesFromFlags(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("char const **") PointerBuffer flags) {
        return nspvOptimizerRegisterPassesFromFlags(optimizer, memAddress(flags), flags.remaining());
    }

    // --- [ spvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface ] ---

    /** {@code bool spvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(spv_optimizer_t * optimizer, char const ** flags, size_t const flag_count)} */
    public static boolean nspvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(long optimizer, long flags, long flag_count) {
        long __functionAddress = Functions.OptimizerRegisterPassesFromFlagsWhilePreservingTheInterface;
        if (CHECKS) {
            check(optimizer);
        }
        return invokePPPZ(optimizer, flags, flag_count, __functionAddress);
    }

    /** {@code bool spvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(spv_optimizer_t * optimizer, char const ** flags, size_t const flag_count)} */
    @NativeType("bool")
    public static boolean spvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("char const **") PointerBuffer flags) {
        return nspvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(optimizer, memAddress(flags), flags.remaining());
    }

    // --- [ spvOptimizerRun ] ---

    /** {@code spv_result_t spvOptimizerRun(spv_optimizer_t * optimizer, uint32_t const * binary, size_t const word_count, spv_binary * optimized_binary, spv_optimizer_options const options)} */
    public static int nspvOptimizerRun(long optimizer, long binary, long word_count, long optimized_binary, long options) {
        long __functionAddress = Functions.OptimizerRun;
        if (CHECKS) {
            check(optimizer);
            check(options);
        }
        return invokePPPPPI(optimizer, binary, word_count, optimized_binary, options, __functionAddress);
    }

    /** {@code spv_result_t spvOptimizerRun(spv_optimizer_t * optimizer, uint32_t const * binary, size_t const word_count, spv_binary * optimized_binary, spv_optimizer_options const options)} */
    @NativeType("spv_result_t")
    public static int spvOptimizerRun(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("uint32_t const *") IntBuffer binary, @NativeType("spv_binary *") PointerBuffer optimized_binary, @NativeType("spv_optimizer_options const") long options) {
        if (CHECKS) {
            check(optimized_binary, 1);
        }
        return nspvOptimizerRun(optimizer, memAddress(binary), binary.remaining(), memAddress(optimized_binary), options);
    }

}