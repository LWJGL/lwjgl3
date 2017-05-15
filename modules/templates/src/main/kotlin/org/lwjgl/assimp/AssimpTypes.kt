/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.assimp

import org.lwjgl.generator.*

val ASSIMP_PACKAGE = "org.lwjgl.assimp"

fun config() {
    packageInfo(
        ASSIMP_PACKAGE,
        """
        Contains bindings to the ${url("http://www.assimp.org/", "Assimp")} library.

        Assimp comes with fairly outdated documentation, which you can read online ${url("http://www.assimp.org/lib_html/", "here")}. The
        ${url("http://www.assimp.org/faq.html", "Frequently Asked Questions")} are also useful.

        The bindings only consist of the C API of the Assimp model import library.
        """
    )
}

val ASSIMP_BINDING = simpleBinding("assimp", """Configuration.ASSIMP_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("assimp"))""", bundledWithLWJGL = true)

/*val aiPlane = struct(ASSIMP_PACKAGE, "AIPlane", nativeName = "struct aiPlane") {
    documentation = "Represents a plane in a three-dimensional, euclidean space."

    float.member("a", "Plane equation")
    float.member("b", "Plane equation")
    float.member("c", "Plane equation")
    float.member("d", "Plane equation")
}*/

val aiVector2D = struct(ASSIMP_PACKAGE, "AIVector2D", nativeName = "struct aiVector2D", mutable = false) {
    float.member("x", "")
    float.member("y", "")
}

val aiVector3D = struct(ASSIMP_PACKAGE, "AIVector3D", nativeName = "struct aiVector3D") {
    float.member("x", "")
    float.member("y", "")
    float.member("z", "")
}
val aiVector3D_p = aiVector3D.p

/*val aiRay = struct(ASSIMP_PACKAGE, "AIRay", nativeName = "struct aiRay") {
    documentation = "Represents a ray."

    aiVector3D.member("pos", "Position of the ray")
    aiVector3D.member("dir", "Direction of the ray")
}*/

val aiColor3D = struct(ASSIMP_PACKAGE, "AIColor3D", nativeName = "struct aiColor3D", mutable = false) {
    documentation = "Represents a color in Red-Green-Blue space."

    float.member("r", "The red color value")
    float.member("g", "The green color value")
    float.member("b", "The blue color value")
}

val aiString = struct(ASSIMP_PACKAGE, "AIString", nativeName = "struct aiString") {
    documentation = "Represents an UTF-8 string, zero byte terminated."

    AutoSize("data")..size_t.member("length", "Binary length of the string excluding the terminal 0.")
    charUTF8.array("data", "String buffer.", size = "Assimp.MAXLEN")
}
val aiString_p = aiString.p

val aiMemoryInfo_p = struct(ASSIMP_PACKAGE, "AIMemoryInfo", nativeName = "struct aiMemoryInfo", mutable = false) {
    documentation = "Stores the memory requirements for different components (e.g. meshes, materials, animations) of an import. All sizes are in bytes."

    unsigned_int.member("textures", "Storage allocated for texture data")
    unsigned_int.member("materials", "Storage allocated for material data")
    unsigned_int.member("meshes", "Storage allocated for mesh data")
    unsigned_int.member("nodes", "Storage allocated for node data")
    unsigned_int.member("animations", "Storage allocated for animation data")
    unsigned_int.member("cameras", "Storage allocated for camera data")
    unsigned_int.member("lights", "Storage allocated for light data")
    unsigned_int.member("total", "Total storage allocated for the full import.")
}.p

val aiTexel_p = struct(ASSIMP_PACKAGE, "AITexel", nativeName = "struct aiTexel", mutable = false) {
    documentation = "Helper structure to represent a texel in a ARGB8888 format. Used by aiTexture."

    unsigned_char.member("b", "The blue color component")
    unsigned_char.member("g", "The green color component")
    unsigned_char.member("r", "The red color component")
    unsigned_char.member("a", "The alpha color component")
}.p

val aiTexture_pp = struct(ASSIMP_PACKAGE, "AITexture", nativeName = "struct aiTexture", mutable = false) {
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

    unsigned_int.member(
        "mWidth",
        """
        Width of the texture, in pixels. If {@code mHeight} is zero the texture is compressed in a format like JPEG. In this case {@code mWidth} specifies the
        size of the memory area {@code pcData} is pointing to, in bytes.
        """
    )
    unsigned_int.member(
        "mHeight",
        "Height of the texture, in pixels. If this value is zero, {@code pcData} points to an compressed texture in any format (e.g. JPEG)."
    )
    charASCII.array(
        "achFormatHint",
        """
        A hint from the loader to make it easier for applications to determine the type of embedded compressed textures. If {@code mHeight != 0} this member is
        undefined. Otherwise it is set set to '\0\0\0\0' if the loader has no additional information about the texture file format used OR the file extension
        of the format without a trailing dot. If there are multiple file extensions for a format, the shortest extension is chosen (JPEG maps to 'jpg', not to
        'jpeg'). E.g. 'dds\0', 'pcx\0', 'jpg\0'. All characters are lower-case. The fourth character will always be '\0'.
        """,
        size = 4
    )
    aiTexel_p.buffer(
        "pcData",
        """
        Data of the texture. Points to an array of {@code mWidth * mHeight} ##AITexel's. The format of the texture data is always ARGB8888 to make the
        implementation for user of the library as easy as possible. If {@code mHeight = 0} this is a pointer to a memory buffer of size mWidth containing the
        compressed texture data. Good luck, have fun!
        """
    )
}.p.p

val aiColor4D_p = struct(ASSIMP_PACKAGE, "AIColor4D", nativeName = "struct aiColor4D") {
    documentation = "Represents a color in Red-Green-Blue space including an alpha component. Color values range from 0 to 1."

    float.member("r", "The red color component")
    float.member("g", "The green color component")
    float.member("b", "The blue color component")
    float.member("a", "The alpha color component")
}.p

