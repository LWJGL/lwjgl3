/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package assimp

import org.lwjgl.generator.*

val ASSIMP_BINDING = simpleBinding(
    Module.ASSIMP,
    libraryExpression = """Configuration.ASSIMP_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("assimp"))""",
    bundledWithLWJGL = true
)

/*val aiPlane = struct(Binding.ASSIMP, "AIPlane", nativeName = "struct aiPlane") {
    documentation = "Represents a plane in a three-dimensional, euclidean space."

    float("a", "Plane equation")
    float("b", "Plane equation")
    float("c", "Plane equation")
    float("d", "Plane equation")
}*/

val aiVector2D = struct(Module.ASSIMP, "AIVector2D", nativeName = "struct aiVector2D", mutable = false) {
    float("x", "")
    float("y", "")
}

val aiVector3D = struct(Module.ASSIMP, "AIVector3D", nativeName = "struct aiVector3D") {
    float("x", "")
    float("y", "")
    float("z", "")
}

/*val aiRay = struct(Binding.ASSIMP, "AIRay", nativeName = "struct aiRay") {
    documentation = "Represents a ray."

    aiVector3D("pos", "Position of the ray")
    aiVector3D("dir", "Direction of the ray")
}*/

val aiColor3D = struct(Module.ASSIMP, "AIColor3D", nativeName = "struct aiColor3D", mutable = false) {
    documentation = "Represents a color in Red-Green-Blue space."

    float("r", "The red color value")
    float("g", "The green color value")
    float("b", "The blue color value")
}

val aiString = struct(Module.ASSIMP, "AIString", nativeName = "struct aiString") {
    documentation = "Represents an UTF-8 string, zero byte terminated."

    AutoSize("data")..size_t("length", "Binary length of the string excluding the terminal 0.")
    NullTerminatedMember..charUTF8("data", "String buffer.")["Assimp.MAXLEN"]
}

val aiMemoryInfo = struct(Module.ASSIMP, "AIMemoryInfo", nativeName = "struct aiMemoryInfo", mutable = false) {
    documentation = "Stores the memory requirements for different components (e.g. meshes, materials, animations) of an import. All sizes are in bytes."

    unsigned_int("textures", "Storage allocated for texture data")
    unsigned_int("materials", "Storage allocated for material data")
    unsigned_int("meshes", "Storage allocated for mesh data")
    unsigned_int("nodes", "Storage allocated for node data")
    unsigned_int("animations", "Storage allocated for animation data")
    unsigned_int("cameras", "Storage allocated for camera data")
    unsigned_int("lights", "Storage allocated for light data")
    unsigned_int("total", "Total storage allocated for the full import.")
}

val aiTexel = struct(Module.ASSIMP, "AITexel", nativeName = "struct aiTexel", mutable = false) {
    documentation = "Helper structure to represent a texel in a ARGB8888 format. Used by aiTexture."

    unsigned_char("b", "The blue color component")
    unsigned_char("g", "The green color component")
    unsigned_char("r", "The red color component")
    unsigned_char("a", "The alpha color component")
}

private const val HINTMAXTEXTURELEN = 9
val aiTexture = struct(Module.ASSIMP, "AITexture", nativeName = "struct aiTexture", mutable = false) {
    documentation =
        """
        Helper structure to describe an embedded texture.

        Normally textures are contained in external files but some file formats embed them directly in the model file. There are two types of embedded
        textures:

        ${ul(
            "Uncompressed textures. The color data is given in an uncompressed format.",
            "Compressed textures stored in a file format like png or jpg."
        )}

        The raw file bytes are given so the application must utilize an image decoder (e.g. DevIL) to get access to the actual color data.

        Embedded textures are referenced from materials using strings like "*0", "*1", etc. as the texture paths (a single asterisk character followed by the
        zero-based index of the texture in the ##AIScene{@code ::mTextures} array).
        """

    unsigned_int(
        "mWidth",
        """
        Width of the texture, in pixels. If {@code mHeight} is zero the texture is compressed in a format like JPEG. In this case {@code mWidth} specifies the
        size of the memory area {@code pcData} is pointing to, in bytes.
        """
    )
    unsigned_int(
        "mHeight",
        "Height of the texture, in pixels. If this value is zero, {@code pcData} points to an compressed texture in any format (e.g. JPEG)."
    )
    charASCII(
        "achFormatHint",
        """
        A hint from the loader to make it easier for applications to determine the type of embedded textures.

        If {@code mHeight != 0} this member is show how data is packed. Hint will consist of two parts: channel order and channel bitness (count of the bits
        for every color channel). For simple parsing by the viewer it's better to not omit absent color channel and just use 0 for bitness. For example:

        ${ol(
            "Image contain RGBA and 8 bit per channel, {@code achFormatHint == \"rgba8888\";}",
            "Image contain ARGB and 8 bit per channel, {@code achFormatHint == \"argb8888\";}",
            "Image contain RGB and 5 bit for R and B channels and 6 bit for G channel, {@code achFormatHint == \"rgba5650\";}",
            "One color image with B channel and 1 bit for it, {@code achFormatHint == \"rgba0010\";}"
        )}

        If {@code mHeight == 0} then {@code achFormatHint} is set set to '\0\0\0\0' if the loader has no additional information about the texture file format
        used OR the file extension of the format without a trailing dot. If there are multiple file extensions for a format, the shortest extension is chosen
        (JPEG maps to 'jpg', not to 'jpeg'). E.g. 'dds\0', 'pcx\0', 'jpg\0'. All characters are lower-case. The fourth character will always be '\0'.
        """
    )[HINTMAXTEXTURELEN] // 8 for string + 1 for terminator.
    Unsafe..aiTexel.p(
        "pcData",
        """
        Data of the texture.

        Points to an array of {@code mWidth * mHeight} ##AITexel's. The format of the texture data is always ARGB8888 to make the implementation for user of
        the library as easy as possible. If {@code mHeight = 0} this is a pointer to a memory buffer of size {@code mWidth} containing the compressed texture
        data. Good luck, have fun!
        """
    )
    aiString("mFilename", "texture original filename. Used to get the texture reference.")
}

val aiColor4D = struct(Module.ASSIMP, "AIColor4D", nativeName = "struct aiColor4D") {
    documentation = "Represents a color in Red-Green-Blue space including an alpha component. Color values range from 0 to 1."

    float("r", "The red color component")
    float("g", "The green color component")
    float("b", "The blue color component")
    float("a", "The alpha color component")
}

