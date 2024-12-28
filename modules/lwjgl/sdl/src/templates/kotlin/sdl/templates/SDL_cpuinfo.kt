/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_cpuinfo = "SDLCPUInfo".nativeClassSDL("SDL_cpuinfo") {
    IntConstant("CACHELINE_SIZE".."128")

    int("GetNumLogicalCPUCores", void())
    int("GetCPUCacheLineSize", void())

    bool("HasAltiVec", void())
    bool("HasMMX", void())
    bool("HasSSE", void())
    bool("HasSSE2", void())
    bool("HasSSE3", void())
    bool("HasSSE41", void())
    bool("HasSSE42", void())
    bool("HasAVX", void())
    bool("HasAVX2", void())
    bool("HasAVX512F", void())
    bool("HasARMSIMD", void())
    bool("HasNEON", void())
    bool("HasLSX", void())
    bool("HasLASX", void())

    int("GetSystemRAM", void())

    size_t("GetSIMDAlignment", void())
}