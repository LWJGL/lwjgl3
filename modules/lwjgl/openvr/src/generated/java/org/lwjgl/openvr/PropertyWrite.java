/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct PropertyWrite_t {
 *     ETrackedDeviceProperty prop;
 *     EPropertyWriteType writeType;
 *     ETrackedPropertyError eSetError;
 *     void * pvBuffer;
 *     uint32_t unBufferSize;
 *     PropertyTypeTag_t unTag;
 *     ETrackedPropertyError eError;
 * }}</pre>
 */
@NativeType("struct PropertyWrite_t")
public class PropertyWrite extends Struct<PropertyWrite> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROP,
        WRITETYPE,
        ESETERROR,
        PVBUFFER,
        UNBUFFERSIZE,
        UNTAG,
        EERROR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROP = layout.offsetof(0);
        WRITETYPE = layout.offsetof(1);
        ESETERROR = layout.offsetof(2);
        PVBUFFER = layout.offsetof(3);
        UNBUFFERSIZE = layout.offsetof(4);
        UNTAG = layout.offsetof(5);
        EERROR = layout.offsetof(6);
    }

    protected PropertyWrite(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected PropertyWrite create(long address, @Nullable ByteBuffer container) {
        return new PropertyWrite(address, container);
    }

    /**
     * Creates a {@code PropertyWrite} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public PropertyWrite(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code prop} field. */
    @NativeType("ETrackedDeviceProperty")
    public int prop() { return nprop(address()); }
    /** @return the value of the {@code writeType} field. */
    @NativeType("EPropertyWriteType")
    public int writeType() { return nwriteType(address()); }
    /** @return the value of the {@code eSetError} field. */
    @NativeType("ETrackedPropertyError")
    public int eSetError() { return neSetError(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pvBuffer} field. */
    @NativeType("void *")
    public ByteBuffer pvBuffer() { return npvBuffer(address()); }
    /** @return the value of the {@code unBufferSize} field. */
    @NativeType("uint32_t")
    public int unBufferSize() { return nunBufferSize(address()); }
    /** @return the value of the {@code unTag} field. */
    @NativeType("PropertyTypeTag_t")
    public int unTag() { return nunTag(address()); }
    /** @return the value of the {@code eError} field. */
    @NativeType("ETrackedPropertyError")
    public int eError() { return neError(address()); }

    /** Sets the specified value to the {@code prop} field. */
    public PropertyWrite prop(@NativeType("ETrackedDeviceProperty") int value) { nprop(address(), value); return this; }
    /** Sets the specified value to the {@code writeType} field. */
    public PropertyWrite writeType(@NativeType("EPropertyWriteType") int value) { nwriteType(address(), value); return this; }
    /** Sets the specified value to the {@code eSetError} field. */
    public PropertyWrite eSetError(@NativeType("ETrackedPropertyError") int value) { neSetError(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
    public PropertyWrite pvBuffer(@NativeType("void *") ByteBuffer value) { npvBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code unTag} field. */
    public PropertyWrite unTag(@NativeType("PropertyTypeTag_t") int value) { nunTag(address(), value); return this; }
    /** Sets the specified value to the {@code eError} field. */
    public PropertyWrite eError(@NativeType("ETrackedPropertyError") int value) { neError(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public PropertyWrite set(
        int prop,
        int writeType,
        int eSetError,
        ByteBuffer pvBuffer,
        int unTag,
        int eError
    ) {
        prop(prop);
        writeType(writeType);
        eSetError(eSetError);
        pvBuffer(pvBuffer);
        unTag(unTag);
        eError(eError);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public PropertyWrite set(PropertyWrite src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code PropertyWrite} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static PropertyWrite malloc() {
        return new PropertyWrite(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code PropertyWrite} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static PropertyWrite calloc() {
        return new PropertyWrite(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code PropertyWrite} instance allocated with {@link BufferUtils}. */
    public static PropertyWrite create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new PropertyWrite(memAddress(container), container);
    }

    /** Returns a new {@code PropertyWrite} instance for the specified memory address. */
    public static PropertyWrite create(long address) {
        return new PropertyWrite(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable PropertyWrite createSafe(long address) {
        return address == NULL ? null : new PropertyWrite(address, null);
    }

    /**
     * Returns a new {@link PropertyWrite.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PropertyWrite.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link PropertyWrite.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PropertyWrite.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PropertyWrite.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static PropertyWrite.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link PropertyWrite.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static PropertyWrite.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static PropertyWrite.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code PropertyWrite} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static PropertyWrite malloc(MemoryStack stack) {
        return new PropertyWrite(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code PropertyWrite} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static PropertyWrite calloc(MemoryStack stack) {
        return new PropertyWrite(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link PropertyWrite.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PropertyWrite.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PropertyWrite.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PropertyWrite.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #prop}. */
    public static int nprop(long struct) { return memGetInt(struct + PropertyWrite.PROP); }
    /** Unsafe version of {@link #writeType}. */
    public static int nwriteType(long struct) { return memGetInt(struct + PropertyWrite.WRITETYPE); }
    /** Unsafe version of {@link #eSetError}. */
    public static int neSetError(long struct) { return memGetInt(struct + PropertyWrite.ESETERROR); }
    /** Unsafe version of {@link #pvBuffer() pvBuffer}. */
    public static ByteBuffer npvBuffer(long struct) { return memByteBuffer(memGetAddress(struct + PropertyWrite.PVBUFFER), nunBufferSize(struct)); }
    /** Unsafe version of {@link #unBufferSize}. */
    public static int nunBufferSize(long struct) { return memGetInt(struct + PropertyWrite.UNBUFFERSIZE); }
    /** Unsafe version of {@link #unTag}. */
    public static int nunTag(long struct) { return memGetInt(struct + PropertyWrite.UNTAG); }
    /** Unsafe version of {@link #eError}. */
    public static int neError(long struct) { return memGetInt(struct + PropertyWrite.EERROR); }

    /** Unsafe version of {@link #prop(int) prop}. */
    public static void nprop(long struct, int value) { memPutInt(struct + PropertyWrite.PROP, value); }
    /** Unsafe version of {@link #writeType(int) writeType}. */
    public static void nwriteType(long struct, int value) { memPutInt(struct + PropertyWrite.WRITETYPE, value); }
    /** Unsafe version of {@link #eSetError(int) eSetError}. */
    public static void neSetError(long struct, int value) { memPutInt(struct + PropertyWrite.ESETERROR, value); }
    /** Unsafe version of {@link #pvBuffer(ByteBuffer) pvBuffer}. */
    public static void npvBuffer(long struct, ByteBuffer value) { memPutAddress(struct + PropertyWrite.PVBUFFER, memAddress(value)); nunBufferSize(struct, value.remaining()); }
    /** Sets the specified value to the {@code unBufferSize} field of the specified {@code struct}. */
    public static void nunBufferSize(long struct, int value) { memPutInt(struct + PropertyWrite.UNBUFFERSIZE, value); }
    /** Unsafe version of {@link #unTag(int) unTag}. */
    public static void nunTag(long struct, int value) { memPutInt(struct + PropertyWrite.UNTAG, value); }
    /** Unsafe version of {@link #eError(int) eError}. */
    public static void neError(long struct, int value) { memPutInt(struct + PropertyWrite.EERROR, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + PropertyWrite.PVBUFFER));
    }

    // -----------------------------------

    /** An array of {@link PropertyWrite} structs. */
    public static class Buffer extends StructBuffer<PropertyWrite, Buffer> implements NativeResource {

        private static final PropertyWrite ELEMENT_FACTORY = PropertyWrite.create(-1L);

        /**
         * Creates a new {@code PropertyWrite.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link PropertyWrite#SIZEOF}, and its mark will be undefined.</p>
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
        protected PropertyWrite getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code prop} field. */
        @NativeType("ETrackedDeviceProperty")
        public int prop() { return PropertyWrite.nprop(address()); }
        /** @return the value of the {@code writeType} field. */
        @NativeType("EPropertyWriteType")
        public int writeType() { return PropertyWrite.nwriteType(address()); }
        /** @return the value of the {@code eSetError} field. */
        @NativeType("ETrackedPropertyError")
        public int eSetError() { return PropertyWrite.neSetError(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pvBuffer} field. */
        @NativeType("void *")
        public ByteBuffer pvBuffer() { return PropertyWrite.npvBuffer(address()); }
        /** @return the value of the {@code unBufferSize} field. */
        @NativeType("uint32_t")
        public int unBufferSize() { return PropertyWrite.nunBufferSize(address()); }
        /** @return the value of the {@code unTag} field. */
        @NativeType("PropertyTypeTag_t")
        public int unTag() { return PropertyWrite.nunTag(address()); }
        /** @return the value of the {@code eError} field. */
        @NativeType("ETrackedPropertyError")
        public int eError() { return PropertyWrite.neError(address()); }

        /** Sets the specified value to the {@code prop} field. */
        public PropertyWrite.Buffer prop(@NativeType("ETrackedDeviceProperty") int value) { PropertyWrite.nprop(address(), value); return this; }
        /** Sets the specified value to the {@code writeType} field. */
        public PropertyWrite.Buffer writeType(@NativeType("EPropertyWriteType") int value) { PropertyWrite.nwriteType(address(), value); return this; }
        /** Sets the specified value to the {@code eSetError} field. */
        public PropertyWrite.Buffer eSetError(@NativeType("ETrackedPropertyError") int value) { PropertyWrite.neSetError(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
        public PropertyWrite.Buffer pvBuffer(@NativeType("void *") ByteBuffer value) { PropertyWrite.npvBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code unTag} field. */
        public PropertyWrite.Buffer unTag(@NativeType("PropertyTypeTag_t") int value) { PropertyWrite.nunTag(address(), value); return this; }
        /** Sets the specified value to the {@code eError} field. */
        public PropertyWrite.Buffer eError(@NativeType("ETrackedPropertyError") int value) { PropertyWrite.neError(address(), value); return this; }

    }

}