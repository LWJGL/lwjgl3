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

public class LLVMLinker {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            LinkModules2 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMLinkModules2");

    }

    public static final int
        LLVMLinkerDestroySource          = 0,
        LLVMLinkerPreserveSource_Removed = 1;

    protected LLVMLinker() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMLinkModules2 ] ---

    /** {@code LLVMBool LLVMLinkModules2(LLVMModuleRef Dest, LLVMModuleRef Src)} */
    @NativeType("LLVMBool")
    public static boolean LLVMLinkModules2(@NativeType("LLVMModuleRef") long Dest, @NativeType("LLVMModuleRef") long Src) {
        long __functionAddress = Functions.LinkModules2;
        if (CHECKS) {
            check(Dest);
            check(Src);
        }
        return invokePPI(Dest, Src, __functionAddress) != 0;
    }

}