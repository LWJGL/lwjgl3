/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package assimp

import org.lwjgl.generator.*
import java.io.*

val ASSIMP_BINDING = object : SimpleBinding(Module.ASSIMP, "ASSIMP") {
    override fun generateFunctionSetup(writer: PrintWriter, nativeClass: NativeClass) {
        with(writer) {
            println("\n${t}private static final SharedLibrary DRACO = Library.loadNative(Assimp.class, \"${module.java}\", Configuration.ASSIMP_DRACO_LIBRARY_NAME.get(Platform.mapLibraryNameBundled(\"draco\")), true);")
            println("${t}private static final SharedLibrary ASSIMP = Library.loadNative(Assimp.class, \"${module.java}\", Configuration.ASSIMP_LIBRARY_NAME.get(Platform.mapLibraryNameBundled(\"assimp\")), true);")
            generateFunctionsClass(nativeClass, "\n$t/** Contains the function pointers loaded from the assimp {@link SharedLibrary}. */")
            println("""
    /** Returns the assimp {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return ASSIMP;
    }

    /** Returns the Draco {@link SharedLibrary}. */
    public static SharedLibrary getDraco() {
        return DRACO;
    }""")
        }
    }
}

val ai_int32 = typedef(int32_t, "ai_int32")
val ai_uint32 = typedef(uint32_t, "ai_uint32")
val ai_real = typedef(float, "ai_real")

val aiAnimInterpolation = "aiAnimInterpolation".enumType

/*val aiPlane = struct(Binding.ASSIMP, "AIPlane", nativeName = "struct aiPlane") {
    float("a")
    float("b")
    float("c")
    float("d")
}*/

val aiVector2D = struct(Module.ASSIMP, "AIVector2D", nativeName = "struct aiVector2D", mutable = false) {
    float("x")
    float("y")
}

val aiVector3D = struct(Module.ASSIMP, "AIVector3D", nativeName = "struct aiVector3D") {
    float("x")
    float("y")
    float("z")
}

val aiAABB = struct(Module.ASSIMP, "AIAABB", nativeName = "struct aiAABB") {
    aiVector3D("mMin")
    aiVector3D("mMax")
}

/*val aiRay = struct(Binding.ASSIMP, "AIRay", nativeName = "struct aiRay") {
    aiVector3D("pos")
    aiVector3D("dir")
}*/

val aiColor3D = struct(Module.ASSIMP, "AIColor3D", nativeName = "struct aiColor3D", mutable = false) {
    float("r")
    float("g")
    float("b")
}

val aiString = struct(Module.ASSIMP, "AIString", nativeName = "struct aiString") {
    AutoSize("data")..ai_uint32("length")
    NullTerminatedMember..charUTF8("data")["Assimp.MAXLEN"]
}

val aiMemoryInfo = struct(Module.ASSIMP, "AIMemoryInfo", nativeName = "struct aiMemoryInfo", mutable = false) {
    unsigned_int("textures")
    unsigned_int("materials")
    unsigned_int("meshes")
    unsigned_int("nodes")
    unsigned_int("animations")
    unsigned_int("cameras")
    unsigned_int("lights")
    unsigned_int("total")
}

/*val aiBuffer = struct(Module.ASSIMP, "AIBuffer", nativeName = "struct aiBuffer", mutable = false) {
    char.const.p("data")
    char.const.p("end")
}*/

val aiTexel = struct(Module.ASSIMP, "AITexel", nativeName = "struct aiTexel", mutable = false) {
    unsigned_char("b")
    unsigned_char("g")
    unsigned_char("r")
    unsigned_char("a")
}

private const val HINTMAXTEXTURELEN = 9
val aiTexture = struct(Module.ASSIMP, "AITexture", nativeName = "struct aiTexture", mutable = false) {
    AutoSize("pcData")..unsigned_int("mWidth")
    AutoSize("pcData")..unsigned_int("mHeight")
    charASCII("achFormatHint")[HINTMAXTEXTURELEN] // 8 for string + 1 for terminator.
    aiTexel.p("pcData")
    aiString("mFilename")

    customMethod("""
    /** Returns a {@code char *} view of the array pointed to by the {@code pcData} field. */
    @NativeType("char *")
    public ByteBuffer pcDataCompressed() { return npcDataCompressed(address()); }

    /** Unsafe version of {@link #pcDataCompressed}. */
    public static ByteBuffer npcDataCompressed(long struct) { return memByteBuffer(memGetAddress(struct + AITexture.PCDATA), nmWidth(struct)); }""")

    customMethodBuffer("""
        $t/** Returns a {@code char *} view of the array pointed to by the {@code pcData} field. */
        @NativeType("char *")
        public ByteBuffer pcDataCompressed() { return npcDataCompressed(address()); }""")
}