val aiMatrix4x4 = struct(Module.ASSIMP, "AIMatrix4x4", nativeName = "struct aiMatrix4x4") {
    documentation = "Represents a row-major 4x4 matrix, use this for homogeneous coordinates."

    float("a1", "")
    float("a2", "")
    float("a3", "")
    float("a4", "")

    float("b1", "")
    float("b2", "")
    float("b3", "")
    float("b4", "")

    float("c1", "")
    float("c2", "")
    float("c3", "")
    float("c4", "")

    float("d1", "")
    float("d2", "")
    float("d3", "")
    float("d4", "")
}

val aiMatrix3x3 = struct(Module.ASSIMP, "AIMatrix3x3", nativeName = "struct aiMatrix3x3") {
    documentation = "Represents a row-major 3x3 matrix."

    float("a1", "")
    float("a2", "")
    float("a3", "")

    float("b1", "")
    float("b2", "")
    float("b3", "")

    float("c1", "")
    float("c2", "")
    float("c3", "")
}

val aiMetadataType = "aiMetadataType".enumType

val aiMetadataEntry = struct(Module.ASSIMP, "AIMetaDataEntry", nativeName = "struct aiMetadataEntry") {
    aiMetadataType("mType", "")
    void.p("mData", "")
}

val aiMetadata = struct(Module.ASSIMP, "AIMetaData", nativeName = "struct aiMetadata") {
    AutoSize("mKeys", "mValues")..unsigned_int("mNumProperties", "Length of the {@code mKeys} and {@code mValues} arrays, respectively")
    aiString.p("mKeys", "Arrays of keys, may not be #NULL. Entries in this array may not be #NULL as well.")
    aiMetadataEntry.p(
        "mValues",
        "Arrays of values, may not be #NULL. Entries in this array may be #NULL if the corresponding property key has no assigned value."
    )
}

private val _aiNode = struct(Module.ASSIMP, "AINode", nativeName = "struct aiNode")
val aiNode = struct(Module.ASSIMP, "AINode", nativeName = "struct aiNode") {
    documentation =
        """
        A node in the imported hierarchy.

        Each node has name, a parent node (except for the root node), a transformation relative to its parent and possibly several child nodes. Simple file
        formats don't support hierarchical structures - for these formats the imported scene does consist of only a single root node without children.
        """

    aiString(
        "mName",
        """
        The name of the node.

        The name might be empty (length of zero) but all nodes which need to be referenced by either bones or animations are named. Multiple nodes may have the
        same name, except for nodes which are referenced by bones (see ##AIBone and ##AIMesh{@code ::mBones}). Their names <b>must</b> be unique.

        Cameras and lights reference a specific node by name - if there are multiple nodes with this name, they are assigned to each of them.

        There are no limitations with regard to the characters contained in the name string as it is usually taken directly from the source file.

        Implementations should be able to handle tokens such as whitespace, tabs, line feeds, quotation marks, ampersands etc.

        Sometimes assimp introduces new nodes not present in the source file into the hierarchy (usually out of necessity because sometimes the source
        hierarchy format is simply not compatible). Their names are surrounded by {@code <>} e.g. {@code <DummyRootNode>}.
        """
    )
    aiMatrix4x4("mTransformation", "The transformation relative to the node's parent.")
    nullable.._aiNode.p("mParent", "Parent node. #NULL if this node is the root node.")
    AutoSize("mChildren", optional = true)..unsigned_int("mNumChildren", "The number of child nodes of this node.")
    _aiNode.p.p("mChildren", "The child nodes of this node. #NULL if {@code mNumChildren} is 0.")
    AutoSize("mMeshes", optional = true)..unsigned_int("mNumMeshes", "The number of meshes of this node.")
    unsigned_int.p("mMeshes", "The meshes of this node. Each entry is an index into the mesh list of the ##AIScene.")
    nullable..aiMetadata.p(
        "mMetadata",
        """
        Metadata associated with this node or #NULL if there is no metadata.

        Whether any metadata is generated depends on the source file format. See the importer notes page for more information on every source file format.
        Importers that don't document any metadata don't write any.
        """
    )
}

val aiFace = struct(Module.ASSIMP, "AIFace", nativeName = "struct aiFace") {
    documentation =
        """
        A single face in a mesh, referring to multiple vertices.

        If {@code mNumIndices} is 3, we call the face 'triangle', for {@code mNumIndices > 3} it's called 'polygon' (hey, that's just a definition!).

        ##AIMesh{@code ::mPrimitiveTypes} can be queried to quickly examine which types of primitive are actually present in a mesh. The #Process_SortByPType
        flag executes a special post-processing algorithm which splits meshes with *different* primitive types mixed up (e.g. lines and triangles) in several
        'clean' submeshes. Furthermore there is a configuration option (#AI_CONFIG_PP_SBP_REMOVE) to force #Process_SortByPType to remove specific kinds of
        primitives from the imported scene, completely and forever.
        """

    AutoSize("mIndices")..unsigned_int(
        "mNumIndices",
        "Number of indices defining this face. The maximum value for this member is #AI_MAX_FACE_INDICES."
    )
    unsigned_int.p("mIndices", "Pointer to the indices array. Size of the array is given in {@code numIndices}.")
}

val aiVertexWeight = struct(Module.ASSIMP, "AIVertexWeight", nativeName = "struct aiVertexWeight") {
    documentation = "A single influence of a bone on a vertex."

    unsigned_int("mVertexId", "Index of the vertex which is influenced by the bone.")
    float("mWeight", "The strength of the influence in the range (0...1). The influence from all bones at one vertex amounts to 1.")
}

val aiBone = struct(Module.ASSIMP, "AIBone", nativeName = "struct aiBone") {
    documentation =
        """
        A single bone of a mesh.

        A bone has a name by which it can be found in the frame hierarchy and by which it can be addressed by animations. In addition it has a number of
        influences on vertices, and a matrix relating the mesh position to the position of the bone at the time of binding.
        """

    aiString("mName", "the name of the bone.")
    AutoSize("mWeights")..unsigned_int(
        "mNumWeights",
        "the number of vertices affected by this bone. The maximum value for this member is #AI_MAX_BONE_WEIGHTS."
    )
    aiVertexWeight.p("mWeights", "the influence weights of this bone, by vertex index")
    aiMatrix4x4(
        "mOffsetMatrix",
        """
        matrix that transforms from bone space to mesh space in bind pose.

        This matrix describes the position of the mesh in the local space of this bone when the skeleton was bound. Thus it can be used directly to determine a
        desired vertex position, given the world-space transform of the bone when animated, and the position of the vertex in mesh space.

        It is sometimes called an inverse-bind matrix, or inverse bind pose matrix.
        """
    )
}

