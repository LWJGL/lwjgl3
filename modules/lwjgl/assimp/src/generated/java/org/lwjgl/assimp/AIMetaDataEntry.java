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
 * struct aiMetadataEntry {
 *     aiMetadataType mType;
 *     void * mData;
 * }</code></pre>
 */
@NativeType("struct aiMetadataEntry")
public class AIMetaDataEntry extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MTYPE,
        MDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MTYPE = layout.offsetof(0);
        MDATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code AIMetaDataEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMetaDataEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mType} field. */
    @NativeType("aiMetadataType")
    public int mType() { return nmType(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code mData} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer mData(int capacity) { return nmData(address(), capacity); }

    /** Sets the specified value to the {@code mType} field. */
    public AIMetaDataEntry mType(@NativeType("aiMetadataType") int value) { nmType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code mData} field. */
    public AIMetaDataEntry mData(@NativeType("void *") ByteBuffer value) { nmData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIMetaDataEntry set(
        int mType,
        ByteBuffer mData
    ) {
        mType(mType);
        mData(mData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIMetaDataEntry set(AIMetaDataEntry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIMetaDataEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIMetaDataEntry malloc() {
        return wrap(AIMetaDataEntry.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIMetaDataEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIMetaDataEntry calloc() {
        return wrap(AIMetaDataEntry.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIMetaDataEntry} instance allocated with {@link BufferUtils}. */
    public static AIMetaDataEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIMetaDataEntry.class, memAddress(container), container);
    }

    /** Returns a new {@code AIMetaDataEntry} instance for the specified memory address. */
    public static AIMetaDataEntry create(long address) {
        return wrap(AIMetaDataEntry.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMetaDataEntry createSafe(long address) {
        return address == NULL ? null : wrap(AIMetaDataEntry.class, address);
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMetaDataEntry.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIMetaDataEntry.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIMetaDataEntry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIMetaDataEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMetaDataEntry.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIMetaDataEntry.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMetaDataEntry mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMetaDataEntry callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIMetaDataEntry mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIMetaDataEntry callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMetaDataEntry.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMetaDataEntry.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMetaDataEntry.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIMetaDataEntry.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIMetaDataEntry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMetaDataEntry malloc(MemoryStack stack) {
        return wrap(AIMetaDataEntry.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIMetaDataEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIMetaDataEntry calloc(MemoryStack stack) {
        return wrap(AIMetaDataEntry.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMetaDataEntry.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIMetaDataEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIMetaDataEntry.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mType}. */
    public static int nmType(long struct) { return UNSAFE.getInt(null, struct + AIMetaDataEntry.MTYPE); }
    /** Unsafe version of {@link #mData(int) mData}. */
    public static ByteBuffer nmData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + AIMetaDataEntry.MDATA), capacity); }

    /** Unsafe version of {@link #mType(int) mType}. */
    public static void nmType(long struct, int value) { UNSAFE.putInt(null, struct + AIMetaDataEntry.MTYPE, value); }
    /** Unsafe version of {@link #mData(ByteBuffer) mData}. */
    public static void nmData(long struct, ByteBuffer value) { memPutAddress(struct + AIMetaDataEntry.MDATA, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIMetaDataEntry.MDATA));
    }

    // -----------------------------------

    /** An array of {@link AIMetaDataEntry} structs. */
    public static class Buffer extends StructBuffer<AIMetaDataEntry, Buffer> implements NativeResource {

        private static final AIMetaDataEntry ELEMENT_FACTORY = AIMetaDataEntry.create(-1L);

        /**
         * Creates a new {@code AIMetaDataEntry.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMetaDataEntry#SIZEOF}, and its mark will be undefined.
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
        protected AIMetaDataEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mType} field. */
        @NativeType("aiMetadataType")
        public int mType() { return AIMetaDataEntry.nmType(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code mData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer mData(int capacity) { return AIMetaDataEntry.nmData(address(), capacity); }

        /** Sets the specified value to the {@code mType} field. */
        public AIMetaDataEntry.Buffer mType(@NativeType("aiMetadataType") int value) { AIMetaDataEntry.nmType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code mData} field. */
        public AIMetaDataEntry.Buffer mData(@NativeType("void *") ByteBuffer value) { AIMetaDataEntry.nmData(address(), value); return this; }

    }

}