val aiMatrix4x4 = struct(ASSIMP_PACKAGE, "AIMatrix4x4", nativeName = "struct aiMatrix4x4") {
    documentation = "Represents a row-major 4x4 matrix, use this for homogeneous coordinates."

    float.member("a1", "")
    float.member("a2", "")
    float.member("a3", "")
    float.member("a4", "")

    float.member("b1", "")
    float.member("b2", "")
    float.member("b3", "")
    float.member("b4", "")

    float.member("c1", "")
    float.member("c2", "")
    float.member("c3", "")
    float.member("c4", "")

    float.member("d1", "")
    float.member("d2", "")
    float.member("d3", "")
    float.member("d4", "")
}
val aiMatrix4x4_p = aiMatrix4x4.p

val aiMatrix3x3_p = struct(ASSIMP_PACKAGE, "AIMatrix3x3", nativeName = "struct aiMatrix3x3") {
    documentation = "Represents a row-major 3x3 matrix."

    float.member("a1", "")
    float.member("a2", "")
    float.member("a3", "")

    float.member("b1", "")
    float.member("b2", "")
    float.member("b3", "")

    float.member("c1", "")
    float.member("c2", "")
    float.member("c3", "")

    float.member("d1", "")
    float.member("d2", "")
    float.member("d3", "")
}.p

val aiMetadataType = "aiMetadataType".enumType

val aiMetadataEntry_p = struct(ASSIMP_PACKAGE, "AIMetaDataEntry", nativeName = "struct aiMetadataEntry") {
    aiMetadataType.member("mType", "")
    void_p.member("mData", "")
}.p

val aiMetadata_p = struct(ASSIMP_PACKAGE, "AIMetaData", nativeName = "struct aiMetadata") {
    AutoSize("mKeys", "mValues")..unsigned_int.member("mNumProperties", "Length of the {@code mKeys} and {@code mValues} arrays, respectively")
    aiString_p.buffer("mKeys", "Arrays of keys, may not be #NULL. Entries in this array may not be #NULL as well.")
    aiMetadataEntry_p.buffer(
        "mValues",
        "Arrays of values, may not be #NULL. Entries in this array may be #NULL if the corresponding property key has no assigned value."
    )
}.p

val aiNode_p = struct(ASSIMP_PACKAGE, "AINode", nativeName = "struct aiNode").p
val aiNode = struct(ASSIMP_PACKAGE, "AINode", nativeName = "struct aiNode") {
    documentation =
        """
        A node in the imported hierarchy.

        Each node has name, a parent node (except for the root node), a transformation relative to its parent and possibly several child nodes. Simple file
        formats don't support hierarchical structures - for these formats the imported scene does consist of only a single root node without children.
        """

    aiString.member("mName", "The name of the node.")
    aiMatrix4x4.member("mTransformation", "The transformation relative to the node's parent.")
    nullable..aiNode_p.member("mParent", "Parent node. #NULL if this node is the root node.")
    AutoSize("mChildren", optional = true)..unsigned_int.member("mNumChildren", "The number of child nodes of this node.")
    aiNode_p.p.member("mChildren", "The child nodes of this node. #NULL if {@code mNumChildren} is 0.")
    AutoSize("mMeshes", optional = true)..unsigned_int.member("mNumMeshes", "The number of meshes of this node.")
    unsigned_int_p.member("mMeshes", "The meshes of this node. Each entry is an index into the mesh list of the aiScene.")
    nullable..aiMetadata_p.member("mMetadata", "Metadata associated with this node or #NULL if there is no metadata.")
}

val aiFace_p = struct(ASSIMP_PACKAGE, "AIFace", nativeName = "struct aiFace") {
    documentation =
        """
        A single face in a mesh, referring to multiple vertices.

        If {@code mNumIndices} is 3, we call the face 'triangle', for {@code mNumIndices > 3} it's called 'polygon' (hey, that's just a definition!).

        ##AIMesh{@code ::mPrimitiveTypes} can be queried to quickly examine which types of primitive are actually present in a mesh. The #Process_SortByPType
        flag executes a special post-processing algorithm which splits meshes with *different* primitive types mixed up (e.g. lines and triangles) in several
        'clean' submeshes. Furthermore there is a configuration option (#AI_CONFIG_PP_SBP_REMOVE) to force #Process_SortByPType to remove specific kinds of
        primitives from the imported scene, completely and forever.
        """

    AutoSize("mIndices")..unsigned_int.member(
        "mNumIndices",
        "Number of indices defining this face. The maximum value for this member is #AI_MAX_FACE_INDICES."
    )
    unsigned_int_p.member("mIndices", "Pointer to the indices array. Size of the array is given in {@code numIndices}.")
}.p

val aiVertexWeight_p = struct(ASSIMP_PACKAGE, "AIVertexWeight", nativeName = "struct aiVertexWeight") {
    documentation = "A single influence of a bone on a vertex."

    unsigned_int.member("mVertexId", "Index of the vertex which is influenced by the bone.")
    float.member("mWeight", "The strength of the influence in the range (0...1). The influence from all bones at one vertex amounts to 1.")
}.p

val aiBone_pp = struct(ASSIMP_PACKAGE, "AIBone", nativeName = "struct aiBone") {
    documentation =
        """
        A single bone of a mesh.

        A bone has a name by which it can be found in the frame hierarchy and by which it can be addressed by animations. In addition it has a number of
        influences on vertices.
        """

    aiString.member("mName", "The name of the bone.")
    AutoSize("mWeights")..unsigned_int.member(
        "mNumWeights",
        "The number of vertices affected by this bone. The maximum value for this member is #AI_MAX_BONE_WEIGHTS."
    )
    aiVertexWeight_p.buffer("mWeights", "The vertices affected by this bone")
    aiMatrix4x4.member("mOffsetMatrix", "Matrix that transforms from mesh space to bone space in bind pose")
}.p.p