val aiAnimMesh = struct(Module.ASSIMP, "AIAnimMesh", nativeName = "struct aiAnimMesh") {
    documentation =
        """
        An {@code AnimMesh} is an attachment to an ##AIMesh stores per-vertex animations for a particular frame.

        You may think of an {@code aiAnimMesh} as a `patch` for the host mesh, which replaces only certain vertex data streams at a particular time. Each mesh
        stores n attached attached meshes (##AIMesh{@code ::mAnimMeshes}). The actual relationship between the time line and anim meshes is established by
        {@code aiMeshAnim}, which references singular mesh attachments by their ID and binds them to a time offset.
        """

    aiString("mName", "the {@code AnimMesh} name")
    nullable..aiVector3D.p(
        "mVertices",
        """
        Replacement for ##AIMesh{@code ::mVertices}. If this array is non-#NULL, it *must* contain {@code mNumVertices} entries. The corresponding array in the
        host mesh must be non-#NULL as well - animation meshes may neither add or nor remove vertex components (if a replacement array is #NULL and the
        corresponding source array is not, the source data is taken instead).
        """
    )
    nullable..aiVector3D.p("mNormals", "Replacement for ##AIMesh{@code ::mNormals}.")
    nullable..aiVector3D.p("mTangents", "Replacement for ##AIMesh{@code ::mTangents}.")
    nullable..aiVector3D.p("mBitangents", "Replacement for ##AIMesh{@code ::mBitangents}.")
    nullable..aiColor4D.p("mColors", "Replacement for ##AIMesh{@code ::mColors}")["Assimp.AI_MAX_NUMBER_OF_COLOR_SETS"]
    nullable..aiVector3D.p("mTextureCoords", "Replacement for ##AIMesh{@code ::mTextureCoords}")["Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS"]
    AutoSize(
        "mVertices", "mNormals", "mTangents", "mBitangents"
    )..AutoSizeIndirect(
        "mColors", "mTextureCoords"
    )..unsigned_int(
        "mNumVertices",
        """
        The number of vertices in the {@code aiAnimMesh}, and thus the length of all the member arrays. This has always the same value as the
        {@code mNumVertices} property in the corresponding ##AIMesh. It is duplicated here merely to make the length of the member arrays accessible even if
        the {@code aiMesh} is not known, e.g. from language bindings.
        """
    )
    float("mWeight", "Weight of the {@code AnimMesh}.")
}

val aiMesh = struct(Module.ASSIMP, "AIMesh", nativeName = "struct aiMesh") {
    documentation =
        """
        A mesh represents a geometry or model with a single material.

        It usually consists of a number of vertices and a series of primitives/faces referencing the vertices. In addition there might be a series of bones,
        each of them addressing a number of vertices with a certain weight. Vertex data is presented in channels with each channel containing a single
        per-vertex information such as a set of texture coords or a normal vector. If a data pointer is non-null, the corresponding data stream is present.

        A Mesh uses only a single material which is referenced by a material ID.
        """

    unsigned_int(
        "mPrimitiveTypes",
        """
        Bitwise combination of the members of the {@code aiPrimitiveType} enum. This specifies which types of primitives are present in the mesh. The
        "SortByPrimitiveType"-Step can be used to make sure the output meshes consist of one primitive type each.
        """
    ).links("PrimitiveType_\\w+", LinkMode.BITFIELD)
    AutoSize(
        "mVertices", "mNormals", "mTangents", "mBitangents"
    )..AutoSizeIndirect(
        "mColors", "mTextureCoords"
    )..unsigned_int(
        "mNumVertices",
        """
        The number of vertices in this mesh. This is also the size of all of the per-vertex data arrays. The maximum value for this member is #AI_MAX_VERTICES.
        """
    )
    AutoSize("mFaces")..unsigned_int(
        "mNumFaces",
        """
        The number of primitives (triangles, polygons, lines) in this mesh. This is also the size of the {@code mFaces} array. The maximum value for this
        member is #AI_MAX_FACES.
        """
    )
    aiVector3D.p("mVertices", "Vertex positions. This array is always present in a mesh. The array is {@code mNumVertices} in size.")
    nullable..aiVector3D.p(
        "mNormals",
        """
        Vertex normals.

        The array contains normalized vectors, #NULL if not present. The array is {@code mNumVertices} in size. Normals are undefined for point and line
        primitives. A mesh consisting of points and lines only may not have normal vectors. Meshes with mixed primitive types (i.e. lines and triangles) may
        have normals, but the normals for vertices that are only referenced by point or line primitives are undefined and set to {@code qNaN}.

        ${note("""
        Normal vectors computed by Assimp are always unit-length. However, this needn't apply for normals that have been taken directly from the model file
        """)}
        """
    )
    nullable..aiVector3D.p(
        "mTangents",
        """
        Vertex tangents.

        The tangent of a vertex points in the direction of the positive X texture axis. The array contains normalized vectors, #NULL if not present. The array
        is {@code mNumVertices} in size. A mesh consisting of points and lines only may not have normal vectors. Meshes with mixed primitive types (i.e. lines
        and triangles) may have normals, but the normals for vertices that are only referenced by point or line primitives are undefined and set to
        {@code qNaN}.

        ${note("If the mesh contains tangents, it automatically also contains bitangents.")}
        """
    )
    nullable..aiVector3D.p(
        "mBitangents",
        """
        Vertex bitangents.

        The bitangent of a vertex points in the direction of the positive Y texture axis. The array contains normalized vectors, #NULL if not present. The
        array is {@code mNumVertices} in size.

        ${note("If the mesh contains tangents, it automatically also contains bitangents.")}
        """
    )
    nullable..aiColor4D.p(
        "mColors",
        """
        Vertex color sets. A mesh may contain 0 to #AI_MAX_NUMBER_OF_COLOR_SETS vertex colors per vertex. #NULL if not present. Each array is
        {@code mNumVertices} in size if present.
        """
    )["Assimp.AI_MAX_NUMBER_OF_COLOR_SETS"]
    nullable..aiVector3D.p(
        "mTextureCoords",
        """
        Vertex texture coords, also known as UV channels. A mesh may contain 0 to #AI_MAX_NUMBER_OF_TEXTURECOORDS per vertex. #NULL if not present. The array
        is {@code mNumVertices} in size.
        """
    )["Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS"]
    unsigned_int(
        "mNumUVComponents",
        """
        Specifies the number of components for a given UV channel. Up to three channels are supported (UVW, for accessing volume or cube maps). If the value is
        2 for a given channel n, the component {@code p.z} of {@code mTextureCoords[n][p]} is set to 0.0f. If the value is 1 for a given channel, {@code p.y}
        is set to 0.0f, too.
        """
    )["Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS"]
    aiFace.p(
        "mFaces",
        """
        The faces the mesh is constructed from. Each face refers to a number of vertices by their indices. This array is always present in a mesh, its size is
        given in {@code mNumFaces}. If the #AI_SCENE_FLAGS_NON_VERBOSE_FORMAT is NOT set each face references an unique set of vertices.
        """
    )
    AutoSize("mBones", optional = true)..unsigned_int(
        "mNumBones",
        "The number of bones this mesh contains. Can be 0, in which case the {@code mBones} array is #NULL."
    )
    aiBone.p.p(
        "mBones",
        "The bones of this mesh. A bone consists of a name by which it can be found in the frame hierarchy and a set of vertex weights."
    )
    unsigned_int(
        "mMaterialIndex",
        """
        The material used by this mesh. A mesh uses only a single material. If an imported model uses multiple materials, the import splits up the mesh. Use
        this value as index into the scene's material list.
        """
    )
    aiString(
        "mName",
        """
        Name of the mesh.

        Meshes can be named, but this is not a requirement and leaving this field empty is totally fine. There are mainly three uses for mesh names:

        ${ul(
            "some formats name nodes and meshes independently.",
            """
            importers tend to split meshes up to meet the one-material-per-mesh requirement. Assigning the same (dummy) name to each of the result meshes aids
            the caller at recovering the original mesh partitioning.
            """,
            "vertex animations refer to meshes by their names."
        )}
        """
    )
    AutoSize("mAnimMeshes", optional = true)..unsigned_int(
        "mNumAnimMeshes",
        "The number of attachment meshes. Note! Currently only works with Collada loader."
    )
    aiAnimMesh.p.p(
        "mAnimMeshes",
        """
        Attachment meshes for this mesh, for vertex-based animation. Attachment meshes carry replacement data for some of the mesh'es vertex components
        (usually positions, normals). Note! Currently only works with Collada loader.
        """
    )
    unsigned_int("mMethod", "Method of morphing when {@code animeshes} are specified.").links("MorphingMethod_\\w+")
}

