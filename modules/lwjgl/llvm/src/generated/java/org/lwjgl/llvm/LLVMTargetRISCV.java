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

public class LLVMTargetRISCV {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeRISCVTargetInfo   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeRISCVTargetInfo"),
            InitializeRISCVTarget       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeRISCVTarget"),
            InitializeRISCVTargetMC     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeRISCVTargetMC"),
            InitializeRISCVTargetMCA    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMInitializeRISCVTargetMCA"),
            InitializeRISCVAsmPrinter   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeRISCVAsmPrinter"),
            InitializeRISCVAsmParser    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeRISCVAsmParser"),
            InitializeRISCVDisassembler = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeRISCVDisassembler");

    }

    protected LLVMTargetRISCV() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeRISCVTargetInfo ] ---

    public static void LLVMInitializeRISCVTargetInfo() {
        long __functionAddress = Functions.InitializeRISCVTargetInfo;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeRISCVTarget ] ---

    public static void LLVMInitializeRISCVTarget() {
        long __functionAddress = Functions.InitializeRISCVTarget;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeRISCVTargetMC ] ---

    public static void LLVMInitializeRISCVTargetMC() {
        long __functionAddress = Functions.InitializeRISCVTargetMC;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeRISCVTargetMCA ] ---

    public static void LLVMInitializeRISCVTargetMCA() {
        long __functionAddress = Functions.InitializeRISCVTargetMCA;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeRISCVAsmPrinter ] ---

    public static void LLVMInitializeRISCVAsmPrinter() {
        long __functionAddress = Functions.InitializeRISCVAsmPrinter;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeRISCVAsmParser ] ---

    public static void LLVMInitializeRISCVAsmParser() {
        long __functionAddress = Functions.InitializeRISCVAsmParser;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeRISCVDisassembler ] ---

    public static void LLVMInitializeRISCVDisassembler() {
        long __functionAddress = Functions.InitializeRISCVDisassembler;
        invokeV(__functionAddress);
    }

}