val aiAnimMesh_pp = struct(ASSIMP_PACKAGE, "AIAnimMesh", nativeName = "struct aiAnimMesh") {
    documentation =
        """
        NOT CURRENTLY IN USE. An AnimMesh is an attachment to an ##AIMesh stores per-vertex animations for a particular frame.

        You may think of an {@code aiAnimMesh} as a `patch` for the host mesh, which replaces only certain vertex data streams at a particular time. Each mesh
        stores n attached attached meshes (##AIMesh{@code ::mAnimMeshes}). The actual relationship between the time line and anim meshes is established by
        {@code aiMeshAnim}, which references singular mesh attachments by their ID and binds them to a time offset.
        """

    nullable..aiVector3D_p.buffer(
        "mVertices",
        """
        Replacement for ##AIMesh{@code ::mVertices}. If this array is non-#NULL, it *must* contain {@code mNumVertices} entries. The corresponding array in the
        host mesh must be non-#NULL as well - animation meshes may neither add or nor remove vertex components (if a replacement array is #NULL and the
        corresponding source array is not, the source data is taken instead).
        """
    )
    nullable..aiVector3D_p.buffer("mNormals", "Replacement for ##AIMesh{@code ::mNormals}.")
    nullable..aiVector3D_p.buffer("mTangents", "Replacement for ##AIMesh{@code ::mTangents}.")
    nullable..aiVector3D_p.buffer("mBitangents", "Replacement for ##AIMesh{@code ::mBitangents}.")
    nullable..aiColor4D_p.array("mColors", "Replacement for ##AIMesh{@code ::mColors}", size = "Assimp.AI_MAX_NUMBER_OF_COLOR_SETS")
    nullable..aiVector3D_p.array("mTextureCoords", "Replacement for ##AIMesh{@code ::mTextureCoords}", size = "Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS")
    AutoSize(
        "mVertices", "mNormals", "mTangents", "mBitangents"
    )..AutoSizeIndirect(
        "mColors", "mTextureCoords"
    )..unsigned_int.member(
        "mNumVertices",
        """
        The number of vertices in the {@code aiAnimMesh}, and thus the length of all the member arrays. This has always the same value as the
        {@code mNumVertices} property in the corresponding ##AIMesh. It is duplicated here merely to make the length of the member arrays accessible even if
        the {@code aiMesh} is not known, e.g. from language bindings.
        """
    )
}.p.p

val aiMesh_pp = struct(ASSIMP_PACKAGE, "AIMesh", nativeName = "struct aiMesh") {
    documentation =
        """
        A mesh represents a geometry or model with a single material.

        It usually consists of a number of vertices and a series of primitives/faces referencing the vertices. In addition there might be a series of bones,
        each of them addressing a number of vertices with a certain weight. Vertex data is presented in channels with each channel containing a single
        per-vertex information such as a set of texture coords or a normal vector. If a data pointer is non-null, the corresponding data stream is present.

        A Mesh uses only a single material which is referenced by a material ID.
        """

    unsigned_int.member(
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
    )..unsigned_int.member(
        "mNumVertices",
        """
        The number of vertices in this mesh. This is also the size of all of the per-vertex data arrays. The maximum value for this member is #AI_MAX_VERTICES.
        """
    )
    AutoSize("mFaces")..unsigned_int.member(
        "mNumFaces",
        """
        The number of primitives (triangles, polygons, lines) in this mesh. This is also the size of the mFaces array. The maximum value for this member is
        #AI_MAX_FACES.
        """
    )
    aiVector3D_p.buffer("mVertices", "Vertex positions. This array is always present in a mesh. The array is {@code mNumVertices} in size.")
    nullable..aiVector3D_p.buffer(
        "mNormals",
        """
        Vertex normals. The array contains normalized vectors, #NULL if not present. The array is {@code mNumVertices} in size. Normals are undefined for point
        and line primitives. A mesh consisting of points and lines only may not have normal vectors. Meshes with mixed primitive types (i.e. lines and
        triangles) may have normals, but the normals for vertices that are only referenced by point or line primitives are undefined and set to {@code qNaN}.
        """
    )
    nullable..aiVector3D_p.buffer(
        "mTangents",
        """
        Vertex tangents. The tangent of a vertex points in the direction of the positive X texture axis. The array contains normalized vectors, #NULL if not
        present. The array is {@code mNumVertices} in size. A mesh consisting of points and lines only may not have normal vectors. Meshes with mixed primitive
        types (i.e. lines and triangles) may have normals, but the normals for vertices that are only referenced by point or line primitives are undefined and
        set to {@code qNaN}.
        """
    )
    nullable..aiVector3D_p.buffer(
        "mBitangents",
        """
        Vertex bitangents. The bitangent of a vertex points in the direction of the positive Y texture axis. The array contains normalized vectors, #NULL if
        not present. The array is {@code mNumVertices} in size.
        """
    )
    nullable..aiColor4D_p.array(
        "mColors",
        """
        Vertex color sets. A mesh may contain 0 to #AI_MAX_NUMBER_OF_COLOR_SETS vertex colors per vertex. #NULL if not present. Each array is
        {@code mNumVertices} in size if present.
        """,
        size = "Assimp.AI_MAX_NUMBER_OF_COLOR_SETS"
    )
    nullable..aiVector3D_p.array(
        "mTextureCoords",
        """
        Vertex texture coords, also known as UV channels. A mesh may contain 0 to #AI_MAX_NUMBER_OF_TEXTURECOORDS per vertex. #NULL if not present. The array
        is {@code mNumVertices} in size.
        """,
        size = "Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS"
    )
    unsigned_int.array(
        "mNumUVComponents",
        """
        Specifies the number of components for a given UV channel. Up to three channels are supported (UVW, for accessing volume or cube maps). If the value is
        2 for a given channel n, the component {@code p.z} of {@code mTextureCoords[n][p]} is set to 0.0f. If the value is 1 for a given channel, {@code p.y}
        is set to 0.0f, too.
        """,
        size = "Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS"
    )
    aiFace_p.buffer(
        "mFaces",
        """
        The faces the mesh is constructed from. Each face refers to a number of vertices by their indices. This array is always present in a mesh, its size is
        given in {@code mNumFaces}. If the #AI_SCENE_FLAGS_NON_VERBOSE_FORMAT is NOT set each face references an unique set of vertices.
        """
    )
    AutoSize("mBones", optional = true)..unsigned_int.member("mNumBones", "The number of bones this mesh contains. Can be 0, in which case the {@code mBones} array is #NULL.")
    aiBone_pp.member(
        "mBones",
        "The bones of this mesh. A bone consists of a name by which it can be found in the frame hierarchy and a set of vertex weights."
    )
    unsigned_int.member(
        "mMaterialIndex",
        """
        The material used by this mesh. A mesh uses only a single material. If an imported model uses multiple materials, the import splits up the mesh. Use
        this value as index into the scene's material list.
        """
    )
    aiString.member(
        "mName",
        """
        Name of the mesh. Meshes can be named, but this is not a requirement and leaving this field empty is totally fine. There are mainly three uses for mesh
        names: - some formats name nodes and meshes independently. - importers tend to split meshes up to meet the one-material-per-mesh requirement. Assigning
        the same (dummy) name to each of the result meshes aids the caller at recovering the original mesh partitioning. - Vertex animations refer to meshes by
        their names.
        """
    )
    AutoSize("mAnimMeshes", optional = true)..unsigned_int.member("mNumAnimMeshes", "NOT CURRENTLY IN USE. The number of attachment meshes")
    aiAnimMesh_pp.member(
        "mAnimMeshes",
        """
        NOT CURRENTLY IN USE. Attachment meshes for this mesh, for vertex-based animation. Attachment meshes carry replacement data for some of the mesh'es
        vertex components (usually positions, normals).
        """
    )
}.p.p