val aiUVTransform = struct(Module.ASSIMP, "AIUVTransform", nativeName = "struct aiUVTransform", mutable = false) {
    documentation =
        """
        Defines how an UV channel is transformed.

        This is just a helper structure for the #_AI_MATKEY_UVTRANSFORM_BASE key. See its documentation for more details.

        Typically you'll want to build a matrix of this information. However, we keep separate scaling/translation/rotation values to make it easier to process
        and optimize UV transformations internally.
        """

    aiVector2D("mTranslation", "Translation on the u and v axes. The default value is (0|0).")
    aiVector2D("mScaling", "Scaling on the u and v axes. The default value is (1|1).")
    float(
        "mRotation",
        "Rotation - in counter-clockwise direction. The rotation angle is specified in radians. The rotation center is 0.5f|0.5f. The default value 0.f."
    )
}

val aiPropertyTypeInfo = "aiPropertyTypeInfo".enumType

val aiMaterialProperty = struct(Module.ASSIMP, "AIMaterialProperty", nativeName = "struct aiMaterialProperty", mutable = false) {
    documentation =
        """
        Data structure for a single material property.

        As a user, you'll probably never need to deal with this data structure. Just use the provided {@code aiGetMaterialXXX()} family of functions to query
        material properties easily. Processing them manually is faster, but it is not the recommended way. It isn't worth the effort.

        Material property names follow a simple scheme:
        ${codeBlock("""
$&lt;name&gt;
?&lt;name&gt;
    A public property, there must be corresponding AI_MATKEY_XXX define
    2nd: Public, but ignored by the aiProcess_RemoveRedundantMaterials
    post-processing step.
~&lt;name&gt;
    A temporary property for internal use.
    """)}
        """

    aiString("mKey", "Specifies the name of the property (key). Keys are generally case insensitive.")
    unsigned_int(
        "mSemantic",
        "Textures: Specifies their exact usage semantic. For non-texture properties, this member is always 0 (or, better-said, #TextureType_NONE)."
    )
    unsigned_int("mIndex", "Textures: Specifies the index of the texture. For non-texture properties, this member is always 0.")
    AutoSize("mData")..unsigned_int("mDataLength", "Size of the buffer {@code mData} is pointing to, in bytes. This value may not be 0.")
    aiPropertyTypeInfo(
        "mType",
        """
        Type information for the property. Defines the data layout inside the data buffer. This is used by the library internally to perform debug checks and
        to utilize proper type conversions. (It's probably a hacky solution, but it works.)
        """
    )
    char.p("mData", "Binary buffer to hold the property's value. The size of the buffer is always mDataLength.")
}

val aiMaterial = struct(Module.ASSIMP, "AIMaterial", nativeName = "struct aiMaterial") {
    documentation =
        """
        Data structure for a material.

        Material data is stored using a key-value structure. A single key-value pair is called a 'material property'. C++ users should use the provided member
        functions of {@code aiMaterial} to process material properties, C users have to stick with the {@code aiMaterialGetXXX} family of unbound functions.
        The library defines a set of standard keys (AI_MATKEY_XXX).
        """

    aiMaterialProperty.p.p("mProperties", "List of all material properties loaded.")
    AutoSize("mProperties")..unsigned_int("mNumProperties", "Number of properties in the data base")
    unsigned_int("mNumAllocated", "Storage allocated")
}

val aiQuaternion = struct(Module.ASSIMP, "AIQuaternion", nativeName = "struct aiQuaternion") {
    documentation = "Represents a quaternion in a 4D vector."

    float("w", "The w component")
    float("x", "The x component")
    float("y", "The y component")
    float("z", "The z component")
}

val aiVectorKey = struct(Module.ASSIMP, "AIVectorKey", nativeName = "struct aiVectorKey") {
    documentation = "A time-value pair specifying a certain 3D vector for the given time."

    double("mTime", "The time of this key")
    aiVector3D("mValue", "The value of this key")
}

val aiQuatKey = struct(Module.ASSIMP, "AIQuatKey", nativeName = "struct aiQuatKey") {
    documentation = "A time-value pair specifying a rotation for the given time. Rotations are expressed with quaternions."

    double("mTime", "The time of this key")
    aiQuaternion("mValue", "The value of this key")
}

