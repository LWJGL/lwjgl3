/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class LLVMTargetARM {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeARMTargetInfo   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeARMTargetInfo"),
            InitializeARMTarget       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeARMTarget"),
            InitializeARMTargetMC     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeARMTargetMC"),
            InitializeARMAsmPrinter   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeARMAsmPrinter"),
            InitializeARMAsmParser    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeARMAsmParser"),
            InitializeARMDisassembler = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeARMDisassembler");

    }

    protected LLVMTargetARM() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeARMTargetInfo ] ---

    /** {@code void LLVMInitializeARMTargetInfo(void)} */
    public static void LLVMInitializeARMTargetInfo() {
        long __functionAddress = Functions.InitializeARMTargetInfo;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeARMTarget ] ---

    /** {@code void LLVMInitializeARMTarget(void)} */
    public static void LLVMInitializeARMTarget() {
        long __functionAddress = Functions.InitializeARMTarget;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeARMTargetMC ] ---

    /** {@code void LLVMInitializeARMTargetMC(void)} */
    public static void LLVMInitializeARMTargetMC() {
        long __functionAddress = Functions.InitializeARMTargetMC;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeARMAsmPrinter ] ---

    /** {@code void LLVMInitializeARMAsmPrinter(void)} */
    public static void LLVMInitializeARMAsmPrinter() {
        long __functionAddress = Functions.InitializeARMAsmPrinter;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeARMAsmParser ] ---

    /** {@code void LLVMInitializeARMAsmParser(void)} */
    public static void LLVMInitializeARMAsmParser() {
        long __functionAddress = Functions.InitializeARMAsmParser;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializeARMDisassembler ] ---

    /** {@code void LLVMInitializeARMDisassembler(void)} */
    public static void LLVMInitializeARMDisassembler() {
        long __functionAddress = Functions.InitializeARMDisassembler;
        invokeV(__functionAddress);
    }

}