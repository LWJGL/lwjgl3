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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The root structure of the imported data.
 * 
 * <p>Everything that was imported from the given file can be accessed from here. Objects of this class are generally maintained and owned by Assimp, not by
 * the caller. You shouldn't want to instance it, nor should you ever try to delete a given scene on your own.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mFlags} &ndash; Any combination of the AI_SCENE_FLAGS_XXX flags. By default this value is 0, no flags are set. Most applications will want to reject all scenes with
 * the AI_SCENE_FLAGS_INCOMPLETE bit set. One or more of:<br><table><tr><td>{@link Assimp#AI_SCENE_FLAGS_INCOMPLETE}</td><td>{@link Assimp#AI_SCENE_FLAGS_VALIDATED}</td></tr><tr><td>{@link Assimp#AI_SCENE_FLAGS_VALIDATION_WARNING}</td><td>{@link Assimp#AI_SCENE_FLAGS_NON_VERBOSE_FORMAT}</td></tr><tr><td>{@link Assimp#AI_SCENE_FLAGS_TERRAIN}</td></tr></table></li>
 * <li>{@code mRootNode} &ndash; 
 * The root node of the hierarchy. There will always be at least the root node if the import was successful (and no special flags have been set). Presence
 * of further nodes depends on the format and content of the imported file.</li>
 * <li>{@code mNumMeshes} &ndash; The number of meshes in the scene.</li>
 * <li>{@code mMeshes} &ndash; 
 * The array of meshes. Use the indices given in the {@link AINode} structure to access this array. The array is {@code mNumMeshes} in size. If the
 * {@link Assimp#AI_SCENE_FLAGS_INCOMPLETE} flag is not set there will always be at least ONE material.</li>
 * <li>{@code mNumMaterials} &ndash; The number of materials in the scene.</li>
 * <li>{@code mMaterials} &ndash; 
 * The array of materials. Use the index given in each {@link AIMesh} structure to access this array. The array is {@code mNumMaterials} in size. If the
 * {@link Assimp#AI_SCENE_FLAGS_INCOMPLETE} flag is not set there will always be at least ONE material.</li>
 * <li>{@code mNumAnimations} &ndash; The number of animations in the scene.</li>
 * <li>{@code mAnimations} &ndash; The array of animations. All animations imported from the given file are listed here. The array is {@code mNumAnimations} in size.</li>
 * <li>{@code mNumTextures} &ndash; The number of textures embedded into the file</li>
 * <li>{@code mTextures} &ndash; 
 * The array of embedded textures. Not many file formats embed their textures into the file. An example is Quake's MDL format (which is also used by some
 * GameStudio versions)</li>
 * <li>{@code mNumLights} &ndash; The number of light sources in the scene. Light sources are fully optional, in most cases this attribute will be 0</li>
 * <li>{@code mLights} &ndash; The array of light sources. All light sources imported from the given file are listed here. The array is {@code mNumLights} in size.</li>
 * <li>{@code mNumCameras} &ndash; The number of cameras in the scene. Cameras are fully optional, in most cases this attribute will be 0</li>
 * <li>{@code mCameras} &ndash; 
 * The array of cameras. All cameras imported from the given file are listed here. The array is {@code mNumCameras} in size. The first camera in the array
 * (if existing) is the default camera view into the scene.</li>
 * <li>{@code mMetaData} &ndash; 
 * The global metadata assigned to the scene itself.
 * 
 * <p>This data contains global metadata which belongs to the scene like unit-conversions, versions, vendors or other model-specific data. This can be used
 * to store format-specific metadata as well.</p></li>
 * <li>{@code mPrivate} &ndash; Internal use only, do not touch!</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiScene {
 *     unsigned int mFlags;
 *     {@link AINode struct aiNode} * mRootNode;
 *     unsigned int mNumMeshes;
 *     {@link AIMesh struct aiMesh} ** mMeshes;
 *     unsigned int mNumMaterials;
 *     {@link AIMaterial struct aiMaterial} ** mMaterials;
 *     unsigned int mNumAnimations;
 *     {@link AIAnimation struct aiAnimation} ** mAnimations;
 *     unsigned int mNumTextures;
 *     {@link AITexture struct aiTexture} ** mTextures;
 *     unsigned int mNumLights;
 *     {@link AILight struct aiLight} ** mLights;
 *     unsigned int mNumCameras;
 *     {@link AICamera struct aiCamera} ** mCameras;
 *     {@link AIMetaData struct aiMetadata} * mMetaData;
 *     char * mPrivate;
 * }</code></pre>
 */
@NativeType("struct aiScene")
public class AIScene extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MFLAGS,
        MROOTNODE,
        MNUMMESHES,
        MMESHES,
        MNUMMATERIALS,
        MMATERIALS,
        MNUMANIMATIONS,
        MANIMATIONS,
        MNUMTEXTURES,
        MTEXTURES,
        MNUMLIGHTS,
        MLIGHTS,
        MNUMCAMERAS,
        MCAMERAS,
        MMETADATA,
        MPRIVATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MFLAGS = layout.offsetof(0);
        MROOTNODE = layout.offsetof(1);
        MNUMMESHES = layout.offsetof(2);
        MMESHES = layout.offsetof(3);
        MNUMMATERIALS = layout.offsetof(4);
        MMATERIALS = layout.offsetof(5);
        MNUMANIMATIONS = layout.offsetof(6);
        MANIMATIONS = layout.offsetof(7);
        MNUMTEXTURES = layout.offsetof(8);
        MTEXTURES = layout.offsetof(9);
        MNUMLIGHTS = layout.offsetof(10);
        MLIGHTS = layout.offsetof(11);
        MNUMCAMERAS = layout.offsetof(12);
        MCAMERAS = layout.offsetof(13);
        MMETADATA = layout.offsetof(14);
        MPRIVATE = layout.offsetof(15);
    }

    /**
     * Creates a {@code AIScene} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIScene(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code mFlags} field. */
    @NativeType("unsigned int")
    public int mFlags() { return nmFlags(address()); }
    /** Returns a {@link AINode} view of the struct pointed to by the {@code mRootNode} field. */
    @Nullable
    @NativeType("struct aiNode *")
    public AINode mRootNode() { return nmRootNode(address()); }
    /** Returns the value of the {@code mNumMeshes} field. */
    @NativeType("unsigned int")
    public int mNumMeshes() { return nmNumMeshes(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMeshes} field. */
    @Nullable
    @NativeType("struct aiMesh **")
    public PointerBuffer mMeshes() { return nmMeshes(address()); }
    /** Returns the value of the {@code mNumMaterials} field. */
    @NativeType("unsigned int")
    public int mNumMaterials() { return nmNumMaterials(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMaterials} field. */
    @Nullable
    @NativeType("struct aiMaterial **")
    public PointerBuffer mMaterials() { return nmMaterials(address()); }
    /** Returns the value of the {@code mNumAnimations} field. */
    @NativeType("unsigned int")
    public int mNumAnimations() { return nmNumAnimations(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mAnimations} field. */
    @Nullable
    @NativeType("struct aiAnimation **")
    public PointerBuffer mAnimations() { return nmAnimations(address()); }
    /** Returns the value of the {@code mNumTextures} field. */
    @NativeType("unsigned int")
    public int mNumTextures() { return nmNumTextures(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mTextures} field. */
    @Nullable
    @NativeType("struct aiTexture **")
    public PointerBuffer mTextures() { return nmTextures(address()); }
    /** Returns the value of the {@code mNumLights} field. */
    @NativeType("unsigned int")
    public int mNumLights() { return nmNumLights(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mLights} field. */
    @Nullable
    @NativeType("struct aiLight **")
    public PointerBuffer mLights() { return nmLights(address()); }
    /** Returns the value of the {@code mNumCameras} field. */
    @NativeType("unsigned int")
    public int mNumCameras() { return nmNumCameras(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mCameras} field. */
    @Nullable
    @NativeType("struct aiCamera **")
    public PointerBuffer mCameras() { return nmCameras(address()); }
    /** Returns a {@link AIMetaData} view of the struct pointed to by the {@code mMetaData} field. */
    @Nullable
    @NativeType("struct aiMetadata *")
    public AIMetaData mMetaData() { return nmMetaData(address()); }

    /** Sets the specified value to the {@code mFlags} field. */
    public AIScene mFlags(@NativeType("unsigned int") int value) { nmFlags(address(), value); return this; }
    /** Sets the address of the specified {@link AINode} to the {@code mRootNode} field. */
    public AIScene mRootNode(@Nullable @NativeType("struct aiNode *") AINode value) { nmRootNode(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mMeshes} field. */
    public AIScene mMeshes(@Nullable @NativeType("struct aiMesh **") PointerBuffer value) { nmMeshes(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mMaterials} field. */
    public AIScene mMaterials(@Nullable @NativeType("struct aiMaterial **") PointerBuffer value) { nmMaterials(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mAnimations} field. */
    public AIScene mAnimations(@Nullable @NativeType("struct aiAnimation **") PointerBuffer value) { nmAnimations(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mTextures} field. */
    public AIScene mTextures(@Nullable @NativeType("struct aiTexture **") PointerBuffer value) { nmTextures(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mLights} field. */
    public AIScene mLights(@Nullable @NativeType("struct aiLight **") PointerBuffer value) { nmLights(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mCameras} field. */
    public AIScene mCameras(@Nullable @NativeType("struct aiCamera **") PointerBuffer value) { nmCameras(address(), value); return this; }
    /** Sets the address of the specified {@link AIMetaData} to the {@code mMetaData} field. */
    public AIScene mMetaData(@Nullable @NativeType("struct aiMetadata *") AIMetaData value) { nmMetaData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIScene set(
        int mFlags,
        @Nullable AINode mRootNode,
        @Nullable PointerBuffer mMeshes,
        @Nullable PointerBuffer mMaterials,
        @Nullable PointerBuffer mAnimations,
        @Nullable PointerBuffer mTextures,
        @Nullable PointerBuffer mLights,
        @Nullable PointerBuffer mCameras,
        @Nullable AIMetaData mMetaData
    ) {
        mFlags(mFlags);
        mRootNode(mRootNode);
        mMeshes(mMeshes);
        mMaterials(mMaterials);
        mAnimations(mAnimations);
        mTextures(mTextures);
        mLights(mLights);
        mCameras(mCameras);
        mMetaData(mMetaData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIScene set(AIScene src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIScene} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIScene malloc() {
        return wrap(AIScene.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIScene} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIScene calloc() {
        return wrap(AIScene.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIScene} instance allocated with {@link BufferUtils}. */
    public static AIScene create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIScene.class, memAddress(container), container);
    }

    /** Returns a new {@code AIScene} instance for the specified memory address. */
    public static AIScene create(long address) {
        return wrap(AIScene.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIScene createSafe(long address) {
        return address == NULL ? null : wrap(AIScene.class, address);
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIScene.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIScene.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code AIScene} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIScene mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code AIScene} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIScene callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code AIScene} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIScene mallocStack(MemoryStack stack) {
        return wrap(AIScene.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIScene} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIScene callocStack(MemoryStack stack) {
        return wrap(AIScene.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIScene.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIScene.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mFlags}. */
    public static int nmFlags(long struct) { return UNSAFE.getInt(null, struct + AIScene.MFLAGS); }
    /** Unsafe version of {@link #mRootNode}. */
    @Nullable public static AINode nmRootNode(long struct) { return AINode.createSafe(memGetAddress(struct + AIScene.MROOTNODE)); }
    /** Unsafe version of {@link #mNumMeshes}. */
    public static int nmNumMeshes(long struct) { return UNSAFE.getInt(null, struct + AIScene.MNUMMESHES); }
    /** Unsafe version of {@link #mMeshes() mMeshes}. */
    @Nullable public static PointerBuffer nmMeshes(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MMESHES), nmNumMeshes(struct)); }
    /** Unsafe version of {@link #mNumMaterials}. */
    public static int nmNumMaterials(long struct) { return UNSAFE.getInt(null, struct + AIScene.MNUMMATERIALS); }
    /** Unsafe version of {@link #mMaterials() mMaterials}. */
    @Nullable public static PointerBuffer nmMaterials(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MMATERIALS), nmNumMaterials(struct)); }
    /** Unsafe version of {@link #mNumAnimations}. */
    public static int nmNumAnimations(long struct) { return UNSAFE.getInt(null, struct + AIScene.MNUMANIMATIONS); }
    /** Unsafe version of {@link #mAnimations() mAnimations}. */
    @Nullable public static PointerBuffer nmAnimations(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MANIMATIONS), nmNumAnimations(struct)); }
    /** Unsafe version of {@link #mNumTextures}. */
    public static int nmNumTextures(long struct) { return UNSAFE.getInt(null, struct + AIScene.MNUMTEXTURES); }
    /** Unsafe version of {@link #mTextures() mTextures}. */
    @Nullable public static PointerBuffer nmTextures(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MTEXTURES), nmNumTextures(struct)); }
    /** Unsafe version of {@link #mNumLights}. */
    public static int nmNumLights(long struct) { return UNSAFE.getInt(null, struct + AIScene.MNUMLIGHTS); }
    /** Unsafe version of {@link #mLights() mLights}. */
    @Nullable public static PointerBuffer nmLights(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MLIGHTS), nmNumLights(struct)); }
    /** Unsafe version of {@link #mNumCameras}. */
    public static int nmNumCameras(long struct) { return UNSAFE.getInt(null, struct + AIScene.MNUMCAMERAS); }
    /** Unsafe version of {@link #mCameras() mCameras}. */
    @Nullable public static PointerBuffer nmCameras(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIScene.MCAMERAS), nmNumCameras(struct)); }
    /** Unsafe version of {@link #mMetaData}. */
    @Nullable public static AIMetaData nmMetaData(long struct) { return AIMetaData.createSafe(memGetAddress(struct + AIScene.MMETADATA)); }
    public static ByteBuffer nmPrivate(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + AIScene.MPRIVATE), capacity); }

    /** Unsafe version of {@link #mFlags(int) mFlags}. */
    public static void nmFlags(long struct, int value) { UNSAFE.putInt(null, struct + AIScene.MFLAGS, value); }
    /** Unsafe version of {@link #mRootNode(AINode) mRootNode}. */
    public static void nmRootNode(long struct, @Nullable AINode value) { memPutAddress(struct + AIScene.MROOTNODE, memAddressSafe(value)); }
    /** Sets the specified value to the {@code mNumMeshes} field of the specified {@code struct}. */
    public static void nmNumMeshes(long struct, int value) { UNSAFE.putInt(null, struct + AIScene.MNUMMESHES, value); }
    /** Unsafe version of {@link #mMeshes(PointerBuffer) mMeshes}. */
    public static void nmMeshes(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MMESHES, memAddressSafe(value)); nmNumMeshes(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumMaterials} field of the specified {@code struct}. */
    public static void nmNumMaterials(long struct, int value) { UNSAFE.putInt(null, struct + AIScene.MNUMMATERIALS, value); }
    /** Unsafe version of {@link #mMaterials(PointerBuffer) mMaterials}. */
    public static void nmMaterials(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MMATERIALS, memAddressSafe(value)); nmNumMaterials(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumAnimations} field of the specified {@code struct}. */
    public static void nmNumAnimations(long struct, int value) { UNSAFE.putInt(null, struct + AIScene.MNUMANIMATIONS, value); }
    /** Unsafe version of {@link #mAnimations(PointerBuffer) mAnimations}. */
    public static void nmAnimations(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MANIMATIONS, memAddressSafe(value)); nmNumAnimations(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumTextures} field of the specified {@code struct}. */
    public static void nmNumTextures(long struct, int value) { UNSAFE.putInt(null, struct + AIScene.MNUMTEXTURES, value); }
    /** Unsafe version of {@link #mTextures(PointerBuffer) mTextures}. */
    public static void nmTextures(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MTEXTURES, memAddressSafe(value)); nmNumTextures(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumLights} field of the specified {@code struct}. */
    public static void nmNumLights(long struct, int value) { UNSAFE.putInt(null, struct + AIScene.MNUMLIGHTS, value); }
    /** Unsafe version of {@link #mLights(PointerBuffer) mLights}. */
    public static void nmLights(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MLIGHTS, memAddressSafe(value)); nmNumLights(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code mNumCameras} field of the specified {@code struct}. */
    public static void nmNumCameras(long struct, int value) { UNSAFE.putInt(null, struct + AIScene.MNUMCAMERAS, value); }
    /** Unsafe version of {@link #mCameras(PointerBuffer) mCameras}. */
    public static void nmCameras(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIScene.MCAMERAS, memAddressSafe(value)); nmNumCameras(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mMetaData(AIMetaData) mMetaData}. */
    public static void nmMetaData(long struct, @Nullable AIMetaData value) { memPutAddress(struct + AIScene.MMETADATA, memAddressSafe(value)); }
    public static void nmPrivate(long struct, ByteBuffer value) { memPutAddress(struct + AIScene.MPRIVATE, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long mRootNode = memGetAddress(struct + AIScene.MROOTNODE);
        if (mRootNode != NULL) {
            AINode.validate(mRootNode);
        }
        if (nmNumMeshes(struct) != 0) {
            check(memGetAddress(struct + AIScene.MMESHES));
        }
        if (nmNumMaterials(struct) != 0) {
            check(memGetAddress(struct + AIScene.MMATERIALS));
        }
        if (nmNumAnimations(struct) != 0) {
            check(memGetAddress(struct + AIScene.MANIMATIONS));
        }
        if (nmNumTextures(struct) != 0) {
            check(memGetAddress(struct + AIScene.MTEXTURES));
        }
        if (nmNumLights(struct) != 0) {
            check(memGetAddress(struct + AIScene.MLIGHTS));
        }
        if (nmNumCameras(struct) != 0) {
            check(memGetAddress(struct + AIScene.MCAMERAS));
        }
        long mMetaData = memGetAddress(struct + AIScene.MMETADATA);
        if (mMetaData != NULL) {
            AIMetaData.validate(mMetaData);
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link AIScene} structs. */
    public static class Buffer extends StructBuffer<AIScene, Buffer> implements NativeResource {

        private static final AIScene ELEMENT_FACTORY = AIScene.create(-1L);

        /**
         * Creates a new {@code AIScene.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIScene#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected AIScene getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code mFlags} field. */
        @NativeType("unsigned int")
        public int mFlags() { return AIScene.nmFlags(address()); }
        /** Returns a {@link AINode} view of the struct pointed to by the {@code mRootNode} field. */
        @Nullable
        @NativeType("struct aiNode *")
        public AINode mRootNode() { return AIScene.nmRootNode(address()); }
        /** Returns the value of the {@code mNumMeshes} field. */
        @NativeType("unsigned int")
        public int mNumMeshes() { return AIScene.nmNumMeshes(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMeshes} field. */
        @Nullable
        @NativeType("struct aiMesh **")
        public PointerBuffer mMeshes() { return AIScene.nmMeshes(address()); }
        /** Returns the value of the {@code mNumMaterials} field. */
        @NativeType("unsigned int")
        public int mNumMaterials() { return AIScene.nmNumMaterials(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mMaterials} field. */
        @Nullable
        @NativeType("struct aiMaterial **")
        public PointerBuffer mMaterials() { return AIScene.nmMaterials(address()); }
        /** Returns the value of the {@code mNumAnimations} field. */
        @NativeType("unsigned int")
        public int mNumAnimations() { return AIScene.nmNumAnimations(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mAnimations} field. */
        @Nullable
        @NativeType("struct aiAnimation **")
        public PointerBuffer mAnimations() { return AIScene.nmAnimations(address()); }
        /** Returns the value of the {@code mNumTextures} field. */
        @NativeType("unsigned int")
        public int mNumTextures() { return AIScene.nmNumTextures(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mTextures} field. */
        @Nullable
        @NativeType("struct aiTexture **")
        public PointerBuffer mTextures() { return AIScene.nmTextures(address()); }
        /** Returns the value of the {@code mNumLights} field. */
        @NativeType("unsigned int")
        public int mNumLights() { return AIScene.nmNumLights(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mLights} field. */
        @Nullable
        @NativeType("struct aiLight **")
        public PointerBuffer mLights() { return AIScene.nmLights(address()); }
        /** Returns the value of the {@code mNumCameras} field. */
        @NativeType("unsigned int")
        public int mNumCameras() { return AIScene.nmNumCameras(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mCameras} field. */
        @Nullable
        @NativeType("struct aiCamera **")
        public PointerBuffer mCameras() { return AIScene.nmCameras(address()); }
        /** Returns a {@link AIMetaData} view of the struct pointed to by the {@code mMetaData} field. */
        @Nullable
        @NativeType("struct aiMetadata *")
        public AIMetaData mMetaData() { return AIScene.nmMetaData(address()); }

        /** Sets the specified value to the {@code mFlags} field. */
        public AIScene.Buffer mFlags(@NativeType("unsigned int") int value) { AIScene.nmFlags(address(), value); return this; }
        /** Sets the address of the specified {@link AINode} to the {@code mRootNode} field. */
        public AIScene.Buffer mRootNode(@Nullable @NativeType("struct aiNode *") AINode value) { AIScene.nmRootNode(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mMeshes} field. */
        public AIScene.Buffer mMeshes(@Nullable @NativeType("struct aiMesh **") PointerBuffer value) { AIScene.nmMeshes(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mMaterials} field. */
        public AIScene.Buffer mMaterials(@Nullable @NativeType("struct aiMaterial **") PointerBuffer value) { AIScene.nmMaterials(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mAnimations} field. */
        public AIScene.Buffer mAnimations(@Nullable @NativeType("struct aiAnimation **") PointerBuffer value) { AIScene.nmAnimations(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mTextures} field. */
        public AIScene.Buffer mTextures(@Nullable @NativeType("struct aiTexture **") PointerBuffer value) { AIScene.nmTextures(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mLights} field. */
        public AIScene.Buffer mLights(@Nullable @NativeType("struct aiLight **") PointerBuffer value) { AIScene.nmLights(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mCameras} field. */
        public AIScene.Buffer mCameras(@Nullable @NativeType("struct aiCamera **") PointerBuffer value) { AIScene.nmCameras(address(), value); return this; }
        /** Sets the address of the specified {@link AIMetaData} to the {@code mMetaData} field. */
        public AIScene.Buffer mMetaData(@Nullable @NativeType("struct aiMetadata *") AIMetaData value) { AIScene.nmMetaData(address(), value); return this; }

    }

}