val aiMeshKey = struct(Module.ASSIMP, "AIMeshKey", nativeName = "struct aiMeshKey") {
    documentation = "Binds a anim mesh to a specific point in time."

    double("mTime", "The time of this key")
    unsigned_int(
        "mValue",
        """
        Index into the ##AIMesh{@code ::mAnimMeshes} array of the mesh coresponding to the ##AIMeshAnim hosting this key frame. The referenced anim mesh is
        evaluated according to the rules defined in the docs for ##AIAnimMesh.
        """
    )
}

val aiMeshMorphKey = struct(Module.ASSIMP, "AIMeshMorphKey", nativeName = "struct aiMeshMorphKey") {
    documentation = "Binds a morph anim mesh to a specific point in time."

    double("mTime", "the time of this key")
    unsigned_int.p("mValues", "the values at the time of this key")
    double.p("mWeights", "the weights at the time of this key")
    AutoSize("mValues", "mWeights")..unsigned_int("mNumValuesAndWeights", "the number of values and weights")
}

val aiAnimBehaviour = "aiAnimBehaviour".enumType

val aiNodeAnim = struct(Module.ASSIMP, "AINodeAnim", nativeName = "struct aiNodeAnim") {
    documentation =
        """
        Describes the animation of a single node. The name specifies the bone/node which is affected by this animation channel. The keyframes are given in
        three separate series of values, one each for position, rotation and scaling. The transformation matrix computed from these values replaces the node's
        original transformation matrix at a specific time.

        This means all keys are absolute and not relative to the bone default pose. The order in which the transformations are applied is - as usual - scaling,
        rotation, translation.

        <h5>Note:</h5>

        All keys are returned in their correct, chronological order. Duplicate keys don't pass the validation step. Most likely there will be no negative time
        values, but they are not forbidden also ( so implementations need to cope with them! )
        """

    aiString("mNodeName", "The name of the node affected by this animation. The node must exist and it must be unique.")
    AutoSize("mPositionKeys", optional = true)..unsigned_int("mNumPositionKeys", "The number of position keys")
    aiVectorKey.p(
        "mPositionKeys",
        """
        The position keys of this animation channel. Positions are specified as 3D vector. The array is {@code mNumPositionKeys} in size. If there are position
        keys, there will also be at least one scaling and one rotation key.
        """
    )
    AutoSize("mRotationKeys", optional = true)..unsigned_int("mNumRotationKeys", "The number of rotation keys")
    aiQuatKey.p(
        "mRotationKeys",
        """
        The rotation keys of this animation channel. Rotations are given as quaternions,  which are 4D vectors. The array is {@code mNumRotationKeys} in size.
        If there are rotation keys, there will also be at least one scaling and one position key.
        """
    )
    AutoSize("mScalingKeys", optional = true)..unsigned_int("mNumScalingKeys", "The number of scaling keys")
    aiVectorKey.p(
        "mScalingKeys",
        """
        The scaling keys of this animation channel. Scalings are specified as 3D vector. The array is {@code mNumScalingKeys} in size. If there are scaling
        keys, there will also be at least one position and one rotation key.
        """
    )
    aiAnimBehaviour(
        "mPreState",
        """
        Defines how the animation behaves before the first key is encountered. The default value is aiAnimBehaviour_DEFAULT (the original transformation matrix
        of the affected node is used).
        """
    ).links("AnimBehaviour_\\w+")
    aiAnimBehaviour(
        "mPostState",
        """
        Defines how the animation behaves after the last key was processed. The default value is aiAnimBehaviour_DEFAULT (the original transformation matrix of
        the affected node is taken).
        """
    ).links("AnimBehaviour_\\w+")
}

val aiMeshAnim = struct(Module.ASSIMP, "AIMeshAnim", nativeName = "struct aiMeshAnim") {
    documentation =
        """
        Describes vertex-based animations for a single mesh or a group of meshes. Meshes carry the animation data for each frame in their
        ##AIMesh{@code ::mAnimMeshes} array. The purpose of {@code aiMeshAnim} is to define keyframes linking each mesh attachment to a particular point in
        time.
        """

    aiString(
        "mName",
        """
        Name of the mesh to be animated. An empty string is not allowed, animated meshes need to be named (not necessarily uniquely, the name can basically
        serve as wildcard to select a group of meshes with similar animation setup)
        """)
    AutoSize("mKeys")..unsigned_int("mNumKeys", "Size of the {@code mKeys} array. Must be 1, at least.")
    aiMeshKey.p("mKeys", "Key frames of the animation. May not be #NULL.")
}

val aiMeshMorphAnim = struct(Module.ASSIMP, "AIMeshMorphAnim", nativeName = "struct aiMeshMorphAnim") {
    documentation = "Describes a morphing animation of a given mesh."

    aiString(
        "mName",
        """
        Name of the mesh to be animated. An empty string is not allowed, animated meshes need to be named (not necessarily uniquely, the name can basically
        serve as wildcard to select a group of meshes with similar animation setup).
        """)
    AutoSize("mKeys")..unsigned_int("mNumKeys", "Size of the {@code mKeys} array. Must be 1, at least.")
    aiMeshMorphKey.p("mKeys", "Key frames of the animation. May not be #NULL.")
}

val aiAnimation = struct(Module.ASSIMP, "AIAnimation", nativeName = "struct aiAnimation") {
    documentation =
        """
        An animation consists of keyframe data for a number of nodes. For each node affected by the animation a separate series of data is given.
        """

    aiString(
        "mName",
        """
        The name of the animation. If the modeling package this data was exported from does support only a single animation channel, this name is usually empty
        (length is zero).
        """
    )
    double("mDuration", "Duration of the animation in ticks.")
    double("mTicksPerSecond", "Ticks per second. 0 if not specified in the imported file")
    AutoSize("mChannels", optional = true)..unsigned_int("mNumChannels", "The number of bone animation channels. Each channel affects a single node.")
    aiNodeAnim.p.p("mChannels", "The node animation channels. Each channel affects a single node. The array is {@code mNumChannels} in size.")
    AutoSize("mMeshChannels", optional = true)..unsigned_int(
        "mNumMeshChannels",
        "The number of mesh animation channels. Each channel affects a single mesh and defines vertex-based animation."
    )
    aiMeshAnim.p.p("mMeshChannels", "The mesh animation channels. Each channel affects a single mesh. The array is {@code mNumMeshChannels} in size.")
    AutoSize("mMorphMeshChannels", optional = true)..unsigned_int(
        "mNumMorphMeshChannels",
        "the number of mesh animation channels. Each channel affects a single mesh and defines morphing animation."
    )
    aiMeshMorphAnim.p.p(
        "mMorphMeshChannels",
        "the morph mesh animation channels. Each channel affects a single mesh. The array is {@code mNumMorphMeshChannels} in size."
    )
}

