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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.assimp.Assimp.*;

/**
 * <pre><code>
 * struct aiMesh {
 *     unsigned int mPrimitiveTypes;
 *     unsigned int mNumVertices;
 *     unsigned int mNumFaces;
 *     {@link AIVector3D struct aiVector3D} * mVertices;
 *     {@link AIVector3D struct aiVector3D} * mNormals;
 *     {@link AIVector3D struct aiVector3D} * mTangents;
 *     {@link AIVector3D struct aiVector3D} * mBitangents;
 *     {@link AIColor4D struct aiColor4D} * mColors[AI_MAX_NUMBER_OF_COLOR_SETS];
 *     {@link AIVector3D struct aiVector3D} * mTextureCoords[AI_MAX_NUMBER_OF_TEXTURECOORDS];
 *     unsigned int mNumUVComponents[AI_MAX_NUMBER_OF_TEXTURECOORDS];
 *     {@link AIFace struct aiFace} * mFaces;
 *     unsigned int mNumBones;
 *     {@link AIBone struct aiBone} ** mBones;
 *     unsigned int mMaterialIndex;
 *     {@link AIString struct aiString} mName;
 *     unsigned int mNumAnimMeshes;
 *     {@link AIAnimMesh struct aiAnimMesh} ** mAnimMeshes;
 *     aiMorphingMethod mMethod;
 *     {@link AIAABB struct aiAABB} mAABB;
 *     {@link AIString struct aiString} ** mTextureCoordsNames;
 * }</code></pre>
 */
