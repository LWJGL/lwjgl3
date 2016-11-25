/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.assimp.templates

import org.lwjgl.generator.*
import org.lwjgl.assimp.*

val AssimpExporter = "AssimpExporter".nativeClass(packageName = ASSIMP_PACKAGE, prefixMethod = "ai", binding = ASSIMP_BINDING) {
    documentation = "Defines the C-API to the Open Asset Export Library."

    size_t(
        "GetExportFormatCount",
        """
        Returns the number of export file formats available in the current Assimp build.
        Use aiGetExportFormatDescription() to retrieve infos of a specific export format.
        """
    )

    aiExportFormatDesc_p(
        "GetExportFormatDescription",
        """
        Returns a description of the nth export file format. Use #aiGetExportFormatCount()
        to learn how many export formats are supported. The description must be released by
        calling aiReleaseExportFormatDescription afterwards.
        """,

        size_t.IN("pIndex", "Index of the export format to retrieve information for. Valid range is 0 to #aiGetExportFormatCount()"),

        returnDoc = "A description of that specific export format. NULL if pIndex is out of range."
    )

    void(
        "ReleaseExportFormatDescription",
        "Release a description of the nth export file format. Must be returned by aiGetExportFormatDescription",

        const..aiExportFormatDesc_p.IN("desc", "Pointer to the description")
    )

    void(
        "CopyScene",
        """
        Create a modifiable copy of a scene.

        This is useful to import files via Assimp, change their topology and
        export them again. Since the scene returned by the various importer functions
        is const, a modifiable copy is needed.
        """,

        const..aiScene_p.IN("pIn", "Valid scene to be copied"),
        aiScene_pp.OUT("pOut", "Receives a modifyable copy of the scene. Use aiFreeScene() to delete it again.")
    )

    void(
        "FreeScene",
        "Frees a scene copy created using aiCopyScene()",

        const..aiScene_p.IN("pIn", "Scene to be freed")
    )

    aiReturn(
        "ExportScene",
        """
        Exports the given scene to a chosen file format and writes the result file(s) to disk.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Use aiCopyScene() to get a modifiable copy of a previously imported scene
        </div>
        """,

        const..aiScene_p.IN(
            "pScene",
            """
            The scene to export. Stays in possession of the caller, is not changed by the function. The scene is expected
            to conform to Assimp's Importer output format as specified in the Data Structures Page. In short, this means
            the model data should use a right-handed coordinate systems, face winding should be counter-clockwise and the
            UV coordinate origin is assumed to be in the upper left. If your input data uses different conventions, have
            a look at the last parameter.
            """
        ),

        const..charUTF8_p.IN(
            "pFormatId",
            """
            ID string to specify to which format you want to export to. Use
            aiGetExportFormatCount() / aiGetExportFormatDescription() to learn which export formats are available.
            """
        ),

        const..charUTF8_p.IN("pFileName", "Output file to write"),

        unsigned_int.IN(
            "pPreProcessing",
            """
            Accepts any choice of the #aiPostProcessSteps enumerated flags, but in reality only a subset of them makes
            sense here. Specifying 'preprocessing' flags is useful if the input scene does not conform to Assimp's default
            conventions as specified in the Data Structures Page. In short, this means the geometry data should use a
            right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate origin is
            assumed to be in the upper left. The #AI_PROCESS_MAKE_LEFT_HANDED, #AI_PROCESS_FLIP_UVS and
            #AI_PROCESS_FLIP_WINDING_ORDER flags are used in the import side to allow users to have those defaults
            automatically adapted to their conventions. Specifying those flags for exporting has the opposite effect,
            respectively. Some other of the #aiPostProcessSteps enumerated values may be useful as well, but you'll need
            to try out what their effect on the exported file is. Many formats impose their own restrictions on the
            structure of the geometry stored therein, so some preprocessing may have little or no effect at all, or may be
            redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can enforce it by
            specifying the #AI_PROCESS_TRIANGULATE flag, most export formats support only triangulate data so they would
            run the step anyway.

            If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied
            using aiCopyScene and potetially modified afterwards), any postprocessing steps already applied to the scene
            will not be applied again, unless they show non-idempotent behaviour (#AI_PROCESS_MAKE_LEFT_HANDED,
            #AI_PROCESS_FLIP_UVS and #AI_PROCESS_FLIP_WINDING_ORDER).
            """
        ),

        returnDoc = "a status code indicating the result of the export"
    )

    aiReturn(
        "ExportSceneEx",
        """
        Exports the given scene to a chosen file format using custom IO logic supplied by you.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Include <aiFileIO.h> for the definition of #aiFileIO.
        Use aiCopyScene() to get a modifiable copy of a previously imported scene
        </div>
        """,

        const..aiScene_p.IN("pScene", "The scene to export. Stays in possession of the caller, is not changed by the function."),

        const..charUTF8_p.IN(
            "pFormatId",
            """
            ID string to specify to which format you want to export to. Use
            aiGetExportFormatCount() / aiGetExportFormatDescription() to learn which export formats are available.
            """
        ),

        const..charUTF8_p.IN("pFileName", "Output file to write"),

        const..aiFileIO_p.IN(
            "pIO",
            """
            custom IO implementation to be used. Use this if you use your own storage methods.
            If none is supplied, a default implementation using standard file IO is used. Note that
            #aiExportSceneToBlob is provided as convenience function to export to memory buffers.
            """
        ),

        unsigned_int.IN(
            "pPreProcessing",
            """
            Accepts any choice of the #aiPostProcessSteps enumerated flags, but in reality only a subset of them makes
            sense here. Specifying 'preprocessing' flags is useful if the input scene does not conform to Assimp's default
            conventions as specified in the Data Structures Page. In short, this means the geometry data should use a
            right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate origin is
            assumed to be in the upper left. The #AI_PROCESS_MAKE_LEFT_HANDED, #AI_PROCESS_FLIP_UVS and
            #AI_PROCESS_FLIP_WINDING_ORDER flags are used in the import side to allow users to have those defaults
            automatically adapted to their conventions. Specifying those flags for exporting has the opposite effect,
            respectively. Some other of the #aiPostProcessSteps enumerated values may be useful as well, but you'll need
            to try out what their effect on the exported file is. Many formats impose their own restrictions on the
            structure of the geometry stored therein, so some preprocessing may have little or no effect at all, or may be
            redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can enforce it by
            specifying the #AI_PROCESS_TRIANGULATE flag, most export formats support only triangulate data so they would
            run the step anyway.

            If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied
            using aiCopyScene and potetially modified afterwards), any postprocessing steps already applied to the scene
            will not be applied again, unless they show non-idempotent behaviour (#AI_PROCESS_MAKE_LEFT_HANDED,
            #AI_PROCESS_FLIP_UVS and #AI_PROCESS_FLIP_WINDING_ORDER).
            """
        ),

        returnDoc = "a status code indicating the result of the export"
    )

    aiExportDataBlob_p(
        "ExportSceneToBlob",
        """
        Exports the given scene to a chosen file format. Returns the exported data as a binary blob which
        you can write into a file or something. When you're done with the data, use #aiReleaseExportBlob()
        to free the resources associated with the export.
        """,

        const..aiScene_p.IN("pScene", "The scene to export. Stays in possession of the caller, is not changed by the function."),
        const..charUTF8_p.IN(
            "pFormatId",
            """
            ID string to specify to which format you want to export to. Use
            aiGetExportFormatCount() / aiGetExportFormatDescription() to learn which export formats are available.
            """
        ),
        unsigned_int.IN(
            "pPreProcessing",
            """
            Accepts any choice of the #aiPostProcessSteps enumerated flags, but in reality only a subset of them makes
            sense here. Specifying 'preprocessing' flags is useful if the input scene does not conform to Assimp's default
            conventions as specified in the Data Structures Page. In short, this means the geometry data should use a
            right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate origin is
            assumed to be in the upper left. The #AI_PROCESS_MAKE_LEFT_HANDED, #AI_PROCESS_FLIP_UVS and
            #AI_PROCESS_FLIP_WINDING_ORDER flags are used in the import side to allow users to have those defaults
            automatically adapted to their conventions. Specifying those flags for exporting has the opposite effect,
            respectively. Some other of the #aiPostProcessSteps enumerated values may be useful as well, but you'll need
            to try out what their effect on the exported file is. Many formats impose their own restrictions on the
            structure of the geometry stored therein, so some preprocessing may have little or no effect at all, or may be
            redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can enforce it by
            specifying the #AI_PROCESS_TRIANGULATE flag, most export formats support only triangulate data so they would
            run the step anyway.

            If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied
            using aiCopyScene and potetially modified afterwards), any postprocessing steps already applied to the scene
            will not be applied again, unless they show non-idempotent behaviour (#AI_PROCESS_MAKE_LEFT_HANDED,
            #AI_PROCESS_FLIP_UVS and #AI_PROCESS_FLIP_WINDING_ORDER).
            """
        ),

        returnDoc = "the exported data or NULL in case of error"
    )

    void(
        "ReleaseExportBlob",
        "Releases the memory associated with the given exported data. Use this function to free a data blob returned by aiExportScene().",

        const..aiExportDataBlob_p.IN("pData", "the data blob returned by #aiExportSceneToBlob")
    )
}
