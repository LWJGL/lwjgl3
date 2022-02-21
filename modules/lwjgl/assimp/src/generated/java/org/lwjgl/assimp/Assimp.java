/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

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

/**
 * Contains bindings to the <a target="_blank" href="http://www.assimp.org/">Assimp</a> library.
 * 
 * <h3>General Features</h3>
 * 
 * <ul>
 * <li>Written in portable, ISO-compliant C++</li>
 * <li>Easily configurable and customizable</li>
 * <li>Core interface / API is provided for both C++ and C</li>
 * <li>Command-line interface to perform common operations (i.e. quick file stats, convert models, extract embedded textures) from the shell</li>
 * <li>Imports bones, vertex weights and animations (i.e. skinning, skeletal animations)</li>
 * <li>Loads multiple UV and vertex color channels (current limit is 8)</li>
 * <li>Works well with UNICODE input files</li>
 * <li>Supports complex multi-layer materials</li>
 * <li>Supports embedded textures, both compressed (e.g. PNG) or just raw color data</li>
 * <li>No external dependencies except boost (zlib and irrxml are also needed, but they're included in the repository so you don't need to bother). And there's even a workaround to compile Assimp without boost - with some minor limitations.</li>
 * <li>Due to its export interface, Assimp serves as general-purpose 3D model converter</li>
 * </ul>
 * 
 * <h3>Import Formats</h3>
 * 
 * <p>COMMON INTERCHANGE FORMATS (An asterisk indicates limited support)</p>
 * 
 * <ul>
 * <li>Autodesk ( .fbx )</li>
 * <li>Collada ( .dae )</li>
 * <li>glTF ( .gltf, .glb )</li>
 * <li>Blender 3D ( .blend )</li>
 * <li>3ds Max 3DS ( .3ds )</li>
 * <li>3ds Max ASE ( .ase )</li>
 * <li>Wavefront Object ( .obj )</li>
 * <li>Industry Foundation Classes (IFC/Step) ( .ifc )</li>
 * <li>XGL ( .xgl,.zgl )</li>
 * <li>Stanford Polygon Library ( .ply )</li>
 * <li>*AutoCAD DXF ( .dxf )</li>
 * <li>LightWave ( .lwo )</li>
 * <li>LightWave Scene ( .lws )</li>
 * <li>Modo ( .lxo )</li>
 * <li>Stereolithography ( .stl )</li>
 * <li>DirectX X ( .x )</li>
 * <li>AC3D ( .ac )</li>
 * <li>Milkshape 3D ( .ms3d )</li>
 * <li>* TrueSpace ( .cob,.scn )</li>
 * <li>*OpenGEX ( .ogex )</li>
 * <li>*X3D ( .x3d )</li>
 * <li>*3MF ( .3mf )</li>
 * </ul>
 * 
 * <p>MOTION CAPTURE FORMATS</p>
 * 
 * <ul>
 * <li>Biovision BVH ( .bvh )</li>
 * <li>* CharacterStudio Motion ( .csm )</li>
 * </ul>
 * 
 * <p>GRAPHICS ENGINE FORMATS</p>
 * 
 * <ul>
 * <li>Ogre XML ( .xml )</li>
 * <li>Irrlicht Mesh ( .irrmesh )</li>
 * <li>* Irrlicht Scene ( .irr )</li>
 * </ul>
 * 
 * <p>GAME FILE FORMATS</p>
 * 
 * <ul>
 * <li>Quake I ( .mdl )</li>
 * <li>Quake II ( .md2 )</li>
 * <li>Quake III Mesh ( .md3 )</li>
 * <li>Quake III Map/BSP ( .pk3 )</li>
 * <li>* Return to Castle Wolfenstein ( .mdc )</li>
 * <li>Doom 3 ( .md5* )</li>
 * <li>*Valve Model ( .smd,.vta )</li>
 * <li>*Open Game Engine Exchange ( .ogex )</li>
 * <li>*Unreal ( .3d )</li>
 * </ul>
 * 
 * <p>OTHER FILE FORMATS</p>
 * 
 * <ul>
 * <li>BlitzBasic 3D ( .b3d )</li>
 * <li>Quick3D ( .q3d,.q3s )</li>
 * <li>Neutral File Format ( .nff )</li>
 * <li>Sense8 WorldToolKit ( .nff )</li>
 * <li>Object File Format ( .off )</li>
 * <li>PovRAY Raw ( .raw )</li>
 * <li>Terragen Terrain ( .ter )</li>
 * <li>3D GameStudio (3DGS) ( .mdl )</li>
 * <li>3D GameStudio (3DGS) Terrain ( .hmp )</li>
 * <li>Izware Nendo ( .ndo )</li>
 * </ul>
 * 
 * <h3>Export Formats</h3>
 * 
 * <p>COMMON INTERCHANGE FORMATS</p>
 * 
 * <ul>
 * <li>Collada ( .dae )</li>
 * <li>Wavefront Object ( .obj )</li>
 * <li>Stereolithography ( .stl )</li>
 * <li>Stanford Polygon Library ( .ply )</li>
 * </ul>
 * 
 * <h3>Post-processing</h3>
 * 
 * <p>REAL TIME RENDERING</p>
 * 
 * <ul>
 * <li>Improve vertex cache locality</li>
 * <li>Convert from right-handed to left-handed space</li>
 * <li>Limit weights affecting a single vertex</li>
 * <li>Split meshes to avoid exceeding bone count limits</li>
 * <li>Triangulate arbitrary polygons</li>
 * <li>Join identical vertices, optimize indexing</li>
 * <li>Find degenerate polygons</li>
 * <li>Split large meshes to overcome GPU limitations (i.e. vertex count)</li>
 * </ul>
 * 
 * <p>VERTEX DATA</p>
 * 
 * <ul>
 * <li>Compute "hard" per-face normal vectors</li>
 * <li>Compute "smooth" per-vertex normal vectors</li>
 * <li>Compute tangents and bitangents</li>
 * </ul>
 * 
 * <p>SCENEGRAPH</p>
 * 
 * <ul>
 * <li>Collapse the scene graph, transform everything to world coordinates</li>
 * <li>Optimize meshes &amp; nodes for fewer drawcalls</li>
 * </ul>
 * 
 * <p>OTHER</p>
 * 
 * <ul>
 * <li>Validate the output structure to ensure maximum data integrity</li>
 * <li>Remove unrequired materials, effectively detect and merge duplicates</li>
 * <li>Try to correct face winding</li>
 * <li>Drop dummy bones introduced somewhere in your content pipeline</li>
 * </ul>
 */
public class Assimp {

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
            TextureTypeToString                            = apiGetFunctionAddress(ASSIMP, "TextureTypeToString"),
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

    /**
     * Enables time measurements.
     * 
     * <p>If enabled, measures the time needed for each part of the loading process (i.e. IO time, importing, postprocessing, ..) and dumps these timings to the
     * DefaultLogger. See the <a target="_blank" href="http://assimp.org/lib_html/perf.html">Performance Page</a> for more information on this topic.</p>
     * 
     * <p>Property type: bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_GLOB_MEASURE_TIME = "GLOB_MEASURE_TIME";

    /**
     * Global setting to disable generation of skeleton dummy meshes
     * 
     * <p>Skeleton dummy meshes are generated as a visualization aid in cases which the input data contains no geometry, but only animation data.</p>
     * 
     * <p>Property data type: bool. Default value: false</p>
     */
    public static final String AI_CONFIG_IMPORT_NO_SKELETON_MESHES = "IMPORT_NO_SKELETON_MESHES";

    /**
     * Maximum bone count per mesh for the {@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount} step.
     * 
     * <p>Meshes are split until the maximum number of bones is reached. The default value is {@link #AI_SBBC_DEFAULT_MAX_BONES}, which may be altered at compile-time.</p>
     * 
     * <p>Property data type: integer.</p>
     */
    public static final String AI_CONFIG_PP_SBBC_MAX_BONES = "PP_SBBC_MAX_BONES";

    /**
     * Specifies the maximum angle that may be between two vertex tangents that their tangents and bi-tangents are smoothed.
     * 
     * <p>This applies to the {@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace} step. The angle is specified in degrees. The maximum value is 175.</p>
     * 
     * <p>Property type: float. Default value: 45 degrees</p>
     */
    public static final String AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE = "PP_CT_MAX_SMOOTHING_ANGLE";

    /**
     * Source UV channel for tangent space computation.
     * 
     * <p>The specified channel must exist or an error will be raised.</p>
     * 
     * <p>Property type: integer. Default value: 0</p>
     */
    public static final String AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX = "PP_CT_TEXTURE_CHANNEL_INDEX";

    /**
     * Specifies the maximum angle that may be between two face normals at the same vertex position that their are smoothed together.
     * 
     * <p>Sometimes referred to as 'crease angle'. This applies to the {@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals} step. The angle is specified in degrees, so 180 is PI. The
     * default value is 175 degrees (all vertex normals are smoothed). The maximum value is 175, too.</p>
     * 
     * <p>Property type: float.</p>
     * 
     * <p>Warning: setting this option may cause a severe loss of performance. The performance is unaffected if the {@link #AI_CONFIG_FAVOUR_SPEED} flag is set but the
     * output quality may be reduced.</p>
     */
    public static final String AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE = "PP_GSN_MAX_SMOOTHING_ANGLE";

    /**
     * Sets the colormap (= palette) to be used to decode embedded textures in MDL (Quake or 3DGS) files.
     * 
     * <p>This must be a valid path to a file. The file is 768 (256*3) bytes large and contains RGB triplets for each of the 256 palette entries. The default
     * value is colormap.lmp. If the file is not found, a default palette (from Quake 1) is used.</p>
     * 
     * <p>Property type: string.</p>
     */
    public static final String AI_CONFIG_IMPORT_MDL_COLORMAP = "IMPORT_MDL_COLORMAP";

    /**
     * Configures the {@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials} step to keep materials matching a name in a given list.
     * 
     * <p>This is a list of 1 to n strings, ' ' serves as delimiter character. Identifiers containing whitespaces must be enclosed in *single* quotation marks.
     * For example: {@code "keep-me and_me_to anotherMaterialToBeKept \'name with whitespace\'"}. If a material matches on of these names, it will not be
     * modified or removed by the postprocessing step nor will other materials be replaced by a reference to it.</p>
     * 
     * <p>This option might be useful if you are using some magic material names to pass additional semantics through the content pipeline. This ensures they
     * won't be optimized away, but a general optimization is still performed for materials not contained in the list.</p>
     * 
     * <p>Property type: String. Default value: n/a</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Linefeeds, tabs or carriage returns are treated as whitespace. Material names are case sensitive.</p></div>
     */
    public static final String AI_CONFIG_PP_RRM_EXCLUDE_LIST = "PP_RRM_EXCLUDE_LIST";

    /**
     * Configures the {@link #aiProcess_PreTransformVertices Process_PreTransformVertices} step to keep the scene hierarchy. Meshes are moved to worldspace, but no optimization is performed (read:
     * meshes with equal materials are not joined. The total number of meshes won't change).
     * 
     * <p>This option could be of use for you if the scene hierarchy contains important additional information which you intend to parse. For rendering, you can
     * still render all meshes in the scene without any transformations.</p>
     * 
     * <p>Property type: bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_PP_PTV_KEEP_HIERARCHY = "PP_PTV_KEEP_HIERARCHY";

    /**
     * Configures the {@link #aiProcess_PreTransformVertices Process_PreTransformVertices} step to normalize all vertex components into the {@code [-1,1]} range. That is, a bounding box for the
     * whole scene is computed, the maximum component is taken and all meshes are scaled appropriately (uniformly of course!). This might be useful if you
     * don't know the spatial dimension of the input data.
     */
    public static final String AI_CONFIG_PP_PTV_NORMALIZE = "PP_PTV_NORMALIZE";

    /**
     * Configures the {@link #aiProcess_PreTransformVertices Process_PreTransformVertices} step to use a users defined matrix as the scene root node transformation before transforming vertices.
     * 
     * <p>Property type: bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION = "PP_PTV_ADD_ROOT_TRANSFORMATION";

    /**
     * Configures the {@link #aiProcess_PreTransformVertices Process_PreTransformVertices} step to use a users defined matrix as the scene root node transformation before transforming vertices.
     * This property corresponds to the 'a1' component of the transformation matrix.
     * 
     * <p>Property type: aiMatrix4x4.</p>
     */
    public static final String AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION = "PP_PTV_ROOT_TRANSFORMATION";

    /**
     * Configures the {@link #aiProcess_FindDegenerates Process_FindDegenerates} step to remove degenerated primitives from the import - immediately.
     * 
     * <p>The default behaviour converts degenerated triangles to lines and degenerated lines to points. See the documentation to the {@link #aiProcess_FindDegenerates Process_FindDegenerates}
     * step for a detailed example of the various ways to get rid of these lines and points if you don't want them.</p>
     * 
     * <p>Property type: bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_PP_FD_REMOVE = "PP_FD_REMOVE";

    /**
     * Configures the {@link #aiProcess_FindDegenerates Process_FindDegenerates} to check the area of a triangle to be greater than e-6. If this is not the case the triangle will be removed if
     * {@link #AI_CONFIG_PP_FD_REMOVE} is set to true.
     * 
     * <p>Property type: bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_PP_FD_CHECKAREA = "PP_FD_CHECKAREA";

    /**
     * Configures the {@link #aiProcess_OptimizeGraph Process_OptimizeGraph} step to preserve nodes matching a name in a given list.
     * 
     * <p>This is a list of 1 to n strings, ' ' serves as delimiter character. Identifiers containing whitespaces must be enclosed in *single* quotation marks.
     * For example: {@code "keep-me and_me_to anotherNodeToBeKept \'name with whitespace\'"}. If a node matches on of these names, it will not be modified or
     * removed by the postprocessing step.</p>
     * 
     * <p>This option might be useful if you are using some magic node names to pass additional semantics through the content pipeline. This ensures they won't
     * be optimized away, but a general optimization is still performed for nodes not contained in the list.</p>
     * 
     * <p>Property type: String. Default value: n/a</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Linefeeds, tabs or carriage returns are treated as whitespace. Node names are case sensitive.</p></div>
     */
    public static final String AI_CONFIG_PP_OG_EXCLUDE_LIST = "PP_OG_EXCLUDE_LIST";

    /**
     * Set the maximum number of triangles in a mesh.
     * 
     * <p>This is used by the {@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes} PostProcess-Step to determine whether a mesh must be split or not.</p>
     * 
     * <p>Property type: integer.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The default value is {@link #AI_SLM_DEFAULT_MAX_TRIANGLES}</p></div>
     */
    public static final String AI_CONFIG_PP_SLM_TRIANGLE_LIMIT = "PP_SLM_TRIANGLE_LIMIT";

    /**
     * Set the maximum number of vertices in a mesh.
     * 
     * <p>This is used by the {@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes} PostProcess-Step to determine whether a mesh must be split or not.</p>
     * 
     * <p>Property type: integer.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The default value is {@link #AI_SLM_DEFAULT_MAX_VERTICES}</p></div>
     */
    public static final String AI_CONFIG_PP_SLM_VERTEX_LIMIT = "PP_SLM_VERTEX_LIMIT";

    /**
     * Set the maximum number of bones affecting a single vertex.
     * 
     * <p>This is used by the {@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights} PostProcess-Step.</p>
     * 
     * <p>Property type: integer.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The default value is {@link #AI_LBW_MAX_WEIGHTS}</p></div>
     */
    public static final String AI_CONFIG_PP_LBW_MAX_WEIGHTS = "PP_LBW_MAX_WEIGHTS";

    /**
     * Lower the deboning threshold in order to remove more bones.
     * 
     * <p>This is used by the {@link #aiProcess_Debone Process_Debone} PostProcess-Step.</p>
     * 
     * <p>Property type: float.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The default value is {@link #AI_DEBONE_THRESHOLD}</p></div>
     */
    public static final String AI_CONFIG_PP_DB_THRESHOLD = "PP_DB_THRESHOLD";

    /**
     * Require all bones qualify for deboning before removing any.
     * 
     * <p>This is used by the {@link #aiProcess_Debone Process_Debone} PostProcess-Step.</p>
     * 
     * <p>Property type: bool.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The default value is 0</p></div>
     */
    public static final String AI_CONFIG_PP_DB_ALL_OR_NONE = "PP_DB_ALL_OR_NONE";

    /**
     * Set the size of the post-transform vertex cache to optimize the vertices for. This configures the {@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality} step.
     * 
     * <p>The size is given in vertices. Of course you can't know how the vertex format will exactly look like after the import returns, but you can still guess
     * what your meshes will probably have.</p>
     * 
     * <p>Property type: integer.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The default value is {@link #PP_ICL_PTCACHE_SIZE}. That results in slight performance improvements for most nVidia/AMD cards since 2002.</p></div>
     */
    public static final String AI_CONFIG_PP_ICL_PTCACHE_SIZE = "PP_ICL_PTCACHE_SIZE";

    /**
     * Input parameter to the {@link #aiProcess_RemoveComponent Process_RemoveComponent} step: Specifies the parts of the data structure to be removed.
     * 
     * <p>See the documentation to this step for further details. The property is expected to be an integer, a bitwise combination of the {@code aiComponent}
     * flags. The default value is 0. Important: if no valid mesh is remaining after the step has been executed (e.g you thought it was funny to specify ALL
     * of the flags defined above) the import FAILS. Mainly because there is no data to work on anymore ...</p>
     */
    public static final String AI_CONFIG_PP_RVC_FLAGS = "PP_RVC_FLAGS";

    /**
     * Input parameter to the {@link #aiProcess_SortByPType Process_SortByPType} step: Specifies which primitive types are removed by the step.
     * 
     * <p>This is a bitwise combination of the {@code aiPrimitiveType} flags. Specifying all of them is illegal, of course. A typical use would be to exclude
     * all line and point meshes from the import.</p>
     * 
     * <p>This is an integer property, its default value is 0.</p>
     */
    public static final String AI_CONFIG_PP_SBP_REMOVE = "PP_SBP_REMOVE";

    /**
     * Input parameter to the {@link #aiProcess_FindInvalidData Process_FindInvalidData} step: Specifies the floating-point accuracy for animation values.
     * 
     * <p>The step checks for animation tracks where all frame values are absolutely equal and removes them. This tweakable controls the epsilon for
     * floating-point comparisons - two keys are considered equal if the invariant {@code abs(n0-n1)>epsilon} holds true for all vector respectively
     * quaternion components.</p>
     * 
     * <p>The default value is 0.f - comparisons are exact then.</p>
     */
    public static final String AI_CONFIG_PP_FID_ANIM_ACCURACY = "PP_FID_ANIM_ACCURACY";

    /**
     * Input parameter to the {@link #aiProcess_FindInvalidData Process_FindInvalidData} step: Set to true to ignore texture coordinates.
     * 
     * <p>This may be useful if you have to assign different kind of textures like one for the summer or one for the winter.</p>
     */
    public static final String AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS = "PP_FID_IGNORE_TEXTURECOORDS";

    /**
     * Input parameter to the {@link #aiProcess_TransformUVCoords Process_TransformUVCoords} step: Specifies which UV transformations are evaluated.
     * 
     * <p>This is a bitwise combination of the {@code AI_UVTRAFO_XXX} flags (integer property, of course). By default all transformations are enabled
     * ({@link #AI_UVTRAFO_ALL}).</p>
     */
    public static final String AI_CONFIG_PP_TUV_EVALUATE = "PP_TUV_EVALUATE";

    /**
     * A hint to assimp to favour speed against import quality.
     * 
     * <p>Enabling this option may result in faster loading, but it needn't. It represents just a hint to loaders and post-processing steps to use faster code
     * paths, if possible.</p>
     * 
     * <p>This property is expected to be an integer, != 0 stands for true. The default value is 0.</p>
     */
    public static final String AI_CONFIG_FAVOUR_SPEED = "FAVOUR_SPEED";

    /**
     * Importers which parse JSON may use this to obtain a pointer to a {@code rapidjson::IRemoteSchemaDocumentProvider}.
     * 
     * <p>Property type: void*. The default value is {@code nullptr}</p>
     */
    public static final String AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER = "IMPORT_SCHEMA_DOCUMENT_PROVIDER";

    /**
     * Set whether the fbx importer will merge all geometry layers present in the source file or take only the first.
     * 
     * <p>Property type: bool. The default value is true (1)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS = "IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS";

    /**
     * Set whether the fbx importer will read all materials present in the source file or take only the referenced materials.
     * 
     * <p>This is void unless {@code IMPORT_FBX_READ_MATERIALS=1}.</p>
     * 
     * <p>Property type: bool. The default value is false (0)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS = "IMPORT_FBX_READ_ALL_MATERIALS";

    /**
     * Set whether the fbx importer will read materials.
     * 
     * <p>Property type: bool. The default value is true (1)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_READ_MATERIALS = "IMPORT_FBX_READ_MATERIALS";

    /**
     * Set whether the fbx importer will read embedded textures.
     * 
     * <p>Property type: bool. The default value is true (1)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_READ_TEXTURES = "IMPORT_FBX_READ_TEXTURES";

    /**
     * Set whether the fbx importer will read cameras.
     * 
     * <p>Property type: bool. The default value is true (1)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_READ_CAMERAS = "IMPORT_FBX_READ_CAMERAS";

    /**
     * Set whether the fbx importer will read light sources.
     * 
     * <p>Property type: bool. The default value is true (1)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_READ_LIGHTS = "IMPORT_FBX_READ_LIGHTS";

    /**
     * Set whether the fbx importer will read animations.
     * 
     * <p>Property type: bool. The default value is true (1)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS = "IMPORT_FBX_READ_ANIMATIONS";

    /**
     * Set whether the fbx importer will read weights.
     * 
     * <p>Property type: bool. The default value is true (1)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_READ_WEIGHTS = "IMPORT_FBX_READ_WEIGHTS";

    /**
     * Set whether the fbx importer will act in strict mode in which only FBX 2013 is supported and any other sub formats are rejected. FBX 2013 is the
     * primary target for the importer, so this format is best supported and well-tested.
     * 
     * <p>Property type: bool. The default value is false (0)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_STRICT_MODE = "IMPORT_FBX_STRICT_MODE";

    /**
     * Set whether the fbx importer will preserve pivot points for transformations (as extra nodes). If set to false, pivots and offsets will be evaluated
     * whenever possible.
     * 
     * <p>Property type: bool. The default value is true (1)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS = "IMPORT_FBX_PRESERVE_PIVOTS";

    /**
     * Specifies whether the importer will drop empty animation curves or animation curves which match the bind pose transformation over their entire defined
     * range.
     * 
     * <p>Property type: bool. The default value is true (1)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES = "IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES";

    /**
     * Set whether the fbx importer will use the legacy embedded texture naming.
     * 
     * <p>Property type: bool. The default value is false (0)</p>
     */
    public static final String AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING = "AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING";

    /**
     * Set whether the importer shall not remove empty bones.
     * 
     * <p>Empty bones are often used to define connections for other models.</p>
     * 
     * <p>Property type: bool. The default value is false (0)</p>
     */
    public static final String AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES = "AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES";

    /**
     * Set whether the FBX importer shall convert the unit from cm to m.
     * 
     * <p>Property type: bool. The default value is false (0)</p>
     */
    public static final String AI_CONFIG_FBX_CONVERT_TO_M = "AI_CONFIG_FBX_CONVERT_TO_M";

    /**
     * Set the vertex animation keyframe to be imported.
     * 
     * <p>ASSIMP does not support vertex keyframes (only bone animation is supported). The library reads only one frame of models with vertex animations. By
     * default this is the first frame.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The default value is 0. This option applies to all importers. However, it is also possible to override the global setting for a specific loader.
     * You can use the {@code AI_CONFIG_IMPORT_XXX_KEYFRAME} options (where XXX is a placeholder for the file format for which you want to override the
     * global setting).</p>
     * </div>
     * 
     * <p>Property type: integer.</p>
     */
    public static final String AI_CONFIG_IMPORT_GLOBAL_KEYFRAME = "IMPORT_GLOBAL_KEYFRAME";

    public static final String AI_CONFIG_IMPORT_MD3_KEYFRAME = "IMPORT_MD3_KEYFRAME";

    /** @see #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME */
    public static final String AI_CONFIG_IMPORT_MD2_KEYFRAME = "IMPORT_MD2_KEYFRAME";

    /** @see #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME */
    public static final String AI_CONFIG_IMPORT_MDL_KEYFRAME = "IMPORT_MDL_KEYFRAME";

    /** @see #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME */
    public static final String AI_CONFIG_IMPORT_MDC_KEYFRAME = "IMPORT_MDC_KEYFRAME";

    /** @see #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME */
    public static final String AI_CONFIG_IMPORT_SMD_KEYFRAME = "IMPORT_SMD_KEYFRAME";

    /** @see #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME */
    public static final String AI_CONFIG_IMPORT_UNREAL_KEYFRAME = "IMPORT_UNREAL_KEYFRAME";

    /**
     * Set whether the MDL (HL1) importer will read animations.
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS = "IMPORT_MDL_HL1_READ_ANIMATIONS";

    /**
     * Set whether the MDL (HL1) importer will read animation events.
     * 
     * <p>This property requires {@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS} to be set to true.</p>
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS = "IMPORT_MDL_HL1_READ_ANIMATION_EVENTS";

    /**
     * Set whether the MDL (HL1) importer will read blend controllers.
     * 
     * <p>This property requires {@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS} to be set to true.</p>
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS = "IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS";

    /**
     * Set whether the MDL (HL1) importer will read sequence transition graph.
     * 
     * <p>This property requires {@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS} to be set to true.</p>
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS = "IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS";

    /**
     * Set whether the MDL (HL1) importer will read attachments info.
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS = "IMPORT_MDL_HL1_READ_ATTACHMENTS";

    /**
     * Set whether the MDL (HL1) importer will read bone controllers info.
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS = "IMPORT_MDL_HL1_READ_BONE_CONTROLLERS";

    /**
     * Set whether the MDL (HL1) importer will read hitboxes info.
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES = "IMPORT_MDL_HL1_READ_HITBOXES";

    /**
     * Set whether the MDL (HL1) importer will read miscellaneous global model info.
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO = "IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO";

    /**
     * Smd load multiple animations.
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST = "IMPORT_SMD_LOAD_ANIMATION_LIST";

    /**
     * Configures the AC loader to collect all surfaces which have the "Backface cull" flag set in separate meshes.
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL = "IMPORT_AC_SEPARATE_BFCULL";

    /**
     * Configures whether the AC loader evaluates subdivision surfaces (indicated by the presence of the 'subdiv' attribute in the file). By default, Assimp
     * performs the subdivision using the standard Catmull-Clark algorithm.
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION = "IMPORT_AC_EVAL_SUBDIVISION";

    /**
     * Configures the UNREAL 3D loader to separate faces with different surface flags (e.g. two-sided vs. single-sided).
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_UNREAL_HANDLE_FLAGS = "UNREAL_HANDLE_FLAGS";

    /**
     * Configures the terragen import plugin to compute uv's for terrains, if not given. Furthermore a default texture is assigned.
     * 
     * <p>UV coordinates for terrains are so simple to compute that you'll usually want to compute them on your own, if you need them. This option is intended
     * for model viewers which want to offer an easy way to apply textures to terrains.</p>
     * 
     * <p>Property type: bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_IMPORT_TER_MAKE_UVS = "IMPORT_TER_MAKE_UVS";

    /**
     * Configures the ASE loader to always reconstruct normal vectors basing on the smoothing groups loaded from the file.
     * 
     * <p>Some ASE files have carry invalid normals, other don't.</p>
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS = "IMPORT_ASE_RECONSTRUCT_NORMALS";

    /**
     * Configures the M3D loader to detect and process multi-part Quake player models.
     * 
     * <p>These models usually consist of 3 files, lower.md3, upper.md3 and head.md3. If this property is set to true, Assimp will try to load and * combine all
     * three files if one of them is loaded.</p>
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART = "IMPORT_MD3_HANDLE_MULTIPART";

    /**
     * Tells the MD3 loader which skin files to load.
     * 
     * <p>When loading MD3 files, Assimp checks whether a file {@code [md3_file_name]_[skin_name].skin} is existing. These files are used by * Quake III to be
     * able to assign different skins (e.g. red and blue team) to models. 'default', 'red', 'blue' are typical skin names.</p>
     * 
     * <p>Property type: String. Default value: "default".</p>
     */
    public static final String AI_CONFIG_IMPORT_MD3_SKIN_NAME = "IMPORT_MD3_SKIN_NAME";

    /**
     * Specify if to try load Quake 3 shader files.
     * 
     * <p>This also controls  original surface name handling: when disabled it will be used unchanged.</p>
     * 
     * <p>Property type: bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_MD3_LOAD_SHADERS = "IMPORT_MD3_LOAD_SHADERS";

    /**
     * Specify the Quake 3 shader file to be used for a particular MD3 file. This can also be a search path.
     * 
     * <p>By default Assimp's behaviour is as follows: If a MD3 file {@code any_path/models/any_q3_subdir/model_name/file_name.md3} is loaded, the library tries
     * to locate the corresponding shader file in {@code any_path/scripts/model_name.shader}. This property overrides this behaviour. It can either specify a
     * full path to the shader to be loaded or alternatively the path (relative or absolute) to the directory where the shaders for all MD3s to be loaded
     * reside. Assimp attempts to open {@code IMPORT_MD3_SHADER_SRC/model_name.shader} first, {@code IMPORT_MD3_SHADER_SRC/file_name.shader} is the fallback
     * file. Note that {@code IMPORT_MD3_SHADER_SRC} should have a terminal (back)slash.</p>
     * 
     * <p>Property type: String. Default value: n/a.</p>
     */
    public static final String AI_CONFIG_IMPORT_MD3_SHADER_SRC = "IMPORT_MD3_SHADER_SRC";

    /**
     * Configures the LWO loader to load just one layer from the model.
     * 
     * <p>LWO files consist of layers and in some cases it could be useful to load only one of them. This property can be either a string - which specifies the
     * name of the layer - or an integer - the index of the layer. If the property is not set the whole LWO model is loaded. Loading fails if the requested
     * layer is not available. The layer index is zero-based and the layer name may not be empty.</p>
     * 
     * <p>Property type: Integer. Default value: all layers are loaded.</p>
     */
    public static final String AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY = "IMPORT_LWO_ONE_LAYER_ONLY";

    /**
     * Configures the MD5 loader to not load the MD5ANIM file for a MD5MESH file automatically.
     * 
     * <p>The default strategy is to look for a file with the same name but the MD5ANIM extension in the same directory. If it is found, it is loaded * and
     * combined with the MD5MESH file. This configuration option can be used to disable this behaviour.</p>
     * 
     * <p>Property type: bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD = "IMPORT_MD5_NO_ANIM_AUTOLOAD";

    /**
     * Defines the begin of the time range for which the LWS loader evaluates animations and computes {@link AINodeAnim}'s.
     * 
     * <p>Assimp provides full conversion of LightWave's envelope system, including pre and post conditions. The loader computes linearly subsampled animation
     * chanels with the frame rate given in the LWS file. This property defines the start time. Note: animation channels are only generated if a node has at
     * least one envelope with more tan one key assigned. This property is given in frames, '0' is the first frame. By default, if this property is not set,
     * the importer takes the animation start from the input LWS file ('FirstFrame' line).</p>
     * 
     * <p>Property type: Integer. Default value: taken from file.</p>
     */
    public static final String AI_CONFIG_IMPORT_LWS_ANIM_START = "IMPORT_LWS_ANIM_START";

    /**
     * End of the imported time range.
     *
     * @see #AI_CONFIG_IMPORT_LWS_ANIM_START
     */
    public static final String AI_CONFIG_IMPORT_LWS_ANIM_END = "IMPORT_LWS_ANIM_END";

