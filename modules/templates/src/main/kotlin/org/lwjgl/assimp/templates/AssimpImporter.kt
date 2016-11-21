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

    aiScene_p(
        "ImportFile",
        """
        Reads the given file and returns its content.

        If the call succeeds, the imported data is returned in an aiScene structure. The data is intended to be read-only,
        it stays property of the ASSIMP library and will be stable until aiReleaseImport() is called. After you're done
        with it, call aiReleaseImport() to free the resources associated with this file. If the import fails, NULL is
        returned instead. Call #aiGetErrorString to retrieve a human-readable error text.
        """,

        const..charUTF8_p.IN("pFile", "Path and filename of the file to be imported"),
        unsigned_int.IN("pFlags", "Optional post processing steps to be executed after a successful import."),

        returnDoc = "Pointer to the imported data or NULL if the import failed."
    )

    aiScene_p(
        "ImportFileEx",
        """
        Reads the given file using user-defined I/O functions and returns its content.

        If the call succeeds, the imported data is returned in an aiScene structure. The data is intended to be read-only,
        it stays property of the ASSIMP library and will be stable until aiReleaseImport() is called. After you're done
        with it, call aiReleaseImport() to free the resources associated with this file. If the import fails, NULL is
        returned instead. Call #aiGetErrorString to retrieve a human-readable error text.
        """,

        const..charUTF8_p.IN("pFile", "Path and filename of the file to be imported"),
        unsigned_int.IN("pFlags", "Optional post processing steps to be executed after a successful import."),
        aiFileIO_p.IN(
            "pFS",
            """
            aiFileIO structure. Will be used to open the model file itself and any other files the loader needs to open.
            Pass NULL to use the default implementation.
            """
        ),

        returnDoc = "Pointer to the imported data or NULL if the import failed."
    )

    aiScene_p(
        "ImportFileExWithProperties",
        "Same as #aiImportFileEx, but adds an extra parameter containing importer settings.",

        const..charUTF8_p.IN("pFile", "Path and filename of the file to be imported"),
        unsigned_int.IN("pFlags", "Optional post processing steps to be executed after a successful import."),
        aiFileIO_p.IN(
            "pFS",
            """
            aiFileIO structure. Will be used to open the model file itself and any other files the loader needs to open.
            Pass NULL to use the default implementation.
            """
        ),
        const..aiPropertyStore_p.IN("pProps", "#aiPropertyStore instance containing import settings."),

        returnDoc = "Pointer to the imported data or NULL if the import failed."
    )

    aiScene_p(
        "ImportFileFromMemory",
        """
        Reads the given file from a given memory buffer.

        If the call succeeds, the contents of the file are returned as a pointer to an aiScene object. The returned data
        is intended to be read-only, the importer keeps ownership of the data and will destroy it upon destruction. If
        the import fails, NULL is returned. A human-readable error description can be retrieved by calling aiGetErrorString().

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This is a straightforward way to decode models from memory buffers, but it doesn't handle model formats that
        spread their data across multiple files or even directories. Examples include OBJ or MD3, which outsource parts
        of their material info into external scripts. If you need full functionality, provide a custom IOSystem to make
        Assimp find these files and use the regular aiImportFileEx()/aiImportFileExWithProperties() API.
        </div>
        """,

        const..char_p.IN("pBuffer", "Pointer to the file data"),
        AutoSize("pBuffer")..unsigned_int.IN("pLength", "Length of pBuffer, in bytes"),

        unsigned_int.IN(
            "pFlags",
            """
            Optional post processing steps to be executed after a successful import. Provide a bitwise combination of the
            #aiPostProcessSteps flags. If you wish to inspect the imported scene first in order to fine-tune your
            post-processing setup, consider to use #aiApplyPostProcessing().
            """
        ),

        nullable..const..charUTF8_p.IN(
            "pHint",
            """
            An additional hint to the library. If this is a non empty string, the library looks for a loader to support
            the file extension specified by pHint and passes the file to the first matching loader. If this loader is
            unable to completely the request, the library continues and tries to determine the file format on its own, a
            task that may or may not be successful. Check the return value, and you'll know ...
            """
        ),

        returnDoc = "A pointer to the imported data, NULL if the import failed."
    )

    aiScene_p(
        "ImportFileFromMemoryWithProperties",
        "Same as #aiImportFileFromMemory, but adds an extra parameter containing importer settings.",

        const..char_p.IN("pBuffer", "Pointer to the file data"),
        AutoSize("pBuffer")..unsigned_int.IN("pLength", "Length of pBuffer, in bytes"),

        unsigned_int.IN(
            "pFlags",
            """
            Optional post processing steps to be executed after a successful import. Provide a bitwise combination of the
            #aiPostProcessSteps flags. If you wish to inspect the imported scene first in order to fine-tune your
            post-processing setup, consider to use #aiApplyPostProcessing().
            """
        ),

        nullable..const..charUTF8_p.IN(
            "pHint",
            """
            An additional hint to the library. If this is a non empty string, the library looks for a loader to support
            the file extension specified by pHint and passes the file to the first matching loader. If this loader is
            unable to completely the request, the library continues and tries to determine the file format on its own, a
            task that may or may not be successful. Check the return value, and you'll know ...
            """
        ),
        const..aiPropertyStore_p.IN("pProps", "#aiPropertyStore instance containing import settings."),

        returnDoc = "A pointer to the imported data, NULL if the import failed."
    )

    aiScene_p(
        "ApplyPostProcessing",
        """
        Apply post-processing to an already-imported scene.

        This is strictly equivalent to calling #aiImportFile()/#aiImportFileEx with the same flags. However, you can use
        this separate function to inspect the imported scene first to fine-tune your post-processing setup.
        """,

        const..aiScene_p.IN("pScene", "Scene to work on."),
        unsigned_int.IN("pFlags", "Provide a bitwise combination of the #aiPostProcessSteps flags."),

        returnDoc = """
            A pointer to the post-processed data. Post processing is done in-place,
            meaning this is still the same #aiScene which you passed for pScene. However,
            _if_ post-processing failed, the scene could now be NULL. That's quite a rare
            case, post processing steps are not really designed to 'fail'. To be exact,
            the #aiProcess_ValidateDataStructure flag is currently the only post processing step
            which can actually cause the scene to be reset to NULL.
            """
    )

    aiLogStream(
        "GetPredefinedLogStream",
        """
        Get one of the predefine log streams. This is the quick'n'easy solution to
        access Assimp's log system. Attaching a log stream can slightly reduce Assimp's
        overall import performance.

        Usage is rather simple (this will stream the log to a file, named log.txt, and
        the stdout stream of the process:

        ${codeBlock("""
        struct aiLogStream c;
        c = aiGetPredefinedLogStream(aiDefaultLogStream_FILE,"log.txt");
        aiAttachLogStream(&c);
        c = aiGetPredefinedLogStream(aiDefaultLogStream_STDOUT,NULL);
        aiAttachLogStream(&c);
        """)}
        """,

        aiDefaultLogStream.IN("pStreams", "One of the #aiDefaultLogStream enumerated values."),
        nullable..const..charUTF8_p.IN(
            "file",
            "Solely for the #aiDefaultLogStream_FILE flag: specifies the file to write to. Pass NULL for all other flags."
        ),

        returnDoc = "The log stream. callback is set to NULL if something went wrong."
    )

    void(
        "AttachLogStream",
        """
        Attach a custom log stream to the libraries' logging system.

        Attaching a log stream can slightly reduce Assimp's overall import performance. Multiple log-streams can be
        attached.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        To ensure proper destruction of the logging system, you need to manually call aiDetachLogStream() on every single
        log stream you attach. Alternatively (for the lazy folks) #aiDetachAllLogStreams is provided.
        </div>
        """,

        const..aiLogStream_p.IN("stream", "Describes the new log stream.")
    )

    void(
        "EnableVerboseLogging",
        """
        Enable verbose logging. Verbose logging includes debug-related stuff and
        detailed import statistics. This can have severe impact on import performance and memory consumption. However,
        it might be useful to find out why a file didn't read correctly.
        """,

        aiBool.IN("d", "true or false, your decision")
    )

    aiReturn(
        "DetachLogStream",
        """
        Detach a custom log stream from the libraries' logging system.

        This is the counterpart of #aiAttachLogStream. If you attached a stream, don't forget to detach it again.
        """,

        aiLogStream_p.IN("stream", "The log stream to be detached."),

        returnDoc = "AI_SUCCESS if the log stream has been detached successfully."
    )

    void(
        "DetachAllLogStreams",
        """
        Detach all active log streams from the libraries' logging system. This ensures that the logging system is
        terminated properly and all resources allocated by it are actually freed. If you attached a stream, don't forget
        to detach it again.
        """
    )

    void(
        "ReleaseImport",
        """
        Releases all resources associated with the given import process.

        Call this function after you're done with the imported data.
        """,

        nullable..const..aiScene_p.IN("pScene", "The imported data to release. NULL is a valid value.")
    )

    charUTF8_p(
        "GetErrorString",
        "Returns the error text of the last failed import process.",

        returnDoc = """
        A textual description of the error that occurred at the last import process. NULL if there was no error. There
        can't be an error if you got a non-NULL #aiScene from #aiImportFile/#aiImportFileEx/#aiApplyPostProcessing.
        """
    )

    aiBool(
        "IsExtensionSupported",
        "Returns whether a given file extension is supported by ASSIMP",

        const..charUTF8_p.IN(
            "szExtension",
            "Extension for which the function queries support for. Must include a leading dot '.'. Example: \".3ds\", \".md3\""
        ),

        returnDoc = "true if the file extension is supported."
    )

    void(
        "GetExtensionList",
        """
        Get a list of all file extensions supported by ASSIMP.

        If a file extension is contained in the list this does, of course, not mean that ASSIMP is able to load all files
        with this extension.
        """,

        aiString_p.OUT(
            "szOut",
            "String to receive the extension list. Format of the list: \"*.3ds;*.obj;*.dae\". NULL is not a valid parameter."
        )
    )

    void(
        "GetMemoryRequirements",
        "Get the approximated storage required by an imported asset",

        const..aiScene_p.IN("pIn", "Input asset."),
        aiMemoryInfo_p.IN("in", "Data structure to be filled.")
    )

    aiPropertyStore_p(
        "CreatePropertyStore",
        "Create an empty property store. Property stores are used to collect import settings.",

        returnDoc = "New property store. Property stores need to be manually destroyed using the #aiReleasePropertyStore API function."
    )

    void(
        "ReleasePropertyStore",
        "Delete a property store.",

        aiPropertyStore_p.IN("p", "Property store to be deleted.")
    )

    void(
        "SetImportPropertyInteger",
        """
        Set an integer property.

        This is the C-version of #Assimp::Importer::SetPropertyInteger(). In the C interface, properties are always
        shared by all imports. It is not possible to specify them per import.
        """,

        aiPropertyStore_p.IN("store", "Store to modify. Use #aiCreatePropertyStore to obtain a store."),
        const..charASCII_p.IN(
            "szName",
            """
            Name of the configuration property to be set. All supported public properties are defined in the config.h
            header file (AI_CONFIG_XXX).
            """
        ),
        int.IN("value", "New value for the property")
    )

    void(
        "SetImportPropertyFloat",
        """
        Set an floating-point property.

        This is the C-version of #Assimp::Importer::SetPropertyFloat(). In the C interface, properties are always
        shared by all imports. It is not possible to specify them per import.
        """,

        aiPropertyStore_p.IN("store", "Store to modify. Use #aiCreatePropertyStore to obtain a store."),
        const..charASCII_p.IN(
            "szName",
            """
            Name of the configuration property to be set. All supported public properties are defined in the config.h
            header file (AI_CONFIG_XXX).
            """
        ),
        float.IN("value", "New value for the property")
    )

    void(
        "SetImportPropertyString",
        """
        Set a string property.

        This is the C-version of #Assimp::Importer::SetPropertyString(). In the C interface, properties are always
        shared by all imports. It is not possible to specify them per import.
        """,

        aiPropertyStore_p.IN("store", "Store to modify. Use #aiCreatePropertyStore to obtain a store."),
        const..charASCII_p.IN(
            "szName",
            """
            Name of the configuration property to be set. All supported public properties are defined in the config.h
            header file (AI_CONFIG_XXX).
            """
        ),
        const..aiString_p.IN("value", "New value for the property")
    )

    void(
        "SetImportPropertyMatrix",
        """
        Set a matrix property.

        This is the C-version of #Assimp::Importer::SetPropertyMatrix(). In the C interface, properties are always
        shared by all imports. It is not possible to specify them per import.
        """,

        aiPropertyStore_p.IN("store", "Store to modify. Use #aiCreatePropertyStore to obtain a store."),
        const..charASCII_p.IN(
            "szName",
            """
            Name of the configuration property to be set. All supported public properties are defined in the config.h
            header file (AI_CONFIG_XXX).
            """
        ),
        const..aiMatrix4x4_p.IN("value", "New value for the property")
    )

    void(
        "CreateQuaternionFromMatrix",
        "Construct a quaternion from a 3x3 rotation matrix.",

        aiQuaternion_p.OUT("quat", "Receives the output quaternion."),
        const..aiMatrix3x3_p.IN("mat", "Matrix to 'quaternionize'.")
    )

    void(
        "DecomposeMatrix",
        "Decompose a transformation matrix into its rotational, translational and scaling components.",

        const..aiMatrix4x4_p.IN("mat", "Matrix to decompose"),
        aiVector3D_p.OUT("scaling", "Receives the scaling component"),
        aiQuaternion_p.OUT("rotation", "Receives the rotational component"),
        aiVector3D_p.OUT("position", "Receives the translational component.")
    )

    void(
        "TransposeMatrix4",
        "Transpose a 4x4 matrix.",

        aiMatrix4x4_p.INOUT("mat", "Pointer to the matrix to be transposed")
    )

    void(
        "TransposeMatrix3",
        "Transpose a 3x3 matrix.",

        aiMatrix3x3_p.INOUT("mat", "Pointer to the matrix to be transposed")
    )

    void(
        "TransformVecByMatrix3",
        "Transform a vector by a 3x3 matrix",

        aiVector3D_p.INOUT("vec", "Vector to be transformed."),
        const..aiMatrix3x3_p.IN("mat", "Matrix to transform the vector with.")
    )

    void(
        "TransformVecByMatrix4",
        "Transform a vector by a 4x4 matrix",

        aiVector3D_p.INOUT("vec", "Vector to be transformed."),
        const..aiMatrix4x4_p.IN("mat", "Matrix to transform the vector with.")
    )

    void(
        "MultiplyMatrix4",
        "Multiply two 4x4 matrices.",

        aiMatrix4x4_p.INOUT("dst", "First factor, receives result."),
        const..aiMatrix4x4_p.IN("src", "Matrix to be multiplied with 'dst'.")
    )

    void(
        "MultiplyMatrix3",
        "Multiply two 3x3 matrices.",

        aiMatrix3x3_p.INOUT("dst", "First factor, receives result."),
        const..aiMatrix3x3_p.IN("src", "Matrix to be multiplied with 'dst'.")
    )

    void(
        "IdentityMatrix3",
        "Get a 3x3 identity matrix.",

        aiMatrix3x3_p.OUT("mat", "Matrix to receive its personal identity")
    )

    void(
        "IdentityMatrix4",
        "Get a 4x4 identity matrix.",

        aiMatrix4x4_p.OUT("mat", "Matrix to receive its personal identity")
    )

    size_t(
        "GetImportFormatCount",
        """
        Returns the number of import file formats available in the current Assimp build. Use aiGetImportFormatDescription()
        to retrieve infos of a specific import format.
        """
    )

    aiImporterDesc_p(
        "GetImportFormatDescription",
        """
        Returns a description of the nth import file format. Use #aiGetImportFormatCount()
        to learn how many import formats are supported.
        """,

        size_t.IN(
            "pIndex",
            "Index of the import format to retrieve information for. Valid range is 0 to #aiGetImportFormatCount()"
        ),

        returnDoc = "A description of that specific import format. NULL if pIndex is out of range."
    )
}
