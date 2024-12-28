/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_cpuinfo() = SDL.apply {
    IntConstant("CACHELINE_SIZE".."128")

    int(
        "GetNumLogicalCPUCores",

        void()
    )

    int(
        "GetCPUCacheLineSize",

        void()
    )

    _Bool(
        "HasAltiVec",

        void()
    )

    _Bool(
        "HasMMX",

        void()
    )

    _Bool(
        "HasSSE",

        void()
    )

    _Bool(
        "HasSSE2",

        void()
    )

    _Bool(
        "HasSSE3",

        void()
    )

    _Bool(
        "HasSSE41",

        void()
    )

    _Bool(
        "HasSSE42",

        void()
    )

    _Bool(
        "HasAVX",

        void()
    )

    _Bool(
        "HasAVX2",

        void()
    )

    _Bool(
        "HasAVX512F",

        void()
    )

    _Bool(
        "HasARMSIMD",

        void()
    )

    _Bool(
        "HasNEON",

        void()
    )

    _Bool(
        "HasLSX",

        void()
    )

    _Bool(
        "HasLASX",

        void()
    )

    int(
        "GetSystemRAM",

        void()
    )

    size_t(
        "GetSIMDAlignment",

        void()
    )

}
