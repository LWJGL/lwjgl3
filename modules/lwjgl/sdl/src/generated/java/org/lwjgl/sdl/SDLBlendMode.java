/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class SDLBlendMode {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ComposeCustomBlendMode = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ComposeCustomBlendMode");

    }

    public static final int
        SDL_BLENDMODE_NONE                = 0x00000000,
        SDL_BLENDMODE_BLEND               = 0x00000001,
        SDL_BLENDMODE_BLEND_PREMULTIPLIED = 0x00000010,
        SDL_BLENDMODE_ADD                 = 0x00000002,
        SDL_BLENDMODE_ADD_PREMULTIPLIED   = 0x00000020,
        SDL_BLENDMODE_MOD                 = 0x00000004,
        SDL_BLENDMODE_MUL                 = 0x00000008,
        SDL_BLENDMODE_INVALID             = 0x7FFFFFFF;

    public static final int
        SDL_BLENDOPERATION_ADD          = 0x1,
        SDL_BLENDOPERATION_SUBTRACT     = 0x2,
        SDL_BLENDOPERATION_REV_SUBTRACT = 0x3,
        SDL_BLENDOPERATION_MINIMUM      = 0x4,
        SDL_BLENDOPERATION_MAXIMUM      = 0x5;

    public static final int
        SDL_BLENDFACTOR_ZERO                = 0x1,
        SDL_BLENDFACTOR_ONE                 = 0x2,
        SDL_BLENDFACTOR_SRC_COLOR           = 0x3,
        SDL_BLENDFACTOR_ONE_MINUS_SRC_COLOR = 0x4,
        SDL_BLENDFACTOR_SRC_ALPHA           = 0x5,
        SDL_BLENDFACTOR_ONE_MINUS_SRC_ALPHA = 0x6,
        SDL_BLENDFACTOR_DST_COLOR           = 0x7,
        SDL_BLENDFACTOR_ONE_MINUS_DST_COLOR = 0x8,
        SDL_BLENDFACTOR_DST_ALPHA           = 0x9,
        SDL_BLENDFACTOR_ONE_MINUS_DST_ALPHA = 0xA;

    protected SDLBlendMode() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_ComposeCustomBlendMode ] ---

    /** {@code SDL_BlendMode SDL_ComposeCustomBlendMode(SDL_BlendFactor srcColorFactor, SDL_BlendFactor dstColorFactor, SDL_BlendOperation colorOperation, SDL_BlendFactor srcAlphaFactor, SDL_BlendFactor dstAlphaFactor, SDL_BlendOperation alphaOperation)} */
    @NativeType("SDL_BlendMode")
    public static int SDL_ComposeCustomBlendMode(@NativeType("SDL_BlendFactor") int srcColorFactor, @NativeType("SDL_BlendFactor") int dstColorFactor, @NativeType("SDL_BlendOperation") int colorOperation, @NativeType("SDL_BlendFactor") int srcAlphaFactor, @NativeType("SDL_BlendFactor") int dstAlphaFactor, @NativeType("SDL_BlendOperation") int alphaOperation) {
        long __functionAddress = Functions.ComposeCustomBlendMode;
        return invokeI(srcColorFactor, dstColorFactor, colorOperation, srcAlphaFactor, dstAlphaFactor, alphaOperation, __functionAddress);
    }

}