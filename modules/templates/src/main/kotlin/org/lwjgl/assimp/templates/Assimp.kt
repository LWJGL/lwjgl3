/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.assimp.templates

import org.lwjgl.generator.*
import org.lwjgl.assimp.*

val Assimp = "Assimp".nativeClass(packageName = ASSIMP_PACKAGE, prefixMethod = "ai", binding = ASSIMP_BINDING) {
    documentation =
        """
        Contains bindings to the <a href="http://www.assimp.org/">Assimp</a> library.

        Assimp comes with fairly outdated documentation, which you can read online <a href="http://www.assimp.org/lib_html/">here</a>. The
        <a href="http://www.assimp.org/faq.html">Frequently Asked Questions</a> are also useful.

        The bindings only consist of the C API of the Assimp model import library.
        """

    EnumConstant(
        "Standard return type for some library functions. Rarely used.",

        "AI_RETURN_SUCCESS".enum("Indicates that a function was successful.", 0x0),
        "AI_RETURN_FAILURE".enum("Indicates that a function failed.", -0x1),
        "AI_RETURN_OUTOFMEMORY".enum("Indicates that not enough memory is available to perform the requested operation.", -0x3)
    )

    EnumConstant(
        "",

        "AI_BOOL".enum("", 0),
        "AI_INT".enum("", 1),
        "AI_UINT64".enum("", 2),
        "AI_FLOAT".enum("", 3),
        "AI_AISTRING".enum("", 4),
        "AI_AIVECTOR3D".enum("", 5)
    )

    EnumConstant(
        "Boolean constants",

        "AI_TRUE".enum("", 1),
        "AI_FALSE".enum("", 0)
    )

    EnumConstant(
        "Seek origins (for the virtual file system API).",

        "AI_ORIGIN_SET".enum("Beginning of the file", 0x0),
        "AI_ORIGIN_CUR".enum("Current position of the file pointer", 0x1),
        "AI_ORIGIN_END".enum("End of the file, offsets must be negative", 0x2)
    )

    EnumConstant(
        "Enumerates predefined log streaming destinations.",

        "AI_DEFAULTLOGSTREAM_FILE".enum("Stream the log to a file", 0x1),
        "AI_DEFAULTLOGSTREAM_STDOUT".enum("Stream the log to std::cout", 0x2),
        "AI_DEFAULTLOGSTREAM_STDERR".enum("Stream the log to std::cerr", 0x4),
        "AI_DEFAULTLOGSTREAM_DEBUGGER".enum("MSVC only: Stream the log the the debugger (this relies on OutputDebugString from the Win32 SDK)", 0x8)
    )

    EnumConstant(
        """
        Enumerates the types of geometric primitives supported by Assimp.
        """,

        "AI_PRIMITIVETYPE_POINT".enum("A point primitive. This is just a single vertex in the virtual world, #aiFace contains just one index for such a primitive.", 0x1),
        "AI_PRIMITIVETYPE_LINE".enum("A line primitive. This is a line defined through a start and an end position. #aiFace contains exactly two indices for such a primitive.", 0x2),
        "AI_PRIMITIVETYPE_TRIANGLE".enum("A triangular primitive. A triangle consists of three indices.", 0x4),
        "AI_PRIMITIVETYPE_POLYGON".enum("""A higher-level polygon with more than 3 edges. A triangle is a polygon, but polygon in this context means "all polygons that are not triangles". The "Triangulate"-Step is provided for your convenience, it splits all polygons in triangles (which are much easier to handle).""", 0x8)
    )

    EnumConstant(
        """
        Defines how the Nth texture of a specific type is combined with
        the result of all previous layers.
        """,

        "AI_TEXTUREOP_MULTIPLY".enum("T = T1 * T2", 0x0),
        "AI_TEXTUREOP_ADD".enum("T = T1 + T2", 0x1),
        "AI_TEXTUREOP_SUBTRACT".enum("T = T1 - T2", 0x2),
        "AI_TEXTUREOP_DIVIDE".enum("T = T1 / T2", 0x3),
        "AI_TEXTUREOP_SMOOTHADD".enum("T = (T1 + T2) - (T1 * T2)", 0x4),
        "AI_TEXTUREOP_SIGNEDADD".enum("T = T1 + (T2 - 0.5)", 0x5)
    )

    EnumConstant(
        """
        Defines how UV coordinates outside the [0...1] range are handled.
        Commonly referred to as 'wrapping mode'.
        """,

        "AI_TEXTUREWRAPMODE_WRAP".enum("A texture coordinate u|v is translated to u%1|v%1", 0x0),
        "AI_TEXTUREWRAPMODE_CLAMP".enum("Texture coordinates outside [0...1] are clamped to the nearest valid value.", 0x1),
        "AI_TEXTUREWRAPMODE_DECAL".enum("If the texture coordinates for a pixel are outside [0...1] the texture is not applied to that pixel", 0x3),
        "AI_TEXTUREWRAPMODE_MIRROR".enum("A texture coordinate u|v becomes u%1|v%1 if (u-(u%1))%2 is zero and 1-(u%1)|1-(v%1) otherwise", 0x2)
    )

    EnumConstant(
        """
        Defines how the mapping coords for a texture are generated.

        Real-time applications typically require full UV coordinates, so the use of
        the aiProcess_GenUVCoords step is highly recommended. It generates proper
        UV channels for non-UV mapped objects, as long as an accurate description
        how the mapping should look like (e.g spherical) is given.
        See the #AI_MATKEY_MAPPING property for more details.
        """,

        "AI_TEXTUREMAPPING_UV".enum("The mapping coordinates are taken from an UV channel. The #AI_MATKEY_UVWSRC key specifies from which UV channel the texture coordinates are to be taken from (remember, meshes can have more than one UV channel).", 0x0),
        "AI_TEXTUREMAPPING_SPHERE".enum("Spherical mapping", 0x1),
        "AI_TEXTUREMAPPING_CYLINDER".enum("Cylindrical mapping", 0x2),
        "AI_TEXTUREMAPPING_BOX".enum("Cubic mapping", 0x3),
        "AI_TEXTUREMAPPING_PLANE".enum("Planar mapping", 0x4),
        "AI_TEXTUREMAPPING_OTHER".enum("Undefined mapping. Have fun.", 0x5)
    )

    EnumConstant(
        """
        Defines the purpose of a texture

        This is a very difficult topic. Different 3D packages support different
        kinds of textures. For very common texture types, such as bumpmaps, the
        rendering results depend on implementation details in the rendering
        pipelines of these applications. Assimp loads all texture references from
        the model file and tries to determine which of the predefined texture
        types below is the best choice to match the original use of the texture
        as closely as possible.

        In content pipelines you'll usually define how textures have to be handled,
        and the artists working on models have to conform to this specification,
        regardless which 3D tool they're using.
        """,

        "AI_TEXTURETYPE_NONE".enum("Dummy value. No texture, but the value to be used as 'texture semantic' (#aiMaterialProperty::mSemantic) for all material properties *not* related to textures.", 0x0),
        "AI_TEXTURETYPE_DIFFUSE".enum("The texture is combined with the result of the diffuse lighting equation.", 0x1),
        "AI_TEXTURETYPE_SPECULAR".enum("The texture is combined with the result of the specular lighting equation.", 0x2),
        "AI_TEXTURETYPE_AMBIENT".enum("The texture is combined with the result of the ambient lighting equation.", 0x3),
        "AI_TEXTURETYPE_EMISSIVE".enum("The texture is added to the result of the lighting calculation. It isn't influenced by incoming light.", 0x4),
        "AI_TEXTURETYPE_HEIGHT".enum("The texture is a height map. By convention, higher gray-scale values stand for higher elevations from the base height.", 0x5),
        "AI_TEXTURETYPE_NORMALS".enum("The texture is a (tangent space) normal-map. Again, there are several conventions for tangent-space normal maps. Assimp does (intentionally) not distinguish here.", 0x6),
        "AI_TEXTURETYPE_SHININESS".enum("The texture defines the glossiness of the material. The glossiness is in fact the exponent of the specular (phong) lighting equation. Usually there is a conversion function defined to map the linear color values in the texture to a suitable exponent. Have fun.", 0x7),
        "AI_TEXTURETYPE_OPACITY".enum("The texture defines per-pixel opacity. Usually 'white' means opaque and 'black' means 'transparency'. Or quite the opposite. Have fun.", 0x8),
        "AI_TEXTURETYPE_DISPLACEMENT".enum("Displacement texture. The exact purpose and format is application-dependent. Higher color values stand for higher vertex displacements.", 0x9),
        "AI_TEXTURETYPE_LIGHTMAP".enum("Lightmap texture (aka Ambient Occlusion). Both 'Lightmaps' and dedicated 'ambient occlusion maps' are covered by this material property. The texture contains a scaling value for the final color value of a pixel. Its intensity is not affected by incoming light.", 0xA),
        "AI_TEXTURETYPE_REFLECTION".enum("Reflection texture. Contains the color of a perfect mirror reflection. Rarely used, almost never for real-time applications.", 0xB),
        "AI_TEXTURETYPE_UNKNOWN".enum("Unknown texture. A texture reference that does not match any of the definitions above is considered to be 'unknown'. It is still imported, but is excluded from any further postprocessing.", 0xC)
    )

    EnumConstant(
        """
        Defines all shading models supported by the library

        The list of shading modes has been taken from Blender.
        See Blender documentation for more information. The API does
        not distinguish between "specular" and "diffuse" shaders (thus the
        specular term for diffuse shading models like Oren-Nayar remains
        undefined).

        Again, this value is just a hint. Assimp tries to select the shader whose
        most common implementation matches the original rendering results of the
        3D modeller which wrote a particular model as closely as possible.
        """,

        "AI_SHADINGMODE_FLAT".enum("Flat shading. Shading is done on per-face base, diffuse only. Also known as 'faceted shading'.", 0x1),
        "AI_SHADINGMODE_GOURAUD".enum("Simple Gouraud shading.", 0x2),
        "AI_SHADINGMODE_PHONG".enum("Phong-Shading", 0x3),
        "AI_SHADINGMODE_BLINN".enum("Phong-Blinn-Shading", 0x4),
        "AI_SHADINGMODE_TOON".enum("Toon-Shading per pixel. Also known as 'comic' shader.", 0x5),
        "AI_SHADINGMODE_ORENNAYAR".enum("OrenNayar-Shading per pixel. Extension to standard Lambertian shading, taking the roughness of the material into account", 0x6),
        "AI_SHADINGMODE_MINNAERT".enum("Minnaert-Shading per pixel. Extension to standard Lambertian shading, taking the 'darkness' of the material into account", 0x7),
        "AI_SHADINGMODE_COOKTORRANCE".enum("CookTorrance-Shading per pixel. Special shader for metallic surfaces.", 0x8),
        "AI_SHADINGMODE_NOSHADING".enum("No shading at all. Constant light influence of 1.0.", 0x9),
        "AI_SHADINGMODE_FRESNEL".enum("Fresnel shading", 0xa)
    )

    EnumConstant(
        """
        Defines some mixed flags for a particular texture.

        Usually you'll instruct your cg artists how textures have to look like ...
        and how they will be processed in your application. However, if you use
        Assimp for completely generic loading purposes you might also need to
        process these flags in order to display as many 'unknown' 3D models as
        possible correctly.

        This corresponds to the #AI_MATKEY_TEXFLAGS property.
        """,

        "AI_TEXTUREFLAGS_INVERT".enum("The texture's color values have to be inverted (componentwise 1-n)", 0x1),
        "AI_TEXTUREFLAGS_USEALPHA".enum("Explicit request to the application to process the alpha channel of the texture. Mutually exclusive with #aiTextureFlags_IgnoreAlpha. These flags are set if the library can say for sure that the alpha channel is used/is not used. If the model format does not define this, it is left to the application to decide whether the texture alpha channel - if any - is evaluated or not.", 0x2),
        "AI_TEXTUREFLAGS_IGNOREALPHA".enum("Explicit request to the application to ignore the alpha channel of the texture. Mutually exclusive with #AI_TEXTUREFLAGS_USEALPHA.", 0x2)
    )

    EnumConstant(
        """
        Defines alpha-blend flags.

        If you're familiar with OpenGL or D3D, these flags aren't new to you.
        They define *how* the final color value of a pixel is computed, basing
        on the previous color at that pixel and the new color value from the
        material.
        """,

        "AI_BLENDMODE_DEFAULT".enum("SourceColor*SourceAlpha + DestColor*(1-SourceAlpha)", 0x0),
        "AI_BLENDMODE_ADDITIVE".enum("SourceColor*1 + DestColor*1", 0x1)
    )

    EnumConstant(
        "A very primitive RTTI system for the contents of material properties.",

        "AI_PTI_FLOAT".enum("Array of single-precision (32 Bit) floats", 0x1),
        "AI_PTI_STRING".enum("The material property is an aiString.", 0x3),
        "AI_PTI_INTEGER".enum("Array of (32 Bit) integers", 0x4),
        "AI_PTI_BUFFER".enum("Simple binary buffer, content undefined. Not convertible to anything.", 0x5)
    )

    EnumConstant(
        """
        Defines how an animation channel behaves outside the defined time
        range. This corresponds to aiNodeAnim::mPreState and
        aiNodeAnim::mPostState.
        """,

        "AI_ANIMBEHAVIOUR_DEFAULT".enum("The value from the default node transformation is taken", 0x0),
        "AI_ANIMBEHAVIOUR_CONSTANT".enum("The nearest key value is used without interpolation", 0x1),
        "AI_ANIMBEHAVIOUR_LINEAR".enum("The value of the nearest two keys is linearly extrapolated for the current time value.", 0x2),
        "AI_ANIMBEHAVIOUR_REPEAT".enum("The animation is repeated. If the animation key go from n to m and the current time is t, use the value at (t-n) % (|m-n|).", 0x3)
    )

    EnumConstant(
        """
        Enumerates all supported types of light sources.
        """,

        "AI_LIGHTSOURCE_UNDEFINED".enum("Undefined or unknown light source", 0x0),
        "AI_LIGHTSOURCE_DIRECTIONAL".enum("A directional light source has a well-defined direction but is infinitely far away. That's quite a good approximation for sun light.", 0x1),
        "AI_LIGHTSOURCE_POINT".enum("A point light source has a well-defined position in space but no direction - it emits light in all directions. A normal bulb is a point light.", 0x2),
        "AI_LIGHTSOURCE_SPOT".enum("A spot light source emits light in a specific angle. It has a position and a direction it is pointing to. A good example for a spot light is a light spot in sport arenas.", 0x3),
        "AI_LIGHTSOURCE_AMBIENT".enum("The generic light level of the world, including the bounces of all other light sources. Typically, there's at most one ambient light in a scene. This light type doesn't have a valid position, direction, or other properties, just a color.", 0x4),
        "AI_LIGHTSOURCE_AREA".enum("An area light is a rectangle with predefined size that uniformly emits light from one of its sides. The position is center of the rectangle and direction is its normal vector.", 0x5)
    )

    EnumConstant(
        """
        Defines the flags for all possible post processing steps.
        """,

        "AI_PROCESS_CALC_TANGENT_SPACE".enum(
            """
            Calculates the tangents and bitangents for the imported meshes.

            Does nothing if a mesh does not have normals. You might want this post
            processing step to be executed if you plan to use tangent space calculations
            such as normal mapping  applied to the meshes. There's an importer property,
            <tt>#AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE</tt>, which allows you to specify
            a maximum smoothing angle for the algorithm. However, usually you'll
            want to leave it at the default value.
            """,
            0x1
        ),

        "AI_PROCESS_JOIN_IDENTICAL_VERTICES".enum(
            """
            Identifies and joins identical vertex data sets within all
            imported meshes.

            After this step is run, each mesh contains unique vertices,
            so a vertex may be used by multiple faces. You usually want
            to use this post processing step. If your application deals with
            indexed geometry, this step is compulsory or you'll just waste rendering
            time. <b>If this flag is not specified</b>, no vertices are referenced by
            more than one face and <b>no index buffer is required</b> for rendering.
            """,
            0x2
        ),

        "AI_PROCESS_MAKE_LEFT_HANDED".enum(
            """
            Converts all the imported data to a left-handed coordinate space.

            By default the data is returned in a right-handed coordinate space (which
            OpenGL prefers). In this space, +X points to the right,
            +Z points towards the viewer, and +Y points upwards. In the DirectX
            coordinate space +X points to the right, +Y points upwards, and +Z points
            away from the viewer.

            You'll probably want to consider this flag if you use Direct3D for
            rendering. The #aiProcess_ConvertToLeftHanded flag supersedes this
            setting and bundles all conversions typically required for D3D-based
            applications.
            """,
            0x4
        ),

        "AI_PROCESS_TRIANGULATE".enum(
            """
            Triangulates all faces of all meshes.

            By default the imported mesh data might contain faces with more than 3
            indices. For rendering you'll usually want all faces to be triangles.
            This post processing step splits up faces with more than 3 indices into
            triangles. Line and point primitives are *not* modified! If you want
            'triangles only' with no other kinds of primitives, try the following
            solution:

            <ul>
            <li>Specify both #aiProcess_Triangulate and #aiProcess_SortByPType </li>
            <li>Ignore all point and line meshes when you process assimp's output</li>
            </ul>
            """,
            0x8
        ),

        "AI_PROCESS_REMOVE_COMPONENT".enum(
            """
            Removes some parts of the data structure (animations, materials,
            light sources, cameras, textures, vertex components).

            The  components to be removed are specified in a separate
            importer property, <tt>#AI_CONFIG_PP_RVC_FLAGS</tt>. This is quite useful
            if you don't need all parts of the output structure. Vertex colors
            are rarely used today for example... Calling this step to remove unneeded
            data from the pipeline as early as possible results in increased
            performance and a more optimized output data structure.
            This step is also useful if you want to force Assimp to recompute
            normals or tangents. The corresponding steps don't recompute them if
            they're already there (loaded from the source asset). By using this
            step you can make sure they are NOT there.

            This flag is a poor one, mainly because its purpose is usually
            misunderstood. Consider the following case: a 3D model has been exported
            from a CAD app, and it has per-face vertex colors. Vertex positions can't be
            shared, thus the #aiProcess_JoinIdenticalVertices step fails to
            optimize the data because of these nasty little vertex colors.
            Most apps don't even process them, so it's all for nothing. By using
            this step, unneeded components are excluded as early as possible
            thus opening more room for internal optimizations.
            """,
            0x10
        ),

        "AI_PROCESS_GEN_NORMALS".enum(
            """
            Generates normals for all faces of all meshes.

            This is ignored if normals are already there at the time this flag
            is evaluated. Model importers try to load them from the source file, so
            they're usually already there. Face normals are shared between all points
            of a single face, so a single point can have multiple normals, which
            forces the library to duplicate vertices in some cases.
            #aiProcess_JoinIdenticalVertices is *senseless* then.

            This flag may not be specified together with #aiProcess_GenSmoothNormals.
            """,
            0x20
        ),

        "AI_PROCESS_GEN_SMOOTH_NORMALS".enum(
            """
            Generates smooth normals for all vertices in the mesh.

            This is ignored if normals are already there at the time this flag
            is evaluated. Model importers try to load them from the source file, so
            they're usually already there.

            This flag may not be specified together with
            #aiProcess_GenNormals. There's a importer property,
            <tt>#AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE</tt> which allows you to specify
            an angle maximum for the normal smoothing algorithm. Normals exceeding
            this limit are not smoothed, resulting in a 'hard' seam between two faces.
            Using a decent angle here (e.g. 80 degrees) results in very good visual
            appearance.
            """,
            0x40
        ),

        "AI_PROCESS_SPLIT_LARGE_MESHES".enum(
            """
            Splits large meshes into smaller sub-meshes.

            This is quite useful for real-time rendering, where the number of triangles
            which can be maximally processed in a single draw-call is limited
            by the video driver/hardware. The maximum vertex buffer is usually limited
            too. Both requirements can be met with this step: you may specify both a
            triangle and vertex limit for a single mesh.

            The split limits can (and should!) be set through the
            <tt>#AI_CONFIG_PP_SLM_VERTEX_LIMIT</tt> and <tt>#AI_CONFIG_PP_SLM_TRIANGLE_LIMIT</tt>
            importer properties. The default values are <tt>#AI_SLM_DEFAULT_MAX_VERTICES</tt> and
            <tt>#AI_SLM_DEFAULT_MAX_TRIANGLES</tt>.

            Note that splitting is generally a time-consuming task, but only if there's
            something to split. The use of this step is recommended for most users.
            """,
            0x80
        ),

        "AI_PROCESS_PRE_TRANSFORM_VERTICES".enum(
            """
            Removes the node graph and pre-transforms all vertices with
            the local transformation matrices of their nodes.

            The output scene still contains nodes, however there is only a
            root node with children, each one referencing only one mesh,
            and each mesh referencing one material. For rendering, you can
            simply render all meshes in order - you don't need to pay
            attention to local transformations and the node hierarchy.
            Animations are removed during this step.

            This step is intended for applications without a scenegraph.
            The step CAN cause some problems: if e.g. a mesh of the asset
            contains normals and another, using the same material index, does not,
            they will be brought together, but the first meshes's part of
            the normal list is zeroed. However, these artifacts are rare.

            <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>

            The <tt>#AI_CONFIG_PP_PTV_NORMALIZE</tt> configuration property
            can be set to normalize the scene's spatial dimension to the -1...1
            range.
            </div>
            """,
            0x100
        ),

        "AI_PROCESS_LIMIT_BONE_WEIGHTS".enum(
            """
            Limits the number of bones simultaneously affecting a single vertex
            to a maximum value.

            If any vertex is affected by more than the maximum number of bones, the least
            important vertex weights are removed and the remaining vertex weights are
            renormalized so that the weights still sum up to 1.
            The default bone weight limit is 4 (defined as <tt>#AI_LMW_MAX_WEIGHTS</tt> in
            config.h), but you can use the <tt>#AI_CONFIG_PP_LBW_MAX_WEIGHTS</tt> importer
            property to supply your own limit to the post processing step.

            If you intend to perform the skinning in hardware, this post processing
            step might be of interest to you.
            """,
            0x200
        ),

        "AI_PROCESS_VALIDATE_DATASTRUCTURE".enum(
            """
            Validates the imported scene data structure.
            This makes sure that all indices are valid, all animations and
            bones are linked correctly, all material references are correct .. etc.

            It is recommended that you capture Assimp's log output if you use this flag,
            so you can easily find out what's wrong if a file fails the
            validation. The validator is quite strict and will find *all*
            inconsistencies in the data structure... It is recommended that plugin
            developers use it to debug their loaders. There are two types of
            validation failures:

            <ul>
            <li>Error: There's something wrong with the imported data. Further
            postprocessing is not possible and the data is not usable at all.
            The import fails. #aiGetErrorString()
            carry the error message around.</li>
            <li>Warning: There are some minor issues (e.g. 1000000 animation
            keyframes with the same time), but further postprocessing and use
            of the data structure is still safe. Warning details are written
            to the log file, <tt>#AI_SCENE_FLAGS_VALIDATION_WARNING</tt> is set
            in #aiScene::mFlags</li>
            </ul>

            This post-processing step is not time-consuming. Its use is not
            compulsory, but recommended.
            """,
            0x400
        ),

        "AI_PROCESS_IMPROVE_CACHE_LOCALITY".enum(
            """
            Reorders triangles for better vertex cache locality.

            The step tries to improve the ACMR (average post-transform vertex cache
            miss ratio) for all meshes. The implementation runs in O(n) and is
            roughly based on the 'tipsify' algorithm (see <a href="
            http://www.cs.princeton.edu/gfx/pubs/Sander_2007_%3ETR/tipsy.pdf">this
            paper</a>).

            If you intend to render huge models in hardware, this step might
            be of interest to you. The <tt>#AI_CONFIG_PP_ICL_PTCACHE_SIZE</tt>
            importer property can be used to fine-tune the cache optimization.
            """,
            0x800
        ),

        "AI_PROCESS_REMOVE_REDUNDANT_MATERIALS".enum(
            """
            Searches for redundant/unreferenced materials and removes them.

            This is especially useful in combination with the
            #aiProcess_PreTransformVertices and #aiProcess_OptimizeMeshes flags.
            Both join small meshes with equal characteristics, but they can't do
            their work if two meshes have different materials. Because several
            material settings are lost during Assimp's import filters,
            (and because many exporters don't check for redundant materials), huge
            models often have materials which are are defined several times with
            exactly the same settings.

            Several material settings not contributing to the final appearance of
            a surface are ignored in all comparisons (e.g. the material name).
            So, if you're passing additional information through the
            content pipeline (probably using *magic* material names), don't
            specify this flag. Alternatively take a look at the
            <tt>#AI_CONFIG_PP_RRM_EXCLUDE_LIST</tt> importer property.
            """,
            0x1000
        ),

        "AI_PROCESS_FIX_INFACING_NORMALS".enum(
            """
            This step tries to determine which meshes have normal vectors
            that are facing inwards and inverts them.

            The algorithm is simple but effective:
            the bounding box of all vertices + their normals is compared against
            the volume of the bounding box of all vertices without their normals.
            This works well for most objects, problems might occur with planar
            surfaces. However, the step tries to filter such cases.
            The step inverts all in-facing normals. Generally it is recommended
            to enable this step, although the result is not always correct.
            """,
            0x2000
        ),

        "AI_PROCESS_SORT_BY_PTYPE".enum(
            """
            This step splits meshes with more than one primitive type in
            homogeneous sub-meshes.

            The step is executed after the triangulation step. After the step
            returns, just one bit is set in aiMesh::mPrimitiveTypes. This is
            especially useful for real-time rendering where point and line
            primitives are often ignored or rendered separately.
            You can use the <tt>#AI_CONFIG_PP_SBP_REMOVE</tt> importer property to
            specify which primitive types you need. This can be used to easily
            exclude lines and points, which are rarely used, from the import.
            """,
            0x8000
        ),

        "AI_PROCESS_FIND_DEGENERATES".enum(
            """
            This step searches all meshes for degenerate primitives and
            converts them to proper lines or points.

            A face is 'degenerate' if one or more of its points are identical.
            To have the degenerate stuff not only detected and collapsed but
            removed, try one of the following procedures:

            <b>1.</b> (if you support lines and points for rendering but don't
            want the degenerates)

            <ul>
            <li>Specify the #aiProcess_FindDegenerates flag.
            </li>
            <li>Set the <tt>#AI_CONFIG_PP_FD_REMOVE</tt> importer property to
            1. This will cause the step to remove degenerate triangles from the
            import as soon as they're detected. They won't pass any further
            pipeline steps.
            </li>
            </ul>

            <b>2.</b>(if you don't support lines and points at all)

            <ul>
            <li>Specify the #aiProcess_FindDegenerates flag.
            </li>
            <li>Specify the #aiProcess_SortByPType flag. This moves line and
            point primitives to separate meshes.
            </li>
            <li>Set the <tt>#AI_CONFIG_PP_SBP_REMOVE</tt> importer property to
            {@code AI_PRIMITIVETYPE_POINTS | AI_PRIMITIVETYPE_LINES}
            to cause SortByPType to reject point and line meshes from the scene.
            </li>
            </ul>

            <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>

            Degenerate polygons are not necessarily evil and that's why
            they're not removed by default. There are several file formats which
            don't support lines or points, and some exporters bypass the
            format specification and write them as degenerate triangles instead.</div>
            """,
            0x10000
        ),

        "AI_PROCESS_FIND_INVALID_DATA".enum(
            """
            This step searches all meshes for invalid data, such as zeroed
            normal vectors or invalid UV coords and removes/fixes them. This is
            intended to get rid of some common exporter errors.

            This is especially useful for normals. If they are invalid, and
            the step recognizes this, they will be removed and can later
            be recomputed, i.e. by the #aiProcess_GenSmoothNormals flag.<br>
            The step will also remove meshes that are infinitely small and reduce
            animation tracks consisting of hundreds if redundant keys to a single
            key. The <tt>AI_CONFIG_PP_FID_ANIM_ACCURACY</tt> config property decides
            the accuracy of the check for duplicate animation tracks.
            """,
            0x20000
        ),

        "AI_PROCESS_GEN_UV_COORDS".enum(
            """
            This step converts non-UV mappings (such as spherical or
            cylindrical mapping) to proper texture coordinate channels.

            Most applications will support UV mapping only, so you will
            probably want to specify this step in every case. Note that Assimp is not
            always able to match the original mapping implementation of the
            3D app which produced a model perfectly. It's always better to let the
            modelling app compute the UV channels - 3ds max, Maya, Blender,
            LightWave, and Modo do this for example.

            @note If this step is not requested, you'll need to process the
            <tt>#AI_MATKEY_MAPPING</tt> material property in order to display all assets
            properly.
            """,
            0x40000
        ),

        "AI_PROCESS_TRANSFORM_UV_COORDS".enum(
            """
            This step applies per-texture UV transformations and bakes
            them into stand-alone vtexture coordinate channels.

            UV transformations are specified per-texture - see the
            <tt>#AI_MATKEY_UVTRANSFORM</tt> material key for more information.
            This step processes all textures with
            transformed input UV coordinates and generates a new (pre-transformed) UV channel
            which replaces the old channel. Most applications won't support UV
            transformations, so you will probably want to specify this step.

            <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>

            UV transformations are usually implemented in real-time apps by
            transforming texture coordinates at vertex shader stage with a 3x3
            (homogenous) transformation matrix.</div>
            """,
            0x80000
        ),

        "AI_PROCESS_FIND_INSTANCES".enum(
            """
            This step searches for duplicate meshes and replaces them
            with references to the first mesh.

            This step takes a while, so don't use it if speed is a concern.
            Its main purpose is to workaround the fact that many export
            file formats don't support instanced meshes, so exporters need to
            duplicate meshes. This step removes the duplicates again. Please
            note that Assimp does not currently support per-node material
            assignment to meshes, which means that identical meshes with
            different materials are currently *not* joined, although this is
            planned for future versions.
            """,
            0x100000
        ),

        "AI_PROCESS_OPTIMIZE_MESHES".enum(
            """
            A postprocessing step to reduce the number of meshes.

            This will, in fact, reduce the number of draw calls.

            This is a very effective optimization and is recommended to be used
            together with #aiProcess_OptimizeGraph, if possible. The flag is fully
            compatible with both #aiProcess_SplitLargeMeshes and #aiProcess_SortByPType.
            """,
            0x200000
        ),

        "AI_PROCESS_OPTIMIZE_GRAPH".enum(
            """
            A postprocessing step to optimize the scene hierarchy.

            Nodes without animations, bones, lights or cameras assigned are
            collapsed and joined.

            Node names can be lost during this step. If you use special 'tag nodes'
            to pass additional information through your content pipeline, use the
            <tt>#AI_CONFIG_PP_OG_EXCLUDE_LIST</tt> importer property to specify a
            list of node names you want to be kept. Nodes matching one of the names
            in this list won't be touched or modified.

            Use this flag with caution. Most simple files will be collapsed to a
            single node, so complex hierarchies are usually completely lost. This is not
            useful for editor environments, but probably a very effective
            optimization if you just want to get the model data, convert it to your
            own format, and render it as fast as possible.

            This flag is designed to be used with #aiProcess_OptimizeMeshes for best
            results.

            <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>

            'Crappy' scenes with thousands of extremely small meshes packed
            in deeply nested nodes exist for almost all file formats.
            #aiProcess_OptimizeMeshes in combination with #aiProcess_OptimizeGraph
            usually fixes them all and makes them renderable.</div>
            """,
            0x400000
        ),

        "AI_PROCESS_FLIP_UVS".enum(
            """
            This step flips all UV coordinates along the y-axis and adjusts
            material settings and bitangents accordingly.

            <b>Output UV coordinate system:</b>

            <pre>

            </pre>

            ${codeBlock("""
0y|0y ---------- 1x|0y
  |                |
  |                |
  |                |
0x|1y ---------- 1x|1y
            """)}

            You'll probably want to consider this flag if you use Direct3D for
            rendering. The #aiProcess_ConvertToLeftHanded flag supersedes this
            setting and bundles all conversions typically required for D3D-based
            applications.
            """,
            0x800000
        ),

        "AI_PROCESS_FLIP_WINDING_ORDER".enum(
            """
            This step adjusts the output face winding order to be CW.

            The default face winding order is counter clockwise (CCW).

            <b>Output face order:</b>

            ${codeBlock("""
    x2

                  x0
x1
            """)}
            """,
            0x1000000
        ),

        "AI_PROCESS_SPLIT_BY_BONE_COUNT".enum(
            """
            This step splits meshes with many bones into sub-meshes so that each
            su-bmesh has fewer or as many bones as a given limit.
            """,
            0x2000000
        ),

        "AI_PROCESS_DEBONE".enum(
            """
            This step removes bones losslessly or according to some threshold.

            In some cases (i.e. formats that require it) exporters are forced to
            assign dummy bone weights to otherwise static meshes assigned to
            animated meshes. Full, weight-based skinning is expensive while
            animating nodes is extremely cheap, so this step is offered to clean up
            the data in that regard.

            Use <tt>#AI_CONFIG_PP_DB_THRESHOLD</tt> to control this.
            Use <tt>#AI_CONFIG_PP_DB_ALL_OR_NONE</tt> if you want bones removed if and
            only if all bones within the scene qualify for removal.
            """,
            0x4000000
        )
    )

    EnumConstant(
        """
        Enumerates components of the aiScene and aiMesh data structures
        that can be excluded from the import using the #AI_PROCESS_REMOVE_COMPONENT step.

        See the documentation to #AI_PROCESS_REMOVE_COMPONENT for more details.
        """,

        "AI_COMPONENT_NORMALS".enum("Normal vectors", 0x2),
        "AI_COMPONENT_TANGENTS_AND_BITANGENTS".enum("Tangents and bitangents go always together", 0x4),

        "AI_COMPONENT_COLORS".enum(
            """
            ALL color sets.
            Use {@code AI_COMPONENT_COLOR_N(N)} to specify the N'th set.
            """,
            0x8
        ),

        "AI_COMPONENT_TEXCOORDS".enum(
            """
            ALL texture UV sets.
            Use {@code AI_COMPONENT_TEXCOORD_N(N)} to specify the N'th set.
            """,
            0x10
        ),

        "AI_COMPONENT_BONEWEIGHTS".enum(
            """
            Removes all bone weights from all meshes.
            The scenegraph nodes corresponding to the bones are NOT removed.
            use the #AI_PROCESS_OPTIMIZE_GRAPH step to do this.
            """,
            0x20
        ),

        "AI_COMPONENT_ANIMATIONS".enum(
            """
            Removes all node animations (AIScene.mAnimations).
            The corresponding scenegraph nodes are NOT removed.
            use the #AI_PROCESS_OPTIMIZE_GRAPH step to do this.
            """,
            0x40
        ),

        "AI_COMPONENT_TEXTURES".enum("Removes all embedded textures", 0x80),

        "AI_COMPONENT_LIGHTS".enum(
            """
            Removes all light sources (aiScene::mLights).
            The corresponding scenegraph nodes are NOT removed.
            use the #AI_PROCESS_OPTIMIZE_GRAPH step to do this
            """,
            0x100
        ),

        "AI_COMPONENT_CAMERAS".enum(
            """
            Removes all cameras (aiScene::mCameras).
            The corresponding scenegraph nodes are NOT removed.
            use the #AI_PROCESS_OPTIMIZE_GRAPH step to do this
            """,
            0x200
        ),

        "AI_COMPONENT_MESHES".enum("Removes all meshes (aiScene::mMeshes).", 0x400),

        "AI_COMPONENT_MATERIALS".enum(
            """
            Removes all materials. One default material will
            be generated, so aiScene::mNumMaterials will be 1.
            """,
            0x800
        )
    )

    StringConstant(
        "Name for default materials (2nd is used if meshes have UV coords)",
        "AI_DEFAULT_MATERIAL_NAME".."DefaultMaterial"
    )

    IntConstant(
        "Assimp was compiled as a shared object (Windows: DLL)",
        "ASSIMP_CFLAGS_SHARED"..0x1
    )

    IntConstant(
        "Assimp was compiled against STLport",
        "ASSIMP_CFLAGS_STLPORT"..0x2
    )

    IntConstant(
        "Assimp was compiled as a debug build",
        "ASSIMP_CFLAGS_DEBUG"..0x4
    )

    IntConstant(
        "Assimp was compiled with ASSIMP_BUILD_BOOST_WORKAROUND defined",
        "ASSIMP_CFLAGS_NOBOOST"..0x8
    )

    IntConstant(
        "Assimp was compiled with ASSIMP_BUILD_SINGLETHREADED defined",
        "ASSIMP_CFLAGS_SINGLETHREADED"..0x10
    )

    IntConstant(
        """
        Specifies that the scene data structure that was imported is not complete.
        This flag bypasses some internal validations and allows the import
        of animation skeletons, material libraries or camera animation paths
        using Assimp. Most applications won't support such data.
        """,
        "AI_SCENE_FLAGS_INCOMPLETE"..0x1
    )

    IntConstant(
        """
        This flag is set by the validation postprocess-step (aiPostProcess_ValidateDS)
        if the validation is successful. In a validated scene you can be sure that
        any cross references in the data structure (e.g. vertex indices) are valid.
        """,
        "AI_SCENE_FLAGS_VALIDATED"..0x2
    )

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
    )

    IntConstant(
        """
        This flag is currently only set by the aiProcess_JoinIdenticalVertices step.
        It indicates that the vertices of the output meshes aren't in the internal
        verbose format anymore. In the verbose format all vertices are unique,
        no vertex is ever referenced by more than one face.
        """,
        "AI_SCENE_FLAGS_NON_VERBOSE_FORMAT"..0x8
    )

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
    )

    IntConstant(
        "Maximum number of indices per face (polygon).",
        "AI_MAX_FACE_INDICES"..0x7fff
    )

    IntConstant(
        "Maximum number of indices per face (polygon).",
        "AI_MAX_BONE_WEIGHTS"..0x7fffffff
    )

    IntConstant(
        "Maximum number of vertices per mesh.",
        "AI_MAX_VERTICES"..0x7fffffff
    )

    IntConstant(
        "Maximum number of faces per mesh.",
        "AI_MAX_FACES"..0x7fffffff
    )

    IntConstant(
        "Supported number of vertex color sets per mesh.",
        "AI_MAX_NUMBER_OF_COLOR_SETS"..0x8
    )

    IntConstant(
        "Supported number of texture coord sets (UV(W) channels) per mesh.",
        "AI_MAX_NUMBER_OF_TEXTURECOORDS"..0x8
    )

    DoubleConstant(
        "This is PI. Hi PI.",
        "AI_MATH_PI"..3.141592653589793238462643383279,
        "AI_MATH_TWO_PI".."AI_MATH_PI * 2.0",
        "AI_MATH_HALF_PI".."AI_MATH_PI * 0.5"
    )

    FloatConstant(
        "This is PI. Hi PI.",
        "AI_MATH_PI_F"..3.1415926538f,
        "AI_MATH_TWO_PI_F".."AI_MATH_PI_F * 2f",
        "AI_MATH_HALF_PI_F".."AI_MATH_PI_F * 0f"
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
    )

    StringConstant(
        "Configuration keys",

        "AI_CONFIG_PP_RVC_FLAGS".."PP_RVC_FLAGS",
        "AI_CONFIG_PP_SBP_REMOVE".."PP_SBP_REMOVE",
        "AI_CONFIG_PP_FID_ANIM_ACCURACY".."PP_FID_ANIM_ACCURACY",
        "AI_CONFIG_PP_TUV_EVALUATE".."PP_TUV_EVALUATE",
        "AI_CONFIG_FAVOUR_SPEED".."FAVOUR_SPEED",
        "AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS".."IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS",
        "AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS".."IMPORT_FBX_READ_ALL_MATERIALS",

        "AI_CONFIG_IMPORT_FBX_READ_MATERIALS".."IMPORT_FBX_READ_MATERIALS",
        "AI_CONFIG_IMPORT_FBX_READ_TEXTURES".."IMPORT_FBX_READ_TEXTURES",
        "AI_CONFIG_IMPORT_FBX_READ_CAMERAS".."IMPORT_FBX_READ_CAMERAS",
        "AI_CONFIG_IMPORT_FBX_READ_LIGHTS".."IMPORT_FBX_READ_LIGHTS",
        "AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS".."IMPORT_FBX_READ_ANIMATIONS",
        "AI_CONFIG_IMPORT_FBX_STRICT_MODE".."IMPORT_FBX_STRICT_MODE",
        "AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS".."IMPORT_FBX_PRESERVE_PIVOTS",
        "AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES".."IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES",
        "AI_CONFIG_IMPORT_GLOBAL_KEYFRAME".."IMPORT_GLOBAL_KEYFRAME",
        "AI_CONFIG_IMPORT_MD3_KEYFRAME".."IMPORT_MD3_KEYFRAME",
        "AI_CONFIG_IMPORT_MD2_KEYFRAME".."IMPORT_MD2_KEYFRAME",
        "AI_CONFIG_IMPORT_MDL_KEYFRAME".."IMPORT_MDL_KEYFRAME",
        "AI_CONFIG_IMPORT_MDC_KEYFRAME".."IMPORT_MDC_KEYFRAME",
        "AI_CONFIG_IMPORT_SMD_KEYFRAME".."IMPORT_SMD_KEYFRAME",
        "AI_CONFIG_IMPORT_UNREAL_KEYFRAME".."IMPORT_UNREAL_KEYFRAME",
        "AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL".."IMPORT_AC_SEPARATE_BFCULL",
        "AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION".."IMPORT_AC_EVAL_SUBDIVISION",
        "AI_CONFIG_UNREAL_HANDLE_FLAGS".."UNREAL_HANDLE_FLAGS",
        "AI_CONFIG_IMPORT_TER_MAKE_UVS".."IMPORT_TER_MAKE_UVS",
        "AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS".."IMPORT_ASE_RECONSTRUCT_NORMALS",
        "AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART".."IMPORT_MD3_HANDLE_MULTIPART",
        "AI_CONFIG_IMPORT_MD3_SKIN_NAME".."IMPORT_MD3_SKIN_NAME",
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
        "AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION".."IMPORT_COLLADA_IGNORE_UP_DIRECTION",
        "AI_CONFIG_EXPORT_XFILE_64BIT".."EXPORT_XFILE_64BIT",

       "AI_CONFIG_PP_ICL_PTCACHE_SIZE".."PP_ICL_PTCACHE_SIZE",
       "AI_CONFIG_PP_DB_ALL_OR_NONE".."PP_DB_ALL_OR_NONE",
       "AI_CONFIG_PP_DB_THRESHOLD".."PP_DB_THRESHOLD",
       "AI_CONFIG_PP_LBW_MAX_WEIGHTS".."PP_LBW_MAX_WEIGHTS",
       "AI_CONFIG_PP_SLM_VERTEX_LIMIT".."PP_SLM_VERTEX_LIMIT",
       "AI_CONFIG_PP_SLM_TRIANGLE_LIMIT".."PP_SLM_TRIANGLE_LIMIT",
       "AI_CONFIG_PP_OG_EXCLUDE_LIST".."PP_OG_EXCLUDE_LIST",
       "AI_CONFIG_PP_FD_REMOVE".."PP_FD_REMOVE",
       "AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION".."PP_PTV_ROOT_TRANSFORMATION",
       "AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION".."PP_PTV_ADD_ROOT_TRANSFORMATION",
       "AI_CONFIG_PP_PTV_NORMALIZE".."PP_PTV_NORMALIZE",
       "AI_CONFIG_PP_PTV_KEEP_HIERARCHY".."PP_PTV_KEEP_HIERARCHY",
       "AI_CONFIG_PP_RRM_EXCLUDE_LIST".."PP_RRM_EXCLUDE_LIST",
       "AI_CONFIG_IMPORT_MDL_COLORMAP".."IMPORT_MDL_COLORMAP",
       "AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE".."PP_GSN_MAX_SMOOTHING_ANGLE",
       "AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX".."PP_CT_TEXTURE_CHANNEL_INDEX",
       "AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE".."PP_CT_MAX_SMOOTHING_ANGLE",
       "AI_CONFIG_PP_SBBC_MAX_BONES".."PP_SBBC_MAX_BONES",
       "AI_CONFIG_IMPORT_NO_SKELETON_MESHES".."IMPORT_NO_SKELETON_MESHES",
       "AI_CONFIG_GLOB_MEASURE_TIME".."GLOB_MEASURE_TIME"
    )

    IntConstant(
        "Default values for configuration properties",

        "AI_SBBC_DEFAULT_MAX_BONES"..60,
        "AI_SLM_DEFAULT_MAX_TRIANGLES"..1000000,
        "AI_SLM_DEFAULT_MAX_VERTICES"..1000000,
        "AI_LMW_MAX_WEIGHTS"..0x4,
        "PP_ICL_PTCACHE_SIZE"..12
    )

    FloatConstant(
        "Default values for the #AI_CONFIG_PP_DB_THRESHOLD",
        "AI_DEBONE_THRESHOLD"..1.0f
    )

    IntConstant(
        "UVCoord Transforms",

        "AI_UVTRAFO_SCALING"..0x1,
        "AI_UVTRAFO_ROTATION"..0x2,
        "AI_UVTRAFO_TRANSLATION"..0x4,
        "AI_UVTRAFO_ALL".."(AI_UVTRAFO_SCALING | AI_UVTRAFO_ROTATION | AI_UVTRAFO_TRANSLATION)"
    )

    IntConstant(
        "AI_PROCESS Presets",

        "AI_PROCESSPRESET_TARGET_REALTIME_FAST".."""
            AI_PROCESS_CALC_TANGENT_SPACE      |
            AI_PROCESS_GEN_NORMALS             |
            AI_PROCESS_JOIN_IDENTICAL_VERTICES |
            AI_PROCESS_TRIANGULATE             |
            AI_PROCESS_GEN_UV_COORDS           |
            AI_PROCESS_SORT_BY_PTYPE           |
            0
        """,

        "AI_PROCESSPRESET_TARGET_REALTIME_QUALITY".."""
            AI_PROCESS_CALC_TANGENT_SPACE         |
            AI_PROCESS_GEN_SMOOTH_NORMALS         |
            AI_PROCESS_JOIN_IDENTICAL_VERTICES    |
            AI_PROCESS_IMPROVE_CACHE_LOCALITY     |
            AI_PROCESS_LIMIT_BONE_WEIGHTS         |
            AI_PROCESS_REMOVE_REDUNDANT_MATERIALS |
            AI_PROCESS_SPLIT_LARGE_MESHES         |
            AI_PROCESS_TRIANGULATE                |
            AI_PROCESS_GEN_UV_COORDS              |
            AI_PROCESS_SORT_BY_PTYPE              |
            AI_PROCESS_FIND_DEGENERATES           |
            AI_PROCESS_FIND_INVALID_DATA          |
            0
        """,

        "AI_PROCESSPRESET_TARGET_REALTIME_MAXQUALITY".."""
            AI_PROCESSPRESET_TARGET_REALTIME_QUALITY |
            AI_PROCESS_FIND_INSTANCES                |
            AI_PROCESS_VALIDATE_DATASTRUCTURE        |
            AI_PROCESS_OPTIMIZE_MESHES               |
            0
        """
    )

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

    macro(expression = "1 << (n + 20)")..int(
        "AI_COMPONENT_COLORS_N",
        "Remove a specific color channel 'n'",

        int.IN("n", "The color channel"),
        noPrefix = true
    )

    macro(expression = "1 << (n + 25)")..int(
        "AI_COMPONENT_TEXCOORD_N",
        "Remove a specific UV channel 'n'",

        int.IN("n", "The UV channel"),
        noPrefix = true
    )

    unsigned_int(
        "GetCompileFlags",
        """
        Returns assimp's compile flags
        """,

        returnDoc = "Any bitwise combination of the ASSIMP_CFLAGS_xxx constants."
    )

    unsigned_int(
        "GetVersionRevision",
        """
        Returns the repository revision of the Assimp runtime.
        """,

        returnDoc = "SVN Repository revision number of the Assimp runtime the application was linked/built against."
    )

    unsigned_int(
        "GetVersionMajor",
        """
        Returns the current major version number of Assimp.
        """,

        returnDoc = "Major version of the Assimp runtime the application was linked/built against"
    )

    unsigned_int(
        "GetVersionMinor",
        """
        Returns the current minor version number of Assimp.
        """,

        returnDoc = "Minor version of the Assimp runtime the application was linked/built against"
    )

    (const..charASCII_p)(
        "GetLegalString",
        """
        Returns a string with legal copyright and licensing information about Assimp. The string may include
        multiple lines.
        """,

        returnDoc = "A string containing the legal information."
    )

    aiReturn(
        "GetMaterialProperty",
        "Retrieve a material property with a specific key from the material",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        unsigned_int.IN("type", "Specifies the type of the texture to be retrieved (e.g. diffuse, specular, height map ...)"),
        unsigned_int.IN("index", "Index of the texture to be retrieved."),
        Check(1)..aiMaterialProperty_pp.OUT("mPropOut", "Pointer to receive a pointer to a valid aiMaterialProperty structure or NULL if the key has not been found."),

        returnDoc = "AI_RETURN_xxx values."
    )

    macro(expression = "aiGetMaterialProperty(pMat, pKey, 0, 0, mPropOut)")..aiReturn(
        "aiGetMaterialProperty",
        "Retrieve a material property with a specific key from the material",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        Check(1)..aiMaterialProperty_pp.OUT("mPropOut", "Pointer to receive a pointer to a valid aiMaterialProperty structure or NULL if the key has not been found."),

        returnDoc = "AI_RETURN_xxx values.",
        noPrefix = true
    )

    aiReturn(
        "GetMaterialFloatArray",
        "Retrieve an array of float values with a specific key from the material",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        unsigned_int.IN("type", "Specifies the type of the texture to be retrieved (e.g. diffuse, specular, height map ...)"),
        unsigned_int.IN("index", "Index of the texture to be retrieved."),
        float_p.OUT("pOut", "Pointer to a buffer to receive the result."),
        nullable..unsigned_int_p.INOUT("pMax", "Specifies the size of the given buffer, in float's. Receives the number of values (not bytes!) read."),

        returnDoc = "Specifies whether the key has been found. If not, the output arrays remains unmodified and pMax is set to 0."
    )

    macro(expression = "aiGetMaterialFloatArray(pMat, pKey, type, index, pOut, null)")..aiReturn(
        "GetMaterialFloat",
        "Retrieve a single float property with a specific key from the material.",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        unsigned_int.IN("type", "Specifies the type of the texture to be retrieved (e.g. diffuse, specular, height map ...)"),
        unsigned_int.IN("index", "Index of the texture to be retrieved."),
        Check(1)..float_p.OUT("pOut", "Pointer to a buffer to receive the result."),

        returnDoc = "Specifies whether the key has been found. If not, the output float remains unmodified."
    )

    aiReturn(
        "GetMaterialIntegerArray",
        "Retrieve an array of integer values with a specific key from a material.",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        unsigned_int.IN("type", "Specifies the type of the texture to be retrieved (e.g. diffuse, specular, height map ...)"),
        unsigned_int.IN("index", "Index of the texture to be retrieved."),
        int_p.OUT("pOut", "Pointer to a buffer to receive the result."),
        nullable..unsigned_int_p.INOUT("pMax", "Specifies the size of the given buffer, in int's. Receives the number of values (not bytes!) read."),

        returnDoc = "Specifies whether the key has been found. If not, the output arrays remains unmodified and pMax is set to 0."
    )

    macro(expression = "aiGetMaterialIntegerArray(pMat, pKey, type, index, pOut, null)")..aiReturn(
        "GetMaterialInteger",
        "Retrieve a single integer property with a specific key from the material.",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        unsigned_int.IN("type", "Specifies the type of the texture to be retrieved (e.g. diffuse, specular, height map ...)"),
        unsigned_int.IN("index", "Index of the texture to be retrieved."),
        Check(1)..int_p.OUT("pOut", "Pointer to a buffer to receive the result."),

        returnDoc = "Specifies whether the key has been found. If not, the output int remains unmodified."
    )

    aiReturn(
        "GetMaterialColor",
        "Retrieve a color value with a specific key from a material.",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        unsigned_int.IN("type", "Specifies the type of the texture to be retrieved (e.g. diffuse, specular, height map ...)"),
        unsigned_int.IN("index", "Index of the texture to be retrieved."),
        aiColor4D_p.OUT("pOut", "Pointer to a color to receive the result."),

        returnDoc = "Specifies whether the key has been found. If not, the output struct remains unmodified."
    )

    aiReturn(
        "GetMaterialUVTransform",
        "Retrieve a UVTransform value with a specific key from a material.",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        unsigned_int.IN("type", "Specifies the type of the texture to be retrieved (e.g. diffuse, specular, height map ...)"),
        unsigned_int.IN("index", "Index of the texture to be retrieved."),
        aiUVTransform_p.OUT("pOut", "Pointer to a AIUVTransform to receive the result."),

        returnDoc = "Specifies whether the key has been found. If not, the output struct remains unmodified."
    )

    aiReturn(
        "GetMaterialString",
        "Retrieve a string value with a specific key from a material.",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        charASCII_p.IN("pKey", "Key to search for. One of the AI_MATKEY_XXX constants."),
        unsigned_int.IN("type", "Specifies the type of the texture to be retrieved (e.g. diffuse, specular, height map ...)"),
        unsigned_int.IN("index", "Index of the texture to be retrieved."),
        aiString_p.OUT("pOut", "Pointer to a string to receive the result."),

        returnDoc = "Specifies whether the key has been found. If not, the output struct remains unmodified."
    )

    unsigned_int(
        "GetMaterialTextureCount",
        "Get the number of textures for a particular texture type.",

        aiMaterial_p.IN("pMat", "Pointer to the input material. May not be NULL"),
        aiTextureType.IN("type", "Texture type to check for"),

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

        aiMaterial_p.IN("mat", "Pointer to the input material. May not be NULL"),
        aiTextureType.IN("type", "Specifies the texture stack to read from (e.g. diffuse, specular, height map ...)."),
        unsigned_int.IN("index", "Index of the texture. The function fails if the requested index is not available for this texture type."),
        aiString_p.OUT("path", "Receives the output path. This parameter must be non-null."),
        nullable..aiTextureMapping_p.IN("mapping", "The texture mapping mode to be used. Pass NULL if you're not interested in this information."),
        nullable..unsigned_int_p.OUT("uvindex", "For UV-mapped textures: receives the index of the UV source channel. Unmodified otherwise."),
        nullable..float_p.OUT("blend", "Receives the blend factor for the texture. Pass NULL if you're not interested in this information."),
        nullable..aiTextureOp_p.OUT("op", "Receives the texture blend operation to be perform between this texture and the previous texture. Pass NULL if you're not interested in this information."),
        nullable..aiTextureMapMode_p.OUT("mapmode", "Receives the mapping modes to be used for the texture. Pass NULL if you're not interested in this information. Otherwise, pass a pointer to an array of two aiTextureMapMode's (one for each axis, UV order)."),
        nullable..unsigned_int_p.OUT("flags", "Receives the texture flags."),

        returnDoc = "AI_SUCCESS on success, otherwise something else. Have fun."
    )
}