val aiLightSourceType = "aiLightSourceType".enumType

val aiLight = struct(Module.ASSIMP, "AILight", nativeName = "struct aiLight", mutable = false) {
    documentation =
        """
        Helper structure to describe a light source.

        Assimp supports multiple sorts of light sources, including directional, point and spot lights. All of them are defined with just a single structure and
        distinguished by their parameters. Note - some file formats (such as 3DS, ASE) export a "target point" - the point a spot light is looking at (it can
        even be animated). Assimp writes the target point as a subnode of a spotlights's main node, called "&lt;spotName&gt;.Target". However, this is just
        additional information then, the transformation tracks of the main node make the spot light already point in the right direction.
        """

    aiString(
        "mName",
        """
        The name of the light source. There must be a node in the scenegraph with the same name. This node specifies the position of the light in the scene
        hierarchy and can be animated.
        """
    )
    aiLightSourceType(
        "mType",
        "The type of the light source. #LightSource_UNDEFINED is not a valid value for this member."
    ).links("LightSource_(?!UNDEFINED)\\w+")
    aiVector3D(
        "mPosition",
        """
        Position of the light source in space. Relative to the transformation of the node corresponding to the light. The position is undefined for directional
        lights.
        """
    )
    aiVector3D(
        "mDirection",
        """
        Direction of the light source in space. Relative to the transformation of the node corresponding to the light. The direction is undefined for point
        lights. The vector may be normalized, but it needn't.
        """
    )
    aiVector3D(
        "mUp",
        """
        Up direction of the light source in space. Relative to the transformation of the node corresponding to the light. The direction is undefined for point
        lights. The vector may be normalized, but it needn't.
        """
    )
    float(
        "mAttenuationConstant",
        """
        Constant light attenuation factor. The intensity of the light source at a given distance 'd' from the light's position is
        {@code Atten = 1/( att0 + att1 * d + att2 * d*d)}. This member corresponds to the att0 variable in the equation. Naturally undefined for directional
        lights.
        """
    )
    float(
        "mAttenuationLinear",
        """
        Linear light attenuation factor. The intensity of the light source at a given distance 'd' from the light's position is
        {@code Atten = 1/( att0 + att1 * d + att2 * d*d)}. This member corresponds to the att1 variable in the equation. Naturally undefined for directional
        lights.
        """
    )
    float(
        "mAttenuationQuadratic",
        """
        Quadratic light attenuation factor. The intensity of the light source at a given distance 'd' from the light's position is
        {@code Atten = 1/( att0 + att1 * d + att2 * d*d)}. This member corresponds to the att2 variable in the equation. Naturally undefined for directional
        lights.
        """
    )
    aiColor3D(
        "mColorDiffuse",
        """
        Diffuse color of the light source. The diffuse light color is multiplied with the diffuse material color to obtain the final color that contributes to
        the diffuse shading term.
        """
    )
    aiColor3D(
        "mColorSpecular",
        """
        Specular color of the light source. The specular light color is multiplied with the specular material color to obtain the final color that contributes
        to the specular shading term.
        """
    )
    aiColor3D(
        "mColorAmbient",
        """
        Ambient color of the light source. The ambient light color is multiplied with the ambient material color to obtain the final color that contributes to
        the ambient shading term. Most renderers will ignore this value it, is just a remaining of the fixed-function pipeline that is still supported by quite
        many file formats.
        """
    )
    float(
        "mAngleInnerCone",
        """
        Inner angle of a spot light's light cone. The spot light has maximum influence on objects inside this angle. The angle is given in radians. It is 2PI
        for point lights and undefined for directional lights.
        """
    )
    float(
        "mAngleOuterCone",
        """
        Outer angle of a spot light's light cone. The spot light does not affect objects outside this angle. The angle is given in radians. It is 2PI for point
        lights and undefined for directional lights. The outer angle must be greater than or equal to the inner angle. It is assumed that the application uses
        a smooth interpolation between the inner and the outer cone of the spot light.
        """
    )
    aiVector2D("mSize", "Size of area light source.")
}

val aiCamera = struct(Module.ASSIMP, "AICamera", nativeName = "struct aiCamera") {
    documentation =
        """
        Helper structure to describe a virtual camera.

        Cameras have a representation in the node graph and can be animated. An important aspect is that the camera itself is also part of the scenegraph. This
        means, any values such as the look-at vector are not *absolute*, they're <b>relative</b> to the coordinate system defined by the node which corresponds
        to the camera. This allows for camera animations. For static cameras parameters like the 'look-at' or 'up' vectors are usually specified directly in
        {@code aiCamera}, but beware, they could also be encoded in the node transformation.
        """

    aiString(
        "mName",
        """
        The name of the camera. There must be a node in the scenegraph with the same name. This node specifies the position of the camera in the scene
        hierarchy and can be animated.
        """
    )
    aiVector3D("mPosition", "Position of the camera relative to the coordinate space defined by the corresponding node. The default value is 0|0|0.")
    aiVector3D(
        "mUp",
        """
        'Up' - vector of the camera coordinate system relative to the coordinate space defined by the corresponding node. The 'right' vector of the camera
        coordinate system is the cross product of  the up and lookAt vectors. The default value is 0|1|0. The vector may be normalized, but it needn't.
        """
    )
    aiVector3D(
        "mLookAt",
        """
        'LookAt' - vector of the camera coordinate system relative to the coordinate space defined by the corresponding node. This is the viewing direction of
        the user. The default value is 0|0|1. The vector may be normalized, but it needn't.
        """
    )
    float(
        "mHorizontalFOV",
        """
        Half horizontal field of view angle, in radians. The field of view angle is the angle between the center line of the screen and the left or right
        border. The default value is 1/4PI.
        """
    )
    float(
        "mClipPlaneNear",
        """
        Distance of the near clipping plane from the camera. The value may not be 0.f (for arithmetic reasons to prevent a division through zero). The default
        value is 0.1f.
        """
    )
    float(
        "mClipPlaneFar",
        """Distance of the far clipping plane from the camera. The far clipping plane must, of course, be further away than the near clipping plane. The
        default value is 1000.f. The ratio between the near and the far plane should not be too large (between 1000-10000 should be ok) to avoid floating-point
        inaccuracies which could lead to z-fighting.
        """
    )
    float(
        "mAspect",
        """
        Screen aspect ratio. This is the ration between the width and the height of the screen. Typical values are 4/3, 1/2 or 1/1. This value is 0 if the
        aspect ratio is not defined in the source file. 0 is also the default value.
        """
    )
}

