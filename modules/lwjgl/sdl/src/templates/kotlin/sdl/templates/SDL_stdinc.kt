/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_stdinc() = SDL.apply {
    FloatConstant("FLT_EPSILON"..1.1920928955078125e-07F)

    IntConstant("INVALID_UNICODE_CODEPOINT"..0xFFFD)

    EnumConstant(
        "DUMMY_ENUM_VALUE".enum("0")
    ).noPrefix()

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

        Unsafe..nullable..void.p("mem")
    )

    void(
        "GetOriginalMemoryFunctions",

        Check(1)..SDL_malloc_func.p("malloc_func"),
        Check(1)..SDL_calloc_func.p("calloc_func"),
        Check(1)..SDL_realloc_func.p("realloc_func"),
        Check(1)..SDL_free_func.p("free_func")
    )

    void(
        "GetMemoryFunctions",

        Check(1)..SDL_malloc_func.p("malloc_func"),
        Check(1)..SDL_calloc_func.p("calloc_func"),
        Check(1)..SDL_realloc_func.p("realloc_func"),
        Check(1)..SDL_free_func.p("free_func")
    )

    _Bool(
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

    int("abs", int("x"))

    intb("isalpha", int("x"))
    intb("isalnum", int("x"))
    intb("isblank", int("x"))
    intb("iscntrl", int("x"))
    intb("isdigit", int("x"))
    intb("isxdigit", int("x"))
    intb("ispunct", int("x"))
    intb("isspace", int("x"))
    intb("isupper", int("x"))
    intb("islower", int("x"))
    intb("isprint", int("x"))
    intb("isgraph", int("x"))

    int("toupper", int("x"))
    int("tolower", int("x"))

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

    void(
        "srand",

        Uint64("seed")
    )

    Sint32(
        "rand",

        Sint32("n")
    )

    float(
        "randf",

        void()
    )

    Uint32(
        "rand_bits",

        void()
    )

    Sint32(
        "rand_r",

        Check(1)..Uint64.p("state"),
        Sint32("n")
    )

    float(
        "randf_r",

        Check(1)..Uint64.p("state")
    )

    Uint32(
        "rand_bits_r",

        Check(1)..Uint64.p("state")
    )

    double("acos", double("x"))
    float("acosf", float("x"))

    double("asin", double("x"))
    float("asinf", float("x"))

    double("atan", double("x"))
    float("atanf", float("x"))

    double(
        "atan2",

        double("y"),
        double("x")
    )

    float(
        "atan2f",

        float("y"),
        float("x")
    )

    double("ceil", double("x"))
    float("ceilf", float("x"))

    double(
        "copysign",

        double("x"),
        double("y")
    )

    float(
        "copysignf",

        float("x"),
        float("y")
    )

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

    double(
        "fmod",

        double("x"),
        double("y")
    )

    float(
        "fmodf",

        float("x"),
        float("y")
    )

    int("isinf", double("x"))
    int("isinff", float("x"))

    int("isnan", double("x"))
    int("isnanf", float("x"))

    double("log", double("x"))
    float("logf", float("x"))

    double("log10", double("x"))
    float("log10f", float("x"))

    double(
        "modf",

        double("x"),
        Check(1)..double.p("y")
    )

    float(
        "modff",

        float("x"),
        Check(1)..float.p("y")
    )

    double(
        "pow",

        double("x"),
        double("y")
    )

    float(
        "powf",

        float("x"),
        float("y")
    )

    double("round", double("x"))
    float("roundf", float("x"))

    long("lround", double("x"))
    long("lroundf", float("x"))

    double(
        "scalbn",

        double("x"),
        int("n")
    )

    float(
        "scalbnf",

        float("x"),
        int("n")
    )

    double("sin", double("x"))
    float("sinf", float("x"))

    double("sqrt", double("x"))
    float("sqrtf", float("x"))

    double("tan", double("x"))
    float("tanf", float("x"))

    macro(expression = "((((int)A) & 0xFF) << 0) | ((((int)B) & 0xFF) << 8) | ((((int)C) & 0xFF) << 16) | ((((int)D) & 0xFF) << 24)")..uint32_t(
        "SDL_FOURCC",

        uint8_t("A"),
        uint8_t("B"),
        uint8_t("C"),
        uint8_t("D"),

        noPrefix = true
    )
}