    /**
     * Defines the output frame rate of the IRR loader.
     * 
     * <p>IRR animations are difficult to convert for Assimp and there will always be a loss of quality. This setting defines how many keys per second are
     * returned by the converter.</p>
     * 
     * <p>Property type: integer. Default value: 100</p>
     */
    public static final String AI_CONFIG_IMPORT_IRR_ANIM_FPS = "IMPORT_IRR_ANIM_FPS";

    /**
     * Ogre Importer will try to find referenced materials from this file.
     * 
     * <p>Ogre meshes reference with material names, this does not tell Assimp the file where it is located in. Assimp will try to find the source file in the
     * following order: {@code <material-name>.material}, {@code <mesh-filename-base>.material} and lastly the material name defined by this config property.</p>
     * 
     * <p>Property type: String. Default value: {@code Scene.material}.</p>
     */
    public static final String AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE = "IMPORT_OGRE_MATERIAL_FILE";

    /**
     * Ogre Importer detect the texture usage from its filename.
     * 
     * <p>Ogre material texture units do not define texture type, the textures usage depends on the used shader or Ogre's fixed pipeline. If this config
     * property is true Assimp will try to detect the type from the textures filename postfix: _n, _nrm, _nrml, _normal, _normals and _normalmap for normal
     * map, _s, _spec, _specular and _specularmap for specular map, _l, _light, _lightmap, _occ and _occlusion for light map, _disp and _displacement for
     * displacement map. The matching is case insensitive. Post fix is taken between the last underscore and the last period.</p>
     * 
     * <p>Default behavior is to detect type from lower cased texture unit name by matching against: normalmap, specularmap, lightmap and displacementmap. For
     * both cases if no match is found {@link #aiTextureType_DIFFUSE TextureType_DIFFUSE} is used.</p>
     * 
     * <p>Property type: Bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME = "IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME";

    /**
     * Specifies whether the IFC loader skips over IfcSpace elements.
     * 
     * <p>IfcSpace elements (and their geometric representations) are used to represent, well, free space in a building storey.</p>
     * 
     * <p>Property type: Bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS = "IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS";

    /**
     * Specifies whether the Android JNI asset extraction is supported.
     * 
     * <p>Turn on this option if you want to manage assets in native Android application without having to keep the internal directory and asset manager
     * pointer.</p>
     */
    public static final String AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT = "AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT";

    /**
     * Specifies whether the IFC loader skips over shape representations of type 'Curve2D'.
     * 
     * <p>A lot of files contain both a faceted mesh representation and a outline with a presentation type of 'Curve2D'. Currently Assimp doesn't convert those,
     * so turning this option off just clutters the log with errors.</p>
     * 
     * <p>Property type: Bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS = "IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS";

    /**
     * Specifies whether the IFC loader will use its own, custom triangulation algorithm to triangulate wall and floor meshes.
     * 
     * <p>If this property is set to false, walls will be either triangulated by {@link #aiProcess_Triangulate Process_Triangulate} or will be passed through as huge polygons with faked
     * holes (i.e. holes that are connected with the outer boundary using a dummy edge). It is highly recommended to set this property to true if you want
     * triangulated data because {@link #aiProcess_Triangulate Process_Triangulate} is known to have problems with the kind of polygons that the IFC loader spits out for complicated
     * meshes.</p>
     * 
     * <p>Property type: Bool. Default value: true.</p>
     */
    public static final String AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION = "IMPORT_IFC_CUSTOM_TRIANGULATION";

    /**
     * Sets the tessellation conic angle for IFC smoothing curves.
     * 
     * <p>This is used by the IFC importer to determine the tessellation parameter for smoothing curves.</p>
     * 
     * <p>The default value is {@link #AI_IMPORT_IFC_DEFAULT_SMOOTHING_ANGLE} and the accepted values are in range [5.0, 120.0].</p>
     * 
     * <p>Property type: Float.</p>
     */
    public static final String AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE = "IMPORT_IFC_SMOOTHING_ANGLE";

    /**
     * Set the tessellation for IFC cylindrical shapes.
     * 
     * <p>This is used by the IFC importer to determine the tessellation parameter for cylindrical shapes, i.e. the number of segments used to aproximate a circle.</p>
     * 
     * <p>The default value is {@link #AI_IMPORT_IFC_DEFAULT_CYLINDRICAL_TESSELLATION} and the accepted values are in range [3, 180].</p>
     * 
     * <p>Property type: Integer.</p>
     */
    public static final String AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION = "IMPORT_IFC_CYLINDRICAL_TESSELLATION";

    /**
     * Specifies whether the Collada loader will ignore the provided up direction.
     * 
     * <p>If this property is set to true, the up direction provided in the file header will be ignored and the file will be loaded as is.</p>
     * 
     * <p>Property type: Bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION = "IMPORT_COLLADA_IGNORE_UP_DIRECTION";

    /**
     * Specifies whether the Collada loader should use Collada names.
     * 
     * <p>If this property is set to true, the Collada names will be used as the node and mesh names. The default is to use the id tag (resp. sid tag, if no id
     * tag is present) instead.</p>
     * 
     * <p>Property type: Bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES = "IMPORT_COLLADA_USE_COLLADA_NAMES";

    /**
     * Specifies the xfile use double for real values of float.
     * 
     * <p>Property type: Bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_EXPORT_XFILE_64BIT = "EXPORT_XFILE_64BIT";

    /**
     * Specifies whether the assimp export shall be able to export point clouds.
     * 
     * <p>When this flag is not defined the render data has to contain valid faces. Point clouds are only a collection of vertices which have nor spatial
     * organization by a face and the validation process will remove them. Enabling this feature will switch off the flag and enable the functionality to
     * export pure point clouds.</p>
     * 
     * <p>Property type: Bool. Default value: false.</p>
     */
    public static final String AI_CONFIG_EXPORT_POINT_CLOUDS = "EXPORT_POINT_CLOUDS";

    /**
     * Specifies the blob name, assimp uses for exporting.
     * 
     * <p>Some formats require auxiliary files to be written, that need to be linked back into the original file. For example, OBJ files export materials to a
     * separate MTL file and use the {@code mtllib} keyword to reference this file.</p>
     * 
     * <p>When exporting blobs using {@code #ExportToBlob}, assimp does not know the name of the blob file and thus outputs {@code mtllib $blobfile.mtl}, which
     * might not be desired, since the MTL file might be called differently.</p>
     * 
     * <p>This property can be used to give the exporter a hint on how to use the magic {@code $blobfile} keyword. If the exporter detects the keyword and is
     * provided with a name for the blob, it instead uses this name.</p>
     */
    public static final String AI_CONFIG_EXPORT_BLOB_NAME = "EXPORT_BLOB_NAME";

    /**
     * Specifies a global key factor for scale.
     * 
     * <p>Property type: float. Default value: 1.0f</p>
     */
    public static final String AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY = "GLOBAL_SCALE_FACTOR";

    /**
     * Specifies an application key factor for scale.
     * 
     * <p>Property type: float. Default value: 1.0f</p>
     */
    public static final String AI_CONFIG_APP_SCALE_KEY = "APP_SCALE_FACTOR";

    /** Default values for configuration properties. */
    public static final int
        AI_SBBC_DEFAULT_MAX_BONES                      = 0x3C,
        AI_SLM_DEFAULT_MAX_TRIANGLES                   = 0xF4240,
        AI_SLM_DEFAULT_MAX_VERTICES                    = 0xF4240,
        AI_LBW_MAX_WEIGHTS                             = 0x4,
        PP_ICL_PTCACHE_SIZE                            = 0xC,
        AI_IMPORT_IFC_DEFAULT_CYLINDRICAL_TESSELLATION = 0x20;

    /** Default value for configuration properties. */
    public static final float
        AI_DEBONE_THRESHOLD                   = 1.0f,
        AI_IMPORT_IFC_DEFAULT_SMOOTHING_ANGLE = 10.0f,
        AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT = 1.0f,
        AI_CONFIG_APP_SCALE_DEFAULT           = 1.0f;

    /** UVCoord Transforms */
    public static final int
        AI_UVTRAFO_SCALING     = 0x1,
        AI_UVTRAFO_ROTATION    = 0x2,
        AI_UVTRAFO_TRANSLATION = 0x4,
        AI_UVTRAFO_ALL         = (AI_UVTRAFO_SCALING | AI_UVTRAFO_ROTATION | AI_UVTRAFO_TRANSLATION);

    /**
     * Enumerates components of the {@link AIScene} and {@link AIMesh} data structures that can be excluded from the import using the {@link #aiProcess_RemoveComponent Process_RemoveComponent} step.
     * 
     * <p>See the documentation to {@link #aiProcess_RemoveComponent Process_RemoveComponent} for more details.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiComponent_NORMALS Component_NORMALS} - Normal vectors</li>
     * <li>{@link #aiComponent_TANGENTS_AND_BITANGENTS Component_TANGENTS_AND_BITANGENTS} - Tangents and bitangents go always together</li>
     * <li>{@link #aiComponent_COLORS Component_COLORS} - ALL color sets. Use {@link #aiComponent_COLORSn Component_COLORSn} to specify the N'th set.</li>
     * <li>{@link #aiComponent_TEXCOORDS Component_TEXCOORDS} - ALL texture UV sets. Use {@link #aiComponent_TEXCOORDSn Component_TEXCOORDSn} to specify the N'th set.</li>
     * <li>{@link #aiComponent_BONEWEIGHTS Component_BONEWEIGHTS} - 
     * Removes all bone weights from all meshes. The scenegraph nodes corresponding to the bones are NOT removed. use the {@link #aiProcess_OptimizeGraph Process_OptimizeGraph} step to
     * do this.
     * </li>
     * <li>{@link #aiComponent_ANIMATIONS Component_ANIMATIONS} - 
     * Removes all node animations ({@link AIScene}{@code ::mAnimations}). The corresponding scenegraph nodes are NOT removed. use the {@link #aiProcess_OptimizeGraph Process_OptimizeGraph}
     * step to do this.
     * </li>
     * <li>{@link #aiComponent_TEXTURES Component_TEXTURES} - Removes all embedded textures</li>
     * <li>{@link #aiComponent_LIGHTS Component_LIGHTS} - 
     * Removes all light sources ({@link AIScene}{@code ::mLights}). The corresponding scenegraph nodes are NOT removed. use the {@link #aiProcess_OptimizeGraph Process_OptimizeGraph} step to
     * do this.
     * </li>
     * <li>{@link #aiComponent_CAMERAS Component_CAMERAS} - 
     * Removes all cameras ({@link AIScene}{@code ::mCameras}). The corresponding scenegraph nodes are NOT removed. use the {@link #aiProcess_OptimizeGraph Process_OptimizeGraph} step to do
     * this.
     * </li>
     * <li>{@link #aiComponent_MESHES Component_MESHES} - Removes all meshes ({@link AIScene}{@code ::mMeshes}).</li>
     * <li>{@link #aiComponent_MATERIALS Component_MATERIALS} - Removes all materials. One default material will be generated, so {@link AIScene}{@code ::mNumMaterials} will be 1.</li>
     * </ul>
     */
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

    /** This is PI. Hi PI. */
    public static final double
        AI_MATH_PI      = 3.141592653589793d,
        AI_MATH_TWO_PI  = AI_MATH_PI * 2.0,
        AI_MATH_HALF_PI = AI_MATH_PI * 0.5;

    /** This is PI. Hi PI. */
    public static final float
        AI_MATH_PI_F      = 3.1415927f,
        AI_MATH_TWO_PI_F  = AI_MATH_PI_F * 2f,
        AI_MATH_HALF_PI_F = AI_MATH_PI_F * 0f;

    /** Numerical limits. */
    public static final float ai_epsilon = 0.00001f;

    /** Maximum dimension for strings, ASSIMP strings are zero terminated. */
    public static final int MAXLEN = 0x400;

    /**
     * Standard return type for some library functions, rarely used. (@code aiReturn}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiReturn_SUCCESS Return_SUCCESS} - Indicates that a function was successful.</li>
     * <li>{@link #aiReturn_FAILURE Return_FAILURE} - Indicates that a function failed.</li>
     * <li>{@link #aiReturn_OUTOFMEMORY Return_OUTOFMEMORY} - Indicates that not enough memory is available to perform the requested operation.</li>
     * </ul>
     */
    public static final int
        aiReturn_SUCCESS     = 0x0,
        aiReturn_FAILURE     = 0xFFFFFFFF,
        aiReturn_OUTOFMEMORY = 0xFFFFFFFD;

    /**
     * Seek origins (for the virtual file system API).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiOrigin_SET Origin_SET} - Beginning of the file</li>
     * <li>{@link #aiOrigin_CUR Origin_CUR} - Current position of the file pointer</li>
     * <li>{@link #aiOrigin_END Origin_END} - End of the file, offsets must be negative</li>
     * </ul>
     */
    public static final int
        aiOrigin_SET = 0x0,
        aiOrigin_CUR = 0x1,
        aiOrigin_END = 0x2;

    /**
     * Enumerates predefined log streaming destinations.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiDefaultLogStream_FILE DefaultLogStream_FILE} - Stream the log to a file</li>
     * <li>{@link #aiDefaultLogStream_STDOUT DefaultLogStream_STDOUT} - Stream the log to {@code std::cout}</li>
     * <li>{@link #aiDefaultLogStream_STDERR DefaultLogStream_STDERR} - Stream the log to {@code std::cerr}</li>
     * <li>{@link #aiDefaultLogStream_DEBUGGER DefaultLogStream_DEBUGGER} - MSVC only: Stream the log the the debugger (this relies on {@code OutputDebugString} from the Win32 SDK)</li>
     * </ul>
     */
    public static final int
        aiDefaultLogStream_FILE     = 0x1,
        aiDefaultLogStream_STDOUT   = 0x2,
        aiDefaultLogStream_STDERR   = 0x4,
        aiDefaultLogStream_DEBUGGER = 0x8;

    /**
     * Defines how an animation channel behaves outside the defined time range. This corresponds to {@link AINodeAnim}{@code ::mPreState} and
     * {@link AINodeAnim}{@code ::mPostState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiAnimBehaviour_DEFAULT AnimBehaviour_DEFAULT} - The value from the default node transformation is taken</li>
     * <li>{@link #aiAnimBehaviour_CONSTANT AnimBehaviour_CONSTANT} - The nearest key value is used without interpolation</li>
     * <li>{@link #aiAnimBehaviour_LINEAR AnimBehaviour_LINEAR} - The value of the nearest two keys is linearly extrapolated for the current time value.</li>
     * <li>{@link #aiAnimBehaviour_REPEAT AnimBehaviour_REPEAT} - The animation is repeated. If the animation key go from n to m and the current time is t, use the value at {@code (t-n) % (|m-n|)}.</li>
     * </ul>
     */
    public static final int
        aiAnimBehaviour_DEFAULT  = 0x0,
        aiAnimBehaviour_CONSTANT = 0x1,
        aiAnimBehaviour_LINEAR   = 0x2,
        aiAnimBehaviour_REPEAT   = 0x3;

    /**
     * Boolean constants
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #AI_TRUE AI_TRUE} - true</li>
     * <li>{@link #AI_FALSE AI_FALSE} - false</li>
     * </ul>
     */
    public static final int
        AI_TRUE  = 0x1,
        AI_FALSE = 0x0;

    /**
     * Mixed set of flags for {@link AIImporterDesc}, indicating some features common to many importers.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiImporterFlags_SupportTextFlavour ImporterFlags_SupportTextFlavour} - Indicates that there is a textual encoding of the file format; and that it is supported.</li>
     * <li>{@link #aiImporterFlags_SupportBinaryFlavour ImporterFlags_SupportBinaryFlavour} - Indicates that there is a binary encoding of the file format; and that it is supported.</li>
     * <li>{@link #aiImporterFlags_SupportCompressedFlavour ImporterFlags_SupportCompressedFlavour} - Indicates that there is a compressed encoding of the file format; and that it is supported.</li>
     * <li>{@link #aiImporterFlags_LimitedSupport ImporterFlags_LimitedSupport} - 
     * Indicates that the importer reads only a very particular subset of the file format. This happens commonly for declarative or procedural formats
     * which cannot easily be mapped to {@link AIScene}
     * </li>
     * <li>{@link #aiImporterFlags_Experimental ImporterFlags_Experimental} - 
     * Indicates that the importer is highly experimental and should be used with care. This only happens for trunk (i.e. SVN) versions, experimental code
     * is not included in releases.
     * </li>
     * </ul>
     */
    public static final int
        aiImporterFlags_SupportTextFlavour       = 0x1,
        aiImporterFlags_SupportBinaryFlavour     = 0x2,
        aiImporterFlags_SupportCompressedFlavour = 0x4,
        aiImporterFlags_LimitedSupport           = 0x8,
        aiImporterFlags_Experimental             = 0x10;

    /**
     * Enumerates all supported types of light sources. ({@code enum aiLightSourceType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiLightSource_UNDEFINED LightSource_UNDEFINED} - Undefined or unknown light source</li>
     * <li>{@link #aiLightSource_DIRECTIONAL LightSource_DIRECTIONAL} - A directional light source has a well-defined direction but is infinitely far away. That's quite a good approximation for sun light.</li>
     * <li>{@link #aiLightSource_POINT LightSource_POINT} - A point light source has a well-defined position in space but no direction - it emits light in all directions. A normal bulb is a point light.</li>
     * <li>{@link #aiLightSource_SPOT LightSource_SPOT} - 
     * A spot light source emits light in a specific angle. It has a position and a direction it is pointing to. A good example for a spot light is a
     * light spot in sport arenas.
     * </li>
     * <li>{@link #aiLightSource_AMBIENT LightSource_AMBIENT} - 
     * The generic light level of the world, including the bounces of all other light sources. Typically, there's at most one ambient light in a scene.
     * This light type doesn't have a valid position, direction, or other properties, just a color.
     * </li>
     * <li>{@link #aiLightSource_AREA LightSource_AREA} - 
     * An area light is a rectangle with predefined size that uniformly emits light from one of its sides. The position is center of the rectangle and
     * direction is its normal vector.
     * </li>
     * </ul>
     */
    public static final int
        aiLightSource_UNDEFINED   = 0x0,
        aiLightSource_DIRECTIONAL = 0x1,
        aiLightSource_POINT       = 0x2,
        aiLightSource_SPOT        = 0x3,
        aiLightSource_AMBIENT     = 0x4,
        aiLightSource_AREA        = 0x5;

    /** Name for default materials (2nd is used if meshes have UV coords) */
    public static final String AI_DEFAULT_MATERIAL_NAME = "DefaultMaterial";

    /**
     * Defines how the Nth texture of a specific type is combined with
     * the result of all previous layers.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiTextureOp_Multiply TextureOp_Multiply} - {@code T = T1 * T2}</li>
     * <li>{@link #aiTextureOp_Add TextureOp_Add} - {@code T = T1 + T2}</li>
     * <li>{@link #aiTextureOp_Subtract TextureOp_Subtract} - {@code T = T1 - T2}</li>
     * <li>{@link #aiTextureOp_Divide TextureOp_Divide} - {@code T = T1 / T2}</li>
     * <li>{@link #aiTextureOp_SmoothAdd TextureOp_SmoothAdd} - {@code T = (T1 + T2) - (T1 * T2)}</li>
     * <li>{@link #aiTextureOp_SignedAdd TextureOp_SignedAdd} - {@code T = T1 + (T2 - 0.5)}</li>
     * </ul>
     */
    public static final int
        aiTextureOp_Multiply  = 0x0,
        aiTextureOp_Add       = 0x1,
        aiTextureOp_Subtract  = 0x2,
        aiTextureOp_Divide    = 0x3,
        aiTextureOp_SmoothAdd = 0x4,
        aiTextureOp_SignedAdd = 0x5;

    /**
     * Defines how UV coordinates outside the [0...1] range are handled.
     * Commonly referred to as 'wrapping mode'.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiTextureMapMode_Wrap TextureMapMode_Wrap} - A texture coordinate {@code u|v} is translated to {@code u%1|v%1}</li>
     * <li>{@link #aiTextureMapMode_Clamp TextureMapMode_Clamp} - Texture coordinates outside {@code [0...1]} are clamped to the nearest valid value.</li>
     * <li>{@link #aiTextureMapMode_Decal TextureMapMode_Decal} - If the texture coordinates for a pixel are outside {@code [0...1]} the texture is not applied to that pixel</li>
     * <li>{@link #aiTextureMapMode_Mirror TextureMapMode_Mirror} - A texture coordinate {@code u|v} becomes {@code u%1|v%1} if {@code (u-(u%1))%2} is zero and {@code 1-(u%1)|1-(v%1)} otherwise</li>
     * </ul>
     */
    public static final int
        aiTextureMapMode_Wrap   = 0x0,
        aiTextureMapMode_Clamp  = 0x1,
        aiTextureMapMode_Decal  = 0x3,
        aiTextureMapMode_Mirror = 0x2;

    /**
     * Defines how the mapping coords for a texture are generated.
     * 
     * <p>Real-time applications typically require full UV coordinates, so the use of the {@link #aiProcess_GenUVCoords Process_GenUVCoords} step is highly recommended. It generates proper UV
     * channels for non-UV mapped objects, as long as an accurate description how the mapping should look like (e.g spherical) is given.</p>
     * 
     * <p>See the {@link #_AI_MATKEY_MAPPING_BASE} property for more details.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiTextureMapping_UV TextureMapping_UV} - 
     * The mapping coordinates are taken from an UV channel. The {@link #_AI_MATKEY_UVWSRC_BASE} property specifies from which UV channel the texture coordinates are
     * to be taken from (remember, meshes can have more than one UV channel).
     * </li>
     * <li>{@link #aiTextureMapping_SPHERE TextureMapping_SPHERE} - Spherical mapping</li>
     * <li>{@link #aiTextureMapping_CYLINDER TextureMapping_CYLINDER} - Cylindrical mapping</li>
     * <li>{@link #aiTextureMapping_BOX TextureMapping_BOX} - Cubic mapping</li>
     * <li>{@link #aiTextureMapping_PLANE TextureMapping_PLANE} - Planar mapping</li>
     * <li>{@link #aiTextureMapping_OTHER TextureMapping_OTHER} - Undefined mapping. Have fun.</li>
     * </ul>
     */
    public static final int
        aiTextureMapping_UV       = 0x0,
        aiTextureMapping_SPHERE   = 0x1,
        aiTextureMapping_CYLINDER = 0x2,
        aiTextureMapping_BOX      = 0x3,
        aiTextureMapping_PLANE    = 0x4,
        aiTextureMapping_OTHER    = 0x5;

    /**
     * Defines the purpose of a texture.
     * 
     * <p>This is a very difficult topic. Different 3D packages support different kinds of textures. For very common texture types, such as bumpmaps, the
     * rendering results depend on implementation details in the rendering pipelines of these applications. Assimp loads all texture references from the model
     * file and tries to determine which of the predefined texture types below is the best choice to match the original use of the texture as closely as
     * possible.</p>
     * 
     * <p>In content pipelines you'll usually define how textures have to be handled, and the artists working on models have to conform to this specification,
     * regardless which 3D tool they're using.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiTextureType_NONE TextureType_NONE} - 
     * Dummy value. No texture, but the value to be used as 'texture semantic' ({@link AIMaterialProperty}{@code ::mSemantic}) for all material properties *not*
     * related to textures.
     * </li>
     * <li>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE} - The texture is combined with the result of the diffuse lighting equation OR PBR Specular/Glossiness.</li>
     * <li>{@link #aiTextureType_SPECULAR TextureType_SPECULAR} - The texture is combined with the result of the specular lighting equation OR PBR Specular/Glossiness.</li>
     * <li>{@link #aiTextureType_AMBIENT TextureType_AMBIENT} - The texture is combined with the result of the ambient lighting equation.</li>
     * <li>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE} - The texture is added to the result of the lighting calculation. It isn't influenced by incoming light.</li>
     * <li>{@link #aiTextureType_HEIGHT TextureType_HEIGHT} - The texture is a height map. By convention, higher gray-scale values stand for higher elevations from the base height.</li>
     * <li>{@link #aiTextureType_NORMALS TextureType_NORMALS} - 
     * The texture is a (tangent space) normal-map. Again, there are several conventions for tangent-space normal maps. Assimp does (intentionally) not
     * distinguish here.
     * </li>
     * <li>{@link #aiTextureType_SHININESS TextureType_SHININESS} - 
     * The texture defines the glossiness of the material. The glossiness is in fact the exponent of the specular (phong) lighting equation. Usually there
     * is a conversion function defined to map the linear color values in the texture to a suitable exponent. Have fun.
     * </li>
     * <li>{@link #aiTextureType_OPACITY TextureType_OPACITY} - The texture defines per-pixel opacity. Usually 'white' means opaque and 'black' means 'transparency'. Or quite the opposite. Have fun.</li>
     * <li>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT} - Displacement texture. The exact purpose and format is application-dependent. Higher color values stand for higher vertex displacements.</li>
     * <li>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP} - 
     * Lightmap texture (aka Ambient Occlusion). Both 'Lightmaps' and dedicated 'ambient occlusion maps' are covered by this material property. The
     * texture contains a scaling value for the final color value of a pixel. Its intensity is not affected by incoming light.
     * </li>
     * <li>{@link #aiTextureType_REFLECTION TextureType_REFLECTION} - Reflection texture. Contains the color of a perfect mirror reflection. Rarely used, almost never for real-time applications.</li>
     * <li>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR} - PBR material.</li>
     * <li>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA} - PBR material.</li>
     * <li>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR} - PBR material.</li>
     * <li>{@link #aiTextureType_METALNESS TextureType_METALNESS} - PBR material.</li>
     * <li>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS} - PBR material.</li>
     * <li>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION} - PBR material.</li>
     * <li>{@link #aiTextureType_SHEEN TextureType_SHEEN} - 
     * Generally used to simulate textiles that are covered in a layer of microfibers eg velvet.
     * 
     * <p><a target="_blank" href="https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_materials_sheen">KHR_materials_sheen</a>)</p>
     * </li>
     * <li>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT} - 
     * Simulates a layer of 'polish' or 'laquer' layered on top of a PBR substrate.
     * 
     * <p><a target="_blank" href="https://autodesk.github.io/standard-surface/#closures/coating">coating</a>,
     * <a target="_blank" href="https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_materials_clearcoat">KHR_materials_clearcoat</a></p>
     * </li>
     * <li>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION} - 
     * Simulates transmission through the surface.
     * 
     * <p>May include further information such as wall thickness.</p>
     * </li>
     * <li>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN} - 
     * Unknown texture. A texture reference that does not match any of the definitions above is considered to be 'unknown'. It is still imported, but is
     * excluded from any further post-processing.
     * </li>
     * </ul>
     */
    public static final int
        aiTextureType_NONE              = 0,
        aiTextureType_DIFFUSE           = 1,
        aiTextureType_SPECULAR          = 2,
        aiTextureType_AMBIENT           = 3,
        aiTextureType_EMISSIVE          = 4,
        aiTextureType_HEIGHT            = 5,
        aiTextureType_NORMALS           = 6,
        aiTextureType_SHININESS         = 7,
        aiTextureType_OPACITY           = 8,
        aiTextureType_DISPLACEMENT      = 9,
        aiTextureType_LIGHTMAP          = 10,
        aiTextureType_REFLECTION        = 11,
        aiTextureType_BASE_COLOR        = 12,
        aiTextureType_NORMAL_CAMERA     = 13,
        aiTextureType_EMISSION_COLOR    = 14,
        aiTextureType_METALNESS         = 15,
        aiTextureType_DIFFUSE_ROUGHNESS = 16,
        aiTextureType_AMBIENT_OCCLUSION = 17,
        aiTextureType_SHEEN             = 19,
        aiTextureType_CLEARCOAT         = 20,
        aiTextureType_TRANSMISSION      = 21,
        aiTextureType_UNKNOWN           = 18;

    /**
     * Defines all shading models supported by the library. ({@code aiShadingMode})
     * 
     * <p>Property: {@link #AI_MATKEY_SHADING_MODEL}</p>
     * 
     * <p>The list of shading modes has been taken from Blender. See Blender documentation for more information. The API does not distinguish between "specular"
     * and "diffuse" shaders (thus the specular term for diffuse shading models like Oren-Nayar remains undefined).</p>
     * 
     * <p>Again, this value is just a hint. Assimp tries to select the shader whose most common implementation matches the original rendering results of the 3D
     * modeller which wrote a particular model as closely as possible.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiShadingMode_Flat ShadingMode_Flat} - Flat shading. Shading is done on per-face base, diffuse only. Also known as 'faceted shading'.</li>
     * <li>{@link #aiShadingMode_Gouraud ShadingMode_Gouraud} - Simple Gouraud shading.</li>
     * <li>{@link #aiShadingMode_Phong ShadingMode_Phong} - Phong-Shading</li>
     * <li>{@link #aiShadingMode_Blinn ShadingMode_Blinn} - Phong-Blinn-Shading</li>
     * <li>{@link #aiShadingMode_Toon ShadingMode_Toon} - Toon-Shading per pixel. Also known as 'comic' shader.</li>
     * <li>{@link #aiShadingMode_OrenNayar ShadingMode_OrenNayar} - OrenNayar-Shading per pixel. Extension to standard Lambertian shading, taking the roughness of the material into account</li>
     * <li>{@link #aiShadingMode_Minnaert ShadingMode_Minnaert} - Minnaert-Shading per pixel. Extension to standard Lambertian shading, taking the 'darkness' of the material into account</li>
     * <li>{@link #aiShadingMode_CookTorrance ShadingMode_CookTorrance} - CookTorrance-Shading per pixel. Special shader for metallic surfaces.</li>
     * <li>{@link #aiShadingMode_NoShading ShadingMode_NoShading} - No shading at all. Constant light influence of 1.0. Also known as "Unlit".</li>
     * <li>{@link #aiShadingMode_Unlit ShadingMode_Unlit}</li>
     * <li>{@link #aiShadingMode_Fresnel ShadingMode_Fresnel} - Fresnel shading</li>
     * <li>{@link #aiShadingMode_PBR_BRDF ShadingMode_PBR_BRDF} - 
     * Physically-Based Rendering (PBR) shading using Bidirectional scattering/reflectance distribution function (BSDF/BRDF)
     * 
     * <p>There are multiple methods under this banner, and model files may provide data for more than one PBR-BRDF method. Applications should use the set
     * of provided properties to determine which of their preferred PBR rendering methods are likely to be available eg:</p>
     * 
     * <ul>
     * <li>If {@link #AI_MATKEY_METALLIC_FACTOR} is set, then a Metallic/Roughness is available</li>
     * <li>If {@link #AI_MATKEY_GLOSSINESS_FACTOR} is set, then a Specular/Glossiness is available</li>
     * </ul>
     * 
     * <p>Note that some PBR methods allow layering of techniques.</p>
     * </li>
     * </ul>
     */
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

    /**
     * Defines some mixed flags for a particular texture.
     * 
     * <p>Usually you'll instruct your cg artists how textures have to look like and how they will be processed in your application. However, if you use Assimp
     * for completely generic loading purposes you might also need to process these flags in order to display as many 'unknown' 3D models as possible
     * correctly.</p>
     * 
     * <p>This corresponds to the {@link #_AI_MATKEY_TEXFLAGS_BASE} property.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiTextureFlags_Invert TextureFlags_Invert} - The texture's color values have to be inverted (component-wise 1-n)</li>
     * <li>{@link #aiTextureFlags_UseAlpha TextureFlags_UseAlpha} - 
     * Explicit request to the application to process the alpha channel of the texture. Mutually exclusive with {@link #aiTextureFlags_IgnoreAlpha TextureFlags_IgnoreAlpha}. These flags are
     * set if the library can say for sure that the alpha channel is used/is not used. If the model format does not define this, it is left to the
     * application to decide whether the texture alpha channel - if any - is evaluated or not.
     * </li>
     * <li>{@link #aiTextureFlags_IgnoreAlpha TextureFlags_IgnoreAlpha} - Explicit request to the application to ignore the alpha channel of the texture. Mutually exclusive with {@link #aiTextureFlags_UseAlpha TextureFlags_UseAlpha}.</li>
     * </ul>
     */
    public static final int
        aiTextureFlags_Invert      = 0x1,
        aiTextureFlags_UseAlpha    = 0x2,
        aiTextureFlags_IgnoreAlpha = 0x2;

