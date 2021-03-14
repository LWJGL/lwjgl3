/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class LLVMInitialization {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeCore                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeCore"),
            InitializeTransformUtils         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeTransformUtils"),
            InitializeScalarOpts             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeScalarOpts"),
            InitializeObjCARCOpts            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeObjCARCOpts"),
            InitializeVectorization          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeVectorization"),
            InitializeInstCombine            = LLVMCore.getLibrary().getFunctionAddress("LLVMInitializeInstCombine"),
            InitializeAggressiveInstCombiner = LLVMCore.getLibrary().getFunctionAddress("LLVMInitializeAggressiveInstCombiner"),
            InitializeIPO                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeIPO"),
            InitializeInstrumentation        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeInstrumentation"),
            InitializeAnalysis               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAnalysis"),
            InitializeIPA                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeIPA"),
            InitializeCodeGen                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeCodeGen"),
            InitializeTarget                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeTarget");

    }

    protected LLVMInitialization() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeCore ] ---

    public static void LLVMInitializeCore(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeCore;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeTransformUtils ] ---

    public static void LLVMInitializeTransformUtils(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeTransformUtils;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeScalarOpts ] ---

    public static void LLVMInitializeScalarOpts(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeScalarOpts;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeObjCARCOpts ] ---

    public static void LLVMInitializeObjCARCOpts(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeObjCARCOpts;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeVectorization ] ---

    public static void LLVMInitializeVectorization(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeVectorization;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeInstCombine ] ---

    public static void LLVMInitializeInstCombine(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeInstCombine;
        if (CHECKS) {
            check(__functionAddress);
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeAggressiveInstCombiner ] ---

    public static void LLVMInitializeAggressiveInstCombiner(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeAggressiveInstCombiner;
        if (CHECKS) {
            check(__functionAddress);
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeIPO ] ---

    public static void LLVMInitializeIPO(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeIPO;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeInstrumentation ] ---

    public static void LLVMInitializeInstrumentation(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeInstrumentation;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeAnalysis ] ---

    public static void LLVMInitializeAnalysis(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeAnalysis;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeIPA ] ---

    public static void LLVMInitializeIPA(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeIPA;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeCodeGen ] ---

    public static void LLVMInitializeCodeGen(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeCodeGen;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeTarget ] ---

    public static void LLVMInitializeTarget(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeTarget;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

}