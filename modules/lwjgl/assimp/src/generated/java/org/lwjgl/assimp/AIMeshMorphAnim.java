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

/**
 * <pre><code>
 * struct aiMeshMorphAnim {
 *     {@link AIString struct aiString} mName;
 *     unsigned int mNumKeys;
 *     {@link AIMeshMorphKey struct aiMeshMorphKey} * mKeys;
 * }</code></pre>
 */
@NativeType("struct aiMeshMorphAnim")
public class AIMeshMorphAnim extends Struct<AIMeshMorphAnim> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MNUMKEYS,
        MKEYS;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MNUMKEYS = layout.offsetof(1);
        MKEYS = layout.offsetof(2);
    }

    protected AIMeshMorphAnim(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIMeshMorphAnim create(long address, @Nullable ByteBuffer container) {
        return new AIMeshMorphAnim(address, container);
    }

    /**
     * Creates a {@code AIMeshMorphAnim} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMeshMorphAnim(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** @return the value of the {@code mNumKeys} field. */
    @NativeType("unsigned int")
    public int mNumKeys() { return nmNumKeys(address()); }
    /** @return a {@link AIMeshMorphKey.Buffer} view of the struct array pointed to by the {@code mKeys} field. */
    @NativeType("struct aiMeshMorphKey *")
    public AIMeshMorphKey.Buffer mKeys() { return nmKeys(address()); }

    /** Copies the specified {@link AIString} to the {@code mName} field. */
    public AIMeshMorphAnim mName(@NativeType("struct aiString") AIString value) { nmName(address(), value); return this; }
    /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public AIMeshMorphAnim mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
    /** Sets the address of the specified {@link AIMeshMorphKey.Buffer} to the {@code mKeys} field. */
    public AIMeshMorphAnim mKeys(@NativeType("struct aiMeshMorphKey *") AIMeshMorphKey.Buffer value) { nmKeys(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMeshMorphAnim set(
        AIString mName,
        AIMeshMorphKey.Buffer mKeys
    ) {
        mName(mName);
        mKeys(mKeys);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMeshMorphAnim set(AIMeshMorphAnim src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIMeshMorphAnim} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMeshMorphAnim malloc() {
        return new AIMeshMorphAnim(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIMeshMorphAnim} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMeshMorphAnim calloc() {
        return new AIMeshMorphAnim(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIMeshMorphAnim} instance allocated with {@link BufferUtils}. */
    public static AIMeshMorphAnim create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIMeshMorphAnim(memAddress(container), container);
    }

    /** Returns a new {@code AIMeshMorphAnim} instance for the specified memory address. */
    public static AIMeshMorphAnim create(long address) {
        return new AIMeshMorphAnim(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIMeshMorphAnim createSafe(long address) {
        return address == NULL ? null : new AIMeshMorphAnim(address, null);
    }

    /**
     * Returns a new {@link AIMeshMorphAnim.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphAnim.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIMeshMorphAnim.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphAnim.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshMorphAnim.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphAnim.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIMeshMorphAnim.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphAnim.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIMeshMorphAnim.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphAnim mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphAnim callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphAnim mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphAnim callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphAnim.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphAnim.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphAnim.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMeshMorphAnim.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIMeshMorphAnim} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshMorphAnim malloc(MemoryStack stack) {
        return new AIMeshMorphAnim(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIMeshMorphAnim} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMeshMorphAnim calloc(MemoryStack stack) {
        return new AIMeshMorphAnim(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIMeshMorphAnim.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphAnim.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMeshMorphAnim.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMeshMorphAnim.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AIMeshMorphAnim.MNAME); }
    /** Unsafe version of {@link #mNumKeys}. */
    public static int nmNumKeys(long struct) { return memGetInt(struct + AIMeshMorphAnim.MNUMKEYS); }
    /** Unsafe version of {@link #mKeys}. */
    public static AIMeshMorphKey.Buffer nmKeys(long struct) { return AIMeshMorphKey.create(memGetAddress(struct + AIMeshMorphAnim.MKEYS), nmNumKeys(struct)); }

    /** Unsafe version of {@link #mName(AIString) mName}. */
    public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIMeshMorphAnim.MNAME, AIString.SIZEOF); }
    /** Sets the specified value to the {@code mNumKeys} field of the specified {@code struct}. */
    public static void nmNumKeys(long struct, int value) { memPutInt(struct + AIMeshMorphAnim.MNUMKEYS, value); }
    /** Unsafe version of {@link #mKeys(AIMeshMorphKey.Buffer) mKeys}. */
    public static void nmKeys(long struct, AIMeshMorphKey.Buffer value) { memPutAddress(struct + AIMeshMorphAnim.MKEYS, value.address()); nmNumKeys(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int mNumKeys = nmNumKeys(struct);
        long mKeys = memGetAddress(struct + AIMeshMorphAnim.MKEYS);
        check(mKeys);
        validate(mKeys, mNumKeys, AIMeshMorphKey.SIZEOF, AIMeshMorphKey::validate);
    }

    // -----------------------------------

    /** An array of {@link AIMeshMorphAnim} structs. */
    public static class Buffer extends StructBuffer<AIMeshMorphAnim, Buffer> implements NativeResource {

        private static final AIMeshMorphAnim ELEMENT_FACTORY = AIMeshMorphAnim.create(-1L);

        /**
         * Creates a new {@code AIMeshMorphAnim.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMeshMorphAnim#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIMeshMorphAnim getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AIMeshMorphAnim.nmName(address()); }
        /** @return the value of the {@code mNumKeys} field. */
        @NativeType("unsigned int")
        public int mNumKeys() { return AIMeshMorphAnim.nmNumKeys(address()); }
        /** @return a {@link AIMeshMorphKey.Buffer} view of the struct array pointed to by the {@code mKeys} field. */
        @NativeType("struct aiMeshMorphKey *")
        public AIMeshMorphKey.Buffer mKeys() { return AIMeshMorphAnim.nmKeys(address()); }

        /** Copies the specified {@link AIString} to the {@code mName} field. */
        public AIMeshMorphAnim.Buffer mName(@NativeType("struct aiString") AIString value) { AIMeshMorphAnim.nmName(address(), value); return this; }
        /** Passes the {@code mName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public AIMeshMorphAnim.Buffer mName(java.util.function.Consumer<AIString> consumer) { consumer.accept(mName()); return this; }
        /** Sets the address of the specified {@link AIMeshMorphKey.Buffer} to the {@code mKeys} field. */
        public AIMeshMorphAnim.Buffer mKeys(@NativeType("struct aiMeshMorphKey *") AIMeshMorphKey.Buffer value) { AIMeshMorphAnim.nmKeys(address(), value); return this; }

    }

}