val aiColor4D = struct(Module.ASSIMP, "AIColor4D", nativeName = "struct aiColor4D") {
    float("r")
    float("g")
    float("b")
    float("a")
}

val aiMatrix4x4 = struct(Module.ASSIMP, "AIMatrix4x4", nativeName = "struct aiMatrix4x4") {
    float("a1")
    float("a2")
    float("a3")
    float("a4")

    float("b1")
    float("b2")
    float("b3")
    float("b4")

    float("c1")
    float("c2")
    float("c3")
    float("c4")

    float("d1")
    float("d2")
    float("d3")
    float("d4")
}

val aiMatrix3x3 = struct(Module.ASSIMP, "AIMatrix3x3", nativeName = "struct aiMatrix3x3") {
    float("a1")
    float("a2")
    float("a3")

    float("b1")
    float("b2")
    float("b3")

    float("c1")
    float("c2")
    float("c3")
}

val aiMetadataType = "aiMetadataType".enumType

val aiMetadataEntry = struct(Module.ASSIMP, "AIMetaDataEntry", nativeName = "struct aiMetadataEntry") {
    aiMetadataType("mType")
    void.p("mData")
}

val aiMetadata = struct(Module.ASSIMP, "AIMetaData", nativeName = "struct aiMetadata") {
    AutoSize("mKeys", "mValues")..unsigned_int("mNumProperties")
    aiString.p("mKeys")
    aiMetadataEntry.p("mValues")
}

private val _aiNode = struct(Module.ASSIMP, "AINode", nativeName = "struct aiNode")
val aiNode = struct(Module.ASSIMP, "AINode", nativeName = "struct aiNode") {
    aiString("mName")
    aiMatrix4x4("mTransformation")
    nullable.._aiNode.p("mParent")
    AutoSize("mChildren", optional = true)..unsigned_int("mNumChildren")
    _aiNode.p.p("mChildren")
    AutoSize("mMeshes", optional = true)..unsigned_int("mNumMeshes")
    unsigned_int.p("mMeshes")
    nullable..aiMetadata.p("mMetadata")
}

val aiFace = struct(Module.ASSIMP, "AIFace", nativeName = "struct aiFace") {
    AutoSize("mIndices")..unsigned_int("mNumIndices")
    unsigned_int.p("mIndices")
}

val aiVertexWeight = struct(Module.ASSIMP, "AIVertexWeight", nativeName = "struct aiVertexWeight") {
    unsigned_int("mVertexId")
    float("mWeight")
}

val aiBone = struct(Module.ASSIMP, "AIBone", nativeName = "struct aiBone") {
    aiString("mName")
    AutoSize("mWeights")..unsigned_int("mNumWeights")
    aiNode.p("mArmature")
    aiNode.p("mNode")
    aiVertexWeight.p("mWeights")
    aiMatrix4x4("mOffsetMatrix")
}

val aiAnimMesh = struct(Module.ASSIMP, "AIAnimMesh", nativeName = "struct aiAnimMesh") {
    aiString("mName")
    nullable..aiVector3D.p("mVertices")
    nullable..aiVector3D.p("mNormals")
    nullable..aiVector3D.p("mTangents")
    nullable..aiVector3D.p("mBitangents")
    nullable..aiColor4D.p("mColors")["Assimp.AI_MAX_NUMBER_OF_COLOR_SETS"]
    nullable..aiVector3D.p("mTextureCoords")["Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS"]
    AutoSize(
        "mVertices", "mNormals", "mTangents", "mBitangents"
    )..AutoSizeIndirect(
        "mColors", "mTextureCoords"
    )..unsigned_int("mNumVertices")
    float("mWeight")
}

val aiMorphingMethod = "aiMorphingMethod".enumType

