/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.fmod;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.fmod.FMOD.*;
import static org.lwjgl.fmod.FMODStudio.*;
import static org.lwjgl.fmod.FSBank.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class HelloFMOD {

    public static void main(String[] args) {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);

            // Test FMOD Core
            {
                check(FMOD_System_Create(pp, FMOD_VERSION));

                long fmod = pp.get(0);

                check(FMOD_System_Init(fmod, 2, 0, NULL));
                check(FMOD_System_Release(fmod));
            }

            // Test FMOD Studio
            {
                check(FMOD_Studio_System_Create(pp, FMOD_VERSION));

                long studio = pp.get(0);

                check(FMOD_Studio_System_Initialize(studio, 2, 0, 0, NULL));
                check(FMOD_Studio_System_Release(studio));
            }

            // Test FSBank
            {
                check(FSBank_Init(FSBANK_FSBVERSION_FSB5, FSBANK_INIT_NORMAL, 1, (String)null));

                check(FSBank_Release());
            }
        }

        // TODO: add real FMOD sample
    }

    private static void check(int result) {
        if (result != 0) {
            throw new IllegalStateException("FMOD returned error code: " + result);
        }
    }
}