val aiScene = struct(Module.ASSIMP, "AIScene", nativeName = "struct aiScene") {
    documentation =
        """
        The root structure of the imported data.

        Everything that was imported from the given file can be accessed from here. Objects of this class are generally maintained and owned by Assimp, not by
        the caller. You shouldn't want to instance it, nor should you ever try to delete a given scene on your own.
        """

    unsigned_int(
        "mFlags",
        """
        Any combination of the AI_SCENE_FLAGS_XXX flags. By default this value is 0, no flags are set. Most applications will want to reject all scenes with
        the AI_SCENE_FLAGS_INCOMPLETE bit set.
        """
    ).links("AI_SCENE_FLAGS_\\w+", LinkMode.BITFIELD)
    nullable..aiNode.p(
        "mRootNode",
        """
        The root node of the hierarchy. There will always be at least the root node if the import was successful (and no special flags have been set). Presence
        of further nodes depends on the format and content of the imported file.
        """
    )
    AutoSize("mMeshes", optional = true)..unsigned_int("mNumMeshes", "The number of meshes in the scene.")
    aiMesh.p.p(
        "mMeshes",
        """
        The array of meshes. Use the indices given in the ##AINode structure to access this array. The array is {@code mNumMeshes} in size. If the
        #AI_SCENE_FLAGS_INCOMPLETE flag is not set there will always be at least ONE material.
        """
    )
    AutoSize("mMaterials", optional = true)..unsigned_int("mNumMaterials", "The number of materials in the scene.")
    aiMaterial.p.p(
        "mMaterials",
        """
        The array of materials. Use the index given in each ##AIMesh structure to access this array. The array is {@code mNumMaterials} in size. If the
        #AI_SCENE_FLAGS_INCOMPLETE flag is not set there will always be at least ONE material.
        """
    )
    AutoSize("mAnimations", optional = true)..unsigned_int("mNumAnimations", "The number of animations in the scene.")
    aiAnimation.p.p(
        "mAnimations",
        "The array of animations. All animations imported from the given file are listed here. The array is {@code mNumAnimations} in size."
    )
    AutoSize("mTextures", optional = true)..unsigned_int("mNumTextures", "The number of textures embedded into the file")
    aiTexture.p.p(
        "mTextures",
        """
        The array of embedded textures. Not many file formats embed their textures into the file. An example is Quake's MDL format (which is also used by some
        GameStudio versions)
        """
    )
    AutoSize("mLights", optional = true)..unsigned_int(
        "mNumLights",
        "The number of light sources in the scene. Light sources are fully optional, in most cases this attribute will be 0"
    )
    aiLight.p.p(
        "mLights",
        "The array of light sources. All light sources imported from the given file are listed here. The array is {@code mNumLights} in size."
    )
    AutoSize("mCameras", optional = true)..unsigned_int(
        "mNumCameras",
        "The number of cameras in the scene. Cameras are fully optional, in most cases this attribute will be 0"
    )
    aiCamera.p.p(
        "mCameras",
        """
        The array of cameras. All cameras imported from the given file are listed here. The array is {@code mNumCameras} in size. The first camera in the array
        (if existing) is the default camera view into the scene.
        """
    )
    nullable..aiMetadata.p(
        "mMetaData",
        """
        The global metadata assigned to the scene itself.

        This data contains global metadata which belongs to the scene like unit-conversions, versions, vendors or other model-specific data. This can be used
        to store format-specific metadata as well.
        """
    )

    char.p("mPrivate", "Internal use only, do not touch!").private()
}

val aiReturn = "aiReturn".enumType
val aiTextureType = "aiTextureType".enumType
val aiTextureMapping = "aiTextureMapping".enumType
val aiTextureOp = "aiTextureOp".enumType
val aiTextureMapMode = "aiTextureMapMode".enumType

val aiImporterDesc = struct(Module.ASSIMP, "AIImporterDesc", nativeName = "struct aiImporterDesc") {
    documentation =
        """
        Meta information about a particular importer. Importers need to fill this structure, but they can freely decide how talkative they are. A common use
        case for loader meta info is a user interface in which the user can choose between various import/export file formats. Building such an UI by hand
        means a lot of maintenance as importers / exporters are added to Assimp, so it might be useful to have a common mechanism to query some rough importer
        characteristics.
        """

    charASCII.const.p("mName", "Full name of the importer (i.e. Blender3D importer)")
    charUTF8.const.p("mAuthor", "Original author (left blank if unknown or whole assimp team)")
    charUTF8.const.p("mMaintainer", "Current maintainer, left blank if the author maintains")
    charUTF8.const.p("mComments", "Implementation comments, i.e. unimplemented features")

    unsigned_int("mFlags", "These flags indicate some characteristics common to many importers.")
    unsigned_int("mMinMajor", "Minimum major format that can be loaded in major.minor style.")
    unsigned_int("mMinMinor", "Minimum minor format that can be loaded in major.minor style.")
    unsigned_int("mMaxMajor", "Maximum major format that can be loaded in major.minor style.")
    unsigned_int("mMaxMinor", "Maximum minor format that can be loaded in major.minor style.")

    charASCII.const.p(
        "mFileExtensions",
        """
        List of file extensions this importer can handle. List entries are separated by space characters. All entries are lower case without a leading dot
        (i.e. "xml dae" would be a valid value. Note that multiple importers may respond to the same file extension - assimp calls all importers in the order
        in which they are registered and each importer gets the opportunity to load the file until one importer "claims" the file. Apart from file extension
        checks, importers typically use other methods to quickly reject files (i.e. magic words) so this does not mean that common or generic file extensions
        such as XML would be tediously slow.
        """
    )
}

private val _aiFile = struct(Module.ASSIMP, "AIFile", nativeName = "struct aiFile")
private val _aiFileIO = struct(Module.ASSIMP, "AIFileIO", nativeName = "struct aiFileIO")

val aiFileWriteProc = Module.ASSIMP.callback {
    size_t(
        "AIFileWriteProc",
        "File write procedure.",

        _aiFile.p("pFile", "File pointer to write to"),
        char.const.p("pBuffer", "The buffer to be written"),
        size_t("memB", "Size of the individual element to be written"),
        size_t("count", "Number of elements to be written"),

        nativeType = "aiFileWriteProc"
    )
}

val aiFileReadProc = Module.ASSIMP.callback {
    size_t(
        "AIFileReadProc",
        "File read procedure",

        _aiFile.p("pFile", "File pointer to read from"),
        char.p("pBuffer", "The buffer to read the values"),
        size_t("size", "Size in bytes of each element to be read"),
        size_t("count", "Number of elements to be read"),

        nativeType = "aiFileReadProc"
    )
}