val aiMesh = struct(Module.ASSIMP, "AIMesh", nativeName = "struct aiMesh") {
    javaImport("static org.lwjgl.assimp.Assimp.*")

    unsigned_int("mPrimitiveTypes")
    AutoSize(
        "mVertices", "mNormals", "mTangents", "mBitangents"
    )..AutoSizeIndirect(
        "mColors", "mTextureCoords"
    )..unsigned_int("mNumVertices")
    AutoSize("mFaces")..unsigned_int("mNumFaces")
    aiVector3D.p("mVertices")
    nullable..aiVector3D.p("mNormals")
    nullable..aiVector3D.p("mTangents")
    nullable..aiVector3D.p("mBitangents")
    nullable..aiColor4D.p("mColors")["AI_MAX_NUMBER_OF_COLOR_SETS"]
    nullable..aiVector3D.p("mTextureCoords")["AI_MAX_NUMBER_OF_TEXTURECOORDS"]
    unsigned_int("mNumUVComponents")["AI_MAX_NUMBER_OF_TEXTURECOORDS"]
    aiFace.p("mFaces")
    AutoSize("mBones", optional = true)..unsigned_int("mNumBones")
    aiBone.p.p("mBones")
    unsigned_int("mMaterialIndex")
    aiString("mName")
    AutoSize("mAnimMeshes", optional = true)..unsigned_int("mNumAnimMeshes")
    aiAnimMesh.p.p("mAnimMeshes")
    aiMorphingMethod("mMethod")
    aiAABB("mAABB")
    Check("AI_MAX_NUMBER_OF_TEXTURECOORDS")..nullable..aiString.p.p("mTextureCoordsNames")
}

val aiSkeletonBone = struct(Module.ASSIMP, "AISkeletonBone", nativeName = "struct aiSkeletonBone") {
    int("mParent")
    nullable..aiNode.p("mArmature")
    nullable..aiNode.p("mNode")
    AutoSize("mMeshId", "mWeights")..unsigned_int("mNumnWeights");
    aiMesh.p("mMeshId")
    aiVertexWeight.p("mWeights")
    aiMatrix4x4("mOffsetMatrix")
    aiMatrix4x4("mLocalMatrix")
}

val aiSkeleton = struct(Module.ASSIMP, "AISkeleton", nativeName = "struct aiSkeleton") {
    aiString("mName")
    AutoSize("mBones")..unsigned_int("mNumBones")
    aiSkeletonBone.p.p("mBones");
}

val aiUVTransform = struct(Module.ASSIMP, "AIUVTransform", nativeName = "struct aiUVTransform", mutable = false) {
    aiVector2D("mTranslation")
    aiVector2D("mScaling")
    float("mRotation")
}

val aiPropertyTypeInfo = "aiPropertyTypeInfo".enumType

val aiMaterialProperty = struct(Module.ASSIMP, "AIMaterialProperty", nativeName = "struct aiMaterialProperty", mutable = false) {
    aiString("mKey")
    unsigned_int("mSemantic")
    unsigned_int("mIndex")
    AutoSize("mData")..unsigned_int("mDataLength")
    aiPropertyTypeInfo("mType")
    char.p("mData")
}

val aiMaterial = struct(Module.ASSIMP, "AIMaterial", nativeName = "struct aiMaterial") {
    aiMaterialProperty.p.p("mProperties")
    AutoSize("mProperties")..unsigned_int("mNumProperties")
    unsigned_int("mNumAllocated")
}

val aiQuaternion = struct(Module.ASSIMP, "AIQuaternion", nativeName = "struct aiQuaternion") {
    float("w")
    float("x")
    float("y")
    float("z")
}

val aiVectorKey = struct(Module.ASSIMP, "AIVectorKey", nativeName = "struct aiVectorKey") {
    double("mTime")
    aiVector3D("mValue")
    aiAnimInterpolation("mInterpolation")
}

val aiQuatKey = struct(Module.ASSIMP, "AIQuatKey", nativeName = "struct aiQuatKey") {
    double("mTime")
    aiQuaternion("mValue")
    aiAnimInterpolation("mInterpolation")
}

val aiMeshKey = struct(Module.ASSIMP, "AIMeshKey", nativeName = "struct aiMeshKey") {
    double("mTime")
    unsigned_int("mValue")
}

val aiMeshMorphKey = struct(Module.ASSIMP, "AIMeshMorphKey", nativeName = "struct aiMeshMorphKey") {
    double("mTime")
    unsigned_int.p("mValues")
    double.p("mWeights")
    AutoSize("mValues", "mWeights")..unsigned_int("mNumValuesAndWeights")
}

val aiAnimBehaviour = "aiAnimBehaviour".enumType