    /**
     * Defines alpha-blend flags.
     * 
     * <p>If you're familiar with OpenGL or D3D, these flags aren't new to you. They define *how* the final color value of a pixel is computed, basing on the
     * previous color at that pixel and the new color value from the material.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiBlendMode_Default BlendMode_Default} - {@code SourceColor*SourceAlpha + DestColor*(1-SourceAlpha)}</li>
     * <li>{@link #aiBlendMode_Additive BlendMode_Additive} - {@code SourceColor*1 + DestColor*1}</li>
     * </ul>
     */
    public static final int
        aiBlendMode_Default  = 0x0,
        aiBlendMode_Additive = 0x1;

    /**
     * A very primitive RTTI system for the contents of material properties.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiPTI_Float PTI_Float} - Array of single-precision (32 Bit) floats</li>
     * <li>{@link #aiPTI_Double PTI_Double} - Array of double-precision (64 Bit) floats</li>
     * <li>{@link #aiPTI_String PTI_String} - The material property is an aiString.</li>
     * <li>{@link #aiPTI_Integer PTI_Integer} - Array of (32 Bit) integers</li>
     * <li>{@link #aiPTI_Buffer PTI_Buffer} - Simple binary buffer, content undefined. Not convertible to anything.</li>
     * </ul>
     */
    public static final int
        aiPTI_Float   = 0x1,
        aiPTI_Double  = 0x2,
        aiPTI_String  = 0x3,
        aiPTI_Integer = 0x4,
        aiPTI_Buffer  = 0x5;

    /** Material keys */
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

    /** PBR Material keys */
    public static final String
        AI_MATKEY_GLTF_ALPHAMODE               = "$mat.gltf.alphaMode",
        AI_MATKEY_GLTF_ALPHACUTOFF             = "$mat.gltf.alphaCutoff",
        _AI_MATKEY_GLTF_MAPPINGNAME_BASE       = "$tex.mappingname",
        _AI_MATKEY_GLTF_MAPPINGID_BASE         = "$tex.mappingid",
        _AI_MATKEY_GLTF_MAPPINGFILTER_MAG_BASE = "$tex.mappingfiltermag",
        _AI_MATKEY_GLTF_MAPPINGFILTER_MIN_BASE = "$tex.mappingfiltermin",
        _AI_MATKEY_GLTF_SCALE_BASE             = "$tex.scale",
        _AI_MATKEY_GLTF_STRENGTH_BASE          = "$tex.strength";

    /** Maximum number of indices per face (polygon). */
    public static final int AI_MAX_FACE_INDICES = 0x7FFF;

    /** Maximum number of indices per face (polygon). */
    public static final int AI_MAX_BONE_WEIGHTS = 0x7FFFFFFF;

    /** Maximum number of vertices per mesh. */
    public static final int AI_MAX_VERTICES = 0x7FFFFFFF;

    /** Maximum number of faces per mesh. */
    public static final int AI_MAX_FACES = 0x7FFFFFFF;

    /** Supported number of vertex color sets per mesh. */
    public static final int AI_MAX_NUMBER_OF_COLOR_SETS = 0x8;

    /** Supported number of texture coord sets (UV(W) channels) per mesh. */
    public static final int AI_MAX_NUMBER_OF_TEXTURECOORDS = 0x8;

    /**
     * Enumerates the types of geometric primitives supported by Assimp.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiPrimitiveType_POINT PrimitiveType_POINT} - A point primitive. This is just a single vertex in the virtual world, {@link AIFace} contains just one index for such a primitive.</li>
     * <li>{@link #aiPrimitiveType_LINE PrimitiveType_LINE} - A line primitive. This is a line defined through a start and an end position. {@link AIFace} contains exactly two indices for such a primitive.</li>
     * <li>{@link #aiPrimitiveType_TRIANGLE PrimitiveType_TRIANGLE} - A triangular primitive. A triangle consists of three indices.</li>
     * <li>{@link #aiPrimitiveType_POLYGON PrimitiveType_POLYGON} - 
     * A higher-level polygon with more than 3 edges. A triangle is a polygon, but polygon in this context means "all polygons that are not triangles".
     * The "Triangulate"-Step is provided for your convenience, it splits all polygons in triangles (which are much easier to handle).
     * </li>
     * <li>{@link #aiPrimitiveType_NGONEncodingFlag PrimitiveType_NGONEncodingFlag} - 
     * A flag to determine whether this triangles only mesh is NGON encoded.
     * 
     * <p>NGON encoding is a special encoding that tells whether 2 or more consecutive triangles should be considered as a triangle fan. This is identified
     * by looking at the first vertex index. 2 consecutive triangles with the same 1st vertex index are part of the same NGON.</p>
     * 
     * <p>At the moment, only quads (concave or convex) are supported, meaning that polygons are 'seen' as triangles, as usual after a triangulation pass.</p>
     * 
     * <p>To get an NGON encoded mesh, please use the {@link #aiProcess_Triangulate Process_Triangulate} post process.</p>
     * </li>
     * </ul>
     */
    public static final int
        aiPrimitiveType_POINT            = 0x1,
        aiPrimitiveType_LINE             = 0x2,
        aiPrimitiveType_TRIANGLE         = 0x4,
        aiPrimitiveType_POLYGON          = 0x8,
        aiPrimitiveType_NGONEncodingFlag = 0x10;

    /**
     * Enumerates the methods of mesh morphing supported by Assimp. ({@code enum aiMorphingMethod})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiMorphingMethod_VERTEX_BLEND MorphingMethod_VERTEX_BLEND} - Interpolation between morph targets.</li>
     * <li>{@link #aiMorphingMethod_MORPH_NORMALIZED MorphingMethod_MORPH_NORMALIZED} - Normalized morphing between morph targets.</li>
     * <li>{@link #aiMorphingMethod_MORPH_RELATIVE MorphingMethod_MORPH_RELATIVE} - Relative morphing between morph targets.</li>
     * </ul>
     */
    public static final int
        aiMorphingMethod_VERTEX_BLEND     = 0x1,
        aiMorphingMethod_MORPH_NORMALIZED = 0x2,
        aiMorphingMethod_MORPH_RELATIVE   = 0x3;

    /**
     * Enum used to distinguish data types. {@code aiMetadataType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #AI_BOOL AI_BOOL}</li>
     * <li>{@link #AI_INT32 AI_INT32}</li>
     * <li>{@link #AI_UINT64 AI_UINT64}</li>
     * <li>{@link #AI_FLOAT AI_FLOAT}</li>
     * <li>{@link #AI_DOUBLE AI_DOUBLE}</li>
     * <li>{@link #AI_AISTRING AI_AISTRING}</li>
     * <li>{@link #AI_AIVECTOR3D AI_AIVECTOR3D}</li>
     * <li>{@link #AI_AIMETADATA AI_AIMETADATA}</li>
     * <li>{@link #AI_META_MAX AI_META_MAX}</li>
     * </ul>
     */
    public static final int
        AI_BOOL       = 0,
        AI_INT32      = 1,
        AI_UINT64     = 2,
        AI_FLOAT      = 3,
        AI_DOUBLE     = 4,
        AI_AISTRING   = 5,
        AI_AIVECTOR3D = 6,
        AI_AIMETADATA = 7,
        AI_META_MAX   = 8;

    /**
     * Scene metadata holding the name of the importer which loaded the source asset.
     * 
     * <p>This is always present if the scene was created from an imported asset.</p>
     */
    public static final String AI_METADATA_SOURCE_FORMAT = "SourceAsset_Format";

    /**
     * Scene metadata holding the version of the source asset as a string, if available.
     * 
     * <p>Not all formats add this metadata.</p>
     */
    public static final String AI_METADATA_SOURCE_FORMAT_VERSION = "SourceAsset_FormatVersion";

    /**
     * Scene metadata holding the name of the software which generated the source asset, if available.
     * 
     * <p>Not all formats add this metadata.</p>
     */
    public static final String AI_METADATA_SOURCE_GENERATOR = "SourceAsset_Generator";

    /**
     * Scene metadata holding the source asset copyright statement, if available.
     * 
     * <p>Not all formats add this metadata.</p>
     */
    public static final String AI_METADATA_SOURCE_COPYRIGHT = "SourceAsset_Copyright";

    /**
     * Defines the flags for all possible post processing steps.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace} - 
     * Calculates the tangents and bitangents for the imported meshes.
     * 
     * <p>Does nothing if a mesh does not have normals. You might want this post processing step to be executed if you plan to use tangent space calculations
     * such as normal mapping  applied to the meshes. There's an importer property, {@link #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE}, which allows you to
     * specify a maximum smoothing angle for the algorithm. However, usually you'll want to leave it at the default value.</p>
     * </li>
     * <li>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices} - 
     * Identifies and joins identical vertex data sets within all imported meshes.
     * 
     * <p>After this step is run, each mesh contains unique vertices, so a vertex may be used by multiple faces. You usually want to use this post processing
     * step. If your application deals with indexed geometry, this step is compulsory or you'll just waste rendering time. <b>If this flag is not
     * specified</b>, no vertices are referenced by more than one face and <b>no index buffer is required</b> for rendering.</p>
     * </li>
     * <li>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded} - 
     * Converts all the imported data to a left-handed coordinate space.
     * 
     * <p>By default the data is returned in a right-handed coordinate space (which OpenGL prefers). In this space, +X points to the right, +Z points towards
     * the viewer, and +Y points upwards. In the DirectX coordinate space +X points to the right, +Y points upwards, and +Z points away from the viewer.</p>
     * 
     * <p>You'll probably want to consider this flag if you use Direct3D for rendering. The {@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded} flag supersedes this setting and
     * bundles all conversions typically required for D3D-based applications.</p>
     * </li>
     * <li>{@link #aiProcess_Triangulate Process_Triangulate} - 
     * Triangulates all faces of all meshes.
     * 
     * <p>By default the imported mesh data might contain faces with more than 3 indices. For rendering you'll usually want all faces to be triangles. This
     * post processing step splits up faces with more than 3 indices into triangles. Line and point primitives are *not* modified! If you want 'triangles
     * only' with no other kinds of primitives, try the following solution:</p>
     * 
     * <ul>
     * <li>Specify both {@link #aiProcess_Triangulate Process_Triangulate} and {@link #aiProcess_SortByPType Process_SortByPType}</li>
     * <li>Ignore all point and line meshes when you process assimp's output</li>
     * </ul>
     * </li>
     * <li>{@link #aiProcess_RemoveComponent Process_RemoveComponent} - 
     * Removes some parts of the data structure (animations, materials, light sources, cameras, textures, vertex components).
     * 
     * <p>The  components to be removed are specified in a separate importer property, {@link #AI_CONFIG_PP_RVC_FLAGS}. This is quite useful if you don't need
     * all parts of the output structure. Vertex colors are rarely used today for example... Calling this step to remove unneeded data from the pipeline
     * as early as possible results in increased performance and a more optimized output data structure. This step is also useful if you want to force
     * Assimp to recompute normals or tangents. The corresponding steps don't recompute them if they're already there (loaded from the source asset). By
     * using this step you can make sure they are NOT there.</p>
     * 
     * <p>This flag is a poor one, mainly because its purpose is usually misunderstood. Consider the following case: a 3D model has been exported from a CAD
     * app, and it has per-face vertex colors. Vertex positions can't be shared, thus the {@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices} step fails to optimize the data
     * because of these nasty little vertex colors. Most apps don't even process them, so it's all for nothing. By using this step, unneeded components
     * are excluded as early as possible thus opening more room for internal optimizations.</p>
     * </li>
     * <li>{@link #aiProcess_GenNormals Process_GenNormals} - 
     * Generates normals for all faces of all meshes.
     * 
     * <p>This is ignored if normals are already there at the time this flag is evaluated. Model importers try to load them from the source file, so they're
     * usually already there. Face normals are shared between all points of a single face, so a single point can have multiple normals, which forces the
     * library to duplicate vertices in some cases. {@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices} is *senseless* then.</p>
     * 
     * <p>This flag may not be specified together with {@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}.</p>
     * </li>
     * <li>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals} - 
     * Generates smooth normals for all vertices in the mesh.
     * 
     * <p>This is ignored if normals are already there at the time this flag is evaluated. Model importers try to load them from the source file, so they're
     * usually already there.</p>
     * 
     * <p>This flag may not be specified together with {@link #aiProcess_GenNormals Process_GenNormals}. There's a importer property, {@link #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE} which
     * allows you to specify an angle maximum for the normal smoothing algorithm. Normals exceeding this limit are not smoothed, resulting in a 'hard'
     * seam between two faces. Using a decent angle here (e.g. 80 degrees) results in very good visual appearance.</p>
     * </li>
     * <li>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes} - 
     * Splits large meshes into smaller sub-meshes.
     * 
     * <p>This is quite useful for real-time rendering, where the number of triangles which can be maximally processed in a single draw-call is limited by
     * the video driver/hardware. The maximum vertex buffer is usually limited too. Both requirements can be met with this step: you may specify both a
     * triangle and vertex limit for a single mesh.</p>
     * 
     * <p>The split limits can (and should!) be set through the {@link #AI_CONFIG_PP_SLM_VERTEX_LIMIT} and {@link #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT} importer
     * properties. The default values are {@link #AI_SLM_DEFAULT_MAX_VERTICES} and {@link #AI_SLM_DEFAULT_MAX_TRIANGLES}.</p>
     * 
     * <p>Note that splitting is generally a time-consuming task, but only if there's something to split. The use of this step is recommended for most users.</p>
     * </li>
     * <li>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices} - 
     * Removes the node graph and pre-transforms all vertices with the local transformation matrices of their nodes.
     * 
     * <p>If the resulting scene can be reduced to a single mesh, with a single material, no lights, and no cameras, then the output scene will contain only
     * a root node (with no children) that references the single mesh. Otherwise, the output scene will be reduced to a root node with a single level of
     * child nodes, each one referencing one mesh, and each mesh referencing one material.</p>
     * 
     * <p>In either case, for rendering, you can simply render all meshes in order - you don't need to pay attention to local transformations and the node
     * hierarchy. Animations are removed during this step.</p>
     * 
     * <p>This step is intended for applications without a scenegraph. The step CAN cause some problems: if e.g. a mesh of the asset contains normals and
     * another, using the same material index, does not, they will be brought together, but the first meshes's part of the normal list is zeroed. However,
     * these artifacts are rare.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The {@link #AI_CONFIG_PP_PTV_NORMALIZE} configuration property can be set to normalize the scene's spatial dimension to the {@code -1...1}
     * range.</p>
     * </div>
     * </li>
     * <li>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights} - 
     * Limits the number of bones simultaneously affecting a single vertex to a maximum value.
     * 
     * <p>If any vertex is affected by more than the maximum number of bones, the least important vertex weights are removed and the remaining vertex weights
     * are renormalized so that the weights still sum up to 1. The default bone weight limit is 4 (defined as {@link #AI_LBW_MAX_WEIGHTS} in config.h), but
     * you can use the {@link #AI_CONFIG_PP_LBW_MAX_WEIGHTS} importer property to supply your own limit to the post processing step.</p>
     * 
     * <p>If you intend to perform the skinning in hardware, this post processing step might be of interest to you.</p>
     * </li>
     * <li>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure} - 
     * Validates the imported scene data structure. This makes sure that all indices are valid, all animations and bones are linked correctly, all
     * material references are correct .. etc.
     * 
     * <p>It is recommended that you capture Assimp's log output if you use this flag, so you can easily find out what's wrong if a file fails the
     * validation. The validator is quite strict and will find *all* inconsistencies in the data structure... It is recommended that plugin developers use
     * it to debug their loaders. There are two types of validation failures:</p>
     * 
     * <ul>
     * <li>Error: There's something wrong with the imported data. Further postprocessing is not possible and the data is not usable at all. The import
     * fails. {@link #aiGetErrorString GetErrorString} carries the error message around.</li>
     * <li>Warning: There are some minor issues (e.g. 1000000 animation keyframes with the same time), but further postprocessing and use of the data
     * structure is still safe. Warning details are written to the log file, {@link #AI_SCENE_FLAGS_VALIDATION_WARNING} is set in
     * {@link AIScene}{@code ::mFlags}.</li>
     * </ul>
     * 
     * <p>This post-processing step is not time-consuming. Its use is not compulsory, but recommended.</p>
     * </li>
     * <li>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality} - 
     * Reorders triangles for better vertex cache locality.
     * 
     * <p>The step tries to improve the ACMR (average post-transform vertex cache miss ratio) for all meshes. The implementation runs in O(n) and is roughly
     * based on the 'tipsify' algorithm (see <a target="_blank" href="http://gfx.cs.princeton.edu/pubs/Sander_2007_%3ETR/tipsy.pdf">this paper</a>).</p>
     * 
     * <p>If you intend to render huge models in hardware, this step might be of interest to you. The {@link #AI_CONFIG_PP_ICL_PTCACHE_SIZE} importer property
     * can be used to fine-tune the cache optimization.</p>
     * </li>
     * <li>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials} - 
     * Searches for redundant/unreferenced materials and removes them.
     * 
     * <p>This is especially useful in combination with the {@link #aiProcess_PreTransformVertices Process_PreTransformVertices} and {@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes} flags. Both join small meshes with
     * equal characteristics, but they can't do their work if two meshes have different materials. Because several material settings are lost during
     * Assimp's import filters, (and because many exporters don't check for redundant materials), huge models often have materials which are are defined
     * several times with exactly the same settings.</p>
     * 
     * <p>Several material settings not contributing to the final appearance of a surface are ignored in all comparisons (e.g. the material name). So, if
     * you're passing additional information through the content pipeline (probably using *magic* material names), don't specify this flag. Alternatively
     * take a look at the {@link #AI_CONFIG_PP_RRM_EXCLUDE_LIST} importer property.</p>
     * </li>
     * <li>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals} - 
     * This step tries to determine which meshes have normal vectors that are facing inwards and inverts them.
     * 
     * <p>The algorithm is simple but effective: the bounding box of all vertices + their normals is compared against the volume of the bounding box of all
     * vertices without their normals. This works well for most objects, problems might occur with planar surfaces. However, the step tries to filter such
     * cases. The step inverts all in-facing normals. Generally it is recommended to enable this step, although the result is not always correct.</p>
     * </li>
     * <li>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData} - 
     * This step generically populates {@code aiBone->mArmature} and {@code aiBone->mNode}.
     * 
     * <p>The point of these is it saves you later having to calculate these elements. This is useful when handling rest information or skin information. If
     * you have multiple armatures on your models we strongly recommend enabling this. Instead of writing your own multi-root, multi-armature lookups we
     * have done the hard work for you.</p>
     * </li>
     * <li>{@link #aiProcess_SortByPType Process_SortByPType} - 
     * This step splits meshes with more than one primitive type in homogeneous sub-meshes.
     * 
     * <p>The step is executed after the triangulation step. After the step returns, just one bit is set in {@link AIMesh}{@code ::mPrimitiveTypes}. This is
     * especially useful for real-time rendering where point and line primitives are often ignored or rendered separately. You can use the
     * {@link #AI_CONFIG_PP_SBP_REMOVE} importer property to specify which primitive types you need. This can be used to easily exclude lines and points,
     * which are rarely used, from the import.</p>
     * </li>
     * <li>{@link #aiProcess_FindDegenerates Process_FindDegenerates} - 
     * This step searches all meshes for degenerate primitives and converts them to proper lines or points.
     * 
     * <p>A face is 'degenerate' if one or more of its points are identical. To have the degenerate stuff not only detected and collapsed but removed, try
     * one of the following procedures:</p>
     * 
     * <ol>
     * <li>(if you support lines and points for rendering but don't want the degenerates)
     * 
     * <ul>
     * <li>Specify the {@link #aiProcess_FindDegenerates Process_FindDegenerates} flag.</li>
     * <li>Set the {@link #AI_CONFIG_PP_FD_REMOVE} importer property to 1. This will cause the step to remove degenerate triangles from the import as
     * soon as they're detected. They won't pass any further pipeline steps.</li>
     * </ul></li>
     * <li>(if you don't support lines and points at all)
     * 
     * <ul>
     * <li>Specify the {@link #aiProcess_FindDegenerates Process_FindDegenerates} flag.</li>
     * <li>Specify the {@link #aiProcess_SortByPType Process_SortByPType} flag. This moves line and point primitives to separate meshes.</li>
     * <li>Set the {@link #AI_CONFIG_PP_SBP_REMOVE} importer property to <code>{@link #aiPrimitiveType_POINT PrimitiveType_POINT} | {@link #aiPrimitiveType_LINE PrimitiveType_LINE}</code> to cause
     * {@link #aiProcess_SortByPType Process_SortByPType} to reject point and line meshes from the scene.</li>
     * </ul></li>
     * </ol>
     * 
     * <p>This step also removes very small triangles with a surface area smaller than 10^-6. If you rely on having these small triangles, or notice holes in
     * your model, set the property {@link #AI_CONFIG_PP_FD_CHECKAREA} to {@code false}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Degenerate polygons are not necessarily evil and that's why they're not removed by default. There are several file formats which don't support
     * lines or points, and some exporters bypass the format specification and write them as degenerate triangles instead.</p></div>
     * </li>
     * <li>{@link #aiProcess_FindInvalidData Process_FindInvalidData} - 
     * This step searches all meshes for invalid data, such as zeroed normal vectors or invalid UV coords and removes/fixes them. This is intended to get
     * rid of some common exporter errors.
     * 
     * <p>This is especially useful for normals. If they are invalid, and the step recognizes this, they will be removed and can later be recomputed, i.e. by
     * the {@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals} flag.</p>
     * 
     * <p>The step will also remove meshes that are infinitely small and reduce animation tracks consisting of hundreds if redundant keys to a single key.
     * The {@link #AI_CONFIG_PP_FID_ANIM_ACCURACY} config property decides the accuracy of the check for duplicate animation tracks.</p>
     * </li>
     * <li>{@link #aiProcess_GenUVCoords Process_GenUVCoords} - 
     * This step converts non-UV mappings (such as spherical or cylindrical mapping) to proper texture coordinate channels.
     * 
     * <p>Most applications will support UV mapping only, so you will probably want to specify this step in every case. Note that Assimp is not always able
     * to match the original mapping implementation of the 3D app which produced a model perfectly. It's always better to let the modelling app compute
     * the UV channels - 3ds max, Maya, Blender, LightWave, and Modo do this for example.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If this step is not requested, you'll need to process the {@link #_AI_MATKEY_MAPPING_BASE} material property in order to display all assets
     * properly.</p>
     * </div>
     * </li>
     * <li>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords} - 
     * This step applies per-texture UV transformations and bakes them into stand-alone vtexture coordinate channels.
     * 
     * <p>UV transformations are specified per-texture - see the {@link #_AI_MATKEY_UVTRANSFORM_BASE} material key for more information. This step processes
     * all textures with transformed input UV coordinates and generates a new (pre-transformed) UV channel which replaces the old channel. Most
     * applications won't support UV transformations, so you will probably want to specify this step.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>UV transformations are usually implemented in real-time apps by transforming texture coordinates at vertex shader stage with a 3x3 (homogeneous)
     * transformation matrix.</p></div>
     * </li>
     * <li>{@link #aiProcess_FindInstances Process_FindInstances} - 
     * This step searches for duplicate meshes and replaces them with references to the first mesh.
     * 
     * <p>This step takes a while, so don't use it if speed is a concern. Its main purpose is to workaround the fact that many export file formats don't
     * support instanced meshes, so exporters need to duplicate meshes. This step removes the duplicates again. Please note that Assimp does not currently
     * support per-node material assignment to meshes, which means that identical meshes with different materials are currently *not* joined, although
     * this is planned for future versions.</p>
     * </li>
     * <li>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes} - 
     * A post-processing step to reduce the number of meshes.
     * 
     * <p>This will, in fact, reduce the number of draw calls.</p>
     * 
     * <p>This is a very effective optimization and is recommended to be used together with {@link #aiProcess_OptimizeGraph Process_OptimizeGraph}, if possible. The flag is fully compatible
     * with both {@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes} and {@link #aiProcess_SortByPType Process_SortByPType}.</p>
     * </li>
     * <li>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph} - 
     * A post-processing step to optimize the scene hierarchy.
     * 
     * <p>Nodes without animations, bones, lights or cameras assigned are collapsed and joined.</p>
     * 
     * <p>Node names can be lost during this step. If you use special 'tag nodes' to pass additional information through your content pipeline, use the
     * {@link #AI_CONFIG_PP_OG_EXCLUDE_LIST} importer property to specify a list of node names you want to be kept. Nodes matching one of the names in this
     * list won't be touched or modified.</p>
     * 
     * <p>Use this flag with caution. Most simple files will be collapsed to a single node, so complex hierarchies are usually completely lost. This is not
     * useful for editor environments, but probably a very effective optimization if you just want to get the model data, convert it to your own format,
     * and render it as fast as possible.</p>
     * 
     * <p>This flag is designed to be used with {@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes} for best results.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>'Crappy' scenes with thousands of extremely small meshes packed in deeply nested nodes exist for almost all file formats. {@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}
     * in combination with {@link #aiProcess_OptimizeGraph Process_OptimizeGraph} usually fixes them all and makes them renderable.</p>
     * </div>
     * </li>
     * <li>{@link #aiProcess_FlipUVs Process_FlipUVs} - 
     * This step flips all UV coordinates along the y-axis and adjusts material settings and bitangents accordingly.
     * 
     * <p><b>Output UV coordinate system:</b></p>
     * 
     * <pre><code>
     * 0y|0y ---------- 1x|0y
     *   |                |
     *   |                |
     *   |                |
     * 0x|1y ---------- 1x|1y</code></pre>
     * 
     * <p>You'll probably want to consider this flag if you use Direct3D for rendering. The {@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded} flag supersedes this setting and
     * bundles all conversions typically required for D3D-based applications.</p>
     * </li>
     * <li>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder} - 
     * This step adjusts the output face winding order to be CW.
     * 
     * <p>The default face winding order is counter clockwise (CCW).</p>
     * 
     * <p><b>Output face order:</b></p>
     * 
     * <pre><code>
     *     x2
     * 
     *                   x0
     * x1</code></pre>
     * </li>
     * <li>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount} - 
     * This step splits meshes with many bones into sub-meshes so that each sub-mesh has fewer or as many bones as a given limit.
     * </li>
     * <li>{@link #aiProcess_Debone Process_Debone} - 
     * This step removes bones losslessly or according to some threshold.
     * 
     * <p>In some cases (i.e. formats that require it) exporters are forced to assign dummy bone weights to otherwise static meshes assigned to animated
     * meshes. Full, weight-based skinning is expensive while animating nodes is extremely cheap, so this step is offered to clean up the data in that
     * regard.</p>
     * 
     * <p>Use {@link #AI_CONFIG_PP_DB_THRESHOLD} to control this. Use {@link #AI_CONFIG_PP_DB_ALL_OR_NONE} if you want bones removed if and only if all bones
     * within the scene qualify for removal.</p>
     * </li>
     * <li>{@link #aiProcess_GlobalScale Process_GlobalScale} - 
     * This step will perform a global scale of the model.
     * 
     * <p>Some importers are providing a mechanism to define a scaling unit for the model. This post processing step can be used to do so. You need to get
     * the global scaling from your importer settings like in FBX. Use the flag {@code AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY} from the global property table
     * to configure this.</p>
     * 
     * <p>Use {@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY} to setup the global scaling factor.</p>
     * </li>
     * <li>{@link #aiProcess_EmbedTextures Process_EmbedTextures} - 
     * A postprocessing step to embed of textures.
     * 
     * <p>This will remove external data dependencies for textures. If a texture's file does not exist at the specified path (due, for instance, to an
     * absolute path generated on another system), it will check if a file with the same name exists at the root folder of the imported model. And if so,
     * it uses that.</p>
     * </li>
     * <li>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</li>
     * <li>{@link #aiProcess_DropNormals Process_DropNormals} - 
     * Drops normals for all faces of all meshes.
     * 
     * <p>This is ignored if no normals are present.</p>
     * 
     * <p>Face normals are shared between all points of a single face, so a single point can have multiple normals, which forces the library to duplicate
     * vertices in some cases. {@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices} is <em>senseless</em> then. This process gives sense back to {@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}.</p>
     * </li>
     * <li>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</li>
     * </ul>
     */
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

    /**
     * Process Presets
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded} - 
     * Shortcut flag for Direct3D-based applications.
     * 
     * <p>Supersedes the {@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded} and {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder} flags. The output data matches Direct3D's conventions:
     * left-handed geometry, upper-left origin for UV coordinates and finally clockwise face order, suitable for CCW culling.</p>
     * </li>
     * <li>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast} - 
     * Default postprocess configuration optimizing the data for real-time rendering.
     * 
     * <p>Applications would want to use this preset to load models on end-user PCs, maybe for direct use in game.</p>
     * 
     * <p>If you're using DirectX, don't forget to combine this value with the {@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded} step. If you don't support UV transformations in
     * your application apply the {@link #aiProcess_TransformUVCoords Process_TransformUVCoords} step, too.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Please take the time to read the docs for the steps enabled by this preset. Some of them offer further configurable properties, while some of them
     * might not be of use for you so it might be better to not specify them.</p></div>
     * </li>
     * <li>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality} - 
     * Default postprocess configuration optimizing the data for real-time rendering.
     * 
     * <p>Unlike {@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}, this configuration performs some extra optimizations to improve rendering speed and to minimize memory
     * usage. It could be a good choice for a level editor environment where import speed is not so important.</p>
     * 
     * <p>If you're using DirectX, don't forget to combine this value with the {@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded} step. If you don't support UV transformations in
     * your application apply the {@link #aiProcess_TransformUVCoords Process_TransformUVCoords} step, too.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Please take the time to read the docs for the steps enabled by this preset. Some of them offer further configurable properties, while some of them
     * might not be of use for you so it might be better to not specify them.</p></div>
     * </li>
     * <li>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality} - 
     * Default postprocess configuration optimizing the data for real-time rendering.
     * 
     * <p>This preset enables almost every optimization step to achieve perfectly optimized data. It's your choice for level editor environments where import
     * speed is not important.</p>
     * 
     * <p>If you're using DirectX, don't forget to combine this value with the {@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded} step. If you don't support UV transformations in
     * your application, apply the {@link #aiProcess_TransformUVCoords Process_TransformUVCoords} step, too.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Please take the time to read the docs for the steps enabled by this preset. Some of them offer further configurable properties, while some of them
     * might not be of use for you so it might be better to not specify them.</p></div>
     * </li>
     * </ul>
     */
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

    /**
     * Specifies that the scene data structure that was imported is not complete.
     * This flag bypasses some internal validations and allows the import
     * of animation skeletons, material libraries or camera animation paths
     * using Assimp. Most applications won't support such data.
     */
    public static final int AI_SCENE_FLAGS_INCOMPLETE = 0x1;

    /**
     * This flag is set by the validation postprocess-step (aiPostProcess_ValidateDS)
     * if the validation is successful. In a validated scene you can be sure that
     * any cross references in the data structure (e.g. vertex indices) are valid.
     */
    public static final int AI_SCENE_FLAGS_VALIDATED = 0x2;