val aiUVTransform_p = struct(ASSIMP_PACKAGE, "AIUVTransform", nativeName = "struct aiUVTransform", mutable = false) {
    documentation =
        """
        Defines how an UV channel is transformed.

        This is just a helper structure for the #_AI_MATKEY_UVTRANSFORM_BASE key. See its documentation for more details.

        Typically you'll want to build a matrix of this information. However, we keep separate scaling/translation/rotation values to make it easier to process
        and optimize UV transformations internally.
        """

    aiVector2D.member("mTranslation", "Translation on the u and v axes. The default value is (0|0).")
    aiVector2D.member("mScaling", "Scaling on the u and v axes. The default value is (1|1).")
    float.member(
        "mRotation",
        "Rotation - in counter-clockwise direction. The rotation angle is specified in radians. The rotation center is 0.5f|0.5f. The default value 0.f."
    )
}.p

val aiPropertyTypeInfo = "aiPropertyTypeInfo".enumType

val aiMaterialProperty_pp = struct(ASSIMP_PACKAGE, "AIMaterialProperty", nativeName = "struct aiMaterialProperty", mutable = false) {
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

    aiString.member("mKey", "Specifies the name of the property (key). Keys are generally case insensitive.")
    unsigned_int.member(
        "mSemantic",
        "Textures: Specifies their exact usage semantic. For non-texture properties, this member is always 0 (or, better-said, #TextureType_NONE)."
    )
    unsigned_int.member("mIndex", "Textures: Specifies the index of the texture. For non-texture properties, this member is always 0.")
    AutoSize("mData")..unsigned_int.member("mDataLength", "Size of the buffer {@code mData} is pointing to, in bytes. This value may not be 0.")
    aiPropertyTypeInfo.member(
        "mType",
        """
        Type information for the property. Defines the data layout inside the data buffer. This is used by the library internally to perform debug checks and
        to utilize proper type conversions. (It's probably a hacky solution, but it works.)
        """
    )
    char_p.member("mData", "Binary buffer to hold the property's value. The size of the buffer is always mDataLength.")
}.p.p

val aiMaterial_p = struct(ASSIMP_PACKAGE, "AIMaterial", nativeName = "struct aiMaterial") {
    documentation =
        """
        Data structure for a material.

        Material data is stored using a key-value structure. A single key-value pair is called a 'material property'. C++ users should use the provided member
        functions of {@code aiMaterial} to process material properties, C users have to stick with the {@code aiMaterialGetXXX} family of unbound functions.
        The library defines a set of standard keys (AI_MATKEY_XXX).
        """

    aiMaterialProperty_pp.member("mProperties", "List of all material properties loaded.")
    AutoSize("mProperties")..unsigned_int.member("mNumProperties", "Number of properties in the data base")
    unsigned_int.member("mStorageAllocated", "Storage allocated")
}.p
val aiMaterial_pp = aiMaterial_p.p

val aiQuaternion = struct(ASSIMP_PACKAGE, "AIQuaternion", nativeName = "struct aiQuaternion") {
    documentation = "Represents a quaternion in a 4D vector."

    float.member("w", "The w component")
    float.member("x", "The x component")
    float.member("y", "The y component")
    float.member("z", "The z component")
}
val aiQuaternion_p = aiQuaternion.p

val aiVectorKey_p = struct(ASSIMP_PACKAGE, "AIVectorKey", nativeName = "struct aiVectorKey") {
    documentation = "A time-value pair specifying a certain 3D vector for the given time."

    double.member("mTime", "The time of this key")
    aiVector3D.member("mValue", "The value of this key")
}.p

val aiQuatKey_p = struct(ASSIMP_PACKAGE, "AIQuatKey", nativeName = "struct aiQuatKey") {
    documentation = "A time-value pair specifying a rotation for the given time. Rotations are expressed with quaternions."

    double.member("mTime", "The time of this key")
    aiQuaternion.member("mValue", "The value of this key")
}.p

val aiMeshKey_p = struct(ASSIMP_PACKAGE, "AIMeshKey", nativeName = "struct aiMeshKey") {
    documentation = "Binds a anim mesh to a specific point in time."

    double.member("mTime", "The time of this key")
    unsigned_int.member(
        "mValue",
        """
        Index into the ##AIMesh{@code ::mAnimMeshes} array of the mesh coresponding to the ##AIMeshAnim hosting this key frame. The referenced anim mesh is
        evaluated according to the rules defined in the docs for ##AIAnimMesh.
        """
    )
}.p

