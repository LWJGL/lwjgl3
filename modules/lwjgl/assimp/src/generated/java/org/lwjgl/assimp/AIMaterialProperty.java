/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct aiMaterialProperty {
 *     {@link AIString struct aiString} mKey;
 *     unsigned int mSemantic;
 *     unsigned int mIndex;
 *     unsigned int mDataLength;
 *     aiPropertyTypeInfo mType;
 *     char * mData;
 * }}</pre>
 */
@NativeType("struct aiMaterialProperty")
public class AIMaterialProperty extends Struct<AIMaterialProperty> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MKEY,
        MSEMANTIC,
        MINDEX,
        MDATALENGTH,
        MTYPE,
        MDATA;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MKEY = layout.offsetof(0);
        MSEMANTIC = layout.offsetof(1);
        MINDEX = layout.offsetof(2);
        MDATALENGTH = layout.offsetof(3);
        MTYPE = layout.offsetof(4);
        MDATA = layout.offsetof(5);
    }

    protected AIMaterialProperty(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIMaterialProperty create(long address, @Nullable ByteBuffer container) {
        return new AIMaterialProperty(address, container);
    }

    /**
     * Creates a {@code AIMaterialProperty} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIMaterialProperty(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link AIString} view of the {@code mKey} field. */
    @NativeType("struct aiString")
    public AIString mKey() { return nmKey(address()); }
    /** @return the value of the {@code mSemantic} field. */
    @NativeType("unsigned int")
    public int mSemantic() { return nmSemantic(address()); }
    /** @return the value of the {@code mIndex} field. */
    @NativeType("unsigned int")
    public int mIndex() { return nmIndex(address()); }
    /** @return the value of the {@code mDataLength} field. */
    @NativeType("unsigned int")
    public int mDataLength() { return nmDataLength(address()); }
    /** @return the value of the {@code mType} field. */
    @NativeType("aiPropertyTypeInfo")
    public int mType() { return nmType(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code mData} field. */
    @NativeType("char *")
    public ByteBuffer mData() { return nmData(address()); }

    // -----------------------------------

    /** Returns a new {@code AIMaterialProperty} instance for the specified memory address. */
    public static AIMaterialProperty create(long address) {
        return new AIMaterialProperty(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIMaterialProperty createSafe(long address) {
        return address == NULL ? null : new AIMaterialProperty(address, null);
    }

    /**
     * Create a {@link AIMaterialProperty.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIMaterialProperty.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIMaterialProperty.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mKey}. */
    public static AIString nmKey(long struct) { return AIString.create(struct + AIMaterialProperty.MKEY); }
    /** Unsafe version of {@link #mSemantic}. */
    public static int nmSemantic(long struct) { return memGetInt(struct + AIMaterialProperty.MSEMANTIC); }
    /** Unsafe version of {@link #mIndex}. */
    public static int nmIndex(long struct) { return memGetInt(struct + AIMaterialProperty.MINDEX); }
    /** Unsafe version of {@link #mDataLength}. */
    public static int nmDataLength(long struct) { return memGetInt(struct + AIMaterialProperty.MDATALENGTH); }
    /** Unsafe version of {@link #mType}. */
    public static int nmType(long struct) { return memGetInt(struct + AIMaterialProperty.MTYPE); }
    /** Unsafe version of {@link #mData() mData}. */
    public static ByteBuffer nmData(long struct) { return memByteBuffer(memGetAddress(struct + AIMaterialProperty.MDATA), nmDataLength(struct)); }

    // -----------------------------------

    /** An array of {@link AIMaterialProperty} structs. */
    public static class Buffer extends StructBuffer<AIMaterialProperty, Buffer> {

        private static final AIMaterialProperty ELEMENT_FACTORY = AIMaterialProperty.create(-1L);

        /**
         * Creates a new {@code AIMaterialProperty.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIMaterialProperty#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIMaterialProperty getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@code mKey} field. */
        @NativeType("struct aiString")
        public AIString mKey() { return AIMaterialProperty.nmKey(address()); }
        /** @return the value of the {@code mSemantic} field. */
        @NativeType("unsigned int")
        public int mSemantic() { return AIMaterialProperty.nmSemantic(address()); }
        /** @return the value of the {@code mIndex} field. */
        @NativeType("unsigned int")
        public int mIndex() { return AIMaterialProperty.nmIndex(address()); }
        /** @return the value of the {@code mDataLength} field. */
        @NativeType("unsigned int")
        public int mDataLength() { return AIMaterialProperty.nmDataLength(address()); }
        /** @return the value of the {@code mType} field. */
        @NativeType("aiPropertyTypeInfo")
        public int mType() { return AIMaterialProperty.nmType(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code mData} field. */
        @NativeType("char *")
        public ByteBuffer mData() { return AIMaterialProperty.nmData(address()); }

    }

}