    /**
     * This flag is set by the validation postprocess-step (aiPostProcess_ValidateDS)
     * if the validation is successful but some issues have been found.
     * This can for example mean that a texture that does not exist is referenced
     * by a material or that the bone weights for a vertex don't sum to 1.0 ... .
     * In most cases you should still be able to use the import. This flag could
     * be useful for applications which don't capture Assimp's log output.
     */
    public static final int AI_SCENE_FLAGS_VALIDATION_WARNING = 0x4;

    /**
     * This flag is currently only set by the aiProcess_JoinIdenticalVertices step.
     * It indicates that the vertices of the output meshes aren't in the internal
     * verbose format anymore. In the verbose format all vertices are unique,
     * no vertex is ever referenced by more than one face.
     */
    public static final int AI_SCENE_FLAGS_NON_VERBOSE_FORMAT = 0x8;

    /**
     * Denotes pure height-map terrain data. Pure terrains usually consist of quads,
     * sometimes triangles, in a regular grid. The x,y coordinates of all vertex
     * positions refer to the x,y coordinates on the terrain height map, the z-axis
     * stores the elevation at a specific point.
     * 
     * <p>TER (Terragen) and HMP (3D Game Studio) are height map formats.
     * <b>Note</b>: Assimp is probably not the best choice for loading *huge* terrains -
     * fully triangulated data takes extremely much free store and should be avoided
     * as long as possible (typically you'll do the triangulation when you actually
     * need to render it).</p>
     */
    public static final int AI_SCENE_FLAGS_TERRAIN = 0x10;

    /** Assimp was compiled as a shared object (Windows: DLL) */
    public static final int ASSIMP_CFLAGS_SHARED = 0x1;

    /** Assimp was compiled against STLport */
    public static final int ASSIMP_CFLAGS_STLPORT = 0x2;

    /** Assimp was compiled as a debug build */
    public static final int ASSIMP_CFLAGS_DEBUG = 0x4;

    /** Assimp was compiled with {@code ASSIMP_BUILD_BOOST_WORKAROUND} defined */
    public static final int ASSIMP_CFLAGS_NOBOOST = 0x8;

    /** Assimp was compiled with {@code ASSIMP_BUILD_SINGLETHREADED} defined */
    public static final int ASSIMP_CFLAGS_SINGLETHREADED = 0x10;

    /** Assimp was compiled with {@code ASSIMP_DOUBLE_PRECISION} defined */
    public static final int ASSIMP_CFLAGS_DOUBLE_SUPPORT = 0x10;

    protected Assimp() {
        throw new UnsupportedOperationException();
    }

    // --- [ aiComponent_COLORSn ] ---

    /**
     * Remove a specific color channel 'n'
     *
     * @param n The color channel
     */
    public static int aiComponent_COLORSn(int n) {
        return 1 << (n + 20);
    }

    // --- [ aiComponent_TEXCOORDSn ] ---

    /**
     * Remove a specific UV channel 'n'
     *
     * @param n The UV channel
     */
    public static int aiComponent_TEXCOORDSn(int n) {
        return 1 << (n + 25);
    }

    // --- [ AI_DEG_TO_RAD ] ---

    /**
     * Tiny macro to convert from degrees to radians
     *
     * @param x The value in degrees
     */
    public static float AI_DEG_TO_RAD(float x) {
        return (x)*0.0174532925f;
    }

    // --- [ AI_RAD_TO_DEG ] ---

    /**
     * Tiny macro to convert from radians to degrees
     *
     * @param x The value in radians
     */
    public static float AI_RAD_TO_DEG(float x) {
        return (x)*57.2957795f;
    }

    // --- [ aiGetExportFormatCount ] ---

    /**
     * Returns the number of export file formats available in the current Assimp build. Use {@link #aiGetExportFormatDescription GetExportFormatDescription} to retrieve infos of a specific
     * export format.
     */
    @NativeType("size_t")
    public static long aiGetExportFormatCount() {
        long __functionAddress = Functions.GetExportFormatCount;
        return invokeP(__functionAddress);
    }

    // --- [ aiGetExportFormatDescription ] ---

    /** Unsafe version of: {@link #aiGetExportFormatDescription GetExportFormatDescription} */
    public static long naiGetExportFormatDescription(long pIndex) {
        long __functionAddress = Functions.GetExportFormatDescription;
        return invokePP(pIndex, __functionAddress);
    }

    /**
     * Returns a description of the nth export file format. Use {@link #aiGetExportFormatCount GetExportFormatCount} to learn how many export formats are supported. The description must
     * be released by calling {@link #aiReleaseExportFormatDescription ReleaseExportFormatDescription} afterwards.
     *
     * @param pIndex Index of the export format to retrieve information for. Valid range is 0 to {@link #aiGetExportFormatCount GetExportFormatCount}
     *
     * @return A description of that specific export format. {@code NULL} if {@code pIndex} is out of range.
     */
    @Nullable
    @NativeType("struct aiExportFormatDesc *")
    public static AIExportFormatDesc aiGetExportFormatDescription(@NativeType("size_t") long pIndex) {
        long __result = naiGetExportFormatDescription(pIndex);
        return AIExportFormatDesc.createSafe(__result);
    }

    // --- [ aiReleaseExportFormatDescription ] ---

    /** Unsafe version of: {@link #aiReleaseExportFormatDescription ReleaseExportFormatDescription} */
    public static void naiReleaseExportFormatDescription(long desc) {
        long __functionAddress = Functions.ReleaseExportFormatDescription;
        if (CHECKS) {
            AIExportFormatDesc.validate(desc);
        }
        invokePV(desc, __functionAddress);
    }

    /**
     * Release a description of the nth export file format. Must be returned by {@link #aiGetExportFormatDescription GetExportFormatDescription}.
     *
     * @param desc Pointer to the description
     */
    public static void aiReleaseExportFormatDescription(@NativeType("struct aiExportFormatDesc const *") AIExportFormatDesc desc) {
        naiReleaseExportFormatDescription(desc.address());
    }

    // --- [ aiCopyScene ] ---

    /** Unsafe version of: {@link #aiCopyScene CopyScene} */
    public static void naiCopyScene(long pIn, long pOut) {
        long __functionAddress = Functions.CopyScene;
        if (CHECKS) {
            AIScene.validate(pIn);
        }
        invokePPV(pIn, pOut, __functionAddress);
    }

    /**
     * Create a modifiable copy of a scene.
     * 
     * <p>This is useful to import files via Assimp, change their topology and export them again. Since the scene returned by the various importer functions is
     * const, a modifiable copy is needed.</p>
     *
     * @param pIn  Valid scene to be copied
     * @param pOut Receives a modifiable copy of the scene. Use {@link #aiFreeScene FreeScene} to delete it again.
     */
    public static void aiCopyScene(@NativeType("struct aiScene const *") AIScene pIn, @NativeType("struct aiScene **") PointerBuffer pOut) {
        if (CHECKS) {
            check(pOut, 1);
        }
        naiCopyScene(pIn.address(), memAddress(pOut));
    }

