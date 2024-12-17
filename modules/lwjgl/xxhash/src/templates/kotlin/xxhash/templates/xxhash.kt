/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package xxhash.templates

import org.lwjgl.generator.*
import xxhash.*

val xxhash = "XXHash".nativeClass(Module.XXHASH, prefix = "XXH", prefixMethod = "XXH") {
    nativeDirective(
        """DISABLE_WARNINGS()
#include "lwjgl_malloc.h"
#if defined(LWJGL_x86) || defined(LWJGL_x64)
    #include "xxh_x86dispatch.c"
    #include "xxh_x86dispatch.h"
#else
    #define XXH_INLINE_ALL
    #include "xxhash.h"
#endif
ENABLE_WARNINGS()""")

    EnumConstant(
        "OK".enum,
        "ERROR".enum
    )

    IntConstant(
        "VERSION_MAJOR".."0",
        "VERSION_MINOR".."8",
        "VERSION_RELEASE".."3"
    )

    IntConstant(
        "VERSION_NUMBER".."(XXH_VERSION_MAJOR *100*100 + XXH_VERSION_MINOR *100 + XXH_VERSION_RELEASE)"
    )

    IntConstant(
        "XXH3_SECRET_SIZE_MIN"..136,
        "XXH3_INTERNALBUFFER_SIZE".."256",
        "XXH3_SECRET_DEFAULT_SIZE".."192",
        "XXH3_MIDSIZE_MAX".."240"
    ).noPrefix()

    // 32-bits hash

    val XXH32 = XXH32_hash_t(
        "32",

        nullable..void.const.p("input"),
        AutoSize("input")..size_t("length"),
        XXH32_hash_t("seed")
    )

    XXH32_state_t.p(
        "32_createState",
        void()
    )

    XXH_errorcode(
        "32_freeState",

        XXH32_state_t.p("statePtr")
    )

    void(
        "32_copyState",

        XXH32_state_t.p("dst_state"),
        XXH32_state_t.const.p("src_state")
    )

    XXH_errorcode(
        "32_reset",

        XXH32_state_t.p("statePtr"),
        XXH32_hash_t("seed")
    )

    XXH_errorcode(
        "32_update",

        XXH32_state_t.p("statePtr"),
        XXH32["input"],
        XXH32["length"]
    )

    XXH32_hash_t(
        "32_digest",

        XXH32_state_t.const.p("statePtr")
    )

    void(
        "32_canonicalFromHash",

        XXH32_canonical_t.p("dst"),
        XXH32_hash_t("hash")
    )

    XXH32_hash_t(
        "32_hashFromCanonical",

        XXH32_canonical_t.const.p("src")
    )

    // 64-bits hash

    XXH64_hash_t(
        "64",

        XXH32["input"],
        XXH32["length"],
        XXH64_hash_t("seed")
    )

    XXH64_state_t.p(
        "64_createState",
        void()
    )

    XXH_errorcode(
        "64_freeState",

        XXH64_state_t.p("statePtr")
    )

    void(
        "64_copyState",

        XXH64_state_t.p("dst_state"),
        XXH64_state_t.const.p("src_state")
    )

    XXH_errorcode(
        "64_reset",

        XXH64_state_t.p("statePtr"),
        XXH64_hash_t("seed")
    )

    XXH_errorcode(
        "64_update",

        XXH64_state_t.p("statePtr"),
        XXH32["input"],
        XXH32["length"]
    )

    XXH64_hash_t(
        "64_digest",

        XXH64_state_t.const.p("statePtr")
    )

    void(
        "64_canonicalFromHash",

        XXH64_canonical_t.p("dst"),
        XXH64_hash_t("hash")
    )

    XXH64_hash_t(
        "64_hashFromCanonical",

        XXH64_canonical_t.const.p("src")
    )

    XXH64_hash_t(
        "3_64bits",

        void.const.p("data"),
        AutoSize("data")..size_t("len")
    )

    XXH64_hash_t(
        "3_64bits_withSeed",

        void.const.p("data"),
        AutoSize("data")..size_t("len"),
        XXH64_hash_t("seed")
    )

    XXH64_hash_t(
        "3_64bits_withSecret",

        void.const.p("data"),
        AutoSize("data")..size_t("len"),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret"),
        AutoSize("secret")..size_t("secretSize")
    )

    XXH3_state_t.p(
        "3_createState",

        void()
    )

    XXH_errorcode(
        "3_freeState",

        XXH3_state_t.p("statePtr")
    )

    void(
        "3_copyState",

        XXH3_state_t.p("dst_state"),
        XXH3_state_t.const.p("srct_state")
    )

    XXH_errorcode(
        "3_64bits_reset",

        XXH3_state_t.p("statePtr")
    )

    XXH_errorcode(
        "3_64bits_reset_withSeed",

        XXH3_state_t.p("statePtr"),
        XXH64_hash_t("seed")
    )

    XXH_errorcode(
        "3_64bits_reset_withSecret",

        XXH3_state_t.p("statePtr"),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret"),
        AutoSize("secret")..size_t("secretSize")
    )

    XXH_errorcode(
        "3_64bits_update",

        XXH3_state_t.p("statePtr"),
        nullable..void.const.p("input"),
        AutoSize("input")..size_t("length")
    )

    XXH64_hash_t(
        "3_64bits_digest",

        XXH3_state_t.const.p("statePtr")
    )

    XXH128_hash_t(
        "3_128bits",

        void.const.p("data"),
        AutoSize("data")..size_t("len")
    )

    XXH128_hash_t(
        "3_128bits_withSeed",

        void.const.p("data"),
        AutoSize("data")..size_t("len"),
        XXH64_hash_t("seed")
    )

    XXH128_hash_t(
        "3_128bits_withSecret",

        void.const.p("data"),
        AutoSize("data")..size_t("len"),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret"),
        AutoSize("secret")..size_t("secretSize")
    )

    XXH_errorcode(
        "3_128bits_reset",

        XXH3_state_t.p("statePtr")
    )

    XXH_errorcode(
        "3_128bits_reset_withSeed",

        XXH3_state_t.p("statePtr"),
        XXH64_hash_t("seed")
    )

    XXH_errorcode(
        "3_128bits_reset_withSecret",

        XXH3_state_t.p("statePtr"),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret"),
        AutoSize("secret")..size_t("secretSize")
    )

    XXH_errorcode(
        "3_128bits_update",

        XXH3_state_t.p("statePtr"),
        nullable..void.const.p("input"),
        AutoSize("input")..size_t("length")
    )

    XXH128_hash_t(
        "3_128bits_digest",

        XXH3_state_t.const.p("statePtr")
    )

    intb(
        "128_isEqual",

        XXH128_hash_t("h1"),
        XXH128_hash_t("h2")
    )

    int(
        "128_cmp",

        Check("XXH128Hash.SIZEOF")..void.const.p("h128_1"),
        Check("XXH128Hash.SIZEOF")..void.const.p("h128_2")
    )

    void(
        "128_canonicalFromHash",

        XXH128_canonical_t.p("dst"),
        XXH128_hash_t("hash")
    )

    XXH128_hash_t(
        "128_hashFromCanonical",

        XXH128_canonical_t.const.p("src")
    )

    void(
        "3_INITSTATE",

        XXH3_state_t.p("statePtr")
    )

    XXH128_hash_t(
        "128",

        void.const.p("data"),
        AutoSize("data")..size_t("len"),
        XXH64_hash_t("seed")
    )

    XXH_errorcode(
        "3_generateSecret",

        Check("XXH3_SECRET_SIZE_MIN")..void.p("secretBuffer"),
        AutoSize("secretBuffer")..size_t("secretSize"),
        nullable..void.const.p("customSeed"),
        AutoSize("customSeed")..size_t("customSeedSize")
    )

    void(
        "3_generateSecret_fromSeed",

        Check("XXH3_SECRET_DEFAULT_SIZE")..void.p("secretBuffer"),
        XXH64_hash_t("seed")
    )

    XXH64_hash_t(
        "3_64bits_withSecretandSeed",

        nullable..void.const.p("data"),
        AutoSize("data")..size_t("len"),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret"),
        AutoSize("secret")..size_t("secretSize"),
        XXH64_hash_t("seed")
    )

    XXH128_hash_t(
        "3_128bits_withSecretandSeed",

        nullable..void.const.p("input"),
        AutoSize("input")..size_t("length"),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret"),
        AutoSize("secret")..size_t("secretSize"),
        XXH64_hash_t("seed")
    )

    XXH_errorcode(
        "3_64bits_reset_withSecretandSeed",

        XXH3_state_t.p("statePtr"),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret"),
        AutoSize("secret")..size_t("secretSize"),
        XXH64_hash_t("seed64")
    )

    XXH_errorcode(
        "3_128bits_reset_withSecretandSeed",

        XXH3_state_t.p("statePtr"),
        Check("XXH3_SECRET_SIZE_MIN")..void.const.p("secret"),
        AutoSize("secret")..size_t("secretSize"),
        XXH64_hash_t("seed64")
    )
}