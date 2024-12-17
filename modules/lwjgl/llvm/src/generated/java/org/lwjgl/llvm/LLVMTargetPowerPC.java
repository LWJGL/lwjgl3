/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class LLVMTargetPowerPC {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializePowerPCTargetInfo   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializePowerPCTargetInfo"),
            InitializePowerPCTarget       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializePowerPCTarget"),
            InitializePowerPCTargetMC     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializePowerPCTargetMC"),
            InitializePowerPCAsmPrinter   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializePowerPCAsmPrinter"),
            InitializePowerPCAsmParser    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializePowerPCAsmParser"),
            InitializePowerPCDisassembler = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializePowerPCDisassembler");

    }

    protected LLVMTargetPowerPC() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializePowerPCTargetInfo ] ---

    /** {@code void LLVMInitializePowerPCTargetInfo(void)} */
    public static void LLVMInitializePowerPCTargetInfo() {
        long __functionAddress = Functions.InitializePowerPCTargetInfo;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializePowerPCTarget ] ---

    /** {@code void LLVMInitializePowerPCTarget(void)} */
    public static void LLVMInitializePowerPCTarget() {
        long __functionAddress = Functions.InitializePowerPCTarget;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializePowerPCTargetMC ] ---

    /** {@code void LLVMInitializePowerPCTargetMC(void)} */
    public static void LLVMInitializePowerPCTargetMC() {
        long __functionAddress = Functions.InitializePowerPCTargetMC;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializePowerPCAsmPrinter ] ---

    /** {@code void LLVMInitializePowerPCAsmPrinter(void)} */
    public static void LLVMInitializePowerPCAsmPrinter() {
        long __functionAddress = Functions.InitializePowerPCAsmPrinter;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializePowerPCAsmParser ] ---

    /** {@code void LLVMInitializePowerPCAsmParser(void)} */
    public static void LLVMInitializePowerPCAsmParser() {
        long __functionAddress = Functions.InitializePowerPCAsmParser;
        invokeV(__functionAddress);
    }

    // --- [ LLVMInitializePowerPCDisassembler ] ---

    /** {@code void LLVMInitializePowerPCDisassembler(void)} */
    public static void LLVMInitializePowerPCDisassembler() {
        long __functionAddress = Functions.InitializePowerPCDisassembler;
        invokeV(__functionAddress);
    }

}