    /**
     * Create a modifiable copy of a scene.
     * 
     * <p>This is useful to import files via Assimp, change their topology and export them again. Since the scene returned by the various importer functions is
     * const, a modifiable copy is needed.</p>
     *
     * @param pIn Valid scene to be copied
     */
    @Nullable
    @NativeType("void")
    public static AIScene aiCopyScene(@NativeType("struct aiScene const *") AIScene pIn) {
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

    /** Unsafe version of: {@link #aiFreeScene FreeScene} */
    public static void naiFreeScene(long pIn) {
        long __functionAddress = Functions.FreeScene;
        if (CHECKS) {
            AIScene.validate(pIn);
        }
        invokePV(pIn, __functionAddress);
    }

    /**
     * Frees a scene copy created using {@link #aiCopyScene CopyScene}
     *
     * @param pIn Scene to be freed
     */
    public static void aiFreeScene(@NativeType("struct aiScene const *") AIScene pIn) {
        naiFreeScene(pIn.address());
    }

    // --- [ aiExportScene ] ---

    /** Unsafe version of: {@link #aiExportScene ExportScene} */
    public static int naiExportScene(long pScene, long pFormatId, long pFileName, int pPreProcessing) {
        long __functionAddress = Functions.ExportScene;
        if (CHECKS) {
            AIScene.validate(pScene);
        }
        return invokePPPI(pScene, pFormatId, pFileName, pPreProcessing, __functionAddress);
    }

    /**
     * Exports the given scene to a chosen file format and writes the result file(s) to disk.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Use {@link #aiCopyScene CopyScene} to get a modifiable copy of a previously imported scene.</p></div>
     *
     * @param pScene         The scene to export. Stays in possession of the caller, is not changed by the function. The scene is expected to conform to Assimp's Importer
     *                       output format as specified in the Data Structures Page. In short, this means the model data should use a right-handed coordinate systems, face
     *                       winding should be counter-clockwise and the UV coordinate origin is assumed to be in the upper left. If your input data uses different conventions,
     *                       have a look at the last parameter.
     * @param pFormatId      ID string to specify to which format you want to export to. Use {@link #aiGetExportFormatCount GetExportFormatCount} / {@link #aiGetExportFormatDescription GetExportFormatDescription} to learn which export
     *                       formats are available.
     * @param pFileName      Output file to write
     * @param pPreProcessing Accepts any choice of the {@code aiPostProcessSteps} enumerated flags, but in reality only a subset of them makes sense here. Specifying
     *                       'preprocessing' flags is useful if the input scene does not conform to Assimp's default conventions as specified in the Data Structures Page. In
     *                       short, this means the geometry data should use a right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate
     *                       origin is assumed to be in the upper left. The {@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder} flags are used in the import
     *                       side to allow users to have those defaults automatically adapted to their conventions. Specifying those flags for exporting has the opposite
     *                       effect, respectively. Some other of the {@code aiPostProcessSteps} enumerated values may be useful as well, but you'll need to try out what their
     *                       effect on the exported file is. Many formats impose their own restrictions on the structure of the geometry stored therein, so some preprocessing
     *                       may have little or no effect at all, or may be redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can
     *                       enforce it by specifying the {@link #aiProcess_Triangulate Process_Triangulate} flag, most export formats support only triangulate data so they would run the step anyway.
     *                       
     *                       <p>If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied using {@link #aiCopyScene CopyScene} and potentially
     *                       modified afterwards), any post-processing steps already applied to the scene will not be applied again, unless they show non-idempotent behavior
     *                       ({@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}). One or more of:<br></p><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     *
     * @return a status code indicating the result of the export
     */
    @NativeType("aiReturn")
    public static int aiExportScene(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") ByteBuffer pFormatId, @NativeType("char const *") ByteBuffer pFileName, @NativeType("unsigned int") int pPreProcessing) {
        if (CHECKS) {
            checkNT1(pFormatId);
            checkNT1(pFileName);
        }
        return naiExportScene(pScene.address(), memAddress(pFormatId), memAddress(pFileName), pPreProcessing);
    }

    /**
     * Exports the given scene to a chosen file format and writes the result file(s) to disk.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Use {@link #aiCopyScene CopyScene} to get a modifiable copy of a previously imported scene.</p></div>
     *
     * @param pScene         The scene to export. Stays in possession of the caller, is not changed by the function. The scene is expected to conform to Assimp's Importer
     *                       output format as specified in the Data Structures Page. In short, this means the model data should use a right-handed coordinate systems, face
     *                       winding should be counter-clockwise and the UV coordinate origin is assumed to be in the upper left. If your input data uses different conventions,
     *                       have a look at the last parameter.
     * @param pFormatId      ID string to specify to which format you want to export to. Use {@link #aiGetExportFormatCount GetExportFormatCount} / {@link #aiGetExportFormatDescription GetExportFormatDescription} to learn which export
     *                       formats are available.
     * @param pFileName      Output file to write
     * @param pPreProcessing Accepts any choice of the {@code aiPostProcessSteps} enumerated flags, but in reality only a subset of them makes sense here. Specifying
     *                       'preprocessing' flags is useful if the input scene does not conform to Assimp's default conventions as specified in the Data Structures Page. In
     *                       short, this means the geometry data should use a right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate
     *                       origin is assumed to be in the upper left. The {@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder} flags are used in the import
     *                       side to allow users to have those defaults automatically adapted to their conventions. Specifying those flags for exporting has the opposite
     *                       effect, respectively. Some other of the {@code aiPostProcessSteps} enumerated values may be useful as well, but you'll need to try out what their
     *                       effect on the exported file is. Many formats impose their own restrictions on the structure of the geometry stored therein, so some preprocessing
     *                       may have little or no effect at all, or may be redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can
     *                       enforce it by specifying the {@link #aiProcess_Triangulate Process_Triangulate} flag, most export formats support only triangulate data so they would run the step anyway.
     *                       
     *                       <p>If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied using {@link #aiCopyScene CopyScene} and potentially
     *                       modified afterwards), any post-processing steps already applied to the scene will not be applied again, unless they show non-idempotent behavior
     *                       ({@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}). One or more of:<br></p><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     *
     * @return a status code indicating the result of the export
     */
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

    /** Unsafe version of: {@link #aiExportSceneEx ExportSceneEx} */
    public static int naiExportSceneEx(long pScene, long pFormatId, long pFileName, long pIO, int pPreProcessing) {
        long __functionAddress = Functions.ExportSceneEx;
        if (CHECKS) {
            AIScene.validate(pScene);
            if (pIO != NULL) { AIFileIO.validate(pIO); }
        }
        return invokePPPPI(pScene, pFormatId, pFileName, pIO, pPreProcessing, __functionAddress);
    }

    /**
     * Exports the given scene to a chosen file format using custom IO logic supplied by you.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Use {@link #aiCopyScene CopyScene} to get a modifiable copy of a previously imported scene.</p></div>
     *
     * @param pScene         The scene to export. Stays in possession of the caller, is not changed by the function. The scene is expected to conform to Assimp's Importer
     *                       output format as specified in the Data Structures Page. In short, this means the model data should use a right-handed coordinate systems, face
     *                       winding should be counter-clockwise and the UV coordinate origin is assumed to be in the upper left. If your input data uses different conventions,
     *                       have a look at the last parameter.
     * @param pFormatId      ID string to specify to which format you want to export to. Use {@link #aiGetExportFormatCount GetExportFormatCount} / {@link #aiGetExportFormatDescription GetExportFormatDescription} to learn which export
     *                       formats are available.
     * @param pFileName      Output file to write
     * @param pIO            custom IO implementation to be used. Use this if you use your own storage methods. If none is supplied, a default implementation using standard
     *                       file IO is used. Note that {@link #aiExportSceneToBlob ExportSceneToBlob} is provided as convenience function to export to memory buffers.
     * @param pPreProcessing Accepts any choice of the {@code aiPostProcessSteps} enumerated flags, but in reality only a subset of them makes sense here. Specifying
     *                       'preprocessing' flags is useful if the input scene does not conform to Assimp's default conventions as specified in the Data Structures Page. In
     *                       short, this means the geometry data should use a right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate
     *                       origin is assumed to be in the upper left. The {@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder} flags are used in the import
     *                       side to allow users to have those defaults automatically adapted to their conventions. Specifying those flags for exporting has the opposite
     *                       effect, respectively. Some other of the {@code aiPostProcessSteps} enumerated values may be useful as well, but you'll need to try out what their
     *                       effect on the exported file is. Many formats impose their own restrictions on the structure of the geometry stored therein, so some preprocessing
     *                       may have little or no effect at all, or may be redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can
     *                       enforce it by specifying the {@link #aiProcess_Triangulate Process_Triangulate} flag, most export formats support only triangulate data so they would run the step anyway.
     *                       
     *                       <p>If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied using {@link #aiCopyScene CopyScene} and potentially
     *                       modified afterwards), any post-processing steps already applied to the scene will not be applied again, unless they show non-idempotent behavior
     *                       ({@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}). One or more of:<br></p><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     *
     * @return a status code indicating the result of the export
     */
    @NativeType("aiReturn")
    public static int aiExportSceneEx(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") ByteBuffer pFormatId, @NativeType("char const *") ByteBuffer pFileName, @Nullable @NativeType("struct aiFileIO const *") AIFileIO pIO, @NativeType("unsigned int") int pPreProcessing) {
        if (CHECKS) {
            checkNT1(pFormatId);
            checkNT1(pFileName);
        }
        return naiExportSceneEx(pScene.address(), memAddress(pFormatId), memAddress(pFileName), memAddressSafe(pIO), pPreProcessing);
    }

    /**
     * Exports the given scene to a chosen file format using custom IO logic supplied by you.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Use {@link #aiCopyScene CopyScene} to get a modifiable copy of a previously imported scene.</p></div>
     *
     * @param pScene         The scene to export. Stays in possession of the caller, is not changed by the function. The scene is expected to conform to Assimp's Importer
     *                       output format as specified in the Data Structures Page. In short, this means the model data should use a right-handed coordinate systems, face
     *                       winding should be counter-clockwise and the UV coordinate origin is assumed to be in the upper left. If your input data uses different conventions,
     *                       have a look at the last parameter.
     * @param pFormatId      ID string to specify to which format you want to export to. Use {@link #aiGetExportFormatCount GetExportFormatCount} / {@link #aiGetExportFormatDescription GetExportFormatDescription} to learn which export
     *                       formats are available.
     * @param pFileName      Output file to write
     * @param pIO            custom IO implementation to be used. Use this if you use your own storage methods. If none is supplied, a default implementation using standard
     *                       file IO is used. Note that {@link #aiExportSceneToBlob ExportSceneToBlob} is provided as convenience function to export to memory buffers.
     * @param pPreProcessing Accepts any choice of the {@code aiPostProcessSteps} enumerated flags, but in reality only a subset of them makes sense here. Specifying
     *                       'preprocessing' flags is useful if the input scene does not conform to Assimp's default conventions as specified in the Data Structures Page. In
     *                       short, this means the geometry data should use a right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate
     *                       origin is assumed to be in the upper left. The {@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder} flags are used in the import
     *                       side to allow users to have those defaults automatically adapted to their conventions. Specifying those flags for exporting has the opposite
     *                       effect, respectively. Some other of the {@code aiPostProcessSteps} enumerated values may be useful as well, but you'll need to try out what their
     *                       effect on the exported file is. Many formats impose their own restrictions on the structure of the geometry stored therein, so some preprocessing
     *                       may have little or no effect at all, or may be redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can
     *                       enforce it by specifying the {@link #aiProcess_Triangulate Process_Triangulate} flag, most export formats support only triangulate data so they would run the step anyway.
     *                       
     *                       <p>If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied using {@link #aiCopyScene CopyScene} and potentially
     *                       modified afterwards), any post-processing steps already applied to the scene will not be applied again, unless they show non-idempotent behavior
     *                       ({@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}). One or more of:<br></p><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     *
     * @return a status code indicating the result of the export
     */
    @NativeType("aiReturn")
    public static int aiExportSceneEx(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") CharSequence pFormatId, @NativeType("char const *") CharSequence pFileName, @Nullable @NativeType("struct aiFileIO const *") AIFileIO pIO, @NativeType("unsigned int") int pPreProcessing) {
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

    /** Unsafe version of: {@link #aiExportSceneToBlob ExportSceneToBlob} */
    public static long naiExportSceneToBlob(long pScene, long pFormatId, int pPreProcessing) {
        long __functionAddress = Functions.ExportSceneToBlob;
        if (CHECKS) {
            AIScene.validate(pScene);
        }
        return invokePPP(pScene, pFormatId, pPreProcessing, __functionAddress);
    }

    /**
     * Exports the given scene to a chosen file format. Returns the exported data as a binary blob which you can write into a file or something. When you're
     * done with the data, use {@link #aiReleaseExportBlob ReleaseExportBlob} to free the resources associated with the export.
     *
     * @param pScene         The scene to export. Stays in possession of the caller, is not changed by the function. The scene is expected to conform to Assimp's Importer
     *                       output format as specified in the Data Structures Page. In short, this means the model data should use a right-handed coordinate systems, face
     *                       winding should be counter-clockwise and the UV coordinate origin is assumed to be in the upper left. If your input data uses different conventions,
     *                       have a look at the last parameter.
     * @param pFormatId      ID string to specify to which format you want to export to. Use {@link #aiGetExportFormatCount GetExportFormatCount} / {@link #aiGetExportFormatDescription GetExportFormatDescription} to learn which export
     *                       formats are available.
     * @param pPreProcessing Accepts any choice of the {@code aiPostProcessSteps} enumerated flags, but in reality only a subset of them makes sense here. Specifying
     *                       'preprocessing' flags is useful if the input scene does not conform to Assimp's default conventions as specified in the Data Structures Page. In
     *                       short, this means the geometry data should use a right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate
     *                       origin is assumed to be in the upper left. The {@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder} flags are used in the import
     *                       side to allow users to have those defaults automatically adapted to their conventions. Specifying those flags for exporting has the opposite
     *                       effect, respectively. Some other of the {@code aiPostProcessSteps} enumerated values may be useful as well, but you'll need to try out what their
     *                       effect on the exported file is. Many formats impose their own restrictions on the structure of the geometry stored therein, so some preprocessing
     *                       may have little or no effect at all, or may be redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can
     *                       enforce it by specifying the {@link #aiProcess_Triangulate Process_Triangulate} flag, most export formats support only triangulate data so they would run the step anyway.
     *                       
     *                       <p>If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied using {@link #aiCopyScene CopyScene} and potentially
     *                       modified afterwards), any post-processing steps already applied to the scene will not be applied again, unless they show non-idempotent behavior
     *                       ({@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}). One or more of:<br></p><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     *
     * @return the exported data or {@code NULL} in case of error
     */
    @Nullable
    @NativeType("struct aiExportDataBlob *")
    public static AIExportDataBlob aiExportSceneToBlob(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") ByteBuffer pFormatId, @NativeType("unsigned int") int pPreProcessing) {
        if (CHECKS) {
            checkNT1(pFormatId);
        }
        long __result = naiExportSceneToBlob(pScene.address(), memAddress(pFormatId), pPreProcessing);
        return AIExportDataBlob.createSafe(__result);
    }

    /**
     * Exports the given scene to a chosen file format. Returns the exported data as a binary blob which you can write into a file or something. When you're
     * done with the data, use {@link #aiReleaseExportBlob ReleaseExportBlob} to free the resources associated with the export.
     *
     * @param pScene         The scene to export. Stays in possession of the caller, is not changed by the function. The scene is expected to conform to Assimp's Importer
     *                       output format as specified in the Data Structures Page. In short, this means the model data should use a right-handed coordinate systems, face
     *                       winding should be counter-clockwise and the UV coordinate origin is assumed to be in the upper left. If your input data uses different conventions,
     *                       have a look at the last parameter.
     * @param pFormatId      ID string to specify to which format you want to export to. Use {@link #aiGetExportFormatCount GetExportFormatCount} / {@link #aiGetExportFormatDescription GetExportFormatDescription} to learn which export
     *                       formats are available.
     * @param pPreProcessing Accepts any choice of the {@code aiPostProcessSteps} enumerated flags, but in reality only a subset of them makes sense here. Specifying
     *                       'preprocessing' flags is useful if the input scene does not conform to Assimp's default conventions as specified in the Data Structures Page. In
     *                       short, this means the geometry data should use a right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate
     *                       origin is assumed to be in the upper left. The {@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder} flags are used in the import
     *                       side to allow users to have those defaults automatically adapted to their conventions. Specifying those flags for exporting has the opposite
     *                       effect, respectively. Some other of the {@code aiPostProcessSteps} enumerated values may be useful as well, but you'll need to try out what their
     *                       effect on the exported file is. Many formats impose their own restrictions on the structure of the geometry stored therein, so some preprocessing
     *                       may have little or no effect at all, or may be redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can
     *                       enforce it by specifying the {@link #aiProcess_Triangulate Process_Triangulate} flag, most export formats support only triangulate data so they would run the step anyway.
     *                       
     *                       <p>If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied using {@link #aiCopyScene CopyScene} and potentially
     *                       modified afterwards), any post-processing steps already applied to the scene will not be applied again, unless they show non-idempotent behavior
     *                       ({@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}, {@link #aiProcess_FlipUVs Process_FlipUVs} and {@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}). One or more of:<br></p><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     *
     * @return the exported data or {@code NULL} in case of error
     */
    @Nullable
    @NativeType("struct aiExportDataBlob *")
    public static AIExportDataBlob aiExportSceneToBlob(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("char const *") CharSequence pFormatId, @NativeType("unsigned int") int pPreProcessing) {
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

    /** Unsafe version of: {@link #aiReleaseExportBlob ReleaseExportBlob} */
    public static void naiReleaseExportBlob(long pData) {
        long __functionAddress = Functions.ReleaseExportBlob;
        if (CHECKS) {
            AIExportDataBlob.validate(pData);
        }
        invokePV(pData, __functionAddress);
    }

    /**
     * Releases the memory associated with the given exported data. Use this function to free a data blob returned by {@link #aiExportSceneToBlob ExportSceneToBlob}.
     *
     * @param pData the data blob returned by {@link #aiExportSceneToBlob ExportSceneToBlob}
     */
    public static void aiReleaseExportBlob(@NativeType("struct aiExportDataBlob const *") AIExportDataBlob pData) {
        naiReleaseExportBlob(pData.address());
    }

    // --- [ aiImportFile ] ---

    /** Unsafe version of: {@link #aiImportFile ImportFile} */
    public static long naiImportFile(long pFile, int pFlags) {
        long __functionAddress = Functions.ImportFile;
        return invokePP(pFile, pFlags, __functionAddress);
    }

    /**
     * Reads the given file and returns its content.
     * 
     * <p>If the call succeeds, the imported data is returned in an {@link AIScene} structure. The data is intended to be read-only, it stays property of the ASSIMP
     * library and will be stable until {@link #aiReleaseImport ReleaseImport} is called. After you're done with it, call {@link #aiReleaseImport ReleaseImport} to free the resources associated with
     * this file. If the import fails, {@code NULL} is returned instead. Call {@link #aiGetErrorString GetErrorString} to retrieve a human-readable error text.</p>
     *
     * @param pFile  Path and filename of the file to be imported
     * @param pFlags Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *               your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     *
     * @return Pointer to the imported data or {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFile(@NativeType("char const *") ByteBuffer pFile, @NativeType("unsigned int") int pFlags) {
        if (CHECKS) {
            checkNT1(pFile);
        }
        long __result = naiImportFile(memAddress(pFile), pFlags);
        return AIScene.createSafe(__result);
    }

    /**
     * Reads the given file and returns its content.
     * 
     * <p>If the call succeeds, the imported data is returned in an {@link AIScene} structure. The data is intended to be read-only, it stays property of the ASSIMP
     * library and will be stable until {@link #aiReleaseImport ReleaseImport} is called. After you're done with it, call {@link #aiReleaseImport ReleaseImport} to free the resources associated with
     * this file. If the import fails, {@code NULL} is returned instead. Call {@link #aiGetErrorString GetErrorString} to retrieve a human-readable error text.</p>
     *
     * @param pFile  Path and filename of the file to be imported
     * @param pFlags Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *               your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     *
     * @return Pointer to the imported data or {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFile(@NativeType("char const *") CharSequence pFile, @NativeType("unsigned int") int pFlags) {
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

    /** Unsafe version of: {@link #aiImportFileEx ImportFileEx} */
    public static long naiImportFileEx(long pFile, int pFlags, long pFS) {
        long __functionAddress = Functions.ImportFileEx;
        if (CHECKS) {
            if (pFS != NULL) { AIFileIO.validate(pFS); }
        }
        return invokePPP(pFile, pFlags, pFS, __functionAddress);
    }

    /**
     * Reads the given file using user-defined I/O functions and returns its content.
     * 
     * <p>If the call succeeds, the imported data is returned in an {@link AIScene} structure. The data is intended to be read-only, it stays property of the ASSIMP
     * library and will be stable until {@link #aiReleaseImport ReleaseImport} is called. After you're done with it, call {@link #aiReleaseImport ReleaseImport} to free the resources associated with
     * this file. If the import fails, {@code NULL} is returned instead. Call {@link #aiGetErrorString GetErrorString} to retrieve a human-readable error text.</p>
     *
     * @param pFile  Path and filename of the file to be imported
     * @param pFlags Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *               your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     * @param pFS    Will be used to open the model file itself and any other files the loader needs to open. Pass {@code NULL} to use the default implementation.
     *
     * @return Pointer to the imported data or {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFileEx(@NativeType("char const *") ByteBuffer pFile, @NativeType("unsigned int") int pFlags, @Nullable @NativeType("struct aiFileIO *") AIFileIO pFS) {
        if (CHECKS) {
            checkNT1(pFile);
        }
        long __result = naiImportFileEx(memAddress(pFile), pFlags, memAddressSafe(pFS));
        return AIScene.createSafe(__result);
    }

    /**
     * Reads the given file using user-defined I/O functions and returns its content.
     * 
     * <p>If the call succeeds, the imported data is returned in an {@link AIScene} structure. The data is intended to be read-only, it stays property of the ASSIMP
     * library and will be stable until {@link #aiReleaseImport ReleaseImport} is called. After you're done with it, call {@link #aiReleaseImport ReleaseImport} to free the resources associated with
     * this file. If the import fails, {@code NULL} is returned instead. Call {@link #aiGetErrorString GetErrorString} to retrieve a human-readable error text.</p>
     *
     * @param pFile  Path and filename of the file to be imported
     * @param pFlags Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *               your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     * @param pFS    Will be used to open the model file itself and any other files the loader needs to open. Pass {@code NULL} to use the default implementation.
     *
     * @return Pointer to the imported data or {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFileEx(@NativeType("char const *") CharSequence pFile, @NativeType("unsigned int") int pFlags, @Nullable @NativeType("struct aiFileIO *") AIFileIO pFS) {
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

    /** Unsafe version of: {@link #aiImportFileExWithProperties ImportFileExWithProperties} */
    public static long naiImportFileExWithProperties(long pFile, int pFlags, long pFS, long pProps) {
        long __functionAddress = Functions.ImportFileExWithProperties;
        if (CHECKS) {
            if (pFS != NULL) { AIFileIO.validate(pFS); }
        }
        return invokePPPP(pFile, pFlags, pFS, pProps, __functionAddress);
    }

    /**
     * Same as {@link #aiImportFileEx ImportFileEx}, but adds an extra parameter containing importer settings.
     *
     * @param pFile  Path and filename of the file to be imported
     * @param pFlags Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *               your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     * @param pFS    Will be used to open the model file itself and any other files the loader needs to open. Pass {@code NULL} to use the default implementation.
     * @param pProps {@link AIPropertyStore} instance containing import settings.
     *
     * @return Pointer to the imported data or {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFileExWithProperties(@NativeType("char const *") ByteBuffer pFile, @NativeType("unsigned int") int pFlags, @Nullable @NativeType("struct aiFileIO *") AIFileIO pFS, @NativeType("struct aiPropertyStore const *") AIPropertyStore pProps) {
        if (CHECKS) {
            checkNT1(pFile);
        }
        long __result = naiImportFileExWithProperties(memAddress(pFile), pFlags, memAddressSafe(pFS), pProps.address());
        return AIScene.createSafe(__result);
    }

    /**
     * Same as {@link #aiImportFileEx ImportFileEx}, but adds an extra parameter containing importer settings.
     *
     * @param pFile  Path and filename of the file to be imported
     * @param pFlags Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *               your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     * @param pFS    Will be used to open the model file itself and any other files the loader needs to open. Pass {@code NULL} to use the default implementation.
     * @param pProps {@link AIPropertyStore} instance containing import settings.
     *
     * @return Pointer to the imported data or {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFileExWithProperties(@NativeType("char const *") CharSequence pFile, @NativeType("unsigned int") int pFlags, @Nullable @NativeType("struct aiFileIO *") AIFileIO pFS, @NativeType("struct aiPropertyStore const *") AIPropertyStore pProps) {
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

    /**
     * Unsafe version of: {@link #aiImportFileFromMemory ImportFileFromMemory}
     *
     * @param pLength Length of pBuffer, in bytes
     */
    public static long naiImportFileFromMemory(long pBuffer, int pLength, int pFlags, long pHint) {
        long __functionAddress = Functions.ImportFileFromMemory;
        return invokePPP(pBuffer, pLength, pFlags, pHint, __functionAddress);
    }

    /**
     * Reads the given file from a given memory buffer.
     * 
     * <p>If the call succeeds, the contents of the file are returned as a pointer to an {@link AIScene} object. The returned data is intended to be read-only, the
     * importer keeps ownership of the data and will destroy it upon destruction. If the import fails, {@code NULL} is returned. A human-readable error description
     * can be retrieved by calling {@link #aiGetErrorString GetErrorString}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This is a straightforward way to decode models from memory buffers, but it doesn't handle model formats that spread their data across multiple files or
     * even directories. Examples include OBJ or MD3, which outsource parts of their material info into external scripts. If you need full functionality,
     * provide a custom IOSystem to make Assimp find these files and use the regular {@link #aiImportFileEx ImportFileEx}/{@link #aiImportFileExWithProperties ImportFileExWithProperties} API.</p>
     * </div>
     *
     * @param pBuffer Pointer to the file data
     * @param pFlags  Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *                your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     * @param pHint   An additional hint to the library. If this is a non empty string, the library looks for a loader to support the file extension specified by
     *                {@code pHint} and passes the file to the first matching loader. If this loader is unable to completely the request, the library continues and tries
     *                to determine the file format on its own, a task that may or may not be successful. Check the return value, and you'll know ...
     *
     * @return A pointer to the imported data, {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFileFromMemory(@NativeType("char const *") ByteBuffer pBuffer, @NativeType("unsigned int") int pFlags, @Nullable @NativeType("char const *") ByteBuffer pHint) {
        if (CHECKS) {
            checkNT1Safe(pHint);
        }
        long __result = naiImportFileFromMemory(memAddress(pBuffer), pBuffer.remaining(), pFlags, memAddressSafe(pHint));
        return AIScene.createSafe(__result);
    }

    /**
     * Reads the given file from a given memory buffer.
     * 
     * <p>If the call succeeds, the contents of the file are returned as a pointer to an {@link AIScene} object. The returned data is intended to be read-only, the
     * importer keeps ownership of the data and will destroy it upon destruction. If the import fails, {@code NULL} is returned. A human-readable error description
     * can be retrieved by calling {@link #aiGetErrorString GetErrorString}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This is a straightforward way to decode models from memory buffers, but it doesn't handle model formats that spread their data across multiple files or
     * even directories. Examples include OBJ or MD3, which outsource parts of their material info into external scripts. If you need full functionality,
     * provide a custom IOSystem to make Assimp find these files and use the regular {@link #aiImportFileEx ImportFileEx}/{@link #aiImportFileExWithProperties ImportFileExWithProperties} API.</p>
     * </div>
     *
     * @param pBuffer Pointer to the file data
     * @param pFlags  Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *                your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     * @param pHint   An additional hint to the library. If this is a non empty string, the library looks for a loader to support the file extension specified by
     *                {@code pHint} and passes the file to the first matching loader. If this loader is unable to completely the request, the library continues and tries
     *                to determine the file format on its own, a task that may or may not be successful. Check the return value, and you'll know ...
     *
     * @return A pointer to the imported data, {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFileFromMemory(@NativeType("char const *") ByteBuffer pBuffer, @NativeType("unsigned int") int pFlags, @Nullable @NativeType("char const *") CharSequence pHint) {
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

    /**
     * Unsafe version of: {@link #aiImportFileFromMemoryWithProperties ImportFileFromMemoryWithProperties}
     *
     * @param pLength Length of pBuffer, in bytes
     */
    public static long naiImportFileFromMemoryWithProperties(long pBuffer, int pLength, int pFlags, long pHint, long pProps) {
        long __functionAddress = Functions.ImportFileFromMemoryWithProperties;
        return invokePPPP(pBuffer, pLength, pFlags, pHint, pProps, __functionAddress);
    }

    /**
     * Same as {@link #aiImportFileFromMemory ImportFileFromMemory}, but adds an extra parameter containing importer settings.
     *
     * @param pBuffer Pointer to the file data
     * @param pFlags  Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *                your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     * @param pHint   An additional hint to the library. If this is a non empty string, the library looks for a loader to support the file extension specified by
     *                {@code pHint} and passes the file to the first matching loader. If this loader is unable to completely the request, the library continues and tries
     *                to determine the file format on its own, a task that may or may not be successful. Check the return value, and you'll know ...
     * @param pProps  {@link AIPropertyStore} instance containing import settings.
     *
     * @return A pointer to the imported data, {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFileFromMemoryWithProperties(@NativeType("char const *") ByteBuffer pBuffer, @NativeType("unsigned int") int pFlags, @Nullable @NativeType("char const *") ByteBuffer pHint, @NativeType("struct aiPropertyStore const *") AIPropertyStore pProps) {
        if (CHECKS) {
            checkNT1Safe(pHint);
        }
        long __result = naiImportFileFromMemoryWithProperties(memAddress(pBuffer), pBuffer.remaining(), pFlags, memAddressSafe(pHint), pProps.address());
        return AIScene.createSafe(__result);
    }

    /**
     * Same as {@link #aiImportFileFromMemory ImportFileFromMemory}, but adds an extra parameter containing importer settings.
     *
     * @param pBuffer Pointer to the file data
     * @param pFlags  Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
     *                your post-processing setup, consider to use {@link #aiApplyPostProcessing ApplyPostProcessing}. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     * @param pHint   An additional hint to the library. If this is a non empty string, the library looks for a loader to support the file extension specified by
     *                {@code pHint} and passes the file to the first matching loader. If this loader is unable to completely the request, the library continues and tries
     *                to determine the file format on its own, a task that may or may not be successful. Check the return value, and you'll know ...
     * @param pProps  {@link AIPropertyStore} instance containing import settings.
     *
     * @return A pointer to the imported data, {@code NULL} if the import failed.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiImportFileFromMemoryWithProperties(@NativeType("char const *") ByteBuffer pBuffer, @NativeType("unsigned int") int pFlags, @Nullable @NativeType("char const *") CharSequence pHint, @NativeType("struct aiPropertyStore const *") AIPropertyStore pProps) {
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

    /** Unsafe version of: {@link #aiApplyPostProcessing ApplyPostProcessing} */
    public static long naiApplyPostProcessing(long pScene, int pFlags) {
        long __functionAddress = Functions.ApplyPostProcessing;
        if (CHECKS) {
            AIScene.validate(pScene);
        }
        return invokePP(pScene, pFlags, __functionAddress);
    }

    /**
     * Apply post-processing to an already-imported scene.
     * 
     * <p>This is strictly equivalent to calling {@link #aiImportFile ImportFile}/{@link #aiImportFileEx ImportFileEx} with the same flags. However, you can use this separate function to inspect the
     * imported scene first to fine-tune your post-processing setup.</p>
     *
     * @param pScene Scene to work on.
     * @param pFlags Provide a bitwise combination of the {@code aiPostProcessSteps} flags. One or more of:<br><table><tr><td>{@link #aiProcess_CalcTangentSpace Process_CalcTangentSpace}</td><td>{@link #aiProcess_JoinIdenticalVertices Process_JoinIdenticalVertices}</td><td>{@link #aiProcess_MakeLeftHanded Process_MakeLeftHanded}</td></tr><tr><td>{@link #aiProcess_Triangulate Process_Triangulate}</td><td>{@link #aiProcess_RemoveComponent Process_RemoveComponent}</td><td>{@link #aiProcess_GenNormals Process_GenNormals}</td></tr><tr><td>{@link #aiProcess_GenSmoothNormals Process_GenSmoothNormals}</td><td>{@link #aiProcess_SplitLargeMeshes Process_SplitLargeMeshes}</td><td>{@link #aiProcess_PreTransformVertices Process_PreTransformVertices}</td></tr><tr><td>{@link #aiProcess_LimitBoneWeights Process_LimitBoneWeights}</td><td>{@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure}</td><td>{@link #aiProcess_ImproveCacheLocality Process_ImproveCacheLocality}</td></tr><tr><td>{@link #aiProcess_RemoveRedundantMaterials Process_RemoveRedundantMaterials}</td><td>{@link #aiProcess_FixInfacingNormals Process_FixInfacingNormals}</td><td>{@link #aiProcess_PopulateArmatureData Process_PopulateArmatureData}</td></tr><tr><td>{@link #aiProcess_SortByPType Process_SortByPType}</td><td>{@link #aiProcess_FindDegenerates Process_FindDegenerates}</td><td>{@link #aiProcess_FindInvalidData Process_FindInvalidData}</td></tr><tr><td>{@link #aiProcess_GenUVCoords Process_GenUVCoords}</td><td>{@link #aiProcess_TransformUVCoords Process_TransformUVCoords}</td><td>{@link #aiProcess_FindInstances Process_FindInstances}</td></tr><tr><td>{@link #aiProcess_OptimizeMeshes Process_OptimizeMeshes}</td><td>{@link #aiProcess_OptimizeGraph Process_OptimizeGraph}</td><td>{@link #aiProcess_FlipUVs Process_FlipUVs}</td></tr><tr><td>{@link #aiProcess_FlipWindingOrder Process_FlipWindingOrder}</td><td>{@link #aiProcess_SplitByBoneCount Process_SplitByBoneCount}</td><td>{@link #aiProcess_Debone Process_Debone}</td></tr><tr><td>{@link #aiProcess_GlobalScale Process_GlobalScale}</td><td>{@link #aiProcess_EmbedTextures Process_EmbedTextures}</td><td>{@link #aiProcess_ForceGenNormals Process_ForceGenNormals}</td></tr><tr><td>{@link #aiProcess_DropNormals Process_DropNormals}</td><td>{@link #aiProcess_GenBoundingBoxes Process_GenBoundingBoxes}</td><td>{@link #aiProcess_ConvertToLeftHanded Process_ConvertToLeftHanded}</td></tr><tr><td>{@link #aiProcessPreset_TargetRealtime_Fast ProcessPreset_TargetRealtime_Fast}</td><td>{@link #aiProcessPreset_TargetRealtime_Quality ProcessPreset_TargetRealtime_Quality}</td><td>{@link #aiProcessPreset_TargetRealtime_MaxQuality ProcessPreset_TargetRealtime_MaxQuality}</td></tr></table>
     *
     * @return A pointer to the post-processed data. Post processing is done in-place, meaning this is still the same {@link AIScene} which you passed for {@code pScene}.
     *         However, <em>if</em> post-processing failed, the scene could now be {@code NULL}. That's quite a rare case, post processing steps are not really designed to
     *         'fail'. To be exact, the {@link #aiProcess_ValidateDataStructure Process_ValidateDataStructure} flag is currently the only post processing step which can actually cause the scene to be reset
     *         to {@code NULL}.
     */
    @Nullable
    @NativeType("struct aiScene *")
    public static AIScene aiApplyPostProcessing(@NativeType("struct aiScene const *") AIScene pScene, @NativeType("unsigned int") int pFlags) {
        long __result = naiApplyPostProcessing(pScene.address(), pFlags);
        return AIScene.createSafe(__result);
    }

    // --- [ aiGetPredefinedLogStream ] ---

    private static final FFICIF aiGetPredefinedLogStreamCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(ffi_type_pointer, ffi_type_pointer),
        ffi_type_uint32, ffi_type_pointer
    );

    /** Unsafe version of: {@link #aiGetPredefinedLogStream GetPredefinedLogStream} */
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

    /**
     * Get one of the predefine log streams.
     * 
     * <p>This is the quick'n'easy solution to access Assimp's log system. Attaching a log stream can slightly reduce Assimp's overall import performance.</p>
     * 
     * <p>Usage is rather simple (this will stream the log to a file, named log.txt, and the stdout stream of the process:</p>
     * 
     * <pre><code>
     * struct aiLogStream c;
     * c = aiGetPredefinedLogStream(aiDefaultLogStream_FILE, "log.txt");
     * aiAttachLogStream(&amp;c);
     * c = aiGetPredefinedLogStream(aiDefaultLogStream_STDOUT, NULL);
     * aiAttachLogStream(&amp;c);</code></pre>
     *
     * @param pStreams One of the {@code aiDefaultLogStream} enumerated values. One of:<br><table><tr><td>{@link #aiDefaultLogStream_FILE DefaultLogStream_FILE}</td><td>{@link #aiDefaultLogStream_STDOUT DefaultLogStream_STDOUT}</td><td>{@link #aiDefaultLogStream_STDERR DefaultLogStream_STDERR}</td></tr><tr><td>{@link #aiDefaultLogStream_DEBUGGER DefaultLogStream_DEBUGGER}</td></tr></table>
     * @param file     Solely for the {@link #aiDefaultLogStream_FILE DefaultLogStream_FILE} flag: specifies the file to write to. Pass {@code NULL} for all other flags.
     * @param __result The log stream. {@code callback} is set to {@code NULL} if something went wrong.
     */
    @NativeType("struct aiLogStream")
    public static AILogStream aiGetPredefinedLogStream(@NativeType("aiDefaultLogStream") int pStreams, @Nullable @NativeType("char const *") ByteBuffer file, @NativeType("struct aiLogStream") AILogStream __result) {
        if (CHECKS) {
            checkNT1Safe(file);
        }
        naiGetPredefinedLogStream(pStreams, memAddressSafe(file), __result.address());
        return __result;
    }

    /**
     * Get one of the predefine log streams.
     * 
     * <p>This is the quick'n'easy solution to access Assimp's log system. Attaching a log stream can slightly reduce Assimp's overall import performance.</p>
     * 
     * <p>Usage is rather simple (this will stream the log to a file, named log.txt, and the stdout stream of the process:</p>
     * 
     * <pre><code>
     * struct aiLogStream c;
     * c = aiGetPredefinedLogStream(aiDefaultLogStream_FILE, "log.txt");
     * aiAttachLogStream(&amp;c);
     * c = aiGetPredefinedLogStream(aiDefaultLogStream_STDOUT, NULL);
     * aiAttachLogStream(&amp;c);</code></pre>
     *
     * @param pStreams One of the {@code aiDefaultLogStream} enumerated values. One of:<br><table><tr><td>{@link #aiDefaultLogStream_FILE DefaultLogStream_FILE}</td><td>{@link #aiDefaultLogStream_STDOUT DefaultLogStream_STDOUT}</td><td>{@link #aiDefaultLogStream_STDERR DefaultLogStream_STDERR}</td></tr><tr><td>{@link #aiDefaultLogStream_DEBUGGER DefaultLogStream_DEBUGGER}</td></tr></table>
     * @param file     Solely for the {@link #aiDefaultLogStream_FILE DefaultLogStream_FILE} flag: specifies the file to write to. Pass {@code NULL} for all other flags.
     * @param __result The log stream. {@code callback} is set to {@code NULL} if something went wrong.
     */
    @NativeType("struct aiLogStream")
    public static AILogStream aiGetPredefinedLogStream(@NativeType("aiDefaultLogStream") int pStreams, @Nullable @NativeType("char const *") CharSequence file, @NativeType("struct aiLogStream") AILogStream __result) {
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

    /** Unsafe version of: {@link #aiAttachLogStream AttachLogStream} */
    public static void naiAttachLogStream(long stream) {
        long __functionAddress = Functions.AttachLogStream;
        if (CHECKS) {
            AILogStream.validate(stream);
        }
        invokePV(stream, __functionAddress);
    }

    /**
     * Attach a custom log stream to the libraries' logging system.
     * 
     * <p>Attaching a log stream can slightly reduce Assimp's overall import performance. Multiple log-streams can be attached.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>To ensure proper destruction of the logging system, you need to manually call {@link #aiDetachLogStream DetachLogStream} on every single log stream you attach. Alternatively
     * (for the lazy folks) {@link #aiDetachAllLogStreams DetachAllLogStreams} is provided.</p>
     * </div>
     *
     * @param stream Describes the new log stream.
     */
    public static void aiAttachLogStream(@NativeType("struct aiLogStream const *") AILogStream stream) {
        naiAttachLogStream(stream.address());
    }

    // --- [ aiEnableVerboseLogging ] ---

    /**
     * Enable verbose logging. Verbose logging includes debug-related stuff and detailed import statistics. This can have severe impact on import performance
     * and memory consumption. However, it might be useful to find out why a file didn't read correctly.
     *
     * @param d true or false, your decision
     */
    public static void aiEnableVerboseLogging(@NativeType("aiBool") boolean d) {
        long __functionAddress = Functions.EnableVerboseLogging;
        invokeV(d ? 1 : 0, __functionAddress);
    }

    // --- [ aiDetachLogStream ] ---

    /** Unsafe version of: {@link #aiDetachLogStream DetachLogStream} */
    public static int naiDetachLogStream(long stream) {
        long __functionAddress = Functions.DetachLogStream;
        if (CHECKS) {
            AILogStream.validate(stream);
        }
        return invokePI(stream, __functionAddress);
    }

    /**
     * Detach a custom log stream from the libraries' logging system.
     * 
     * <p>This is the counterpart of {@link #aiAttachLogStream AttachLogStream}. If you attached a stream, don't forget to detach it again.</p>
     *
     * @param stream The log stream to be detached.
     *
     * @return {@link #aiReturn_SUCCESS Return_SUCCESS} if the log stream has been detached successfully.
     */
    @NativeType("aiReturn")
    public static int aiDetachLogStream(@NativeType("struct aiLogStream const *") AILogStream stream) {
        return naiDetachLogStream(stream.address());
    }

    // --- [ aiDetachAllLogStreams ] ---

    /**
     * Detach all active log streams from the libraries' logging system. This ensures that the logging system is terminated properly and all resources
     * allocated by it are actually freed. If you attached a stream, don't forget to detach it again.
     */
    public static void aiDetachAllLogStreams() {
        long __functionAddress = Functions.DetachAllLogStreams;
        invokeV(__functionAddress);
    }

    // --- [ aiReleaseImport ] ---

    /** Unsafe version of: {@link #aiReleaseImport ReleaseImport} */
    public static void naiReleaseImport(long pScene) {
        long __functionAddress = Functions.ReleaseImport;
        if (CHECKS) {
            if (pScene != NULL) { AIScene.validate(pScene); }
        }
        invokePV(pScene, __functionAddress);
    }

    /**
     * Releases all resources associated with the given import process.
     * 
     * <p>Call this function after you're done with the imported data.</p>
     *
     * @param pScene The imported data to release. {@code NULL} is a valid value.
     */
    public static void aiReleaseImport(@Nullable @NativeType("struct aiScene const *") AIScene pScene) {
        naiReleaseImport(memAddressSafe(pScene));
    }

    // --- [ aiGetErrorString ] ---

    /** Unsafe version of: {@link #aiGetErrorString GetErrorString} */
    public static long naiGetErrorString() {
        long __functionAddress = Functions.GetErrorString;
        return invokeP(__functionAddress);
    }

    /**
     * Returns the error text of the last failed import process.
     *
     * @return A textual description of the error that occurred at the last import process. {@code NULL} if there was no error. There can't be an error if you got a
     *         non-{@code NULL} {@link AIScene} from {@link #aiImportFile ImportFile}/{@link #aiImportFileEx ImportFileEx}/{@link #aiApplyPostProcessing ApplyPostProcessing}.
     */
    @Nullable
    @NativeType("char *")
    public static String aiGetErrorString() {
        long __result = naiGetErrorString();
        return memUTF8Safe(__result);
    }

    // --- [ aiIsExtensionSupported ] ---

    /** Unsafe version of: {@link #aiIsExtensionSupported IsExtensionSupported} */
    public static int naiIsExtensionSupported(long szExtension) {
        long __functionAddress = Functions.IsExtensionSupported;
        return invokePI(szExtension, __functionAddress);
    }

    /**
     * Returns whether a given file extension is supported by ASSIMP.
     *
     * @param szExtension Extension for which the function queries support for. Must include a leading dot '.'. Example: ".3ds", ".md3"
     *
     * @return true if the file extension is supported.
     */
    @NativeType("aiBool")
    public static boolean aiIsExtensionSupported(@NativeType("char const *") ByteBuffer szExtension) {
        if (CHECKS) {
            checkNT1(szExtension);
        }
        return naiIsExtensionSupported(memAddress(szExtension)) != 0;
    }

    /**
     * Returns whether a given file extension is supported by ASSIMP.
     *
     * @param szExtension Extension for which the function queries support for. Must include a leading dot '.'. Example: ".3ds", ".md3"
     *
     * @return true if the file extension is supported.
     */
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

    /** Unsafe version of: {@link #aiGetExtensionList GetExtensionList} */
    public static void naiGetExtensionList(long szOut) {
        long __functionAddress = Functions.GetExtensionList;
        invokePV(szOut, __functionAddress);
    }

    /**
     * Get a list of all file extensions supported by ASSIMP.
     * 
     * <p>If a file extension is contained in the list this does, of course, not mean that ASSIMP is able to load all files with this extension.</p>
     *
     * @param szOut String to receive the extension list. Format of the list: "*.3ds;*.obj;*.dae". {@code NULL} is not a valid parameter.
     */
    public static void aiGetExtensionList(@NativeType("struct aiString *") AIString szOut) {
        naiGetExtensionList(szOut.address());
    }

    // --- [ aiGetMemoryRequirements ] ---

    /** Unsafe version of: {@link #aiGetMemoryRequirements GetMemoryRequirements} */
    public static void naiGetMemoryRequirements(long pIn, long in) {
        long __functionAddress = Functions.GetMemoryRequirements;
        if (CHECKS) {
            AIScene.validate(pIn);
        }
        invokePPV(pIn, in, __functionAddress);
    }

    /**
     * Get the approximated storage required by an imported asset.
     *
     * @param pIn Input asset.
     * @param in  Data structure to be filled.
     */
    public static void aiGetMemoryRequirements(@NativeType("struct aiScene const *") AIScene pIn, @NativeType("struct aiMemoryInfo *") AIMemoryInfo in) {
        naiGetMemoryRequirements(pIn.address(), in.address());
    }

    // --- [ aiCreatePropertyStore ] ---

    /** Unsafe version of: {@link #aiCreatePropertyStore CreatePropertyStore} */
    public static long naiCreatePropertyStore() {
        long __functionAddress = Functions.CreatePropertyStore;
        return invokeP(__functionAddress);
    }

    /**
     * Create an empty property store. Property stores are used to collect import settings.
     *
     * @return New property store. Property stores need to be manually destroyed using the {@link #aiReleasePropertyStore ReleasePropertyStore} API function.
     */
    @Nullable
    @NativeType("struct aiPropertyStore *")
    public static AIPropertyStore aiCreatePropertyStore() {
        long __result = naiCreatePropertyStore();
        return AIPropertyStore.createSafe(__result);
    }

    // --- [ aiReleasePropertyStore ] ---

    /** Unsafe version of: {@link #aiReleasePropertyStore ReleasePropertyStore} */
    public static void naiReleasePropertyStore(long p) {
        long __functionAddress = Functions.ReleasePropertyStore;
        invokePV(p, __functionAddress);
    }

    /**
     * Delete a property store.
     *
     * @param p Property store to be deleted.
     */
    public static void aiReleasePropertyStore(@NativeType("struct aiPropertyStore *") AIPropertyStore p) {
        naiReleasePropertyStore(p.address());
    }

    // --- [ aiSetImportPropertyInteger ] ---

    /** Unsafe version of: {@link #aiSetImportPropertyInteger SetImportPropertyInteger} */
    public static void naiSetImportPropertyInteger(long store, long szName, int value) {
        long __functionAddress = Functions.SetImportPropertyInteger;
        invokePPV(store, szName, value, __functionAddress);
    }

    /**
     * Set an integer property.
     * 
     * <p>This is the C-version of {@code Assimp::Importer::SetPropertyInteger()}. In the C interface, properties are always shared by all imports. It is not
     * possible to specify them per import.</p>
     *
     * @param store  Store to modify. Use {@link #aiCreatePropertyStore CreatePropertyStore} to obtain a store.
     * @param szName Name of the configuration property to be set. One of:<br><table><tr><td>{@link #AI_CONFIG_GLOB_MEASURE_TIME}</td><td>{@link #AI_CONFIG_IMPORT_NO_SKELETON_MESHES}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBBC_MAX_BONES}</td><td>{@link #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX}</td><td>{@link #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_COLORMAP}</td><td>{@link #AI_CONFIG_PP_RRM_EXCLUDE_LIST}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_KEEP_HIERARCHY}</td><td>{@link #AI_CONFIG_PP_PTV_NORMALIZE}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION}</td><td>{@link #AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION}</td></tr><tr><td>{@link #AI_CONFIG_PP_FD_REMOVE}</td><td>{@link #AI_CONFIG_PP_FD_CHECKAREA}</td></tr><tr><td>{@link #AI_CONFIG_PP_OG_EXCLUDE_LIST}</td><td>{@link #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT}</td></tr><tr><td>{@link #AI_CONFIG_PP_SLM_VERTEX_LIMIT}</td><td>{@link #AI_CONFIG_PP_LBW_MAX_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_PP_DB_THRESHOLD}</td><td>{@link #AI_CONFIG_PP_DB_ALL_OR_NONE}</td></tr><tr><td>{@link #AI_CONFIG_PP_ICL_PTCACHE_SIZE}</td><td>{@link #AI_CONFIG_PP_RVC_FLAGS}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBP_REMOVE}</td><td>{@link #AI_CONFIG_PP_FID_ANIM_ACCURACY}</td></tr><tr><td>{@link #AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS}</td><td>{@link #AI_CONFIG_PP_TUV_EVALUATE}</td></tr><tr><td>{@link #AI_CONFIG_FAVOUR_SPEED}</td><td>{@link #AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_MATERIALS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_TEXTURES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_CAMERAS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_LIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_STRICT_MODE}</td><td>{@link #AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES}</td><td>{@link #AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES}</td><td>{@link #AI_CONFIG_FBX_CONVERT_TO_M}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD2_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDC_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_SMD_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_UNREAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO}</td><td>{@link #AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL}</td><td>{@link #AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION}</td></tr><tr><td>{@link #AI_CONFIG_UNREAL_HANDLE_FLAGS}</td><td>{@link #AI_CONFIG_IMPORT_TER_MAKE_UVS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS}</td><td>{@link #AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SKIN_NAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_LOAD_SHADERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SHADER_SRC}</td><td>{@link #AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD}</td><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_START}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_END}</td><td>{@link #AI_CONFIG_IMPORT_IRR_ANIM_FPS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE}</td><td>{@link #AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION}</td><td>{@link #AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_XFILE_64BIT}</td><td>{@link #AI_CONFIG_EXPORT_POINT_CLOUDS}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_BLOB_NAME}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_KEY}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_DEFAULT}</td></tr></table>
     * @param value  New value for the property
     */
    public static void aiSetImportPropertyInteger(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") ByteBuffer szName, int value) {
        if (CHECKS) {
            checkNT1(szName);
        }
        naiSetImportPropertyInteger(store.address(), memAddress(szName), value);
    }

    /**
     * Set an integer property.
     * 
     * <p>This is the C-version of {@code Assimp::Importer::SetPropertyInteger()}. In the C interface, properties are always shared by all imports. It is not
     * possible to specify them per import.</p>
     *
     * @param store  Store to modify. Use {@link #aiCreatePropertyStore CreatePropertyStore} to obtain a store.
     * @param szName Name of the configuration property to be set. One of:<br><table><tr><td>{@link #AI_CONFIG_GLOB_MEASURE_TIME}</td><td>{@link #AI_CONFIG_IMPORT_NO_SKELETON_MESHES}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBBC_MAX_BONES}</td><td>{@link #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX}</td><td>{@link #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_COLORMAP}</td><td>{@link #AI_CONFIG_PP_RRM_EXCLUDE_LIST}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_KEEP_HIERARCHY}</td><td>{@link #AI_CONFIG_PP_PTV_NORMALIZE}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION}</td><td>{@link #AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION}</td></tr><tr><td>{@link #AI_CONFIG_PP_FD_REMOVE}</td><td>{@link #AI_CONFIG_PP_FD_CHECKAREA}</td></tr><tr><td>{@link #AI_CONFIG_PP_OG_EXCLUDE_LIST}</td><td>{@link #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT}</td></tr><tr><td>{@link #AI_CONFIG_PP_SLM_VERTEX_LIMIT}</td><td>{@link #AI_CONFIG_PP_LBW_MAX_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_PP_DB_THRESHOLD}</td><td>{@link #AI_CONFIG_PP_DB_ALL_OR_NONE}</td></tr><tr><td>{@link #AI_CONFIG_PP_ICL_PTCACHE_SIZE}</td><td>{@link #AI_CONFIG_PP_RVC_FLAGS}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBP_REMOVE}</td><td>{@link #AI_CONFIG_PP_FID_ANIM_ACCURACY}</td></tr><tr><td>{@link #AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS}</td><td>{@link #AI_CONFIG_PP_TUV_EVALUATE}</td></tr><tr><td>{@link #AI_CONFIG_FAVOUR_SPEED}</td><td>{@link #AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_MATERIALS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_TEXTURES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_CAMERAS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_LIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_STRICT_MODE}</td><td>{@link #AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES}</td><td>{@link #AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES}</td><td>{@link #AI_CONFIG_FBX_CONVERT_TO_M}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD2_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDC_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_SMD_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_UNREAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO}</td><td>{@link #AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL}</td><td>{@link #AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION}</td></tr><tr><td>{@link #AI_CONFIG_UNREAL_HANDLE_FLAGS}</td><td>{@link #AI_CONFIG_IMPORT_TER_MAKE_UVS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS}</td><td>{@link #AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SKIN_NAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_LOAD_SHADERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SHADER_SRC}</td><td>{@link #AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD}</td><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_START}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_END}</td><td>{@link #AI_CONFIG_IMPORT_IRR_ANIM_FPS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE}</td><td>{@link #AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION}</td><td>{@link #AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_XFILE_64BIT}</td><td>{@link #AI_CONFIG_EXPORT_POINT_CLOUDS}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_BLOB_NAME}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_KEY}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_DEFAULT}</td></tr></table>
     * @param value  New value for the property
     */
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

    /** Unsafe version of: {@link #aiSetImportPropertyFloat SetImportPropertyFloat} */
    public static void naiSetImportPropertyFloat(long store, long szName, float value) {
        long __functionAddress = Functions.SetImportPropertyFloat;
        invokePPV(store, szName, value, __functionAddress);
    }

    /**
     * Set an floating-point property.
     * 
     * <p>This is the C-version of {@code Assimp::Importer::SetPropertyFloat()}. In the C interface, properties are always shared by all imports. It is not
     * possible to specify them per import.</p>
     *
     * @param store  Store to modify. Use {@link #aiCreatePropertyStore CreatePropertyStore} to obtain a store.
     * @param szName Name of the configuration property to be set. One of:<br><table><tr><td>{@link #AI_CONFIG_GLOB_MEASURE_TIME}</td><td>{@link #AI_CONFIG_IMPORT_NO_SKELETON_MESHES}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBBC_MAX_BONES}</td><td>{@link #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX}</td><td>{@link #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_COLORMAP}</td><td>{@link #AI_CONFIG_PP_RRM_EXCLUDE_LIST}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_KEEP_HIERARCHY}</td><td>{@link #AI_CONFIG_PP_PTV_NORMALIZE}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION}</td><td>{@link #AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION}</td></tr><tr><td>{@link #AI_CONFIG_PP_FD_REMOVE}</td><td>{@link #AI_CONFIG_PP_FD_CHECKAREA}</td></tr><tr><td>{@link #AI_CONFIG_PP_OG_EXCLUDE_LIST}</td><td>{@link #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT}</td></tr><tr><td>{@link #AI_CONFIG_PP_SLM_VERTEX_LIMIT}</td><td>{@link #AI_CONFIG_PP_LBW_MAX_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_PP_DB_THRESHOLD}</td><td>{@link #AI_CONFIG_PP_DB_ALL_OR_NONE}</td></tr><tr><td>{@link #AI_CONFIG_PP_ICL_PTCACHE_SIZE}</td><td>{@link #AI_CONFIG_PP_RVC_FLAGS}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBP_REMOVE}</td><td>{@link #AI_CONFIG_PP_FID_ANIM_ACCURACY}</td></tr><tr><td>{@link #AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS}</td><td>{@link #AI_CONFIG_PP_TUV_EVALUATE}</td></tr><tr><td>{@link #AI_CONFIG_FAVOUR_SPEED}</td><td>{@link #AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_MATERIALS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_TEXTURES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_CAMERAS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_LIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_STRICT_MODE}</td><td>{@link #AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES}</td><td>{@link #AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES}</td><td>{@link #AI_CONFIG_FBX_CONVERT_TO_M}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD2_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDC_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_SMD_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_UNREAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO}</td><td>{@link #AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL}</td><td>{@link #AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION}</td></tr><tr><td>{@link #AI_CONFIG_UNREAL_HANDLE_FLAGS}</td><td>{@link #AI_CONFIG_IMPORT_TER_MAKE_UVS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS}</td><td>{@link #AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SKIN_NAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_LOAD_SHADERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SHADER_SRC}</td><td>{@link #AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD}</td><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_START}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_END}</td><td>{@link #AI_CONFIG_IMPORT_IRR_ANIM_FPS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE}</td><td>{@link #AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION}</td><td>{@link #AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_XFILE_64BIT}</td><td>{@link #AI_CONFIG_EXPORT_POINT_CLOUDS}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_BLOB_NAME}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_KEY}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_DEFAULT}</td></tr></table>
     * @param value  New value for the property
     */
    public static void aiSetImportPropertyFloat(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") ByteBuffer szName, float value) {
        if (CHECKS) {
            checkNT1(szName);
        }
        naiSetImportPropertyFloat(store.address(), memAddress(szName), value);
    }

    /**
     * Set an floating-point property.
     * 
     * <p>This is the C-version of {@code Assimp::Importer::SetPropertyFloat()}. In the C interface, properties are always shared by all imports. It is not
     * possible to specify them per import.</p>
     *
     * @param store  Store to modify. Use {@link #aiCreatePropertyStore CreatePropertyStore} to obtain a store.
     * @param szName Name of the configuration property to be set. One of:<br><table><tr><td>{@link #AI_CONFIG_GLOB_MEASURE_TIME}</td><td>{@link #AI_CONFIG_IMPORT_NO_SKELETON_MESHES}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBBC_MAX_BONES}</td><td>{@link #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX}</td><td>{@link #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_COLORMAP}</td><td>{@link #AI_CONFIG_PP_RRM_EXCLUDE_LIST}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_KEEP_HIERARCHY}</td><td>{@link #AI_CONFIG_PP_PTV_NORMALIZE}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION}</td><td>{@link #AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION}</td></tr><tr><td>{@link #AI_CONFIG_PP_FD_REMOVE}</td><td>{@link #AI_CONFIG_PP_FD_CHECKAREA}</td></tr><tr><td>{@link #AI_CONFIG_PP_OG_EXCLUDE_LIST}</td><td>{@link #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT}</td></tr><tr><td>{@link #AI_CONFIG_PP_SLM_VERTEX_LIMIT}</td><td>{@link #AI_CONFIG_PP_LBW_MAX_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_PP_DB_THRESHOLD}</td><td>{@link #AI_CONFIG_PP_DB_ALL_OR_NONE}</td></tr><tr><td>{@link #AI_CONFIG_PP_ICL_PTCACHE_SIZE}</td><td>{@link #AI_CONFIG_PP_RVC_FLAGS}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBP_REMOVE}</td><td>{@link #AI_CONFIG_PP_FID_ANIM_ACCURACY}</td></tr><tr><td>{@link #AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS}</td><td>{@link #AI_CONFIG_PP_TUV_EVALUATE}</td></tr><tr><td>{@link #AI_CONFIG_FAVOUR_SPEED}</td><td>{@link #AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_MATERIALS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_TEXTURES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_CAMERAS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_LIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_STRICT_MODE}</td><td>{@link #AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES}</td><td>{@link #AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES}</td><td>{@link #AI_CONFIG_FBX_CONVERT_TO_M}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD2_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDC_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_SMD_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_UNREAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO}</td><td>{@link #AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL}</td><td>{@link #AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION}</td></tr><tr><td>{@link #AI_CONFIG_UNREAL_HANDLE_FLAGS}</td><td>{@link #AI_CONFIG_IMPORT_TER_MAKE_UVS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS}</td><td>{@link #AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SKIN_NAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_LOAD_SHADERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SHADER_SRC}</td><td>{@link #AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD}</td><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_START}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_END}</td><td>{@link #AI_CONFIG_IMPORT_IRR_ANIM_FPS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE}</td><td>{@link #AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION}</td><td>{@link #AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_XFILE_64BIT}</td><td>{@link #AI_CONFIG_EXPORT_POINT_CLOUDS}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_BLOB_NAME}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_KEY}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_DEFAULT}</td></tr></table>
     * @param value  New value for the property
     */
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

    /** Unsafe version of: {@link #aiSetImportPropertyString SetImportPropertyString} */
    public static void naiSetImportPropertyString(long store, long szName, long value) {
        long __functionAddress = Functions.SetImportPropertyString;
        invokePPPV(store, szName, value, __functionAddress);
    }

    /**
     * Set a string property.
     * 
     * <p>This is the C-version of {@code Assimp::Importer::SetPropertyString()}. In the C interface, properties are always shared by all imports. It is not
     * possible to specify them per import.</p>
     *
     * @param store  Store to modify. Use {@link #aiCreatePropertyStore CreatePropertyStore} to obtain a store.
     * @param szName Name of the configuration property to be set. One of:<br><table><tr><td>{@link #AI_CONFIG_GLOB_MEASURE_TIME}</td><td>{@link #AI_CONFIG_IMPORT_NO_SKELETON_MESHES}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBBC_MAX_BONES}</td><td>{@link #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX}</td><td>{@link #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_COLORMAP}</td><td>{@link #AI_CONFIG_PP_RRM_EXCLUDE_LIST}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_KEEP_HIERARCHY}</td><td>{@link #AI_CONFIG_PP_PTV_NORMALIZE}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION}</td><td>{@link #AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION}</td></tr><tr><td>{@link #AI_CONFIG_PP_FD_REMOVE}</td><td>{@link #AI_CONFIG_PP_FD_CHECKAREA}</td></tr><tr><td>{@link #AI_CONFIG_PP_OG_EXCLUDE_LIST}</td><td>{@link #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT}</td></tr><tr><td>{@link #AI_CONFIG_PP_SLM_VERTEX_LIMIT}</td><td>{@link #AI_CONFIG_PP_LBW_MAX_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_PP_DB_THRESHOLD}</td><td>{@link #AI_CONFIG_PP_DB_ALL_OR_NONE}</td></tr><tr><td>{@link #AI_CONFIG_PP_ICL_PTCACHE_SIZE}</td><td>{@link #AI_CONFIG_PP_RVC_FLAGS}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBP_REMOVE}</td><td>{@link #AI_CONFIG_PP_FID_ANIM_ACCURACY}</td></tr><tr><td>{@link #AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS}</td><td>{@link #AI_CONFIG_PP_TUV_EVALUATE}</td></tr><tr><td>{@link #AI_CONFIG_FAVOUR_SPEED}</td><td>{@link #AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_MATERIALS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_TEXTURES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_CAMERAS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_LIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_STRICT_MODE}</td><td>{@link #AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES}</td><td>{@link #AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES}</td><td>{@link #AI_CONFIG_FBX_CONVERT_TO_M}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD2_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDC_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_SMD_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_UNREAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO}</td><td>{@link #AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL}</td><td>{@link #AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION}</td></tr><tr><td>{@link #AI_CONFIG_UNREAL_HANDLE_FLAGS}</td><td>{@link #AI_CONFIG_IMPORT_TER_MAKE_UVS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS}</td><td>{@link #AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SKIN_NAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_LOAD_SHADERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SHADER_SRC}</td><td>{@link #AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD}</td><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_START}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_END}</td><td>{@link #AI_CONFIG_IMPORT_IRR_ANIM_FPS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE}</td><td>{@link #AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION}</td><td>{@link #AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_XFILE_64BIT}</td><td>{@link #AI_CONFIG_EXPORT_POINT_CLOUDS}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_BLOB_NAME}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_KEY}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_DEFAULT}</td></tr></table>
     * @param value  New value for the property
     */
    public static void aiSetImportPropertyString(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") ByteBuffer szName, @NativeType("struct aiString const *") AIString value) {
        if (CHECKS) {
            checkNT1(szName);
        }
        naiSetImportPropertyString(store.address(), memAddress(szName), value.address());
    }

    /**
     * Set a string property.
     * 
     * <p>This is the C-version of {@code Assimp::Importer::SetPropertyString()}. In the C interface, properties are always shared by all imports. It is not
     * possible to specify them per import.</p>
     *
     * @param store  Store to modify. Use {@link #aiCreatePropertyStore CreatePropertyStore} to obtain a store.
     * @param szName Name of the configuration property to be set. One of:<br><table><tr><td>{@link #AI_CONFIG_GLOB_MEASURE_TIME}</td><td>{@link #AI_CONFIG_IMPORT_NO_SKELETON_MESHES}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBBC_MAX_BONES}</td><td>{@link #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX}</td><td>{@link #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_COLORMAP}</td><td>{@link #AI_CONFIG_PP_RRM_EXCLUDE_LIST}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_KEEP_HIERARCHY}</td><td>{@link #AI_CONFIG_PP_PTV_NORMALIZE}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION}</td><td>{@link #AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION}</td></tr><tr><td>{@link #AI_CONFIG_PP_FD_REMOVE}</td><td>{@link #AI_CONFIG_PP_FD_CHECKAREA}</td></tr><tr><td>{@link #AI_CONFIG_PP_OG_EXCLUDE_LIST}</td><td>{@link #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT}</td></tr><tr><td>{@link #AI_CONFIG_PP_SLM_VERTEX_LIMIT}</td><td>{@link #AI_CONFIG_PP_LBW_MAX_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_PP_DB_THRESHOLD}</td><td>{@link #AI_CONFIG_PP_DB_ALL_OR_NONE}</td></tr><tr><td>{@link #AI_CONFIG_PP_ICL_PTCACHE_SIZE}</td><td>{@link #AI_CONFIG_PP_RVC_FLAGS}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBP_REMOVE}</td><td>{@link #AI_CONFIG_PP_FID_ANIM_ACCURACY}</td></tr><tr><td>{@link #AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS}</td><td>{@link #AI_CONFIG_PP_TUV_EVALUATE}</td></tr><tr><td>{@link #AI_CONFIG_FAVOUR_SPEED}</td><td>{@link #AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_MATERIALS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_TEXTURES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_CAMERAS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_LIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_STRICT_MODE}</td><td>{@link #AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES}</td><td>{@link #AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES}</td><td>{@link #AI_CONFIG_FBX_CONVERT_TO_M}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD2_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDC_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_SMD_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_UNREAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO}</td><td>{@link #AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL}</td><td>{@link #AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION}</td></tr><tr><td>{@link #AI_CONFIG_UNREAL_HANDLE_FLAGS}</td><td>{@link #AI_CONFIG_IMPORT_TER_MAKE_UVS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS}</td><td>{@link #AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SKIN_NAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_LOAD_SHADERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SHADER_SRC}</td><td>{@link #AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD}</td><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_START}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_END}</td><td>{@link #AI_CONFIG_IMPORT_IRR_ANIM_FPS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE}</td><td>{@link #AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION}</td><td>{@link #AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_XFILE_64BIT}</td><td>{@link #AI_CONFIG_EXPORT_POINT_CLOUDS}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_BLOB_NAME}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_KEY}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_DEFAULT}</td></tr></table>
     * @param value  New value for the property
     */
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

    /** Unsafe version of: {@link #aiSetImportPropertyMatrix SetImportPropertyMatrix} */
    public static void naiSetImportPropertyMatrix(long store, long szName, long value) {
        long __functionAddress = Functions.SetImportPropertyMatrix;
        invokePPPV(store, szName, value, __functionAddress);
    }

    /**
     * Set a matrix property.
     * 
     * <p>This is the C-version of {@code Assimp::Importer::SetPropertyMatrix()}. In the C interface, properties are always shared by all imports. It is not
     * possible to specify them per import.</p>
     *
     * @param store  Store to modify. Use {@link #aiCreatePropertyStore CreatePropertyStore} to obtain a store.
     * @param szName Name of the configuration property to be set. One of:<br><table><tr><td>{@link #AI_CONFIG_GLOB_MEASURE_TIME}</td><td>{@link #AI_CONFIG_IMPORT_NO_SKELETON_MESHES}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBBC_MAX_BONES}</td><td>{@link #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX}</td><td>{@link #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_COLORMAP}</td><td>{@link #AI_CONFIG_PP_RRM_EXCLUDE_LIST}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_KEEP_HIERARCHY}</td><td>{@link #AI_CONFIG_PP_PTV_NORMALIZE}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION}</td><td>{@link #AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION}</td></tr><tr><td>{@link #AI_CONFIG_PP_FD_REMOVE}</td><td>{@link #AI_CONFIG_PP_FD_CHECKAREA}</td></tr><tr><td>{@link #AI_CONFIG_PP_OG_EXCLUDE_LIST}</td><td>{@link #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT}</td></tr><tr><td>{@link #AI_CONFIG_PP_SLM_VERTEX_LIMIT}</td><td>{@link #AI_CONFIG_PP_LBW_MAX_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_PP_DB_THRESHOLD}</td><td>{@link #AI_CONFIG_PP_DB_ALL_OR_NONE}</td></tr><tr><td>{@link #AI_CONFIG_PP_ICL_PTCACHE_SIZE}</td><td>{@link #AI_CONFIG_PP_RVC_FLAGS}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBP_REMOVE}</td><td>{@link #AI_CONFIG_PP_FID_ANIM_ACCURACY}</td></tr><tr><td>{@link #AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS}</td><td>{@link #AI_CONFIG_PP_TUV_EVALUATE}</td></tr><tr><td>{@link #AI_CONFIG_FAVOUR_SPEED}</td><td>{@link #AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_MATERIALS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_TEXTURES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_CAMERAS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_LIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_STRICT_MODE}</td><td>{@link #AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES}</td><td>{@link #AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES}</td><td>{@link #AI_CONFIG_FBX_CONVERT_TO_M}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD2_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDC_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_SMD_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_UNREAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO}</td><td>{@link #AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL}</td><td>{@link #AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION}</td></tr><tr><td>{@link #AI_CONFIG_UNREAL_HANDLE_FLAGS}</td><td>{@link #AI_CONFIG_IMPORT_TER_MAKE_UVS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS}</td><td>{@link #AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SKIN_NAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_LOAD_SHADERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SHADER_SRC}</td><td>{@link #AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD}</td><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_START}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_END}</td><td>{@link #AI_CONFIG_IMPORT_IRR_ANIM_FPS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE}</td><td>{@link #AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION}</td><td>{@link #AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_XFILE_64BIT}</td><td>{@link #AI_CONFIG_EXPORT_POINT_CLOUDS}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_BLOB_NAME}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_KEY}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_DEFAULT}</td></tr></table>
     * @param value  New value for the property
     */
    public static void aiSetImportPropertyMatrix(@NativeType("struct aiPropertyStore *") AIPropertyStore store, @NativeType("char const *") ByteBuffer szName, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 value) {
        if (CHECKS) {
            checkNT1(szName);
        }
        naiSetImportPropertyMatrix(store.address(), memAddress(szName), value.address());
    }

    /**
     * Set a matrix property.
     * 
     * <p>This is the C-version of {@code Assimp::Importer::SetPropertyMatrix()}. In the C interface, properties are always shared by all imports. It is not
     * possible to specify them per import.</p>
     *
     * @param store  Store to modify. Use {@link #aiCreatePropertyStore CreatePropertyStore} to obtain a store.
     * @param szName Name of the configuration property to be set. One of:<br><table><tr><td>{@link #AI_CONFIG_GLOB_MEASURE_TIME}</td><td>{@link #AI_CONFIG_IMPORT_NO_SKELETON_MESHES}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBBC_MAX_BONES}</td><td>{@link #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX}</td><td>{@link #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_COLORMAP}</td><td>{@link #AI_CONFIG_PP_RRM_EXCLUDE_LIST}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_KEEP_HIERARCHY}</td><td>{@link #AI_CONFIG_PP_PTV_NORMALIZE}</td></tr><tr><td>{@link #AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION}</td><td>{@link #AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION}</td></tr><tr><td>{@link #AI_CONFIG_PP_FD_REMOVE}</td><td>{@link #AI_CONFIG_PP_FD_CHECKAREA}</td></tr><tr><td>{@link #AI_CONFIG_PP_OG_EXCLUDE_LIST}</td><td>{@link #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT}</td></tr><tr><td>{@link #AI_CONFIG_PP_SLM_VERTEX_LIMIT}</td><td>{@link #AI_CONFIG_PP_LBW_MAX_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_PP_DB_THRESHOLD}</td><td>{@link #AI_CONFIG_PP_DB_ALL_OR_NONE}</td></tr><tr><td>{@link #AI_CONFIG_PP_ICL_PTCACHE_SIZE}</td><td>{@link #AI_CONFIG_PP_RVC_FLAGS}</td></tr><tr><td>{@link #AI_CONFIG_PP_SBP_REMOVE}</td><td>{@link #AI_CONFIG_PP_FID_ANIM_ACCURACY}</td></tr><tr><td>{@link #AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS}</td><td>{@link #AI_CONFIG_PP_TUV_EVALUATE}</td></tr><tr><td>{@link #AI_CONFIG_FAVOUR_SPEED}</td><td>{@link #AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_MATERIALS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_TEXTURES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_CAMERAS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_LIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS}</td><td>{@link #AI_CONFIG_IMPORT_FBX_READ_WEIGHTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_STRICT_MODE}</td><td>{@link #AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES}</td><td>{@link #AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES}</td><td>{@link #AI_CONFIG_FBX_CONVERT_TO_M}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_GLOBAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD2_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDC_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_SMD_KEYFRAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_UNREAL_KEYFRAME}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS}</td><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO}</td><td>{@link #AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL}</td><td>{@link #AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION}</td></tr><tr><td>{@link #AI_CONFIG_UNREAL_HANDLE_FLAGS}</td><td>{@link #AI_CONFIG_IMPORT_TER_MAKE_UVS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS}</td><td>{@link #AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SKIN_NAME}</td><td>{@link #AI_CONFIG_IMPORT_MD3_LOAD_SHADERS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD3_SHADER_SRC}</td><td>{@link #AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD}</td><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_START}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_LWS_ANIM_END}</td><td>{@link #AI_CONFIG_IMPORT_IRR_ANIM_FPS}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE}</td><td>{@link #AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE}</td><td>{@link #AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION}</td></tr><tr><td>{@link #AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION}</td><td>{@link #AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_XFILE_64BIT}</td><td>{@link #AI_CONFIG_EXPORT_POINT_CLOUDS}</td></tr><tr><td>{@link #AI_CONFIG_EXPORT_BLOB_NAME}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_KEY}</td><td>{@link #AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT}</td></tr><tr><td>{@link #AI_CONFIG_APP_SCALE_DEFAULT}</td></tr></table>
     * @param value  New value for the property
     */
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

    /** Unsafe version of: {@link #aiCreateQuaternionFromMatrix CreateQuaternionFromMatrix} */
    public static void naiCreateQuaternionFromMatrix(long quat, long mat) {
        long __functionAddress = Functions.CreateQuaternionFromMatrix;
        invokePPV(quat, mat, __functionAddress);
    }

    /**
     * Construct a quaternion from a 3x3 rotation matrix.
     *
     * @param quat Receives the output quaternion.
     * @param mat  Matrix to 'quaternionize'.
     */
    public static void aiCreateQuaternionFromMatrix(@NativeType("struct aiQuaternion *") AIQuaternion quat, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 mat) {
        naiCreateQuaternionFromMatrix(quat.address(), mat.address());
    }

    // --- [ aiDecomposeMatrix ] ---

    /** Unsafe version of: {@link #aiDecomposeMatrix DecomposeMatrix} */
    public static void naiDecomposeMatrix(long mat, long scaling, long rotation, long position) {
        long __functionAddress = Functions.DecomposeMatrix;
        invokePPPPV(mat, scaling, rotation, position, __functionAddress);
    }

    /**
     * Decompose a transformation matrix into its rotational, translational and scaling components.
     *
     * @param mat      Matrix to decompose
     * @param scaling  Receives the scaling component
     * @param rotation Receives the rotational component
     * @param position Receives the translational component.
     */
    public static void aiDecomposeMatrix(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiVector3D *") AIVector3D scaling, @NativeType("struct aiQuaternion *") AIQuaternion rotation, @NativeType("struct aiVector3D *") AIVector3D position) {
        naiDecomposeMatrix(mat.address(), scaling.address(), rotation.address(), position.address());
    }

    // --- [ aiTransposeMatrix4 ] ---

    /** Unsafe version of: {@link #aiTransposeMatrix4 TransposeMatrix4} */
    public static void naiTransposeMatrix4(long mat) {
        long __functionAddress = Functions.TransposeMatrix4;
        invokePV(mat, __functionAddress);
    }

    /**
     * Transpose a 4x4 matrix.
     *
     * @param mat Pointer to the matrix to be transposed
     */
    public static void aiTransposeMatrix4(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat) {
        naiTransposeMatrix4(mat.address());
    }

    // --- [ aiTransposeMatrix3 ] ---

    /** Unsafe version of: {@link #aiTransposeMatrix3 TransposeMatrix3} */
    public static void naiTransposeMatrix3(long mat) {
        long __functionAddress = Functions.TransposeMatrix3;
        invokePV(mat, __functionAddress);
    }

    /**
     * Transpose a 3x3 matrix.
     *
     * @param mat Pointer to the matrix to be transposed
     */
    public static void aiTransposeMatrix3(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat) {
        naiTransposeMatrix3(mat.address());
    }

    // --- [ aiTransformVecByMatrix3 ] ---

    /** Unsafe version of: {@link #aiTransformVecByMatrix3 TransformVecByMatrix3} */
    public static void naiTransformVecByMatrix3(long vec, long mat) {
        long __functionAddress = Functions.TransformVecByMatrix3;
        invokePPV(vec, mat, __functionAddress);
    }

    /**
     * Transform a vector by a 3x3 matrix
     *
     * @param vec Vector to be transformed.
     * @param mat Matrix to transform the vector with.
     */
    public static void aiTransformVecByMatrix3(@NativeType("struct aiVector3D *") AIVector3D vec, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 mat) {
        naiTransformVecByMatrix3(vec.address(), mat.address());
    }

    // --- [ aiTransformVecByMatrix4 ] ---

    /** Unsafe version of: {@link #aiTransformVecByMatrix4 TransformVecByMatrix4} */
    public static void naiTransformVecByMatrix4(long vec, long mat) {
        long __functionAddress = Functions.TransformVecByMatrix4;
        invokePPV(vec, mat, __functionAddress);
    }

    /**
     * Transform a vector by a 4x4 matrix
     *
     * @param vec Vector to be transformed.
     * @param mat Matrix to transform the vector with.
     */
    public static void aiTransformVecByMatrix4(@NativeType("struct aiVector3D *") AIVector3D vec, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat) {
        naiTransformVecByMatrix4(vec.address(), mat.address());
    }

    // --- [ aiMultiplyMatrix4 ] ---

    /** Unsafe version of: {@link #aiMultiplyMatrix4 MultiplyMatrix4} */
    public static void naiMultiplyMatrix4(long dst, long src) {
        long __functionAddress = Functions.MultiplyMatrix4;
        invokePPV(dst, src, __functionAddress);
    }

    /**
     * Multiply two 4x4 matrices.
     *
     * @param dst First factor, receives result.
     * @param src Matrix to be multiplied with 'dst'.
     */
    public static void aiMultiplyMatrix4(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 dst, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 src) {
        naiMultiplyMatrix4(dst.address(), src.address());
    }

    // --- [ aiMultiplyMatrix3 ] ---

    /** Unsafe version of: {@link #aiMultiplyMatrix3 MultiplyMatrix3} */
    public static void naiMultiplyMatrix3(long dst, long src) {
        long __functionAddress = Functions.MultiplyMatrix3;
        invokePPV(dst, src, __functionAddress);
    }

    /**
     * Multiply two 3x3 matrices.
     *
     * @param dst First factor, receives result.
     * @param src Matrix to be multiplied with 'dst'.
     */
    public static void aiMultiplyMatrix3(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 dst, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 src) {
        naiMultiplyMatrix3(dst.address(), src.address());
    }

    // --- [ aiIdentityMatrix3 ] ---

    /** Unsafe version of: {@link #aiIdentityMatrix3 IdentityMatrix3} */
    public static void naiIdentityMatrix3(long mat) {
        long __functionAddress = Functions.IdentityMatrix3;
        invokePV(mat, __functionAddress);
    }

    /**
     * Get a 3x3 identity matrix.
     *
     * @param mat Matrix to receive its personal identity
     */
    public static void aiIdentityMatrix3(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat) {
        naiIdentityMatrix3(mat.address());
    }

    // --- [ aiIdentityMatrix4 ] ---

    /** Unsafe version of: {@link #aiIdentityMatrix4 IdentityMatrix4} */
    public static void naiIdentityMatrix4(long mat) {
        long __functionAddress = Functions.IdentityMatrix4;
        invokePV(mat, __functionAddress);
    }

    /**
     * Get a 4x4 identity matrix.
     *
     * @param mat Matrix to receive its personal identity
     */
    public static void aiIdentityMatrix4(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat) {
        naiIdentityMatrix4(mat.address());
    }

    // --- [ aiGetImportFormatCount ] ---

    /**
     * Returns the number of import file formats available in the current Assimp build. Use {@link #aiGetImportFormatDescription GetImportFormatDescription} to retrieve infos of a specific
     * import format.
     */
    @NativeType("size_t")
    public static long aiGetImportFormatCount() {
        long __functionAddress = Functions.GetImportFormatCount;
        return invokeP(__functionAddress);
    }

    // --- [ aiGetImportFormatDescription ] ---

    /** Unsafe version of: {@link #aiGetImportFormatDescription GetImportFormatDescription} */
    public static long naiGetImportFormatDescription(long pIndex) {
        long __functionAddress = Functions.GetImportFormatDescription;
        return invokePP(pIndex, __functionAddress);
    }

    /**
     * Returns a description of the nth import file format. Use {@link #aiGetImportFormatCount GetImportFormatCount} to learn how many import formats are supported.
     *
     * @param pIndex Index of the import format to retrieve information for. Valid range is 0 to {@link #aiGetImportFormatCount GetImportFormatCount}
     *
     * @return A description of that specific import format. {@code NULL} if {@code pIndex} is out of range.
     */
    @Nullable
    @NativeType("struct aiImporterDesc *")
    public static AIImporterDesc aiGetImportFormatDescription(@NativeType("size_t") long pIndex) {
        long __result = naiGetImportFormatDescription(pIndex);
        return AIImporterDesc.createSafe(__result);
    }

    // --- [ aiVector2AreEqual ] ---

    /** Unsafe version of: {@link #aiVector2AreEqual Vector2AreEqual} */
    public static int naiVector2AreEqual(long a, long b) {
        long __functionAddress = Functions.Vector2AreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /**
     * Check if 2D vectors are equal.
     *
     * @param a first vector to compare
     * @param b second vector to compare
     */
    @NativeType("int")
    public static boolean aiVector2AreEqual(@NativeType("struct aiVector2D const *") AIVector2D a, @NativeType("struct aiVector2D const *") AIVector2D b) {
        return naiVector2AreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiVector2AreEqualEpsilon ] ---

    /** Unsafe version of: {@link #aiVector2AreEqualEpsilon Vector2AreEqualEpsilon} */
    public static int naiVector2AreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.Vector2AreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /**
     * Check if 2D vectors are equal using epsilon.
     *
     * @param a first vector to compare
     * @param b second vector to compare
     */
    @NativeType("int")
    public static boolean aiVector2AreEqualEpsilon(@NativeType("struct aiVector2D const *") AIVector2D a, @NativeType("struct aiVector2D const *") AIVector2D b, float epsilon) {
        return naiVector2AreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiVector2Add ] ---

    /** Unsafe version of: {@link #aiVector2Add Vector2Add} */
    public static void naiVector2Add(long dst, long src) {
        long __functionAddress = Functions.Vector2Add;
        invokePPV(dst, src, __functionAddress);
    }

    /**
     * Add 2D vectors.
     *
     * @param dst first addend, receives result
     * @param src vector to be added to {@code dst}
     */
    public static void aiVector2Add(@NativeType("struct aiVector2D *") AIVector2D dst, @NativeType("struct aiVector2D const *") AIVector2D src) {
        naiVector2Add(dst.address(), src.address());
    }

    // --- [ aiVector2Subtract ] ---

    /** Unsafe version of: {@link #aiVector2Subtract Vector2Subtract} */
    public static void naiVector2Subtract(long dst, long src) {
        long __functionAddress = Functions.Vector2Subtract;
        invokePPV(dst, src, __functionAddress);
    }

    /**
     * Subtract 2D vectors.
     *
     * @param dst minuend, receives result
     * @param src vector to be subtracted from {@code dst}
     */
    public static void aiVector2Subtract(@NativeType("struct aiVector2D *") AIVector2D dst, @NativeType("struct aiVector2D const *") AIVector2D src) {
        naiVector2Subtract(dst.address(), src.address());
    }

    // --- [ aiVector2Scale ] ---

    /** Unsafe version of: {@link #aiVector2Scale Vector2Scale} */
    public static void naiVector2Scale(long dst, float s) {
        long __functionAddress = Functions.Vector2Scale;
        invokePV(dst, s, __functionAddress);
    }

    /**
     * Multiply a 2D vector by a scalar.
     *
     * @param dst vector to be scaled by {@code s}
     * @param s   scale factor
     */
    public static void aiVector2Scale(@NativeType("struct aiVector2D *") AIVector2D dst, float s) {
        naiVector2Scale(dst.address(), s);
    }

    // --- [ aiVector2SymMul ] ---

    /** Unsafe version of: {@link #aiVector2SymMul Vector2SymMul} */
    public static void naiVector2SymMul(long dst, long other) {
        long __functionAddress = Functions.Vector2SymMul;
        invokePPV(dst, other, __functionAddress);
    }

    /**
     * Multiply each component of a 2D vector with the components of another vector.
     *
     * @param dst   first vector, receives result
     * @param other second vector
     */
    public static void aiVector2SymMul(@NativeType("struct aiVector2D *") AIVector2D dst, @NativeType("struct aiVector2D const *") AIVector2D other) {
        naiVector2SymMul(dst.address(), other.address());
    }

    // --- [ aiVector2DivideByScalar ] ---

    /** Unsafe version of: {@link #aiVector2DivideByScalar Vector2DivideByScalar} */
    public static void naiVector2DivideByScalar(long dst, float s) {
        long __functionAddress = Functions.Vector2DivideByScalar;
        invokePV(dst, s, __functionAddress);
    }

    /**
     * Divide a 2D vector by a scalar.
     *
     * @param dst vector to be divided by {@code s}
     * @param s   scalar divisor
     */
    public static void aiVector2DivideByScalar(@NativeType("struct aiVector2D *") AIVector2D dst, float s) {
        naiVector2DivideByScalar(dst.address(), s);
    }

    // --- [ aiVector2DivideByVector ] ---

    /** Unsafe version of: {@link #aiVector2DivideByVector Vector2DivideByVector} */
    public static void naiVector2DivideByVector(long dst, long v) {
        long __functionAddress = Functions.Vector2DivideByVector;
        invokePPV(dst, v, __functionAddress);
    }

    /**
     * Divide each component of a 2D vector by the components of another vector.
     *
     * @param dst vector as the dividend
     * @param v   vector as the divisor
     */
    public static void aiVector2DivideByVector(@NativeType("struct aiVector2D *") AIVector2D dst, @NativeType("struct aiVector2D *") AIVector2D v) {
        naiVector2DivideByVector(dst.address(), v.address());
    }

    // --- [ aiVector2Length ] ---

    /** Unsafe version of: {@link #aiVector2Length Vector2Length} */
    public static float naiVector2Length(long v) {
        long __functionAddress = Functions.Vector2Length;
        return invokePF(v, __functionAddress);
    }

    /**
     * Get the length of a 2D vector.
     *
     * @param v vector to evaluate
     */
    public static float aiVector2Length(@NativeType("struct aiVector2D const *") AIVector2D v) {
        return naiVector2Length(v.address());
    }

    // --- [ aiVector2SquareLength ] ---

    /** Unsafe version of: {@link #aiVector2SquareLength Vector2SquareLength} */
    public static float naiVector2SquareLength(long v) {
        long __functionAddress = Functions.Vector2SquareLength;
        return invokePF(v, __functionAddress);
    }

    /**
     * Get the squared length of a 2D vector.
     *
     * @param v vector to evaluate
     */
    public static float aiVector2SquareLength(@NativeType("struct aiVector2D const *") AIVector2D v) {
        return naiVector2SquareLength(v.address());
    }

    // --- [ aiVector2Negate ] ---

    /** Unsafe version of: {@link #aiVector2Negate Vector2Negate} */
    public static void naiVector2Negate(long dst) {
        long __functionAddress = Functions.Vector2Negate;
        invokePV(dst, __functionAddress);
    }

    /**
     * Negate a 2D vector.
     *
     * @param dst vector to be negated
     */
    public static void aiVector2Negate(@NativeType("struct aiVector2D *") AIVector2D dst) {
        naiVector2Negate(dst.address());
    }

    // --- [ aiVector2DotProduct ] ---

    /** Unsafe version of: {@link #aiVector2DotProduct Vector2DotProduct} */
    public static float naiVector2DotProduct(long a, long b) {
        long __functionAddress = Functions.Vector2DotProduct;
        return invokePPF(a, b, __functionAddress);
    }

    /**
     * Get the dot product of 2D vectors.
     *
     * @param a first vector
     * @param b second vector
     */
    public static float aiVector2DotProduct(@NativeType("struct aiVector2D const *") AIVector2D a, @NativeType("struct aiVector2D const *") AIVector2D b) {
        return naiVector2DotProduct(a.address(), b.address());
    }

    // --- [ aiVector2Normalize ] ---

    /** Unsafe version of: {@link #aiVector2Normalize Vector2Normalize} */
    public static void naiVector2Normalize(long v) {
        long __functionAddress = Functions.Vector2Normalize;
        invokePV(v, __functionAddress);
    }

    /**
     * Normalize a 2D vector.
     *
     * @param v vector to normalize
     */
    public static void aiVector2Normalize(@NativeType("struct aiVector2D *") AIVector2D v) {
        naiVector2Normalize(v.address());
    }

    // --- [ aiVector3AreEqual ] ---

    /** Unsafe version of: {@link #aiVector3AreEqual Vector3AreEqual} */
    public static int naiVector3AreEqual(long a, long b) {
        long __functionAddress = Functions.Vector3AreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /**
     * Check if 3D vectors are equal.
     *
     * @param a first vector to compare
     * @param b second vector to compare
     */
    @NativeType("int")
    public static boolean aiVector3AreEqual(@NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b) {
        return naiVector3AreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiVector3AreEqualEpsilon ] ---

    /** Unsafe version of: {@link #aiVector3AreEqualEpsilon Vector3AreEqualEpsilon} */
    public static int naiVector3AreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.Vector3AreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /**
     * Check if 3D vectors are equal using epsilon.
     *
     * @param a       first vector to compare
     * @param b       second vector to compare
     * @param epsilon epsilon
     */
    @NativeType("int")
    public static boolean aiVector3AreEqualEpsilon(@NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b, @NativeType("float const") float epsilon) {
        return naiVector3AreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiVector3LessThan ] ---

    /** Unsafe version of: {@link #aiVector3LessThan Vector3LessThan} */
    public static int naiVector3LessThan(long a, long b) {
        long __functionAddress = Functions.Vector3LessThan;
        return invokePPI(a, b, __functionAddress);
    }

    /**
     * Check if vector {@code a} is less than vector {@code b}.
     *
     * @param a first vector to compare
     * @param b second vector to compare
     */
    @NativeType("int")
    public static boolean aiVector3LessThan(@NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b) {
        return naiVector3LessThan(a.address(), b.address()) != 0;
    }

    // --- [ aiVector3Add ] ---

    /** Unsafe version of: {@link #aiVector3Add Vector3Add} */
    public static void naiVector3Add(long dst, long src) {
        long __functionAddress = Functions.Vector3Add;
        invokePPV(dst, src, __functionAddress);
    }

    /**
     * Add 3D vectors.
     *
     * @param dst first addend, receives result
     * @param src vector to be added to {@code dst}
     */
    public static void aiVector3Add(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D const *") AIVector3D src) {
        naiVector3Add(dst.address(), src.address());
    }

    // --- [ aiVector3Subtract ] ---

    /** Unsafe version of: {@link #aiVector3Subtract Vector3Subtract} */
    public static void naiVector3Subtract(long dst, long src) {
        long __functionAddress = Functions.Vector3Subtract;
        invokePPV(dst, src, __functionAddress);
    }

    /**
     * Subtract 3D vectors.
     *
     * @param dst minuend, receives result
     * @param src vector to be subtracted from {@code dst}
     */
    public static void aiVector3Subtract(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D const *") AIVector3D src) {
        naiVector3Subtract(dst.address(), src.address());
    }

    // --- [ aiVector3Scale ] ---

    /** Unsafe version of: {@link #aiVector3Scale Vector3Scale} */
    public static void naiVector3Scale(long dst, float s) {
        long __functionAddress = Functions.Vector3Scale;
        invokePV(dst, s, __functionAddress);
    }

    /**
     * Multiply a 3D vector by a scalar.
     *
     * @param dst vector to be scaled by {@code s}
     * @param s   scale factor
     */
    public static void aiVector3Scale(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("float const") float s) {
        naiVector3Scale(dst.address(), s);
    }

    // --- [ aiVector3SymMul ] ---

    /** Unsafe version of: {@link #aiVector3SymMul Vector3SymMul} */
    public static void naiVector3SymMul(long dst, long other) {
        long __functionAddress = Functions.Vector3SymMul;
        invokePPV(dst, other, __functionAddress);
    }

    /**
     * Multiply each component of a 3D vector with the components of another vector.
     *
     * @param dst   first vector, receives result
     * @param other second vector
     */
    public static void aiVector3SymMul(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D const *") AIVector3D other) {
        naiVector3SymMul(dst.address(), other.address());
    }

    // --- [ aiVector3DivideByScalar ] ---

    /** Unsafe version of: {@link #aiVector3DivideByScalar Vector3DivideByScalar} */
    public static void naiVector3DivideByScalar(long dst, float s) {
        long __functionAddress = Functions.Vector3DivideByScalar;
        invokePV(dst, s, __functionAddress);
    }

    /**
     * Divide a 3D vector by a scalar.
     *
     * @param dst vector to be divided by {@code s}
     * @param s   scalar divisor
     */
    public static void aiVector3DivideByScalar(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("float const") float s) {
        naiVector3DivideByScalar(dst.address(), s);
    }

    // --- [ aiVector3DivideByVector ] ---

    /** Unsafe version of: {@link #aiVector3DivideByVector Vector3DivideByVector} */
    public static void naiVector3DivideByVector(long dst, long v) {
        long __functionAddress = Functions.Vector3DivideByVector;
        invokePPV(dst, v, __functionAddress);
    }

    /**
     * Divide each component of a 3D vector by the components of another vector.
     *
     * @param dst vector as the dividend
     * @param v   vector as the divisor
     */
    public static void aiVector3DivideByVector(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D *") AIVector3D v) {
        naiVector3DivideByVector(dst.address(), v.address());
    }

    // --- [ aiVector3Length ] ---

    /** Unsafe version of: {@link #aiVector3Length Vector3Length} */
    public static float naiVector3Length(long v) {
        long __functionAddress = Functions.Vector3Length;
        return invokePF(v, __functionAddress);
    }

    /**
     * Get the length of a 3D vector.
     *
     * @param v vector to evaluate
     */
    public static float aiVector3Length(@NativeType("struct aiVector3D const *") AIVector3D v) {
        return naiVector3Length(v.address());
    }

    // --- [ aiVector3SquareLength ] ---

    /** Unsafe version of: {@link #aiVector3SquareLength Vector3SquareLength} */
    public static float naiVector3SquareLength(long v) {
        long __functionAddress = Functions.Vector3SquareLength;
        return invokePF(v, __functionAddress);
    }

    /**
     * Get the squared length of a 3D vector.
     *
     * @param v vector to evaluate
     */
    public static float aiVector3SquareLength(@NativeType("struct aiVector3D const *") AIVector3D v) {
        return naiVector3SquareLength(v.address());
    }

    // --- [ aiVector3Negate ] ---

    /** Unsafe version of: {@link #aiVector3Negate Vector3Negate} */
    public static void naiVector3Negate(long dst) {
        long __functionAddress = Functions.Vector3Negate;
        invokePV(dst, __functionAddress);
    }

    /**
     * Negate a 3D vector.
     *
     * @param dst vector to be negated
     */
    public static void aiVector3Negate(@NativeType("struct aiVector3D *") AIVector3D dst) {
        naiVector3Negate(dst.address());
    }

    // --- [ aiVector3DotProduct ] ---

    /** Unsafe version of: {@link #aiVector3DotProduct Vector3DotProduct} */
    public static float naiVector3DotProduct(long a, long b) {
        long __functionAddress = Functions.Vector3DotProduct;
        return invokePPF(a, b, __functionAddress);
    }

    /**
     * Get the dot product of 3D vectors.
     *
     * @param a first vector
     * @param b second vector
     */
    public static float aiVector3DotProduct(@NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b) {
        return naiVector3DotProduct(a.address(), b.address());
    }

    // --- [ aiVector3CrossProduct ] ---

    /** Unsafe version of: {@link #aiVector3CrossProduct Vector3CrossProduct} */
    public static void naiVector3CrossProduct(long dst, long a, long b) {
        long __functionAddress = Functions.Vector3CrossProduct;
        invokePPPV(dst, a, b, __functionAddress);
    }

    /**
     * Get cross product of 3D vectors.
     *
     * @param dst vector to receive the result
     * @param a   first vector
     * @param b   second vector
     */
    public static void aiVector3CrossProduct(@NativeType("struct aiVector3D *") AIVector3D dst, @NativeType("struct aiVector3D const *") AIVector3D a, @NativeType("struct aiVector3D const *") AIVector3D b) {
        naiVector3CrossProduct(dst.address(), a.address(), b.address());
    }

    // --- [ aiVector3Normalize ] ---

    /** Unsafe version of: {@link #aiVector3Normalize Vector3Normalize} */
    public static void naiVector3Normalize(long v) {
        long __functionAddress = Functions.Vector3Normalize;
        invokePV(v, __functionAddress);
    }

    /**
     * Normalize a 3D vector.
     *
     * @param v vector to normalize
     */
    public static void aiVector3Normalize(@NativeType("struct aiVector3D *") AIVector3D v) {
        naiVector3Normalize(v.address());
    }

    // --- [ aiVector3NormalizeSafe ] ---

    /** Unsafe version of: {@link #aiVector3NormalizeSafe Vector3NormalizeSafe} */
    public static void naiVector3NormalizeSafe(long v) {
        long __functionAddress = Functions.Vector3NormalizeSafe;
        invokePV(v, __functionAddress);
    }

    /**
     * Check for division by zero and normalize a 3D vector.
     *
     * @param v vector to normalize
     */
    public static void aiVector3NormalizeSafe(@NativeType("struct aiVector3D *") AIVector3D v) {
        naiVector3NormalizeSafe(v.address());
    }

    // --- [ aiVector3RotateByQuaternion ] ---

    /** Unsafe version of: {@link #aiVector3RotateByQuaternion Vector3RotateByQuaternion} */
    public static void naiVector3RotateByQuaternion(long v, long q) {
        long __functionAddress = Functions.Vector3RotateByQuaternion;
        invokePPV(v, q, __functionAddress);
    }

    /**
     * Rotate a 3D vector by a quaternion.
     *
     * @param v the vector to rotate by {@code q}
     * @param q quaternion to use to rotate {@code v}
     */
    public static void aiVector3RotateByQuaternion(@NativeType("struct aiVector3D *") AIVector3D v, @NativeType("struct aiQuaternion const *") AIQuaternion q) {
        naiVector3RotateByQuaternion(v.address(), q.address());
    }

    // --- [ aiMatrix3FromMatrix4 ] ---

    /** Unsafe version of: {@link #aiMatrix3FromMatrix4 Matrix3FromMatrix4} */
    public static void naiMatrix3FromMatrix4(long dst, long mat) {
        long __functionAddress = Functions.Matrix3FromMatrix4;
        invokePPV(dst, mat, __functionAddress);
    }

    /**
     * Construct a 3x3 matrix from a 4x4 matrix.
     *
     * @param dst receives the output matrix
     * @param mat the 4x4 matrix to use
     */
    public static void aiMatrix3FromMatrix4(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 dst, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat) {
        naiMatrix3FromMatrix4(dst.address(), mat.address());
    }

    // --- [ aiMatrix3FromQuaternion ] ---

    /** Unsafe version of: {@link #aiMatrix3FromQuaternion Matrix3FromQuaternion} */
    public static void naiMatrix3FromQuaternion(long mat, long q) {
        long __functionAddress = Functions.Matrix3FromQuaternion;
        invokePPV(mat, q, __functionAddress);
    }

    /**
     * Construct a 3x3 matrix from a quaternion.
     *
     * @param mat receives the output matrix
     * @param q   the quaternion matrix to use
     */
    public static void aiMatrix3FromQuaternion(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, @NativeType("struct aiQuaternion const *") AIQuaternion q) {
        naiMatrix3FromQuaternion(mat.address(), q.address());
    }

    // --- [ aiMatrix3AreEqual ] ---

    /** Unsafe version of: {@link #aiMatrix3AreEqual Matrix3AreEqual} */
    public static int naiMatrix3AreEqual(long a, long b) {
        long __functionAddress = Functions.Matrix3AreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /**
     * Check if 3x3 matrices are equal.
     *
     * @param a first matrix to compare
     * @param b second matrix to compare
     */
    @NativeType("int")
    public static boolean aiMatrix3AreEqual(@NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 a, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 b) {
        return naiMatrix3AreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiMatrix3AreEqualEpsilon ] ---

    /** Unsafe version of: {@link #aiMatrix3AreEqualEpsilon Matrix3AreEqualEpsilon} */
    public static int naiMatrix3AreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.Matrix3AreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /**
     * Check if 3x3 matrices are equal.
     *
     * @param a       first matrix to compare
     * @param b       second matrix to compare
     * @param epsilon epsilon
     */
    @NativeType("int")
    public static boolean aiMatrix3AreEqualEpsilon(@NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 a, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 b, @NativeType("float const") float epsilon) {
        return naiMatrix3AreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiMatrix3Inverse ] ---

    /** Unsafe version of: {@link #aiMatrix3Inverse Matrix3Inverse} */
    public static void naiMatrix3Inverse(long mat) {
        long __functionAddress = Functions.Matrix3Inverse;
        invokePV(mat, __functionAddress);
    }

    /**
     * Invert a 3x3 matrix.
     *
     * @param mat matrix to invert
     */
    public static void aiMatrix3Inverse(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat) {
        naiMatrix3Inverse(mat.address());
    }

    // --- [ aiMatrix3Determinant ] ---

    /** Unsafe version of: {@link #aiMatrix3Determinant Matrix3Determinant} */
    public static float naiMatrix3Determinant(long mat) {
        long __functionAddress = Functions.Matrix3Determinant;
        return invokePF(mat, __functionAddress);
    }

    /**
     * Get the determinant of a 3x3 matrix.
     *
     * @param mat matrix to get the determinant from
     */
    public static float aiMatrix3Determinant(@NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 mat) {
        return naiMatrix3Determinant(mat.address());
    }

    // --- [ aiMatrix3RotationZ ] ---

    /** Unsafe version of: {@link #aiMatrix3RotationZ Matrix3RotationZ} */
    public static void naiMatrix3RotationZ(long mat, float angle) {
        long __functionAddress = Functions.Matrix3RotationZ;
        invokePV(mat, angle, __functionAddress);
    }

    /**
     * Get a 3x3 rotation matrix around the Z axis.
     *
     * @param mat   receives the output matrix
     * @param angle rotation angle, in radians
     */
    public static void aiMatrix3RotationZ(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, float angle) {
        naiMatrix3RotationZ(mat.address(), angle);
    }

    // --- [ aiMatrix3FromRotationAroundAxis ] ---

    /** Unsafe version of: {@link #aiMatrix3FromRotationAroundAxis Matrix3FromRotationAroundAxis} */
    public static void naiMatrix3FromRotationAroundAxis(long mat, long axis, float angle) {
        long __functionAddress = Functions.Matrix3FromRotationAroundAxis;
        invokePPV(mat, axis, angle, __functionAddress);
    }

    /**
     * Returns a 3x3 rotation matrix for a rotation around an arbitrary axis.
     *
     * @param mat   receives the output matrix
     * @param axis  rotation axis, should be a normalized vector
     * @param angle rotation angle, in radians
     */
    public static void aiMatrix3FromRotationAroundAxis(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, @NativeType("struct aiVector3D const *") AIVector3D axis, float angle) {
        naiMatrix3FromRotationAroundAxis(mat.address(), axis.address(), angle);
    }

    // --- [ aiMatrix3Translation ] ---

    /** Unsafe version of: {@link #aiMatrix3Translation Matrix3Translation} */
    public static void naiMatrix3Translation(long mat, long translation) {
        long __functionAddress = Functions.Matrix3Translation;
        invokePPV(mat, translation, __functionAddress);
    }

    /**
     * Get a 3x3 translation matrix.
     *
     * @param mat         receives the output matrix
     * @param translation the translation vector
     */
    public static void aiMatrix3Translation(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, @NativeType("struct aiVector2D const *") AIVector2D translation) {
        naiMatrix3Translation(mat.address(), translation.address());
    }

    // --- [ aiMatrix3FromTo ] ---

    /** Unsafe version of: {@link #aiMatrix3FromTo Matrix3FromTo} */
    public static void naiMatrix3FromTo(long mat, long from, long to) {
        long __functionAddress = Functions.Matrix3FromTo;
        invokePPPV(mat, from, to, __functionAddress);
    }

    /**
     * Create a 3x3 matrix that rotates one vector to another vector.
     *
     * @param mat  receives the output matrix
     * @param from vector to rotate from
     * @param to   vector to rotate to
     */
    public static void aiMatrix3FromTo(@NativeType("struct aiMatrix3x3 *") AIMatrix3x3 mat, @NativeType("struct aiVector3D const *") AIVector3D from, @NativeType("struct aiVector3D const *") AIVector3D to) {
        naiMatrix3FromTo(mat.address(), from.address(), to.address());
    }

    // --- [ aiMatrix4FromMatrix3 ] ---

    /** Unsafe version of: {@link #aiMatrix4FromMatrix3 Matrix4FromMatrix3} */
    public static void naiMatrix4FromMatrix3(long dst, long mat) {
        long __functionAddress = Functions.Matrix4FromMatrix3;
        invokePPV(dst, mat, __functionAddress);
    }

    /**
     * Construct a 4x4 matrix from a 3x3 matrix.
     *
     * @param dst receives the output matrix
     * @param mat the 3x3 matrix to use
     */
    public static void aiMatrix4FromMatrix3(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 dst, @NativeType("struct aiMatrix3x3 const *") AIMatrix3x3 mat) {
        naiMatrix4FromMatrix3(dst.address(), mat.address());
    }

    // --- [ aiMatrix4FromScalingQuaternionPosition ] ---

    /** Unsafe version of: {@link #aiMatrix4FromScalingQuaternionPosition Matrix4FromScalingQuaternionPosition} */
    public static void naiMatrix4FromScalingQuaternionPosition(long mat, long scaling, long rotation, long position) {
        long __functionAddress = Functions.Matrix4FromScalingQuaternionPosition;
        invokePPPPV(mat, scaling, rotation, position, __functionAddress);
    }

    /**
     * Construct a 4x4 matrix from scaling, rotation and position.
     *
     * @param mat      receives the output matrix
     * @param scaling  the scaling for the x,y,z axes
     * @param rotation the rotation as a hamilton quaternion
     * @param position the position for the x,y,z axes
     */
    public static void aiMatrix4FromScalingQuaternionPosition(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D scaling, @NativeType("struct aiQuaternion const *") AIQuaternion rotation, @NativeType("struct aiVector3D const *") AIVector3D position) {
        naiMatrix4FromScalingQuaternionPosition(mat.address(), scaling.address(), rotation.address(), position.address());
    }

    // --- [ aiMatrix4Add ] ---

    /** Unsafe version of: {@link #aiMatrix4Add Matrix4Add} */
    public static void naiMatrix4Add(long dst, long src) {
        long __functionAddress = Functions.Matrix4Add;
        invokePPV(dst, src, __functionAddress);
    }

    /**
     * Add 4x4 matrices.
     *
     * @param dst first addend, receives result
     * @param src matrix to be added to {@code dst}
     */
    public static void aiMatrix4Add(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 dst, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 src) {
        naiMatrix4Add(dst.address(), src.address());
    }

    // --- [ aiMatrix4AreEqual ] ---

    /** Unsafe version of: {@link #aiMatrix4AreEqual Matrix4AreEqual} */
    public static int naiMatrix4AreEqual(long a, long b) {
        long __functionAddress = Functions.Matrix4AreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /**
     * Check if 4x4 matrices are equal.
     *
     * @param a first matrix to compare
     * @param b second matrix to compare
     */
    @NativeType("int")
    public static boolean aiMatrix4AreEqual(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 a, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 b) {
        return naiMatrix4AreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiMatrix4AreEqualEpsilon ] ---

    /** Unsafe version of: {@link #aiMatrix4AreEqualEpsilon Matrix4AreEqualEpsilon} */
    public static int naiMatrix4AreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.Matrix4AreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /**
     * Check if 4x4 matrices are equal.
     *
     * @param a       first matrix to compare
     * @param b       second matrix to compare
     * @param epsilon epsilon
     */
    @NativeType("int")
    public static boolean aiMatrix4AreEqualEpsilon(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 a, @NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 b, @NativeType("float const") float epsilon) {
        return naiMatrix4AreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiMatrix4Inverse ] ---

    /** Unsafe version of: {@link #aiMatrix4Inverse Matrix4Inverse} */
    public static void naiMatrix4Inverse(long mat) {
        long __functionAddress = Functions.Matrix4Inverse;
        invokePV(mat, __functionAddress);
    }

    /**
     * Invert a 4x4 matrix.
     *
     * @param mat matrix to invert
     */
    public static void aiMatrix4Inverse(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat) {
        naiMatrix4Inverse(mat.address());
    }

    // --- [ aiMatrix4Determinant ] ---

    /** Unsafe version of: {@link #aiMatrix4Determinant Matrix4Determinant} */
    public static float naiMatrix4Determinant(long mat) {
        long __functionAddress = Functions.Matrix4Determinant;
        return invokePF(mat, __functionAddress);
    }

    /**
     * Get the determinant of a 4x4 matrix.
     *
     * @param mat matrix to get the determinant from
     *
     * @return the determinant of the matrix
     */
    public static float aiMatrix4Determinant(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat) {
        return naiMatrix4Determinant(mat.address());
    }

    // --- [ aiMatrix4IsIdentity ] ---

    /** Unsafe version of: {@link #aiMatrix4IsIdentity Matrix4IsIdentity} */
    public static int naiMatrix4IsIdentity(long mat) {
        long __functionAddress = Functions.Matrix4IsIdentity;
        return invokePI(mat, __functionAddress);
    }

    /**
     * Returns true of the matrix is the identity matrix.
     *
     * @param mat matrix to get the determinant from
     */
    @NativeType("int")
    public static boolean aiMatrix4IsIdentity(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat) {
        return naiMatrix4IsIdentity(mat.address()) != 0;
    }

    // --- [ aiMatrix4DecomposeIntoScalingEulerAnglesPosition ] ---

    /** Unsafe version of: {@link #aiMatrix4DecomposeIntoScalingEulerAnglesPosition Matrix4DecomposeIntoScalingEulerAnglesPosition} */
    public static void naiMatrix4DecomposeIntoScalingEulerAnglesPosition(long mat, long scaling, long rotation, long position) {
        long __functionAddress = Functions.Matrix4DecomposeIntoScalingEulerAnglesPosition;
        invokePPPPV(mat, scaling, rotation, position, __functionAddress);
    }

    /**
     * Decompose a transformation matrix into its scaling, rotational as euler angles, and translational components.
     *
     * @param mat      matrix to decompose
     * @param scaling  receives the output scaling for the x,y,z axes
     * @param rotation receives the output rotation as a Euler angles
     * @param position receives the output position for the x,y,z axes
     */
    public static void aiMatrix4DecomposeIntoScalingEulerAnglesPosition(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiVector3D *") AIVector3D scaling, @NativeType("struct aiVector3D *") AIVector3D rotation, @NativeType("struct aiVector3D *") AIVector3D position) {
        naiMatrix4DecomposeIntoScalingEulerAnglesPosition(mat.address(), scaling.address(), rotation.address(), position.address());
    }

    // --- [ aiMatrix4DecomposeIntoScalingAxisAnglePosition ] ---

    /** Unsafe version of: {@link #aiMatrix4DecomposeIntoScalingAxisAnglePosition Matrix4DecomposeIntoScalingAxisAnglePosition} */
    public static void naiMatrix4DecomposeIntoScalingAxisAnglePosition(long mat, long scaling, long axis, long angle, long position) {
        long __functionAddress = Functions.Matrix4DecomposeIntoScalingAxisAnglePosition;
        invokePPPPPV(mat, scaling, axis, angle, position, __functionAddress);
    }

    /**
     * Decompose a transformation matrix into its scaling, rotational split into an axis and rotational angle, and it's translational components.
     *
     * @param mat      matrix to decompose
     * @param scaling  receives the rotational component
     * @param axis     receives the output rotation axis
     * @param angle    receives the output rotation angle
     * @param position receives the output position for the x,y,z axes
     */
    public static void aiMatrix4DecomposeIntoScalingAxisAnglePosition(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiVector3D *") AIVector3D scaling, @NativeType("struct aiVector3D *") AIVector3D axis, @NativeType("ai_real *") FloatBuffer angle, @NativeType("struct aiVector3D *") AIVector3D position) {
        if (CHECKS) {
            check(angle, 1);
        }
        naiMatrix4DecomposeIntoScalingAxisAnglePosition(mat.address(), scaling.address(), axis.address(), memAddress(angle), position.address());
    }

    // --- [ aiMatrix4DecomposeNoScaling ] ---

    /** Unsafe version of: {@link #aiMatrix4DecomposeNoScaling Matrix4DecomposeNoScaling} */
    public static void naiMatrix4DecomposeNoScaling(long mat, long rotation, long position) {
        long __functionAddress = Functions.Matrix4DecomposeNoScaling;
        invokePPPV(mat, rotation, position, __functionAddress);
    }

    /**
     * Decompose a transformation matrix into its rotational and translational components.
     *
     * @param mat      matrix to decompose
     * @param rotation receives the rotational component
     * @param position receives the translational component
     */
    public static void aiMatrix4DecomposeNoScaling(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiQuaternion *") AIQuaternion rotation, @NativeType("struct aiVector3D *") AIVector3D position) {
        naiMatrix4DecomposeNoScaling(mat.address(), rotation.address(), position.address());
    }

    // --- [ aiMatrix4FromEulerAngles ] ---

    /** Unsafe version of: {@link #aiMatrix4FromEulerAngles Matrix4FromEulerAngles} */
    public static void naiMatrix4FromEulerAngles(long mat, float x, float y, float z) {
        long __functionAddress = Functions.Matrix4FromEulerAngles;
        invokePV(mat, x, y, z, __functionAddress);
    }

    /**
     * Creates a 4x4 matrix from a set of euler angles.
     *
     * @param mat receives the output matrix
     * @param x   rotation angle for the x-axis, in radians
     * @param y   rotation angle for the y-axis, in radians
     * @param z   rotation angle for the z-axis, in radians
     */
    public static void aiMatrix4FromEulerAngles(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, float x, float y, float z) {
        naiMatrix4FromEulerAngles(mat.address(), x, y, z);
    }

    // --- [ aiMatrix4RotationX ] ---

    /** Unsafe version of: {@link #aiMatrix4RotationX Matrix4RotationX} */
    public static void naiMatrix4RotationX(long mat, float angle) {
        long __functionAddress = Functions.Matrix4RotationX;
        invokePV(mat, angle, __functionAddress);
    }

    /**
     * Get a 4x4 rotation matrix around the X axis.
     *
     * @param mat   receives the output matrix
     * @param angle rotation angle, in radians
     */
    public static void aiMatrix4RotationX(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, float angle) {
        naiMatrix4RotationX(mat.address(), angle);
    }

    // --- [ aiMatrix4RotationY ] ---

    /** Unsafe version of: {@link #aiMatrix4RotationY Matrix4RotationY} */
    public static void naiMatrix4RotationY(long mat, float angle) {
        long __functionAddress = Functions.Matrix4RotationY;
        invokePV(mat, angle, __functionAddress);
    }

    /**
     * Get a 4x4 rotation matrix around the Y axis.
     *
     * @param mat   receives the output matrix
     * @param angle rotation angle, in radians
     */
    public static void aiMatrix4RotationY(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, float angle) {
        naiMatrix4RotationY(mat.address(), angle);
    }

    // --- [ aiMatrix4RotationZ ] ---

    /** Unsafe version of: {@link #aiMatrix4RotationZ Matrix4RotationZ} */
    public static void naiMatrix4RotationZ(long mat, float angle) {
        long __functionAddress = Functions.Matrix4RotationZ;
        invokePV(mat, angle, __functionAddress);
    }

    /**
     * Get a 4x4 rotation matrix around the Z axis.
     *
     * @param mat   receives the output matrix
     * @param angle rotation angle, in radians
     */
    public static void aiMatrix4RotationZ(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, float angle) {
        naiMatrix4RotationZ(mat.address(), angle);
    }

    // --- [ aiMatrix4FromRotationAroundAxis ] ---

    /** Unsafe version of: {@link #aiMatrix4FromRotationAroundAxis Matrix4FromRotationAroundAxis} */
    public static void naiMatrix4FromRotationAroundAxis(long mat, long axis, float angle) {
        long __functionAddress = Functions.Matrix4FromRotationAroundAxis;
        invokePPV(mat, axis, angle, __functionAddress);
    }

    /**
     * Returns a 4x4 rotation matrix for a rotation around an arbitrary axis.
     *
     * @param mat   receives the output matrix
     * @param axis  rotation axis, should be a normalized vector
     * @param angle rotation angle, in radians
     */
    public static void aiMatrix4FromRotationAroundAxis(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D axis, float angle) {
        naiMatrix4FromRotationAroundAxis(mat.address(), axis.address(), angle);
    }

    // --- [ aiMatrix4Translation ] ---

    /** Unsafe version of: {@link #aiMatrix4Translation Matrix4Translation} */
    public static void naiMatrix4Translation(long mat, long translation) {
        long __functionAddress = Functions.Matrix4Translation;
        invokePPV(mat, translation, __functionAddress);
    }

    /**
     * Get a 4x4 translation matrix.
     *
     * @param mat         receives the output matrix
     * @param translation the translation vector
     */
    public static void aiMatrix4Translation(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D translation) {
        naiMatrix4Translation(mat.address(), translation.address());
    }

    // --- [ aiMatrix4Scaling ] ---

    /** Unsafe version of: {@link #aiMatrix4Scaling Matrix4Scaling} */
    public static void naiMatrix4Scaling(long mat, long scaling) {
        long __functionAddress = Functions.Matrix4Scaling;
        invokePPV(mat, scaling, __functionAddress);
    }

    /**
     * Get a 4x4 scaling matrix.
     *
     * @param mat     receives the output matrix
     * @param scaling the scaling vector
     */
    public static void aiMatrix4Scaling(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D scaling) {
        naiMatrix4Scaling(mat.address(), scaling.address());
    }

    // --- [ aiMatrix4FromTo ] ---

    /** Unsafe version of: {@link #aiMatrix4FromTo Matrix4FromTo} */
    public static void naiMatrix4FromTo(long mat, long from, long to) {
        long __functionAddress = Functions.Matrix4FromTo;
        invokePPPV(mat, from, to, __functionAddress);
    }

    /**
     * Create a 4x4 matrix that rotates one vector to another vector.
     *
     * @param mat  receives the output matrix
     * @param from vector to rotate from
     * @param to   vector to rotate to
     */
    public static void aiMatrix4FromTo(@NativeType("struct aiMatrix4x4 *") AIMatrix4x4 mat, @NativeType("struct aiVector3D const *") AIVector3D from, @NativeType("struct aiVector3D const *") AIVector3D to) {
        naiMatrix4FromTo(mat.address(), from.address(), to.address());
    }

    // --- [ aiQuaternionFromEulerAngles ] ---

    /** Unsafe version of: {@link #aiQuaternionFromEulerAngles QuaternionFromEulerAngles} */
    public static void naiQuaternionFromEulerAngles(long q, float x, float y, float z) {
        long __functionAddress = Functions.QuaternionFromEulerAngles;
        invokePV(q, x, y, z, __functionAddress);
    }

    /**
     * Create a Quaternion from euler angles.
     *
     * @param q receives the output quaternion
     * @param x rotation angle for the x-axis, in radians
     * @param y rotation angle for the y-axis, in radians
     * @param z rotation angle for the z-axis, in radians
     */
    public static void aiQuaternionFromEulerAngles(@NativeType("struct aiQuaternion *") AIQuaternion q, float x, float y, float z) {
        naiQuaternionFromEulerAngles(q.address(), x, y, z);
    }

    // --- [ aiQuaternionFromAxisAngle ] ---

    /** Unsafe version of: {@link #aiQuaternionFromAxisAngle QuaternionFromAxisAngle} */
    public static void naiQuaternionFromAxisAngle(long q, long axis, float angle) {
        long __functionAddress = Functions.QuaternionFromAxisAngle;
        invokePPV(q, axis, angle, __functionAddress);
    }

    /**
     * Create a Quaternion from an axis angle pair.
     *
     * @param q     receives the output quaternion
     * @param axis  the orientation axis
     * @param angle the rotation angle, in radians
     */
    public static void aiQuaternionFromAxisAngle(@NativeType("struct aiQuaternion *") AIQuaternion q, @NativeType("struct aiVector3D const *") AIVector3D axis, float angle) {
        naiQuaternionFromAxisAngle(q.address(), axis.address(), angle);
    }

    // --- [ aiQuaternionFromNormalizedQuaternion ] ---

    /** Unsafe version of: {@link #aiQuaternionFromNormalizedQuaternion QuaternionFromNormalizedQuaternion} */
    public static void naiQuaternionFromNormalizedQuaternion(long q, long normalized) {
        long __functionAddress = Functions.QuaternionFromNormalizedQuaternion;
        invokePPV(q, normalized, __functionAddress);
    }

    /**
     * Create a Quaternion from a normalized quaternion stored in a 3D vector.
     *
     * @param q          receives the output quaternion
     * @param normalized the vector that stores the quaternion
     */
    public static void aiQuaternionFromNormalizedQuaternion(@NativeType("struct aiQuaternion *") AIQuaternion q, @NativeType("struct aiVector3D const *") AIVector3D normalized) {
        naiQuaternionFromNormalizedQuaternion(q.address(), normalized.address());
    }

    // --- [ aiQuaternionAreEqual ] ---

    /** Unsafe version of: {@link #aiQuaternionAreEqual QuaternionAreEqual} */
    public static int naiQuaternionAreEqual(long a, long b) {
        long __functionAddress = Functions.QuaternionAreEqual;
        return invokePPI(a, b, __functionAddress);
    }

    /**
     * Check if quaternions are equal.
     *
     * @param a first quaternion to compare
     * @param b second quaternion to compare
     */
    @NativeType("int")
    public static boolean aiQuaternionAreEqual(@NativeType("struct aiQuaternion const *") AIQuaternion a, @NativeType("struct aiQuaternion const *") AIQuaternion b) {
        return naiQuaternionAreEqual(a.address(), b.address()) != 0;
    }

    // --- [ aiQuaternionAreEqualEpsilon ] ---

    /** Unsafe version of: {@link #aiQuaternionAreEqualEpsilon QuaternionAreEqualEpsilon} */
    public static int naiQuaternionAreEqualEpsilon(long a, long b, float epsilon) {
        long __functionAddress = Functions.QuaternionAreEqualEpsilon;
        return invokePPI(a, b, epsilon, __functionAddress);
    }

    /**
     * Check if quaternions are equal using epsilon.
     *
     * @param a       first quaternion to compare
     * @param b       second quaternion to compare
     * @param epsilon epsilon
     */
    @NativeType("int")
    public static boolean aiQuaternionAreEqualEpsilon(@NativeType("struct aiQuaternion const *") AIQuaternion a, @NativeType("struct aiQuaternion const *") AIQuaternion b, @NativeType("float const") float epsilon) {
        return naiQuaternionAreEqualEpsilon(a.address(), b.address(), epsilon) != 0;
    }

    // --- [ aiQuaternionNormalize ] ---

    /** Unsafe version of: {@link #aiQuaternionNormalize QuaternionNormalize} */
    public static void naiQuaternionNormalize(long q) {
        long __functionAddress = Functions.QuaternionNormalize;
        invokePV(q, __functionAddress);
    }

    /**
     * Normalize a quaternion.
     *
     * @param q quaternion to normalize
     */
    public static void aiQuaternionNormalize(@NativeType("struct aiQuaternion *") AIQuaternion q) {
        naiQuaternionNormalize(q.address());
    }

    // --- [ aiQuaternionConjugate ] ---

    /** Unsafe version of: {@link #aiQuaternionConjugate QuaternionConjugate} */
    public static void naiQuaternionConjugate(long q) {
        long __functionAddress = Functions.QuaternionConjugate;
        invokePV(q, __functionAddress);
    }

    /**
     * Compute quaternion conjugate.
     *
     * @param q quaternion to compute conjugate, receives the output quaternion
     */
    public static void aiQuaternionConjugate(@NativeType("struct aiQuaternion *") AIQuaternion q) {
        naiQuaternionConjugate(q.address());
    }

    // --- [ aiQuaternionMultiply ] ---

    /** Unsafe version of: {@link #aiQuaternionMultiply QuaternionMultiply} */
    public static void naiQuaternionMultiply(long dst, long q) {
        long __functionAddress = Functions.QuaternionMultiply;
        invokePPV(dst, q, __functionAddress);
    }

    /**
     * Multiply quaternions.
     *
     * @param dst first quaternion, receives the output quaternion
     * @param q   second quaternion
     */
    public static void aiQuaternionMultiply(@NativeType("struct aiQuaternion *") AIQuaternion dst, @NativeType("struct aiQuaternion const *") AIQuaternion q) {
        naiQuaternionMultiply(dst.address(), q.address());
    }

    // --- [ aiQuaternionInterpolate ] ---

    /** Unsafe version of: {@link #aiQuaternionInterpolate QuaternionInterpolate} */
    public static void naiQuaternionInterpolate(long dst, long start, long end, float factor) {
        long __functionAddress = Functions.QuaternionInterpolate;
        invokePPPV(dst, start, end, factor, __functionAddress);
    }

    /**
     * Performs a spherical interpolation between two quaternions.
     *
     * @param dst    receives the quaternion resulting from the interpolation
     * @param start  quaternion when {@code factor == 0}
     * @param end    quaternion when {@code factor == 1}
     * @param factor interpolation factor between 0 and 1
     */
    public static void aiQuaternionInterpolate(@NativeType("struct aiQuaternion *") AIQuaternion dst, @NativeType("struct aiQuaternion const *") AIQuaternion start, @NativeType("struct aiQuaternion const *") AIQuaternion end, float factor) {
        naiQuaternionInterpolate(dst.address(), start.address(), end.address(), factor);
    }

    // --- [ aiGetImporterDesc ] ---

    /** Unsafe version of: {@link #aiGetImporterDesc GetImporterDesc} */
    public static long naiGetImporterDesc(long extension) {
        long __functionAddress = Functions.GetImporterDesc;
        return invokePP(extension, __functionAddress);
    }

    /**
     * Returns the Importer description for a given extension.
     * 
     * <p>Will return a {@code NULL}-pointer if no assigned importer desc. was found for the given extension.</p>
     *
     * @param extension The extension to look for
     *
     * @return A pointer showing to the ImporterDesc, {@link AIImporterDesc}.
     */
    @Nullable
    @NativeType("struct aiImporterDesc *")
    public static AIImporterDesc aiGetImporterDesc(@NativeType("char const *") ByteBuffer extension) {
        if (CHECKS) {
            checkNT1(extension);
        }
        long __result = naiGetImporterDesc(memAddress(extension));
        return AIImporterDesc.createSafe(__result);
    }

    /**
     * Returns the Importer description for a given extension.
     * 
     * <p>Will return a {@code NULL}-pointer if no assigned importer desc. was found for the given extension.</p>
     *
     * @param extension The extension to look for
     *
     * @return A pointer showing to the ImporterDesc, {@link AIImporterDesc}.
     */
    @Nullable
    @NativeType("struct aiImporterDesc *")
    public static AIImporterDesc aiGetImporterDesc(@NativeType("char const *") CharSequence extension) {
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

    // --- [ TextureTypeToString ] ---

    /** Unsafe version of: {@link #TextureTypeToString} */
    public static long nTextureTypeToString(int in) {
        long __functionAddress = Functions.TextureTypeToString;
        return invokeP(in, __functionAddress);
    }

    /** Get a string for a given {@code aiTextureType}. */
    @Nullable
    @NativeType("char const *")
    public static String TextureTypeToString(@NativeType("aiTextureType") int in) {
        long __result = nTextureTypeToString(in);
        return memASCIISafe(__result);
    }

    // --- [ aiGetMaterialProperty ] ---

    /** Unsafe version of: {@link #aiGetMaterialProperty GetMaterialProperty} */
    public static int naiGetMaterialProperty(long pMat, long pKey, int type, int index, long mPropOut) {
        long __functionAddress = Functions.GetMaterialProperty;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPI(pMat, pKey, type, index, mPropOut, __functionAddress);
    }

    /**
     * Retrieve a material property with a specific key from the material.
     *
     * @param pMat     Pointer to the input material. May not be {@code NULL}
     * @param pKey     Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type     Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index    Index of the texture to be retrieved.
     * @param mPropOut Pointer to receive a pointer to a valid {@link AIMaterialProperty} structure or {@code NULL} if the key has not been found.
     *
     * @return Return_xxx values.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialProperty(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiMaterialProperty const **") PointerBuffer mPropOut) {
        if (CHECKS) {
            checkNT1(pKey);
            check(mPropOut, 1);
        }
        return naiGetMaterialProperty(pMat.address(), memAddress(pKey), type, index, memAddress(mPropOut));
    }

    /**
     * Retrieve a material property with a specific key from the material.
     *
     * @param pMat     Pointer to the input material. May not be {@code NULL}
     * @param pKey     Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type     Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index    Index of the texture to be retrieved.
     * @param mPropOut Pointer to receive a pointer to a valid {@link AIMaterialProperty} structure or {@code NULL} if the key has not been found.
     *
     * @return Return_xxx values.
     */
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

    /**
     * Retrieve a material property with a specific key from the material.
     *
     * @param pMat     Pointer to the input material. May not be {@code NULL}
     * @param pKey     Key to search for. One of the AI_MATKEY_XXX constants.
     * @param mPropOut Pointer to receive a pointer to a valid {@link AIMaterialProperty} structure or {@code NULL} if the key has not been found.
     *
     * @return Return_xxx values.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialProperty(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("struct aiMaterialProperty const **") PointerBuffer mPropOut) {
        return aiGetMaterialProperty(pMat, pKey, 0, 0, mPropOut);
    }

    /**
     * Retrieve a material property with a specific key from the material.
     *
     * @param pMat     Pointer to the input material. May not be {@code NULL}
     * @param pKey     Key to search for. One of the AI_MATKEY_XXX constants.
     * @param mPropOut Pointer to receive a pointer to a valid {@link AIMaterialProperty} structure or {@code NULL} if the key has not been found.
     *
     * @return Return_xxx values.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialProperty(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("struct aiMaterialProperty const **") PointerBuffer mPropOut) {
        return aiGetMaterialProperty(pMat, pKey, 0, 0, mPropOut);
    }

    // --- [ aiGetMaterialFloatArray ] ---

    /**
     * Unsafe version of: {@link #aiGetMaterialFloatArray GetMaterialFloatArray}
     *
     * @param pMax Specifies the size of the given buffer, in float's. Receives the number of values (not bytes!) read.
     */
    public static int naiGetMaterialFloatArray(long pMat, long pKey, int type, int index, long pOut, long pMax) {
        long __functionAddress = Functions.GetMaterialFloatArray;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPPI(pMat, pKey, type, index, pOut, pMax, __functionAddress);
    }

    /**
     * Retrieve an array of float values with a specific key from the material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a buffer to receive the result.
     * @param pMax  Specifies the size of the given buffer, in float's. Receives the number of values (not bytes!) read.
     *
     * @return Specifies whether the key has been found. If not, the output arrays remains unmodified and {@code pMax} is set to 0.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialFloatArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("float *") FloatBuffer pOut, @Nullable @NativeType("unsigned int *") IntBuffer pMax) {
        if (CHECKS) {
            checkNT1(pKey);
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax.get(pMax.position())); }
        }
        return naiGetMaterialFloatArray(pMat.address(), memAddress(pKey), type, index, memAddress(pOut), memAddressSafe(pMax));
    }

    /**
     * Retrieve an array of float values with a specific key from the material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a buffer to receive the result.
     * @param pMax  Specifies the size of the given buffer, in float's. Receives the number of values (not bytes!) read.
     *
     * @return Specifies whether the key has been found. If not, the output arrays remains unmodified and {@code pMax} is set to 0.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialFloatArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("float *") FloatBuffer pOut, @Nullable @NativeType("unsigned int *") IntBuffer pMax) {
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

    /**
     * Unsafe version of: {@link #aiGetMaterialIntegerArray GetMaterialIntegerArray}
     *
     * @param pMax Specifies the size of the given buffer, in int's. Receives the number of values (not bytes!) read.
     */
    public static int naiGetMaterialIntegerArray(long pMat, long pKey, int type, int index, long pOut, long pMax) {
        long __functionAddress = Functions.GetMaterialIntegerArray;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPPI(pMat, pKey, type, index, pOut, pMax, __functionAddress);
    }

    /**
     * Retrieve an array of integer values with a specific key from a material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a buffer to receive the result.
     * @param pMax  Specifies the size of the given buffer, in int's. Receives the number of values (not bytes!) read.
     *
     * @return Specifies whether the key has been found. If not, the output arrays remains unmodified and {@code pMax} is set to 0.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialIntegerArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("int *") IntBuffer pOut, @Nullable @NativeType("unsigned int *") IntBuffer pMax) {
        if (CHECKS) {
            checkNT1(pKey);
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax.get(pMax.position())); }
        }
        return naiGetMaterialIntegerArray(pMat.address(), memAddress(pKey), type, index, memAddress(pOut), memAddressSafe(pMax));
    }

    /**
     * Retrieve an array of integer values with a specific key from a material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a buffer to receive the result.
     * @param pMax  Specifies the size of the given buffer, in int's. Receives the number of values (not bytes!) read.
     *
     * @return Specifies whether the key has been found. If not, the output arrays remains unmodified and {@code pMax} is set to 0.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialIntegerArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("int *") IntBuffer pOut, @Nullable @NativeType("unsigned int *") IntBuffer pMax) {
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

    /** Unsafe version of: {@link #aiGetMaterialColor GetMaterialColor} */
    public static int naiGetMaterialColor(long pMat, long pKey, int type, int index, long pOut) {
        long __functionAddress = Functions.GetMaterialColor;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPI(pMat, pKey, type, index, pOut, __functionAddress);
    }

    /**
     * Retrieve a color value with a specific key from a material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a color to receive the result.
     *
     * @return Specifies whether the key has been found. If not, the output struct remains unmodified.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialColor(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiColor4D *") AIColor4D pOut) {
        if (CHECKS) {
            checkNT1(pKey);
        }
        return naiGetMaterialColor(pMat.address(), memAddress(pKey), type, index, pOut.address());
    }

    /**
     * Retrieve a color value with a specific key from a material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a color to receive the result.
     *
     * @return Specifies whether the key has been found. If not, the output struct remains unmodified.
     */
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

    /** Unsafe version of: {@link #aiGetMaterialUVTransform GetMaterialUVTransform} */
    public static int naiGetMaterialUVTransform(long pMat, long pKey, int type, int index, long pOut) {
        long __functionAddress = Functions.GetMaterialUVTransform;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPI(pMat, pKey, type, index, pOut, __functionAddress);
    }

    /**
     * Retrieve a UVTransform value with a specific key from a material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a {@link AIUVTransform} to receive the result.
     *
     * @return Specifies whether the key has been found. If not, the output struct remains unmodified.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialUVTransform(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiUVTransform *") AIUVTransform pOut) {
        if (CHECKS) {
            checkNT1(pKey);
        }
        return naiGetMaterialUVTransform(pMat.address(), memAddress(pKey), type, index, pOut.address());
    }

    /**
     * Retrieve a UVTransform value with a specific key from a material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a {@link AIUVTransform} to receive the result.
     *
     * @return Specifies whether the key has been found. If not, the output struct remains unmodified.
     */
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

    /** Unsafe version of: {@link #aiGetMaterialString GetMaterialString} */
    public static int naiGetMaterialString(long pMat, long pKey, int type, int index, long pOut) {
        long __functionAddress = Functions.GetMaterialString;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPI(pMat, pKey, type, index, pOut, __functionAddress);
    }

    /**
     * Retrieve a string value with a specific key from a material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a string to receive the result.
     *
     * @return Specifies whether the key has been found. If not, the output struct remains unmodified.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialString(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("struct aiString *") AIString pOut) {
        if (CHECKS) {
            checkNT1(pKey);
        }
        return naiGetMaterialString(pMat.address(), memAddress(pKey), type, index, pOut.address());
    }

    /**
     * Retrieve a string value with a specific key from a material.
     *
     * @param pMat  Pointer to the input material. May not be {@code NULL}
     * @param pKey  Key to search for. One of the AI_MATKEY_XXX constants.
     * @param type  Specifies the type of the texture to be retrieved. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index Index of the texture to be retrieved.
     * @param pOut  Pointer to a string to receive the result.
     *
     * @return Specifies whether the key has been found. If not, the output struct remains unmodified.
     */
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

    /** Unsafe version of: {@link #aiGetMaterialTextureCount GetMaterialTextureCount} */
    public static int naiGetMaterialTextureCount(long pMat, int type) {
        long __functionAddress = Functions.GetMaterialTextureCount;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePI(pMat, type, __functionAddress);
    }

    /**
     * Get the number of textures for a particular texture type.
     *
     * @param pMat Pointer to the input material. May not be {@code NULL}
     * @param type Texture type to check for. One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     *
     * @return Number of textures for this type.
     */
    @NativeType("unsigned int")
    public static int aiGetMaterialTextureCount(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("aiTextureType") int type) {
        return naiGetMaterialTextureCount(pMat.address(), type);
    }

    // --- [ aiGetMaterialTexture ] ---

    /** Unsafe version of: {@link #aiGetMaterialTexture GetMaterialTexture} */
    public static int naiGetMaterialTexture(long pMat, int type, int index, long path, long mapping, long uvindex, long blend, long op, long mapmode, long flags) {
        long __functionAddress = Functions.GetMaterialTexture;
        if (CHECKS) {
            AIMaterial.validate(pMat);
        }
        return invokePPPPPPPPI(pMat, type, index, path, mapping, uvindex, blend, op, mapmode, flags, __functionAddress);
    }

    /**
     * Helper function to get all values pertaining to a particular
     * texture slot from a material structure.
     * 
     * <p>This function is provided just for convenience. You could also read the
     * texture by parsing all of its properties manually. This function bundles
     * all of them in a huge function monster.</p>
     *
     * @param pMat    Pointer to the input material. May not be {@code NULL}
     * @param type    Specifies the texture stack to read from (e.g. diffuse, specular, height map ...). One of:<br><table><tr><td>{@link #aiTextureType_NONE TextureType_NONE}</td><td>{@link #aiTextureType_DIFFUSE TextureType_DIFFUSE}</td><td>{@link #aiTextureType_SPECULAR TextureType_SPECULAR}</td></tr><tr><td>{@link #aiTextureType_AMBIENT TextureType_AMBIENT}</td><td>{@link #aiTextureType_EMISSIVE TextureType_EMISSIVE}</td><td>{@link #aiTextureType_HEIGHT TextureType_HEIGHT}</td></tr><tr><td>{@link #aiTextureType_NORMALS TextureType_NORMALS}</td><td>{@link #aiTextureType_SHININESS TextureType_SHININESS}</td><td>{@link #aiTextureType_OPACITY TextureType_OPACITY}</td></tr><tr><td>{@link #aiTextureType_DISPLACEMENT TextureType_DISPLACEMENT}</td><td>{@link #aiTextureType_LIGHTMAP TextureType_LIGHTMAP}</td><td>{@link #aiTextureType_REFLECTION TextureType_REFLECTION}</td></tr><tr><td>{@link #aiTextureType_BASE_COLOR TextureType_BASE_COLOR}</td><td>{@link #aiTextureType_NORMAL_CAMERA TextureType_NORMAL_CAMERA}</td><td>{@link #aiTextureType_EMISSION_COLOR TextureType_EMISSION_COLOR}</td></tr><tr><td>{@link #aiTextureType_METALNESS TextureType_METALNESS}</td><td>{@link #aiTextureType_DIFFUSE_ROUGHNESS TextureType_DIFFUSE_ROUGHNESS}</td><td>{@link #aiTextureType_AMBIENT_OCCLUSION TextureType_AMBIENT_OCCLUSION}</td></tr><tr><td>{@link #aiTextureType_SHEEN TextureType_SHEEN}</td><td>{@link #aiTextureType_CLEARCOAT TextureType_CLEARCOAT}</td><td>{@link #aiTextureType_TRANSMISSION TextureType_TRANSMISSION}</td></tr><tr><td>{@link #aiTextureType_UNKNOWN TextureType_UNKNOWN}</td></tr></table>
     * @param index   Index of the texture. The function fails if the requested index is not available for this texture type.
     * @param path    Receives the output path. This parameter must be non-null.
     * @param mapping The texture mapping mode to be used. Pass {@code NULL} if you're not interested in this information.
     * @param uvindex For UV-mapped textures: receives the index of the UV source channel. Unmodified otherwise.
     * @param blend   Receives the blend factor for the texture. Pass {@code NULL} if you're not interested in this information.
     * @param op      Receives the texture blend operation to be perform between this texture and the previous texture. Pass {@code NULL} if you're not interested in this
     *                information.
     * @param mapmode Receives the mapping modes to be used for the texture. Pass {@code NULL} if you're not interested in this information. Otherwise, pass a pointer to an
     *                array of two {@code aiTextureMapMode}'s (one for each axis, UV order).
     * @param flags   Receives the texture flags.
     *
     * @return {@link #aiReturn_SUCCESS Return_SUCCESS} on success, otherwise something else. Have fun.
     */
    @NativeType("aiReturn")
    public static int aiGetMaterialTexture(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("aiTextureType") int type, @NativeType("unsigned int") int index, @NativeType("struct aiString *") AIString path, @Nullable @NativeType("aiTextureMapping *") IntBuffer mapping, @Nullable @NativeType("unsigned int *") IntBuffer uvindex, @Nullable @NativeType("float *") FloatBuffer blend, @Nullable @NativeType("aiTextureOp *") IntBuffer op, @Nullable @NativeType("aiTextureMapMode *") IntBuffer mapmode, @Nullable @NativeType("unsigned int *") IntBuffer flags) {
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

    /** Unsafe version of: {@link #aiGetLegalString GetLegalString} */
    public static long naiGetLegalString() {
        long __functionAddress = Functions.GetLegalString;
        return invokeP(__functionAddress);
    }

    /**
     * Returns a string with legal copyright and licensing information about Assimp. The string may include multiple lines.
     *
     * @return A string containing the legal information.
     */
    @NativeType("char const *")
    public static String aiGetLegalString() {
        long __result = naiGetLegalString();
        return memASCII(__result);
    }

    // --- [ aiGetVersionPatch ] ---

    /**
     * Returns the current patch version number of Assimp.
     *
     * @return patch version of the Assimp runtime the application was linked/built against
     */
    @NativeType("unsigned int")
    public static int aiGetVersionPatch() {
        long __functionAddress = Functions.GetVersionPatch;
        return invokeI(__functionAddress);
    }

    // --- [ aiGetVersionMinor ] ---

    /**
     * Returns the current minor version number of Assimp.
     *
     * @return minor version of the Assimp runtime the application was linked/built against
     */
    @NativeType("unsigned int")
    public static int aiGetVersionMinor() {
        long __functionAddress = Functions.GetVersionMinor;
        return invokeI(__functionAddress);
    }

    // --- [ aiGetVersionMajor ] ---

    /**
     * Returns the current major version number of Assimp.
     *
     * @return major version of the Assimp runtime the application was linked/built against
     */
    @NativeType("unsigned int")
    public static int aiGetVersionMajor() {
        long __functionAddress = Functions.GetVersionMajor;
        return invokeI(__functionAddress);
    }

    // --- [ aiGetVersionRevision ] ---

    /**
     * Returns the repository revision of the Assimp runtime.
     *
     * @return SVN Repository revision number of the Assimp runtime the application was linked/built against.
     */
    @NativeType("unsigned int")
    public static int aiGetVersionRevision() {
        long __functionAddress = Functions.GetVersionRevision;
        return invokeI(__functionAddress);
    }

    // --- [ aiGetBranchName ] ---

    /** Unsafe version of: {@link #aiGetBranchName GetBranchName} */
    public static long naiGetBranchName() {
        long __functionAddress = Functions.GetBranchName;
        return invokeP(__functionAddress);
    }

    /**
     * Returns the branch name of the Assimp runtime.
     *
     * @return the current branch name
     */
    @Nullable
    @NativeType("char const *")
    public static String aiGetBranchName() {
        long __result = naiGetBranchName();
        return memUTF8Safe(__result);
    }

    // --- [ aiGetCompileFlags ] ---

    /**
     * Returns assimp's compile flags.
     *
     * @return any bitwise combination of the {@code ASSIMP_CFLAGS_xxx} constants.
     */
    @NativeType("unsigned int")
    public static int aiGetCompileFlags() {
        long __functionAddress = Functions.GetCompileFlags;
        return invokeI(__functionAddress);
    }

    /** Array version of: {@link #aiMatrix4DecomposeIntoScalingAxisAnglePosition Matrix4DecomposeIntoScalingAxisAnglePosition} */
    public static void aiMatrix4DecomposeIntoScalingAxisAnglePosition(@NativeType("struct aiMatrix4x4 const *") AIMatrix4x4 mat, @NativeType("struct aiVector3D *") AIVector3D scaling, @NativeType("struct aiVector3D *") AIVector3D axis, @NativeType("ai_real *") float[] angle, @NativeType("struct aiVector3D *") AIVector3D position) {
        long __functionAddress = Functions.Matrix4DecomposeIntoScalingAxisAnglePosition;
        if (CHECKS) {
            check(angle, 1);
        }
        invokePPPPPV(mat.address(), scaling.address(), axis.address(), angle, position.address(), __functionAddress);
    }

    /** Array version of: {@link #aiGetMaterialFloatArray GetMaterialFloatArray} */
    @NativeType("aiReturn")
    public static int aiGetMaterialFloatArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("float *") float[] pOut, @Nullable @NativeType("unsigned int *") int[] pMax) {
        long __functionAddress = Functions.GetMaterialFloatArray;
        if (CHECKS) {
            checkNT1(pKey);
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax[0]); }
            AIMaterial.validate(pMat.address());
        }
        return invokePPPPI(pMat.address(), memAddress(pKey), type, index, pOut, pMax, __functionAddress);
    }

    /** Array version of: {@link #aiGetMaterialFloatArray GetMaterialFloatArray} */
    @NativeType("aiReturn")
    public static int aiGetMaterialFloatArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("float *") float[] pOut, @Nullable @NativeType("unsigned int *") int[] pMax) {
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

    /** Array version of: {@link #aiGetMaterialIntegerArray GetMaterialIntegerArray} */
    @NativeType("aiReturn")
    public static int aiGetMaterialIntegerArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") ByteBuffer pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("int *") int[] pOut, @Nullable @NativeType("unsigned int *") int[] pMax) {
        long __functionAddress = Functions.GetMaterialIntegerArray;
        if (CHECKS) {
            checkNT1(pKey);
            checkSafe(pMax, 1);
            if (pMax != null) { check(pOut, pMax[0]); }
            AIMaterial.validate(pMat.address());
        }
        return invokePPPPI(pMat.address(), memAddress(pKey), type, index, pOut, pMax, __functionAddress);
    }

    /** Array version of: {@link #aiGetMaterialIntegerArray GetMaterialIntegerArray} */
    @NativeType("aiReturn")
    public static int aiGetMaterialIntegerArray(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("char const *") CharSequence pKey, @NativeType("unsigned int") int type, @NativeType("unsigned int") int index, @NativeType("int *") int[] pOut, @Nullable @NativeType("unsigned int *") int[] pMax) {
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

    /** Array version of: {@link #aiGetMaterialTexture GetMaterialTexture} */
    @NativeType("aiReturn")
    public static int aiGetMaterialTexture(@NativeType("struct aiMaterial const *") AIMaterial pMat, @NativeType("aiTextureType") int type, @NativeType("unsigned int") int index, @NativeType("struct aiString *") AIString path, @Nullable @NativeType("aiTextureMapping *") int[] mapping, @Nullable @NativeType("unsigned int *") int[] uvindex, @Nullable @NativeType("float *") float[] blend, @Nullable @NativeType("aiTextureOp *") int[] op, @Nullable @NativeType("aiTextureMapMode *") int[] mapmode, @Nullable @NativeType("unsigned int *") int[] flags) {
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