/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class LLVMTargetX86 {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeX86TargetInfo   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeX86TargetInfo"),
            InitializeX86Target       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeX86Target"),
            InitializeX86TargetMC     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeX86TargetMC"),
            InitializeX86AsmPrinter   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeX86AsmPrinter"),
            InitializeX86AsmParser    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeX86AsmParser"),
            InitializeX86Disassembler = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeX86Disassembler");

    }

    protected LLVMTargetX86() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeX86TargetInfo ] ---

    public static void LLVMInitializeX86TargetInfo() {
        long __functionAddress = Functions.InitializeX86TargetInfo;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeX86Target ] ---

    public static void LLVMInitializeX86Target() {
        long __functionAddress = Functions.InitializeX86Target;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeX86TargetMC ] ---

    public static void LLVMInitializeX86TargetMC() {
        long __functionAddress = Functions.InitializeX86TargetMC;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeX86AsmPrinter ] ---

    public static void LLVMInitializeX86AsmPrinter() {
        long __functionAddress = Functions.InitializeX86AsmPrinter;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeX86AsmParser ] ---

    public static void LLVMInitializeX86AsmParser() {
        long __functionAddress = Functions.InitializeX86AsmParser;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeX86Disassembler ] ---

    public static void LLVMInitializeX86Disassembler() {
        long __functionAddress = Functions.InitializeX86Disassembler;
        invokeV(__functionAddress);
    }

}