val aiAnimBehaviour = "aiAnimBehaviour".enumType

val aiNodeAnim_pp = struct(ASSIMP_PACKAGE, "AINodeAnim", nativeName = "struct aiNodeAnim") {
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

    aiString.member("mNodeName", "The name of the node affected by this animation. The node must exist and it must be unique.")
    AutoSize("mPositionKeys", optional = true)..unsigned_int.member("mNumPositionKeys", "The number of position keys")
    aiVectorKey_p.buffer(
        "mPositionKeys",
        """
        The position keys of this animation channel. Positions are specified as 3D vector. The array is {@code mNumPositionKeys} in size. If there are position
        keys, there will also be at least one scaling and one rotation key.
        """
    )
    AutoSize("mRotationKeys", optional = true)..unsigned_int.member("mNumRotationKeys", "The number of rotation keys")
    aiQuatKey_p.buffer(
        "mRotationKeys",
        """
        The rotation keys of this animation channel. Rotations are given as quaternions,  which are 4D vectors. The array is {@code mNumRotationKeys} in size.
        If there are rotation keys, there will also be at least one scaling and one position key.
        """
    )
    AutoSize("mScalingKeys", optional = true)..unsigned_int.member("mNumScalingKeys", "The number of scaling keys")
    aiVectorKey_p.buffer(
        "mScalingKeys",
        """
        The scaling keys of this animation channel. Scalings are specified as 3D vector. The array is {@code mNumScalingKeys} in size. If there are scaling
        keys, there will also be at least one position and one rotation key.
        """
    )
    aiAnimBehaviour.member(
        "mPreState",
        """
        Defines how the animation behaves before the first key is encountered. The default value is aiAnimBehaviour_DEFAULT (the original transformation matrix
        of the affected node is used).
        """
    )
    aiAnimBehaviour.member(
        "mPostState",
        """
        Defines how the animation behaves after the last key was processed. The default value is aiAnimBehaviour_DEFAULT (the original transformation matrix of
        the affected node is taken).
        """
    )
}.p.p

val aiMeshAnim_pp = struct(ASSIMP_PACKAGE, "AIMeshAnim", nativeName = "struct aiMeshAnim") {
    documentation =
        """
        Describes vertex-based animations for a single mesh or a group of meshes. Meshes carry the animation data for each frame in their
        ##AIMesh{@code ::mAnimMeshes} array. The purpose of {@code aiMeshAnim} is to define keyframes linking each mesh attachment to a particular point in
        time.
        """

    aiString.member(
        "mName",
        """
        Name of the mesh to be animated. An empty string is not allowed, animated meshes need to be named (not necessarily uniquely, the name can basically
        serve as wildcard to select a group of meshes with similar animation setup)
        """)
    AutoSize("mKeys")..unsigned_int.member("mNumKeys", "Size of the {@code mKeys} array. Must be 1, at least.")
    aiMeshKey_p.buffer("mKeys", "Key frames of the animation. May not be #NULL.")
}.p.p

val aiAnimation_pp = struct(ASSIMP_PACKAGE, "AIAnimation", nativeName = "struct aiAnimation") {
    documentation =
        """
        An animation consists of keyframe data for a number of nodes. For each node affected by the animation a separate series of data is given.
        """

    aiString.member(
        "mName",
        """
        The name of the animation. If the modeling package this data was exported from does support only a single animation channel, this name is usually empty
        (length is zero).
        """
    )
    double.member("mDuration", "Duration of the animation in ticks.")
    double.member("mTicksPerSecond", "Ticks per second. 0 if not specified in the imported file")
    AutoSize("mChannels")..unsigned_int.member("mNumChannels", "The number of bone animation channels. Each channel affects a single node.")
    aiNodeAnim_pp.member("mChannels", "The node animation channels. Each channel affects a single node. The array is {@code mNumChannels} in size.")
    AutoSize("mMeshChannels")..unsigned_int.member(
        "mNumMeshChannels",
        "The number of mesh animation channels. Each channel affects a single mesh and defines vertex-based animation."
    )
    aiMeshAnim_pp.member("mMeshChannels", "The mesh animation channels. Each channel affects a single mesh. The array is {@code mNumMeshChannels} in size.")
}.p.p

val aiLightSourceType = "aiLightSourceType".enumType

