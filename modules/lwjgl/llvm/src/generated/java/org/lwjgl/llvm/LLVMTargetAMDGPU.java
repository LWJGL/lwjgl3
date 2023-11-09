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

public class LLVMTargetAMDGPU {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeAMDGPUTargetInfo   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAMDGPUTargetInfo"),
            InitializeAMDGPUTarget       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAMDGPUTarget"),
            InitializeAMDGPUTargetMC     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAMDGPUTargetMC"),
            InitializeAMDGPUTargetMCA    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMInitializeAMDGPUTargetMCA"),
            InitializeAMDGPUAsmPrinter   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAMDGPUAsmPrinter"),
            InitializeAMDGPUAsmParser    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAMDGPUAsmParser"),
            InitializeAMDGPUDisassembler = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAMDGPUDisassembler");

    }

    protected LLVMTargetAMDGPU() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeAMDGPUTargetInfo ] ---

    public static void LLVMInitializeAMDGPUTargetInfo() {
        long __functionAddress = Functions.InitializeAMDGPUTargetInfo;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAMDGPUTarget ] ---

    public static void LLVMInitializeAMDGPUTarget() {
        long __functionAddress = Functions.InitializeAMDGPUTarget;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAMDGPUTargetMC ] ---

    public static void LLVMInitializeAMDGPUTargetMC() {
        long __functionAddress = Functions.InitializeAMDGPUTargetMC;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAMDGPUTargetMCA ] ---

    public static void LLVMInitializeAMDGPUTargetMCA() {
        long __functionAddress = Functions.InitializeAMDGPUTargetMCA;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAMDGPUAsmPrinter ] ---

    public static void LLVMInitializeAMDGPUAsmPrinter() {
        long __functionAddress = Functions.InitializeAMDGPUAsmPrinter;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAMDGPUAsmParser ] ---

    public static void LLVMInitializeAMDGPUAsmParser() {
        long __functionAddress = Functions.InitializeAMDGPUAsmParser;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAMDGPUDisassembler ] ---

    public static void LLVMInitializeAMDGPUDisassembler() {
        long __functionAddress = Functions.InitializeAMDGPUDisassembler;
        invokeV(__functionAddress);
    }

}