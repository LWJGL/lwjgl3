/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_stdinc = "SDLStdinc".nativeClassSDL("SDL_stdinc") {
    FloatConstant("FLT_EPSILON".."1.1920928955078125e-07F")

    IntConstant("INVALID_UNICODE_CODEPOINT".."0xFFFD")

    void.p(
        "malloc",

        AutoSizeResult..size_t("size")
    )

    void.p(
        "calloc",

        AutoSizeResult..size_t("nmemb"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "realloc",

        Unsafe..nullable..void.p("mem"),
        AutoSizeResult..size_t("size")
    )

    void(
        "free",

        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_POINTER
        )..Unsafe..nullable..void.p("mem")
    )

    void(
        "GetOriginalMemoryFunctions",

        Check(1)..nullable..SDL_malloc_func.p("malloc_func"),
        Check(1)..nullable..SDL_calloc_func.p("calloc_func"),
        Check(1)..nullable..SDL_realloc_func.p("realloc_func"),
        Check(1)..nullable..SDL_free_func.p("free_func")
    )

    void(
        "GetMemoryFunctions",

        Check(1)..nullable..SDL_malloc_func.p("malloc_func"),
        Check(1)..nullable..SDL_calloc_func.p("calloc_func"),
        Check(1)..nullable..SDL_realloc_func.p("realloc_func"),
        Check(1)..nullable..SDL_free_func.p("free_func")
    )

    bool(
        "SetMemoryFunctions",

        SDL_malloc_func("malloc_func"),
        SDL_calloc_func("calloc_func"),
        SDL_realloc_func("realloc_func"),
        SDL_free_func("free_func")
    )

    void.p(
        "aligned_alloc",

        size_t("alignment"),
        AutoSizeResult..size_t("size")
    )

    void(
        "aligned_free",

        Unsafe..nullable..void.p("mem")
    )

    int(
        "GetNumAllocations",

        void()
    )

    SDL_Environment.p("GetEnvironment", void())
    SDL_Environment.p("CreateEnvironment", bool("populated"))
    charUTF8.const.p(
        "GetEnvironmentVariable",

        SDL_Environment.p("env"),
        charUTF8.const.p("name")
    )

    opaque_p(
        "GetEnvironmentVariables",

        SDL_Environment.p("env")
    )

    bool(
        "SetEnvironmentVariable",

        SDL_Environment.p("env"),
        charUTF8.const.p("name"),
        charUTF8.const.p("value"),
        bool("overwrite")
    )

    bool(
        "UnsetEnvironmentVariable",

        SDL_Environment.p("env"),
        charUTF8.const.p("name")
    )

    void(
        "DestroyEnvironment",

        SDL_Environment.p("env")
    )

    charUTF8.const.p(
        "getenv",

        charUTF8.const.p("name")
    )

    charUTF8.const.p(
        "getenv_unsafe",

        charUTF8.const.p("name")
    )

    int(
        "setenv_unsafe",

        charUTF8.const.p("name"),
        charUTF8.const.p("value"),
        int("overwrite")
    )

    int(
        "unsetenv_unsafe",

        charUTF8.const.p("name")
    )

    void(
        "qsort",

        Check("nmemb * size")..void.p("base"),
        size_t("nmemb"),
        size_t("size"),
        SDL_CompareCallback("compare")
    )

    void.p(
        "bsearch",

        Check("size")..void.const.p("key"),
        Check("nmemb * size")..void.const.p("base"),
        size_t("nmemb"),
        AutoSizeResult..size_t("size"),
        SDL_CompareCallback("compare")
    )

    void(
        "qsort_r",

        Check("nmemb * size")..void.p("base"),
        size_t("nmemb"),
        size_t("size"),
        SDL_CompareCallback_r("compare"),
        nullable..opaque_p("userdata")
    )

    void.p(
        "bsearch_r",

        Check("size")..void.const.p("key"),
        Check("nmemb * size")..void.const.p("base"),
        size_t("nmemb"),
        AutoSizeResult..size_t("size"),
        SDL_CompareCallback_r("compare"),
        nullable..opaque_p("userdata")
    )

    Uint16(
        "crc16",

        Uint16("crc"),
        void.const.p("data"),
        AutoSize("data")..size_t("len")
    )

    Uint32(
        "crc32",

        Uint32("crc"),
        void.const.p("data"),
        AutoSize("data")..size_t("len")
    )

    Uint32(
        "murmur3_32",

        void.const.p("data"),
        AutoSize("data")..size_t("len"),
        Uint32("seed")
    )

    opaque_p(
        "memset4",

        MultiType(PointerMapping.DATA_INT)..void.p("dst"),
        Uint32("val"),
        AutoSizeShr("2", "dst")..size_t("dwords")
    )

    int(
        "memcmp",

        void.const.p("s1"),
        void.const.p("s2"),
        AutoSize("s1", "s2")..size_t("len")
    )

    void("srand", Uint64("seed"))
    Sint32("rand", Sint32("n"))
    float("randf", void())
    Uint32("rand_bits", void())

    Sint32("rand_r", Check(1)..Uint64.p("state"), Sint32("n"))
    float("randf_r", Check(1)..Uint64.p("state"))
    Uint32("rand_bits_r", Check(1)..Uint64.p("state"))

    /*double("acos", double("x"))
    float("acosf", float("x"))

    double("asin", double("x"))
    float("asinf", float("x"))

    double("atan", double("x"))
    float("atanf", float("x"))

    double("atan2", double("y"), double("x"))
    float("atan2f", float("y"), float("x"))

    double("ceil", double("x"))
    float("ceilf", float("x"))

    double("copysign", double("x"), double("y"))
    float("copysignf", float("x"), float("y"))

    double("cos", double("x"))
    float("cosf", float("x"))

    double("exp", double("x"))
    float("expf", float("x"))

    double("fabs", double("x"))
    float("fabsf", float("x"))

    double("floor", double("x"))
    float("floorf", float("x"))

    double("trunc", double("x"))
    float("truncf", float("x"))

    double("fmod", double("x"), double("y"))
    float("fmodf", float("x"), float("y"))

    int("isinf", double("x"))
    int("isinff", float("x"))

    int("isnan", double("x"))
    int("isnanf", float("x"))

    double("log", double("x"))
    float("logf", float("x"))

    double("log10", double("x"))
    float("log10f", float("x"))

    double("modf", double("x"), Check(1)..double.p("y"))
    float("modff", float("x"), Check(1)..float.p("y"))

    double("pow", double("x"), double("y"))
    float("powf", float("x"), float("y"))

    double("round", double("x"))
    float("roundf", float("x"))

    long("lround", double("x"))
    long("lroundf", float("x"))

    double("scalbn", double("x"), int("n"))
    float("scalbnf", float("x"), int("n"))

    double("sin", double("x"))
    float("sinf", float("x"))

    double("sqrt", double("x"))
    float("sqrtf", float("x"))

    double("tan", double("x"))
    float("tanf", float("x"))*/

    macro(expression = "((A & 0xFF) << 0) | ((B & 0xFF) << 8) | ((C & 0xFF) << 16) | ((D & 0xFF) << 24)")..uint32_t(
        "FOURCC",

        uint8_t("A"),
        uint8_t("B"),
        uint8_t("C"),
        uint8_t("D")
    )
}