val aiNodeAnim = struct(Module.ASSIMP, "AINodeAnim", nativeName = "struct aiNodeAnim") {
    aiString("mNodeName")
    AutoSize("mPositionKeys", optional = true)..unsigned_int("mNumPositionKeys")
    aiVectorKey.p("mPositionKeys")
    AutoSize("mRotationKeys", optional = true)..unsigned_int("mNumRotationKeys")
    aiQuatKey.p("mRotationKeys")
    AutoSize("mScalingKeys", optional = true)..unsigned_int("mNumScalingKeys")
    aiVectorKey.p("mScalingKeys")
    aiAnimBehaviour("mPreState")
    aiAnimBehaviour("mPostState")
}

val aiMeshAnim = struct(Module.ASSIMP, "AIMeshAnim", nativeName = "struct aiMeshAnim") {
    aiString("mName")
    AutoSize("mKeys")..unsigned_int("mNumKeys")
    aiMeshKey.p("mKeys")
}

val aiMeshMorphAnim = struct(Module.ASSIMP, "AIMeshMorphAnim", nativeName = "struct aiMeshMorphAnim") {
    aiString("mName")
    AutoSize("mKeys")..unsigned_int("mNumKeys")
    aiMeshMorphKey.p("mKeys")
}

val aiAnimation = struct(Module.ASSIMP, "AIAnimation", nativeName = "struct aiAnimation") {
    aiString("mName")
    double("mDuration")
    double("mTicksPerSecond")
    AutoSize("mChannels", optional = true)..unsigned_int("mNumChannels")
    aiNodeAnim.p.p("mChannels")
    AutoSize("mMeshChannels", optional = true)..unsigned_int("mNumMeshChannels")
    aiMeshAnim.p.p("mMeshChannels")
    AutoSize("mMorphMeshChannels", optional = true)..unsigned_int("mNumMorphMeshChannels")
    aiMeshMorphAnim.p.p("mMorphMeshChannels")
}

val aiLightSourceType = "aiLightSourceType".enumType

val aiLight = struct(Module.ASSIMP, "AILight", nativeName = "struct aiLight", mutable = false) {
    aiString("mName")
    aiLightSourceType("mType")
    aiVector3D("mPosition")
    aiVector3D("mDirection")
    aiVector3D("mUp")
    float("mAttenuationConstant")
    float("mAttenuationLinear")
    float("mAttenuationQuadratic")
    aiColor3D("mColorDiffuse")
    aiColor3D("mColorSpecular")
    aiColor3D("mColorAmbient")
    float("mAngleInnerCone")
    float("mAngleOuterCone")
    aiVector2D("mSize")
}

val aiCamera = struct(Module.ASSIMP, "AICamera", nativeName = "struct aiCamera") {
    aiString("mName")
    aiVector3D("mPosition")
    aiVector3D("mUp")
    aiVector3D("mLookAt")
    float("mHorizontalFOV")
    float("mClipPlaneNear")
    float("mClipPlaneFar")
    float("mAspect")
    float("mOrthographicWidth")
}

val aiScene = struct(Module.ASSIMP, "AIScene", nativeName = "struct aiScene") {
    unsigned_int("mFlags")
    nullable..aiNode.p("mRootNode")
    AutoSize("mMeshes", optional = true)..unsigned_int("mNumMeshes")
    aiMesh.p.p("mMeshes")
    AutoSize("mMaterials", optional = true)..unsigned_int("mNumMaterials")
    aiMaterial.p.p("mMaterials")
    AutoSize("mAnimations", optional = true)..unsigned_int("mNumAnimations")
    aiAnimation.p.p("mAnimations")
    AutoSize("mTextures", optional = true)..unsigned_int("mNumTextures")
    aiTexture.p.p("mTextures")
    AutoSize("mLights", optional = true)..unsigned_int("mNumLights")
    aiLight.p.p("mLights")
    AutoSize("mCameras", optional = true)..unsigned_int("mNumCameras")
    aiCamera.p.p("mCameras")
    nullable..aiMetadata.p("mMetaData")
    aiString("mName")

    AutoSize("mSkeletons", optional = true)..unsigned_int("mNumSkeletons")
    aiSkeleton.p.p("mSkeletons")

    char.p("mPrivate").private()
}

val aiReturn = "aiReturn".enumType
val aiTextureType = "aiTextureType".enumType
val aiTextureMapping = "aiTextureMapping".enumType
val aiTextureOp = "aiTextureOp".enumType
val aiTextureMapMode = "aiTextureMapMode".enumType