@NativeType("struct aiMesh")
public class AIMesh extends Struct<AIMesh> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MPRIMITIVETYPES,
        MNUMVERTICES,
        MNUMFACES,
        MVERTICES,
        MNORMALS,
        MTANGENTS,
        MBITANGENTS,
        MCOLORS,
        MTEXTURECOORDS,
        MNUMUVCOMPONENTS,
        MFACES,
        MNUMBONES,
        MBONES,
        MMATERIALINDEX,
        MNAME,
        MNUMANIMMESHES,
        MANIMMESHES,
        MMETHOD,
        MAABB,
        MTEXTURECOORDSNAMES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(POINTER_SIZE, AI_MAX_NUMBER_OF_COLOR_SETS),
            __array(POINTER_SIZE, AI_MAX_NUMBER_OF_TEXTURECOORDS),
            __array(4, AI_MAX_NUMBER_OF_TEXTURECOORDS),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(AIAABB.SIZEOF, AIAABB.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MPRIMITIVETYPES = layout.offsetof(0);
        MNUMVERTICES = layout.offsetof(1);
        MNUMFACES = layout.offsetof(2);
        MVERTICES = layout.offsetof(3);
        MNORMALS = layout.offsetof(4);
        MTANGENTS = layout.offsetof(5);
        MBITANGENTS = layout.offsetof(6);
        MCOLORS = layout.offsetof(7);
        MTEXTURECOORDS = layout.offsetof(8);
        MNUMUVCOMPONENTS = layout.offsetof(9);
        MFACES = layout.offsetof(10);
        MNUMBONES = layout.offsetof(11);
        MBONES = layout.offsetof(12);
        MMATERIALINDEX = layout.offsetof(13);
        MNAME = layout.offsetof(14);
        MNUMANIMMESHES = layout.offsetof(15);
        MANIMMESHES = layout.offsetof(16);
        MMETHOD = layout.offsetof(17);
        MAABB = layout.offsetof(18);
        MTEXTURECOORDSNAMES = layout.offsetof(19);
    }

    protected AIMesh(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIMesh create(long address, @Nullable ByteBuffer container) {
        return new AIMesh(address, container);
    }

    /**
     * Creates a {@code AIMesh} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMesh(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mPrimitiveTypes} field. */
    @NativeType("unsigned int")
    public int mPrimitiveTypes() { return nmPrimitiveTypes(address()); }
    /** @return the value of the {@code mNumVertices} field. */
    @NativeType("unsigned int")
    public int mNumVertices() { return nmNumVertices(address()); }
    /** @return the value of the {@code mNumFaces} field. */
    @NativeType("unsigned int")
    public int mNumFaces() { return nmNumFaces(address()); }
    /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mVertices} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.Buffer mVertices() { return nmVertices(address()); }
    /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mNormals} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.@Nullable Buffer mNormals() { return nmNormals(address()); }
    /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mTangents} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.@Nullable Buffer mTangents() { return nmTangents(address()); }
    /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mBitangents} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.@Nullable Buffer mBitangents() { return nmBitangents(address()); }
    /** @return a {@link PointerBuffer} view of the {@code mColors} field. */
    @NativeType("struct aiColor4D *[AI_MAX_NUMBER_OF_COLOR_SETS]")
    public PointerBuffer mColors() { return nmColors(address()); }
    /** @return a {@link AIColor4D} view of the pointer at the specified index of the {@code mColors} field. */
    @NativeType("struct aiColor4D *")
    public AIColor4D.@Nullable Buffer mColors(int index) { return nmColors(address(), index); }
    /** @return a {@link PointerBuffer} view of the {@code mTextureCoords} field. */
    @NativeType("struct aiVector3D *[AI_MAX_NUMBER_OF_TEXTURECOORDS]")
    public PointerBuffer mTextureCoords() { return nmTextureCoords(address()); }
    /** @return a {@link AIVector3D} view of the pointer at the specified index of the {@code mTextureCoords} field. */
    @NativeType("struct aiVector3D *")
    public AIVector3D.@Nullable Buffer mTextureCoords(int index) { return nmTextureCoords(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code mNumUVComponents} field. */
    @NativeType("unsigned int[AI_MAX_NUMBER_OF_TEXTURECOORDS]")
    public IntBuffer mNumUVComponents() { return nmNumUVComponents(address()); }
    /** @return the value at the specified index of the {@code mNumUVComponents} field. */
    @NativeType("unsigned int")
    public int mNumUVComponents(int index) { return nmNumUVComponents(address(), index); }
    /** @return a {@link AIFace.Buffer} view of the struct array pointed to by the {@code mFaces} field. */
    @NativeType("struct aiFace *")
    public AIFace.Buffer mFaces() { return nmFaces(address()); }
    /** @return the value of the {@code mNumBones} field. */
    @NativeType("unsigned int")
    public int mNumBones() { return nmNumBones(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mBones} field. */
    @NativeType("struct aiBone **")
    public @Nullable PointerBuffer mBones() { return nmBones(address()); }
    /** @return the value of the {@code mMaterialIndex} field. */
    @NativeType("unsigned int")
    public int mMaterialIndex() { return nmMaterialIndex(address()); }
    /** @return a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** @return the value of the {@code mNumAnimMeshes} field. */
    @NativeType("unsigned int")
    public int mNumAnimMeshes() { return nmNumAnimMeshes(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mAnimMeshes} field. */
    @NativeType("struct aiAnimMesh **")
    public @Nullable PointerBuffer mAnimMeshes() { return nmAnimMeshes(address()); }
    /** @return the value of the {@code mMethod} field. */
    @NativeType("aiMorphingMethod")
    public int mMethod() { return nmMethod(address()); }
    /** @return a {@link AIAABB} view of the {@code mAABB} field. */
    @NativeType("struct aiAABB")
    public AIAABB mAABB() { return nmAABB(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mTextureCoordsNames} field. */
    @NativeType("struct aiString **")
    public @Nullable PointerBuffer mTextureCoordsNames() { return nmTextureCoordsNames(address()); }

    /** Sets the specified value to the {@code mPrimitiveTypes} field. */
    public AIMesh mPrimitiveTypes(@NativeType("unsigned int") int value) { nmPrimitiveTypes(address(), value); return this; }
    /** Sets the specified value to the {@code mNumVertices} field. */
    public AIMesh mNumVertices(@NativeType("unsigned int") int value) { nmNumVertices(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mVertices} field. */
    public AIMesh mVertices(@NativeType("struct aiVector3D *") AIVector3D.Buffer value) { nmVertices(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mNormals} field. */
    public AIMesh mNormals(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { nmNormals(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mTangents} field. */
    public AIMesh mTangents(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { nmTangents(address(), value); return this; }
    /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mBitangents} field. */
    public AIMesh mBitangents(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { nmBitangents(address(), value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code mColors} field. */
    public AIMesh mColors(@NativeType("struct aiColor4D *[AI_MAX_NUMBER_OF_COLOR_SETS]") PointerBuffer value) { nmColors(address(), value); return this; }
    /** Copies the address of the specified {@link AIColor4D.Buffer} at the specified index of the {@code mColors} field. */
    public AIMesh mColors(int index, @NativeType("struct aiColor4D *") AIColor4D.@Nullable Buffer value) { nmColors(address(), index, value); return this; }
    /** Passes the element at {@code index} of the {@code mColors} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIMesh mColors(int index, java.util.function.Consumer<AIColor4D.@Nullable Buffer> consumer) { consumer.accept(mColors(index)); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code mTextureCoords} field. */
    public AIMesh mTextureCoords(@NativeType("struct aiVector3D *[AI_MAX_NUMBER_OF_TEXTURECOORDS]") PointerBuffer value) { nmTextureCoords(address(), value); return this; }
    /** Copies the address of the specified {@link AIVector3D.Buffer} at the specified index of the {@code mTextureCoords} field. */
    public AIMesh mTextureCoords(int index, @NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { nmTextureCoords(address(), index, value); return this; }
    /** Passes the element at {@code index} of the {@code mTextureCoords} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIMesh mTextureCoords(int index, java.util.function.Consumer<AIVector3D.@Nullable Buffer> consumer) { consumer.accept(mTextureCoords(index)); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code mNumUVComponents} field. */
    public AIMesh mNumUVComponents(@NativeType("unsigned int[AI_MAX_NUMBER_OF_TEXTURECOORDS]") IntBuffer value) { nmNumUVComponents(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code mNumUVComponents} field. */
    public AIMesh mNumUVComponents(int index, @NativeType("unsigned int") int value) { nmNumUVComponents(address(), index, value); return this; }
    /** Sets the address of the specified {@link AIFace.Buffer} to the {@code mFaces} field. */
    public AIMesh mFaces(@NativeType("struct aiFace *") AIFace.Buffer value) { nmFaces(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mBones} field. */
    public AIMesh mBones(@Nullable @NativeType("struct aiBone **") PointerBuffer value) { nmBones(address(), value); return this; }
    /** Sets the specified value to the {@code mMaterialIndex} field. */
    public AIMesh mMaterialIndex(@NativeType("unsigned int") int value) { nmMaterialIndex(address(), value); return this; }
    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AIMesh mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIMesh mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mAnimMeshes} field. */
    public AIMesh mAnimMeshes(@Nullable @NativeType("struct aiAnimMesh **") PointerBuffer value) { nmAnimMeshes(address(), value); return this; }
    /** Sets the specified value to the {@code mMethod} field. */
    public AIMesh mMethod(@NativeType("aiMorphingMethod") int value) { nmMethod(address(), value); return this; }
    /** Copies the specified {@link AIAABB} to the {@code mAABB} field. */
    public AIMesh mAABB(@NativeType("struct aiAABB") AIAABB value) { nmAABB(address(), value); return this; }
    /** Passes the {@code mAABB} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIMesh mAABB(java.util.function.Consumer<AIAABB> consumer) { consumer.accept(mAABB()); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mTextureCoordsNames} field. */
    public AIMesh mTextureCoordsNames(@Nullable @NativeType("struct aiString **") PointerBuffer value) { nmTextureCoordsNames(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMesh set(
        int mPrimitiveTypes,
        int mNumVertices,
        AIVector3D.Buffer mVertices,
        AIVector3D.@Nullable Buffer mNormals,
        AIVector3D.@Nullable Buffer mTangents,
        AIVector3D.@Nullable Buffer mBitangents,
        PointerBuffer mColors,
        PointerBuffer mTextureCoords,
        IntBuffer mNumUVComponents,
        AIFace.Buffer mFaces,
        @Nullable PointerBuffer mBones,
        int mMaterialIndex,
        AIString mName,
        @Nullable PointerBuffer mAnimMeshes,
        int mMethod,
        AIAABB mAABB,
        @Nullable PointerBuffer mTextureCoordsNames
    ) {
        mPrimitiveTypes(mPrimitiveTypes);
        mNumVertices(mNumVertices);
        mVertices(mVertices);
        mNormals(mNormals);
        mTangents(mTangents);
        mBitangents(mBitangents);
        mColors(mColors);
        mTextureCoords(mTextureCoords);
        mNumUVComponents(mNumUVComponents);
        mFaces(mFaces);
        mBones(mBones);
        mMaterialIndex(mMaterialIndex);
        mName(mName);
        mAnimMeshes(mAnimMeshes);
        mMethod(mMethod);
        mAABB(mAABB);
        mTextureCoordsNames(mTextureCoordsNames);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMesh set(AIMesh src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIMesh} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMesh malloc() {
        return new AIMesh(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIMesh} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMesh calloc() {
        return new AIMesh(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIMesh} instance allocated with {@link BufferUtils}. */
    public static AIMesh create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIMesh(memAddress(container), container);
    }

    /** Returns a new {@code AIMesh} instance for the specified memory address. */
    public static AIMesh create(long address) {
        return new AIMesh(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIMesh createSafe(long address) {
        return address == NULL ? null : new AIMesh(address, null);
    }

    /**
     * Returns a new {@link AIMesh.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMesh.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIMesh.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMesh.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMesh.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMesh.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIMesh.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMesh.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIMesh.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMesh mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMesh callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMesh mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMesh callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMesh.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMesh.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMesh.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMesh.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIMesh} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMesh malloc(MemoryStack stack) {
        return new AIMesh(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIMesh} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMesh calloc(MemoryStack stack) {
        return new AIMesh(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIMesh.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMesh.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMesh.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMesh.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mPrimitiveTypes}. */
    public static int nmPrimitiveTypes(long struct) { return memGetInt(struct + AIMesh.MPRIMITIVETYPES); }
    /** Unsafe version of {@link #mNumVertices}. */
    public static int nmNumVertices(long struct) { return memGetInt(struct + AIMesh.MNUMVERTICES); }
    /** Unsafe version of {@link #mNumFaces}. */
    public static int nmNumFaces(long struct) { return memGetInt(struct + AIMesh.MNUMFACES); }
    /** Unsafe version of {@link #mVertices}. */
    public static AIVector3D.Buffer nmVertices(long struct) { return AIVector3D.create(memGetAddress(struct + AIMesh.MVERTICES), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mNormals}. */
    public static AIVector3D.@Nullable Buffer nmNormals(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIMesh.MNORMALS), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mTangents}. */
    public static AIVector3D.@Nullable Buffer nmTangents(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIMesh.MTANGENTS), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mBitangents}. */
    public static AIVector3D.@Nullable Buffer nmBitangents(long struct) { return AIVector3D.createSafe(memGetAddress(struct + AIMesh.MBITANGENTS), nmNumVertices(struct)); }
    /** Unsafe version of {@link #mColors}. */
    public static PointerBuffer nmColors(long struct) { return memPointerBuffer(struct + AIMesh.MCOLORS, AI_MAX_NUMBER_OF_COLOR_SETS); }
    /** Unsafe version of {@link #mColors(int) mColors}. */
    public static AIColor4D.@Nullable Buffer nmColors(long struct, int index) {
        return AIColor4D.createSafe(memGetAddress(struct + AIMesh.MCOLORS + check(index, AI_MAX_NUMBER_OF_COLOR_SETS) * POINTER_SIZE), nmNumVertices(struct));
    }
    /** Unsafe version of {@link #mTextureCoords}. */
    public static PointerBuffer nmTextureCoords(long struct) { return memPointerBuffer(struct + AIMesh.MTEXTURECOORDS, AI_MAX_NUMBER_OF_TEXTURECOORDS); }
    /** Unsafe version of {@link #mTextureCoords(int) mTextureCoords}. */
    public static AIVector3D.@Nullable Buffer nmTextureCoords(long struct, int index) {
        return AIVector3D.createSafe(memGetAddress(struct + AIMesh.MTEXTURECOORDS + check(index, AI_MAX_NUMBER_OF_TEXTURECOORDS) * POINTER_SIZE), nmNumVertices(struct));
    }
    /** Unsafe version of {@link #mNumUVComponents}. */
    public static IntBuffer nmNumUVComponents(long struct) { return memIntBuffer(struct + AIMesh.MNUMUVCOMPONENTS, AI_MAX_NUMBER_OF_TEXTURECOORDS); }
    /** Unsafe version of {@link #mNumUVComponents(int) mNumUVComponents}. */
    public static int nmNumUVComponents(long struct, int index) {
        return memGetInt(struct + AIMesh.MNUMUVCOMPONENTS + check(index, AI_MAX_NUMBER_OF_TEXTURECOORDS) * 4);
    }
    /** Unsafe version of {@link #mFaces}. */
    public static AIFace.Buffer nmFaces(long struct) { return AIFace.create(memGetAddress(struct + AIMesh.MFACES), nmNumFaces(struct)); }
    /** Unsafe version of {@link #mNumBones}. */
    public static int nmNumBones(long struct) { return memGetInt(struct + AIMesh.MNUMBONES); }
    /** Unsafe version of {@link #mBones() mBones}. */
    public static @Nullable PointerBuffer nmBones(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIMesh.MBONES), nmNumBones(struct)); }
    /** Unsafe version of {@link #mMaterialIndex}. */
    public static int nmMaterialIndex(long struct) { return memGetInt(struct + AIMesh.MMATERIALINDEX); }
    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIMesh.MNAME); }
    /** Unsafe version of {@link #mNumAnimMeshes}. */
    public static int nmNumAnimMeshes(long struct) { return memGetInt(struct + AIMesh.MNUMANIMMESHES); }
    /** Unsafe version of {@link #mAnimMeshes() mAnimMeshes}. */
    public static @Nullable PointerBuffer nmAnimMeshes(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIMesh.MANIMMESHES), nmNumAnimMeshes(struct)); }
    /** Unsafe version of {@link #mMethod}. */
    public static int nmMethod(long struct) { return memGetInt(struct + AIMesh.MMETHOD); }
    /** Unsafe version of {@link #mAABB}. */
    public static AIAABB nmAABB(long struct) { return AIAABB.create(struct + AIMesh.MAABB); }
    /** Unsafe version of {@link #mTextureCoordsNames() mTextureCoordsNames}. */
    public static @Nullable PointerBuffer nmTextureCoordsNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + AIMesh.MTEXTURECOORDSNAMES), AI_MAX_NUMBER_OF_TEXTURECOORDS); }

    /** Unsafe version of {@link #mPrimitiveTypes(int) mPrimitiveTypes}. */
    public static void nmPrimitiveTypes(long struct, int value) { memPutInt(struct + AIMesh.MPRIMITIVETYPES, value); }
    /** Sets the specified value to the {@code mNumVertices} field of the specified {@code struct}. */
    public static void nmNumVertices(long struct, int value) { memPutInt(struct + AIMesh.MNUMVERTICES, value); }
    /** Sets the specified value to the {@code mNumFaces} field of the specified {@code struct}. */
    public static void nmNumFaces(long struct, int value) { memPutInt(struct + AIMesh.MNUMFACES, value); }
    /** Unsafe version of {@link #mVertices(AIVector3D.Buffer) mVertices}. */
    public static void nmVertices(long struct, AIVector3D.Buffer value) { memPutAddress(struct + AIMesh.MVERTICES, value.address()); }
    /** Unsafe version of {@link #mNormals(AIVector3D.Buffer) mNormals}. */
    public static void nmNormals(long struct, AIVector3D.@Nullable Buffer value) { memPutAddress(struct + AIMesh.MNORMALS, memAddressSafe(value)); }
    /** Unsafe version of {@link #mTangents(AIVector3D.Buffer) mTangents}. */
    public static void nmTangents(long struct, AIVector3D.@Nullable Buffer value) { memPutAddress(struct + AIMesh.MTANGENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #mBitangents(AIVector3D.Buffer) mBitangents}. */
    public static void nmBitangents(long struct, AIVector3D.@Nullable Buffer value) { memPutAddress(struct + AIMesh.MBITANGENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #mColors(PointerBuffer) mColors}. */
    public static void nmColors(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, AI_MAX_NUMBER_OF_COLOR_SETS); }
        memCopy(memAddress(value), struct + AIMesh.MCOLORS, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #mColors(int, AIColor4D.Buffer) mColors}. */
    public static void nmColors(long struct, int index, AIColor4D.@Nullable Buffer value) {
        memPutAddress(struct + AIMesh.MCOLORS + check(index, AI_MAX_NUMBER_OF_COLOR_SETS) * POINTER_SIZE, memAddressSafe(value));
    }
    /** Unsafe version of {@link #mTextureCoords(PointerBuffer) mTextureCoords}. */
    public static void nmTextureCoords(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, AI_MAX_NUMBER_OF_TEXTURECOORDS); }
        memCopy(memAddress(value), struct + AIMesh.MTEXTURECOORDS, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #mTextureCoords(int, AIVector3D.Buffer) mTextureCoords}. */
    public static void nmTextureCoords(long struct, int index, AIVector3D.@Nullable Buffer value) {
        memPutAddress(struct + AIMesh.MTEXTURECOORDS + check(index, AI_MAX_NUMBER_OF_TEXTURECOORDS) * POINTER_SIZE, memAddressSafe(value));
    }
    /** Unsafe version of {@link #mNumUVComponents(IntBuffer) mNumUVComponents}. */
    public static void nmNumUVComponents(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, AI_MAX_NUMBER_OF_TEXTURECOORDS); }
        memCopy(memAddress(value), struct + AIMesh.MNUMUVCOMPONENTS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #mNumUVComponents(int, int) mNumUVComponents}. */
    public static void nmNumUVComponents(long struct, int index, int value) {
        memPutInt(struct + AIMesh.MNUMUVCOMPONENTS + check(index, AI_MAX_NUMBER_OF_TEXTURECOORDS) * 4, value);
    }
    /** Unsafe version of {@link #mFaces(AIFace.Buffer) mFaces}. */
    public static void nmFaces(long struct, AIFace.Buffer value) { memPutAddress(struct + AIMesh.MFACES, value.address()); nmNumFaces(struct, value.remaining()); }
    /** Sets the specified value to the {@code mNumBones} field of the specified {@code struct}. */
    public static void nmNumBones(long struct, int value) { memPutInt(struct + AIMesh.MNUMBONES, value); }
    /** Unsafe version of {@link #mBones(PointerBuffer) mBones}. */
    public static void nmBones(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIMesh.MBONES, memAddressSafe(value)); nmNumBones(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mMaterialIndex(int) mMaterialIndex}. */
    public static void nmMaterialIndex(long struct, int value) { memPutInt(struct + AIMesh.MMATERIALINDEX, value); }
    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIMesh.MNAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumAnimMeshes} field of the specified {@code struct}. */
    public static void nmNumAnimMeshes(long struct, int value) { memPutInt(struct + AIMesh.MNUMANIMMESHES, value); }
    /** Unsafe version of {@link #mAnimMeshes(PointerBuffer) mAnimMeshes}. */
    public static void nmAnimMeshes(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIMesh.MANIMMESHES, memAddressSafe(value)); nmNumAnimMeshes(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mMethod(int) mMethod}. */
    public static void nmMethod(long struct, int value) { memPutInt(struct + AIMesh.MMETHOD, value); }
    /** Unsafe version of {@link #mAABB(AIAABB) mAABB}. */
    public static void nmAABB(long struct, AIAABB value) { memCopy(value.address(), struct + AIMesh.MAABB, AIAABB.SIZEOF); }
    /** Unsafe version of {@link #mTextureCoordsNames(PointerBuffer) mTextureCoordsNames}. */
    public static void nmTextureCoordsNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + AIMesh.MTEXTURECOORDSNAMES, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int mNumFaces = nmNumFaces(struct);
        check(memGetAddress(struct + AIMesh.MVERTICES));
        long mFaces = memGetAddress(struct + AIMesh.MFACES);
        check(mFaces);
        validate(mFaces, mNumFaces, AIFace.SIZEOF, AIFace::validate);
        if (nmNumBones(struct) != 0) {
            check(memGetAddress(struct + AIMesh.MBONES));
        }
        if (nmNumAnimMeshes(struct) != 0) {
            check(memGetAddress(struct + AIMesh.MANIMMESHES));
        }
    }

    // -----------------------------------

    /** An array of {@link AIMesh} structs. */
    public static class Buffer extends StructBuffer<AIMesh, Buffer> implements NativeResource {

        private static final AIMesh ELEMENT_FACTORY = AIMesh.create(-1L);

        /**
         * Creates a new {@code AIMesh.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMesh#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected AIMesh getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mPrimitiveTypes} field. */
        @NativeType("unsigned int")
        public int mPrimitiveTypes() { return AIMesh.nmPrimitiveTypes(address()); }
        /** @return the value of the {@code mNumVertices} field. */
        @NativeType("unsigned int")
        public int mNumVertices() { return AIMesh.nmNumVertices(address()); }
        /** @return the value of the {@code mNumFaces} field. */
        @NativeType("unsigned int")
        public int mNumFaces() { return AIMesh.nmNumFaces(address()); }
        /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mVertices} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.Buffer mVertices() { return AIMesh.nmVertices(address()); }
        /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mNormals} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.@Nullable Buffer mNormals() { return AIMesh.nmNormals(address()); }
        /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mTangents} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.@Nullable Buffer mTangents() { return AIMesh.nmTangents(address()); }
        /** @return a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mBitangents} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.@Nullable Buffer mBitangents() { return AIMesh.nmBitangents(address()); }
        /** @return a {@link PointerBuffer} view of the {@code mColors} field. */
        @NativeType("struct aiColor4D *[AI_MAX_NUMBER_OF_COLOR_SETS]")
        public PointerBuffer mColors() { return AIMesh.nmColors(address()); }
        /** @return a {@link AIColor4D} view of the pointer at the specified index of the {@code mColors} field. */
        @NativeType("struct aiColor4D *")
        public AIColor4D.@Nullable Buffer mColors(int index) { return AIMesh.nmColors(address(), index); }
        /** @return a {@link PointerBuffer} view of the {@code mTextureCoords} field. */
        @NativeType("struct aiVector3D *[AI_MAX_NUMBER_OF_TEXTURECOORDS]")
        public PointerBuffer mTextureCoords() { return AIMesh.nmTextureCoords(address()); }
        /** @return a {@link AIVector3D} view of the pointer at the specified index of the {@code mTextureCoords} field. */
        @NativeType("struct aiVector3D *")
        public AIVector3D.@Nullable Buffer mTextureCoords(int index) { return AIMesh.nmTextureCoords(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code mNumUVComponents} field. */
        @NativeType("unsigned int[AI_MAX_NUMBER_OF_TEXTURECOORDS]")
        public IntBuffer mNumUVComponents() { return AIMesh.nmNumUVComponents(address()); }
        /** @return the value at the specified index of the {@code mNumUVComponents} field. */
        @NativeType("unsigned int")
        public int mNumUVComponents(int index) { return AIMesh.nmNumUVComponents(address(), index); }
        /** @return a {@link AIFace.Buffer} view of the struct array pointed to by the {@code mFaces} field. */
        @NativeType("struct aiFace *")
        public AIFace.Buffer mFaces() { return AIMesh.nmFaces(address()); }
        /** @return the value of the {@code mNumBones} field. */
        @NativeType("unsigned int")
        public int mNumBones() { return AIMesh.nmNumBones(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mBones} field. */
        @NativeType("struct aiBone **")
        public @Nullable PointerBuffer mBones() { return AIMesh.nmBones(address()); }
        /** @return the value of the {@code mMaterialIndex} field. */
        @NativeType("unsigned int")
        public int mMaterialIndex() { return AIMesh.nmMaterialIndex(address()); }
        /** @return a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AIMesh.nmName(address()); }
        /** @return the value of the {@code mNumAnimMeshes} field. */
        @NativeType("unsigned int")
        public int mNumAnimMeshes() { return AIMesh.nmNumAnimMeshes(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mAnimMeshes} field. */
        @NativeType("struct aiAnimMesh **")
        public @Nullable PointerBuffer mAnimMeshes() { return AIMesh.nmAnimMeshes(address()); }
        /** @return the value of the {@code mMethod} field. */
        @NativeType("aiMorphingMethod")
        public int mMethod() { return AIMesh.nmMethod(address()); }
        /** @return a {@link AIAABB} view of the {@code mAABB} field. */
        @NativeType("struct aiAABB")
        public AIAABB mAABB() { return AIMesh.nmAABB(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mTextureCoordsNames} field. */
        @NativeType("struct aiString **")
        public @Nullable PointerBuffer mTextureCoordsNames() { return AIMesh.nmTextureCoordsNames(address()); }

        /** Sets the specified value to the {@code mPrimitiveTypes} field. */
        public AIMesh.Buffer mPrimitiveTypes(@NativeType("unsigned int") int value) { AIMesh.nmPrimitiveTypes(address(), value); return this; }
        /** Sets the specified value to the {@code mNumVertices} field. */
        public AIMesh.Buffer mNumVertices(@NativeType("unsigned int") int value) { AIMesh.nmNumVertices(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mVertices} field. */
        public AIMesh.Buffer mVertices(@NativeType("struct aiVector3D *") AIVector3D.Buffer value) { AIMesh.nmVertices(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mNormals} field. */
        public AIMesh.Buffer mNormals(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { AIMesh.nmNormals(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mTangents} field. */
        public AIMesh.Buffer mTangents(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { AIMesh.nmTangents(address(), value); return this; }
        /** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mBitangents} field. */
        public AIMesh.Buffer mBitangents(@NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { AIMesh.nmBitangents(address(), value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code mColors} field. */
        public AIMesh.Buffer mColors(@NativeType("struct aiColor4D *[AI_MAX_NUMBER_OF_COLOR_SETS]") PointerBuffer value) { AIMesh.nmColors(address(), value); return this; }
        /** Copies the address of the specified {@link AIColor4D.Buffer} at the specified index of the {@code mColors} field. */
        public AIMesh.Buffer mColors(int index, @NativeType("struct aiColor4D *") AIColor4D.@Nullable Buffer value) { AIMesh.nmColors(address(), index, value); return this; }
        /** Passes the element at {@code index} of the {@code mColors} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIMesh.Buffer mColors(int index, java.util.function.Consumer<AIColor4D.@Nullable Buffer> consumer) { consumer.accept(mColors(index)); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code mTextureCoords} field. */
        public AIMesh.Buffer mTextureCoords(@NativeType("struct aiVector3D *[AI_MAX_NUMBER_OF_TEXTURECOORDS]") PointerBuffer value) { AIMesh.nmTextureCoords(address(), value); return this; }
        /** Copies the address of the specified {@link AIVector3D.Buffer} at the specified index of the {@code mTextureCoords} field. */
        public AIMesh.Buffer mTextureCoords(int index, @NativeType("struct aiVector3D *") AIVector3D.@Nullable Buffer value) { AIMesh.nmTextureCoords(address(), index, value); return this; }
        /** Passes the element at {@code index} of the {@code mTextureCoords} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIMesh.Buffer mTextureCoords(int index, java.util.function.Consumer<AIVector3D.@Nullable Buffer> consumer) { consumer.accept(mTextureCoords(index)); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code mNumUVComponents} field. */
        public AIMesh.Buffer mNumUVComponents(@NativeType("unsigned int[AI_MAX_NUMBER_OF_TEXTURECOORDS]") IntBuffer value) { AIMesh.nmNumUVComponents(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code mNumUVComponents} field. */
        public AIMesh.Buffer mNumUVComponents(int index, @NativeType("unsigned int") int value) { AIMesh.nmNumUVComponents(address(), index, value); return this; }
        /** Sets the address of the specified {@link AIFace.Buffer} to the {@code mFaces} field. */
        public AIMesh.Buffer mFaces(@NativeType("struct aiFace *") AIFace.Buffer value) { AIMesh.nmFaces(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mBones} field. */
        public AIMesh.Buffer mBones(@Nullable @NativeType("struct aiBone **") PointerBuffer value) { AIMesh.nmBones(address(), value); return this; }
        /** Sets the specified value to the {@code mMaterialIndex} field. */
        public AIMesh.Buffer mMaterialIndex(@NativeType("unsigned int") int value) { AIMesh.nmMaterialIndex(address(), value); return this; }
        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AIMesh.Buffer mName(@NativeType("struct aiString") AIString value) { AIMesh.nmName(address(), value); return this; }
        /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIMesh.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mAnimMeshes} field. */
        public AIMesh.Buffer mAnimMeshes(@Nullable @NativeType("struct aiAnimMesh **") PointerBuffer value) { AIMesh.nmAnimMeshes(address(), value); return this; }
        /** Sets the specified value to the {@code mMethod} field. */
        public AIMesh.Buffer mMethod(@NativeType("aiMorphingMethod") int value) { AIMesh.nmMethod(address(), value); return this; }
        /** Copies the specified {@link AIAABB} to the {@code mAABB} field. */
        public AIMesh.Buffer mAABB(@NativeType("struct aiAABB") AIAABB value) { AIMesh.nmAABB(address(), value); return this; }
        /** Passes the {@code mAABB} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIMesh.Buffer mAABB(java.util.function.Consumer<AIAABB> consumer) { consumer.accept(mAABB()); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mTextureCoordsNames} field. */
        public AIMesh.Buffer mTextureCoordsNames(@Nullable @NativeType("struct aiString **") PointerBuffer value) { AIMesh.nmTextureCoordsNames(address(), value); return this; }

    }

}