val aiLight_pp = struct(ASSIMP_PACKAGE, "AILight", nativeName = "struct aiLight", mutable = false) {
    documentation =
        """
        Helper structure to describe a light source.

        Assimp supports multiple sorts of light sources, including directional, point and spot lights. All of them are defined with just a single structure and
        distinguished by their parameters. Note - some file formats (such as 3DS, ASE) export a "target point" - the point a spot light is looking at (it can
        even be animated). Assimp writes the target point as a subnode of a spotlights's main node, called "&lt;spotName&gt;.Target". However, this is just
        additional information then, the transformation tracks of the main node make the spot light already point in the right direction.
        """

    aiString.member(
        "mName",
        """
        The name of the light source. There must be a node in the scenegraph with the same name. This node specifies the position of the light in the scene
        hierarchy and can be animated.
        """
    )
    aiLightSourceType.member("mType", "The type of the light source. #LightSource_UNDEFINED is not a valid value for this member.")
    aiVector3D.member(
        "mPosition",
        """
        Position of the light source in space. Relative to the transformation of the node corresponding to the light. The position is undefined for directional
        lights.
        """
    )
    aiVector3D.member(
        "mDirection",
        """
        Direction of the light source in space. Relative to the transformation of the node corresponding to the light. The direction is undefined for point
        lights. The vector may be normalized, but it needn't.
        """
    )
    aiVector3D.member(
        "mUp",
        """
        Up direction of the light source in space. Relative to the transformation of the node corresponding to the light. The direction is undefined for point
        lights. The vector may be normalized, but it needn't.
        """
    )
    float.member(
        "mAttenuationConstant",
        """
        Constant light attenuation factor. The intensity of the light source at a given distance 'd' from the light's position is
        {@code Atten = 1/( att0 + att1 * d + att2 * d*d)}. This member corresponds to the att0 variable in the equation. Naturally undefined for directional
        lights.
        """
    )
    float.member(
        "mAttenuationLinear",
        """
        Linear light attenuation factor. The intensity of the light source at a given distance 'd' from the light's position is
        {@code Atten = 1/( att0 + att1 * d + att2 * d*d)}. This member corresponds to the att1 variable in the equation. Naturally undefined for directional
        lights.
        """
    )
    float.member(
        "mAttenuationQuadratic",
        """
        Quadratic light attenuation factor. The intensity of the light source at a given distance 'd' from the light's position is
        {@code Atten = 1/( att0 + att1 * d + att2 * d*d)}. This member corresponds to the att2 variable in the equation. Naturally undefined for directional
        lights.
        """
    )
    aiColor3D.member(
        "mColorDiffuse",
        """
        Diffuse color of the light source. The diffuse light color is multiplied with the diffuse material color to obtain the final color that contributes to
        the diffuse shading term.
        """
    )
    aiColor3D.member(
        "mColorSpecular",
        """
        Specular color of the light source. The specular light color is multiplied with the specular material color to obtain the final color that contributes
        to the specular shading term.
        """
    )
    aiColor3D.member(
        "mColorAmbient",
        """
        Ambient color of the light source. The ambient light color is multiplied with the ambient material color to obtain the final color that contributes to
        the ambient shading term. Most renderers will ignore this value it, is just a remaining of the fixed-function pipeline that is still supported by quite
        many file formats.
        """
    )
    float.member(
        "mAngleInnerCone",
        """
        Inner angle of a spot light's light cone. The spot light has maximum influence on objects inside this angle. The angle is given in radians. It is 2PI
        for point lights and undefined for directional lights.
        """
    )
    float.member(
        "mAngleOuterCone",
        """
        Outer angle of a spot light's light cone. The spot light does not affect objects outside this angle. The angle is given in radians. It is 2PI for point
        lights and undefined for directional lights. The outer angle must be greater than or equal to the inner angle. It is assumed that the application uses
        a smooth interpolation between the inner and the outer cone of the spot light.
        """
    )
    aiVector2D.member("mSize", "Size of area light source.")
}.p.p

val aiCamera_pp = struct(ASSIMP_PACKAGE, "AICamera", nativeName = "struct aiCamera") {
    documentation =
        """
        Helper structure to describe a virtual camera.

        Cameras have a representation in the node graph and can be animated. An important aspect is that the camera itself is also part of the scenegraph. This
        means, any values such as the look-at vector are not *absolute*, they're <b>relative</b> to the coordinate system defined by the node which corresponds
        to the camera. This allows for camera animations. For static cameras parameters like the 'look-at' or 'up' vectors are usually specified directly in
        {@code aiCamera}, but beware, they could also be encoded in the node transformation.
        """

    aiString.member(
        "mName",
        """
        The name of the camera. There must be a node in the scenegraph with the same name. This node specifies the position of the camera in the scene
        hierarchy and can be animated.
        """
    )
    aiVector3D.member("mPosition", "Position of the camera relative to the coordinate space defined by the corresponding node. The default value is 0|0|0.")
    aiVector3D.member(
        "mUp",
        """
        'Up' - vector of the camera coordinate system relative to the coordinate space defined by the corresponding node. The 'right' vector of the camera
        coordinate system is the cross product of  the up and lookAt vectors. The default value is 0|1|0. The vector may be normalized, but it needn't.
        """
    )
    aiVector3D.member(
        "mLookAt",
        """
        'LookAt' - vector of the camera coordinate system relative to the coordinate space defined by the corresponding node. This is the viewing direction of
        the user. The default value is 0|0|1. The vector may be normalized, but it needn't.
        """
    )
    float.member(
        "mHorizontalFOV",
        """
        Half horizontal field of view angle, in radians. The field of view angle is the angle between the center line of the screen and the left or right
        border. The default value is 1/4PI.
        """
    )
    float.member(
        "mClipPlaneNear",
        """
        Distance of the near clipping plane from the camera. The value may not be 0.f (for arithmetic reasons to prevent a division through zero). The default
        value is 0.1f.
        """
    )
    float.member(
        "mClipPlaneFar",
        """Distance of the far clipping plane from the camera. The far clipping plane must, of course, be further away than the near clipping plane. The
        default value is 1000.f. The ratio between the near and the far plane should not be too large (between 1000-10000 should be ok) to avoid floating-point
        inaccuracies which could lead to z-fighting.
        """
    )
    float.member(
        "mAspect",
        """
        Screen aspect ratio. This is the ration between the width and the height of the screen. Typical values are 4/3, 1/2 or 1/1. This value is 0 if the
        aspect ratio is not defined in the source file. 0 is also the default value.
        """
    )
}.p.p

