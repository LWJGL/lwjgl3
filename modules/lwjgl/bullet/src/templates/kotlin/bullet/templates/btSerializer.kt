/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSerializer = "BTSerializer".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Chunk_new",
        "",

        void()
    )

    int(
        "Chunk_getChunkCode",
        "",

        opaque_p("obj", "")
    )

    int(
        "Chunk_getDna_nr",
        "",

        opaque_p("obj", "")
    )

    int(
        "Chunk_getLength",
        "",

        opaque_p("obj", "")
    )

    int(
        "Chunk_getNumber",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Chunk_getOldPtr",
        "",

        opaque_p("obj", "")
    )

    void(
        "Chunk_setChunkCode",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Chunk_setDna_nr",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Chunk_setLength",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Chunk_setNumber",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Chunk_setOldPtr",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Chunk_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SerializerWrapper_new",
        "",

        opaque_p("allocateCallback", ""),
        opaque_p("finalizeChunkCallback", ""),
        opaque_p("findNameForPointerCallback", ""),
        opaque_p("findPointerCallback", ""),
        opaque_p("finishSerializationCallback", ""),
        opaque_p("getBufferPointerCallback", ""),
        opaque_p("getChunkCallback", ""),
        opaque_p("getCurrentBufferSizeCallback", ""),
        opaque_p("getNumChunksCallback", ""),
        opaque_p("getSerializationFlagsCallback", ""),
        opaque_p("getUniquePointerCallback", ""),
        opaque_p("registerNameForPointerCallback", ""),
        opaque_p("serializeNameCallback", ""),
        opaque_p("setSerializationFlagsCallback", ""),
        opaque_p("startSerializationCallback", "")
    )

    void(
        "Serializer_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DefaultSerializer_new",
        "",

        void()
    )

    opaque_p(
        "DefaultSerializer_new2",
        "",

        int("totalSize", "")
    )

    unsigned_char.p(
        "DefaultSerializer_internalAlloc",
        "",

        opaque_p("obj", ""),
        AutoSizeResult..size_t("size", "")
    )

    void(
        "DefaultSerializer_writeHeader",
        "",

        opaque_p("obj", ""),
        Check(12)..unsigned_char.p("buffer", "")
    )

    //char.p(
    opaque_p(
        "getBulletDNAstr",
        "",

        void()
    )

    int(
        "getBulletDNAlen",
        "",

        void()
    )

    //char.p(
    opaque_p(
        "getBulletDNAstr64",
        "",

        void()
    )

    int(
        "getBulletDNAlen64",
        "",

        void()
    )

}