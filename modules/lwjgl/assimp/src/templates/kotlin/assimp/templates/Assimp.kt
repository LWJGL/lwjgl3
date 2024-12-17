/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package assimp.templates

import assimp.*
import org.lwjgl.generator.*

val Assimp = "Assimp".nativeClass(Module.ASSIMP, prefix = "ai", prefixConstant = "ai", binding = ASSIMP_BINDING) {
    // config.h

    // ###########################################################################
    // LIBRARY SETTINGS
    // General, global settings
    // ###########################################################################

    StringConstant(
        "AI_CONFIG_GLOB_MEASURE_TIME".."GLOB_MEASURE_TIME",
        "AI_CONFIG_IMPORT_NO_SKELETON_MESHES".."IMPORT_NO_SKELETON_MESHES"
    ).noPrefix()

    // ###########################################################################
    // POST PROCESSING SETTINGS
    // Various stuff to fine-tune the behavior of a specific post processing step.
    // ###########################################################################

    StringConstant(
        "AI_CONFIG_PP_SBBC_MAX_BONES".."PP_SBBC_MAX_BONES",
        "AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE".."PP_CT_MAX_SMOOTHING_ANGLE",
        "AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX".."PP_CT_TEXTURE_CHANNEL_INDEX",
        "AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE".."PP_GSN_MAX_SMOOTHING_ANGLE",
        "AI_CONFIG_IMPORT_MDL_COLORMAP".."IMPORT_MDL_COLORMAP",
        "AI_CONFIG_PP_RRM_EXCLUDE_LIST".."PP_RRM_EXCLUDE_LIST",
        "AI_CONFIG_PP_PTV_KEEP_HIERARCHY".."PP_PTV_KEEP_HIERARCHY",
        "AI_CONFIG_PP_PTV_NORMALIZE".."PP_PTV_NORMALIZE",
        "AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION".."PP_PTV_ADD_ROOT_TRANSFORMATION",
        "AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION".."PP_PTV_ROOT_TRANSFORMATION",
        "AI_CONFIG_CHECK_IDENTITY_MATRIX_EPSILON".."CHECK_IDENTITY_MATRIX_EPSILON",
        "AI_CONFIG_PP_FD_REMOVE".."PP_FD_REMOVE",
        "AI_CONFIG_PP_FD_CHECKAREA".."PP_FD_CHECKAREA",
        "AI_CONFIG_PP_OG_EXCLUDE_LIST".."PP_OG_EXCLUDE_LIST",
        "AI_CONFIG_PP_SLM_TRIANGLE_LIMIT".."PP_SLM_TRIANGLE_LIMIT",
        "AI_CONFIG_PP_SLM_VERTEX_LIMIT".."PP_SLM_VERTEX_LIMIT",
        "AI_CONFIG_PP_LBW_MAX_WEIGHTS".."PP_LBW_MAX_WEIGHTS",
        "AI_CONFIG_PP_DB_THRESHOLD".."PP_DB_THRESHOLD",
        "AI_CONFIG_PP_DB_ALL_OR_NONE".."PP_DB_ALL_OR_NONE",
        "AI_CONFIG_PP_ICL_PTCACHE_SIZE".."PP_ICL_PTCACHE_SIZE",
        "AI_CONFIG_PP_RVC_FLAGS".."PP_RVC_FLAGS",
        "AI_CONFIG_PP_SBP_REMOVE".."PP_SBP_REMOVE",
        "AI_CONFIG_PP_FID_ANIM_ACCURACY".."PP_FID_ANIM_ACCURACY",
        "AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS".."PP_FID_IGNORE_TEXTURECOORDS",
        "AI_CONFIG_PP_TUV_EVALUATE".."PP_TUV_EVALUATE",
        "AI_CONFIG_FAVOUR_SPEED".."FAVOUR_SPEED"
    ).noPrefix()

    // ###########################################################################
    // IMPORTER SETTINGS
    // Various stuff to fine-tune the behaviour of specific importer plugins.
    // ###########################################################################

    StringConstant(
        "AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER".."IMPORT_SCHEMA_DOCUMENT_PROVIDER",
        "AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS".."IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS",
        "AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS".."IMPORT_FBX_READ_ALL_MATERIALS",
        "AI_CONFIG_IMPORT_FBX_READ_MATERIALS".."IMPORT_FBX_READ_MATERIALS",
        "AI_CONFIG_IMPORT_FBX_READ_TEXTURES".."IMPORT_FBX_READ_TEXTURES",
        "AI_CONFIG_IMPORT_FBX_READ_CAMERAS".."IMPORT_FBX_READ_CAMERAS",
        "AI_CONFIG_IMPORT_FBX_READ_LIGHTS".."IMPORT_FBX_READ_LIGHTS",
        "AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS".."IMPORT_FBX_READ_ANIMATIONS",
        "AI_CONFIG_IMPORT_FBX_READ_WEIGHTS".."IMPORT_FBX_READ_WEIGHTS",
        "AI_CONFIG_IMPORT_FBX_STRICT_MODE".."IMPORT_FBX_STRICT_MODE",
        "AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS".."IMPORT_FBX_PRESERVE_PIVOTS",
        "AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES".."IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES",
        "AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING".."AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING",
        "AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES".."AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES",
        "AI_CONFIG_FBX_CONVERT_TO_M".."AI_CONFIG_FBX_CONVERT_TO_M",
        "AI_CONFIG_IMPORT_FBX_IGNORE_UP_DIRECTION".."AI_CONFIG_IMPORT_FBX_IGNORE_UP_DIRECTION",
        "AI_CONFIG_FBX_USE_SKELETON_BONE_CONTAINER".."AI_CONFIG_FBX_USE_SKELETON_BONE_CONTAINER",
        "AI_CONFIG_IMPORT_GLOBAL_KEYFRAME".."IMPORT_GLOBAL_KEYFRAME",
        "AI_CONFIG_IMPORT_MD3_KEYFRAME".."IMPORT_MD3_KEYFRAME",
        "AI_CONFIG_IMPORT_MD2_KEYFRAME".."IMPORT_MD2_KEYFRAME",
        "AI_CONFIG_IMPORT_MDL_KEYFRAME".."IMPORT_MDL_KEYFRAME",
        "AI_CONFIG_IMPORT_MDC_KEYFRAME".."IMPORT_MDC_KEYFRAME",
        "AI_CONFIG_IMPORT_SMD_KEYFRAME".."IMPORT_SMD_KEYFRAME",
        "AI_CONFIG_IMPORT_UNREAL_KEYFRAME".."IMPORT_UNREAL_KEYFRAME",
        "AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS".."IMPORT_MDL_HL1_READ_ANIMATIONS",
        "AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS".."IMPORT_MDL_HL1_READ_ANIMATION_EVENTS",
        "AI_CONFIG_IMPORT_MDL_HL1_TRANSFORM_COORD_SYSTEM".."TRANSFORM COORDSYSTEM FOR HS! MODELS",
        "AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS".."IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS",
        "AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS".."IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS",
        "AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS".."IMPORT_MDL_HL1_READ_ATTACHMENTS",
        "AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS".."IMPORT_MDL_HL1_READ_BONE_CONTROLLERS",
        "AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES".."IMPORT_MDL_HL1_READ_HITBOXES",
        "AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO".."IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO",
        "AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST".."IMPORT_SMD_LOAD_ANIMATION_LIST",
        "AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL".."IMPORT_AC_SEPARATE_BFCULL",
        "AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION".."IMPORT_AC_EVAL_SUBDIVISION",
        "AI_CONFIG_UNREAL_HANDLE_FLAGS".."UNREAL_HANDLE_FLAGS",
        "AI_CONFIG_IMPORT_TER_MAKE_UVS".."IMPORT_TER_MAKE_UVS",
        "AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS".."IMPORT_ASE_RECONSTRUCT_NORMALS",
        "AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART".."IMPORT_MD3_HANDLE_MULTIPART",
        "AI_CONFIG_IMPORT_MD3_SKIN_NAME".."IMPORT_MD3_SKIN_NAME",
        "AI_CONFIG_IMPORT_MD3_LOAD_SHADERS".."IMPORT_MD3_LOAD_SHADERS",
        "AI_CONFIG_IMPORT_MD3_SHADER_SRC".."IMPORT_MD3_SHADER_SRC",
        "AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY".."IMPORT_LWO_ONE_LAYER_ONLY",
        "AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD".."IMPORT_MD5_NO_ANIM_AUTOLOAD",
        "AI_CONFIG_IMPORT_LWS_ANIM_START".."IMPORT_LWS_ANIM_START",
        "AI_CONFIG_IMPORT_LWS_ANIM_END".."IMPORT_LWS_ANIM_END",
        "AI_CONFIG_IMPORT_IRR_ANIM_FPS".."IMPORT_IRR_ANIM_FPS",
        "AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE".."IMPORT_OGRE_MATERIAL_FILE",
        "AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME".."IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME",
        "AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS".."IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS",
        "AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT".."AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT",
        "AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS".."IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS",
        "AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION".."IMPORT_IFC_CUSTOM_TRIANGULATION",
        "AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE".."IMPORT_IFC_SMOOTHING_ANGLE",
        "AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION".."IMPORT_IFC_CYLINDRICAL_TESSELLATION",
        "AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION".."IMPORT_COLLADA_IGNORE_UP_DIRECTION",
        "AI_CONFIG_IMPORT_COLLADA_IGNORE_UNIT_SIZE".."IMPORT_COLLADA_IGNORE_UNIT_SIZE",
        "AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES".."IMPORT_COLLADA_USE_COLLADA_NAMES"
    ).noPrefix()

    // ---------- All the Export defines ------------

    StringConstant(
        "AI_CONFIG_EXPORT_XFILE_64BIT".."EXPORT_XFILE_64BIT",
        "AI_CONFIG_EXPORT_POINT_CLOUDS".."EXPORT_POINT_CLOUDS",
        "AI_CONFIG_USE_GLTF_PBR_SPECULAR_GLOSSINESS".."USE_GLTF_PBR_SPECULAR_GLOSSINESS",
        "AI_CONFIG_EXPORT_GLTF_UNLIMITED_SKINNING_BONES_PER_VERTEX".."USE_UNLIMITED_BONES_PER VERTEX",
        "AI_CONFIG_EXPORT_FBX_TRANSPARENCY_FACTOR_REFER_TO_OPACITY".."EXPORT_FBX_TRANSPARENCY_FACTOR_REFER_TO_OPACITY VERTEX",
        "AI_CONFIG_EXPORT_BLOB_NAME".."EXPORT_BLOB_NAME",
        "AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY".."GLOBAL_SCALE_FACTOR",
        "AI_CONFIG_APP_SCALE_KEY".."APP_SCALE_FACTOR"
    ).noPrefix()

    IntConstant(
        "AI_SBBC_DEFAULT_MAX_BONES"..60,
        "AI_SLM_DEFAULT_MAX_TRIANGLES"..1000000,
        "AI_SLM_DEFAULT_MAX_VERTICES"..1000000,
        "AI_LBW_MAX_WEIGHTS"..0x4,
        "PP_ICL_PTCACHE_SIZE"..12,
        "AI_IMPORT_IFC_DEFAULT_CYLINDRICAL_TESSELLATION"..32
    ).noPrefix()

    FloatConstant(
        "AI_DEBONE_THRESHOLD"..1.0f,
        "AI_IMPORT_IFC_DEFAULT_SMOOTHING_ANGLE"..10.0f,
        "AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT"..1.0f,
        "AI_CONFIG_APP_SCALE_DEFAULT"..1.0f
    ).noPrefix()

    IntConstant(
        "AI_UVTRAFO_SCALING"..0x1,
        "AI_UVTRAFO_ROTATION"..0x2,
        "AI_UVTRAFO_TRANSLATION"..0x4,
        "AI_UVTRAFO_ALL".."(AI_UVTRAFO_SCALING | AI_UVTRAFO_ROTATION | AI_UVTRAFO_TRANSLATION)"
    ).noPrefix()

    EnumConstant(
        "Component_NORMALS".enum(0x2),
        "Component_TANGENTS_AND_BITANGENTS".enum(0x4),
        "Component_COLORS".enum(0x8),
        "Component_TEXCOORDS".enum(0x10),
        "Component_BONEWEIGHTS".enum(0x20),
        "Component_ANIMATIONS".enum(0x40),
        "Component_TEXTURES".enum(0x80),
        "Component_LIGHTS".enum(0x100),
        "Component_CAMERAS".enum(0x200),
        "Component_MESHES".enum(0x400),
        "Component_MATERIALS".enum(0x800)
    )

    macro(expression = "1 << (n + 20)")..int(
        "Component_COLORSn",

        int("n")
    )

    macro(expression = "1 << (n + 25)")..int(
        "Component_TEXCOORDSn",

        int("n")
    )

    // defs.h

    DoubleConstant(
        "AI_MATH_PI"..3.141592653589793238462643383279,
        "AI_MATH_TWO_PI".."AI_MATH_PI * 2.0",
        "AI_MATH_HALF_PI".."AI_MATH_PI * 0.5"
    ).noPrefix()

    FloatConstant(
        "AI_MATH_PI_F"..3.1415926538f,
        "AI_MATH_TWO_PI_F".."AI_MATH_PI_F * 2f",
        "AI_MATH_HALF_PI_F".."AI_MATH_PI_F * 0f"
    ).noPrefix()

    FloatConstant(
        "ai_epsilon".."0.00001f"
    ).noPrefix()

    macro(expression = "(x)*0.0174532925f")..float(
        "AI_DEG_TO_RAD",

        float("x"),
        noPrefix = true
    )

    macro(expression = "(x)*57.2957795f")..float(
        "AI_RAD_TO_DEG",

        float("x"),
        noPrefix = true
    )

    // types.h

    IntConstant(
        "MAXLEN"..1024
    ).noPrefix()

    EnumConstant(
        "Return_SUCCESS".enum(0x0),
        "Return_FAILURE".enum(-0x1),
        "Return_OUTOFMEMORY".enum(-0x3)
    )

    EnumConstant(
        "Origin_SET".enum(0x0),
        "Origin_CUR".enum(0x1),
        "Origin_END".enum(0x2)
    )

    EnumConstant(
        "DefaultLogStream_FILE".enum(0x1),
        "DefaultLogStream_STDOUT".enum(0x2),
        "DefaultLogStream_STDERR".enum(0x4),
        "DefaultLogStream_DEBUGGER".enum(0x8)
    )

    // anim.h

    EnumConstant(
        "AnimInterpolation_Step".enum("0"),
        "AnimInterpolation_Linear".enum,
        "AnimInterpolation_Spherical_Linear".enum,
        "AnimInterpolation_Cubic_Spline".enum
    )

    EnumConstant(
        "AnimBehaviour_DEFAULT".enum(0x0),
        "AnimBehaviour_CONSTANT".enum(0x1),
        "AnimBehaviour_LINEAR".enum(0x2),
        "AnimBehaviour_REPEAT".enum(0x3)
    )

    // cexport.h

    size_t(
        "GetExportFormatCount",
        void()
    )

    aiExportFormatDesc.p(
        "GetExportFormatDescription",

        size_t("pIndex")
    )

    void(
        "ReleaseExportFormatDescription",

        aiExportFormatDesc.const.p("desc")
    )

    void(
        "CopyScene",

        aiScene.const.p("pIn"),
        ReturnParam..Check(1)..aiScene.p.p("pOut")
    )

    void(
        "FreeScene",

        aiScene.const.p("pIn")
    )

    val ExportScene = aiReturn(
        "ExportScene",

        aiScene.const.p("pScene"),
        charUTF8.const.p("pFormatId"),
        charUTF8.const.p("pFileName"),
        unsigned_int("pPreProcessing")
    )

    aiReturn(
        "ExportSceneEx",

        ExportScene["pScene"],
        ExportScene["pFormatId"],
        ExportScene["pFileName"],
        nullable..aiFileIO.const.p("pIO"),
        ExportScene["pPreProcessing"]
    )

    aiExportDataBlob.p(
        "ExportSceneToBlob",

        ExportScene["pScene"],
        ExportScene["pFormatId"],
        ExportScene["pPreProcessing"]
    )

    void(
        "ReleaseExportBlob",

        aiExportDataBlob.const.p("pData")
    )

    // cimport.h

    EnumConstant(
        "AI_TRUE".enum(1),
        "AI_FALSE".enum(0)
    ).noPrefix()

    val ImportFile = aiScene.p(
        "ImportFile",

        charUTF8.const.p("pFile"),
        unsigned_int("pFlags")
    )

    val ImportFileEx = aiScene.p(
        "ImportFileEx",

        ImportFile["pFile"],
        ImportFile["pFlags"],
        Input..nullable..aiFileIO.p("pFS")
    )

    aiScene.p(
        "ImportFileExWithProperties",

        ImportFile["pFile"],
        ImportFile["pFlags"],
        ImportFileEx["pFS"],
        aiPropertyStore.const.p("pProps")
    )

    val ImportFileFromMemory = aiScene.p(
        "ImportFileFromMemory",

        char.const.p("pBuffer"),
        AutoSize("pBuffer")..unsigned_int("pLength"),
        ImportFile["pFlags"],
        nullable..charUTF8.const.p("pHint")
    )

    aiScene.p(
        "ImportFileFromMemoryWithProperties",

        ImportFileFromMemory["pBuffer"],
        ImportFileFromMemory["pLength"],
        ImportFileFromMemory["pFlags"],
        ImportFileFromMemory["pHint"],
        aiPropertyStore.const.p("pProps")
    )

    aiScene.p(
        "ApplyPostProcessing",

        aiScene.const.p("pScene"),
        unsigned_int("pFlags")
    )

    aiLogStream(
        "GetPredefinedLogStream",

        aiDefaultLogStream("pStreams"),
        nullable..charUTF8.const.p("file")
    )

    void(
        "AttachLogStream",

        aiLogStream.const.p("stream")
    )

    void(
        "EnableVerboseLogging",

        aiBool("d")
    )

    aiReturn(
        "DetachLogStream",

        aiLogStream.const.p("stream")
    )

    void(
        "DetachAllLogStreams",
        void()
    )

    void(
        "ReleaseImport",

        nullable..aiScene.const.p("pScene")
    )

    charUTF8.p(
        "GetErrorString",
        void()
    )

    aiBool(
        "IsExtensionSupported",

        charUTF8.const.p("szExtension")
    )

    void(
        "GetExtensionList",

        aiString.p("szOut")
    )

    void(
        "GetMemoryRequirements",

        aiScene.const.p("pIn"),
        aiMemoryInfo.p("in")
    )

    aiTexture.p(
        "GetEmbeddedTexture",

        aiScene.const.p("pIn"),
        charUTF8.const.p("filename")
    )

    aiPropertyStore.p(
        "CreatePropertyStore",
        void()
    )

    void(
        "ReleasePropertyStore",

        aiPropertyStore.p("p")
    )

    val SetImportPropertyInteger = void(
        "SetImportPropertyInteger",

        aiPropertyStore.p("store"),
        charASCII.const.p("szName"),
        int("value")
    )

    void(
        "SetImportPropertyFloat",

        SetImportPropertyInteger["store"],
        SetImportPropertyInteger["szName"],
        float("value")
    )

    void(
        "SetImportPropertyString",

        SetImportPropertyInteger["store"],
        SetImportPropertyInteger["szName"],
        aiString.const.p("value")
    )

    void(
        "SetImportPropertyMatrix",

        SetImportPropertyInteger["store"],
        SetImportPropertyInteger["szName"],
        aiMatrix4x4.const.p("value")
    )

    void(
        "CreateQuaternionFromMatrix",

        aiQuaternion.p("quat"),
        aiMatrix3x3.const.p("mat")
    )

    void(
        "DecomposeMatrix",

        aiMatrix4x4.const.p("mat"),
        aiVector3D.p("scaling"),
        aiQuaternion.p("rotation"),
        aiVector3D.p("position")
    )

    void(
        "TransposeMatrix4",

        Input..aiMatrix4x4.p("mat")
    )

    void(
        "TransposeMatrix3",

        Input..aiMatrix3x3.p("mat")
    )

    void(
        "TransformVecByMatrix3",

        Input..aiVector3D.p("vec"),
        aiMatrix3x3.const.p("mat")
    )

    void(
        "TransformVecByMatrix4",

        Input..aiVector3D.p("vec"),
        aiMatrix4x4.const.p("mat")
    )

    void(
        "MultiplyMatrix4",

        Input..aiMatrix4x4.p("dst"),
        aiMatrix4x4.const.p("src")
    )

    void(
        "MultiplyMatrix3",

        Input..aiMatrix3x3.p("dst"),
        aiMatrix3x3.const.p("src")
    )

    void(
        "IdentityMatrix3",

        aiMatrix3x3.p("mat")
    )

    void(
        "IdentityMatrix4",

        aiMatrix4x4.p("mat")
    )

    size_t(
        "GetImportFormatCount",
        void()
    )

    aiImporterDesc.p(
        "GetImportFormatDescription",

        size_t("pIndex")
    )

    intb(
        "Vector2AreEqual",

        aiVector2D.const.p("a"),
        aiVector2D.const.p("b")
    )

    intb(
        "Vector2AreEqualEpsilon",

        aiVector2D.const.p("a"),
        aiVector2D.const.p("b"),
        float("epsilon")
    )

    void(
        "Vector2Add",

        aiVector2D.p("dst"),
        aiVector2D.const.p("src")
    )

    void(
        "Vector2Subtract",

        aiVector2D.p("dst"),
        aiVector2D.const.p("src")
    )

    void(
        "Vector2Scale",

        aiVector2D.p("dst"),
        float("s")
    )

    void(
        "Vector2SymMul",

        aiVector2D.p("dst"),
        aiVector2D.const.p("other")
    )

    void(
        "Vector2DivideByScalar",

        aiVector2D.p("dst"),
        float("s")
    )

    void(
        "Vector2DivideByVector",

        aiVector2D.p("dst"),
        aiVector2D.p("v")
    )

    float(
        "Vector2Length",

        aiVector2D.const.p("v")
    )

    float(
        "Vector2SquareLength",

        aiVector2D.const.p("v")
    )

    void(
        "Vector2Negate",

        aiVector2D.p("dst")
    )

    float(
        "Vector2DotProduct",

        aiVector2D.const.p("a"),
        aiVector2D.const.p("b")
    )

    void(
        "Vector2Normalize",

        aiVector2D.p("v")
    )

    intb(
        "Vector3AreEqual",

        aiVector3D.const.p("a"),
        aiVector3D.const.p("b")
    )

    intb(
        "Vector3AreEqualEpsilon",

        aiVector3D.const.p("a"),
        aiVector3D.const.p("b"),
        float.const("epsilon")
    )

    intb(
        "Vector3LessThan",

        aiVector3D.const.p("a"),
        aiVector3D.const.p("b")
    )

    void(
        "Vector3Add",

        aiVector3D.p("dst"),
        aiVector3D.const.p("src")
    )

    void(
        "Vector3Subtract",

        aiVector3D.p("dst"),
        aiVector3D.const.p("src")
    )

    void(
        "Vector3Scale",

        aiVector3D.p("dst"),
        float.const("s")
    )

    void(
        "Vector3SymMul",

        aiVector3D.p("dst"),
        aiVector3D.const.p("other")
    )

    void(
        "Vector3DivideByScalar",

        aiVector3D.p("dst"),
        float.const("s")
    )

    void(
        "Vector3DivideByVector",

        aiVector3D.p("dst"),
        aiVector3D.p("v")
    )

    float(
        "Vector3Length",

        aiVector3D.const.p("v")
    )

    float(
        "Vector3SquareLength",

        aiVector3D.const.p("v")
    )

    void(
        "Vector3Negate",

        aiVector3D.p("dst")
    )

    float(
        "Vector3DotProduct",

        aiVector3D.const.p("a"),
        aiVector3D.const.p("b")
    )

    void(
        "Vector3CrossProduct",

        aiVector3D.p("dst"),
        aiVector3D.const.p("a"),
        aiVector3D.const.p("b")
    )

    void(
        "Vector3Normalize",

        aiVector3D.p("v")
    )

    void(
        "Vector3NormalizeSafe",

        aiVector3D.p("v")
    )

    void(
        "Vector3RotateByQuaternion",

        aiVector3D.p("v"),
        aiQuaternion.const.p("q")
    )

    void(
        "Matrix3FromMatrix4",

        aiMatrix3x3.p("dst"),
        aiMatrix4x4.const.p("mat")
    )

    void(
        "Matrix3FromQuaternion",

        aiMatrix3x3.p("mat"),
        aiQuaternion.const.p("q")
    )

    intb(
        "Matrix3AreEqual",

        aiMatrix3x3.const.p("a"),
        aiMatrix3x3.const.p("b")
    )

    intb(
        "Matrix3AreEqualEpsilon",

        aiMatrix3x3.const.p("a"),
        aiMatrix3x3.const.p("b"),
        float.const("epsilon")
    )

    void(
        "Matrix3Inverse",

        aiMatrix3x3.p("mat")
    )

    float(
        "Matrix3Determinant",

        aiMatrix3x3.const.p("mat")
    )

    void(
        "Matrix3RotationZ",

        aiMatrix3x3.p("mat"),
        float("angle")
    )

    void(
        "Matrix3FromRotationAroundAxis",

        aiMatrix3x3.p("mat"),
        aiVector3D.const.p("axis"),
        float("angle")
    )

    void(
        "Matrix3Translation",

        aiMatrix3x3.p("mat"),
        aiVector2D.const.p("translation")
    )

    void(
        "Matrix3FromTo",

        aiMatrix3x3.p("mat"),
        aiVector3D.const.p("from"),
        aiVector3D.const.p("to")
    )

    void(
        "Matrix4FromMatrix3",

        aiMatrix4x4.p("dst"),
        aiMatrix3x3.const.p("mat")
    )

    void(
        "Matrix4FromScalingQuaternionPosition",

        aiMatrix4x4.p("mat"),
        aiVector3D.const.p("scaling"),
        aiQuaternion.const.p("rotation"),
        aiVector3D.const.p("position")
    )

    void(
        "Matrix4Add",

        aiMatrix4x4.p("dst"),
        aiMatrix4x4.const.p("src")
    )

    intb(
        "Matrix4AreEqual",

        aiMatrix4x4.const.p("a"),
        aiMatrix4x4.const.p("b")
    )

    intb(
        "Matrix4AreEqualEpsilon",

        aiMatrix4x4.const.p("a"),
        aiMatrix4x4.const.p("b"),
        float.const("epsilon")
    )

    void(
        "Matrix4Inverse",

        aiMatrix4x4.p("mat")
    )

    float(
        "Matrix4Determinant",

        aiMatrix4x4.const.p("mat")
    )

    intb(
        "Matrix4IsIdentity",

        aiMatrix4x4.const.p("mat")
    )

    void(
        "Matrix4DecomposeIntoScalingEulerAnglesPosition",

        aiMatrix4x4.const.p("mat"),
        aiVector3D.p("scaling"),
        aiVector3D.p("rotation"),
        aiVector3D.p("position")
    )

    void(
        "Matrix4DecomposeIntoScalingAxisAnglePosition",

        aiMatrix4x4.const.p("mat"),
        aiVector3D.p("scaling"),
        aiVector3D.p("axis"),
        Check(1)..ai_real.p("angle"),
        aiVector3D.p("position")
    )

    void(
        "Matrix4DecomposeNoScaling",

        aiMatrix4x4.const.p("mat"),
        aiQuaternion.p("rotation"),
        aiVector3D.p("position")
    )

    void(
        "Matrix4FromEulerAngles",

        aiMatrix4x4.p("mat"),
        float("x"),
        float("y"),
        float("z")
    )

    void(
        "Matrix4RotationX",

        aiMatrix4x4.p("mat"),
        float("angle")
    )

    void(
        "Matrix4RotationY",

        aiMatrix4x4.p("mat"),
        float("angle")
    )

    void(
        "Matrix4RotationZ",

        aiMatrix4x4.p("mat"),
        float("angle")
    )

    void(
        "Matrix4FromRotationAroundAxis",

        aiMatrix4x4.p("mat"),
        aiVector3D.const.p("axis"),
        float("angle")
    )

    void(
        "Matrix4Translation",

        aiMatrix4x4.p("mat"),
        aiVector3D.const.p("translation")
    )

    void(
        "Matrix4Scaling",

        aiMatrix4x4.p("mat"),
        aiVector3D.const.p("scaling")
    )

    void(
        "Matrix4FromTo",

        aiMatrix4x4.p("mat"),
        aiVector3D.const.p("from"),
        aiVector3D.const.p("to")
    )

    void(
        "QuaternionFromEulerAngles",

        aiQuaternion.p("q"),
        float("x"),
        float("y"),
        float("z")
    )

    void(
        "QuaternionFromAxisAngle",

        aiQuaternion.p("q"),
        aiVector3D.const.p("axis"),
        float("angle")
    )

    void(
        "QuaternionFromNormalizedQuaternion",

        aiQuaternion.p("q"),
        aiVector3D.const.p("normalized")
    )

    intb(
        "QuaternionAreEqual",

        aiQuaternion.const.p("a"),
        aiQuaternion.const.p("b")
    )

    intb(
        "QuaternionAreEqualEpsilon",

        aiQuaternion.const.p("a"),
        aiQuaternion.const.p("b"),
        float.const("epsilon")
    )

    void(
        "QuaternionNormalize",

        aiQuaternion.p("q")
    )

    void(
        "QuaternionConjugate",

        aiQuaternion.p("q")
    )

    void(
        "QuaternionMultiply",

        aiQuaternion.p("dst"),
        aiQuaternion.const.p("q")
    )

    void(
        "QuaternionInterpolate",

        aiQuaternion.p("dst"),
        aiQuaternion.const.p("start"),
        aiQuaternion.const.p("end"),
        float("factor")
    )

    // importerdesc.h

    EnumConstant(
        "ImporterFlags_SupportTextFlavour".enum(0x1),
        "ImporterFlags_SupportBinaryFlavour".enum(0x2),
        "ImporterFlags_SupportCompressedFlavour".enum(0x4),
        "ImporterFlags_LimitedSupport".enum(0x8),
        "ImporterFlags_Experimental".enum(0x10)
    )

    aiImporterDesc.p(
        "GetImporterDesc",

        charASCII.const.p("extension")
    )

    // light.h

    EnumConstant(
        "LightSource_UNDEFINED".enum(0x0),
        "LightSource_DIRECTIONAL".enum(0x1),
        "LightSource_POINT".enum(0x2),
        "LightSource_SPOT".enum(0x3),
        "LightSource_AMBIENT".enum(0x4),
        "LightSource_AREA".enum(0x5)
    )

    // material.h

    StringConstant(
        "AI_DEFAULT_MATERIAL_NAME".."DefaultMaterial"
    ).noPrefix()

    EnumConstant(
        "TextureOp_Multiply".enum(0x0),
        "TextureOp_Add".enum(0x1),
        "TextureOp_Subtract".enum(0x2),
        "TextureOp_Divide".enum(0x3),
        "TextureOp_SmoothAdd".enum(0x4),
        "TextureOp_SignedAdd".enum(0x5)
    )

    EnumConstant(
        "TextureMapMode_Wrap".enum(0x0),
        "TextureMapMode_Clamp".enum(0x1),
        "TextureMapMode_Decal".enum(0x3),
        "TextureMapMode_Mirror".enum(0x2)
    )

    EnumConstant(
        "TextureMapping_UV".enum(0x0),
        "TextureMapping_SPHERE".enum(0x1),
        "TextureMapping_CYLINDER".enum(0x2),
        "TextureMapping_BOX".enum(0x3),
        "TextureMapping_PLANE".enum(0x4),
        "TextureMapping_OTHER".enum(0x5)
    )

    EnumConstant(
        "TextureType_NONE".enum("0"),
        "TextureType_DIFFUSE".enum,
        "TextureType_SPECULAR".enum,
        "TextureType_AMBIENT".enum,
        "TextureType_EMISSIVE".enum,
        "TextureType_HEIGHT".enum,
        "TextureType_NORMALS".enum,
        "TextureType_SHININESS".enum,
        "TextureType_OPACITY".enum,
        "TextureType_DISPLACEMENT".enum,
        "TextureType_LIGHTMAP".enum,
        "TextureType_REFLECTION".enum,
        "TextureType_BASE_COLOR".enum,
        "TextureType_NORMAL_CAMERA".enum,
        "TextureType_EMISSION_COLOR".enum,
        "TextureType_METALNESS".enum,
        "TextureType_DIFFUSE_ROUGHNESS".enum,
        "TextureType_AMBIENT_OCCLUSION".enum,
        "TextureType_UNKNOWN".enum,
        "TextureType_SHEEN".enum,
        "TextureType_CLEARCOAT".enum,
        "TextureType_TRANSMISSION".enum,
        "TextureType_MAYA_BASE".enum,
        "TextureType_MAYA_SPECULAR".enum,
        "TextureType_MAYA_SPECULAR_COLOR".enum,
        "TextureType_MAYA_SPECULAR_ROUGHNESS".enum
    )

    EnumConstant(
        "ShadingMode_Flat".enum(0x1),
        "ShadingMode_Gouraud".enum(0x2),
        "ShadingMode_Phong".enum(0x3),
        "ShadingMode_Blinn".enum(0x4),
        "ShadingMode_Toon".enum(0x5),
        "ShadingMode_OrenNayar".enum(0x6),
        "ShadingMode_Minnaert".enum(0x7),
        "ShadingMode_CookTorrance".enum(0x8),
        "ShadingMode_NoShading".enum(0x9),
        "ShadingMode_Unlit".enum("aiShadingMode_NoShading"),
        "ShadingMode_Fresnel".enum(0xa),
        "ShadingMode_PBR_BRDF".enum(0xb)
    )

    EnumConstant(
        "TextureFlags_Invert".enum(0x1),
        "TextureFlags_UseAlpha".enum(0x2),
        "TextureFlags_IgnoreAlpha".enum(0x2)
    )

    EnumConstant(
        "BlendMode_Default".enum(0x0),
        "BlendMode_Additive".enum(0x1)
    )

    EnumConstant(
        "PTI_Float".enum(0x1),
        "PTI_Double".enum(0x2),
        "PTI_String".enum(0x3),
        "PTI_Integer".enum(0x4),
        "PTI_Buffer".enum(0x5)
    )

    StringConstant(
        "AI_MATKEY_NAME".."?mat.name",
        "AI_MATKEY_TWOSIDED".."\$mat.twosided",
        "AI_MATKEY_SHADING_MODEL".."\$mat.shadingm",
        "AI_MATKEY_ENABLE_WIREFRAME".."\$mat.wireframe",
        "AI_MATKEY_BLEND_FUNC".."\$mat.blend",
        "AI_MATKEY_OPACITY".."\$mat.opacity",
        "AI_MATKEY_TRANSPARENCYFACTOR".."\$mat.transparencyfactor",
        "AI_MATKEY_BUMPSCALING".."\$mat.bumpscaling",
        "AI_MATKEY_SHININESS".."\$mat.shininess",
        "AI_MATKEY_REFLECTIVITY".."\$mat.reflectivity",
        "AI_MATKEY_SHININESS_STRENGTH".."\$mat.shinpercent",
        "AI_MATKEY_REFRACTI".."\$mat.refracti",
        "AI_MATKEY_COLOR_DIFFUSE".."\$clr.diffuse",
        "AI_MATKEY_COLOR_AMBIENT".."\$clr.ambient",
        "AI_MATKEY_COLOR_SPECULAR".."\$clr.specular",
        "AI_MATKEY_COLOR_EMISSIVE".."\$clr.emissive",
        "AI_MATKEY_COLOR_TRANSPARENT".."\$clr.transparent",
        "AI_MATKEY_COLOR_REFLECTIVE".."\$clr.reflective",
        "AI_MATKEY_GLOBAL_BACKGROUND_IMAGE".."?bg.global",
        "AI_MATKEY_GLOBAL_SHADERLANG".."?sh.lang",
        "AI_MATKEY_SHADER_VERTEX".."?sh.vs",
        "AI_MATKEY_SHADER_FRAGMENT".."?sh.fs",
        "AI_MATKEY_SHADER_GEO".."?sh.gs",
        "AI_MATKEY_SHADER_TESSELATION".."?sh.ts",
        "AI_MATKEY_SHADER_PRIMITIVE".."?sh.ps",
        "AI_MATKEY_SHADER_COMPUTE".."?sh.cs",

        "AI_MATKEY_USE_COLOR_MAP".."\$mat.useColorMap",
        "AI_MATKEY_BASE_COLOR".."\$clr.base",
        "AI_MATKEY_USE_METALLIC_MAP".."\$mat.useMetallicMap",
        "AI_MATKEY_METALLIC_FACTOR".."\$mat.metallicFactor",
        "AI_MATKEY_USE_ROUGHNESS_MAP".."\$mat.useRoughnessMap",
        "AI_MATKEY_ROUGHNESS_FACTOR".."\$mat.roughnessFactor",
        "AI_MATKEY_ANISOTROPY_FACTOR".."\$mat.anisotropyFactor",
        "AI_MATKEY_SPECULAR_FACTOR".."\$mat.specularFactor",
        "AI_MATKEY_GLOSSINESS_FACTOR".."\$mat.glossinessFactor",
        "AI_MATKEY_SHEEN_COLOR_FACTOR".."\$clr.sheen.factor",
        "AI_MATKEY_SHEEN_ROUGHNESS_FACTOR".."\$mat.sheen.roughnessFactor",
        "AI_MATKEY_CLEARCOAT_FACTOR".."\$mat.clearcoat.factor",
        "AI_MATKEY_CLEARCOAT_ROUGHNESS_FACTOR".."\$mat.clearcoat.roughnessFactor",
        "AI_MATKEY_TRANSMISSION_FACTOR".."\$mat.transmission.factor",
        "AI_MATKEY_VOLUME_THICKNESS_FACTOR".."\$mat.volume.thicknessFactor",
        "AI_MATKEY_VOLUME_ATTENUATION_DISTANCE".."\$mat.volume.attenuationDistance",
        "AI_MATKEY_VOLUME_ATTENUATION_COLOR".."\$mat.volume.attenuationColor",
        "AI_MATKEY_USE_EMISSIVE_MAP".."\$mat.useEmissiveMap",
        "AI_MATKEY_EMISSIVE_INTENSITY".."\$mat.emissiveIntensity",
        "AI_MATKEY_USE_AO_MAP".."\$mat.useAOMap",
        "AI_MATKEY_OBJ_ILLUM".."\$mat.illum",

        "_AI_MATKEY_TEXTURE_BASE".."\$tex.file",
        "_AI_MATKEY_UVWSRC_BASE".."\$tex.uvwsrc",
        "_AI_MATKEY_TEXOP_BASE".."\$tex.op",
        "_AI_MATKEY_MAPPING_BASE".."\$tex.mapping",
        "_AI_MATKEY_TEXBLEND_BASE".."\$tex.blend",
        "_AI_MATKEY_MAPPINGMODE_U_BASE".."\$tex.mapmodeu",
        "_AI_MATKEY_MAPPINGMODE_V_BASE".."\$tex.mapmodev",
        "_AI_MATKEY_TEXMAP_AXIS_BASE".."\$tex.mapaxis",
        "_AI_MATKEY_UVTRANSFORM_BASE".."\$tex.uvtrafo",
        "_AI_MATKEY_TEXFLAGS_BASE".."\$tex.flags",
        "_AI_MATKEY_OBJ_BUMPMULT_BASE".."\$tex.bumpmult"
    ).noPrefix()

    IntConstant(
        "AI_MATKEY_GLTF_PBRMETALLICROUGHNESS_METALLICROUGHNESS_TEXTURE".."aiTextureType_UNKNOWN"
    ).noPrefix()

    StringConstant(
        "AI_MATKEY_GLTF_ALPHAMODE".."\$mat.gltf.alphaMode",
        "AI_MATKEY_GLTF_ALPHACUTOFF".."\$mat.gltf.alphaCutoff",

        "_AI_MATKEY_GLTF_MAPPINGNAME_BASE".."\$tex.mappingname",
        "_AI_MATKEY_GLTF_MAPPINGID_BASE".."\$tex.mappingid",
        "_AI_MATKEY_GLTF_MAPPINGFILTER_MAG_BASE".."\$tex.mappingfiltermag",
        "_AI_MATKEY_GLTF_MAPPINGFILTER_MIN_BASE".."\$tex.mappingfiltermin",
        "_AI_MATKEY_GLTF_SCALE_BASE".."\$tex.scale",
        "_AI_MATKEY_GLTF_STRENGTH_BASE".."\$tex.strength"
    ).noPrefix()

    charASCII.const.p(
        "TextureTypeToString",

        aiTextureType("in")
    )

    val GetMaterialProperty = aiReturn(
        "GetMaterialProperty",

        aiMaterial.const.p("pMat"),
        charASCII.const.p("pKey"),
        unsigned_int("type"),
        unsigned_int("index"),
        Check(1)..aiMaterialProperty.const.p.p("mPropOut")
    )

    macro(expression = "aiGetMaterialProperty(pMat, pKey, 0, 0, mPropOut)")..aiReturn(
        "aiGetMaterialProperty",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["mPropOut"],

        noPrefix = true
    )

    aiReturn(
        "GetMaterialFloatArray",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        ai_real.p("pOut"),
        AutoSize("pOut")..Check(1)..nullable..unsigned_int.p("pMax")
    )

    aiReturn(
        "GetMaterialIntegerArray",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        int.p("pOut"),
        AutoSize("pOut")..Check(1)..nullable..unsigned_int.p("pMax")
    )

    aiReturn(
        "GetMaterialColor",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        aiColor4D.p("pOut")
    )

    aiReturn(
        "GetMaterialUVTransform",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        aiUVTransform.p("pOut")
    )

    aiReturn(
        "GetMaterialString",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        aiString.p("pOut")
    )

    unsigned_int(
        "GetMaterialTextureCount",

        GetMaterialProperty["pMat"],
        aiTextureType("type")
    )

    aiReturn(
        "GetMaterialTexture",

        GetMaterialProperty["pMat"],
        aiTextureType("type"),
        unsigned_int("index"),
        aiString.p("path"),
        Check(1)..nullable..aiTextureMapping.p("mapping"),
        Check(1)..nullable..unsigned_int.p("uvindex"),
        Check(1)..nullable..float.p("blend"),
        Check(1)..nullable..aiTextureOp.p("op"),
        Check(1)..nullable..aiTextureMapMode.p("mapmode"),
        Check(1)..nullable..unsigned_int.p("flags")
    )

    // mesh.h

    IntConstant(
        "AI_MAX_FACE_INDICES"..0x7fff,
        "AI_MAX_BONE_WEIGHTS"..0x7fffffff,
        "AI_MAX_VERTICES"..0x7fffffff,
        "AI_MAX_FACES"..0x7fffffff,
        "AI_MAX_NUMBER_OF_COLOR_SETS"..0x8,
        "AI_MAX_NUMBER_OF_TEXTURECOORDS"..0x8
    ).noPrefix()

    EnumConstant(
        "PrimitiveType_POINT".enum(0x1),
        "PrimitiveType_LINE".enum(0x2),
        "PrimitiveType_TRIANGLE".enum(0x4),
        "PrimitiveType_POLYGON".enum(0x8),
        "PrimitiveType_NGONEncodingFlag".enum(0x10)
    )

    EnumConstant(
        "MorphingMethod_UNKNOWN".enum("0x0"),
        "MorphingMethod_VERTEX_BLEND".enum("0x1"),
        "MorphingMethod_MORPH_NORMALIZED".enum("0x2"),
        "MorphingMethod_MORPH_RELATIVE".enum("0x3")
    )

    // metadata.h

    EnumConstant(
        "AI_BOOL".enum("0"),
        "AI_INT32".enum,
        "AI_UINT64".enum,
        "AI_FLOAT".enum,
        "AI_DOUBLE".enum,
        "AI_AISTRING".enum,
        "AI_AIVECTOR3D".enum,
        "AI_AIMETADATA".enum,
        "AI_INT64".enum,
        "AI_UINT32".enum,
        "AI_META_MAX".enum
    ).noPrefix()

    StringConstant(
        "AI_METADATA_SOURCE_FORMAT".."SourceAsset_Format",
        "AI_METADATA_SOURCE_FORMAT_VERSION".."SourceAsset_FormatVersion",
        "AI_METADATA_SOURCE_GENERATOR".."SourceAsset_Generator",
        "AI_METADATA_SOURCE_COPYRIGHT".."SourceAsset_Copyright"
    ).noPrefix()

    // postprocess.h

    EnumConstant(
        "Process_CalcTangentSpace".enum(0x1),
        "Process_JoinIdenticalVertices".enum(0x2),
        "Process_MakeLeftHanded".enum(0x4),
        "Process_Triangulate".enum(0x8),
        "Process_RemoveComponent".enum(0x10),
        "Process_GenNormals".enum(0x20),
        "Process_GenSmoothNormals".enum(0x40),
        "Process_SplitLargeMeshes".enum(0x80),
        "Process_PreTransformVertices".enum(0x100),
        "Process_LimitBoneWeights".enum(0x200),
        "Process_ValidateDataStructure".enum(0x400),
        "Process_ImproveCacheLocality".enum(0x800),
        "Process_RemoveRedundantMaterials".enum(0x1000),
        "Process_FixInfacingNormals".enum(0x2000),
        "Process_PopulateArmatureData".enum(0x4000),
        "Process_SortByPType".enum(0x8000),
        "Process_FindDegenerates".enum(0x10000),
        "Process_FindInvalidData".enum(0x20000),
        "Process_GenUVCoords".enum(0x40000),
        "Process_TransformUVCoords".enum(0x80000),
        "Process_FindInstances".enum(0x100000),
        "Process_OptimizeMeshes".enum(0x200000),
        "Process_OptimizeGraph".enum(0x400000),
        "Process_FlipUVs".enum(0x800000),
        "Process_FlipWindingOrder".enum(0x1000000),
        "Process_SplitByBoneCount".enum(0x2000000),
        "Process_Debone".enum(0x4000000),
        "Process_GlobalScale".enum(0x8000000),
        "Process_EmbedTextures".enum(0x10000000),
        "Process_ForceGenNormals".enum(0x20000000),
        "Process_DropNormals".enum(0x40000000),
        "Process_GenBoundingBoxes".enum(0x80000000.i)
    )

    EnumConstant(
        "Process_ConvertToLeftHanded".enum(
            """
            aiProcess_MakeLeftHanded   |
            aiProcess_FlipUVs          |
            aiProcess_FlipWindingOrder |
            0"""
        ),

        "ProcessPreset_TargetRealtime_Fast".enum(
            """
            aiProcess_CalcTangentSpace      |
            aiProcess_GenNormals            |
            aiProcess_JoinIdenticalVertices |
            aiProcess_Triangulate           |
            aiProcess_GenUVCoords           |
            aiProcess_SortByPType           |
            0"""
        ),

        "ProcessPreset_TargetRealtime_Quality".enum(
            """
            aiProcess_CalcTangentSpace         |
            aiProcess_GenSmoothNormals         |
            aiProcess_JoinIdenticalVertices    |
            aiProcess_ImproveCacheLocality     |
            aiProcess_LimitBoneWeights         |
            aiProcess_RemoveRedundantMaterials |
            aiProcess_SplitLargeMeshes         |
            aiProcess_Triangulate              |
            aiProcess_GenUVCoords              |
            aiProcess_SortByPType              |
            aiProcess_FindDegenerates          |
            aiProcess_FindInvalidData          |
            0"""
        ),

        "ProcessPreset_TargetRealtime_MaxQuality".enum(
            """
            aiProcessPreset_TargetRealtime_Quality |
            aiProcess_FindInstances                |
            aiProcess_FindInvalidData              |
            aiProcess_OptimizeMeshes               |
            0"""
        )
    )

    // scene.h

    IntConstant(
        "AI_SCENE_FLAGS_INCOMPLETE"..0x1,
        "AI_SCENE_FLAGS_VALIDATED"..0x2,
        "AI_SCENE_FLAGS_VALIDATION_WARNING"..0x4,
        "AI_SCENE_FLAGS_NON_VERBOSE_FORMAT"..0x8,
        "AI_SCENE_FLAGS_TERRAIN"..0x10
    ).noPrefix()

    // scene.h

    IntConstant(
        "ASSIMP_CFLAGS_SHARED"..0x1,
        "ASSIMP_CFLAGS_STLPORT"..0x2,
        "ASSIMP_CFLAGS_DEBUG"..0x4,
        "ASSIMP_CFLAGS_NOBOOST"..0x8,
        "ASSIMP_CFLAGS_SINGLETHREADED"..0x10,
        "ASSIMP_CFLAGS_DOUBLE_SUPPORT"..0x20
    ).noPrefix()

    Nonnull..charASCII.const.p("GetLegalString", void())

    unsigned_int("GetVersionPatch", void())
    unsigned_int("GetVersionMinor", void())
    unsigned_int("GetVersionMajor", void())
    unsigned_int("GetVersionRevision", void())

    charUTF8.const.p("GetBranchName", void())

    unsigned_int("GetCompileFlags", void())
}