val aiScene_p = struct(ASSIMP_PACKAGE, "AIScene", nativeName = "struct aiScene") {
    documentation =
        """
        The root structure of the imported data.

        Everything that was imported from the given file can be accessed from here. Objects of this class are generally maintained and owned by Assimp, not by
        the caller. You shouldn't want to instance it, nor should you ever try to delete a given scene on your own.
        """

    unsigned_int.member(
        "mFlags",
        """
        Any combination of the AI_SCENE_FLAGS_XXX flags. By default this value is 0, no flags are set. Most applications will want to reject all scenes with
        the AI_SCENE_FLAGS_INCOMPLETE bit set.
        """
    ).links("AI_SCENE_FLAGS_\\w+", LinkMode.BITFIELD)
    nullable..aiNode_p.member(
        "mRootNode",
        """
        The root node of the hierarchy. There will always be at least the root node if the import was successful (and no special flags have been set). Presence
        of further nodes depends on the format and content of the imported file.
        """
    )
    AutoSize("mMeshes", optional = true)..unsigned_int.member("mNumMeshes", "The number of meshes in the scene.")
    aiMesh_pp.member(
        "mMeshes",
        """
        The array of meshes. Use the indices given in the ##AINode structure to access this array. The array is {@code mNumMeshes} in size. If the
        #AI_SCENE_FLAGS_INCOMPLETE flag is not set there will always be at least ONE material.
        """
    )
    AutoSize("mMaterials", optional = true)..unsigned_int.member("mNumMaterials", "The number of materials in the scene.")
    aiMaterial_pp.member(
        "mMaterials",
        """
        The array of materials. Use the index given in each ##AIMesh structure to access this array. The array is {@code mNumMaterials} in size. If the
        #AI_SCENE_FLAGS_INCOMPLETE flag is not set there will always be at least ONE material.
        """
    )
    AutoSize("mAnimations", optional = true)..unsigned_int.member("mNumAnimations", "The number of animations in the scene.")
    aiAnimation_pp.member(
        "mAnimations",
        "The array of animations. All animations imported from the given file are listed here. The array is {@code mNumAnimations} in size."
    )
    AutoSize("mTextures", optional = true)..unsigned_int.member("mNumTextures", "The number of textures embedded into the file")
    aiTexture_pp.member(
        "mTextures",
        """
        The array of embedded textures. Not many file formats embed their textures into the file. An example is Quake's MDL format (which is also used by some
        GameStudio versions)
        """
    )
    AutoSize("mLights", optional = true)..unsigned_int.member(
        "mNumLights",
        "The number of light sources in the scene. Light sources are fully optional, in most cases this attribute will be 0"
    )
    aiLight_pp.member(
        "mLights",
        "The array of light sources. All light sources imported from the given file are listed here. The array is {@code mNumLights} in size."
    )
    AutoSize("mCameras", optional = true)..unsigned_int.member(
        "mNumCameras",
        "The number of cameras in the scene. Cameras are fully optional, in most cases this attribute will be 0"
    )
    aiCamera_pp.member(
        "mCameras",
        """
        The array of cameras. All cameras imported from the given file are listed here. The array is {@code mNumCameras} in size. The first camera in the array
        (if existing) is the default camera view into the scene.
        """
    )

    char_p.member("mPrivate", "Internal use only, do not touch!").public = false
}.p
val aiScene_pp = aiScene_p.p

val aiReturn = "aiReturn".enumType
val aiTextureType = "aiTextureType".enumType
val aiTextureMapping_p = "aiTextureMapping".enumType.p
val aiTextureOp_p = "aiTextureOp".enumType.p
val aiTextureMapMode_p = "aiTextureMapMode".enumType.p

val aiImporterDesc_p = struct(ASSIMP_PACKAGE, "AIImporterDesc", nativeName = "struct aiImporterDesc") {
    documentation =
        """
        Meta information about a particular importer. Importers need to fill this structure, but they can freely decide how talkative they are. A common use
        case for loader meta info is a user interface in which the user can choose between various import/export file formats. Building such an UI by hand
        means a lot of maintenance as importers / exporters are added to Assimp, so it might be useful to have a common mechanism to query some rough importer
        characteristics.
        """

    const..charASCII_p.member("mName", "Full name of the importer (i.e. Blender3D importer)")
    const..charUTF8_p.member("mAuthor", "Original author (left blank if unknown or whole assimp team)")
    const..charUTF8_p.member("mMaintainer", "Current maintainer, left blank if the author maintains")
    const..charUTF8_p.member("mComments", "Implementation comments, i.e. unimplemented features")

    unsigned_int.member("mFlags", "These flags indicate some characteristics common to many importers.")
    unsigned_int.member("mMinMajor", "Minimum major format that can be loaded in major.minor style.")
    unsigned_int.member("mMinMinor", "Minimum minor format that can be loaded in major.minor style.")
    unsigned_int.member("mMaxMajor", "Maximum major format that can be loaded in major.minor style.")
    unsigned_int.member("mMaxMinor", "Maximum minor format that can be loaded in major.minor style.")

    const..charASCII_p.member(
        "mFileExtensions",
        """
        List of file extensions this importer can handle. List entries are separated by space characters. All entries are lower case without a leading dot
        (i.e. "xml dae" would be a valid value. Note that multiple importers may respond to the same file extension - assimp calls all importers in the order
        in which they are registered and each importer gets the opportunity to load the file until one importer "claims" the file. Apart from file extension
        checks, importers typically use other methods to quickly reject files (i.e. magic words) so this does not mean that common or generic file extensions
        such as XML would be tediously slow.
        """
    )
}.p

val aiFile_p = struct(ASSIMP_PACKAGE, "AIFile", nativeName = "struct aiFile").p
val aiFileIO_p = struct(ASSIMP_PACKAGE, "AIFileIO", nativeName = "struct aiFileIO").p

val aiFileWriteProc = "aiFileWriteProc".callback(
    ASSIMP_PACKAGE, size_t, "AIFileWriteProc",
    "File write procedure.",

    aiFile_p.IN("pFile", "File pointer to write to"),
    const..char_p.IN("pBuffer", "The buffer to be written"),
    size_t.IN("memB", "Size of the individual element to be written"),
    size_t.IN("count", "Number of elements to be written")
)

val aiFileReadProc = "aiFileReadProc".callback(
    ASSIMP_PACKAGE, size_t, "AIFileReadProc",
    "File read procedure",

    aiFile_p.IN("pFile", "File pointer to read from"),
    char_p.IN("pBuffer", "The buffer to read the values"),
    size_t.IN("size", "Size in bytes of each element to be read"),
    size_t.IN("count", "Number of elements to be read")
)

val aiFileTellProc = "aiFileTellProc".callback(
    ASSIMP_PACKAGE, size_t, "AIFileTellProc",
    "File tell procedure.",

    aiFile_p.IN("pFile", "File pointer to find ftell() on")
)

val aiFileFlushProc = "aiFileFlushProc".callback(
    ASSIMP_PACKAGE, void, "AIFileFlushProc",
    "File flush procedure.",

    aiFile_p.IN("pFile", "File pointer to flush")
)

val aiOrigin = "aiOrigin".enumType

