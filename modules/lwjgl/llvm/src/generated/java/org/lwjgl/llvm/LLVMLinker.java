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

    /**
     * This enum is provided for backwards-compatibility only. It has no effect.
     * 
     * <p>({@code LLVMLinkerMode})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMLinkerDestroySource LinkerDestroySource} - This is the default behavior.</li>
     * <li>{@link #LLVMLinkerPreserveSource_Removed LinkerPreserveSource_Removed} - This option has been deprecated and should not be used.</li>
     * </ul>
     */
    public static final int
        LLVMLinkerDestroySource          = 0,
        LLVMLinkerPreserveSource_Removed = 1;

    protected LLVMLinker() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMLinkModules2 ] ---

    /**
     * Links the source module into the destination module.
     * 
     * <p>The source module is destroyed. The return value is true if an error occurred, false otherwise. Use the diagnostic handler to get any diagnostic
     * message.</p>
     */
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