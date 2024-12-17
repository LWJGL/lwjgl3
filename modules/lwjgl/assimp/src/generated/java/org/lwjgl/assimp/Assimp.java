/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Assimp {

    private static final SharedLibrary DRACO = Library.loadNative(Assimp.class, "org.lwjgl.assimp", Configuration.ASSIMP_DRACO_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("draco")), true);
    private static final SharedLibrary ASSIMP = Library.loadNative(Assimp.class, "org.lwjgl.assimp", Configuration.ASSIMP_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("assimp")), true);

    /** Contains the function pointers loaded from the assimp {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetExportFormatCount                           = apiGetFunctionAddress(ASSIMP, "aiGetExportFormatCount"),
            GetExportFormatDescription                     = apiGetFunctionAddress(ASSIMP, "aiGetExportFormatDescription"),
            ReleaseExportFormatDescription                 = apiGetFunctionAddress(ASSIMP, "aiReleaseExportFormatDescription"),
            CopyScene                                      = apiGetFunctionAddress(ASSIMP, "aiCopyScene"),
            FreeScene                                      = apiGetFunctionAddress(ASSIMP, "aiFreeScene"),
            ExportScene                                    = apiGetFunctionAddress(ASSIMP, "aiExportScene"),
            ExportSceneEx                                  = apiGetFunctionAddress(ASSIMP, "aiExportSceneEx"),
            ExportSceneToBlob                              = apiGetFunctionAddress(ASSIMP, "aiExportSceneToBlob"),
            ReleaseExportBlob                              = apiGetFunctionAddress(ASSIMP, "aiReleaseExportBlob"),
            ImportFile                                     = apiGetFunctionAddress(ASSIMP, "aiImportFile"),
            ImportFileEx                                   = apiGetFunctionAddress(ASSIMP, "aiImportFileEx"),
            ImportFileExWithProperties                     = apiGetFunctionAddress(ASSIMP, "aiImportFileExWithProperties"),
            ImportFileFromMemory                           = apiGetFunctionAddress(ASSIMP, "aiImportFileFromMemory"),
            ImportFileFromMemoryWithProperties             = apiGetFunctionAddress(ASSIMP, "aiImportFileFromMemoryWithProperties"),
            ApplyPostProcessing                            = apiGetFunctionAddress(ASSIMP, "aiApplyPostProcessing"),
            GetPredefinedLogStream                         = apiGetFunctionAddress(ASSIMP, "aiGetPredefinedLogStream"),
            AttachLogStream                                = apiGetFunctionAddress(ASSIMP, "aiAttachLogStream"),
            EnableVerboseLogging                           = apiGetFunctionAddress(ASSIMP, "aiEnableVerboseLogging"),
            DetachLogStream                                = apiGetFunctionAddress(ASSIMP, "aiDetachLogStream"),
            DetachAllLogStreams                            = apiGetFunctionAddress(ASSIMP, "aiDetachAllLogStreams"),
            ReleaseImport                                  = apiGetFunctionAddress(ASSIMP, "aiReleaseImport"),
            GetErrorString                                 = apiGetFunctionAddress(ASSIMP, "aiGetErrorString"),
            IsExtensionSupported                           = apiGetFunctionAddress(ASSIMP, "aiIsExtensionSupported"),
            GetExtensionList                               = apiGetFunctionAddress(ASSIMP, "aiGetExtensionList"),
            GetMemoryRequirements                          = apiGetFunctionAddress(ASSIMP, "aiGetMemoryRequirements"),
            GetEmbeddedTexture                             = apiGetFunctionAddress(ASSIMP, "aiGetEmbeddedTexture"),
            CreatePropertyStore                            = apiGetFunctionAddress(ASSIMP, "aiCreatePropertyStore"),
            ReleasePropertyStore                           = apiGetFunctionAddress(ASSIMP, "aiReleasePropertyStore"),
            SetImportPropertyInteger                       = apiGetFunctionAddress(ASSIMP, "aiSetImportPropertyInteger"),
            SetImportPropertyFloat                         = apiGetFunctionAddress(ASSIMP, "aiSetImportPropertyFloat"),
            SetImportPropertyString                        = apiGetFunctionAddress(ASSIMP, "aiSetImportPropertyString"),
            SetImportPropertyMatrix                        = apiGetFunctionAddress(ASSIMP, "aiSetImportPropertyMatrix"),
            CreateQuaternionFromMatrix                     = apiGetFunctionAddress(ASSIMP, "aiCreateQuaternionFromMatrix"),
            DecomposeMatrix                                = apiGetFunctionAddress(ASSIMP, "aiDecomposeMatrix"),
            TransposeMatrix4                               = apiGetFunctionAddress(ASSIMP, "aiTransposeMatrix4"),
            TransposeMatrix3                               = apiGetFunctionAddress(ASSIMP, "aiTransposeMatrix3"),
            TransformVecByMatrix3                          = apiGetFunctionAddress(ASSIMP, "aiTransformVecByMatrix3"),
            TransformVecByMatrix4                          = apiGetFunctionAddress(ASSIMP, "aiTransformVecByMatrix4"),
            MultiplyMatrix4                                = apiGetFunctionAddress(ASSIMP, "aiMultiplyMatrix4"),
            MultiplyMatrix3                                = apiGetFunctionAddress(ASSIMP, "aiMultiplyMatrix3"),
            IdentityMatrix3                                = apiGetFunctionAddress(ASSIMP, "aiIdentityMatrix3"),
            IdentityMatrix4                                = apiGetFunctionAddress(ASSIMP, "aiIdentityMatrix4"),
            GetImportFormatCount                           = apiGetFunctionAddress(ASSIMP, "aiGetImportFormatCount"),
            GetImportFormatDescription                     = apiGetFunctionAddress(ASSIMP, "aiGetImportFormatDescription"),
            Vector2AreEqual                                = apiGetFunctionAddress(ASSIMP, "aiVector2AreEqual"),
            Vector2AreEqualEpsilon                         = apiGetFunctionAddress(ASSIMP, "aiVector2AreEqualEpsilon"),
            Vector2Add                                     = apiGetFunctionAddress(ASSIMP, "aiVector2Add"),
            Vector2Subtract                                = apiGetFunctionAddress(ASSIMP, "aiVector2Subtract"),
            Vector2Scale                                   = apiGetFunctionAddress(ASSIMP, "aiVector2Scale"),
            Vector2SymMul                                  = apiGetFunctionAddress(ASSIMP, "aiVector2SymMul"),
            Vector2DivideByScalar                          = apiGetFunctionAddress(ASSIMP, "aiVector2DivideByScalar"),
            Vector2DivideByVector                          = apiGetFunctionAddress(ASSIMP, "aiVector2DivideByVector"),
            Vector2Length                                  = apiGetFunctionAddress(ASSIMP, "aiVector2Length"),
            Vector2SquareLength                            = apiGetFunctionAddress(ASSIMP, "aiVector2SquareLength"),
            Vector2Negate                                  = apiGetFunctionAddress(ASSIMP, "aiVector2Negate"),
            Vector2DotProduct                              = apiGetFunctionAddress(ASSIMP, "aiVector2DotProduct"),
            Vector2Normalize                               = apiGetFunctionAddress(ASSIMP, "aiVector2Normalize"),
            Vector3AreEqual                                = apiGetFunctionAddress(ASSIMP, "aiVector3AreEqual"),
            Vector3AreEqualEpsilon                         = apiGetFunctionAddress(ASSIMP, "aiVector3AreEqualEpsilon"),
            Vector3LessThan                                = apiGetFunctionAddress(ASSIMP, "aiVector3LessThan"),
            Vector3Add                                     = apiGetFunctionAddress(ASSIMP, "aiVector3Add"),
            Vector3Subtract                                = apiGetFunctionAddress(ASSIMP, "aiVector3Subtract"),
            Vector3Scale                                   = apiGetFunctionAddress(ASSIMP, "aiVector3Scale"),
            Vector3SymMul                                  = apiGetFunctionAddress(ASSIMP, "aiVector3SymMul"),
            Vector3DivideByScalar                          = apiGetFunctionAddress(ASSIMP, "aiVector3DivideByScalar"),
            Vector3DivideByVector                          = apiGetFunctionAddress(ASSIMP, "aiVector3DivideByVector"),
            Vector3Length                                  = apiGetFunctionAddress(ASSIMP, "aiVector3Length"),
            Vector3SquareLength                            = apiGetFunctionAddress(ASSIMP, "aiVector3SquareLength"),
            Vector3Negate                                  = apiGetFunctionAddress(ASSIMP, "aiVector3Negate"),
            Vector3DotProduct                              = apiGetFunctionAddress(ASSIMP, "aiVector3DotProduct"),
            Vector3CrossProduct                            = apiGetFunctionAddress(ASSIMP, "aiVector3CrossProduct"),
            Vector3Normalize                               = apiGetFunctionAddress(ASSIMP, "aiVector3Normalize"),
            Vector3NormalizeSafe                           = apiGetFunctionAddress(ASSIMP, "aiVector3NormalizeSafe"),
            Vector3RotateByQuaternion                      = apiGetFunctionAddress(ASSIMP, "aiVector3RotateByQuaternion"),
            Matrix3FromMatrix4                             = apiGetFunctionAddress(ASSIMP, "aiMatrix3FromMatrix4"),
            Matrix3FromQuaternion                          = apiGetFunctionAddress(ASSIMP, "aiMatrix3FromQuaternion"),
            Matrix3AreEqual                                = apiGetFunctionAddress(ASSIMP, "aiMatrix3AreEqual"),
            Matrix3AreEqualEpsilon                         = apiGetFunctionAddress(ASSIMP, "aiMatrix3AreEqualEpsilon"),
            Matrix3Inverse                                 = apiGetFunctionAddress(ASSIMP, "aiMatrix3Inverse"),
            Matrix3Determinant                             = apiGetFunctionAddress(ASSIMP, "aiMatrix3Determinant"),
            Matrix3RotationZ                               = apiGetFunctionAddress(ASSIMP, "aiMatrix3RotationZ"),
            Matrix3FromRotationAroundAxis                  = apiGetFunctionAddress(ASSIMP, "aiMatrix3FromRotationAroundAxis"),
            Matrix3Translation                             = apiGetFunctionAddress(ASSIMP, "aiMatrix3Translation"),
            Matrix3FromTo                                  = apiGetFunctionAddress(ASSIMP, "aiMatrix3FromTo"),
            Matrix4FromMatrix3                             = apiGetFunctionAddress(ASSIMP, "aiMatrix4FromMatrix3"),
            Matrix4FromScalingQuaternionPosition           = apiGetFunctionAddress(ASSIMP, "aiMatrix4FromScalingQuaternionPosition"),
            Matrix4Add                                     = apiGetFunctionAddress(ASSIMP, "aiMatrix4Add"),
            Matrix4AreEqual                                = apiGetFunctionAddress(ASSIMP, "aiMatrix4AreEqual"),
            Matrix4AreEqualEpsilon                         = apiGetFunctionAddress(ASSIMP, "aiMatrix4AreEqualEpsilon"),
            Matrix4Inverse                                 = apiGetFunctionAddress(ASSIMP, "aiMatrix4Inverse"),
            Matrix4Determinant                             = apiGetFunctionAddress(ASSIMP, "aiMatrix4Determinant"),
            Matrix4IsIdentity                              = apiGetFunctionAddress(ASSIMP, "aiMatrix4IsIdentity"),
            Matrix4DecomposeIntoScalingEulerAnglesPosition = apiGetFunctionAddress(ASSIMP, "aiMatrix4DecomposeIntoScalingEulerAnglesPosition"),
            Matrix4DecomposeIntoScalingAxisAnglePosition   = apiGetFunctionAddress(ASSIMP, "aiMatrix4DecomposeIntoScalingAxisAnglePosition"),
            Matrix4DecomposeNoScaling                      = apiGetFunctionAddress(ASSIMP, "aiMatrix4DecomposeNoScaling"),
            Matrix4FromEulerAngles                         = apiGetFunctionAddress(ASSIMP, "aiMatrix4FromEulerAngles"),
            Matrix4RotationX                               = apiGetFunctionAddress(ASSIMP, "aiMatrix4RotationX"),
            Matrix4RotationY                               = apiGetFunctionAddress(ASSIMP, "aiMatrix4RotationY"),
            Matrix4RotationZ                               = apiGetFunctionAddress(ASSIMP, "aiMatrix4RotationZ"),
            Matrix4FromRotationAroundAxis                  = apiGetFunctionAddress(ASSIMP, "aiMatrix4FromRotationAroundAxis"),
            Matrix4Translation                             = apiGetFunctionAddress(ASSIMP, "aiMatrix4Translation"),
            Matrix4Scaling                                 = apiGetFunctionAddress(ASSIMP, "aiMatrix4Scaling"),
            Matrix4FromTo                                  = apiGetFunctionAddress(ASSIMP, "aiMatrix4FromTo"),
            QuaternionFromEulerAngles                      = apiGetFunctionAddress(ASSIMP, "aiQuaternionFromEulerAngles"),
            QuaternionFromAxisAngle                        = apiGetFunctionAddress(ASSIMP, "aiQuaternionFromAxisAngle"),
            QuaternionFromNormalizedQuaternion             = apiGetFunctionAddress(ASSIMP, "aiQuaternionFromNormalizedQuaternion"),
            QuaternionAreEqual                             = apiGetFunctionAddress(ASSIMP, "aiQuaternionAreEqual"),
            QuaternionAreEqualEpsilon                      = apiGetFunctionAddress(ASSIMP, "aiQuaternionAreEqualEpsilon"),
            QuaternionNormalize                            = apiGetFunctionAddress(ASSIMP, "aiQuaternionNormalize"),
            QuaternionConjugate                            = apiGetFunctionAddress(ASSIMP, "aiQuaternionConjugate"),
            QuaternionMultiply                             = apiGetFunctionAddress(ASSIMP, "aiQuaternionMultiply"),
            QuaternionInterpolate                          = apiGetFunctionAddress(ASSIMP, "aiQuaternionInterpolate"),
            GetImporterDesc                                = apiGetFunctionAddress(ASSIMP, "aiGetImporterDesc"),
            TextureTypeToString                            = apiGetFunctionAddress(ASSIMP, "aiTextureTypeToString"),
            GetMaterialProperty                            = apiGetFunctionAddress(ASSIMP, "aiGetMaterialProperty"),
            GetMaterialFloatArray                          = apiGetFunctionAddress(ASSIMP, "aiGetMaterialFloatArray"),
            GetMaterialIntegerArray                        = apiGetFunctionAddress(ASSIMP, "aiGetMaterialIntegerArray"),
            GetMaterialColor                               = apiGetFunctionAddress(ASSIMP, "aiGetMaterialColor"),
            GetMaterialUVTransform                         = apiGetFunctionAddress(ASSIMP, "aiGetMaterialUVTransform"),
            GetMaterialString                              = apiGetFunctionAddress(ASSIMP, "aiGetMaterialString"),
            GetMaterialTextureCount                        = apiGetFunctionAddress(ASSIMP, "aiGetMaterialTextureCount"),
            GetMaterialTexture                             = apiGetFunctionAddress(ASSIMP, "aiGetMaterialTexture"),
            GetLegalString                                 = apiGetFunctionAddress(ASSIMP, "aiGetLegalString"),
            GetVersionPatch                                = apiGetFunctionAddress(ASSIMP, "aiGetVersionPatch"),
            GetVersionMinor                                = apiGetFunctionAddress(ASSIMP, "aiGetVersionMinor"),
            GetVersionMajor                                = apiGetFunctionAddress(ASSIMP, "aiGetVersionMajor"),
            GetVersionRevision                             = apiGetFunctionAddress(ASSIMP, "aiGetVersionRevision"),
            GetBranchName                                  = apiGetFunctionAddress(ASSIMP, "aiGetBranchName"),
            GetCompileFlags                                = apiGetFunctionAddress(ASSIMP, "aiGetCompileFlags");

    }

    /** Returns the assimp {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return ASSIMP;
    }

    /** Returns the Draco {@link SharedLibrary}. */
    public static SharedLibrary getDraco() {
        return DRACO;
    }

    public static final String
        AI_CONFIG_GLOB_MEASURE_TIME         = "GLOB_MEASURE_TIME",
        AI_CONFIG_IMPORT_NO_SKELETON_MESHES = "IMPORT_NO_SKELETON_MESHES";

    public static final String
        AI_CONFIG_PP_SBBC_MAX_BONES              = "PP_SBBC_MAX_BONES",
        AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE      = "PP_CT_MAX_SMOOTHING_ANGLE",
        AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX    = "PP_CT_TEXTURE_CHANNEL_INDEX",
        AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE     = "PP_GSN_MAX_SMOOTHING_ANGLE",
        AI_CONFIG_IMPORT_MDL_COLORMAP            = "IMPORT_MDL_COLORMAP",
        AI_CONFIG_PP_RRM_EXCLUDE_LIST            = "PP_RRM_EXCLUDE_LIST",
        AI_CONFIG_PP_PTV_KEEP_HIERARCHY          = "PP_PTV_KEEP_HIERARCHY",
        AI_CONFIG_PP_PTV_NORMALIZE               = "PP_PTV_NORMALIZE",
        AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION = "PP_PTV_ADD_ROOT_TRANSFORMATION",
        AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION     = "PP_PTV_ROOT_TRANSFORMATION",
        AI_CONFIG_CHECK_IDENTITY_MATRIX_EPSILON  = "CHECK_IDENTITY_MATRIX_EPSILON",
        AI_CONFIG_PP_FD_REMOVE                   = "PP_FD_REMOVE",
        AI_CONFIG_PP_FD_CHECKAREA                = "PP_FD_CHECKAREA",
        AI_CONFIG_PP_OG_EXCLUDE_LIST             = "PP_OG_EXCLUDE_LIST",
        AI_CONFIG_PP_SLM_TRIANGLE_LIMIT          = "PP_SLM_TRIANGLE_LIMIT",
        AI_CONFIG_PP_SLM_VERTEX_LIMIT            = "PP_SLM_VERTEX_LIMIT",
        AI_CONFIG_PP_LBW_MAX_WEIGHTS             = "PP_LBW_MAX_WEIGHTS",
        AI_CONFIG_PP_DB_THRESHOLD                = "PP_DB_THRESHOLD",
        AI_CONFIG_PP_DB_ALL_OR_NONE              = "PP_DB_ALL_OR_NONE",
        AI_CONFIG_PP_ICL_PTCACHE_SIZE            = "PP_ICL_PTCACHE_SIZE",
        AI_CONFIG_PP_RVC_FLAGS                   = "PP_RVC_FLAGS",
        AI_CONFIG_PP_SBP_REMOVE                  = "PP_SBP_REMOVE",
        AI_CONFIG_PP_FID_ANIM_ACCURACY           = "PP_FID_ANIM_ACCURACY",
        AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS    = "PP_FID_IGNORE_TEXTURECOORDS",
        AI_CONFIG_PP_TUV_EVALUATE                = "PP_TUV_EVALUATE",
        AI_CONFIG_FAVOUR_SPEED                   = "FAVOUR_SPEED";

    public static final String
        AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER            = "IMPORT_SCHEMA_DOCUMENT_PROVIDER",
        AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS        = "IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS",
        AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS              = "IMPORT_FBX_READ_ALL_MATERIALS",
        AI_CONFIG_IMPORT_FBX_READ_MATERIALS                  = "IMPORT_FBX_READ_MATERIALS",
        AI_CONFIG_IMPORT_FBX_READ_TEXTURES                   = "IMPORT_FBX_READ_TEXTURES",
        AI_CONFIG_IMPORT_FBX_READ_CAMERAS                    = "IMPORT_FBX_READ_CAMERAS",
        AI_CONFIG_IMPORT_FBX_READ_LIGHTS                     = "IMPORT_FBX_READ_LIGHTS",
        AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS                 = "IMPORT_FBX_READ_ANIMATIONS",
        AI_CONFIG_IMPORT_FBX_READ_WEIGHTS                    = "IMPORT_FBX_READ_WEIGHTS",
        AI_CONFIG_IMPORT_FBX_STRICT_MODE                     = "IMPORT_FBX_STRICT_MODE",
        AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS                 = "IMPORT_FBX_PRESERVE_PIVOTS",
        AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES = "IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES",
        AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING = "AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING",
        AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES                  = "AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES",
        AI_CONFIG_FBX_CONVERT_TO_M                           = "AI_CONFIG_FBX_CONVERT_TO_M",
        AI_CONFIG_IMPORT_FBX_IGNORE_UP_DIRECTION             = "AI_CONFIG_IMPORT_FBX_IGNORE_UP_DIRECTION",
        AI_CONFIG_FBX_USE_SKELETON_BONE_CONTAINER            = "AI_CONFIG_FBX_USE_SKELETON_BONE_CONTAINER",
        AI_CONFIG_IMPORT_GLOBAL_KEYFRAME                     = "IMPORT_GLOBAL_KEYFRAME",
        AI_CONFIG_IMPORT_MD3_KEYFRAME                        = "IMPORT_MD3_KEYFRAME",
        AI_CONFIG_IMPORT_MD2_KEYFRAME                        = "IMPORT_MD2_KEYFRAME",
        AI_CONFIG_IMPORT_MDL_KEYFRAME                        = "IMPORT_MDL_KEYFRAME",
        AI_CONFIG_IMPORT_MDC_KEYFRAME                        = "IMPORT_MDC_KEYFRAME",
        AI_CONFIG_IMPORT_SMD_KEYFRAME                        = "IMPORT_SMD_KEYFRAME",
        AI_CONFIG_IMPORT_UNREAL_KEYFRAME                     = "IMPORT_UNREAL_KEYFRAME",
        AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS             = "IMPORT_MDL_HL1_READ_ANIMATIONS",
        AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS       = "IMPORT_MDL_HL1_READ_ANIMATION_EVENTS",
        AI_CONFIG_IMPORT_MDL_HL1_TRANSFORM_COORD_SYSTEM      = "TRANSFORM COORDSYSTEM FOR HS! MODELS",
        AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS      = "IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS",
        AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS   = "IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS",
        AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS            = "IMPORT_MDL_HL1_READ_ATTACHMENTS",
        AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS       = "IMPORT_MDL_HL1_READ_BONE_CONTROLLERS",
        AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES               = "IMPORT_MDL_HL1_READ_HITBOXES",
        AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO       = "IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO",
        AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST             = "IMPORT_SMD_LOAD_ANIMATION_LIST",
        AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL                  = "IMPORT_AC_SEPARATE_BFCULL",
        AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION                 = "IMPORT_AC_EVAL_SUBDIVISION",
        AI_CONFIG_UNREAL_HANDLE_FLAGS                        = "UNREAL_HANDLE_FLAGS",
        AI_CONFIG_IMPORT_TER_MAKE_UVS                        = "IMPORT_TER_MAKE_UVS",
        AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS             = "IMPORT_ASE_RECONSTRUCT_NORMALS",
        AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART                = "IMPORT_MD3_HANDLE_MULTIPART",
        AI_CONFIG_IMPORT_MD3_SKIN_NAME                       = "IMPORT_MD3_SKIN_NAME",
        AI_CONFIG_IMPORT_MD3_LOAD_SHADERS                    = "IMPORT_MD3_LOAD_SHADERS",
        AI_CONFIG_IMPORT_MD3_SHADER_SRC                      = "IMPORT_MD3_SHADER_SRC",
        AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY                  = "IMPORT_LWO_ONE_LAYER_ONLY",
        AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD                = "IMPORT_MD5_NO_ANIM_AUTOLOAD",
        AI_CONFIG_IMPORT_LWS_ANIM_START                      = "IMPORT_LWS_ANIM_START",
        AI_CONFIG_IMPORT_LWS_ANIM_END                        = "IMPORT_LWS_ANIM_END",
        AI_CONFIG_IMPORT_IRR_ANIM_FPS                        = "IMPORT_IRR_ANIM_FPS",
        AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE                  = "IMPORT_OGRE_MATERIAL_FILE",
        AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME      = "IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME",
        AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS      = "IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS",
        AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT         = "AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT",
        AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS      = "IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS",
        AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION            = "IMPORT_IFC_CUSTOM_TRIANGULATION",
        AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE                 = "IMPORT_IFC_SMOOTHING_ANGLE",
        AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION        = "IMPORT_IFC_CYLINDRICAL_TESSELLATION",
        AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION         = "IMPORT_COLLADA_IGNORE_UP_DIRECTION",
        AI_CONFIG_IMPORT_COLLADA_IGNORE_UNIT_SIZE            = "IMPORT_COLLADA_IGNORE_UNIT_SIZE",
        AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES           = "IMPORT_COLLADA_USE_COLLADA_NAMES";

    public static final String
        AI_CONFIG_EXPORT_XFILE_64BIT                              = "EXPORT_XFILE_64BIT",
        AI_CONFIG_EXPORT_POINT_CLOUDS                             = "EXPORT_POINT_CLOUDS",
        AI_CONFIG_USE_GLTF_PBR_SPECULAR_GLOSSINESS                = "USE_GLTF_PBR_SPECULAR_GLOSSINESS",
        AI_CONFIG_EXPORT_GLTF_UNLIMITED_SKINNING_BONES_PER_VERTEX = "USE_UNLIMITED_BONES_PER VERTEX",
        AI_CONFIG_EXPORT_FBX_TRANSPARENCY_FACTOR_REFER_TO_OPACITY = "EXPORT_FBX_TRANSPARENCY_FACTOR_REFER_TO_OPACITY VERTEX",
        AI_CONFIG_EXPORT_BLOB_NAME                                = "EXPORT_BLOB_NAME",
        AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY                         = "GLOBAL_SCALE_FACTOR",
        AI_CONFIG_APP_SCALE_KEY                                   = "APP_SCALE_FACTOR";

    public static final int
        AI_SBBC_DEFAULT_MAX_BONES                      = 0x3C,
        AI_SLM_DEFAULT_MAX_TRIANGLES                   = 0xF4240,
        AI_SLM_DEFAULT_MAX_VERTICES                    = 0xF4240,
        AI_LBW_MAX_WEIGHTS                             = 0x4,
        PP_ICL_PTCACHE_SIZE                            = 0xC,
        AI_IMPORT_IFC_DEFAULT_CYLINDRICAL_TESSELLATION = 0x20;

    public static final float
        AI_DEBONE_THRESHOLD                   = 1.0f,
        AI_IMPORT_IFC_DEFAULT_SMOOTHING_ANGLE = 10.0f,
        AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT = 1.0f,
        AI_CONFIG_APP_SCALE_DEFAULT           = 1.0f;

    public static final int
        AI_UVTRAFO_SCALING     = 0x1,
        AI_UVTRAFO_ROTATION    = 0x2,
        AI_UVTRAFO_TRANSLATION = 0x4,
        AI_UVTRAFO_ALL         = (AI_UVTRAFO_SCALING | AI_UVTRAFO_ROTATION | AI_UVTRAFO_TRANSLATION);

    public static final int
        aiComponent_NORMALS                 = 0x2,
        aiComponent_TANGENTS_AND_BITANGENTS = 0x4,
        aiComponent_COLORS                  = 0x8,
        aiComponent_TEXCOORDS               = 0x10,
        aiComponent_BONEWEIGHTS             = 0x20,
        aiComponent_ANIMATIONS              = 0x40,
        aiComponent_TEXTURES                = 0x80,
        aiComponent_LIGHTS                  = 0x100,
        aiComponent_CAMERAS                 = 0x200,
        aiComponent_MESHES                  = 0x400,
        aiComponent_MATERIALS               = 0x800;

    public static final double
        AI_MATH_PI      = 3.141592653589793d,
        AI_MATH_TWO_PI  = AI_MATH_PI * 2.0,
        AI_MATH_HALF_PI = AI_MATH_PI * 0.5;

    public static final float
        AI_MATH_PI_F      = 3.1415927f,
        AI_MATH_TWO_PI_F  = AI_MATH_PI_F * 2f,
        AI_MATH_HALF_PI_F = AI_MATH_PI_F * 0f;

    public static final float ai_epsilon = 0.00001f;

    public static final int MAXLEN = 0x400;

    public static final int
        aiReturn_SUCCESS     = 0x0,
        aiReturn_FAILURE     = 0xFFFFFFFF,
        aiReturn_OUTOFMEMORY = 0xFFFFFFFD;

    public static final int
        aiOrigin_SET = 0x0,
        aiOrigin_CUR = 0x1,
        aiOrigin_END = 0x2;

    public static final int
        aiDefaultLogStream_FILE     = 0x1,
        aiDefaultLogStream_STDOUT   = 0x2,
        aiDefaultLogStream_STDERR   = 0x4,
        aiDefaultLogStream_DEBUGGER = 0x8;

    public static final int
        aiAnimInterpolation_Step             = 0,
        aiAnimInterpolation_Linear           = 1,
        aiAnimInterpolation_Spherical_Linear = 2,
        aiAnimInterpolation_Cubic_Spline     = 3;

    public static final int
        aiAnimBehaviour_DEFAULT  = 0x0,
        aiAnimBehaviour_CONSTANT = 0x1,
        aiAnimBehaviour_LINEAR   = 0x2,
        aiAnimBehaviour_REPEAT   = 0x3;

    public static final int
        AI_TRUE  = 0x1,
        AI_FALSE = 0x0;

    public static final int
        aiImporterFlags_SupportTextFlavour       = 0x1,
        aiImporterFlags_SupportBinaryFlavour     = 0x2,
        aiImporterFlags_SupportCompressedFlavour = 0x4,
        aiImporterFlags_LimitedSupport           = 0x8,
        aiImporterFlags_Experimental             = 0x10;

    public static final int
        aiLightSource_UNDEFINED   = 0x0,
        aiLightSource_DIRECTIONAL = 0x1,
        aiLightSource_POINT       = 0x2,
        aiLightSource_SPOT        = 0x3,
        aiLightSource_AMBIENT     = 0x4,
        aiLightSource_AREA        = 0x5;

    public static final String AI_DEFAULT_MATERIAL_NAME = "DefaultMaterial";

    public static final int
        aiTextureOp_Multiply  = 0x0,
        aiTextureOp_Add       = 0x1,
        aiTextureOp_Subtract  = 0x2,
        aiTextureOp_Divide    = 0x3,
        aiTextureOp_SmoothAdd = 0x4,
        aiTextureOp_SignedAdd = 0x5;

    public static final int
        aiTextureMapMode_Wrap   = 0x0,
        aiTextureMapMode_Clamp  = 0x1,
        aiTextureMapMode_Decal  = 0x3,
        aiTextureMapMode_Mirror = 0x2;

    public static final int
        aiTextureMapping_UV       = 0x0,
        aiTextureMapping_SPHERE   = 0x1,
        aiTextureMapping_CYLINDER = 0x2,
        aiTextureMapping_BOX      = 0x3,
        aiTextureMapping_PLANE    = 0x4,
        aiTextureMapping_OTHER    = 0x5;

    public static final int
        aiTextureType_NONE                    = 0,
        aiTextureType_DIFFUSE                 = 1,
        aiTextureType_SPECULAR                = 2,
        aiTextureType_AMBIENT                 = 3,
        aiTextureType_EMISSIVE                = 4,
        aiTextureType_HEIGHT                  = 5,
        aiTextureType_NORMALS                 = 6,
        aiTextureType_SHININESS               = 7,
        aiTextureType_OPACITY                 = 8,
        aiTextureType_DISPLACEMENT            = 9,
        aiTextureType_LIGHTMAP                = 10,
        aiTextureType_REFLECTION              = 11,
        aiTextureType_BASE_COLOR              = 12,
        aiTextureType_NORMAL_CAMERA           = 13,
        aiTextureType_EMISSION_COLOR          = 14,
        aiTextureType_METALNESS               = 15,
        aiTextureType_DIFFUSE_ROUGHNESS       = 16,
        aiTextureType_AMBIENT_OCCLUSION       = 17,
        aiTextureType_UNKNOWN                 = 18,
        aiTextureType_SHEEN                   = 19,
        aiTextureType_CLEARCOAT               = 20,
        aiTextureType_TRANSMISSION            = 21,
        aiTextureType_MAYA_BASE               = 22,
        aiTextureType_MAYA_SPECULAR           = 23,
        aiTextureType_MAYA_SPECULAR_COLOR     = 24,
        aiTextureType_MAYA_SPECULAR_ROUGHNESS = 25;

    public static final int
        aiShadingMode_Flat         = 0x1,
        aiShadingMode_Gouraud      = 0x2,
        aiShadingMode_Phong        = 0x3,
        aiShadingMode_Blinn        = 0x4,
        aiShadingMode_Toon         = 0x5,
        aiShadingMode_OrenNayar    = 0x6,
        aiShadingMode_Minnaert     = 0x7,
        aiShadingMode_CookTorrance = 0x8,
        aiShadingMode_NoShading    = 0x9,
        aiShadingMode_Unlit        = aiShadingMode_NoShading,
        aiShadingMode_Fresnel      = 0xA,
        aiShadingMode_PBR_BRDF     = 0xB;

    public static final int
        aiTextureFlags_Invert      = 0x1,
        aiTextureFlags_UseAlpha    = 0x2,
        aiTextureFlags_IgnoreAlpha = 0x2;

    public static final int
        aiBlendMode_Default  = 0x0,
        aiBlendMode_Additive = 0x1;

    public static final int
        aiPTI_Float   = 0x1,
        aiPTI_Double  = 0x2,
        aiPTI_String  = 0x3,
        aiPTI_Integer = 0x4,
        aiPTI_Buffer  = 0x5;

    public static final String
        AI_MATKEY_NAME                        = "?mat.name",
        AI_MATKEY_TWOSIDED                    = "$mat.twosided",
        AI_MATKEY_SHADING_MODEL               = "$mat.shadingm",
        AI_MATKEY_ENABLE_WIREFRAME            = "$mat.wireframe",
        AI_MATKEY_BLEND_FUNC                  = "$mat.blend",
        AI_MATKEY_OPACITY                     = "$mat.opacity",
        AI_MATKEY_TRANSPARENCYFACTOR          = "$mat.transparencyfactor",
        AI_MATKEY_BUMPSCALING                 = "$mat.bumpscaling",
        AI_MATKEY_SHININESS                   = "$mat.shininess",
        AI_MATKEY_REFLECTIVITY                = "$mat.reflectivity",
        AI_MATKEY_SHININESS_STRENGTH          = "$mat.shinpercent",
        AI_MATKEY_REFRACTI                    = "$mat.refracti",
        AI_MATKEY_COLOR_DIFFUSE               = "$clr.diffuse",
        AI_MATKEY_COLOR_AMBIENT               = "$clr.ambient",
        AI_MATKEY_COLOR_SPECULAR              = "$clr.specular",
        AI_MATKEY_COLOR_EMISSIVE              = "$clr.emissive",
        AI_MATKEY_COLOR_TRANSPARENT           = "$clr.transparent",
        AI_MATKEY_COLOR_REFLECTIVE            = "$clr.reflective",
        AI_MATKEY_GLOBAL_BACKGROUND_IMAGE     = "?bg.global",
        AI_MATKEY_GLOBAL_SHADERLANG           = "?sh.lang",
        AI_MATKEY_SHADER_VERTEX               = "?sh.vs",
        AI_MATKEY_SHADER_FRAGMENT             = "?sh.fs",
        AI_MATKEY_SHADER_GEO                  = "?sh.gs",
        AI_MATKEY_SHADER_TESSELATION          = "?sh.ts",
        AI_MATKEY_SHADER_PRIMITIVE            = "?sh.ps",
        AI_MATKEY_SHADER_COMPUTE              = "?sh.cs",
        AI_MATKEY_USE_COLOR_MAP               = "$mat.useColorMap",
        AI_MATKEY_BASE_COLOR                  = "$clr.base",
        AI_MATKEY_USE_METALLIC_MAP            = "$mat.useMetallicMap",
        AI_MATKEY_METALLIC_FACTOR             = "$mat.metallicFactor",
        AI_MATKEY_USE_ROUGHNESS_MAP           = "$mat.useRoughnessMap",
        AI_MATKEY_ROUGHNESS_FACTOR            = "$mat.roughnessFactor",
        AI_MATKEY_ANISOTROPY_FACTOR           = "$mat.anisotropyFactor",
        AI_MATKEY_SPECULAR_FACTOR             = "$mat.specularFactor",
        AI_MATKEY_GLOSSINESS_FACTOR           = "$mat.glossinessFactor",
        AI_MATKEY_SHEEN_COLOR_FACTOR          = "$clr.sheen.factor",
        AI_MATKEY_SHEEN_ROUGHNESS_FACTOR      = "$mat.sheen.roughnessFactor",
        AI_MATKEY_CLEARCOAT_FACTOR            = "$mat.clearcoat.factor",
        AI_MATKEY_CLEARCOAT_ROUGHNESS_FACTOR  = "$mat.clearcoat.roughnessFactor",
        AI_MATKEY_TRANSMISSION_FACTOR         = "$mat.transmission.factor",
        AI_MATKEY_VOLUME_THICKNESS_FACTOR     = "$mat.volume.thicknessFactor",
        AI_MATKEY_VOLUME_ATTENUATION_DISTANCE = "$mat.volume.attenuationDistance",
        AI_MATKEY_VOLUME_ATTENUATION_COLOR    = "$mat.volume.attenuationColor",
        AI_MATKEY_USE_EMISSIVE_MAP            = "$mat.useEmissiveMap",
        AI_MATKEY_EMISSIVE_INTENSITY          = "$mat.emissiveIntensity",
        AI_MATKEY_USE_AO_MAP                  = "$mat.useAOMap",
        AI_MATKEY_OBJ_ILLUM                   = "$mat.illum",
        _AI_MATKEY_TEXTURE_BASE               = "$tex.file",
        _AI_MATKEY_UVWSRC_BASE                = "$tex.uvwsrc",
        _AI_MATKEY_TEXOP_BASE                 = "$tex.op",
        _AI_MATKEY_MAPPING_BASE               = "$tex.mapping",
        _AI_MATKEY_TEXBLEND_BASE              = "$tex.blend",
        _AI_MATKEY_MAPPINGMODE_U_BASE         = "$tex.mapmodeu",
        _AI_MATKEY_MAPPINGMODE_V_BASE         = "$tex.mapmodev",
        _AI_MATKEY_TEXMAP_AXIS_BASE           = "$tex.mapaxis",
        _AI_MATKEY_UVTRANSFORM_BASE           = "$tex.uvtrafo",
        _AI_MATKEY_TEXFLAGS_BASE              = "$tex.flags",
        _AI_MATKEY_OBJ_BUMPMULT_BASE          = "$tex.bumpmult";

    public static final int AI_MATKEY_GLTF_PBRMETALLICROUGHNESS_METALLICROUGHNESS_TEXTURE = aiTextureType_UNKNOWN;

    public static final String
        AI_MATKEY_GLTF_ALPHAMODE               = "$mat.gltf.alphaMode",
        AI_MATKEY_GLTF_ALPHACUTOFF             = "$mat.gltf.alphaCutoff",
        _AI_MATKEY_GLTF_MAPPINGNAME_BASE       = "$tex.mappingname",
        _AI_MATKEY_GLTF_MAPPINGID_BASE         = "$tex.mappingid",
        _AI_MATKEY_GLTF_MAPPINGFILTER_MAG_BASE = "$tex.mappingfiltermag",
        _AI_MATKEY_GLTF_MAPPINGFILTER_MIN_BASE = "$tex.mappingfiltermin",
        _AI_MATKEY_GLTF_SCALE_BASE             = "$tex.scale",
        _AI_MATKEY_GLTF_STRENGTH_BASE          = "$tex.strength";

    public static final int
        AI_MAX_FACE_INDICES            = 0x7FFF,
        AI_MAX_BONE_WEIGHTS            = 0x7FFFFFFF,
        AI_MAX_VERTICES                = 0x7FFFFFFF,
        AI_MAX_FACES                   = 0x7FFFFFFF,
        AI_MAX_NUMBER_OF_COLOR_SETS    = 0x8,
        AI_MAX_NUMBER_OF_TEXTURECOORDS = 0x8;

    public static final int
        aiPrimitiveType_POINT            = 0x1,
        aiPrimitiveType_LINE             = 0x2,
        aiPrimitiveType_TRIANGLE         = 0x4,
        aiPrimitiveType_POLYGON          = 0x8,
        aiPrimitiveType_NGONEncodingFlag = 0x10;

    public static final int
        aiMorphingMethod_UNKNOWN          = 0x0,
        aiMorphingMethod_VERTEX_BLEND     = 0x1,
        aiMorphingMethod_MORPH_NORMALIZED = 0x2,
        aiMorphingMethod_MORPH_RELATIVE   = 0x3;

    public static final int
        AI_BOOL       = 0,
        AI_INT32      = 1,
        AI_UINT64     = 2,
        AI_FLOAT      = 3,
        AI_DOUBLE     = 4,
        AI_AISTRING   = 5,
        AI_AIVECTOR3D = 6,
        AI_AIMETADATA = 7,
        AI_INT64      = 8,
        AI_UINT32     = 9,
        AI_META_MAX   = 10;

    public static final String
        AI_METADATA_SOURCE_FORMAT         = "SourceAsset_Format",
        AI_METADATA_SOURCE_FORMAT_VERSION = "SourceAsset_FormatVersion",
        AI_METADATA_SOURCE_GENERATOR      = "SourceAsset_Generator",
        AI_METADATA_SOURCE_COPYRIGHT      = "SourceAsset_Copyright";

    public static final int
        aiProcess_CalcTangentSpace         = 0x1,
        aiProcess_JoinIdenticalVertices    = 0x2,
        aiProcess_MakeLeftHanded           = 0x4,
        aiProcess_Triangulate              = 0x8,
        aiProcess_RemoveComponent          = 0x10,
        aiProcess_GenNormals               = 0x20,
        aiProcess_GenSmoothNormals         = 0x40,
        aiProcess_SplitLargeMeshes         = 0x80,
        aiProcess_PreTransformVertices     = 0x100,
        aiProcess_LimitBoneWeights         = 0x200,
        aiProcess_ValidateDataStructure    = 0x400,
        aiProcess_ImproveCacheLocality     = 0x800,
        aiProcess_RemoveRedundantMaterials = 0x1000,
        aiProcess_FixInfacingNormals       = 0x2000,
        aiProcess_PopulateArmatureData     = 0x4000,
        aiProcess_SortByPType              = 0x8000,
        aiProcess_FindDegenerates          = 0x10000,
        aiProcess_FindInvalidData          = 0x20000,
        aiProcess_GenUVCoords              = 0x40000,
        aiProcess_TransformUVCoords        = 0x80000,
        aiProcess_FindInstances            = 0x100000,
        aiProcess_OptimizeMeshes           = 0x200000,
        aiProcess_OptimizeGraph            = 0x400000,
        aiProcess_FlipUVs                  = 0x800000,
        aiProcess_FlipWindingOrder         = 0x1000000,
        aiProcess_SplitByBoneCount         = 0x2000000,
        aiProcess_Debone                   = 0x4000000,
        aiProcess_GlobalScale              = 0x8000000,
        aiProcess_EmbedTextures            = 0x10000000,
        aiProcess_ForceGenNormals          = 0x20000000,
        aiProcess_DropNormals              = 0x40000000,
        aiProcess_GenBoundingBoxes         = 0x80000000;

    public static final int
        aiProcess_ConvertToLeftHanded             = 
            aiProcess_MakeLeftHanded   |
            aiProcess_FlipUVs          |
            aiProcess_FlipWindingOrder |
            0,
        aiProcessPreset_TargetRealtime_Fast       = 
            aiProcess_CalcTangentSpace      |
            aiProcess_GenNormals            |
            aiProcess_JoinIdenticalVertices |
            aiProcess_Triangulate           |
            aiProcess_GenUVCoords           |
            aiProcess_SortByPType           |
            0,
        aiProcessPreset_TargetRealtime_Quality    = 
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
            0,
        aiProcessPreset_TargetRealtime_MaxQuality = 
            aiProcessPreset_TargetRealtime_Quality |
            aiProcess_FindInstances                |
            aiProcess_FindInvalidData              |
            aiProcess_OptimizeMeshes               |
            0;

    public static final int
        AI_SCENE_FLAGS_INCOMPLETE         = 0x1,
        AI_SCENE_FLAGS_VALIDATED          = 0x2,
        AI_SCENE_FLAGS_VALIDATION_WARNING = 0x4,
        AI_SCENE_FLAGS_NON_VERBOSE_FORMAT = 0x8,
        AI_SCENE_FLAGS_TERRAIN            = 0x10;

    public static final int
        ASSIMP_CFLAGS_SHARED         = 0x1,
        ASSIMP_CFLAGS_STLPORT        = 0x2,
        ASSIMP_CFLAGS_DEBUG          = 0x4,
        ASSIMP_CFLAGS_NOBOOST        = 0x8,
        ASSIMP_CFLAGS_SINGLETHREADED = 0x10,
        ASSIMP_CFLAGS_DOUBLE_SUPPORT = 0x20;

    protected Assimp() {
        throw new UnsupportedOperationException();
    }

    // --- [ aiComponent_COLORSn ] ---

    /** {@code int aiComponent_COLORSn(int n)} */
    public static int aiComponent_COLORSn(int n) {
        return 1 << (n + 20);
    }

    // --- [ aiComponent_TEXCOORDSn ] ---

    /** {@code int aiComponent_TEXCOORDSn(int n)} */
    public static int aiComponent_TEXCOORDSn(int n) {
        return 1 << (n + 25);
    }

    // --- [ AI_DEG_TO_RAD ] ---

    /** {@code float AI_DEG_TO_RAD(float x)} */
    public static float AI_DEG_TO_RAD(float x) {
        return (x)*0.0174532925f;
    }

    // --- [ AI_RAD_TO_DEG ] ---

    /** {@code float AI_RAD_TO_DEG(float x)} */
    public static float AI_RAD_TO_DEG(float x) {
        return (x)*57.2957795f;
    }

    // --- [ aiGetExportFormatCount ] ---

    /** {@code size_t aiGetExportFormatCount(void)} */
    @NativeType("size_t")
    public static long aiGetExportFormatCount() {
        long __functionAddress = Functions.GetExportFormatCount;
        return invokeP(__functionAddress);
    }

    // --- [ aiGetExportFormatDescription ] ---

    /** {@code struct aiExportFormatDesc * aiGetExportFormatDescription(size_t pIndex)} */
    public static long naiGetExportFormatDescription(long pIndex) {
        long __functionAddress = Functions.GetExportFormatDescription;
        return invokePP(pIndex, __functionAddress);
    }

    /** {@code struct aiExportFormatDesc * aiGetExportFormatDescription(size_t pIndex)} */
    @NativeType("struct aiExportFormatDesc *")
    public static @Nullable AIExportFormatDesc aiGetExportFormatDescription(@NativeType("size_t") long pIndex) {
        long __result = naiGetExportFormatDescription(pIndex);
        return AIExportFormatDesc.createSafe(__result);
    }

    // --- [ aiReleaseExportFormatDescription ] ---

    /** {@code void aiReleaseExportFormatDescription(struct aiExportFormatDesc const * desc)} */
    public static void naiReleaseExportFormatDescription(long desc) {
        long __functionAddress = Functions.ReleaseExportFormatDescription;
        if (CHECKS) {
            AIExportFormatDesc.validate(desc);
        }
        invokePV(desc, __functionAddress);
    }

    /** {@code void aiReleaseExportFormatDescription(struct aiExportFormatDesc const * desc)} */
    public static void aiReleaseExportFormatDescription(@NativeType("struct aiExportFormatDesc const *") AIExportFormatDesc desc) {
        naiReleaseExportFormatDescription(desc.address());
    }

    // --- [ aiCopyScene ] ---

    /** {@code void aiCopyScene(struct aiScene const * pIn, struct aiScene ** pOut)} */
    public static void naiCopyScene(long pIn, long pOut) {
        long __functionAddress = Functions.CopyScene;
        if (CHECKS) {
            AIScene.validate(pIn);
        }
        invokePPV(pIn, pOut, __functionAddress);
    }

    /** {@code void aiCopyScene(struct aiScene const * pIn, struct aiScene ** pOut)} */
    public static void aiCopyScene(@NativeType("struct aiScene const *") AIScene pIn, @NativeType("struct aiScene **") PointerBuffer pOut) {
        if (CHECKS) {
            check(pOut, 1);
        }
        naiCopyScene(pIn.address(), memAddress(pOut));
    }

    /** {@code void aiCopyScene(struct aiScene const * pIn, struct aiScene ** pOut)} */
    @NativeType("void")
    public static @Nullable AIScene aiCopyScene(@NativeType("struct aiScene const *") AIScene pIn) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer pOut = stack.callocPointer(1);
            naiCopyScene(pIn.address(), memAddress(pOut));
            return AIScene.createSafe(pOut.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiFreeScene ] ---

    /** {@code void aiFreeScene(struct aiScene const * pIn)} */
    public static void naiFreeScene(long pIn) {
        long __functionAddress = Functions.FreeScene;
        if (CHECKS) {
            AIScene.validate(pIn);
        }
        invokePV(pIn, __functionAddress);
    }

    /** {@code void aiFreeScene(struct aiScene const * pIn)} */
    public static void aiFreeScene(@NativeType("struct aiScene const *") AIScene pIn) {
        naiFreeScene(pIn.address());
    }

    // --- [ aiExportScene ] ---

    /** {@code aiReturn aiExportScene(struct aiScene const * pScene, char const * pFormatId, char const * pFileName, unsigned int pPreProcessing)} */
    public static int naiExportScene(long pScene, long pFormatId, long pFileName, int pPreProcessing) {
        long __functionAddress = Functions.ExportScene;
        if (CHECKS) {
            AIScene.validate(pScene);
        }
        return invokePPPI(pScene, pFormatId, pFileName, pPreProcessing, __functionAddress);
    }

    /** {@code aiReturn aiExportScene(struct aiScene const * pScene, char const * pFormatId, char const * pFileName, unsigned int pPreProcessing)} */
    @NativeType("aiReturn")
    public static int aiExportScene(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") ByteBuffer pFormatId, @NativeType("char const *") ByteBuffer pFileName, @NativeType("unsigned int") int pPreProcessing) {
        if (CHECKS) {
            checkNT1(pFormatId);
            checkNT1(pFileName);
        }
        return naiExportScene(pScene.address(), memAddress(pFormatId), memAddress(pFileName), pPreProcessing);
    }

    /** {@code aiReturn aiExportScene(struct aiScene const * pScene, char const * pFormatId, char const * pFileName, unsigned int pPreProcessing)} */
    @NativeType("aiReturn")
    public static int aiExportScene(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") CharSequence pFormatId, @NativeType("char const *") CharSequence pFileName, @NativeType("unsigned int") int pPreProcessing) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pFormatId, true);
            long pFormatIdEncoded = stack.getPointerAddress();
            stack.nUTF8(pFileName, true);
            long pFileNameEncoded = stack.getPointerAddress();
            return naiExportScene(pScene.address(), pFormatIdEncoded, pFileNameEncoded, pPreProcessing);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiExportSceneEx ] ---

    /** {@code aiReturn aiExportSceneEx(struct aiScene const * pScene, char const * pFormatId, char const * pFileName, struct aiFileIO const * pIO, unsigned int pPreProcessing)} */
    public static int naiExportSceneEx(long pScene, long pFormatId, long pFileName, long pIO, int pPreProcessing) {
        long __functionAddress = Functions.ExportSceneEx;
        if (CHECKS) {
            AIScene.validate(pScene);
            if (pIO != NULL) { AIFileIO.validate(pIO); }
        }
        return invokePPPPI(pScene, pFormatId, pFileName, pIO, pPreProcessing, __functionAddress);
    }

    /** {@code aiReturn aiExportSceneEx(struct aiScene const * pScene, char const * pFormatId, char const * pFileName, struct aiFileIO const * pIO, unsigned int pPreProcessing)} */
    @NativeType("aiReturn")
    public static int aiExportSceneEx(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") ByteBuffer pFormatId, @NativeType("char const *") ByteBuffer pFileName, @NativeType("struct aiFileIO const *") @Nullable AIFileIO pIO, @NativeType("unsigned int") int pPreProcessing) {
        if (CHECKS) {
            checkNT1(pFormatId);
            checkNT1(pFileName);
        }
        return naiExportSceneEx(pScene.address(), memAddress(pFormatId), memAddress(pFileName), memAddressSafe(pIO), pPreProcessing);
    }

    /** {@code aiReturn aiExportSceneEx(struct aiScene const * pScene, char const * pFormatId, char const * pFileName, struct aiFileIO const * pIO, unsigned int pPreProcessing)} */
    @NativeType("aiReturn")
    public static int aiExportSceneEx(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") CharSequence pFormatId, @NativeType("char const *") CharSequence pFileName, @NativeType("struct aiFileIO const *") @Nullable AIFileIO pIO, @NativeType("unsigned int") int pPreProcessing) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pFormatId, true);
            long pFormatIdEncoded = stack.getPointerAddress();
            stack.nUTF8(pFileName, true);
            long pFileNameEncoded = stack.getPointerAddress();
            return naiExportSceneEx(pScene.address(), pFormatIdEncoded, pFileNameEncoded, memAddressSafe(pIO), pPreProcessing);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiExportSceneToBlob ] ---

    /** {@code struct aiExportDataBlob * aiExportSceneToBlob(struct aiScene const * pScene, char const * pFormatId, unsigned int pPreProcessing)} */
    public static long naiExportSceneToBlob(long pScene, long pFormatId, int pPreProcessing) {
        long __functionAddress = Functions.ExportSceneToBlob;
        if (CHECKS) {
            AIScene.validate(pScene);
        }
        return invokePPP(pScene, pFormatId, pPreProcessing, __functionAddress);
    }

    /** {@code struct aiExportDataBlob * aiExportSceneToBlob(struct aiScene const * pScene, char const * pFormatId, unsigned int pPreProcessing)} */
    @NativeType("struct aiExportDataBlob *")
    public static @Nullable AIExportDataBlob aiExportSceneToBlob(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") ByteBuffer pFormatId, @NativeType("unsigned int") int pPreProcessing) {
        if (CHECKS) {
            checkNT1(pFormatId);
        }
        long __result = naiExportSceneToBlob(pScene.address(), memAddress(pFormatId), pPreProcessing);
        return AIExportDataBlob.createSafe(__result);
    }

    /** {@code struct aiExportDataBlob * aiExportSceneToBlob(struct aiScene const * pScene, char const * pFormatId, unsigned int pPreProcessing)} */
    @NativeType("struct aiExportDataBlob *")
    public static @Nullable AIExportDataBlob aiExportSceneToBlob(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") CharSequence pFormatId, @NativeType("unsigned int") int pPreProcessing) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pFormatId, true);
            long pFormatIdEncoded = stack.getPointerAddress();
            long __result = naiExportSceneToBlob(pScene.address(), pFormatIdEncoded, pPreProcessing);
            return AIExportDataBlob.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiReleaseExportBlob ] ---

    /** {@code void aiReleaseExportBlob(struct aiExportDataBlob const * pData)} */
    public static void naiReleaseExportBlob(long pData) {
        long __functionAddress = Functions.ReleaseExportBlob;
        if (CHECKS) {
            AIExportDataBlob.validate(pData);
        }
        invokePV(pData, __functionAddress);
    }

    /** {@code void aiReleaseExportBlob(struct aiExportDataBlob const * pData)} */
    public static void aiReleaseExportBlob(@NativeType("struct aiExportDataBlob const *") AIExportDataBlob pData) {
        naiReleaseExportBlob(pData.address());
    }

    // --- [ aiImportFile ] ---

    /** {@code struct aiScene * aiImportFile(char const * pFile, unsigned int pFlags)} */
    public static long naiImportFile(long pFile, int pFlags) {
        long __functionAddress = Functions.ImportFile;
        return invokePP(pFile, pFlags, __functionAddress);
    }

    /** {@code struct aiScene * aiImportFile(char const * pFile, unsigned int pFlags)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFile(@NativeType("char const *") ByteBuffer pFile, @NativeType("unsigned int") int pFlags) {
        if (CHECKS) {
            checkNT1(pFile);
        }
        long __result = naiImportFile(memAddress(pFile), pFlags);
        return AIScene.createSafe(__result);
    }

    /** {@code struct aiScene * aiImportFile(char const * pFile, unsigned int pFlags)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFile(@NativeType("char const *") CharSequence pFile, @NativeType("unsigned int") int pFlags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pFile, true);
            long pFileEncoded = stack.getPointerAddress();
            long __result = naiImportFile(pFileEncoded, pFlags);
            return AIScene.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiImportFileEx ] ---

    /** {@code struct aiScene * aiImportFileEx(char const * pFile, unsigned int pFlags, struct aiFileIO * pFS)} */
    public static long naiImportFileEx(long pFile, int pFlags, long pFS) {
        long __functionAddress = Functions.ImportFileEx;
        if (CHECKS) {
            if (pFS != NULL) { AIFileIO.validate(pFS); }
        }
        return invokePPP(pFile, pFlags, pFS, __functionAddress);
    }

    /** {@code struct aiScene * aiImportFileEx(char const * pFile, unsigned int pFlags, struct aiFileIO * pFS)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFileEx(@NativeType("char const *") ByteBuffer pFile, @NativeType("unsigned int") int pFlags, @NativeType("struct aiFileIO *") @Nullable AIFileIO pFS) {
        if (CHECKS) {
            checkNT1(pFile);
        }
        long __result = naiImportFileEx(memAddress(pFile), pFlags, memAddressSafe(pFS));
        return AIScene.createSafe(__result);
    }

    /** {@code struct aiScene * aiImportFileEx(char const * pFile, unsigned int pFlags, struct aiFileIO * pFS)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFileEx(@NativeType("char const *") CharSequence pFile, @NativeType("unsigned int") int pFlags, @NativeType("struct aiFileIO *") @Nullable AIFileIO pFS) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pFile, true);
            long pFileEncoded = stack.getPointerAddress();
            long __result = naiImportFileEx(pFileEncoded, pFlags, memAddressSafe(pFS));
            return AIScene.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiImportFileExWithProperties ] ---

    /** {@code struct aiScene * aiImportFileExWithProperties(char const * pFile, unsigned int pFlags, struct aiFileIO * pFS, struct aiPropertyStore const * pProps)} */
    public static long naiImportFileExWithProperties(long pFile, int pFlags, long pFS, long pProps) {
        long __functionAddress = Functions.ImportFileExWithProperties;
        if (CHECKS) {
            if (pFS != NULL) { AIFileIO.validate(pFS); }
        }
        return invokePPPP(pFile, pFlags, pFS, pProps, __functionAddress);
    }

    /** {@code struct aiScene * aiImportFileExWithProperties(char const * pFile, unsigned int pFlags, struct aiFileIO * pFS, struct aiPropertyStore const * pProps)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFileExWithProperties(@NativeType("char const *") ByteBuffer pFile, @NativeType("unsigned int") int pFlags, @NativeType("struct aiFileIO *") @Nullable AIFileIO pFS, @NativeType("struct aiPropertyStore const *") AIPropertyStore pProps) {
        if (CHECKS) {
            checkNT1(pFile);
        }
        long __result = naiImportFileExWithProperties(memAddress(pFile), pFlags, memAddressSafe(pFS), pProps.address());
        return AIScene.createSafe(__result);
    }

    /** {@code struct aiScene * aiImportFileExWithProperties(char const * pFile, unsigned int pFlags, struct aiFileIO * pFS, struct aiPropertyStore const * pProps)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFileExWithProperties(@NativeType("char const *") CharSequence pFile, @NativeType("unsigned int") int pFlags, @NativeType("struct aiFileIO *") @Nullable AIFileIO pFS, @NativeType("struct aiPropertyStore const *") AIPropertyStore pProps) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pFile, true);
            long pFileEncoded = stack.getPointerAddress();
            long __result = naiImportFileExWithProperties(pFileEncoded, pFlags, memAddressSafe(pFS), pProps.address());
            return AIScene.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiImportFileFromMemory ] ---

    /** {@code struct aiScene * aiImportFileFromMemory(char const * pBuffer, unsigned int pLength, unsigned int pFlags, char const * pHint)} */
    public static long naiImportFileFromMemory(long pBuffer, int pLength, int pFlags, long pHint) {
        long __functionAddress = Functions.ImportFileFromMemory;
        return invokePPP(pBuffer, pLength, pFlags, pHint, __functionAddress);
    }

    /** {@code struct aiScene * aiImportFileFromMemory(char const * pBuffer, unsigned int pLength, unsigned int pFlags, char const * pHint)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFileFromMemory(@NativeType("char const *") ByteBuffer pBuffer, @NativeType("unsigned int") int pFlags, @NativeType("char const *") @Nullable ByteBuffer pHint) {
        if (CHECKS) {
            checkNT1Safe(pHint);
        }
        long __result = naiImportFileFromMemory(memAddress(pBuffer), pBuffer.remaining(), pFlags, memAddressSafe(pHint));
        return AIScene.createSafe(__result);
    }

    /** {@code struct aiScene * aiImportFileFromMemory(char const * pBuffer, unsigned int pLength, unsigned int pFlags, char const * pHint)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFileFromMemory(@NativeType("char const *") ByteBuffer pBuffer, @NativeType("unsigned int") int pFlags, @NativeType("char const *") @Nullable CharSequence pHint) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pHint, true);
            long pHintEncoded = pHint == null ? NULL : stack.getPointerAddress();
            long __result = naiImportFileFromMemory(memAddress(pBuffer), pBuffer.remaining(), pFlags, pHintEncoded);
            return AIScene.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiImportFileFromMemoryWithProperties ] ---

    /** {@code struct aiScene * aiImportFileFromMemoryWithProperties(char const * pBuffer, unsigned int pLength, unsigned int pFlags, char const * pHint, struct aiPropertyStore const * pProps)} */
    public static long naiImportFileFromMemoryWithProperties(long pBuffer, int pLength, int pFlags, long pHint, long pProps) {
        long __functionAddress = Functions.ImportFileFromMemoryWithProperties;
        return invokePPPP(pBuffer, pLength, pFlags, pHint, pProps, __functionAddress);
    }

    /** {@code struct aiScene * aiImportFileFromMemoryWithProperties(char const * pBuffer, unsigned int pLength, unsigned int pFlags, char const * pHint, struct aiPropertyStore const * pProps)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFileFromMemoryWithProperties(@NativeType("char const *") ByteBuffer pBuffer, @NativeType("unsigned int") int pFlags, @NativeType("char const *") @Nullable ByteBuffer pHint, @NativeType("struct aiPropertyStore const *") AIPropertyStore pProps) {
        if (CHECKS) {
            checkNT1Safe(pHint);
        }
        long __result = naiImportFileFromMemoryWithProperties(memAddress(pBuffer), pBuffer.remaining(), pFlags, memAddressSafe(pHint), pProps.address());
        return AIScene.createSafe(__result);
    }

    /** {@code struct aiScene * aiImportFileFromMemoryWithProperties(char const * pBuffer, unsigned int pLength, unsigned int pFlags, char const * pHint, struct aiPropertyStore const * pProps)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiImportFileFromMemoryWithProperties(@NativeType("char const *") ByteBuffer pBuffer, @NativeType("unsigned int") int pFlags, @NativeType("char const *") @Nullable CharSequence pHint, @NativeType("struct aiPropertyStore const *") AIPropertyStore pProps) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pHint, true);
            long pHintEncoded = pHint == null ? NULL : stack.getPointerAddress();
            long __result = naiImportFileFromMemoryWithProperties(memAddress(pBuffer), pBuffer.remaining(), pFlags, pHintEncoded, pProps.address());
            return AIScene.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiApplyPostProcessing ] ---

    /** {@code struct aiScene * aiApplyPostProcessing(struct aiScene const * pScene, unsigned int pFlags)} */
    public static long naiApplyPostProcessing(long pScene, int pFlags) {
        long __functionAddress = Functions.ApplyPostProcessing;
        if (CHECKS) {
            AIScene.validate(pScene);
        }
        return invokePP(pScene, pFlags, __functionAddress);
    }

    /** {@code struct aiScene * aiApplyPostProcessing(struct aiScene const * pScene, unsigned int pFlags)} */
    @NativeType("struct aiScene *")
    public static @Nullable AIScene aiApplyPostProcessing(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("unsigned int") int pFlags) {
        long __result = naiApplyPostProcessing(pScene.address(), pFlags);
        return AIScene.createSafe(__result);
    }

    // --- [ aiGetPredefinedLogStream ] ---

    private static final FFICIF aiGetPredefinedLogStreamCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(ffi_type_pointer, ffi_type_pointer),
        ffi_type_uint32, ffi_type_pointer
    );

    /** {@code struct aiLogStream aiGetPredefinedLogStream(aiDefaultLogStream pStreams, char const * file)} */
    public static void naiGetPredefinedLogStream(int pStreams, long file, long __result) {
        long __functionAddress = Functions.GetPredefinedLogStream;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 2);
            memPutAddress(arguments, stack.nint(pStreams));
            memPutAddress(arguments + POINTER_SIZE, stack.npointer(file));

            nffi_call(aiGetPredefinedLogStreamCIF.address(), __functionAddress, __result, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code struct aiLogStream aiGetPredefinedLogStream(aiDefaultLogStream pStreams, char const * file)} */
    @NativeType("struct aiLogStream")
    public static AILogStream aiGetPredefinedLogStream(@NativeType("aiDefaultLogStream") int pStreams, @NativeType("char const *") @Nullable ByteBuffer file, @NativeType("struct aiLogStream") AILogStream __result) {
        if (CHECKS) {
            checkNT1Safe(file);
        }
        naiGetPredefinedLogStream(pStreams, memAddressSafe(file), __result.address());
        return __result;
    }

    /** {@code struct aiLogStream aiGetPredefinedLogStream(aiDefaultLogStream pStreams, char const * file)} */
    @NativeType("struct aiLogStream")
    public static AILogStream aiGetPredefinedLogStream(@NativeType("aiDefaultLogStream") int pStreams, @NativeType("char const *") @Nullable CharSequence file, @NativeType("struct aiLogStream") AILogStream __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(file, true);
            long fileEncoded = file == null ? NULL : stack.getPointerAddress();
            naiGetPredefinedLogStream(pStreams, fileEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiAttachLogStream ] ---

    /** {@code void aiAttachLogStream(struct aiLogStream const * stream)} */
    public static void naiAttachLogStream(long stream) {
        long __functionAddress = Functions.AttachLogStream;
        if (CHECKS) {
            AILogStream.validate(stream);
        }
        invokePV(stream, __functionAddress);
    }

    /** {@code void aiAttachLogStream(struct aiLogStream const * stream)} */
    public static void aiAttachLogStream(@NativeType("struct aiLogStream const *") AILogStream stream) {
        naiAttachLogStream(stream.address());
    }

    // --- [ aiEnableVerboseLogging ] ---

    /** {@code void aiEnableVerboseLogging(aiBool d)} */
    public static void aiEnableVerboseLogging(@NativeType("aiBool") boolean d) {
        long __functionAddress = Functions.EnableVerboseLogging;
        invokeV(d ? 1 : 0, __functionAddress);
    }

    // --- [ aiDetachLogStream ] ---

    /** {@code aiReturn aiDetachLogStream(struct aiLogStream const * stream)} */
    public static int naiDetachLogStream(long stream) {
        long __functionAddress = Functions.DetachLogStream;
        if (CHECKS) {
            AILogStream.validate(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    /** {@code aiReturn aiDetachLogStream(struct aiLogStream const * stream)} */
    @NativeType("aiReturn")
    public static int aiDetachLogStream(@NativeType("struct aiLogStream const *") AILogStream stream) {
        return naiDetachLogStream(stream.address());
    }

    // --- [ aiDetachAllLogStreams ] ---

    /** {@code void aiDetachAllLogStreams(void)} */
    public static void aiDetachAllLogStreams() {
        long __functionAddress = Functions.DetachAllLogStreams;
        invokeV(__functionAddress);
    }

    // --- [ aiReleaseImport ] ---

    /** {@code void aiReleaseImport(struct aiScene const * pScene)} */
    public static void naiReleaseImport(long pScene) {
        long __functionAddress = Functions.ReleaseImport;
        if (CHECKS) {
            if (pScene != NULL) { AIScene.validate(pScene); }
        }
        invokePV(pScene, __functionAddress);
    }

    /** {@code void aiReleaseImport(struct aiScene const * pScene)} */
    public static void aiReleaseImport(@NativeType("struct aiScene const *") @Nullable AIScene pScene) {
        naiReleaseImport(memAddressSafe(pScene));
    }

    // --- [ aiGetErrorString ] ---

    /** {@code char * aiGetErrorString(void)} */
    public static long naiGetErrorString() {
        long __functionAddress = Functions.GetErrorString;
        return invokeP(__functionAddress);
    }

    /** {@code char * aiGetErrorString(void)} */
    @NativeType("char *")
    public static @Nullable String aiGetErrorString() {
        long __result = naiGetErrorString();
        return memUTF8Safe(__result);
    }

    // --- [ aiIsExtensionSupported ] ---

    /** {@code aiBool aiIsExtensionSupported(char const * szExtension)} */
    public static int naiIsExtensionSupported(long szExtension) {
        long __functionAddress = Functions.IsExtensionSupported;
        return invokePI(szExtension, __functionAddress);
    }

    /** {@code aiBool aiIsExtensionSupported(char const * szExtension)} */
    @NativeType("aiBool")
    public static boolean aiIsExtensionSupported(@NativeType("char const *") ByteBuffer szExtension) {
        if (CHECKS) {
            checkNT1(szExtension);
        }
        return naiIsExtensionSupported(memAddress(szExtension)) != 0;
    }

    /** {@code aiBool aiIsExtensionSupported(char const * szExtension)} */
    @NativeType("aiBool")
    public static boolean aiIsExtensionSupported(@NativeType("char const *") CharSequence szExtension) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(szExtension, true);
            long szExtensionEncoded = stack.getPointerAddress();
            return naiIsExtensionSupported(szExtensionEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiGetExtensionList ] ---

    /** {@code void aiGetExtensionList(struct aiString * szOut)} */
    public static void naiGetExtensionList(long szOut) {
        long __functionAddress = Functions.GetExtensionList;
        invokePV(szOut, __functionAddress);
    }

    /** {@code void aiGetExtensionList(struct aiString * szOut)} */
    public static void aiGetExtensionList(@NativeType("struct aiString *") AIString szOut) {
        naiGetExtensionList(szOut.address());
    }

    // --- [ aiGetMemoryRequirements ] ---

    /** {@code void aiGetMemoryRequirements(struct aiScene const * pIn, struct aiMemoryInfo * in)} */
    public static void naiGetMemoryRequirements(long pIn, long in) {
        long __functionAddress = Functions.GetMemoryRequirements;
        if (CHECKS) {
            AIScene.validate(pIn);
        }
        invokePPV(pIn, in, __functionAddress);
    }

    /** {@code void aiGetMemoryRequirements(struct aiScene const * pIn, struct aiMemoryInfo * in)} */
    public static void aiGetMemoryRequirements(@NativeType("struct aiScene const *") AIScene pIn, @NativeType("struct aiMemoryInfo *") AIMemoryInfo in) {
        naiGetMemoryRequirements(pIn.address(), in.address());
    }

    // --- [ aiGetEmbeddedTexture ] ---

    /** {@code struct aiTexture * aiGetEmbeddedTexture(struct aiScene const * pIn, char const * filename)} */
    public static long naiGetEmbeddedTexture(long pIn, long filename) {
        long __functionAddress = Functions.GetEmbeddedTexture;
        if (CHECKS) {
            AIScene.validate(pIn);
        }
        return invokePPP(pIn, filename, __functionAddress);
    }

    /** {@code struct aiTexture * aiGetEmbeddedTexture(struct aiScene const * pIn, char const * filename)} */
    @NativeType("struct aiTexture *")
    public static @Nullable AITexture aiGetEmbeddedTexture(@NativeType("struct aiScene const *") AIScene pIn, @NativeType("char const *") ByteBuffer filename) {
        if (CHECKS) {
            checkNT1(filename);
        }
        long __result = naiGetEmbeddedTexture(pIn.address(), memAddress(filename));
        return AITexture.createSafe(__result);
    }

    /** {@code struct aiTexture * aiGetEmbeddedTexture(struct aiScene const * pIn, char const * filename)} */
    @NativeType("struct aiTexture *")
    public static @Nullable AITexture aiGetEmbeddedTexture(@NativeType("struct aiScene const *") AIScene pIn, @NativeType("char const *") CharSequence filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            long __result = naiGetEmbeddedTexture(pIn.address(), filenameEncoded);
            return AITexture.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiCreatePropertyStore ] ---

    /** {@code struct aiPropertyStore * aiCreatePropertyStore(void)} */
    public static long naiCreatePropertyStore() {
        long __functionAddress = Functions.CreatePropertyStore;
        return invokeP(__functionAddress);
    }

    /** {@code struct aiPropertyStore * aiCreatePropertyStore(void)} */
    @NativeType("struct aiPropertyStore *")
    public static @Nullable AIPropertyStore aiCreatePropertyStore() {
        long __result = naiCreatePropertyStore();
        return AIPropertyStore.createSafe(__result);
    }

    // --- [ aiReleasePropertyStore ] ---

    /** {@code void aiReleasePropertyStore(struct aiPropertyStore * p)} */
    public static void naiReleasePropertyStore(long p) {
        long __functionAddress = Functions.ReleasePropertyStore;
        invokePV(p, __functionAddress);
    }

    /** {@code void aiReleasePropertyStore(struct aiPropertyStore * p)} */
    public static void aiReleasePropertyStore(@NativeType("struct aiPropertyStore *") AIPropertyStore p) {
        naiReleasePropertyStore(p.address());
    }

    // --- [ aiSetImportPropertyInteger ] ---

    /** {@code void aiSetImportPropertyInteger(struct aiPropertyStore * store, char const * szName, int value)} */
    public static void naiSetImportPropertyInteger(long store, long szName, int value) {
        long __functionAddress = Functions.SetImportPropertyInteger;
        invokePPV(store, szName, value, __functionAddress);
    }

    /** {@code void aiSetImportPropertyInteger(struct aiPropertyStore * store, char const * szName, int value)} */
    public static void aiSetImportPropertyInteger(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") ByteBuffer szName, int value) {
        if (CHECKS) {
            checkNT1(szName);
        }
        naiSetImportPropertyInteger(store.address(), memAddress(szName), value);
    }

    /** {@code void aiSetImportPropertyInteger(struct aiPropertyStore * store, char const * szName, int value)} */
    public static void aiSetImportPropertyInteger(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") CharSequence szName, int value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(szName, true);
            long szNameEncoded = stack.getPointerAddress();
            naiSetImportPropertyInteger(store.address(), szNameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiSetImportPropertyFloat ] ---

    /** {@code void aiSetImportPropertyFloat(struct aiPropertyStore * store, char const * szName, float value)} */
    public static void naiSetImportPropertyFloat(long store, long szName, float value) {
        long __functionAddress = Functions.SetImportPropertyFloat;
        invokePPV(store, szName, value, __functionAddress);
    }

    /** {@code void aiSetImportPropertyFloat(struct aiPropertyStore * store, char const * szName, float value)} */
    public static void aiSetImportPropertyFloat(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") ByteBuffer szName, float value) {
        if (CHECKS) {
            checkNT1(szName);
        }
        naiSetImportPropertyFloat(store.address(), memAddress(szName), value);
    }

    /** {@code void aiSetImportPropertyFloat(struct aiPropertyStore * store, char const * szName, float value)} */
    public static void aiSetImportPropertyFloat(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") CharSequence szName, float value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(szName, true);
            long szNameEncoded = stack.getPointerAddress();
            naiSetImportPropertyFloat(store.address(), szNameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiSetImportPropertyString ] ---

    /** {@code void aiSetImportPropertyString(struct aiPropertyStore * store, char const * szName, struct aiString const * value)} */
    public static void naiSetImportPropertyString(long store, long szName, long value) {
        long __functionAddress = Functions.SetImportPropertyString;
        invokePPPV(store, szName, value, __functionAddress);
    }

    /** {@code void aiSetImportPropertyString(struct aiPropertyStore * store, char const * szName, struct aiString const * value)} */
    public static void aiSetImportPropertyString(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") ByteBuffer szName, @NativeType("struct aiString const *") AIString value) {
        if (CHECKS) {
            checkNT1(szName);
        }
        naiSetImportPropertyString(store.address(), memAddress(szName), value.address());
    }

    /** {@code void aiSetImportPropertyString(struct aiPropertyStore * store, char const * szName, struct aiString const * value)} */
    public static void aiSetImportPropertyString(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") CharSequence szName, @NativeType("struct aiString const *") AIString value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(szName, true);
            long szNameEncoded = stack.getPointerAddress();
            naiSetImportPropertyString(store.address(), szNameEncoded, value.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiSetImportPropertyMatrix ] ---

    /** {@code void aiSetImportPropertyMatrix(struct aiPropertyStore * store, char const * szName, struct aiMatrix4x4 const * value)} */
    public static void naiSetImportPropertyMatrix(long store, long szName, long value) {
        long __functionAddress = Functions.SetImportPropertyMatrix;
        invokePPPV(store, szName, value, __functionAddress);
    }

    /** {@code void aiSetImportPropertyMatrix(struct aiPropertyStore * store, char const * szName, struct aiMatrix4x4 const * value)} */
    public static void aiSetImportPropertyMatrix(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") ByteBuffer szName, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 value) {
        if (CHECKS) {
            checkNT1(szName);
        }
        naiSetImportPropertyMatrix(store.address(), memAddress(szName), value.address());
    }

    /** {@code void aiSetImportPropertyMatrix(struct aiPropertyStore * store, char const * szName, struct aiMatrix4x4 const * value)} */
    public static void aiSetImportPropertyMatrix(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") CharSequence szName, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(szName, true);
            long szNameEncoded = stack.getPointerAddress();
            naiSetImportPropertyMatrix(store.address(), szNameEncoded, value.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiCreateQuaternionFromMatrix ] ---

    /** {@code void aiCreateQuaternionFromMatrix(struct aiQuaternion * quat, struct aiMatrix3x3 const * mat)} */
    public static void naiCreateQuaternionFromMatrix(long quat, long mat) {
        long __functionAddress = Functions.CreateQuaternionFromMatrix;
        invokePPV(quat, mat, __functionAddress);
    }

    /** {@code void aiCreateQuaternionFromMatrix(struct aiQuaternion * quat, struct aiMatrix3x3 const * mat)} */
    public static void aiCreateQuaternionFromMatrix(@NativeType("struct aiQuaternion *") AIQuaternion quat, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 mat) {
        naiCreateQuaternionFromMatrix(quat.address(), mat.address());
    }

    // --- [ aiDecomposeMatrix ] ---

    /** {@code void aiDecomposeMatrix(struct aiMatrix4x4 const * mat, struct aiVector3D * scaling, struct aiQuaternion * rotation, struct aiVector3D * position)} */
    public static void naiDecomposeMatrix(long mat, long scaling, long rotation, long position) {
        long __functionAddress = Functions.DecomposeMatrix;
        invokePPPPV(mat, scaling, rotation, position, __functionAddress);
    }

    /** {@code void aiDecomposeMatrix(struct aiMatrix4x4 const * mat, struct aiVector3D * scaling, struct aiQuaternion * rotation, struct aiVector3D * position)} */
    public static void aiDecomposeMatrix(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiVector3D *") AIVector3D scaling, @NativeType("struct aiQuaternion *") AIQuaternion rotation, @NativeType("struct aiVector3D *") AIVector3D position) {
        naiDecomposeMatrix(mat.address(), scaling.address(), rotation.address(), position.address());
    }

    // --- [ aiTransposeMatrix4 ] ---

    /** {@code void aiTransposeMatrix4(struct aiMatrix4x4 * mat)} */
    public static void naiTransposeMatrix4(long mat) {
        long __functionAddress = Functions.TransposeMatrix4;
        invokePV(mat, __functionAddress);
    }

    /** {@code void aiTransposeMatrix4(struct aiMatrix4x4 * mat)} */
    public static void aiTransposeMatrix4(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat) {
        naiTransposeMatrix4(mat.address());
    }

    // --- [ aiTransposeMatrix3 ] ---

    /** {@code void aiTransposeMatrix3(struct aiMatrix3x3 * mat)} */
    public static void naiTransposeMatrix3(long mat) {
        long __functionAddress = Functions.TransposeMatrix3;
        invokePV(mat, __functionAddress);
    }

    /** {@code void aiTransposeMatrix3(struct aiMatrix3x3 * mat)} */
    public static void aiTransposeMatrix3(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat) {
        naiTransposeMatrix3(mat.address());
    }

    // --- [ aiTransformVecByMatrix3 ] ---

    /** {@code void aiTransformVecByMatrix3(struct aiVector3D * vec, struct aiMatrix3x3 const * mat)} */
    public static void naiTransformVecByMatrix3(long vec, long mat) {
        long __functionAddress = Functions.TransformVecByMatrix3;
        invokePPV(vec, mat, __functionAddress);
    }

    /** {@code void aiTransformVecByMatrix3(struct aiVector3D * vec, struct aiMatrix3x3 const * mat)} */
    public static void aiTransformVecByMatrix3(@NativeType("struct aiVector3D *") AIVector3D vec, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 mat) {
        naiTransformVecByMatrix3(vec.address(), mat.address());
    }

    // --- [ aiTransformVecByMatrix4 ] ---

    /** {@code void aiTransformVecByMatrix4(struct aiVector3D * vec, struct aiMatrix4x4 const * mat)} */
    public static void naiTransformVecByMatrix4(long vec, long mat) {
        long __functionAddress = Functions.TransformVecByMatrix4;
        invokePPV(vec, mat, __functionAddress);
    }

    /** {@code void aiTransformVecByMatrix4(struct aiVector3D * vec, struct aiMatrix4x4 const * mat)} */
    public static void aiTransformVecByMatrix4(@NativeType("struct aiVector3D *") AIVector3D vec, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat) {
        naiTransformVecByMatrix4(vec.address(), mat.address());
    }

    // --- [ aiMultiplyMatrix4 ] ---

    /** {@code void aiMultiplyMatrix4(struct aiMatrix4x4 * dst, struct aiMatrix4x4 const * src)} */
    public static void naiMultiplyMatrix4(long dst, long src) {
        long __functionAddress = Functions.MultiplyMatrix4;
        invokePPV(dst, src, __functionAddress);
    }

    /** {@code void aiMultiplyMatrix4(struct aiMatrix4x4 * dst, struct aiMatrix4x4 const * src)} */
    public static void aiMultiplyMatrix4(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 dst, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 src) {
        naiMultiplyMatrix4(dst.address(), src.address());
    }

    // --- [ aiMultiplyMatrix3 ] ---

    /** {@code void aiMultiplyMatrix3(struct aiMatrix3x3 * dst, struct aiMatrix3x3 const * src)} */
    public static void naiMultiplyMatrix3(long dst, long src) {
        long __functionAddress = Functions.MultiplyMatrix3;
        invokePPV(dst, src, __functionAddress);
    }

    /** {@code void aiMultiplyMatrix3(struct aiMatrix3x3 * dst, struct aiMatrix3x3 const * src)} */
    public static void aiMultiplyMatrix3(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 dst, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 src) {
        naiMultiplyMatrix3(dst.address(), src.address());
    }

    // --- [ aiIdentityMatrix3 ] ---

    /** {@code void aiIdentityMatrix3(struct aiMatrix3x3 * mat)} */
    public static void naiIdentityMatrix3(long mat) {
        long __functionAddress = Functions.IdentityMatrix3;
        invokePV(mat, __functionAddress);
    }

    /** {@code void aiIdentityMatrix3(struct aiMatrix3x3 * mat)} */
    public static void aiIdentityMatrix3(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat) {
        naiIdentityMatrix3(mat.address());
    }

    // --- [ aiIdentityMatrix4 ] ---

    /** {@code void aiIdentityMatrix4(struct aiMatrix4x4 * mat)} */
    public static void naiIdentityMatrix4(long mat) {
        long __functionAddress = Functions.IdentityMatrix4;
        invokePV(mat, __functionAddress);
    }

    /** {@code void aiIdentityMatrix4(struct aiMatrix4x4 * mat)} */
    public static void aiIdentityMatrix4(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat) {
        naiIdentityMatrix4(mat.address());
    }

    // --- [ aiGetImportFormatCount ] ---

    /** {@code size_t aiGetImportFormatCount(void)} */
    @NativeType("size_t")
    public static long aiGetImportFormatCount() {
        long __functionAddress = Functions.GetImportFormatCount;
        return invokeP(__functionAddress);
    }

    // --- [ aiGetImportFormatDescription ] ---

    /** {@code struct aiImporterDesc * aiGetImportFormatDescription(size_t pIndex)} */
    public static long naiGetImportFormatDescription(long pIndex) {
        long __functionAddress = Functions.GetImportFormatDescription;
        return invokePP(pIndex, __functionAddress);
    }

    /** {@code struct aiImporterDesc * aiGetImportFormatDescription(size_t pIndex)} */
    @NativeType("struct aiImporterDesc *")
    public static @Nullable AIImporterDesc aiGetImportFormatDescription(@NativeType("size_t") long pIndex) {
        long __result = naiGetImportFormatDescription(pIndex);
        return AIImporterDesc.createSafe(__result);
    }

    // --- [ aiVector2AreEqual ] ---

    /** {@code int aiVector2AreEqual(struct aiVector2D const * a, struct aiVector2D const * b)} */
    public static int naiVector2AreEqual(long a, long b) {
        long __functionAddress = Functions.Vector2AreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /** {@code int aiVector2AreEqual(struct aiVector2D const * a, struct aiVector2D const * b)} */
    @NativeType("int")
    public static boolean aiVector2AreEqual(@NativeType("struct aiVector2D const *") AIVector2D a, @NativeType("struct aiVector2D const *") AIVector2D b) {
        return naiVector2AreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiVector2AreEqualEpsilon ] ---

    /** {@code int aiVector2AreEqualEpsilon(struct aiVector2D const * a, struct aiVector2D const * b, float epsilon)} */
    public static int naiVector2AreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.Vector2AreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /** {@code int aiVector2AreEqualEpsilon(struct aiVector2D const * a, struct aiVector2D const * b, float epsilon)} */
    @NativeType("int")
    public static boolean aiVector2AreEqualEpsilon(@NativeType("struct aiVector2D const *") AIVector2D a, @NativeType("struct aiVector2D const *") AIVector2D b, float epsilon) {
        return naiVector2AreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiVector2Add ] ---

    /** {@code void aiVector2Add(struct aiVector2D * dst, struct aiVector2D const * src)} */
    public static void naiVector2Add(long dst, long src) {
        long __functionAddress = Functions.Vector2Add;
        invokePPV(dst, src, __functionAddress);
    }

    /** {@code void aiVector2Add(struct aiVector2D * dst, struct aiVector2D const * src)} */
    public static void aiVector2Add(@NativeType("struct aiVector2D *") AIVector2D dst, @NativeType("struct aiVector2D const *") AIVector2D src) {
        naiVector2Add(dst.address(), src.address());
    }

    // --- [ aiVector2Subtract ] ---

    /** {@code void aiVector2Subtract(struct aiVector2D * dst, struct aiVector2D const * src)} */
    public static void naiVector2Subtract(long dst, long src) {
        long __functionAddress = Functions.Vector2Subtract;
        invokePPV(dst, src, __functionAddress);
    }

    /** {@code void aiVector2Subtract(struct aiVector2D * dst, struct aiVector2D const * src)} */
    public static void aiVector2Subtract(@NativeType("struct aiVector2D *") AIVector2D dst, @NativeType("struct aiVector2D const *") AIVector2D src) {
        naiVector2Subtract(dst.address(), src.address());
    }

    // --- [ aiVector2Scale ] ---

    /** {@code void aiVector2Scale(struct aiVector2D * dst, float s)} */
    public static void naiVector2Scale(long dst, float s) {
        long __functionAddress = Functions.Vector2Scale;
        invokePV(dst, s, __functionAddress);
    }

    /** {@code void aiVector2Scale(struct aiVector2D * dst, float s)} */
    public static void aiVector2Scale(@NativeType("struct aiVector2D *") AIVector2D dst, float s) {
        naiVector2Scale(dst.address(), s);
    }

    // --- [ aiVector2SymMul ] ---

    /** {@code void aiVector2SymMul(struct aiVector2D * dst, struct aiVector2D const * other)} */
    public static void naiVector2SymMul(long dst, long other) {
        long __functionAddress = Functions.Vector2SymMul;
        invokePPV(dst, other, __functionAddress);
    }

    /** {@code void aiVector2SymMul(struct aiVector2D * dst, struct aiVector2D const * other)} */
    public static void aiVector2SymMul(@NativeType("struct aiVector2D *") AIVector2D dst, @NativeType("struct aiVector2D const *") AIVector2D other) {
        naiVector2SymMul(dst.address(), other.address());
    }

    // --- [ aiVector2DivideByScalar ] ---

    /** {@code void aiVector2DivideByScalar(struct aiVector2D * dst, float s)} */
    public static void naiVector2DivideByScalar(long dst, float s) {
        long __functionAddress = Functions.Vector2DivideByScalar;
        invokePV(dst, s, __functionAddress);
    }

    /** {@code void aiVector2DivideByScalar(struct aiVector2D * dst, float s)} */
    public static void aiVector2DivideByScalar(@NativeType("struct aiVector2D *") AIVector2D dst, float s) {
        naiVector2DivideByScalar(dst.address(), s);
    }

    // --- [ aiVector2DivideByVector ] ---

    /** {@code void aiVector2DivideByVector(struct aiVector2D * dst, struct aiVector2D * v)} */
    public static void naiVector2DivideByVector(long dst, long v) {
        long __functionAddress = Functions.Vector2DivideByVector;
        invokePPV(dst, v, __functionAddress);
    }

    /** {@code void aiVector2DivideByVector(struct aiVector2D * dst, struct aiVector2D * v)} */
    public static void aiVector2DivideByVector(@NativeType("struct aiVector2D *") AIVector2D dst, @NativeType("struct aiVector2D *") AIVector2D v) {
        naiVector2DivideByVector(dst.address(), v.address());
    }

    // --- [ aiVector2Length ] ---

    /** {@code float aiVector2Length(struct aiVector2D const * v)} */
    public static float naiVector2Length(long v) {
        long __functionAddress = Functions.Vector2Length;
        return invokePF(v, __functionAddress);
    }

    /** {@code float aiVector2Length(struct aiVector2D const * v)} */
    public static float aiVector2Length(@NativeType("struct aiVector2D const *") AIVector2D v) {
        return naiVector2Length(v.address());
    }

    // --- [ aiVector2SquareLength ] ---

    /** {@code float aiVector2SquareLength(struct aiVector2D const * v)} */
    public static float naiVector2SquareLength(long v) {
        long __functionAddress = Functions.Vector2SquareLength;
        return invokePF(v, __functionAddress);
    }

    /** {@code float aiVector2SquareLength(struct aiVector2D const * v)} */
    public static float aiVector2SquareLength(@NativeType("struct aiVector2D const *") AIVector2D v) {
        return naiVector2SquareLength(v.address());
    }

    // --- [ aiVector2Negate ] ---

    /** {@code void aiVector2Negate(struct aiVector2D * dst)} */
    public static void naiVector2Negate(long dst) {
        long __functionAddress = Functions.Vector2Negate;
        invokePV(dst, __functionAddress);
    }

    /** {@code void aiVector2Negate(struct aiVector2D * dst)} */
    public static void aiVector2Negate(@NativeType("struct aiVector2D *") AIVector2D dst) {
        naiVector2Negate(dst.address());
    }

    // --- [ aiVector2DotProduct ] ---

    /** {@code float aiVector2DotProduct(struct aiVector2D const * a, struct aiVector2D const * b)} */
    public static float naiVector2DotProduct(long a, long b) {
        long __functionAddress = Functions.Vector2DotProduct;
        return invokePPF(a, b, __functionAddress);
    }

    /** {@code float aiVector2DotProduct(struct aiVector2D const * a, struct aiVector2D const * b)} */
    public static float aiVector2DotProduct(@NativeType("struct aiVector2D const *") AIVector2D a, @NativeType("struct aiVector2D const *") AIVector2D b) {
        return naiVector2DotProduct(a.address(), b.address());
    }

    // --- [ aiVector2Normalize ] ---

    /** {@code void aiVector2Normalize(struct aiVector2D * v)} */
    public static void naiVector2Normalize(long v) {
        long __functionAddress = Functions.Vector2Normalize;
        invokePV(v, __functionAddress);
    }

    /** {@code void aiVector2Normalize(struct aiVector2D * v)} */
    public static void aiVector2Normalize(@NativeType("struct aiVector2D *") AIVector2D v) {
        naiVector2Normalize(v.address());
    }

    // --- [ aiVector3AreEqual ] ---

    /** {@code int aiVector3AreEqual(struct aiVector3D const * a, struct aiVector3D const * b)} */
    public static int naiVector3AreEqual(long a, long b) {
        long __functionAddress = Functions.Vector3AreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /** {@code int aiVector3AreEqual(struct aiVector3D const * a, struct aiVector3D const * b)} */
    @NativeType("int")
    public static boolean aiVector3AreEqual(@NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b) {
        return naiVector3AreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiVector3AreEqualEpsilon ] ---

    /** {@code int aiVector3AreEqualEpsilon(struct aiVector3D const * a, struct aiVector3D const * b, float const epsilon)} */
    public static int naiVector3AreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.Vector3AreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /** {@code int aiVector3AreEqualEpsilon(struct aiVector3D const * a, struct aiVector3D const * b, float const epsilon)} */
    @NativeType("int")
    public static boolean aiVector3AreEqualEpsilon(@NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b, @NativeType("float const") float epsilon) {
        return naiVector3AreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiVector3LessThan ] ---

    /** {@code int aiVector3LessThan(struct aiVector3D const * a, struct aiVector3D const * b)} */
    public static int naiVector3LessThan(long a, long b) {
        long __functionAddress = Functions.Vector3LessThan;
        return invokePPI(a, b, __functionAddress);
    }

    /** {@code int aiVector3LessThan(struct aiVector3D const * a, struct aiVector3D const * b)} */
    @NativeType("int")
    public static boolean aiVector3LessThan(@NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b) {
        return naiVector3LessThan(a.address(), b.address()) != 0;
    }

    // --- [ aiVector3Add ] ---

    /** {@code void aiVector3Add(struct aiVector3D * dst, struct aiVector3D const * src)} */
    public static void naiVector3Add(long dst, long src) {
        long __functionAddress = Functions.Vector3Add;
        invokePPV(dst, src, __functionAddress);
    }

    /** {@code void aiVector3Add(struct aiVector3D * dst, struct aiVector3D const * src)} */
    public static void aiVector3Add(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D const *") AIVector3D src) {
        naiVector3Add(dst.address(), src.address());
    }

    // --- [ aiVector3Subtract ] ---

    /** {@code void aiVector3Subtract(struct aiVector3D * dst, struct aiVector3D const * src)} */
    public static void naiVector3Subtract(long dst, long src) {
        long __functionAddress = Functions.Vector3Subtract;
        invokePPV(dst, src, __functionAddress);
    }

    /** {@code void aiVector3Subtract(struct aiVector3D * dst, struct aiVector3D const * src)} */
    public static void aiVector3Subtract(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D const *") AIVector3D src) {
        naiVector3Subtract(dst.address(), src.address());
    }

    // --- [ aiVector3Scale ] ---

    /** {@code void aiVector3Scale(struct aiVector3D * dst, float const s)} */
    public static void naiVector3Scale(long dst, float s) {
        long __functionAddress = Functions.Vector3Scale;
        invokePV(dst, s, __functionAddress);
    }

    /** {@code void aiVector3Scale(struct aiVector3D * dst, float const s)} */
    public static void aiVector3Scale(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("float const") float s) {
        naiVector3Scale(dst.address(), s);
    }

    // --- [ aiVector3SymMul ] ---

    /** {@code void aiVector3SymMul(struct aiVector3D * dst, struct aiVector3D const * other)} */
    public static void naiVector3SymMul(long dst, long other) {
        long __functionAddress = Functions.Vector3SymMul;
        invokePPV(dst, other, __functionAddress);
    }

    /** {@code void aiVector3SymMul(struct aiVector3D * dst, struct aiVector3D const * other)} */
    public static void aiVector3SymMul(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D const *") AIVector3D other) {
        naiVector3SymMul(dst.address(), other.address());
    }

    // --- [ aiVector3DivideByScalar ] ---

    /** {@code void aiVector3DivideByScalar(struct aiVector3D * dst, float const s)} */
    public static void naiVector3DivideByScalar(long dst, float s) {
        long __functionAddress = Functions.Vector3DivideByScalar;
        invokePV(dst, s, __functionAddress);
    }

    /** {@code void aiVector3DivideByScalar(struct aiVector3D * dst, float const s)} */
    public static void aiVector3DivideByScalar(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("float const") float s) {
        naiVector3DivideByScalar(dst.address(), s);
    }

    // --- [ aiVector3DivideByVector ] ---

    /** {@code void aiVector3DivideByVector(struct aiVector3D * dst, struct aiVector3D * v)} */
    public static void naiVector3DivideByVector(long dst, long v) {
        long __functionAddress = Functions.Vector3DivideByVector;
        invokePPV(dst, v, __functionAddress);
    }

    /** {@code void aiVector3DivideByVector(struct aiVector3D * dst, struct aiVector3D * v)} */
    public static void aiVector3DivideByVector(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D *") AIVector3D v) {
        naiVector3DivideByVector(dst.address(), v.address());
    }

    // --- [ aiVector3Length ] ---

    /** {@code float aiVector3Length(struct aiVector3D const * v)} */
    public static float naiVector3Length(long v) {
        long __functionAddress = Functions.Vector3Length;
        return invokePF(v, __functionAddress);
    }

    /** {@code float aiVector3Length(struct aiVector3D const * v)} */
    public static float aiVector3Length(@NativeType("struct aiVector3D const *") AIVector3D v) {
        return naiVector3Length(v.address());
    }

    // --- [ aiVector3SquareLength ] ---

    /** {@code float aiVector3SquareLength(struct aiVector3D const * v)} */
    public static float naiVector3SquareLength(long v) {
        long __functionAddress = Functions.Vector3SquareLength;
        return invokePF(v, __functionAddress);
    }

    /** {@code float aiVector3SquareLength(struct aiVector3D const * v)} */
    public static float aiVector3SquareLength(@NativeType("struct aiVector3D const *") AIVector3D v) {
        return naiVector3SquareLength(v.address());
    }

    // --- [ aiVector3Negate ] ---

    /** {@code void aiVector3Negate(struct aiVector3D * dst)} */
    public static void naiVector3Negate(long dst) {
        long __functionAddress = Functions.Vector3Negate;
        invokePV(dst, __functionAddress);
    }

    /** {@code void aiVector3Negate(struct aiVector3D * dst)} */
    public static void aiVector3Negate(@NativeType("struct aiVector3D *") AIVector3D dst) {
        naiVector3Negate(dst.address());
    }

    // --- [ aiVector3DotProduct ] ---

    /** {@code float aiVector3DotProduct(struct aiVector3D const * a, struct aiVector3D const * b)} */
    public static float naiVector3DotProduct(long a, long b) {
        long __functionAddress = Functions.Vector3DotProduct;
        return invokePPF(a, b, __functionAddress);
    }

    /** {@code float aiVector3DotProduct(struct aiVector3D const * a, struct aiVector3D const * b)} */
    public static float aiVector3DotProduct(@NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b) {
        return naiVector3DotProduct(a.address(), b.address());
    }

    // --- [ aiVector3CrossProduct ] ---

    /** {@code void aiVector3CrossProduct(struct aiVector3D * dst, struct aiVector3D const * a, struct aiVector3D const * b)} */
    public static void naiVector3CrossProduct(long dst, long a, long b) {
        long __functionAddress = Functions.Vector3CrossProduct;
        invokePPPV(dst, a, b, __functionAddress);
    }

    /** {@code void aiVector3CrossProduct(struct aiVector3D * dst, struct aiVector3D const * a, struct aiVector3D const * b)} */
    public static void aiVector3CrossProduct(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b) {
        naiVector3CrossProduct(dst.address(), a.address(), b.address());
    }

    // --- [ aiVector3Normalize ] ---

    /** {@code void aiVector3Normalize(struct aiVector3D * v)} */
    public static void naiVector3Normalize(long v) {
        long __functionAddress = Functions.Vector3Normalize;
        invokePV(v, __functionAddress);
    }

    /** {@code void aiVector3Normalize(struct aiVector3D * v)} */
    public static void aiVector3Normalize(@NativeType("struct aiVector3D *") AIVector3D v) {
        naiVector3Normalize(v.address());
    }

    // --- [ aiVector3NormalizeSafe ] ---

    /** {@code void aiVector3NormalizeSafe(struct aiVector3D * v)} */
    public static void naiVector3NormalizeSafe(long v) {
        long __functionAddress = Functions.Vector3NormalizeSafe;
        invokePV(v, __functionAddress);
    }

    /** {@code void aiVector3NormalizeSafe(struct aiVector3D * v)} */
    public static void aiVector3NormalizeSafe(@NativeType("struct aiVector3D *") AIVector3D v) {
        naiVector3NormalizeSafe(v.address());
    }

    // --- [ aiVector3RotateByQuaternion ] ---

    /** {@code void aiVector3RotateByQuaternion(struct aiVector3D * v, struct aiQuaternion const * q)} */
    public static void naiVector3RotateByQuaternion(long v, long q) {
        long __functionAddress = Functions.Vector3RotateByQuaternion;
        invokePPV(v, q, __functionAddress);
    }

    /** {@code void aiVector3RotateByQuaternion(struct aiVector3D * v, struct aiQuaternion const * q)} */
    public static void aiVector3RotateByQuaternion(@NativeType("struct aiVector3D *") AIVector3D v, @NativeType("struct aiQuaternion const *") AIQuaternion q) {
        naiVector3RotateByQuaternion(v.address(), q.address());
    }

    // --- [ aiMatrix3FromMatrix4 ] ---

    /** {@code void aiMatrix3FromMatrix4(struct aiMatrix3x3 * dst, struct aiMatrix4x4 const * mat)} */
    public static void naiMatrix3FromMatrix4(long dst, long mat) {
        long __functionAddress = Functions.Matrix3FromMatrix4;
        invokePPV(dst, mat, __functionAddress);
    }

    /** {@code void aiMatrix3FromMatrix4(struct aiMatrix3x3 * dst, struct aiMatrix4x4 const * mat)} */
    public static void aiMatrix3FromMatrix4(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 dst, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat) {
        naiMatrix3FromMatrix4(dst.address(), mat.address());
    }

    // --- [ aiMatrix3FromQuaternion ] ---

    /** {@code void aiMatrix3FromQuaternion(struct aiMatrix3x3 * mat, struct aiQuaternion const * q)} */
    public static void naiMatrix3FromQuaternion(long mat, long q) {
        long __functionAddress = Functions.Matrix3FromQuaternion;
        invokePPV(mat, q, __functionAddress);
    }

    /** {@code void aiMatrix3FromQuaternion(struct aiMatrix3x3 * mat, struct aiQuaternion const * q)} */
    public static void aiMatrix3FromQuaternion(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, @NativeType("struct aiQuaternion const *") AIQuaternion q) {
        naiMatrix3FromQuaternion(mat.address(), q.address());
    }

    // --- [ aiMatrix3AreEqual ] ---

    /** {@code int aiMatrix3AreEqual(struct aiMatrix3x3 const * a, struct aiMatrix3x3 const * b)} */
    public static int naiMatrix3AreEqual(long a, long b) {
        long __functionAddress = Functions.Matrix3AreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /** {@code int aiMatrix3AreEqual(struct aiMatrix3x3 const * a, struct aiMatrix3x3 const * b)} */
    @NativeType("int")
    public static boolean aiMatrix3AreEqual(@NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 a, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 b) {
        return naiMatrix3AreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiMatrix3AreEqualEpsilon ] ---

    /** {@code int aiMatrix3AreEqualEpsilon(struct aiMatrix3x3 const * a, struct aiMatrix3x3 const * b, float const epsilon)} */
    public static int naiMatrix3AreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.Matrix3AreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /** {@code int aiMatrix3AreEqualEpsilon(struct aiMatrix3x3 const * a, struct aiMatrix3x3 const * b, float const epsilon)} */
    @NativeType("int")
    public static boolean aiMatrix3AreEqualEpsilon(@NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 a, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 b, @NativeType("float const") float epsilon) {
        return naiMatrix3AreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiMatrix3Inverse ] ---

    /** {@code void aiMatrix3Inverse(struct aiMatrix3x3 * mat)} */
    public static void naiMatrix3Inverse(long mat) {
        long __functionAddress = Functions.Matrix3Inverse;
        invokePV(mat, __functionAddress);
    }

    /** {@code void aiMatrix3Inverse(struct aiMatrix3x3 * mat)} */
    public static void aiMatrix3Inverse(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat) {
        naiMatrix3Inverse(mat.address());
    }

    // --- [ aiMatrix3Determinant ] ---

    /** {@code float aiMatrix3Determinant(struct aiMatrix3x3 const * mat)} */
    public static float naiMatrix3Determinant(long mat) {
        long __functionAddress = Functions.Matrix3Determinant;
        return invokePF(mat, __functionAddress);
    }

    /** {@code float aiMatrix3Determinant(struct aiMatrix3x3 const * mat)} */
    public static float aiMatrix3Determinant(@NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 mat) {
        return naiMatrix3Determinant(mat.address());
    }

    // --- [ aiMatrix3RotationZ ] ---

    /** {@code void aiMatrix3RotationZ(struct aiMatrix3x3 * mat, float angle)} */
    public static void naiMatrix3RotationZ(long mat, float angle) {
        long __functionAddress = Functions.Matrix3RotationZ;
        invokePV(mat, angle, __functionAddress);
    }

    /** {@code void aiMatrix3RotationZ(struct aiMatrix3x3 * mat, float angle)} */
    public static void aiMatrix3RotationZ(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, float angle) {
        naiMatrix3RotationZ(mat.address(), angle);
    }

    // --- [ aiMatrix3FromRotationAroundAxis ] ---

    /** {@code void aiMatrix3FromRotationAroundAxis(struct aiMatrix3x3 * mat, struct aiVector3D const * axis, float angle)} */
    public static void naiMatrix3FromRotationAroundAxis(long mat, long axis, float angle) {
        long __functionAddress = Functions.Matrix3FromRotationAroundAxis;
        invokePPV(mat, axis, angle, __functionAddress);
    }

    /** {@code void aiMatrix3FromRotationAroundAxis(struct aiMatrix3x3 * mat, struct aiVector3D const * axis, float angle)} */
    public static void aiMatrix3FromRotationAroundAxis(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, @NativeType("struct aiVector3D const *") AIVector3D axis, float angle) {
        naiMatrix3FromRotationAroundAxis(mat.address(), axis.address(), angle);
    }

    // --- [ aiMatrix3Translation ] ---

    /** {@code void aiMatrix3Translation(struct aiMatrix3x3 * mat, struct aiVector2D const * translation)} */
    public static void naiMatrix3Translation(long mat, long translation) {
        long __functionAddress = Functions.Matrix3Translation;
        invokePPV(mat, translation, __functionAddress);
    }

    /** {@code void aiMatrix3Translation(struct aiMatrix3x3 * mat, struct aiVector2D const * translation)} */
    public static void aiMatrix3Translation(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, @NativeType("struct aiVector2D const *") AIVector2D translation) {
        naiMatrix3Translation(mat.address(), translation.address());
    }

    // --- [ aiMatrix3FromTo ] ---

    /** {@code void aiMatrix3FromTo(struct aiMatrix3x3 * mat, struct aiVector3D const * from, struct aiVector3D const * to)} */
    public static void naiMatrix3FromTo(long mat, long from, long to) {
        long __functionAddress = Functions.Matrix3FromTo;
        invokePPPV(mat, from, to, __functionAddress);
    }

    /** {@code void aiMatrix3FromTo(struct aiMatrix3x3 * mat, struct aiVector3D const * from, struct aiVector3D const * to)} */
    public static void aiMatrix3FromTo(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, @NativeType("struct aiVector3D const *") AIVector3D from, @NativeType("struct aiVector3D const *") AIVector3D to) {
        naiMatrix3FromTo(mat.address(), from.address(), to.address());
    }

    // --- [ aiMatrix4FromMatrix3 ] ---

    /** {@code void aiMatrix4FromMatrix3(struct aiMatrix4x4 * dst, struct aiMatrix3x3 const * mat)} */
    public static void naiMatrix4FromMatrix3(long dst, long mat) {
        long __functionAddress = Functions.Matrix4FromMatrix3;
        invokePPV(dst, mat, __functionAddress);
    }

    /** {@code void aiMatrix4FromMatrix3(struct aiMatrix4x4 * dst, struct aiMatrix3x3 const * mat)} */
    public static void aiMatrix4FromMatrix3(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 dst, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 mat) {
        naiMatrix4FromMatrix3(dst.address(), mat.address());
    }

    // --- [ aiMatrix4FromScalingQuaternionPosition ] ---

    /** {@code void aiMatrix4FromScalingQuaternionPosition(struct aiMatrix4x4 * mat, struct aiVector3D const * scaling, struct aiQuaternion const * rotation, struct aiVector3D const * position)} */
    public static void naiMatrix4FromScalingQuaternionPosition(long mat, long scaling, long rotation, long position) {
        long __functionAddress = Functions.Matrix4FromScalingQuaternionPosition;
        invokePPPPV(mat, scaling, rotation, position, __functionAddress);
    }

    /** {@code void aiMatrix4FromScalingQuaternionPosition(struct aiMatrix4x4 * mat, struct aiVector3D const * scaling, struct aiQuaternion const * rotation, struct aiVector3D const * position)} */
    public static void aiMatrix4FromScalingQuaternionPosition(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D scaling, @NativeType("struct aiQuaternion const *") AIQuaternion rotation, @NativeType("struct aiVector3D const *") AIVector3D position) {
        naiMatrix4FromScalingQuaternionPosition(mat.address(), scaling.address(), rotation.address(), position.address());
    }

    // --- [ aiMatrix4Add ] ---

    /** {@code void aiMatrix4Add(struct aiMatrix4x4 * dst, struct aiMatrix4x4 const * src)} */
    public static void naiMatrix4Add(long dst, long src) {
        long __functionAddress = Functions.Matrix4Add;
        invokePPV(dst, src, __functionAddress);
    }

    /** {@code void aiMatrix4Add(struct aiMatrix4x4 * dst, struct aiMatrix4x4 const * src)} */
    public static void aiMatrix4Add(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 dst, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 src) {
        naiMatrix4Add(dst.address(), src.address());
    }

    // --- [ aiMatrix4AreEqual ] ---

    /** {@code int aiMatrix4AreEqual(struct aiMatrix4x4 const * a, struct aiMatrix4x4 const * b)} */
    public static int naiMatrix4AreEqual(long a, long b) {
        long __functionAddress = Functions.Matrix4AreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /** {@code int aiMatrix4AreEqual(struct aiMatrix4x4 const * a, struct aiMatrix4x4 const * b)} */
    @NativeType("int")
    public static boolean aiMatrix4AreEqual(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 a, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 b) {
        return naiMatrix4AreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiMatrix4AreEqualEpsilon ] ---

    /** {@code int aiMatrix4AreEqualEpsilon(struct aiMatrix4x4 const * a, struct aiMatrix4x4 const * b, float const epsilon)} */
    public static int naiMatrix4AreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.Matrix4AreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /** {@code int aiMatrix4AreEqualEpsilon(struct aiMatrix4x4 const * a, struct aiMatrix4x4 const * b, float const epsilon)} */
    @NativeType("int")
    public static boolean aiMatrix4AreEqualEpsilon(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 a, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 b, @NativeType("float const") float epsilon) {
        return naiMatrix4AreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiMatrix4Inverse ] ---

    /** {@code void aiMatrix4Inverse(struct aiMatrix4x4 * mat)} */
    public static void naiMatrix4Inverse(long mat) {
        long __functionAddress = Functions.Matrix4Inverse;
        invokePV(mat, __functionAddress);
    }

    /** {@code void aiMatrix4Inverse(struct aiMatrix4x4 * mat)} */
    public static void aiMatrix4Inverse(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat) {
        naiMatrix4Inverse(mat.address());
    }

    // --- [ aiMatrix4Determinant ] ---

    /** {@code float aiMatrix4Determinant(struct aiMatrix4x4 const * mat)} */
    public static float naiMatrix4Determinant(long mat) {
        long __functionAddress = Functions.Matrix4Determinant;
        return invokePF(mat, __functionAddress);
    }

    /** {@code float aiMatrix4Determinant(struct aiMatrix4x4 const * mat)} */
    public static float aiMatrix4Determinant(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat) {
        return naiMatrix4Determinant(mat.address());
    }

    // --- [ aiMatrix4IsIdentity ] ---

    /** {@code int aiMatrix4IsIdentity(struct aiMatrix4x4 const * mat)} */
    public static int naiMatrix4IsIdentity(long mat) {
        long __functionAddress = Functions.Matrix4IsIdentity;
        return invokePI(mat, __functionAddress);
    }

    /** {@code int aiMatrix4IsIdentity(struct aiMatrix4x4 const * mat)} */
    @NativeType("int")
    public static boolean aiMatrix4IsIdentity(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat) {
        return naiMatrix4IsIdentity(mat.address()) != 0;
    }

    // --- [ aiMatrix4DecomposeIntoScalingEulerAnglesPosition ] ---

    /** {@code void aiMatrix4DecomposeIntoScalingEulerAnglesPosition(struct aiMatrix4x4 const * mat, struct aiVector3D * scaling, struct aiVector3D * rotation, struct aiVector3D * position)} */
    public static void naiMatrix4DecomposeIntoScalingEulerAnglesPosition(long mat, long scaling, long rotation, long position) {
        long __functionAddress = Functions.Matrix4DecomposeIntoScalingEulerAnglesPosition;
        invokePPPPV(mat, scaling, rotation, position, __functionAddress);
    }

    /** {@code void aiMatrix4DecomposeIntoScalingEulerAnglesPosition(struct aiMatrix4x4 const * mat, struct aiVector3D * scaling, struct aiVector3D * rotation, struct aiVector3D * position)} */
    public static void aiMatrix4DecomposeIntoScalingEulerAnglesPosition(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiVector3D *") AIVector3D scaling, @NativeType("struct aiVector3D *") AIVector3D rotation, @NativeType("struct aiVector3D *") AIVector3D position) {
        naiMatrix4DecomposeIntoScalingEulerAnglesPosition(mat.address(), scaling.address(), rotation.address(), position.address());
    }

    // --- [ aiMatrix4DecomposeIntoScalingAxisAnglePosition ] ---

    /** {@code void aiMatrix4DecomposeIntoScalingAxisAnglePosition(struct aiMatrix4x4 const * mat, struct aiVector3D * scaling, struct aiVector3D * axis, ai_real * angle, struct aiVector3D * position)} */
    public static void naiMatrix4DecomposeIntoScalingAxisAnglePosition(long mat, long scaling, long axis, long angle, long position) {
        long __functionAddress = Functions.Matrix4DecomposeIntoScalingAxisAnglePosition;
        invokePPPPPV(mat, scaling, axis, angle, position, __functionAddress);
    }

    /** {@code void aiMatrix4DecomposeIntoScalingAxisAnglePosition(struct aiMatrix4x4 const * mat, struct aiVector3D * scaling, struct aiVector3D * axis, ai_real * angle, struct aiVector3D * position)} */
    public static void aiMatrix4DecomposeIntoScalingAxisAnglePosition(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiVector3D *") AIVector3D scaling, @NativeType("struct aiVector3D *") AIVector3D axis, @NativeType("ai_real *") FloatBuffer angle, @NativeType("struct aiVector3D *") AIVector3D position) {
        if (CHECKS) {
            check(angle, 1);
        }
        naiMatrix4DecomposeIntoScalingAxisAnglePosition(mat.address(), scaling.address(), axis.address(), memAddress(angle), position.address());
    }

    // --- [ aiMatrix4DecomposeNoScaling ] ---

    /** {@code void aiMatrix4DecomposeNoScaling(struct aiMatrix4x4 const * mat, struct aiQuaternion * rotation, struct aiVector3D * position)} */
    public static void naiMatrix4DecomposeNoScaling(long mat, long rotation, long position) {
        long __functionAddress = Functions.Matrix4DecomposeNoScaling;
        invokePPPV(mat, rotation, position, __functionAddress);
    }

    /** {@code void aiMatrix4DecomposeNoScaling(struct aiMatrix4x4 const * mat, struct aiQuaternion * rotation, struct aiVector3D * position)} */
    public static void aiMatrix4DecomposeNoScaling(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiQuaternion *") AIQuaternion rotation, @NativeType("struct aiVector3D *") AIVector3D position) {
        naiMatrix4DecomposeNoScaling(mat.address(), rotation.address(), position.address());
    }

    // --- [ aiMatrix4FromEulerAngles ] ---

    /** {@code void aiMatrix4FromEulerAngles(struct aiMatrix4x4 * mat, float x, float y, float z)} */
    public static void naiMatrix4FromEulerAngles(long mat, float x, float y, float z) {
        long __functionAddress = Functions.Matrix4FromEulerAngles;
        invokePV(mat, x, y, z, __functionAddress);
    }

    /** {@code void aiMatrix4FromEulerAngles(struct aiMatrix4x4 * mat, float x, float y, float z)} */
    public static void aiMatrix4FromEulerAngles(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, float x, float y, float z) {
        naiMatrix4FromEulerAngles(mat.address(), x, y, z);
    }

    // --- [ aiMatrix4RotationX ] ---

    /** {@code void aiMatrix4RotationX(struct aiMatrix4x4 * mat, float angle)} */
    public static void naiMatrix4RotationX(long mat, float angle) {
        long __functionAddress = Functions.Matrix4RotationX;
        invokePV(mat, angle, __functionAddress);
    }

    /** {@code void aiMatrix4RotationX(struct aiMatrix4x4 * mat, float angle)} */
    public static void aiMatrix4RotationX(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, float angle) {
        naiMatrix4RotationX(mat.address(), angle);
    }

    // --- [ aiMatrix4RotationY ] ---

    /** {@code void aiMatrix4RotationY(struct aiMatrix4x4 * mat, float angle)} */
    public static void naiMatrix4RotationY(long mat, float angle) {
        long __functionAddress = Functions.Matrix4RotationY;
        invokePV(mat, angle, __functionAddress);
    }

    /** {@code void aiMatrix4RotationY(struct aiMatrix4x4 * mat, float angle)} */
    public static void aiMatrix4RotationY(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, float angle) {
        naiMatrix4RotationY(mat.address(), angle);
    }

    // --- [ aiMatrix4RotationZ ] ---

    /** {@code void aiMatrix4RotationZ(struct aiMatrix4x4 * mat, float angle)} */
    public static void naiMatrix4RotationZ(long mat, float angle) {
        long __functionAddress = Functions.Matrix4RotationZ;
        invokePV(mat, angle, __functionAddress);
    }

    /** {@code void aiMatrix4RotationZ(struct aiMatrix4x4 * mat, float angle)} */
    public static void aiMatrix4RotationZ(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, float angle) {
        naiMatrix4RotationZ(mat.address(), angle);
    }

    // --- [ aiMatrix4FromRotationAroundAxis ] ---

    /** {@code void aiMatrix4FromRotationAroundAxis(struct aiMatrix4x4 * mat, struct aiVector3D const * axis, float angle)} */
    public static void naiMatrix4FromRotationAroundAxis(long mat, long axis, float angle) {
        long __functionAddress = Functions.Matrix4FromRotationAroundAxis;
        invokePPV(mat, axis, angle, __functionAddress);
    }

    /** {@code void aiMatrix4FromRotationAroundAxis(struct aiMatrix4x4 * mat, struct aiVector3D const * axis, float angle)} */
    public static void aiMatrix4FromRotationAroundAxis(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D axis, float angle) {
        naiMatrix4FromRotationAroundAxis(mat.address(), axis.address(), angle);
    }

    // --- [ aiMatrix4Translation ] ---

    /** {@code void aiMatrix4Translation(struct aiMatrix4x4 * mat, struct aiVector3D const * translation)} */
    public static void naiMatrix4Translation(long mat, long translation) {
        long __functionAddress = Functions.Matrix4Translation;
        invokePPV(mat, translation, __functionAddress);
    }

    /** {@code void aiMatrix4Translation(struct aiMatrix4x4 * mat, struct aiVector3D const * translation)} */
    public static void aiMatrix4Translation(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D translation) {
        naiMatrix4Translation(mat.address(), translation.address());
    }

    // --- [ aiMatrix4Scaling ] ---

    /** {@code void aiMatrix4Scaling(struct aiMatrix4x4 * mat, struct aiVector3D const * scaling)} */
    public static void naiMatrix4Scaling(long mat, long scaling) {
        long __functionAddress = Functions.Matrix4Scaling;
        invokePPV(mat, scaling, __functionAddress);
    }

    /** {@code void aiMatrix4Scaling(struct aiMatrix4x4 * mat, struct aiVector3D const * scaling)} */
    public static void aiMatrix4Scaling(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D scaling) {
        naiMatrix4Scaling(mat.address(), scaling.address());
    }

    // --- [ aiMatrix4FromTo ] ---

    /** {@code void aiMatrix4FromTo(struct aiMatrix4x4 * mat, struct aiVector3D const * from, struct aiVector3D const * to)} */
    public static void naiMatrix4FromTo(long mat, long from, long to) {
        long __functionAddress = Functions.Matrix4FromTo;
        invokePPPV(mat, from, to, __functionAddress);
    }

    /** {@code void aiMatrix4FromTo(struct aiMatrix4x4 * mat, struct aiVector3D const * from, struct aiVector3D const * to)} */
    public static void aiMatrix4FromTo(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D from, @NativeType("struct aiVector3D const *") AIVector3D to) {
        naiMatrix4FromTo(mat.address(), from.address(), to.address());
    }

    // --- [ aiQuaternionFromEulerAngles ] ---

    /** {@code void aiQuaternionFromEulerAngles(struct aiQuaternion * q, float x, float y, float z)} */
    public static void naiQuaternionFromEulerAngles(long q, float x, float y, float z) {
        long __functionAddress = Functions.QuaternionFromEulerAngles;
        invokePV(q, x, y, z, __functionAddress);
    }

    /** {@code void aiQuaternionFromEulerAngles(struct aiQuaternion * q, float x, float y, float z)} */
    public static void aiQuaternionFromEulerAngles(@NativeType("struct aiQuaternion *") AIQuaternion q, float x, float y, float z) {
        naiQuaternionFromEulerAngles(q.address(), x, y, z);
    }

    // --- [ aiQuaternionFromAxisAngle ] ---

    /** {@code void aiQuaternionFromAxisAngle(struct aiQuaternion * q, struct aiVector3D const * axis, float angle)} */
    public static void naiQuaternionFromAxisAngle(long q, long axis, float angle) {
        long __functionAddress = Functions.QuaternionFromAxisAngle;
        invokePPV(q, axis, angle, __functionAddress);
    }

    /** {@code void aiQuaternionFromAxisAngle(struct aiQuaternion * q, struct aiVector3D const * axis, float angle)} */
    public static void aiQuaternionFromAxisAngle(@NativeType("struct aiQuaternion *") AIQuaternion q, @NativeType("struct aiVector3D const *") AIVector3D axis, float angle) {
        naiQuaternionFromAxisAngle(q.address(), axis.address(), angle);
    }

    // --- [ aiQuaternionFromNormalizedQuaternion ] ---

    /** {@code void aiQuaternionFromNormalizedQuaternion(struct aiQuaternion * q, struct aiVector3D const * normalized)} */
    public static void naiQuaternionFromNormalizedQuaternion(long q, long normalized) {
        long __functionAddress = Functions.QuaternionFromNormalizedQuaternion;
        invokePPV(q, normalized, __functionAddress);
    }

    /** {@code void aiQuaternionFromNormalizedQuaternion(struct aiQuaternion * q, struct aiVector3D const * normalized)} */
    public static void aiQuaternionFromNormalizedQuaternion(@NativeType("struct aiQuaternion *") AIQuaternion q, @NativeType("struct aiVector3D const *") AIVector3D normalized) {
        naiQuaternionFromNormalizedQuaternion(q.address(), normalized.address());
    }

    // --- [ aiQuaternionAreEqual ] ---

    /** {@code int aiQuaternionAreEqual(struct aiQuaternion const * a, struct aiQuaternion const * b)} */
    public static int naiQuaternionAreEqual(long a, long b) {
        long __functionAddress = Functions.QuaternionAreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /** {@code int aiQuaternionAreEqual(struct aiQuaternion const * a, struct aiQuaternion const * b)} */
    @NativeType("int")
    public static boolean aiQuaternionAreEqual(@NativeType("struct aiQuaternion const *") AIQuaternion a, @NativeType("struct aiQuaternion const *") AIQuaternion b) {
        return naiQuaternionAreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiQuaternionAreEqualEpsilon ] ---

    /** {@code int aiQuaternionAreEqualEpsilon(struct aiQuaternion const * a, struct aiQuaternion const * b, float const epsilon)} */
    public static int naiQuaternionAreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.QuaternionAreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /** {@code int aiQuaternionAreEqualEpsilon(struct aiQuaternion const * a, struct aiQuaternion const * b, float const epsilon)} */
    @NativeType("int")
    public static boolean aiQuaternionAreEqualEpsilon(@NativeType("struct aiQuaternion const *") AIQuaternion a, @NativeType("struct aiQuaternion const *") AIQuaternion b, @NativeType("float const") float epsilon) {
        return naiQuaternionAreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiQuaternionNormalize ] ---

    /** {@code void aiQuaternionNormalize(struct aiQuaternion * q)} */
    public static void naiQuaternionNormalize(long q) {
        long __functionAddress = Functions.QuaternionNormalize;
        invokePV(q, __functionAddress);
    }

    /** {@code void aiQuaternionNormalize(struct aiQuaternion * q)} */
    public static void aiQuaternionNormalize(@NativeType("struct aiQuaternion *") AIQuaternion q) {
        naiQuaternionNormalize(q.address());
    }

    // --- [ aiQuaternionConjugate ] ---

    /** {@code void aiQuaternionConjugate(struct aiQuaternion * q)} */
    public static void naiQuaternionConjugate(long q) {
        long __functionAddress = Functions.QuaternionConjugate;
        invokePV(q, __functionAddress);
    }

    /** {@code void aiQuaternionConjugate(struct aiQuaternion * q)} */
    public static void aiQuaternionConjugate(@NativeType("struct aiQuaternion *") AIQuaternion q) {
        naiQuaternionConjugate(q.address());
    }

    // --- [ aiQuaternionMultiply ] ---

    /** {@code void aiQuaternionMultiply(struct aiQuaternion * dst, struct aiQuaternion const * q)} */
    public static void naiQuaternionMultiply(long dst, long q) {
        long __functionAddress = Functions.QuaternionMultiply;
        invokePPV(dst, q, __functionAddress);
    }

    /** {@code void aiQuaternionMultiply(struct aiQuaternion * dst, struct aiQuaternion const * q)} */
    public static void aiQuaternionMultiply(@NativeType("struct aiQuaternion *") AIQuaternion dst, @NativeType("struct aiQuaternion const *") AIQuaternion q) {
        naiQuaternionMultiply(dst.address(), q.address());
    }

    // --- [ aiQuaternionInterpolate ] ---

    /** {@code void aiQuaternionInterpolate(struct aiQuaternion * dst, struct aiQuaternion const * start, struct aiQuaternion const * end, float factor)} */
    public static void naiQuaternionInterpolate(long dst, long start, long end, float factor) {
        long __functionAddress = Functions.QuaternionInterpolate;
        invokePPPV(dst, start, end, factor, __functionAddress);
    }

    /** {@code void aiQuaternionInterpolate(struct aiQuaternion * dst, struct aiQuaternion const * start, struct aiQuaternion const * end, float factor)} */
    public static void aiQuaternionInterpolate(@NativeType("struct aiQuaternion *") AIQuaternion dst, @NativeType("struct aiQuaternion const *") AIQuaternion start, @NativeType("struct aiQuaternion const *") AIQuaternion end, float factor) {
        naiQuaternionInterpolate(dst.address(), start.address(), end.address(), factor);
    }

    // --- [ aiGetImporterDesc ] ---

    /** {@code struct aiImporterDesc * aiGetImporterDesc(char const * extension)} */
    public static long naiGetImporterDesc(long extension) {
        long __functionAddress = Functions.GetImporterDesc;
        return invokePP(extension, __functionAddress);
    }

    /** {@code struct aiImporterDesc * aiGetImporterDesc(char const * extension)} */
    @NativeType("struct aiImporterDesc *")
    public static @Nullable AIImporterDesc aiGetImporterDesc(@NativeType("char const *") ByteBuffer extension) {
        if (CHECKS) {
            checkNT1(extension);
        }
        long __result = naiGetImporterDesc(memAddress(extension));
        return AIImporterDesc.createSafe(__result);
    }

    /** {@code struct aiImporterDesc * aiGetImporterDesc(char const * extension)} */
    @NativeType("struct aiImporterDesc *")
    public static @Nullable AIImporterDesc aiGetImporterDesc(@NativeType("char const *") CharSequence extension) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(extension, true);
            long extensionEncoded = stack.getPointerAddress();
            long __result = naiGetImporterDesc(extensionEncoded);
            return AIImporterDesc.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiTextureTypeToString ] ---

    /** {@code char const * aiTextureTypeToString(aiTextureType in)} */
    public static long naiTextureTypeToString(int in) {
        long __functionAddress = Functions.TextureTypeToString;
        return invokeP(in, __functionAddress);
    }

    /** {@code char const * aiTextureTypeToString(aiTextureType in)} */
    @NativeType("char const *")
    public static @Nullable String aiTextureTypeToString(@NativeType("aiTextureType") int in) {
        long __result = naiTextureTypeToString(in);
        return memASCIISafe(__result);
    }

    // --- [ aiGetMaterialProperty ] ---

    /** {@code aiReturn aiGetMaterialProperty(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiMaterialProperty const ** mPropOut)} */
    public static int naiGetMaterialProperty(long pMat, long pKey, int type, int index, long mPropOut) {
        long __functionAddress = Functions.GetMaterialProperty;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPI(pMat, pKey, type, index, mPropOut, __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialProperty(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiMaterialProperty const ** mPropOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialProperty(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiMaterialProperty const **") PointerBuffer mPropOut) {
        if (CHECKS) {
            checkNT1(pKey);
            check(mPropOut, 1);
        }
        return naiGetMaterialProperty(pMat.address(), memAddress(pKey), type, index, memAddress(mPropOut));
    }

    /** {@code aiReturn aiGetMaterialProperty(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiMaterialProperty const ** mPropOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialProperty(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiMaterialProperty const **") PointerBuffer mPropOut) {
        if (CHECKS) {
            check(mPropOut, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pKey, true);
            long pKeyEncoded = stack.getPointerAddress();
            return naiGetMaterialProperty(pMat.address(), pKeyEncoded, type, index, memAddress(mPropOut));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiGetMaterialProperty ] ---

    /** {@code aiReturn aiGetMaterialProperty(struct aiMaterial const * pMat, char const * pKey, struct aiMaterialProperty const ** mPropOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialProperty(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("struct aiMaterialProperty const **") PointerBuffer mPropOut) {
        return aiGetMaterialProperty(pMat, pKey, 0, 0, mPropOut);
    }

    /** {@code aiReturn aiGetMaterialProperty(struct aiMaterial const * pMat, char const * pKey, struct aiMaterialProperty const ** mPropOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialProperty(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("struct aiMaterialProperty const **") PointerBuffer mPropOut) {
        return aiGetMaterialProperty(pMat, pKey, 0, 0, mPropOut);
    }

    // --- [ aiGetMaterialFloatArray ] ---

    /** {@code aiReturn aiGetMaterialFloatArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, ai_real * pOut, unsigned int * pMax)} */
    public static int naiGetMaterialFloatArray(long pMat, long pKey, int type, int index, long pOut, long pMax) {
        long __functionAddress = Functions.GetMaterialFloatArray;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPPI(pMat, pKey, type, index, pOut, pMax, __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialFloatArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, ai_real * pOut, unsigned int * pMax)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialFloatArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("ai_real *") FloatBuffer pOut, @NativeType("unsigned int *") @Nullable IntBuffer pMax) {
        if (CHECKS) {
            checkNT1(pKey);
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax.get(pMax.position())); }
        }
        return naiGetMaterialFloatArray(pMat.address(), memAddress(pKey), type, index, memAddress(pOut), memAddressSafe(pMax));
    }

    /** {@code aiReturn aiGetMaterialFloatArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, ai_real * pOut, unsigned int * pMax)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialFloatArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("ai_real *") FloatBuffer pOut, @NativeType("unsigned int *") @Nullable IntBuffer pMax) {
        if (CHECKS) {
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax.get(pMax.position())); }
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pKey, true);
            long pKeyEncoded = stack.getPointerAddress();
            return naiGetMaterialFloatArray(pMat.address(), pKeyEncoded, type, index, memAddress(pOut), memAddressSafe(pMax));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiGetMaterialIntegerArray ] ---

    /** {@code aiReturn aiGetMaterialIntegerArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, int * pOut, unsigned int * pMax)} */
    public static int naiGetMaterialIntegerArray(long pMat, long pKey, int type, int index, long pOut, long pMax) {
        long __functionAddress = Functions.GetMaterialIntegerArray;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPPI(pMat, pKey, type, index, pOut, pMax, __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialIntegerArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, int * pOut, unsigned int * pMax)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialIntegerArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("int *") IntBuffer pOut, @NativeType("unsigned int *") @Nullable IntBuffer pMax) {
        if (CHECKS) {
            checkNT1(pKey);
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax.get(pMax.position())); }
        }
        return naiGetMaterialIntegerArray(pMat.address(), memAddress(pKey), type, index, memAddress(pOut), memAddressSafe(pMax));
    }

    /** {@code aiReturn aiGetMaterialIntegerArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, int * pOut, unsigned int * pMax)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialIntegerArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("int *") IntBuffer pOut, @NativeType("unsigned int *") @Nullable IntBuffer pMax) {
        if (CHECKS) {
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax.get(pMax.position())); }
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pKey, true);
            long pKeyEncoded = stack.getPointerAddress();
            return naiGetMaterialIntegerArray(pMat.address(), pKeyEncoded, type, index, memAddress(pOut), memAddressSafe(pMax));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiGetMaterialColor ] ---

    /** {@code aiReturn aiGetMaterialColor(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiColor4D * pOut)} */
    public static int naiGetMaterialColor(long pMat, long pKey, int type, int index, long pOut) {
        long __functionAddress = Functions.GetMaterialColor;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPI(pMat, pKey, type, index, pOut, __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialColor(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiColor4D * pOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialColor(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiColor4D *") AIColor4D pOut) {
        if (CHECKS) {
            checkNT1(pKey);
        }
        return naiGetMaterialColor(pMat.address(), memAddress(pKey), type, index, pOut.address());
    }

    /** {@code aiReturn aiGetMaterialColor(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiColor4D * pOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialColor(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiColor4D *") AIColor4D pOut) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pKey, true);
            long pKeyEncoded = stack.getPointerAddress();
            return naiGetMaterialColor(pMat.address(), pKeyEncoded, type, index, pOut.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiGetMaterialUVTransform ] ---

    /** {@code aiReturn aiGetMaterialUVTransform(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiUVTransform * pOut)} */
    public static int naiGetMaterialUVTransform(long pMat, long pKey, int type, int index, long pOut) {
        long __functionAddress = Functions.GetMaterialUVTransform;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPI(pMat, pKey, type, index, pOut, __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialUVTransform(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiUVTransform * pOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialUVTransform(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiUVTransform *") AIUVTransform pOut) {
        if (CHECKS) {
            checkNT1(pKey);
        }
        return naiGetMaterialUVTransform(pMat.address(), memAddress(pKey), type, index, pOut.address());
    }

    /** {@code aiReturn aiGetMaterialUVTransform(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiUVTransform * pOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialUVTransform(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiUVTransform *") AIUVTransform pOut) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pKey, true);
            long pKeyEncoded = stack.getPointerAddress();
            return naiGetMaterialUVTransform(pMat.address(), pKeyEncoded, type, index, pOut.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiGetMaterialString ] ---

    /** {@code aiReturn aiGetMaterialString(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiString * pOut)} */
    public static int naiGetMaterialString(long pMat, long pKey, int type, int index, long pOut) {
        long __functionAddress = Functions.GetMaterialString;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPI(pMat, pKey, type, index, pOut, __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialString(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiString * pOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialString(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiString *") AIString pOut) {
        if (CHECKS) {
            checkNT1(pKey);
        }
        return naiGetMaterialString(pMat.address(), memAddress(pKey), type, index, pOut.address());
    }

    /** {@code aiReturn aiGetMaterialString(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, struct aiString * pOut)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialString(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiString *") AIString pOut) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pKey, true);
            long pKeyEncoded = stack.getPointerAddress();
            return naiGetMaterialString(pMat.address(), pKeyEncoded, type, index, pOut.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ aiGetMaterialTextureCount ] ---

    /** {@code unsigned int aiGetMaterialTextureCount(struct aiMaterial const * pMat, aiTextureType type)} */
    public static int naiGetMaterialTextureCount(long pMat, int type) {
        long __functionAddress = Functions.GetMaterialTextureCount;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePI(pMat, type, __functionAddress);
    }

    /** {@code unsigned int aiGetMaterialTextureCount(struct aiMaterial const * pMat, aiTextureType type)} */
    @NativeType("unsigned int")
    public static int aiGetMaterialTextureCount(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("aiTextureType") int type) {
        return naiGetMaterialTextureCount(pMat.address(), type);
    }

    // --- [ aiGetMaterialTexture ] ---

    /** {@code aiReturn aiGetMaterialTexture(struct aiMaterial const * pMat, aiTextureType type, unsigned int index, struct aiString * path, aiTextureMapping * mapping, unsigned int * uvindex, float * blend, aiTextureOp * op, aiTextureMapMode * mapmode, unsigned int * flags)} */
    public static int naiGetMaterialTexture(long pMat, int type, int index, long path, long mapping, long uvindex, long blend, long op, long mapmode, long flags) {
        long __functionAddress = Functions.GetMaterialTexture;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPPPPPPI(pMat, type, index, path, mapping, uvindex, blend, op, mapmode, flags, __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialTexture(struct aiMaterial const * pMat, aiTextureType type, unsigned int index, struct aiString * path, aiTextureMapping * mapping, unsigned int * uvindex, float * blend, aiTextureOp * op, aiTextureMapMode * mapmode, unsigned int * flags)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialTexture(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("aiTextureType") int type, @NativeType("unsigned int") int index, @NativeType("struct aiString *") AIString path, @NativeType("aiTextureMapping *") @Nullable IntBuffer mapping, @NativeType("unsigned int *") @Nullable IntBuffer uvindex, @NativeType("float *") @Nullable FloatBuffer blend, @NativeType("aiTextureOp *") @Nullable IntBuffer op, @NativeType("aiTextureMapMode *") @Nullable IntBuffer mapmode, @NativeType("unsigned int *") @Nullable IntBuffer flags) {
        if (CHECKS) {
            checkSafe(mapping, 1);
            checkSafe(uvindex, 1);
            checkSafe(blend, 1);
            checkSafe(op, 1);
            checkSafe(mapmode, 1);
            checkSafe(flags, 1);
        }
        return naiGetMaterialTexture(pMat.address(), type, index, path.address(), memAddressSafe(mapping), memAddressSafe(uvindex), memAddressSafe(blend), memAddressSafe(op), memAddressSafe(mapmode), memAddressSafe(flags));
    }

    // --- [ aiGetLegalString ] ---

    /** {@code char const * aiGetLegalString(void)} */
    public static long naiGetLegalString() {
        long __functionAddress = Functions.GetLegalString;
        return invokeP(__functionAddress);
    }

    /** {@code char const * aiGetLegalString(void)} */
    @NativeType("char const *")
    public static String aiGetLegalString() {
        long __result = naiGetLegalString();
        return memASCII(__result);
    }

    // --- [ aiGetVersionPatch ] ---

    /** {@code unsigned int aiGetVersionPatch(void)} */
    @NativeType("unsigned int")
    public static int aiGetVersionPatch() {
        long __functionAddress = Functions.GetVersionPatch;
        return invokeI(__functionAddress);
    }

    // --- [ aiGetVersionMinor ] ---

    /** {@code unsigned int aiGetVersionMinor(void)} */
    @NativeType("unsigned int")
    public static int aiGetVersionMinor() {
        long __functionAddress = Functions.GetVersionMinor;
        return invokeI(__functionAddress);
    }

    // --- [ aiGetVersionMajor ] ---

    /** {@code unsigned int aiGetVersionMajor(void)} */
    @NativeType("unsigned int")
    public static int aiGetVersionMajor() {
        long __functionAddress = Functions.GetVersionMajor;
        return invokeI(__functionAddress);
    }

    // --- [ aiGetVersionRevision ] ---

    /** {@code unsigned int aiGetVersionRevision(void)} */
    @NativeType("unsigned int")
    public static int aiGetVersionRevision() {
        long __functionAddress = Functions.GetVersionRevision;
        return invokeI(__functionAddress);
    }

    // --- [ aiGetBranchName ] ---

    /** {@code char const * aiGetBranchName(void)} */
    public static long naiGetBranchName() {
        long __functionAddress = Functions.GetBranchName;
        return invokeP(__functionAddress);
    }

    /** {@code char const * aiGetBranchName(void)} */
    @NativeType("char const *")
    public static @Nullable String aiGetBranchName() {
        long __result = naiGetBranchName();
        return memUTF8Safe(__result);
    }

    // --- [ aiGetCompileFlags ] ---

    /** {@code unsigned int aiGetCompileFlags(void)} */
    @NativeType("unsigned int")
    public static int aiGetCompileFlags() {
        long __functionAddress = Functions.GetCompileFlags;
        return invokeI(__functionAddress);
    }

    /** {@code void aiMatrix4DecomposeIntoScalingAxisAnglePosition(struct aiMatrix4x4 const * mat, struct aiVector3D * scaling, struct aiVector3D * axis, ai_real * angle, struct aiVector3D * position)} */
    public static void aiMatrix4DecomposeIntoScalingAxisAnglePosition(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiVector3D *") AIVector3D scaling, @NativeType("struct aiVector3D *") AIVector3D axis, @NativeType("ai_real *") float[] angle, @NativeType("struct aiVector3D *") AIVector3D position) {
        long __functionAddress = Functions.Matrix4DecomposeIntoScalingAxisAnglePosition;
        if (CHECKS) {
            check(angle, 1);
        }
        invokePPPPPV(mat.address(), scaling.address(), axis.address(), angle, position.address(), __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialFloatArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, ai_real * pOut, unsigned int * pMax)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialFloatArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("ai_real *") float[] pOut, @NativeType("unsigned int *") int @Nullable [] pMax) {
        long __functionAddress = Functions.GetMaterialFloatArray;
        if (CHECKS) {
            checkNT1(pKey);
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax[0]); }
            AIMaterial.validate(pMat.address());
        }
        return invokePPPPI(pMat.address(), memAddress(pKey), type, index, pOut, pMax, __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialFloatArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, ai_real * pOut, unsigned int * pMax)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialFloatArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("ai_real *") float[] pOut, @NativeType("unsigned int *") int @Nullable [] pMax) {
        long __functionAddress = Functions.GetMaterialFloatArray;
        if (CHECKS) {
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax[0]); }
            AIMaterial.validate(pMat.address());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pKey, true);
            long pKeyEncoded = stack.getPointerAddress();
            return invokePPPPI(pMat.address(), pKeyEncoded, type, index, pOut, pMax, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code aiReturn aiGetMaterialIntegerArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, int * pOut, unsigned int * pMax)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialIntegerArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("int *") int[] pOut, @NativeType("unsigned int *") int @Nullable [] pMax) {
        long __functionAddress = Functions.GetMaterialIntegerArray;
        if (CHECKS) {
            checkNT1(pKey);
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax[0]); }
            AIMaterial.validate(pMat.address());
        }
        return invokePPPPI(pMat.address(), memAddress(pKey), type, index, pOut, pMax, __functionAddress);
    }

    /** {@code aiReturn aiGetMaterialIntegerArray(struct aiMaterial const * pMat, char const * pKey, unsigned int type, unsigned int index, int * pOut, unsigned int * pMax)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialIntegerArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("int *") int[] pOut, @NativeType("unsigned int *") int @Nullable [] pMax) {
        long __functionAddress = Functions.GetMaterialIntegerArray;
        if (CHECKS) {
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax[0]); }
            AIMaterial.validate(pMat.address());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pKey, true);
            long pKeyEncoded = stack.getPointerAddress();
            return invokePPPPI(pMat.address(), pKeyEncoded, type, index, pOut, pMax, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code aiReturn aiGetMaterialTexture(struct aiMaterial const * pMat, aiTextureType type, unsigned int index, struct aiString * path, aiTextureMapping * mapping, unsigned int * uvindex, float * blend, aiTextureOp * op, aiTextureMapMode * mapmode, unsigned int * flags)} */
    @NativeType("aiReturn")
    public static int aiGetMaterialTexture(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("aiTextureType") int type, @NativeType("unsigned int") int index, @NativeType("struct aiString *") AIString path, @NativeType("aiTextureMapping *") int @Nullable [] mapping, @NativeType("unsigned int *") int @Nullable [] uvindex, @NativeType("float *") float @Nullable [] blend, @NativeType("aiTextureOp *") int @Nullable [] op, @NativeType("aiTextureMapMode *") int @Nullable [] mapmode, @NativeType("unsigned int *") int @Nullable [] flags) {
        long __functionAddress = Functions.GetMaterialTexture;
        if (CHECKS) {
            checkSafe(mapping, 1);
            checkSafe(uvindex, 1);
            checkSafe(blend, 1);
            checkSafe(op, 1);
            checkSafe(mapmode, 1);
            checkSafe(flags, 1);
            AIMaterial.validate(pMat.address());
        }
        return invokePPPPPPPPI(pMat.address(), type, index, path.address(), mapping, uvindex, blend, op, mapmode, flags, __functionAddress);
    }

}