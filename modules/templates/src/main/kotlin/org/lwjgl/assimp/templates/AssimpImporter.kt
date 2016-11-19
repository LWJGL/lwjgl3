/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.assimp.templates

import org.lwjgl.generator.*
import org.lwjgl.assimp.*

val AssimpImporter = "AssimpImporter".nativeClass(packageName = ASSIMP_PACKAGE, prefixMethod = "ai", binding = ASSIMP_BINDING) {
    documentation = "Defines the C-API to the Open Asset Import Library."

    EnumConstant(
        "Mixed set of flags for #AIImporterDesc, indicating some features common to many importers",

        "AI_IMPORTERFLAGS_SUPPORT_TEXT_FLAVOUR".enum(
            "Indicates that there is a textual encoding of the file format; and that it is supported.",
            0x1
        ),

        "AI_IMPORTERFLAGS_SUPPORT_BINARY_FLAVOUR".enum(
            "Indicates that there is a binary encoding of the file format; and that it is supported.",
            0x2
        ),

        "AI_IMPORTERFLAGS_SUPPORT_COMPRESSED_FLAVOUR".enum(
            "Indicates that there is a compressed encoding of the file format; and that it is supported.",
            0x4
        ),

        "AI_IMPORTERFLAGS_LIMITED_SUPPORT".enum(
            """
            Indicates that the importer reads only a very particular subset of the file format. This happens commonly for
            declarative or procedural formats which cannot easily be mapped to #AIScene
            """,
            0x8
        ),

        "AI_IMPORTERFLAGS_EXPERIMENTAL".enum(
            """
            Indicates that the importer is highly experimental and should be used with care. This only happens for trunk
            (i.e. SVN) versions, experimental code is not included in releases.
            """,
            0x10
        )
    )

    aiImporterDesc_p(
        "GetImporterDesc",
        "Returns the Importer description for a given extension. Will return a NULL-pointer if no assigned importer desc. was found for the given extension",

        const..charASCII_p.IN("extension", "The extension to look for"),

        returnDoc = "A pointer showing to the ImporterDesc, #AIImporterDesc."
    )
}
