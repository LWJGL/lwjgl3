/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class LLVMTargetMips {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeMipsTargetInfo   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeMipsTargetInfo"),
            InitializeMipsTarget       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeMipsTarget"),
            InitializeMipsTargetMC     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeMipsTargetMC"),
            InitializeMipsAsmPrinter   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeMipsAsmPrinter"),
            InitializeMipsAsmParser    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeMipsAsmParser"),
            InitializeMipsDisassembler = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeMipsDisassembler");

    }

    protected LLVMTargetMips() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeMipsTargetInfo ] ---

    /** {@code void LLVMInitializeMipsTargetInfo(void)} */
    public static void LLVMInitializeMipsTargetInfo() {
        long __functionAddress = Functions.InitializeMipsTargetInfo;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeMipsTarget ] ---

    /** {@code void LLVMInitializeMipsTarget(void)} */
    public static void LLVMInitializeMipsTarget() {
        long __functionAddress = Functions.InitializeMipsTarget;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeMipsTargetMC ] ---

    /** {@code void LLVMInitializeMipsTargetMC(void)} */
    public static void LLVMInitializeMipsTargetMC() {
        long __functionAddress = Functions.InitializeMipsTargetMC;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeMipsAsmPrinter ] ---

    /** {@code void LLVMInitializeMipsAsmPrinter(void)} */
    public static void LLVMInitializeMipsAsmPrinter() {
        long __functionAddress = Functions.InitializeMipsAsmPrinter;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeMipsAsmParser ] ---

    /** {@code void LLVMInitializeMipsAsmParser(void)} */
    public static void LLVMInitializeMipsAsmParser() {
        long __functionAddress = Functions.InitializeMipsAsmParser;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeMipsDisassembler ] ---

    /** {@code void LLVMInitializeMipsDisassembler(void)} */
    public static void LLVMInitializeMipsDisassembler() {
        long __functionAddress = Functions.InitializeMipsDisassembler;
        invokeV(__functionAddress);
    }

}