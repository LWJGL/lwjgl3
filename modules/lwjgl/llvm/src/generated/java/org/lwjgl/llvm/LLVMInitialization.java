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

    protected LLVMInitialization() {
        throw new UnsupportedOperationException();
    }

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
            InitializeInstCombine            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeInstCombine"),
            InitializeAggressiveInstCombiner = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAggressiveInstCombiner"),
            InitializeIPO                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeIPO"),
            InitializeInstrumentation        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeInstrumentation"),
            InitializeAnalysis               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAnalysis"),
            InitializeIPA                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeIPA"),
            InitializeCodeGen                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeCodeGen"),
            InitializeTarget                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeTarget");

    }

    // --- [ LLVMInitializeCore ] ---

    public static void LLVMInitializeCore(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeCore;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeTransformUtils ] ---

    public static void LLVMInitializeTransformUtils(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeTransformUtils;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeScalarOpts ] ---

    public static void LLVMInitializeScalarOpts(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeScalarOpts;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeObjCARCOpts ] ---

    public static void LLVMInitializeObjCARCOpts(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeObjCARCOpts;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeVectorization ] ---

    public static void LLVMInitializeVectorization(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeVectorization;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeInstCombine ] ---

    public static void LLVMInitializeInstCombine(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeInstCombine;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeAggressiveInstCombiner ] ---

    public static void LLVMInitializeAggressiveInstCombiner(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeAggressiveInstCombiner;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeIPO ] ---

    public static void LLVMInitializeIPO(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeIPO;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeInstrumentation ] ---

    public static void LLVMInitializeInstrumentation(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeInstrumentation;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeAnalysis ] ---

    public static void LLVMInitializeAnalysis(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeAnalysis;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeIPA ] ---

    public static void LLVMInitializeIPA(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeIPA;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeCodeGen ] ---

    public static void LLVMInitializeCodeGen(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeCodeGen;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMInitializeTarget ] ---

    public static void LLVMInitializeTarget(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeTarget;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

}