val aiFileTellProc = Module.ASSIMP.callback {
    size_t(
        "AIFileTellProc",
        "File tell procedure.",

        _aiFile.p("pFile", "File pointer to find ftell() on"),

        nativeType = "aiFileTellProc"
    )
}

val aiFileFlushProc = Module.ASSIMP.callback {
    void(
        "AIFileFlushProc",
        "File flush procedure.",

        _aiFile.p("pFile", "File pointer to flush"),

        nativeType = "aiFileFlushProc"
    )
}

val aiOrigin = "aiOrigin".enumType

val aiFileSeek = Module.ASSIMP.callback {
    aiReturn(
        "AIFileSeek",
        "File seek procedure",

        _aiFile.p("pFile", "File pointer to seek to"),
        size_t("offset", "Number of bytes to shift from origin"),
        aiOrigin("origin", "Position used as reference for the offset."),

        nativeType = "aiFileSeek"
    )
}

val aiFileOpenProc = Module.ASSIMP.callback {
    _aiFile.p(
        "AIFileOpenProc",
        "File open procedure",

        _aiFileIO.p("pFileIO", "FileIO system pointer"),
        charUTF8.const.p("fileName", "The name of the file to be opened"),
        charUTF8.const.p("openMode", "The mode in which to open the file"),

        nativeType = "aiFileOpenProc"
    )
}

val aiFileCloseProc = Module.ASSIMP.callback {
    void(
        "AIFileCloseProc",
        "File close procedure",

        _aiFileIO.p("pFileIO", "FileIO system pointer"),
        _aiFile.p("pFile", "File pointer to close"),

        nativeType = "aiFileCloseProc"
    )
}

val aiUserData = typedef(opaque_p, "aiUserData")

val aiFileIO = struct(Module.ASSIMP, "AIFileIO", nativeName = "struct aiFileIO") {
    documentation =
        """
        Provided are functions to open and close files. Supply a custom structure to the import function. If you don't, a default implementation is used. Use
        custom file systems to enable reading from other sources, such as ZIPs or memory locations.
        """

    aiFileOpenProc("OpenProc", "Function used to open a new file")
    aiFileCloseProc("CloseProc", "Function used to close an existing file")
    nullable..aiUserData("UserData", "User-defined, opaque data")
}

val aiFile = struct(Module.ASSIMP, "AIFile", nativeName = "struct aiFile") {
    documentation = """
        Actually, it's a data structure to wrap a set of fXXXX (e.g fopen) replacement functions.

        The default implementation of the functions utilizes the fXXX functions from the CRT. However, you can supply a custom implementation to Assimp by
        delivering a custom ##AIFileIO. Use this to enable reading from other sources, such as ZIP archives or memory locations.
        """

    aiFileReadProc("ReadProc", "Callback to read from a file")
    aiFileWriteProc("WriteProc", "Callback to write to a file")
    aiFileTellProc("TellProc", "Callback to retrieve the current position of the file cursor (ftell())")
    aiFileTellProc("FileSizeProc", "Callback to retrieve the size of the file, in bytes")
    aiFileSeek("SeekProc", "Callback to set the current position of the file cursor (fseek())")
    aiFileFlushProc("FlushProc", "Callback to flush the file contents")
    nullable..aiUserData("UserData", "User-defined, opaque data")
}

val aiLogStreamCallback = Module.ASSIMP.callback {
    void(
        "AILogStreamCallback",
        "Callback to be called for log stream messages",

        charUTF8.const.p("message", "The message to be logged"),
        opaque_p("user", "The user data from the log stream"),

        nativeType = "aiLogStreamCallback"
    )
}

val aiLogStream = struct(Module.ASSIMP, "AILogStream", nativeName = "struct aiLogStream") {
    documentation = "Represents a log stream. A log stream receives all log messages and streams them somewhere"

    aiLogStreamCallback("callback", "callback to be called")
    opaque_p("user", "user data to be passed to the callback")
}

val aiPropertyStore = struct(Module.ASSIMP, "AIPropertyStore", nativeName = "struct aiPropertyStore") {
    documentation = "Represents an opaque set of settings to be used during importing."

    char("sentinel", "")
}

val aiBool = typedef(intb, "aiBool")
val aiDefaultLogStream = "aiDefaultLogStream".enumType

val aiExportFormatDesc = struct(Module.ASSIMP, "AIExportFormatDesc", nativeName = "struct aiExportFormatDesc") {
    documentation = """
        Describes an file format which Assimp can export to. Use #GetExportFormatCount() to learn how many export formats the current Assimp build supports and
        #GetExportFormatDescription() to retrieve a description of an export format option.
        """

    charUTF8.const.p(
        "id",
        """
        a short string ID to uniquely identify the export format. Use this ID string to specify which file format you want to export to when calling
        #ExportScene(). Example: "dae" or "obj"
        """
    )
    charUTF8.const.p(
        "description",
        "A short description of the file format to present to users. Useful if you want to allow the user to select an export format."
    )
    charUTF8.const.p("fileExtension", "Recommended file extension for the exported file in lower case.")
}

private val _aiExportDataBlob = struct(Module.ASSIMP, "AIExportDataBlob", nativeName = "struct aiExportDataBlob")
val aiExportDataBlob = struct(Module.ASSIMP, "AIExportDataBlob", nativeName = "struct aiExportDataBlob") {
    documentation = """
        Describes a blob of exported scene data. Use #ExportSceneToBlob() to create a blob containing an exported scene. The memory referred by this structure
        is owned by Assimp. to free its resources. Don't try to free the memory on your side - it will crash for most build configurations due to conflicting
        heaps.

        Blobs can be nested - each blob may reference another blob, which may in turn reference another blob and so on. This is used when exporters write more
        than one output file for a given ##AIScene. See the remarks for {@code aiExportDataBlob::name} for more information.
        """

    AutoSize("data")..size_t("size", "Size of the data in bytes")
    void.p("data", "The data.")
    aiString(
        "name",
        """
        Name of the blob. An empty string always indicates the first (and primary) blob, which contains the actual file data. Any other blobs are auxiliary
        files produced by exporters (i.e. material files). Existence of such files depends on the file format. Most formats don't split assets across multiple
        files.

        If used, blob names usually contain the file extension that should be used when writing the data to disc.
        """
    )

    nullable.._aiExportDataBlob.p("next", "Pointer to the next blob in the chain or NULL if there is none.")
}