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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiMetadata {
 *     unsigned int {@link #mNumProperties};
 *     {@link AIString struct aiString} * {@link #mKeys};
 *     {@link AIMetaDataEntry struct aiMetadataEntry} * {@link #mValues};
 * }</code></pre>
 */
@NativeType("struct aiMetadata")
public class AIMetaData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNUMPROPERTIES,
        MKEYS,
        MVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNUMPROPERTIES = layout.offsetof(0);
        MKEYS = layout.offsetof(1);
        MVALUES = layout.offsetof(2);
    }

    /**
     * Creates a {@code AIMetaData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMetaData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Length of the {@code mKeys} and {@code mValues} arrays, respectively */
    @NativeType("unsigned int")
    public int mNumProperties() { return nmNumProperties(address()); }
    /** Arrays of keys, may not be {@code NULL}. Entries in this array may not be {@code NULL} as well. */
    @NativeType("struct aiString *")
    public AIString.Buffer mKeys() { return nmKeys(address()); }
    /** Arrays of values, may not be {@code NULL}. Entries in this array may be {@code NULL} if the corresponding property key has no assigned value. */
    @NativeType("struct aiMetadataEntry *")
    public AIMetaDataEntry.Buffer mValues() { return nmValues(address()); }

    /** Sets the specified value to the {@link #mNumProperties} field. */
    public AIMetaData mNumProperties(@NativeType("unsigned int") int value) { nmNumProperties(address(), value); return this; }
    /** Sets the address of the specified {@link AIString.Buffer} to the {@link #mKeys} field. */
    public AIMetaData mKeys(@NativeType("struct aiString *") AIString.Buffer value) { nmKeys(address(), value); return this; }
    /** Sets the address of the specified {@link AIMetaDataEntry.Buffer} to the {@link #mValues} field. */
    public AIMetaData mValues(@NativeType("struct aiMetadataEntry *") AIMetaDataEntry.Buffer value) { nmValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMetaData set(
        int mNumProperties,
        AIString.Buffer mKeys,
        AIMetaDataEntry.Buffer mValues
    ) {
        mNumProperties(mNumProperties);
        mKeys(mKeys);
        mValues(mValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMetaData set(AIMetaData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIMetaData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMetaData malloc() {
        return wrap(AIMetaData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIMetaData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMetaData calloc() {
        return wrap(AIMetaData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIMetaData} instance allocated with {@link BufferUtils}. */
    public static AIMetaData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIMetaData.class, memAddress(container), container);
    }

    /** Returns a new {@code AIMetaData} instance for the specified memory address. */
    public static AIMetaData create(long address) {
        return wrap(AIMetaData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMetaData createSafe(long address) {
        return address == NULL ? null : wrap(AIMetaData.class, address);
    }

    /**
     * Returns a new {@link AIMetaData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMetaData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIMetaData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMetaData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMetaData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMetaData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIMetaData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMetaData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMetaData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMetaData mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMetaData callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMetaData mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMetaData callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMetaData.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMetaData.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMetaData.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMetaData.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIMetaData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMetaData malloc(MemoryStack stack) {
        return wrap(AIMetaData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIMetaData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMetaData calloc(MemoryStack stack) {
        return wrap(AIMetaData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMetaData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMetaData.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMetaData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMetaData.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mNumProperties}. */
    public static int nmNumProperties(long struct) { return UNSAFE.getInt(null, struct + AIMetaData.MNUMPROPERTIES); }
    /** Unsafe version of {@link #mKeys}. */
    public static AIString.Buffer nmKeys(long struct) { return AIString.create(memGetAddress(struct + AIMetaData.MKEYS), nmNumProperties(struct)); }
    /** Unsafe version of {@link #mValues}. */
    public static AIMetaDataEntry.Buffer nmValues(long struct) { return AIMetaDataEntry.create(memGetAddress(struct + AIMetaData.MVALUES), nmNumProperties(struct)); }

    /** Sets the specified value to the {@code mNumProperties} field of the specified {@code struct}. */
    public static void nmNumProperties(long struct, int value) { UNSAFE.putInt(null, struct + AIMetaData.MNUMPROPERTIES, value); }
    /** Unsafe version of {@link #mKeys(AIString.Buffer) mKeys}. */
    public static void nmKeys(long struct, AIString.Buffer value) { memPutAddress(struct + AIMetaData.MKEYS, value.address()); }
    /** Unsafe version of {@link #mValues(AIMetaDataEntry.Buffer) mValues}. */
    public static void nmValues(long struct, AIMetaDataEntry.Buffer value) { memPutAddress(struct + AIMetaData.MVALUES, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int mNumProperties = nmNumProperties(struct);
        check(memGetAddress(struct + AIMetaData.MKEYS));
        long mValues = memGetAddress(struct + AIMetaData.MVALUES);
        check(mValues);
        validate(mValues, mNumProperties, AIMetaDataEntry.SIZEOF, AIMetaDataEntry::validate);
    }

    // -----------------------------------

    /** An array of {@link AIMetaData} structs. */
    public static class Buffer extends StructBuffer<AIMetaData, Buffer> implements NativeResource {

        private static final AIMetaData ELEMENT_FACTORY = AIMetaData.create(-1L);

        /**
         * Creates a new {@code AIMetaData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMetaData#SIZEOF}, and its mark will be undefined.
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
        protected AIMetaData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIMetaData#mNumProperties} field. */
        @NativeType("unsigned int")
        public int mNumProperties() { return AIMetaData.nmNumProperties(address()); }
        /** @return a {@link AIString.Buffer} view of the struct array pointed to by the {@link AIMetaData#mKeys} field. */
        @NativeType("struct aiString *")
        public AIString.Buffer mKeys() { return AIMetaData.nmKeys(address()); }
        /** @return a {@link AIMetaDataEntry.Buffer} view of the struct array pointed to by the {@link AIMetaData#mValues} field. */
        @NativeType("struct aiMetadataEntry *")
        public AIMetaDataEntry.Buffer mValues() { return AIMetaData.nmValues(address()); }

        /** Sets the specified value to the {@link AIMetaData#mNumProperties} field. */
        public AIMetaData.Buffer mNumProperties(@NativeType("unsigned int") int value) { AIMetaData.nmNumProperties(address(), value); return this; }
        /** Sets the address of the specified {@link AIString.Buffer} to the {@link AIMetaData#mKeys} field. */
        public AIMetaData.Buffer mKeys(@NativeType("struct aiString *") AIString.Buffer value) { AIMetaData.nmKeys(address(), value); return this; }
        /** Sets the address of the specified {@link AIMetaDataEntry.Buffer} to the {@link AIMetaData#mValues} field. */
        public AIMetaData.Buffer mValues(@NativeType("struct aiMetadataEntry *") AIMetaDataEntry.Buffer value) { AIMetaData.nmValues(address(), value); return this; }

    }

}