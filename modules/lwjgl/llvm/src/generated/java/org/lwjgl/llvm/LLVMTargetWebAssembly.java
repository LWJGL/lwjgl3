/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class LLVMTargetWebAssembly {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeWebAssemblyTargetInfo   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeWebAssemblyTargetInfo"),
            InitializeWebAssemblyTarget       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeWebAssemblyTarget"),
            InitializeWebAssemblyTargetMC     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeWebAssemblyTargetMC"),
            InitializeWebAssemblyAsmPrinter   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeWebAssemblyAsmPrinter"),
            InitializeWebAssemblyAsmParser    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeWebAssemblyAsmParser"),
            InitializeWebAssemblyDisassembler = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeWebAssemblyDisassembler");

    }

    protected LLVMTargetWebAssembly() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeWebAssemblyTargetInfo ] ---

    public static void LLVMInitializeWebAssemblyTargetInfo() {
        long __functionAddress = Functions.InitializeWebAssemblyTargetInfo;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeWebAssemblyTarget ] ---

    public static void LLVMInitializeWebAssemblyTarget() {
        long __functionAddress = Functions.InitializeWebAssemblyTarget;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeWebAssemblyTargetMC ] ---

    public static void LLVMInitializeWebAssemblyTargetMC() {
        long __functionAddress = Functions.InitializeWebAssemblyTargetMC;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeWebAssemblyAsmPrinter ] ---

    public static void LLVMInitializeWebAssemblyAsmPrinter() {
        long __functionAddress = Functions.InitializeWebAssemblyAsmPrinter;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeWebAssemblyAsmParser ] ---

    public static void LLVMInitializeWebAssemblyAsmParser() {
        long __functionAddress = Functions.InitializeWebAssemblyAsmParser;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeWebAssemblyDisassembler ] ---

    public static void LLVMInitializeWebAssemblyDisassembler() {
        long __functionAddress = Functions.InitializeWebAssemblyDisassembler;
        invokeV(__functionAddress);
    }

}