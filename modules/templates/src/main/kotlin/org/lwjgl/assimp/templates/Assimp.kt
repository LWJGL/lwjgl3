/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.assimp.templates

import org.lwjgl.assimp.*
import org.lwjgl.generator.*

val Assimp = "Assimp".nativeClass(packageName = ASSIMP_PACKAGE, prefix = "ai", prefixConstant = "ai", binding = ASSIMP_BINDING) {
    documentation =
        """
        Contains bindings to the ${url("http://www.assimp.org/", "Assimp")} library.

        Assimp comes with fairly outdated documentation, which you can read online ${url("http://www.assimp.org/lib_html/", "here")}. The
        ${url("http://www.assimp.org/FAQ.html", "Frequently Asked Questions")} are also useful.

        The bindings only consist of the C API of the Assimp model import library.
        """

    // config.h

    // ###########################################################################
    // LIBRARY SETTINGS
    // General, global settings
    // ###########################################################################

    StringConstant(
        """
        Enables time measurements.

        If enabled, measures the time needed for each part of the loading process (i.e. IO time, importing, postprocessing, ..) and dumps these timings to the
        DefaultLogger. See the ${url("http://assimp.org/lib_html/perf.html", "Performance Page")} for more information on this topic.

        Property type: bool. Default value: false.
        """,

        "AI_CONFIG_GLOB_MEASURE_TIME".."GLOB_MEASURE_TIME"
    ).noPrefix()

    StringConstant(
        """
        Global setting to disable generation of skeleton dummy meshes

        Skeleton dummy meshes are generated as a visualization aid in cases which the input data contains no geometry, but only animation data.
        
        Property data type: bool. Default value: false
        """,

        "AI_CONFIG_IMPORT_NO_SKELETON_MESHES".."IMPORT_NO_SKELETON_MESHES"
    ).noPrefix()

    // ###########################################################################
    // POST PROCESSING SETTINGS
    // Various stuff to fine-tune the behavior of a specific post processing step.
    // ###########################################################################

    StringConstant(
        """
        Maximum bone count per mesh for the #Process_SplitByBoneCount step.

        Meshes are split until the maximum number of bones is reached. The default value is #AI_SBBC_DEFAULT_MAX_BONES, which may be altered at compile-time.

        Property data type: integer.
        """,

        "AI_CONFIG_PP_SBBC_MAX_BONES".."PP_SBBC_MAX_BONES"
    ).noPrefix()

    StringConstant(
        """
        Specifies the maximum angle that may be between two vertex tangents that their tangents and bi-tangents are smoothed.

        This applies to the #Process_CalcTangentSpace step. The angle is specified in degrees. The maximum value is 175.

        Property type: float. Default value: 45 degrees
        """,

        "AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE".."PP_CT_MAX_SMOOTHING_ANGLE"
    ).noPrefix()

    StringConstant(
        """
        Source UV channel for tangent space computation.

        The specified channel must exist or an error will be raised.
        
        Property type: integer. Default value: 0
        """,

        "AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX".."PP_CT_TEXTURE_CHANNEL_INDEX"
    ).noPrefix()

    StringConstant(
        """
        Specifies the maximum angle that may be between two face normals at the same vertex position that their are smoothed together.

        Sometimes referred to as 'crease angle'. This applies to the #Process_GenSmoothNormals step. The angle is specified in degrees, so 180 is PI. The
        default value is 175 degrees (all vertex normals are smoothed). The maximum value is 175, too.
        
        Property type: float.

        Warning: setting this option may cause a severe loss of performance. The performance is unaffected if the #AI_CONFIG_FAVOUR_SPEED flag is set but the
        output quality may be reduced.
        """,

        "AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE".."PP_GSN_MAX_SMOOTHING_ANGLE"
    ).noPrefix()

    StringConstant(
        """
        Sets the colormap (= palette) to be used to decode embedded textures in MDL (Quake or 3DGS) files.

        This must be a valid path to a file. The file is 768 (256*3) bytes large and contains RGB triplets for each of the 256 palette entries. The default
        value is colormap.lmp. If the file is not found, a default palette (from Quake 1) is used.

        Property type: string.
        """,

        "AI_CONFIG_IMPORT_MDL_COLORMAP".."IMPORT_MDL_COLORMAP"
    ).noPrefix()

    StringConstant(
        """
        Configures the #Process_RemoveRedundantMaterials step to keep materials matching a name in a given list.

        This is a list of 1 to n strings, ' ' serves as delimiter character. Identifiers containing whitespaces must be enclosed in *single* quotation marks.
        For example: {@code "keep-me and_me_to anotherMaterialToBeKept \'name with whitespace\'"}. If a material matches on of these names, it will not be
        modified or removed by the postprocessing step nor will other materials be replaced by a reference to it.

        This option might be useful if you are using some magic material names to pass additional semantics through the content pipeline. This ensures they
        won't be optimized away, but a general optimization is still performed for materials not contained in the list.
        
        Property type: String. Default value: n/a

        ${note("Linefeeds, tabs or carriage returns are treated as whitespace. Material names are case sensitive.")}
        """,

        "AI_CONFIG_PP_RRM_EXCLUDE_LIST".."PP_RRM_EXCLUDE_LIST"
    ).noPrefix()

    StringConstant(
        """
        Configures the #Process_PreTransformVertices step to keep the scene hierarchy. Meshes are moved to worldspace, but no optimization is performed (read:
        meshes with equal materials are not joined. The total number of meshes won't change).

        This option could be of use for you if the scene hierarchy contains important additional information which you intend to parse. For rendering, you can
        still render all meshes in the scene without any transformations.

        Property type: bool. Default value: false.
        """,

        "AI_CONFIG_PP_PTV_KEEP_HIERARCHY".."PP_PTV_KEEP_HIERARCHY"
    ).noPrefix()

    StringConstant(
        """
        Configures the #Process_PreTransformVertices step to normalize all vertex components into the {@code [-1,1]} range. That is, a bounding box for the
        whole scene is computed, the maximum component is taken and all meshes are scaled appropriately (uniformly of course!). This might be useful if you
        don't know the spatial dimension of the input data.
        """,

        "AI_CONFIG_PP_PTV_NORMALIZE".."PP_PTV_NORMALIZE"
    ).noPrefix()

    StringConstant(
        """
        Configures the #Process_PreTransformVertices step to use a users defined matrix as the scene root node transformation before transforming vertices.
        
        Property type: bool. Default value: false.
        """,

        "AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION".."PP_PTV_ADD_ROOT_TRANSFORMATION"
    ).noPrefix()

    StringConstant(
        """
        Configures the #Process_PreTransformVertices step to use a users defined matrix as the scene root node transformation before transforming vertices.
        This property corresponds to the 'a1' component of the transformation matrix.

        Property type: aiMatrix4x4.
        """,

        "AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION".."PP_PTV_ROOT_TRANSFORMATION"
    ).noPrefix()

    StringConstant(
        """
        Configures the #Process_FindDegenerates step to remove degenerated primitives from the import - immediately.

        The default behaviour converts degenerated triangles to lines and degenerated lines to points. See the documentation to the #Process_FindDegenerates
        step for a detailed example of the various ways to get rid of these lines and points if you don't want them.

        Property type: bool. Default value: false.
        """,

        "AI_CONFIG_PP_FD_REMOVE".."PP_FD_REMOVE"
    ).noPrefix()

    StringConstant(
        """
        Configures the #Process_OptimizeGraph step to preserve nodes matching a name in a given list.

        This is a list of 1 to n strings, ' ' serves as delimiter character. Identifiers containing whitespaces must be enclosed in *single* quotation marks.
        For example: {@code "keep-me and_me_to anotherNodeToBeKept \'name with whitespace\'"}. If a node matches on of these names, it will not be modified or
        removed by the postprocessing step.

        This option might be useful if you are using some magic node names to pass additional semantics through the content pipeline. This ensures they won't
        be optimized away, but a general optimization is still performed for nodes not contained in the list.

        Property type: String. Default value: n/a

        ${note("Linefeeds, tabs or carriage returns are treated as whitespace. Node names are case sensitive.")}
        """,

        "AI_CONFIG_PP_OG_EXCLUDE_LIST".."PP_OG_EXCLUDE_LIST"
    ).noPrefix()

    StringConstant(
        """
        Set the maximum number of triangles in a mesh.

        This is used by the #Process_SplitLargeMeshes PostProcess-Step to determine whether a mesh must be split or not.

        Property type: integer.

         ${note("The default value is #AI_SLM_DEFAULT_MAX_TRIANGLES")}
        """,

        "AI_CONFIG_PP_SLM_TRIANGLE_LIMIT".."PP_SLM_TRIANGLE_LIMIT"
    ).noPrefix()

    StringConstant(
        """
        Set the maximum number of vertices in a mesh.

        This is used by the #Process_SplitLargeMeshes PostProcess-Step to determine whether a mesh must be split or not.

        Property type: integer.

        ${note("The default value is #AI_SLM_DEFAULT_MAX_VERTICES")}
        """,

        "AI_CONFIG_PP_SLM_VERTEX_LIMIT".."PP_SLM_VERTEX_LIMIT"
    ).noPrefix()

    StringConstant(
        """
        Set the maximum number of bones affecting a single vertex.

        This is used by the #Process_LimitBoneWeights PostProcess-Step.

        Property type: integer.

        ${note("The default value is #AI_LBW_MAX_WEIGHTS")}
        """,

        "AI_CONFIG_PP_LBW_MAX_WEIGHTS".."PP_LBW_MAX_WEIGHTS"
    ).noPrefix()

    StringConstant(
        """
        Lower the deboning threshold in order to remove more bones.

        This is used by the #Process_Debone PostProcess-Step.
        
        Property type: float.

         ${note("The default value is #AI_DEBONE_THRESHOLD")}
        """,

        "AI_CONFIG_PP_DB_THRESHOLD".."PP_DB_THRESHOLD"
    ).noPrefix()

    StringConstant(
        """
        Require all bones qualify for deboning before removing any.

        This is used by the #Process_Debone PostProcess-Step.

        Property type: bool.

        ${note("The default value is 0")}
        """,

        "AI_CONFIG_PP_DB_ALL_OR_NONE".."PP_DB_ALL_OR_NONE"
    ).noPrefix()

    StringConstant(
        """
        Set the size of the post-transform vertex cache to optimize the vertices for. This configures the #Process_ImproveCacheLocality step.

        The size is given in vertices. Of course you can't know how the vertex format will exactly look like after the import returns, but you can still guess
        what your meshes will probably have.

        Property type: integer.

        ${note("The default value is #PP_ICL_PTCACHE_SIZE. That results in slight performance improvements for most nVidia/AMD cards since 2002.")}
        """,

        "AI_CONFIG_PP_ICL_PTCACHE_SIZE".."PP_ICL_PTCACHE_SIZE"
    ).noPrefix()

    StringConstant(
        """
        Input parameter to the #Process_RemoveComponent step: Specifies the parts of the data structure to be removed.

        See the documentation to this step for further details. The property is expected to be an integer, a bitwise combination of the {@code aiComponent}
        flags. The default value is 0. Important: if no valid mesh is remaining after the step has been executed (e.g you thought it was funny to specify ALL
        of the flags defined above) the import FAILS. Mainly because there is no data to work on anymore ...
        """,

        "AI_CONFIG_PP_RVC_FLAGS".."PP_RVC_FLAGS"
    ).noPrefix()

    StringConstant(
        """
        Input parameter to the #Process_SortByPType step: Specifies which primitive types are removed by the step.

        This is a bitwise combination of the {@code aiPrimitiveType} flags. Specifying all of them is illegal, of course. A typical use would be to exclude
        all line and point meshes from the import.
        
        This is an integer property, its default value is 0.
        """,

        "AI_CONFIG_PP_SBP_REMOVE".."PP_SBP_REMOVE"
    ).noPrefix()

    StringConstant(
        """
        Input parameter to the #Process_FindInvalidData step: Specifies the floating-point accuracy for animation values.
        
        The step checks for animation tracks where all frame values are absolutely equal and removes them. This tweakable controls the epsilon for
        floating-point comparisons - two keys are considered equal if the invariant {@code abs(n0-n1)>epsilon} holds true for all vector respectively
        quaternion components.
        
        The default value is 0.f - comparisons are exact then.
        """,

        "AI_CONFIG_PP_FID_ANIM_ACCURACY".."PP_FID_ANIM_ACCURACY"
    ).noPrefix()

    StringConstant(
        """
        Input parameter to the #Process_TransformUVCoords step: Specifies which UV transformations are evaluated.

        This is a bitwise combination of the {@code AI_UVTRAFO_XXX} flags (integer property, of course). By default all transformations are enabled
        (#AI_UVTRAFO_ALL).
        """,

        "AI_CONFIG_PP_TUV_EVALUATE".."PP_TUV_EVALUATE"
    ).noPrefix()

    StringConstant(
        """
        A hint to assimp to favour speed against import quality.

        Enabling this option may result in faster loading, but it needn't. It represents just a hint to loaders and post-processing steps to use faster code
        paths, if possible.

        This property is expected to be an integer, != 0 stands for true. The default value is 0.
        """,

        "AI_CONFIG_FAVOUR_SPEED".."FAVOUR_SPEED"
    ).noPrefix()

    // ###########################################################################
    // IMPORTER SETTINGS
    // Various stuff to fine-tune the behaviour of specific importer plugins.
    // ###########################################################################

    StringConstant(
        """
        Set whether the fbx importer will merge all geometry layers present in the source file or take only the first.

        Property type: bool. The default value is true (1)
        """,

        "AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS".."IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS"
    ).noPrefix()

    StringConstant(
        """
        Set whether the fbx importer will read all materials present in the source file or take only the referenced materials.

        This is void unless {@code IMPORT_FBX_READ_MATERIALS=1}.

        Property type: bool. The default value is false (0)
        """,

        "AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS".."IMPORT_FBX_READ_ALL_MATERIALS"
    ).noPrefix()


    StringConstant(
        """
        Set whether the fbx importer will read materials.

        Property type: bool. The default value is true (1)
        """,

        "AI_CONFIG_IMPORT_FBX_READ_MATERIALS".."IMPORT_FBX_READ_MATERIALS"
    ).noPrefix()

    StringConstant(
        """
        Set whether the fbx importer will read embedded textures.

        Property type: bool. The default value is true (1)
        """,

        "AI_CONFIG_IMPORT_FBX_READ_TEXTURES".."IMPORT_FBX_READ_TEXTURES"
    ).noPrefix()

    StringConstant(
        """
        Set whether the fbx importer will read cameras.

        Property type: bool. The default value is true (1)
        """,

        "AI_CONFIG_IMPORT_FBX_READ_CAMERAS".."IMPORT_FBX_READ_CAMERAS"
    ).noPrefix()

    StringConstant(
        """
         Set whether the fbx importer will read light sources.

        Property type: bool. The default value is true (1)
        """,

        "AI_CONFIG_IMPORT_FBX_READ_LIGHTS".."IMPORT_FBX_READ_LIGHTS"
    ).noPrefix()

    StringConstant(
        """
        Set whether the fbx importer will read animations.

        Property type: bool. The default value is true (1)
        """,

        "AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS".."IMPORT_FBX_READ_ANIMATIONS"
    ).noPrefix()

    StringConstant(
        """
        Set whether the fbx importer will act in strict mode in which only FBX 2013 is supported and any other sub formats are rejected. FBX 2013 is the
        primary target for the importer, so this format is best supported and well-tested.

        Property type: bool. The default value is false (0)
        """,

        "AI_CONFIG_IMPORT_FBX_STRICT_MODE".."IMPORT_FBX_STRICT_MODE"
    ).noPrefix()

    StringConstant(
        """
        Set whether the fbx importer will preserve pivot points for transformations (as extra nodes). If set to false, pivots and offsets will be evaluated
        whenever possible.

        Property type: bool. The default value is true (1)
        """,

        "AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS".."IMPORT_FBX_PRESERVE_PIVOTS"
    ).noPrefix()

    StringConstant(
        """
        Specifies whether the importer will drop empty animation curves or animation curves which match the bind pose transformation over their entire defined
        range.

        Property type: bool. The default value is true (1)
        """,

        "AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES".."IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES"
    ).noPrefix()

    StringConstant(
        """
        Set the vertex animation keyframe to be imported.

        ASSIMP does not support vertex keyframes (only bone animation is supported). The library reads only one frame of models with vertex animations. By
        default this is the first frame.

        ${note(
            """
            The default value is 0. This option applies to all importers. However, it is also possible to override the global setting for a specific loader.
            You can use the {@code AI_CONFIG_IMPORT_XXX_KEYFRAME} options (where XXX is a placeholder for the file format for which you want to override the
            global setting).
            """
        )}

        Property type: integer.
        """,

        "AI_CONFIG_IMPORT_GLOBAL_KEYFRAME".."IMPORT_GLOBAL_KEYFRAME"
    ).noPrefix()

    StringConstant(
        "",

        "AI_CONFIG_IMPORT_MD3_KEYFRAME".."IMPORT_MD3_KEYFRAME"
    ).noPrefix()

    StringConstant(
        "",

        "AI_CONFIG_IMPORT_MD2_KEYFRAME".."IMPORT_MD2_KEYFRAME",

        see = arrayOf("#AI_CONFIG_IMPORT_GLOBAL_KEYFRAME")
    ).noPrefix()

    StringConstant(
        "",

        "AI_CONFIG_IMPORT_MDL_KEYFRAME".."IMPORT_MDL_KEYFRAME",

        see = arrayOf("#AI_CONFIG_IMPORT_GLOBAL_KEYFRAME")
    ).noPrefix()

    StringConstant(
        "",

        "AI_CONFIG_IMPORT_MDC_KEYFRAME".."IMPORT_MDC_KEYFRAME",

        see = arrayOf("#AI_CONFIG_IMPORT_GLOBAL_KEYFRAME")
    ).noPrefix()

    StringConstant(
        "",

        "AI_CONFIG_IMPORT_SMD_KEYFRAME".."IMPORT_SMD_KEYFRAME",

        see = arrayOf("#AI_CONFIG_IMPORT_GLOBAL_KEYFRAME")
    ).noPrefix()

    StringConstant(
        "",

        "AI_CONFIG_IMPORT_UNREAL_KEYFRAME".."IMPORT_UNREAL_KEYFRAME",

        see = arrayOf("#AI_CONFIG_IMPORT_GLOBAL_KEYFRAME")
    ).noPrefix()

    StringConstant(
        """
        Configures the AC loader to collect all surfaces which have the "Backface cull" flag set in separate meshes.

        Property type: bool. Default value: true.
        """,

        "AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL".."IMPORT_AC_SEPARATE_BFCULL"
    ).noPrefix()

    StringConstant(
        """
        Configures whether the AC loader evaluates subdivision surfaces (indicated by the presence of the 'subdiv' attribute in the file). By default, Assimp
        performs the subdivision using the standard Catmull-Clark algorithm.

        Property type: bool. Default value: true.
        """,

        "AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION".."IMPORT_AC_EVAL_SUBDIVISION"
    ).noPrefix()

    StringConstant(
        """
        Configures the UNREAL 3D loader to separate faces with different surface flags (e.g. two-sided vs. single-sided).
        
        Property type: bool. Default value: true.
        """,

        "AI_CONFIG_UNREAL_HANDLE_FLAGS".."UNREAL_HANDLE_FLAGS"
    ).noPrefix()

    StringConstant(
        """
        Configures the terragen import plugin to compute uv's for terrains, if not given. Furthermore a default texture is assigned.

        UV coordinates for terrains are so simple to compute that you'll usually want to compute them on your own, if you need them. This option is intended
        for model viewers which want to offer an easy way to apply textures to terrains.

        Property type: bool. Default value: false.
        """,

        "AI_CONFIG_IMPORT_TER_MAKE_UVS".."IMPORT_TER_MAKE_UVS"
    ).noPrefix()

    StringConstant(
        """
        Configures the ASE loader to always reconstruct normal vectors basing on the smoothing groups loaded from the file.

        Some ASE files have carry invalid normals, other don't.

        Property type: bool. Default value: true.
        """,

        "AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS".."IMPORT_ASE_RECONSTRUCT_NORMALS"
    ).noPrefix()

    StringConstant(
        """
        Configures the M3D loader to detect and process multi-part Quake player models.

        These models usually consist of 3 files, lower.md3, upper.md3 and head.md3. If this property is set to true, Assimp will try to load and * combine all
        three files if one of them is loaded.
        
        Property type: bool. Default value: true.
        """,

        "AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART".."IMPORT_MD3_HANDLE_MULTIPART"
    ).noPrefix()

    StringConstant(
        """
        Tells the MD3 loader which skin files to load.

        When loading MD3 files, Assimp checks whether a file {@code [md3_file_name]_[skin_name].skin} is existing. These files are used by * Quake III to be
        able to assign different skins (e.g. red and blue team) to models. 'default', 'red', 'blue' are typical skin names.

        Property type: String. Default value: "default".
        """,

        "AI_CONFIG_IMPORT_MD3_SKIN_NAME".."IMPORT_MD3_SKIN_NAME"
    ).noPrefix()

    StringConstant(
        """
        Specify the Quake 3 shader file to be used for a particular MD3 file. This can also be a search path.

        By default Assimp's behaviour is as follows: If a MD3 file {@code any_path/models/any_q3_subdir/model_name/file_name.md3} is loaded, the library tries
        to locate the corresponding shader file in {@code any_path/scripts/model_name.shader}. This property overrides this behaviour. It can either specify a
        full path to the shader to be loaded or alternatively the path (relative or absolute) to the directory where the shaders for all MD3s to be loaded
        reside. Assimp attempts to open {@code IMPORT_MD3_SHADER_SRC/model_name.shader} first, {@code IMPORT_MD3_SHADER_SRC/file_name.shader} is the fallback
        file. Note that {@code IMPORT_MD3_SHADER_SRC} should have a terminal (back)slash.

        Property type: String. Default value: n/a.
        """,

        "AI_CONFIG_IMPORT_MD3_SHADER_SRC".."IMPORT_MD3_SHADER_SRC"
    ).noPrefix()

    StringConstant(
        """
        Configures the LWO loader to load just one layer from the model.

        LWO files consist of layers and in some cases it could be useful to load only one of them. This property can be either a string - which specifies the
        name of the layer - or an integer - the index of the layer. If the property is not set the whole LWO model is loaded. Loading fails if the requested
        layer is not available. The layer index is zero-based and the layer name may not be empty.

        Property type: Integer. Default value: all layers are loaded.
        """,

        "AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY".."IMPORT_LWO_ONE_LAYER_ONLY"
    ).noPrefix()

    StringConstant(
        """
        Configures the MD5 loader to not load the MD5ANIM file for a MD5MESH file automatically.

        The default strategy is to look for a file with the same name but the MD5ANIM extension in the same directory. If it is found, it is loaded * and
        combined with the MD5MESH file. This configuration option can be used to disable this behaviour.

        Property type: bool. Default value: false.
        """,

        "AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD".."IMPORT_MD5_NO_ANIM_AUTOLOAD"
    ).noPrefix()

    StringConstant(
        """
        Defines the begin of the time range for which the LWS loader evaluates animations and computes ##AINodeAnim's.

        Assimp provides full conversion of LightWave's envelope system, including pre and post conditions. The loader computes linearly subsampled animation
        chanels with the frame rate given in the LWS file. This property defines the start time. Note: animation channels are only generated if a node has at
        least one envelope with more tan one key assigned. This property is given in frames, '0' is the first frame. By default, if this property is not set,
        the importer takes the animation start from the input LWS file ('FirstFrame' line).

        Property type: Integer. Default value: taken from file.
        """,

        "AI_CONFIG_IMPORT_LWS_ANIM_START".."IMPORT_LWS_ANIM_START"
    ).noPrefix()

    StringConstant(
        "End of the imported time range.",

        "AI_CONFIG_IMPORT_LWS_ANIM_END".."IMPORT_LWS_ANIM_END",

        see = arrayOf("#AI_CONFIG_IMPORT_LWS_ANIM_START")
    ).noPrefix()

    StringConstant(
        """
        Defines the output frame rate of the IRR loader.

        IRR animations are difficult to convert for Assimp and there will always be a loss of quality. This setting defines how many keys per second are
        returned by the converter.

        Property type: integer. Default value: 100
        """,

        "AI_CONFIG_IMPORT_IRR_ANIM_FPS".."IMPORT_IRR_ANIM_FPS"
    ).noPrefix()

    StringConstant(
        """
        Ogre Importer will try to find referenced materials from this file.

        Ogre meshes reference with material names, this does not tell Assimp the file where it is located in. Assimp will try to find the source file in the
        following order: {@code <material-name>.material}, {@code <mesh-filename-base>.material} and lastly the material name defined by this config property.

        Property type: String. Default value: {@code Scene.material}.
        """,

        "AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE".."IMPORT_OGRE_MATERIAL_FILE"
    ).noPrefix()

    StringConstant(
        """
        Ogre Importer detect the texture usage from its filename.

        Ogre material texture units do not define texture type, the textures usage depends on the used shader or Ogre's fixed pipeline. If this config
        property is true Assimp will try to detect the type from the textures filename postfix: _n, _nrm, _nrml, _normal, _normals and _normalmap for normal
        map, _s, _spec, _specular and _specularmap for specular map, _l, _light, _lightmap, _occ and _occlusion for light map, _disp and _displacement for
        displacement map. The matching is case insensitive. Post fix is taken between the last underscore and the last period.

        Default behavior is to detect type from lower cased texture unit name by matching against: normalmap, specularmap, lightmap and displacementmap. For
        both cases if no match is found #TextureType_DIFFUSE is used.

        Property type: Bool. Default value: false.
        """,

        "AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME".."IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME"
    ).noPrefix()

    StringConstant(
        """
        Specifies whether the IFC loader skips over IfcSpace elements.

        IfcSpace elements (and their geometric representations) are used to represent, well, free space in a building storey.

        Property type: Bool. Default value: true.
        """,

        "AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS".."IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS"
    ).noPrefix()

    StringConstant(
        """
        Specifies whether the Android JNI asset extraction is supported.

        Turn on this option if you want to manage assets in native Android application without having to keep the internal directory and asset manager
        pointer.
        """,

        "AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT".."AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT"
    ).noPrefix()

    StringConstant(
        """
        Specifies whether the IFC loader skips over shape representations of type 'Curve2D'.

        A lot of files contain both a faceted mesh representation and a outline with a presentation type of 'Curve2D'. Currently Assimp doesn't convert those,
        so turning this option off just clutters the log with errors.

        Property type: Bool. Default value: true.
        """,

        "AI_CONFIG_IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS".."IMPORT_IFC_SKIP_CURVE_REPRESENTATIONS"
    ).noPrefix()

    StringConstant(
        """
        Specifies whether the IFC loader will use its own, custom triangulation algorithm to triangulate wall and floor meshes.

        If this property is set to false, walls will be either triangulated by #Process_Triangulate or will be passed through as huge polygons with faked
        holes (i.e. holes that are connected with the outer boundary using a dummy edge). It is highly recommended to set this property to true if you want
        triangulated data because #Process_Triangulate is known to have problems with the kind of polygons that the IFC loader spits out for complicated
        meshes.

        Property type: Bool. Default value: true.
        """,

        "AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION".."IMPORT_IFC_CUSTOM_TRIANGULATION"
    ).noPrefix()

    StringConstant(
        """
        Sets the tessellation conic angle for IFC smoothing curves.

        This is used by the IFC importer to determine the tessellation parameter for smoothing curves.

        The default value is #AI_IMPORT_IFC_DEFAULT_SMOOTHING_ANGLE and the accepted values are in range [5.0, 120.0].

        Property type: Float.
        """,

        "AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE".."IMPORT_IFC_SMOOTHING_ANGLE"
    ).noPrefix()

    StringConstant(
        """
        Set the tessellation for IFC cylindrical shapes.

        This is used by the IFC importer to determine the tessellation parameter for cylindrical shapes, i.e. the number of segments used to aproximate a circle.

        The default value is #AI_IMPORT_IFC_DEFAULT_CYLINDRICAL_TESSELLATION and the accepted values are in range [3, 180].

        Property type: Integer.
        """,

        "AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION".."IMPORT_IFC_CYLINDRICAL_TESSELLATION"
    ).noPrefix()

    StringConstant(
        """
        Specifies whether the Collada loader will ignore the provided up direction.

        If this property is set to true, the up direction provided in the file header will be ignored and the file will be loaded as is.

        Property type: Bool. Default value: false.
        """,

        "AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION".."IMPORT_COLLADA_IGNORE_UP_DIRECTION"
    ).noPrefix()

    // ---------- All the Export defines ------------

    StringConstant(
        """
        Specifies the xfile use double for real values of float.

        Property type: Bool. Default value: false.
        """,

        "AI_CONFIG_EXPORT_XFILE_64BIT".."EXPORT_XFILE_64BIT"
    ).noPrefix()

    IntConstant(
        "Default values for configuration properties.",

        "AI_SBBC_DEFAULT_MAX_BONES"..60,
        "AI_SLM_DEFAULT_MAX_TRIANGLES"..1000000,
        "AI_SLM_DEFAULT_MAX_VERTICES"..1000000,
        "AI_LBW_MAX_WEIGHTS"..0x4,
        "PP_ICL_PTCACHE_SIZE"..12,
        "AI_IMPORT_IFC_DEFAULT_CYLINDRICAL_TESSELLATION"..32
    ).noPrefix()

    FloatConstant(
        "Default value for configuration properties.",

        "AI_DEBONE_THRESHOLD"..1.0f,
        "AI_IMPORT_IFC_DEFAULT_SMOOTHING_ANGLE"..10.0f
    ).noPrefix()

    IntConstant(
        "UVCoord Transforms",

        "AI_UVTRAFO_SCALING"..0x1,
        "AI_UVTRAFO_ROTATION"..0x2,
        "AI_UVTRAFO_TRANSLATION"..0x4,
        "AI_UVTRAFO_ALL".."(AI_UVTRAFO_SCALING | AI_UVTRAFO_ROTATION | AI_UVTRAFO_TRANSLATION)"
    ).noPrefix()

    EnumConstant(
        """
        Enumerates components of the ##AIScene and ##AIMesh data structures that can be excluded from the import using the #Process_RemoveComponent step.

        See the documentation to #Process_RemoveComponent for more details.
        """,

        "Component_NORMALS".enum("Normal vectors", 0x2),
        "Component_TANGENTS_AND_BITANGENTS".enum("Tangents and bitangents go always together", 0x4),
        "Component_COLORS".enum("ALL color sets. Use #Component_COLORSn() to specify the N'th set.", 0x8),
        "Component_TEXCOORDS".enum("ALL texture UV sets. Use #Component_TEXCOORDSn() to specify the N'th set.", 0x10),
        "Component_BONEWEIGHTS".enum(
            """
            Removes all bone weights from all meshes. The scenegraph nodes corresponding to the bones are NOT removed. use the #Process_OptimizeGraph step to
            do this.
            """,
            0x20
        ),
        "Component_ANIMATIONS".enum(
            """
            Removes all node animations (##AIScene{@code ::mAnimations}). The corresponding scenegraph nodes are NOT removed. use the #Process_OptimizeGraph
            step to do this.
            """,
            0x40
        ),
        "Component_TEXTURES".enum("Removes all embedded textures", 0x80),
        "Component_LIGHTS".enum(
            """
            Removes all light sources (##AIScene{@code ::mLights}). The corresponding scenegraph nodes are NOT removed. use the #Process_OptimizeGraph step to
            do this.
            """,
            0x100
        ),
        "Component_CAMERAS".enum(
            """
            Removes all cameras (##AIScene{@code ::mCameras}). The corresponding scenegraph nodes are NOT removed. use the #Process_OptimizeGraph step to do
            this.
            """,
            0x200
        ),
        "Component_MESHES".enum("Removes all meshes (##AIScene{@code ::mMeshes}).", 0x400),
        "Component_MATERIALS".enum("Removes all materials. One default material will be generated, so ##AIScene{@code ::mNumMaterials} will be 1.", 0x800)
    )

    macro(expression = "1 << (n + 20)")..int(
        "Component_COLORSn",
        "Remove a specific color channel 'n'",

        int.IN("n", "The color channel")
    )

    macro(expression = "1 << (n + 25)")..int(
        "Component_TEXCOORDSn",
        "Remove a specific UV channel 'n'",

        int.IN("n", "The UV channel")
    )

    // defs.h

    DoubleConstant(
        "This is PI. Hi PI.",
        "AI_MATH_PI"..3.141592653589793238462643383279,
        "AI_MATH_TWO_PI".."AI_MATH_PI * 2.0",
        "AI_MATH_HALF_PI".."AI_MATH_PI * 0.5"
    ).noPrefix()

    FloatConstant(
        "This is PI. Hi PI.",
        "AI_MATH_PI_F"..3.1415926538f,
        "AI_MATH_TWO_PI_F".."AI_MATH_PI_F * 2f",
        "AI_MATH_HALF_PI_F".."AI_MATH_PI_F * 0f"
    ).noPrefix()

    macro(expression = "(x)*0.0174532925f")..float(
        "AI_DEG_TO_RAD",
        "Tiny macro to convert from degrees to radians",

        float.IN("x", "The value in degrees"),
        noPrefix = true
    )

    macro(expression = "(x)*57.2957795f")..float(
        "AI_RAD_TO_DEG",
        "Tiny macro to convert from radians to degrees",

        float.IN("x", "The value in radians"),
        noPrefix = true
    )

    // types.h

    IntConstant(
        "Maximum dimension for strings, ASSIMP strings are zero terminated.",

        "MAXLEN"..1024
    ).noPrefix()

    EnumConstant(
        "Standard return type for some library functions. Rarely used.",

        "Return_SUCCESS".enum("Indicates that a function was successful.", 0x0),
        "Return_FAILURE".enum("Indicates that a function failed.", -0x1),
        "Return_OUTOFMEMORY".enum("Indicates that not enough memory is available to perform the requested operation.", -0x3)
    )

    EnumConstant(
        "Seek origins (for the virtual file system API).",

        "Origin_SET".enum("Beginning of the file", 0x0),
        "Origin_CUR".enum("Current position of the file pointer", 0x1),
        "Origin_END".enum("End of the file, offsets must be negative", 0x2)
    )

    EnumConstant(
        "Enumerates predefined log streaming destinations.",

        "DefaultLogStream_FILE".enum("Stream the log to a file", 0x1),
        "DefaultLogStream_STDOUT".enum("Stream the log to {@code std::cout}", 0x2),
        "DefaultLogStream_STDERR".enum("Stream the log to {@code std::cerr}", 0x4),
        "DefaultLogStream_DEBUGGER".enum("MSVC only: Stream the log the the debugger (this relies on {@code OutputDebugString} from the Win32 SDK)", 0x8)
    )

    // anim.h

    EnumConstant(
        """
        Defines how an animation channel behaves outside the defined time range. This corresponds to ##AINodeAnim{@code ::mPreState} and
        ##AINodeAnim{@code ::mPostState}.
        """,

        "AnimBehaviour_DEFAULT".enum("The value from the default node transformation is taken", 0x0),
        "AnimBehaviour_CONSTANT".enum("The nearest key value is used without interpolation", 0x1),
        "AnimBehaviour_LINEAR".enum("The value of the nearest two keys is linearly extrapolated for the current time value.", 0x2),
        "AnimBehaviour_REPEAT".enum(
            "The animation is repeated. If the animation key go from n to m and the current time is t, use the value at {@code (t-n) % (|m-n|)}.",
            0x3
        )
    )

    // cexport.h

    size_t(
        "GetExportFormatCount",
        """
        Returns the number of export file formats available in the current Assimp build. Use #GetExportFormatDescription() to retrieve infos of a specific
        export format.
        """
    )

    aiExportFormatDesc_p(
        "GetExportFormatDescription",
        """
        Returns a description of the nth export file format. Use #GetExportFormatCount() to learn how many export formats are supported. The description must
        be released by calling #ReleaseExportFormatDescription() afterwards.
        """,

        size_t.IN("pIndex", "Index of the export format to retrieve information for. Valid range is 0 to #GetExportFormatCount()"),

        returnDoc = "A description of that specific export format. #NULL if {@code pIndex} is out of range."
    )

    void(
        "ReleaseExportFormatDescription",
        "Release a description of the nth export file format. Must be returned by #GetExportFormatDescription().",

        const..aiExportFormatDesc_p.IN("desc", "Pointer to the description")
    )

    void(
        "CopyScene",
        """
        Create a modifiable copy of a scene.

        This is useful to import files via Assimp, change their topology and export them again. Since the scene returned by the various importer functions is
        const, a modifiable copy is needed.
        """,

        const..aiScene_p.IN("pIn", "Valid scene to be copied"),
        ReturnParam..Check(1)..aiScene_pp.OUT("pOut", "Receives a modifyable copy of the scene. Use #FreeScene() to delete it again.")
    )

    void(
        "FreeScene",
        "Frees a scene copy created using #CopyScene()",

        const..aiScene_p.IN("pIn", "Scene to be freed")
    )

    val ExportScene = aiReturn(
        "ExportScene",
        """
        Exports the given scene to a chosen file format and writes the result file(s) to disk.

        ${note("Use #CopyScene() to get a modifiable copy of a previously imported scene.")}
        """,

        const..aiScene_p.IN(
            "pScene",
            """
            The scene to export. Stays in possession of the caller, is not changed by the function. The scene is expected to conform to Assimp's Importer
            output format as specified in the Data Structures Page. In short, this means the model data should use a right-handed coordinate systems, face
            winding should be counter-clockwise and the UV coordinate origin is assumed to be in the upper left. If your input data uses different conventions,
            have a look at the last parameter.
            """
        ),
        const..charUTF8_p.IN(
            "pFormatId",
            """
            ID string to specify to which format you want to export to. Use #GetExportFormatCount() / #GetExportFormatDescription() to learn which export
            formats are available.
            """
        ),
        const..charUTF8_p.IN("pFileName", "Output file to write"),
        unsigned_int.IN(
            "pPreProcessing",
            """
            Accepts any choice of the {@code aiPostProcessSteps} enumerated flags, but in reality only a subset of them makes sense here. Specifying
            'preprocessing' flags is useful if the input scene does not conform to Assimp's default conventions as specified in the Data Structures Page. In
            short, this means the geometry data should use a right-handed coordinate systems, face winding should be counter-clockwise and the UV coordinate
            origin is assumed to be in the upper left. The #Process_MakeLeftHanded, #Process_FlipUVs and #Process_FlipWindingOrder flags are used in the import
            side to allow users to have those defaults automatically adapted to their conventions. Specifying those flags for exporting has the opposite
            effect, respectively. Some other of the {@code aiPostProcessSteps} enumerated values may be useful as well, but you'll need to try out what their
            effect on the exported file is. Many formats impose their own restrictions on the structure of the geometry stored therein, so some preprocessing
            may have little or no effect at all, or may be redundant as exporters would apply them anyhow. A good example is triangulation - whilst you can
            enforce it by specifying the #Process_Triangulate flag, most export formats support only triangulate data so they would run the step anyway.

            If assimp detects that the input scene was directly taken from the importer side of the library (i.e. not copied using #CopyScene() and potentially
            modified afterwards), any postprocessing steps already applied to the scene will not be applied again, unless they show non-idempotent behaviour
            (#Process_MakeLeftHanded, #Process_FlipUVs and #Process_FlipWindingOrder).
            """,
            "Process(Preset)?_\\w+", LinkMode.BITFIELD
        ),

        returnDoc = "a status code indicating the result of the export"
    )

    aiReturn(
        "ExportSceneEx",
        """
        Exports the given scene to a chosen file format using custom IO logic supplied by you.

        ${note("Use #CopyScene() to get a modifiable copy of a previously imported scene.")}
        """,

        ExportScene["pScene"],
        ExportScene["pFormatId"],
        ExportScene["pFileName"],
        nullable..const..aiFileIO_p.IN(
            "pIO",
            """
            custom IO implementation to be used. Use this if you use your own storage methods. If none is supplied, a default implementation using standard
            file IO is used. Note that #ExportSceneToBlob() is provided as convenience function to export to memory buffers.
            """
        ),
        ExportScene["pPreProcessing"],

        returnDoc = "a status code indicating the result of the export"
    )

    aiExportDataBlob_p(
        "ExportSceneToBlob",
        """
        Exports the given scene to a chosen file format. Returns the exported data as a binary blob which you can write into a file or something. When you're
        done with the data, use #ReleaseExportBlob() to free the resources associated with the export.
        """,

        ExportScene["pScene"],
        ExportScene["pFormatId"],
        ExportScene["pPreProcessing"],

        returnDoc = "the exported data or #NULL in case of error"
    )

    void(
        "ReleaseExportBlob",
        "Releases the memory associated with the given exported data. Use this function to free a data blob returned by #ExportSceneToBlob().",

        const..aiExportDataBlob_p.IN("pData", "the data blob returned by #ExportSceneToBlob()")
    )

    // cimport.h

    EnumConstant(
        "Boolean constants",

        "AI_TRUE".enum("true", 1),
        "AI_FALSE".enum("false", 0)
    ).noPrefix()

    val ImportFile = aiScene_p(
        "ImportFile",
        """
        Reads the given file and returns its content.

        If the call succeeds, the imported data is returned in an ##AIScene structure. The data is intended to be read-only, it stays property of the ASSIMP
        library and will be stable until #ReleaseImport() is called. After you're done with it, call #ReleaseImport() to free the resources associated with
        this file. If the import fails, #NULL is returned instead. Call #GetErrorString() to retrieve a human-readable error text.
        """,

        const..charUTF8_p.IN("pFile", "Path and filename of the file to be imported"),
        unsigned_int.IN(
            "pFlags",
            """
            Optional post processing steps to be executed after a successful import. If you wish to inspect the imported scene first in order to fine-tune
            your post-processing setup, consider to use #ApplyPostProcessing().
            """,
            "Process(Preset)?_\\w+", LinkMode.BITFIELD
        ),

        returnDoc = "Pointer to the imported data or #NULL if the import failed."
    )

    val ImportFileEx = aiScene_p(
        "ImportFileEx",
        """
        Reads the given file using user-defined I/O functions and returns its content.

        If the call succeeds, the imported data is returned in an ##AIScene structure. The data is intended to be read-only, it stays property of the ASSIMP
        library and will be stable until #ReleaseImport() is called. After you're done with it, call #ReleaseImport() to free the resources associated with
        this file. If the import fails, #NULL is returned instead. Call #GetErrorString() to retrieve a human-readable error text.
        """,

        ImportFile["pFile"],
        ImportFile["pFlags"],
        nullable..aiFileIO_p.IN(
            "pFS",
            "Will be used to open the model file itself and any other files the loader needs to open. Pass #NULL to use the default implementation."
        ),

        returnDoc = "Pointer to the imported data or NULL if the import failed."
    )

    aiScene_p(
        "ImportFileExWithProperties",
        "Same as #ImportFileEx(), but adds an extra parameter containing importer settings.",

        ImportFile["pFile"],
        ImportFile["pFlags"],
        ImportFileEx["pFS"],
        const..aiPropertyStore_p.IN("pProps", "##AIPropertyStore instance containing import settings."),

        returnDoc = "Pointer to the imported data or #NULL if the import failed."
    )

    val ImportFileFromMemory = aiScene_p(
        "ImportFileFromMemory",
        """
        Reads the given file from a given memory buffer.

        If the call succeeds, the contents of the file are returned as a pointer to an ##AIScene object. The returned data is intended to be read-only, the
        importer keeps ownership of the data and will destroy it upon destruction. If the import fails, #NULL is returned. A human-readable error description
        can be retrieved by calling #GetErrorString().

        ${note("""
        This is a straightforward way to decode models from memory buffers, but it doesn't handle model formats that spread their data across multiple files or
        even directories. Examples include OBJ or MD3, which outsource parts of their material info into external scripts. If you need full functionality,
        provide a custom IOSystem to make Assimp find these files and use the regular #ImportFileEx()/#ImportFileExWithProperties() API.
        """)}
        """,

        const..char_p.IN("pBuffer", "Pointer to the file data"),
        AutoSize("pBuffer")..unsigned_int.IN("pLength", "Length of pBuffer, in bytes"),
        ImportFile["pFlags"],
        nullable..const..charUTF8_p.IN(
            "pHint",
            """
            An additional hint to the library. If this is a non empty string, the library looks for a loader to support the file extension specified by
            {@code pHint} and passes the file to the first matching loader. If this loader is unable to completely the request, the library continues and tries
            to determine the file format on its own, a task that may or may not be successful. Check the return value, and you'll know ...
            """
        ),

        returnDoc = "A pointer to the imported data, #NULL if the import failed."
    )

    aiScene_p(
        "ImportFileFromMemoryWithProperties",
        "Same as #ImportFileFromMemory(), but adds an extra parameter containing importer settings.",

        ImportFileFromMemory["pBuffer"],
        ImportFileFromMemory["pLength"],
        ImportFileFromMemory["pFlags"],
        ImportFileFromMemory["pHint"],
        const..aiPropertyStore_p.IN("pProps", "##AIPropertyStore instance containing import settings."),

        returnDoc = "A pointer to the imported data, #NULL if the import failed."
    )

    aiScene_p(
        "ApplyPostProcessing",
        """
        Apply post-processing to an already-imported scene.

        This is strictly equivalent to calling #ImportFile()/#ImportFileEx() with the same flags. However, you can use this separate function to inspect the
        imported scene first to fine-tune your post-processing setup.
        """,

        const..aiScene_p.IN("pScene", "Scene to work on."),
        unsigned_int.IN("pFlags", "Provide a bitwise combination of the {@code aiPostProcessSteps} flags.", "Process(Preset)?_\\w+", LinkMode.BITFIELD),

        returnDoc =
        """
        A pointer to the post-processed data. Post processing is done in-place, meaning this is still the same ##AIScene which you passed for {@code pScene}.
        However, <em>if</em> post-processing failed, the scene could now be #NULL. That's quite a rare case, post processing steps are not really designed to
        'fail'. To be exact, the #Process_ValidateDataStructure flag is currently the only post processing step which can actually cause the scene to be reset
        to #NULL.
        """
    )

    /*aiLogStream(
        "GetPredefinedLogStream",
        """
        Get one of the predefine log streams. This is the quick'n'easy solution to access Assimp's log system. Attaching a log stream can slightly reduce
        Assimp's overall import performance.

        Usage is rather simple (this will stream the log to a file, named log.txt, and the stdout stream of the process:

        ${codeBlock("""
struct aiLogStream c;
c = aiGetPredefinedLogStream(aiDefaultLogStream_FILE, "log.txt");
aiAttachLogStream(&c);
c = aiGetPredefinedLogStream(aiDefaultLogStream_STDOUT, NULL);
aiAttachLogStream(&c);""")}
        """,

        aiDefaultLogStream.IN("pStreams", "One of the {@code aiDefaultLogStream} enumerated values.", "DefaultLogStream_\\w+"),
        nullable..const..charUTF8_p.IN("file", "Solely for the #DefaultLogStream_FILE flag: specifies the file to write to. Pass #NULL for all other flags."),

        returnDoc = "The log stream. callback is set to #NULL if something went wrong."
    )*/

    void(
        "AttachLogStream",
        """
        Attach a custom log stream to the libraries' logging system.

        Attaching a log stream can slightly reduce Assimp's overall import performance. Multiple log-streams can be attached.

        ${note("""
        To ensure proper destruction of the logging system, you need to manually call #DetachLogStream() on every single log stream you attach. Alternatively
        (for the lazy folks) #DetachAllLogStreams() is provided.
        """)}
        """,

        const..aiLogStream_p.IN("stream", "Describes the new log stream.")
    )

    void(
        "EnableVerboseLogging",
        """
        Enable verbose logging. Verbose logging includes debug-related stuff and detailed import statistics. This can have severe impact on import performance
        and memory consumption. However, it might be useful to find out why a file didn't read correctly.
        """,

        aiBool.IN("d", "true or false, your decision")
    )

    aiReturn(
        "DetachLogStream",
        """
        Detach a custom log stream from the libraries' logging system.

        This is the counterpart of #AttachLogStream(). If you attached a stream, don't forget to detach it again.
        """,

        aiLogStream_p.IN("stream", "The log stream to be detached."),

        returnDoc = "#Return_SUCCESS if the log stream has been detached successfully."
    )

    void(
        "DetachAllLogStreams",
        """
        Detach all active log streams from the libraries' logging system. This ensures that the logging system is terminated properly and all resources
        allocated by it are actually freed. If you attached a stream, don't forget to detach it again.
        """
    )

    void(
        "ReleaseImport",
        """
        Releases all resources associated with the given import process.

        Call this function after you're done with the imported data.
        """,

        nullable..const..aiScene_p.IN("pScene", "The imported data to release. #NULL is a valid value.")
    )

    charUTF8_p(
        "GetErrorString",
        "Returns the error text of the last failed import process.",

        returnDoc =
        """
        A textual description of the error that occurred at the last import process. #NULL if there was no error. There can't be an error if you got a
        non-#NULL ##AIScene from #ImportFile()/#ImportFileEx()/#ApplyPostProcessing().
        """
    )

    aiBool(
        "IsExtensionSupported",
        "Returns whether a given file extension is supported by ASSIMP.",

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

        If a file extension is contained in the list this does, of course, not mean that ASSIMP is able to load all files with this extension.
        """,

        aiString_p.OUT(
            "szOut",
            "String to receive the extension list. Format of the list: \"*.3ds;*.obj;*.dae\". #NULL is not a valid parameter."
        )
    )

    void(
        "GetMemoryRequirements",
        "Get the approximated storage required by an imported asset.",

        const..aiScene_p.IN("pIn", "Input asset."),
        aiMemoryInfo_p.OUT("in", "Data structure to be filled.")
    )

    aiPropertyStore_p(
        "CreatePropertyStore",
        "Create an empty property store. Property stores are used to collect import settings.",

        returnDoc = "New property store. Property stores need to be manually destroyed using the #ReleasePropertyStore() API function."
    )

    void(
        "ReleasePropertyStore",
        "Delete a property store.",

        aiPropertyStore_p.IN("p", "Property store to be deleted.")
    )

    val SetImportPropertyInteger = void(
        "SetImportPropertyInteger",
        """
        Set an integer property.

        This is the C-version of {@code Assimp::Importer::SetPropertyInteger()}. In the C interface, properties are always shared by all imports. It is not
        possible to specify them per import.
        """,

        aiPropertyStore_p.IN("store", "Store to modify. Use #CreatePropertyStore() to obtain a store."),
        const..charASCII_p.IN("szName", "Name of the configuration property to be set.", "AI_CONFIG_\\w+"),
        int.IN("value", "New value for the property")
    )

    void(
        "SetImportPropertyFloat",
        """
        Set an floating-point property.

        This is the C-version of {@code Assimp::Importer::SetPropertyFloat()}. In the C interface, properties are always shared by all imports. It is not
        possible to specify them per import.
        """,

        SetImportPropertyInteger["store"],
        SetImportPropertyInteger["szName"],
        float.IN("value", "New value for the property")
    )

    void(
        "SetImportPropertyString",
        """
        Set a string property.

        This is the C-version of {@code Assimp::Importer::SetPropertyString()}. In the C interface, properties are always shared by all imports. It is not
        possible to specify them per import.
        """,

        SetImportPropertyInteger["store"],
        SetImportPropertyInteger["szName"],
        const..aiString_p.IN("value", "New value for the property")
    )

    void(
        "SetImportPropertyMatrix",
        """
        Set a matrix property.

        This is the C-version of {@code Assimp::Importer::SetPropertyMatrix()}. In the C interface, properties are always shared by all imports. It is not
        possible to specify them per import.
        """,

        SetImportPropertyInteger["store"],
        SetImportPropertyInteger["szName"],
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
        Returns the number of import file formats available in the current Assimp build. Use #GetImportFormatDescription() to retrieve infos of a specific
        import format.
        """
    )

    aiImporterDesc_p(
        "GetImportFormatDescription",
        "Returns a description of the nth import file format. Use #GetImportFormatCount() to learn how many import formats are supported.",

        size_t.IN("pIndex", "Index of the import format to retrieve information for. Valid range is 0 to #GetImportFormatCount()"),

        returnDoc = "A description of that specific import format. #NULL if {@code pIndex} is out of range."
    )

    // importerdesc.h

    EnumConstant(
        "Mixed set of flags for ##AIImporterDesc, indicating some features common to many importers.",

        "ImporterFlags_SupportTextFlavour".enum("Indicates that there is a textual encoding of the file format; and that it is supported.", 0x1),
        "ImporterFlags_SupportBinaryFlavour".enum("Indicates that there is a binary encoding of the file format; and that it is supported.", 0x2),
        "ImporterFlags_SupportCompressedFlavour".enum("Indicates that there is a compressed encoding of the file format; and that it is supported.", 0x4),
        "ImporterFlags_LimitedSupport".enum(
            """
            Indicates that the importer reads only a very particular subset of the file format. This happens commonly for declarative or procedural formats
            which cannot easily be mapped to ##AIScene
            """,
            0x8
        ),
        "ImporterFlags_Experimental".enum(
            """
            Indicates that the importer is highly experimental and should be used with care. This only happens for trunk (i.e. SVN) versions, experimental code
            is not included in releases.
            """,
            0x10
        )
    )

    aiImporterDesc_p(
        "GetImporterDesc",
        """
        Returns the Importer description for a given extension.

        Will return a #NULL-pointer if no assigned importer desc. was found for the given extension.
        """,

        const..charASCII_p.IN("extension", "The extension to look for"),

        returnDoc = "A pointer showing to the ImporterDesc, ##AIImporterDesc."
    )

    // light.h

    EnumConstant(
        """
        Enumerates all supported types of light sources.
        """,

        "LightSource_UNDEFINED".enum("Undefined or unknown light source", 0x0),
        "LightSource_DIRECTIONAL".enum(
            "A directional light source has a well-defined direction but is infinitely far away. That's quite a good approximation for sun light.",
            0x1
        ),
        "LightSource_POINT".enum(
            "A point light source has a well-defined position in space but no direction - it emits light in all directions. A normal bulb is a point light.",
            0x2
        ),
        "LightSource_SPOT".enum(
            """
            A spot light source emits light in a specific angle. It has a position and a direction it is pointing to. A good example for a spot light is a
            light spot in sport arenas.
            """,
            0x3
        ),
        "LightSource_AMBIENT".enum(
            """
            The generic light level of the world, including the bounces of all other light sources. Typically, there's at most one ambient light in a scene.
            This light type doesn't have a valid position, direction, or other properties, just a color.
            """,
            0x4
        ),
        "LightSource_AREA".enum(
            """
            An area light is a rectangle with predefined size that uniformly emits light from one of its sides. The position is center of the rectangle and
            direction is its normal vector.
            """,
            0x5
        )
    )

    // material.h

    StringConstant(
        "Name for default materials (2nd is used if meshes have UV coords)",
        "AI_DEFAULT_MATERIAL_NAME".."DefaultMaterial"
    ).noPrefix()

    EnumConstant(
        """
        Defines how the Nth texture of a specific type is combined with
        the result of all previous layers.
        """,

        "TextureOp_Multiply".enum("{@code T = T1 * T2}", 0x0),
        "TextureOp_Add".enum("{@code T = T1 + T2}", 0x1),
        "TextureOp_Subtract".enum("{@code T = T1 - T2}", 0x2),
        "TextureOp_Divide".enum("{@code T = T1 / T2}", 0x3),
        "TextureOp_SmoothAdd".enum("{@code T = (T1 + T2) - (T1 * T2)}", 0x4),
        "TextureOp_SignedAdd".enum("{@code T = T1 + (T2 - 0.5)}", 0x5)
    )

    EnumConstant(
        """
        Defines how UV coordinates outside the [0...1] range are handled.
        Commonly referred to as 'wrapping mode'.
        """,

        "TextureMapMode_Wrap".enum("A texture coordinate {@code u|v} is translated to {@code u%1|v%1}", 0x0),
        "TextureMapMode_Clamp".enum("Texture coordinates outside {@code [0...1]} are clamped to the nearest valid value.", 0x1),
        "TextureMapMode_Decal".enum("If the texture coordinates for a pixel are outside {@code [0...1]} the texture is not applied to that pixel", 0x3),
        "TextureMapMode_Mirror".enum(
            "A texture coordinate {@code u|v} becomes {@code u%1|v%1} if {@code (u-(u%1))%2} is zero and {@code 1-(u%1)|1-(v%1)} otherwise",
            0x2
        )
    )

    EnumConstant(
        """
        Defines how the mapping coords for a texture are generated.

        Real-time applications typically require full UV coordinates, so the use of the #Process_GenUVCoords step is highly recommended. It generates proper UV
        channels for non-UV mapped objects, as long as an accurate description how the mapping should look like (e.g spherical) is given.

        See the #_AI_MATKEY_MAPPING_BASE property for more details.
        """,

        "TextureMapping_UV".enum(
            """
            The mapping coordinates are taken from an UV channel. The #_AI_MATKEY_UVWSRC_BASE key specifies from which UV channel the texture coordinates are
            to be taken from (remember, meshes can have more than one UV channel).
            """,
            0x0
        ),
        "TextureMapping_SPHERE".enum("Spherical mapping", 0x1),
        "TextureMapping_CYLINDER".enum("Cylindrical mapping", 0x2),
        "TextureMapping_BOX".enum("Cubic mapping", 0x3),
        "TextureMapping_PLANE".enum("Planar mapping", 0x4),
        "TextureMapping_OTHER".enum("Undefined mapping. Have fun.", 0x5)
    )

    val TextureTypes = EnumConstant(
        """
        Defines the purpose of a texture.

        This is a very difficult topic. Different 3D packages support different kinds of textures. For very common texture types, such as bumpmaps, the
        rendering results depend on implementation details in the rendering pipelines of these applications. Assimp loads all texture references from the model
        file and tries to determine which of the predefined texture types below is the best choice to match the original use of the texture as closely as
        possible.

        In content pipelines you'll usually define how textures have to be handled, and the artists working on models have to conform to this specification,
        regardless which 3D tool they're using.
        """,

        "TextureType_NONE".enum(
            """
            Dummy value. No texture, but the value to be used as 'texture semantic' (##AIMaterialProperty{@code ::mSemantic}) for all material properties *not*
            related to textures.
            """,
            0x0
        ),
        "TextureType_DIFFUSE".enum("The texture is combined with the result of the diffuse lighting equation.", 0x1),
        "TextureType_SPECULAR".enum("The texture is combined with the result of the specular lighting equation.", 0x2),
        "TextureType_AMBIENT".enum("The texture is combined with the result of the ambient lighting equation.", 0x3),
        "TextureType_EMISSIVE".enum("The texture is added to the result of the lighting calculation. It isn't influenced by incoming light.", 0x4),
        "TextureType_HEIGHT".enum(
            "The texture is a height map. By convention, higher gray-scale values stand for higher elevations from the base height.",
            0x5
        ),
        "TextureType_NORMALS".enum(
            """
            The texture is a (tangent space) normal-map. Again, there are several conventions for tangent-space normal maps. Assimp does (intentionally) not
            distinguish here.
            """,
            0x6
        ),
        "TextureType_SHININESS".enum(
            """
            The texture defines the glossiness of the material. The glossiness is in fact the exponent of the specular (phong) lighting equation. Usually there
            is a conversion function defined to map the linear color values in the texture to a suitable exponent. Have fun.
            """,
            0x7
        ),
        "TextureType_OPACITY".enum(
            "The texture defines per-pixel opacity. Usually 'white' means opaque and 'black' means 'transparency'. Or quite the opposite. Have fun.",
            0x8
        ),
        "TextureType_DISPLACEMENT".enum(
            "Displacement texture. The exact purpose and format is application-dependent. Higher color values stand for higher vertex displacements.",
            0x9
        ),
        "TextureType_LIGHTMAP".enum(
            """
            Lightmap texture (aka Ambient Occlusion). Both 'Lightmaps' and dedicated 'ambient occlusion maps' are covered by this material property. The
            texture contains a scaling value for the final color value of a pixel. Its intensity is not affected by incoming light.
            """,
            0xA
        ),
        "TextureType_REFLECTION".enum(
            "Reflection texture. Contains the color of a perfect mirror reflection. Rarely used, almost never for real-time applications.",
            0xB
        ),
        "TextureType_UNKNOWN".enum(
            """
            Unknown texture. A texture reference that does not match any of the definitions above is considered to be 'unknown'. It is still imported, but is
            excluded from any further postprocessing.
            """,
            0xC
        )
    ).javaDocLinks

    EnumConstant(
        """
        Defines all shading models supported by the library.

        The list of shading modes has been taken from Blender. See Blender documentation for more information. The API does not distinguish between "specular"
        and "diffuse" shaders (thus the specular term for diffuse shading models like Oren-Nayar remains undefined).

        Again, this value is just a hint. Assimp tries to select the shader whose most common implementation matches the original rendering results of the 3D
        modeller which wrote a particular model as closely as possible.
        """,

        "ShadingMode_Fflat".enum("Flat shading. Shading is done on per-face base, diffuse only. Also known as 'faceted shading'.", 0x1),
        "ShadingMode_Gouraud".enum("Simple Gouraud shading.", 0x2),
        "ShadingMode_Phong".enum("Phong-Shading", 0x3),
        "ShadingMode_Blinn".enum("Phong-Blinn-Shading", 0x4),
        "ShadingMode_Toon".enum("Toon-Shading per pixel. Also known as 'comic' shader.", 0x5),
        "ShadingMode_OrenNayar".enum(
            "OrenNayar-Shading per pixel. Extension to standard Lambertian shading, taking the roughness of the material into account",
            0x6
        ),
        "ShadingMode_Minnaert".enum(
            "Minnaert-Shading per pixel. Extension to standard Lambertian shading, taking the 'darkness' of the material into account",
            0x7
        ),
        "ShadingMode_CookTorrance".enum("CookTorrance-Shading per pixel. Special shader for metallic surfaces.", 0x8),
        "ShadingMode_NoShading".enum("No shading at all. Constant light influence of 1.0.", 0x9),
        "ShadingMode_Fresnel".enum("Fresnel shading", 0xa)
    )

    EnumConstant(
        """
        Defines some mixed flags for a particular texture.

        Usually you'll instruct your cg artists how textures have to look like and how they will be processed in your application. However, if you use Assimp
        for completely generic loading purposes you might also need to process these flags in order to display as many 'unknown' 3D models as possible
        correctly.

        This corresponds to the #_AI_MATKEY_TEXFLAGS_BASE property.
        """,

        "TextureFlags_Invert".enum("The texture's color values have to be inverted (componentwise 1-n)", 0x1),
        "TextureFlags_UseAlpha".enum(
            """
            Explicit request to the application to process the alpha channel of the texture. Mutually exclusive with #TextureFlags_IgnoreAlpha. These flags are
            set if the library can say for sure that the alpha channel is used/is not used. If the model format does not define this, it is left to the
            application to decide whether the texture alpha channel - if any - is evaluated or not.
            """,
            0x2
        ),
        "TextureFlags_IgnoreAlpha".enum(
            "Explicit request to the application to ignore the alpha channel of the texture. Mutually exclusive with #TextureFlags_UseAlpha.",
            0x2
        )
    )

    EnumConstant(
        """
        Defines alpha-blend flags.

        If you're familiar with OpenGL or D3D, these flags aren't new to you. They define *how* the final color value of a pixel is computed, basing on the
        previous color at that pixel and the new color value from the material.
        """,

        "BlendMode_Default".enum("{@code SourceColor*SourceAlpha + DestColor*(1-SourceAlpha)}", 0x0),
        "BlendMode_Additive".enum("{@code SourceColor*1 + DestColor*1}", 0x1)
    )

    EnumConstant(
        "A very primitive RTTI system for the contents of material properties.",

        "PTI_Float".enum("Array of single-precision (32 Bit) floats", 0x1),
        "PTI_Double".enum("Array of double-precision (64 Bit) floats", 0x2),
        "PTI_String".enum("The material property is an aiString.", 0x3),
        "PTI_Integer".enum("Array of (32 Bit) integers", 0x4),
        "PTI_Buffer".enum("Simple binary buffer, content undefined. Not convertible to anything.", 0x5)
    )

    StringConstant(
        "Material keys",

        "AI_MATKEY_NAME".."?mat.name",
        "AI_MATKEY_TWOSIDED".."\$mat.twosided",
        "AI_MATKEY_SHADING_MODEL".."\$mat.shadingm",
        "AI_MATKEY_ENABLE_WIREFRAME".."\$mat.wireframe",
        "AI_MATKEY_BLEND_FUNC".."\$mat.blend",
        "AI_MATKEY_OPACITY".."\$mat.opacity",
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

        "_AI_MATKEY_TEXTURE_BASE".."\$tex.file",
        "_AI_MATKEY_UVWSRC_BASE".."\$tex.uvwsrc",
        "_AI_MATKEY_TEXOP_BASE".."\$tex.op",
        "_AI_MATKEY_MAPPING_BASE".."\$tex.mapping",
        "_AI_MATKEY_TEXBLEND_BASE".."\$tex.blend",
        "_AI_MATKEY_MAPPINGMODE_U_BASE".."\$tex.mapmodeu",
        "_AI_MATKEY_MAPPINGMODE_V_BASE".."\$tex.mapmodev",
        "_AI_MATKEY_TEXMAP_AXIS_BASE".."\$tex.mapaxis",
        "_AI_MATKEY_UVTRANSFORM_BASE".."\$tex.uvtrafo",
        "_AI_MATKEY_TEXFLAGS_BASE".."\$tex.flags"
    ).noPrefix()

    val GetMaterialProperty = aiReturn(
        "GetMaterialProperty",
        "Retrieve a material property with a specific key from the material.",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be #NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        unsigned_int.IN("type", "Specifies the type of the texture to be retrieved", TextureTypes),
        unsigned_int.IN("index", "Index of the texture to be retrieved."),
        Check(1)..aiMaterialProperty_pp.OUT(
            "mPropOut",
            "Pointer to receive a pointer to a valid ##AIMaterialProperty structure or #NULL if the key has not been found."
        ),

        returnDoc = "Return_xxx values."
    )

    macro(expression = "aiGetMaterialProperty(pMat, pKey, 0, 0, mPropOut)")..aiReturn(
        "aiGetMaterialProperty",
        "Retrieve a material property with a specific key from the material.",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["mPropOut"],

        returnDoc = "Return_xxx values.",
        noPrefix = true
    )

    aiReturn(
        "GetMaterialFloatArray",
        "Retrieve an array of float values with a specific key from the material.",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        float_p.OUT("pOut", "Pointer to a buffer to receive the result."),
        AutoSize("pOut")..Check(1)..nullable..unsigned_int_p.INOUT(
            "pMax",
            "Specifies the size of the given buffer, in float's. Receives the number of values (not bytes!) read."
        ),

        returnDoc = "Specifies whether the key has been found. If not, the output arrays remains unmodified and {@code pMax} is set to 0."
    )

    aiReturn(
        "GetMaterialIntegerArray",
        "Retrieve an array of integer values with a specific key from a material.",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        int_p.OUT("pOut", "Pointer to a buffer to receive the result."),
        AutoSize("pOut")..Check(1)..nullable..unsigned_int_p.INOUT(
            "pMax",
            "Specifies the size of the given buffer, in int's. Receives the number of values (not bytes!) read."
        ),

        returnDoc = "Specifies whether the key has been found. If not, the output arrays remains unmodified and {@code pMax} is set to 0."
    )

    aiReturn(
        "GetMaterialColor",
        "Retrieve a color value with a specific key from a material.",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        aiColor4D_p.OUT("pOut", "Pointer to a color to receive the result."),

        returnDoc = "Specifies whether the key has been found. If not, the output struct remains unmodified."
    )

    aiReturn(
        "GetMaterialUVTransform",
        "Retrieve a UVTransform value with a specific key from a material.",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        aiUVTransform_p.OUT("pOut", "Pointer to a ##AIUVTransform to receive the result."),

        returnDoc = "Specifies whether the key has been found. If not, the output struct remains unmodified."
    )

    aiReturn(
        "GetMaterialString",
        "Retrieve a string value with a specific key from a material.",

        GetMaterialProperty["pMat"],
        GetMaterialProperty["pKey"],
        GetMaterialProperty["type"],
        GetMaterialProperty["index"],
        aiString_p.OUT("pOut", "Pointer to a string to receive the result."),

        returnDoc = "Specifies whether the key has been found. If not, the output struct remains unmodified."
    )

    unsigned_int(
        "GetMaterialTextureCount",
        "Get the number of textures for a particular texture type.",

        GetMaterialProperty["pMat"],
        aiTextureType.IN("type", "Texture type to check for", TextureTypes),

        returnDoc = "Number of textures for this type."
    )

    aiReturn(
        "GetMaterialTexture",
        """
        Helper function to get all values pertaining to a particular
        texture slot from a material structure.

        This function is provided just for convenience. You could also read the
        texture by parsing all of its properties manually. This function bundles
        all of them in a huge function monster.
        """,

        GetMaterialProperty["pMat"],
        aiTextureType.IN("type", "Specifies the texture stack to read from (e.g. diffuse, specular, height map ...).", TextureTypes),
        unsigned_int.IN("index", "Index of the texture. The function fails if the requested index is not available for this texture type."),
        aiString_p.OUT("path", "Receives the output path. This parameter must be non-null."),
        Check(1)..nullable..aiTextureMapping_p.IN("mapping", "The texture mapping mode to be used. Pass #NULL if you're not interested in this information."),
        Check(1)..nullable..unsigned_int_p.OUT("uvindex", "For UV-mapped textures: receives the index of the UV source channel. Unmodified otherwise."),
        Check(1)..nullable..float_p.OUT("blend", "Receives the blend factor for the texture. Pass #NULL if you're not interested in this information."),
        Check(1)..nullable..aiTextureOp_p.OUT(
            "op",
            """
            Receives the texture blend operation to be perform between this texture and the previous texture. Pass #NULL if you're not interested in this
            information.
            """),
        Check(1)..nullable..aiTextureMapMode_p.OUT(
            "mapmode",
            """
            Receives the mapping modes to be used for the texture. Pass #NULL if you're not interested in this information. Otherwise, pass a pointer to an
            array of two {@code aiTextureMapMode}'s (one for each axis, UV order).
            """
        ),
        Check(1)..nullable..unsigned_int_p.OUT("flags", "Receives the texture flags."),

        returnDoc = "#Return_SUCCESS on success, otherwise something else. Have fun."
    )

    // mesh.h

    IntConstant(
        "Maximum number of indices per face (polygon).",
        "AI_MAX_FACE_INDICES"..0x7fff
    ).noPrefix()

    IntConstant(
        "Maximum number of indices per face (polygon).",
        "AI_MAX_BONE_WEIGHTS"..0x7fffffff
    ).noPrefix()

    IntConstant(
        "Maximum number of vertices per mesh.",
        "AI_MAX_VERTICES"..0x7fffffff
    ).noPrefix()

    IntConstant(
        "Maximum number of faces per mesh.",
        "AI_MAX_FACES"..0x7fffffff
    ).noPrefix()

    IntConstant(
        "Supported number of vertex color sets per mesh.",
        "AI_MAX_NUMBER_OF_COLOR_SETS"..0x8
    ).noPrefix()

    IntConstant(
        "Supported number of texture coord sets (UV(W) channels) per mesh.",
        "AI_MAX_NUMBER_OF_TEXTURECOORDS"..0x8
    ).noPrefix()

    EnumConstant(
        """
        Enumerates the types of geometric primitives supported by Assimp.
        """,

        "PrimitiveType_POINT".enum(
            "A point primitive. This is just a single vertex in the virtual world, ##AIFace contains just one index for such a primitive.",
            0x1
        ),
        "PrimitiveType_LINE".enum(
            "A line primitive. This is a line defined through a start and an end position. ##AIFace contains exactly two indices for such a primitive.",
            0x2
        ),
        "PrimitiveType_TRIANGLE".enum(
            "A triangular primitive. A triangle consists of three indices.",
            0x4
        ),
        "PrimitiveType_POLYGON".enum(
            """
            A higher-level polygon with more than 3 edges. A triangle is a polygon, but polygon in this context means "all polygons that are not triangles".
            The "Triangulate"-Step is provided for your convenience, it splits all polygons in triangles (which are much easier to handle).
            """,
            0x8
        )
    )

    // metadata.h

    EnumConstant(
        "Enum used to distinguish data types.",

        "AI_BOOL".enum("", 0),
        "AI_INT".enum("", 1),
        "AI_UINT64".enum("", 2),
        "AI_FLOAT".enum("", 3),
        "AI_AISTRING".enum("", 4),
        "AI_AIVECTOR3D".enum("", 5)
    ).noPrefix()

    // postprocess.h

    EnumConstant(
        """
        Defines the flags for all possible post processing steps.
        """,

        "Process_CalcTangentSpace".enum(
            """
            Calculates the tangents and bitangents for the imported meshes.

            Does nothing if a mesh does not have normals. You might want this post processing step to be executed if you plan to use tangent space calculations
            such as normal mapping  applied to the meshes. There's an importer property, #AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE, which allows you to
            specify a maximum smoothing angle for the algorithm. However, usually you'll want to leave it at the default value.
            """,
            0x1
        ),

        "Process_JoinIdenticalVertices".enum(
            """
            Identifies and joins identical vertex data sets within all imported meshes.

            After this step is run, each mesh contains unique vertices, so a vertex may be used by multiple faces. You usually want to use this post processing
            step. If your application deals with indexed geometry, this step is compulsory or you'll just waste rendering time. <b>If this flag is not
            specified</b>, no vertices are referenced by more than one face and <b>no index buffer is required</b> for rendering.
            """,
            0x2
        ),

        "Process_MakeLeftHanded".enum(
            """
            Converts all the imported data to a left-handed coordinate space.

            By default the data is returned in a right-handed coordinate space (which OpenGL prefers). In this space, +X points to the right, +Z points towards
            the viewer, and +Y points upwards. In the DirectX coordinate space +X points to the right, +Y points upwards, and +Z points away from the viewer.

            You'll probably want to consider this flag if you use Direct3D for rendering. The #Process_ConvertToLeftHanded flag supersedes this setting and
            bundles all conversions typically required for D3D-based applications.
            """,
            0x4
        ),

        "Process_Triangulate".enum(
            """
            Triangulates all faces of all meshes.

            By default the imported mesh data might contain faces with more than 3 indices. For rendering you'll usually want all faces to be triangles. This
            post processing step splits up faces with more than 3 indices into triangles. Line and point primitives are *not* modified! If you want 'triangles
            only' with no other kinds of primitives, try the following solution:
            ${ul(
                "Specify both #Process_Triangulate and #Process_SortByPType",
                "Ignore all point and line meshes when you process assimp's output"
            )}
            """,
            0x8
        ),

        "Process_RemoveComponent".enum(
            """
            Removes some parts of the data structure (animations, materials, light sources, cameras, textures, vertex components).

            The  components to be removed are specified in a separate importer property, #AI_CONFIG_PP_RVC_FLAGS. This is quite useful if you don't need
            all parts of the output structure. Vertex colors are rarely used today for example... Calling this step to remove unneeded data from the pipeline
            as early as possible results in increased performance and a more optimized output data structure. This step is also useful if you want to force
            Assimp to recompute normals or tangents. The corresponding steps don't recompute them if they're already there (loaded from the source asset). By
            using this step you can make sure they are NOT there.

            This flag is a poor one, mainly because its purpose is usually misunderstood. Consider the following case: a 3D model has been exported from a CAD
            app, and it has per-face vertex colors. Vertex positions can't be shared, thus the #Process_JoinIdenticalVertices step fails to optimize the data
            because of these nasty little vertex colors. Most apps don't even process them, so it's all for nothing. By using this step, unneeded components
            are excluded as early as possible thus opening more room for internal optimizations.
            """,
            0x10
        ),

        "Process_GenNormals".enum(
            """
            Generates normals for all faces of all meshes.

            This is ignored if normals are already there at the time this flag is evaluated. Model importers try to load them from the source file, so they're
            usually already there. Face normals are shared between all points of a single face, so a single point can have multiple normals, which forces the
            library to duplicate vertices in some cases. #Process_JoinIdenticalVertices is *senseless* then.

            This flag may not be specified together with #Process_GenSmoothNormals.
            """,
            0x20
        ),

        "Process_GenSmoothNormals".enum(
            """
            Generates smooth normals for all vertices in the mesh.

            This is ignored if normals are already there at the time this flag is evaluated. Model importers try to load them from the source file, so they're
            usually already there.

            This flag may not be specified together with #Process_GenNormals. There's a importer property, #AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE which
            allows you to specify an angle maximum for the normal smoothing algorithm. Normals exceeding this limit are not smoothed, resulting in a 'hard'
            seam between two faces. Using a decent angle here (e.g. 80 degrees) results in very good visual appearance.
            """,
            0x40
        ),

        "Process_SplitLargeMeshes".enum(
            """
            Splits large meshes into smaller sub-meshes.

            This is quite useful for real-time rendering, where the number of triangles which can be maximally processed in a single draw-call is limited by
            the video driver/hardware. The maximum vertex buffer is usually limited too. Both requirements can be met with this step: you may specify both a
            triangle and vertex limit for a single mesh.

            The split limits can (and should!) be set through the #AI_CONFIG_PP_SLM_VERTEX_LIMIT and #AI_CONFIG_PP_SLM_TRIANGLE_LIMIT importer
            properties. The default values are #AI_SLM_DEFAULT_MAX_VERTICES and #AI_SLM_DEFAULT_MAX_TRIANGLES.

            Note that splitting is generally a time-consuming task, but only if there's something to split. The use of this step is recommended for most users.
            """,
            0x80
        ),

        "Process_PreTransformVertices".enum(
            """
            Removes the node graph and pre-transforms all vertices with the local transformation matrices of their nodes.

            The output scene still contains nodes, however there is only a root node with children, each one referencing only one mesh, and each mesh
            referencing one material. For rendering, you can simply render all meshes in order - you don't need to pay attention to local transformations and
            the node hierarchy. Animations are removed during this step.

            This step is intended for applications without a scenegraph. The step CAN cause some problems: if e.g. a mesh of the asset contains normals and
            another, using the same material index, does not, they will be brought together, but the first meshes's part of the normal list is zeroed. However,
            these artifacts are rare.

            ${note(
                """
                The #AI_CONFIG_PP_PTV_NORMALIZE configuration property can be set to normalize the scene's spatial dimension to the {@code -1...1}
                range.
                """)}
            """,
            0x100
        ),

        "Process_LimitBoneWeights".enum(
            """
            Limits the number of bones simultaneously affecting a single vertex to a maximum value.

            If any vertex is affected by more than the maximum number of bones, the least important vertex weights are removed and the remaining vertex weights
            are renormalized so that the weights still sum up to 1. The default bone weight limit is 4 (defined as #AI_LBW_MAX_WEIGHTS in config.h), but
            you can use the #AI_CONFIG_PP_LBW_MAX_WEIGHTS importer property to supply your own limit to the post processing step.

            If you intend to perform the skinning in hardware, this post processing step might be of interest to you.
            """,
            0x200
        ),

        "Process_ValidateDataStructure".enum(
            """
            Validates the imported scene data structure. This makes sure that all indices are valid, all animations and bones are linked correctly, all
            material references are correct .. etc.

            It is recommended that you capture Assimp's log output if you use this flag, so you can easily find out what's wrong if a file fails the
            validation. The validator is quite strict and will find *all* inconsistencies in the data structure... It is recommended that plugin developers use
            it to debug their loaders. There are two types of validation failures:
            ${ul(
                """
                Error: There's something wrong with the imported data. Further postprocessing is not possible and the data is not usable at all. The import
                fails. #GetErrorString() carries the error message around.
                """,
                """
                Warning: There are some minor issues (e.g. 1000000 animation keyframes with the same time), but further postprocessing and use of the data
                structure is still safe. Warning details are written to the log file, #AI_SCENE_FLAGS_VALIDATION_WARNING is set in
                ##AIScene{@code ::mFlags}.
                """
            )}
            This post-processing step is not time-consuming. Its use is not compulsory, but recommended.
            """,
            0x400
        ),

        "Process_ImproveCacheLocality".enum(
            """
            Reorders triangles for better vertex cache locality.

            The step tries to improve the ACMR (average post-transform vertex cache miss ratio) for all meshes. The implementation runs in O(n) and is roughly
            based on the 'tipsify' algorithm (see ${url("http://www.cs.princeton.edu/gfx/pubs/Sander_2007_%3ETR/tipsy.pdf", "this paper")}).

            If you intend to render huge models in hardware, this step might be of interest to you. The #AI_CONFIG_PP_ICL_PTCACHE_SIZE importer property
            can be used to fine-tune the cache optimization.
            """,
            0x800
        ),

        "Process_RemoveRedundantMaterials".enum(
            """
            Searches for redundant/unreferenced materials and removes them.

            This is especially useful in combination with the #Process_PreTransformVertices and #Process_OptimizeMeshes flags. Both join small meshes with
            equal characteristics, but they can't do their work if two meshes have different materials. Because several material settings are lost during
            Assimp's import filters, (and because many exporters don't check for redundant materials), huge models often have materials which are are defined
            several times with exactly the same settings.

            Several material settings not contributing to the final appearance of a surface are ignored in all comparisons (e.g. the material name). So, if
            you're passing additional information through the content pipeline (probably using *magic* material names), don't specify this flag. Alternatively
            take a look at the #AI_CONFIG_PP_RRM_EXCLUDE_LIST importer property.
            """,
            0x1000
        ),

        "Process_FixInfacingNormals".enum(
            """
            This step tries to determine which meshes have normal vectors that are facing inwards and inverts them.

            The algorithm is simple but effective: the bounding box of all vertices + their normals is compared against the volume of the bounding box of all
            vertices without their normals. This works well for most objects, problems might occur with planar surfaces. However, the step tries to filter such
            cases. The step inverts all in-facing normals. Generally it is recommended to enable this step, although the result is not always correct.
            """,
            0x2000
        ),

        "Process_SortByPType".enum(
            """
            This step splits meshes with more than one primitive type in homogeneous sub-meshes.

            The step is executed after the triangulation step. After the step returns, just one bit is set in ##AIMesh{@code ::mPrimitiveTypes}. This is
            especially useful for real-time rendering where point and line primitives are often ignored or rendered separately. You can use the
            #AI_CONFIG_PP_SBP_REMOVE importer property to specify which primitive types you need. This can be used to easily exclude lines and points,
            which are rarely used, from the import.
            """,
            0x8000
        ),

        "Process_FindDegenerates".enum(
            """
            This step searches all meshes for degenerate primitives and converts them to proper lines or points.

            A face is 'degenerate' if one or more of its points are identical. To have the degenerate stuff not only detected and collapsed but removed, try
            one of the following procedures:
            ${ol(
                """
                (if you support lines and points for rendering but don't want the degenerates)
                ${ul(
                    "Specify the #Process_FindDegenerates flag.",
                    """
                    Set the #AI_CONFIG_PP_FD_REMOVE importer property to 1. This will cause the step to remove degenerate triangles from the import as
                    soon as they're detected. They won't pass any further pipeline steps.
                    """
                )}
                """,
                """
                (if you don't support lines and points at all)
                ${ul(
                    "Specify the #Process_FindDegenerates flag.",
                    "Specify the #Process_SortByPType flag. This moves line and point primitives to separate meshes.",
                    """
                    Set the #AI_CONFIG_PP_SBP_REMOVE importer property to ${code("#PrimitiveType_POINT | #PrimitiveType_LINE")} to cause
                    #Process_SortByPType to reject point and line meshes from the scene.
                    """
                )}
                """
            )}

            ${note("""
            Degenerate polygons are not necessarily evil and that's why they're not removed by default. There are several file formats which don't support
            lines or points, and some exporters bypass the format specification and write them as degenerate triangles instead.""")}
            """,
            0x10000
        ),

        "Process_FindInvalidData".enum(
            """
            This step searches all meshes for invalid data, such as zeroed normal vectors or invalid UV coords and removes/fixes them. This is intended to get
            rid of some common exporter errors.

            This is especially useful for normals. If they are invalid, and the step recognizes this, they will be removed and can later be recomputed, i.e. by
            the #Process_GenSmoothNormals flag.

            The step will also remove meshes that are infinitely small and reduce animation tracks consisting of hundreds if redundant keys to a single key.
            The #AI_CONFIG_PP_FID_ANIM_ACCURACY config property decides the accuracy of the check for duplicate animation tracks.
            """,
            0x20000
        ),

        "Process_GenUVCoords".enum(
            """
            This step converts non-UV mappings (such as spherical or cylindrical mapping) to proper texture coordinate channels.

            Most applications will support UV mapping only, so you will probably want to specify this step in every case. Note that Assimp is not always able
            to match the original mapping implementation of the 3D app which produced a model perfectly. It's always better to let the modelling app compute
            the UV channels - 3ds max, Maya, Blender, LightWave, and Modo do this for example.

            ${note(
                """
                If this step is not requested, you'll need to process the #_AI_MATKEY_MAPPING_BASE material property in order to display all assets
                properly.
                """)}
            """,
            0x40000
        ),

        "Process_TransformUVCoords".enum(
            """
            This step applies per-texture UV transformations and bakes them into stand-alone vtexture coordinate channels.

            UV transformations are specified per-texture - see the #_AI_MATKEY_UVTRANSFORM_BASE material key for more information. This step processes
            all textures with transformed input UV coordinates and generates a new (pre-transformed) UV channel which replaces the old channel. Most
            applications won't support UV transformations, so you will probably want to specify this step.

            ${note("""
            UV transformations are usually implemented in real-time apps by transforming texture coordinates at vertex shader stage with a 3x3 (homogenous)
            transformation matrix.""")}
            """,
            0x80000
        ),

        "Process_FindInstances".enum(
            """
            This step searches for duplicate meshes and replaces them with references to the first mesh.

            This step takes a while, so don't use it if speed is a concern. Its main purpose is to workaround the fact that many export file formats don't
            support instanced meshes, so exporters need to duplicate meshes. This step removes the duplicates again. Please note that Assimp does not currently
            support per-node material assignment to meshes, which means that identical meshes with different materials are currently *not* joined, although
            this is planned for future versions.
            """,
            0x100000
        ),

        "Process_OptimizeMeshes".enum(
            """
            A postprocessing step to reduce the number of meshes.

            This will, in fact, reduce the number of draw calls.

            This is a very effective optimization and is recommended to be used together with #Process_OptimizeGraph, if possible. The flag is fully compatible
            with both #Process_SplitLargeMeshes and #Process_SortByPType.
            """,
            0x200000
        ),

        "Process_OptimizeGraph".enum(
            """
            A postprocessing step to optimize the scene hierarchy.

            Nodes without animations, bones, lights or cameras assigned are collapsed and joined.

            Node names can be lost during this step. If you use special 'tag nodes' to pass additional information through your content pipeline, use the
            #AI_CONFIG_PP_OG_EXCLUDE_LIST importer property to specify a list of node names you want to be kept. Nodes matching one of the names in this
            list won't be touched or modified.

            Use this flag with caution. Most simple files will be collapsed to a single node, so complex hierarchies are usually completely lost. This is not
            useful for editor environments, but probably a very effective optimization if you just want to get the model data, convert it to your own format,
            and render it as fast as possible.

            This flag is designed to be used with #Process_OptimizeMeshes for best results.

            ${note("""
            'Crappy' scenes with thousands of extremely small meshes packed in deeply nested nodes exist for almost all file formats. #Process_OptimizeMeshes
            in combination with #Process_OptimizeGraph usually fixes them all and makes them renderable.
            """)}
            """,
            0x400000
        ),

        "Process_FlipUVs".enum(
            """
            This step flips all UV coordinates along the y-axis and adjusts material settings and bitangents accordingly.

            <b>Output UV coordinate system:</b>
            ${codeBlock("""
0y|0y ---------- 1x|0y
  |                |
  |                |
  |                |
0x|1y ---------- 1x|1y""")}
            You'll probably want to consider this flag if you use Direct3D for rendering. The #Process_ConvertToLeftHanded flag supersedes this setting and
            bundles all conversions typically required for D3D-based applications.
            """,
            0x800000
        ),

        "Process_FlipWindingOrder".enum(
            """
            This step adjusts the output face winding order to be CW.

            The default face winding order is counter clockwise (CCW).

            <b>Output face order:</b>
            ${codeBlock("""
    x2

                  x0
x1""")}
            """,
            0x1000000
        ),

        "Process_SplitByBoneCount".enum(
            """
            This step splits meshes with many bones into sub-meshes so that each sub-mesh has fewer or as many bones as a given limit.
            """,
            0x2000000
        ),

        "Process_Debone".enum(
            """
            This step removes bones losslessly or according to some threshold.

            In some cases (i.e. formats that require it) exporters are forced to assign dummy bone weights to otherwise static meshes assigned to animated
            meshes. Full, weight-based skinning is expensive while animating nodes is extremely cheap, so this step is offered to clean up the data in that
            regard.

            Use #AI_CONFIG_PP_DB_THRESHOLD to control this. Use #AI_CONFIG_PP_DB_ALL_OR_NONE if you want bones removed if and only if all bones
            within the scene qualify for removal.
            """,
            0x4000000
        )
    )

    EnumConstant(
        "Process Presets",

        "Process_ConvertToLeftHanded".enum(
            """
            Shortcut flag for Direct3D-based applications.

            Supersedes the #Process_MakeLeftHanded and #Process_FlipUVs and #Process_FlipWindingOrder flags. The output data matches Direct3D's conventions:
            left-handed geometry, upper-left origin for UV coordinates and finally clockwise face order, suitable for CCW culling.
            """,
            """
            aiProcess_MakeLeftHanded   |
            aiProcess_FlipUVs          |
            aiProcess_FlipWindingOrder |
            0"""
        ),

        "ProcessPreset_TargetRealtime_Fast".enum(
            """
            Default postprocess configuration optimizing the data for real-time rendering.

            Applications would want to use this preset to load models on end-user PCs, maybe for direct use in game.

            If you're using DirectX, don't forget to combine this value with the #Process_ConvertToLeftHanded step. If you don't support UV transformations in
            your application apply the #Process_TransformUVCoords step, too.

            ${note("""
            Please take the time to read the docs for the steps enabled by this preset. Some of them offer further configurable properties, while some of them
            might not be of use for you so it might be better to not specify them.""")}
            """,
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
            Default postprocess configuration optimizing the data for real-time rendering.

            Unlike #ProcessPreset_TargetRealtime_Fast, this configuration performs some extra optimizations to improve rendering speed and to minimize memory
            usage. It could be a good choice for a level editor environment where import speed is not so important.

            If you're using DirectX, don't forget to combine this value with the #Process_ConvertToLeftHanded step. If you don't support UV transformations in
            your application apply the #Process_TransformUVCoords step, too.

            ${note("""
            Please take the time to read the docs for the steps enabled by this preset. Some of them offer further configurable properties, while some of them
            might not be of use for you so it might be better to not specify them.""")}
            """,
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
            Default postprocess configuration optimizing the data for real-time rendering.

            This preset enables almost every optimization step to achieve perfectly optimized data. It's your choice for level editor environments where import
            speed is not important.

            If you're using DirectX, don't forget to combine this value with the #Process_ConvertToLeftHanded step. If you don't support UV transformations in
            your application, apply the #Process_TransformUVCoords step, too.

            ${note("""
            Please take the time to read the docs for the steps enabled by this preset. Some of them offer further configurable properties, while some of them
            might not be of use for you so it might be better to not specify them.""")}
            """,
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
        """
        Specifies that the scene data structure that was imported is not complete.
        This flag bypasses some internal validations and allows the import
        of animation skeletons, material libraries or camera animation paths
        using Assimp. Most applications won't support such data.
        """,
        "AI_SCENE_FLAGS_INCOMPLETE"..0x1
    ).noPrefix()

    IntConstant(
        """
        This flag is set by the validation postprocess-step (aiPostProcess_ValidateDS)
        if the validation is successful. In a validated scene you can be sure that
        any cross references in the data structure (e.g. vertex indices) are valid.
        """,
        "AI_SCENE_FLAGS_VALIDATED"..0x2
    ).noPrefix()

    IntConstant(
        """
        This flag is set by the validation postprocess-step (aiPostProcess_ValidateDS)
        if the validation is successful but some issues have been found.
        This can for example mean that a texture that does not exist is referenced
        by a material or that the bone weights for a vertex don't sum to 1.0 ... .
        In most cases you should still be able to use the import. This flag could
        be useful for applications which don't capture Assimp's log output.
        """,
        "AI_SCENE_FLAGS_VALIDATION_WARNING"..0x4
    ).noPrefix()

    IntConstant(
        """
        This flag is currently only set by the aiProcess_JoinIdenticalVertices step.
        It indicates that the vertices of the output meshes aren't in the internal
        verbose format anymore. In the verbose format all vertices are unique,
        no vertex is ever referenced by more than one face.
        """,
        "AI_SCENE_FLAGS_NON_VERBOSE_FORMAT"..0x8
    ).noPrefix()

    IntConstant(
        """
        Denotes pure height-map terrain data. Pure terrains usually consist of quads,
        sometimes triangles, in a regular grid. The x,y coordinates of all vertex
        positions refer to the x,y coordinates on the terrain height map, the z-axis
        stores the elevation at a specific point.

        TER (Terragen) and HMP (3D Game Studio) are height map formats.
        <b>Note</b>: Assimp is probably not the best choice for loading *huge* terrains -
        fully triangulated data takes extremely much free store and should be avoided
        as long as possible (typically you'll do the triangulation when you actually
        need to render it).
        """,
        "AI_SCENE_FLAGS_TERRAIN"..0x10
    ).noPrefix()

    // scene.h

    IntConstant(
        "Assimp was compiled as a shared object (Windows: DLL)",
        "ASSIMP_CFLAGS_SHARED"..0x1
    ).noPrefix()

    IntConstant(
        "Assimp was compiled against STLport",
        "ASSIMP_CFLAGS_STLPORT"..0x2
    ).noPrefix()

    IntConstant(
        "Assimp was compiled as a debug build",
        "ASSIMP_CFLAGS_DEBUG"..0x4
    ).noPrefix()

    IntConstant(
        "Assimp was compiled with {@code ASSIMP_BUILD_BOOST_WORKAROUND} defined",
        "ASSIMP_CFLAGS_NOBOOST"..0x8
    ).noPrefix()

    IntConstant(
        "Assimp was compiled with {@code ASSIMP_BUILD_SINGLETHREADED} defined",
        "ASSIMP_CFLAGS_SINGLETHREADED"..0x10
    ).noPrefix()

    const..charASCII_p(
        "GetLegalString",
        "Returns a string with legal copyright and licensing information about Assimp. The string may include multiple lines.",

        returnDoc = "A string containing the legal information."
    )

    unsigned_int(
        "GetVersionMinor",
        "Returns the current minor version number of Assimp.",

        returnDoc = "Minor version of the Assimp runtime the application was linked/built against"
    )

    unsigned_int(
        "GetVersionMajor",
        "Returns the current major version number of Assimp.",

        returnDoc = "Major version of the Assimp runtime the application was linked/built against"
    )

    unsigned_int(
        "GetVersionRevision",
        "Returns the repository revision of the Assimp runtime.",

        returnDoc = "SVN Repository revision number of the Assimp runtime the application was linked/built against."
    )

    unsigned_int(
        "GetCompileFlags",
        "Returns assimp's compile flags.",

        returnDoc = "Any bitwise combination of the {@code ASSIMP_CFLAGS_xxx} constants."
    )
}