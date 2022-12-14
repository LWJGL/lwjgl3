/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.freetype;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.util.freetype.FreeType.*;

public class HelloFreeType {

    public static void main(String[] args) {
        // For now just verify that the FreeType library loads correctly
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);

            int err = FT_Init_FreeType(pp);
            if (err != FT_Err_Ok) {
                throw new IllegalStateException("Failed to initialize FreeType: " + FT_Error_String(err));
            }

            long library = pp.get(0);

            IntBuffer major = stack.mallocInt(1);
            IntBuffer minor = stack.mallocInt(1);
            IntBuffer patch = stack.mallocInt(1);

            FT_Library_Version(library, major, minor, patch);
            System.out.println("Loaded FreeType " + major.get(0) + "." + minor.get(0) + "." + patch.get(0));

            FT_Done_FreeType(library);
        }

        // TODO: add real FreeType sample
    }

}