val aiFileSeek = "aiFileSeek".callback(
    ASSIMP_PACKAGE, aiReturn, "AIFileSeek",
    "File seek procedure",

    aiFile_p.IN("pFile", "File pointer to seek to"),
    size_t.IN("offset", "Number of bytes to shift from origin"),
    aiOrigin.IN("origin", "Position used as reference for the offset.")
)

val aiFileOpenProc = "aiFileOpenProc".callback(
    ASSIMP_PACKAGE, aiFile_p, "AIFileOpenProc",
    "File open procedure",

    aiFileIO_p.IN("pFileIO", "FileIO system pointer"),
    const..charUTF8_p.IN("fileName", "The name of the file to be opened"),
    const..charUTF8_p.IN("openMode", "The mode in which to open the file")
)

val aiFileCloseProc = "aiFileCloseProc".callback(
    ASSIMP_PACKAGE, void, "AIFileCloseProc",
    "File close procedure",

    aiFileIO_p.IN("pFileIO", "FileIO system pointer"),
    aiFile_p.IN("pFile", "File pointer to close")
)

val aiUserData = typedef(opaque_p, "aiUserData")

val aiFileIO = struct(ASSIMP_PACKAGE, "AIFileIO", nativeName = "struct aiFileIO") {
    documentation =
        """
        Provided are functions to open and close files. Supply a custom structure to the import function. If you don't, a default implementation is used. Use
        custom file systems to enable reading from other sources, such as ZIPs or memory locations.
        """

    aiFileOpenProc.member("OpenProc", "Function used to open a new file")
    aiFileCloseProc.member("CloseProc", "Function used to close an existing file")
    aiUserData.member("UserData", "User-defined, opaque data")
}

val aiFile = struct(ASSIMP_PACKAGE, "AIFile", nativeName = "struct aiFile") {
    documentation = """
        Actually, it's a data structure to wrap a set of fXXXX (e.g fopen) replacement functions.

        The default implementation of the functions utilizes the fXXX functions from the CRT. However, you can supply a custom implementation to Assimp by
        delivering a custom ##AIFileIO. Use this to enable reading from other sources, such as ZIP archives or memory locations.
        """

    aiFileReadProc.member("ReadProc", "Callback to read from a file")
    aiFileWriteProc.member("WriteProc", "Callback to write to a file")
    aiFileTellProc.member("TellProc", "Callback to retrieve the current position of the file cursor (ftell())")
    aiFileTellProc.member("FileSizeProc", "Callback to retrieve the size of the file, in bytes")
    aiFileSeek.member("SeekProc", "Callback to set the current position of the file cursor (fseek())")
    aiFileFlushProc.member("FlushProc", "Callback to flush the file contents")
    aiUserData.member("UserData", "User-defined, opaque data")
}

val aiLogStreamCallback = "aiLogStreamCallback".callback(
    ASSIMP_PACKAGE, void, "AILogStreamCallback",
    "Callback to be called for log stream messages",

    const..charUTF8_p.IN("message", "The message to be logged"),
    opaque_p.IN("user", "The user data from the log stream")
)

val aiLogStream = struct(ASSIMP_PACKAGE, "AILogStream", nativeName = "struct aiLogStream") {
    documentation = "Represents a log stream. A log stream receives all log messages and streams them somewhere"

    aiLogStreamCallback.member("callback", "callback to be called")
    opaque_p.member("user", "user data to be passed to the callback")
}
val aiLogStream_p = aiLogStream.p

val aiPropertyStore_p = struct(ASSIMP_PACKAGE, "AIPropertyStore", nativeName = "struct aiPropertyStore") {
    documentation = "Represents an opaque set of settings to be used during importing."

    char.member("sentinel", "")
}.p

val aiBool = typedef(intb, "aiBool")
val aiDefaultLogStream = "aiDefaultLogStream".enumType

val aiExportFormatDesc_p = struct(ASSIMP_PACKAGE, "AIExportFormatDesc", nativeName = "struct aiExportFormatDesc") {
    documentation = """
        Describes an file format which Assimp can export to. Use #GetExportFormatCount() to learn how many export formats the current Assimp build supports and
        #GetExportFormatDescription() to retrieve a description of an export format option.
        """

    const..charUTF8_p.member(
        "id",
        """
        a short string ID to uniquely identify the export format. Use this ID string to specify which file format you want to export to when calling
        #ExportScene(). Example: "dae" or "obj"
        """
    )
    const..charUTF8_p.member(
        "description",
        "A short description of the file format to present to users. Useful if you want to allow the user to select an export format."
    )
    const..charUTF8_p.member("fileExtension", "Recommended file extension for the exported file in lower case.")
}.p

val aiExportDataBlob_p = struct(ASSIMP_PACKAGE, "AIExportDataBlob", nativeName = "struct aiExportDataBlob").p
val aiExportDataBlob = struct(ASSIMP_PACKAGE, "AIExportDataBlob", nativeName = "struct aiExportDataBlob") {
    documentation = """
        Describes a blob of exported scene data. Use #ExportSceneToBlob() to create a blob containing an exported scene. The memory referred by this structure
        is owned by Assimp. to free its resources. Don't try to free the memory on your side - it will crash for most build configurations due to conflicting
        heaps.

        Blobs can be nested - each blob may reference another blob, which may in turn reference another blob and so on. This is used when exporters write more
        than one output file for a given ##AIScene. See the remarks for {@code aiExportDataBlob::name} for more information.
        """

    AutoSize("data")..size_t.member("size", "Size of the data in bytes")
    void_p.member("data", "The data.")
    aiString.member(
        "name",
        """
        Name of the blob. An empty string always indicates the first (and primary) blob, which contains the actual file data. Any other blobs are auxiliary
        files produced by exporters (i.e. material files). Existence of such files depends on the file format. Most formats don't split assets across multiple
        files.

        If used, blob names usually contain the file extension that should be used when writing the data to disc.
        """
    )

    nullable..aiExportDataBlob_p.member("next", "Pointer to the next blob in the chain or NULL if there is none.")
}