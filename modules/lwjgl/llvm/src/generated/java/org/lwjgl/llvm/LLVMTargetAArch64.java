/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class LLVMTargetAArch64 {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeAArch64TargetInfo   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAArch64TargetInfo"),
            InitializeAArch64Target       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAArch64Target"),
            InitializeAArch64TargetMC     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAArch64TargetMC"),
            InitializeAArch64AsmPrinter   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAArch64AsmPrinter"),
            InitializeAArch64AsmParser    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAArch64AsmParser"),
            InitializeAArch64Disassembler = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAArch64Disassembler");

    }

    protected LLVMTargetAArch64() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeAArch64TargetInfo ] ---

    /** {@code void LLVMInitializeAArch64TargetInfo(void)} */
    public static void LLVMInitializeAArch64TargetInfo() {
        long __functionAddress = Functions.InitializeAArch64TargetInfo;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAArch64Target ] ---

    /** {@code void LLVMInitializeAArch64Target(void)} */
    public static void LLVMInitializeAArch64Target() {
        long __functionAddress = Functions.InitializeAArch64Target;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAArch64TargetMC ] ---

    /** {@code void LLVMInitializeAArch64TargetMC(void)} */
    public static void LLVMInitializeAArch64TargetMC() {
        long __functionAddress = Functions.InitializeAArch64TargetMC;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAArch64AsmPrinter ] ---

    /** {@code void LLVMInitializeAArch64AsmPrinter(void)} */
    public static void LLVMInitializeAArch64AsmPrinter() {
        long __functionAddress = Functions.InitializeAArch64AsmPrinter;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAArch64AsmParser ] ---

    /** {@code void LLVMInitializeAArch64AsmParser(void)} */
    public static void LLVMInitializeAArch64AsmParser() {
        long __functionAddress = Functions.InitializeAArch64AsmParser;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeAArch64Disassembler ] ---

    /** {@code void LLVMInitializeAArch64Disassembler(void)} */
    public static void LLVMInitializeAArch64Disassembler() {
        long __functionAddress = Functions.InitializeAArch64Disassembler;
        invokeV(__functionAddress);
    }

}