val aiImporterDesc = struct(Module.ASSIMP, "AIImporterDesc", nativeName = "struct aiImporterDesc") {
    charASCII.const.p("mName")
    charUTF8.const.p("mAuthor")
    charUTF8.const.p("mMaintainer")
    charUTF8.const.p("mComments")

    unsigned_int("mFlags")
    unsigned_int("mMinMajor")
    unsigned_int("mMinMinor")
    unsigned_int("mMaxMajor")
    unsigned_int("mMaxMinor")

    charASCII.const.p("mFileExtensions")
}

private val _aiFile = struct(Module.ASSIMP, "AIFile", nativeName = "struct aiFile")
private val _aiFileIO = struct(Module.ASSIMP, "AIFileIO", nativeName = "struct aiFileIO")

val aiFileWriteProc = Module.ASSIMP.callback {
    size_t(
        "AIFileWriteProc",

        _aiFile.p("pFile"),
        char.const.p("pBuffer"),
        size_t("memB"),
        size_t("count"),

        nativeType = "aiFileWriteProc"
    )
}

val aiFileReadProc = Module.ASSIMP.callback {
    size_t(
        "AIFileReadProc",

        _aiFile.p("pFile"),
        char.p("pBuffer"),
        size_t("size"),
        size_t("count"),

        nativeType = "aiFileReadProc"
    )
}

val aiFileTellProc = Module.ASSIMP.callback {
    size_t(
        "AIFileTellProc",

        _aiFile.p("pFile"),

        nativeType = "aiFileTellProc"
    )
}

val aiFileFlushProc = Module.ASSIMP.callback {
    void(
        "AIFileFlushProc",

        _aiFile.p("pFile"),

        nativeType = "aiFileFlushProc"
    )
}

val aiOrigin = "aiOrigin".enumType

val aiFileSeek = Module.ASSIMP.callback {
    aiReturn(
        "AIFileSeek",

        _aiFile.p("pFile"),
        size_t("offset"),
        aiOrigin("origin"),

        nativeType = "aiFileSeek"
    )
}

val aiFileOpenProc = Module.ASSIMP.callback {
    _aiFile.p(
        "AIFileOpenProc",

        _aiFileIO.p("pFileIO"),
        charUTF8.const.p("fileName"),
        charUTF8.const.p("openMode"),

        nativeType = "aiFileOpenProc",
    )
}

val aiFileCloseProc = Module.ASSIMP.callback {
    void(
        "AIFileCloseProc",

        _aiFileIO.p("pFileIO"),
        _aiFile.p("pFile"),

        nativeType = "aiFileCloseProc"
    )
}

val aiUserData = typedef(opaque_p, "aiUserData")

val aiFileIO = struct(Module.ASSIMP, "AIFileIO", nativeName = "struct aiFileIO") {
    aiFileOpenProc("OpenProc")
    aiFileCloseProc("CloseProc")
    nullable..aiUserData("UserData")
}

val aiFile = struct(Module.ASSIMP, "AIFile", nativeName = "struct aiFile") {
    aiFileReadProc("ReadProc")
    aiFileWriteProc("WriteProc")
    aiFileTellProc("TellProc")
    aiFileTellProc("FileSizeProc")
    aiFileSeek("SeekProc")
    aiFileFlushProc("FlushProc")
    nullable..aiUserData("UserData")
}

val aiLogStreamCallback = Module.ASSIMP.callback {
    void(
        "AILogStreamCallback",

        charUTF8.const.p("message"),
        Unsafe..nullable..char.p("user"),

        nativeType = "aiLogStreamCallback"
    )
}

val aiLogStream = struct(Module.ASSIMP, "AILogStream", nativeName = "struct aiLogStream") {
    aiLogStreamCallback("callback")
    nullable..char.p("user")
}

val aiPropertyStore = struct(Module.ASSIMP, "AIPropertyStore", nativeName = "struct aiPropertyStore") {
    char("sentinel")
}

val aiBool = typedef(intb, "aiBool")
val aiDefaultLogStream = "aiDefaultLogStream".enumType

val aiExportFormatDesc = struct(Module.ASSIMP, "AIExportFormatDesc", nativeName = "struct aiExportFormatDesc") {
    charUTF8.const.p("id")
    charUTF8.const.p("description")
    charUTF8.const.p("fileExtension")
}

private val _aiExportDataBlob = struct(Module.ASSIMP, "AIExportDataBlob", nativeName = "struct aiExportDataBlob")
val aiExportDataBlob = struct(Module.ASSIMP, "AIExportDataBlob", nativeName = "struct aiExportDataBlob") {
    AutoSize("data")..size_t("size")
    void.p("data")
    aiString("name")

    nullable.._aiExportDataBlob.p("next")
}