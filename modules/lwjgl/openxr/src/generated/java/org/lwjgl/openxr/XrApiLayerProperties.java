/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.XR10.*;

/**
 * <pre>{@code
 * struct XrApiLayerProperties {
 *     XrStructureType type;
 *     void * next;
 *     char layerName[XR_MAX_API_LAYER_NAME_SIZE];
 *     XrVersion specVersion;
 *     uint32_t layerVersion;
 *     char description[XR_MAX_API_LAYER_DESCRIPTION_SIZE];
 * }}</pre>
 */
public class XrApiLayerProperties extends Struct<XrApiLayerProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERNAME,
        SPECVERSION,
        LAYERVERSION,
        DESCRIPTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_API_LAYER_NAME_SIZE),
            __member(8),
            __member(4),
            __array(1, XR_MAX_API_LAYER_DESCRIPTION_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERNAME = layout.offsetof(2);
        SPECVERSION = layout.offsetof(3);
        LAYERVERSION = layout.offsetof(4);
        DESCRIPTION = layout.offsetof(5);
    }

    protected XrApiLayerProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrApiLayerProperties create(long address, @Nullable ByteBuffer container) {
        return new XrApiLayerProperties(address, container);
    }

    /**
     * Creates a {@code XrApiLayerProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrApiLayerProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return a {@link ByteBuffer} view of the {@code layerName} field. */
    @NativeType("char[XR_MAX_API_LAYER_NAME_SIZE]")
    public ByteBuffer layerName() { return nlayerName(address()); }
    /** @return the null-terminated string stored in the {@code layerName} field. */
    @NativeType("char[XR_MAX_API_LAYER_NAME_SIZE]")
    public String layerNameString() { return nlayerNameString(address()); }
    /** @return the value of the {@code specVersion} field. */
    @NativeType("XrVersion")
    public long specVersion() { return nspecVersion(address()); }
    /** @return the value of the {@code layerVersion} field. */
    @NativeType("uint32_t")
    public int layerVersion() { return nlayerVersion(address()); }
    /** @return a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[XR_MAX_API_LAYER_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** @return the null-terminated string stored in the {@code description} field. */
    @NativeType("char[XR_MAX_API_LAYER_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrApiLayerProperties type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_API_LAYER_PROPERTIES TYPE_API_LAYER_PROPERTIES} value to the {@code type} field. */
    public XrApiLayerProperties type$Default() { return type(XR10.XR_TYPE_API_LAYER_PROPERTIES); }
    /** Sets the specified value to the {@code next} field. */
    public XrApiLayerProperties next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrApiLayerProperties set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrApiLayerProperties set(XrApiLayerProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrApiLayerProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrApiLayerProperties malloc() {
        return new XrApiLayerProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrApiLayerProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrApiLayerProperties calloc() {
        return new XrApiLayerProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrApiLayerProperties} instance allocated with {@link BufferUtils}. */
    public static XrApiLayerProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrApiLayerProperties(memAddress(container), container);
    }

    /** Returns a new {@code XrApiLayerProperties} instance for the specified memory address. */
    public static XrApiLayerProperties create(long address) {
        return new XrApiLayerProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrApiLayerProperties createSafe(long address) {
        return address == NULL ? null : new XrApiLayerProperties(address, null);
    }

    /**
     * Returns a new {@link XrApiLayerProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrApiLayerProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrApiLayerProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrApiLayerProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrApiLayerProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrApiLayerProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrApiLayerProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrApiLayerProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrApiLayerProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrApiLayerProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrApiLayerProperties malloc(MemoryStack stack) {
        return new XrApiLayerProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrApiLayerProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrApiLayerProperties calloc(MemoryStack stack) {
        return new XrApiLayerProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrApiLayerProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrApiLayerProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrApiLayerProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrApiLayerProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrApiLayerProperties.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrApiLayerProperties.NEXT); }
    /** Unsafe version of {@link #layerName}. */
    public static ByteBuffer nlayerName(long struct) { return memByteBuffer(struct + XrApiLayerProperties.LAYERNAME, XR_MAX_API_LAYER_NAME_SIZE); }
    /** Unsafe version of {@link #layerNameString}. */
    public static String nlayerNameString(long struct) { return memUTF8(struct + XrApiLayerProperties.LAYERNAME); }
    /** Unsafe version of {@link #specVersion}. */
    public static long nspecVersion(long struct) { return memGetLong(struct + XrApiLayerProperties.SPECVERSION); }
    /** Unsafe version of {@link #layerVersion}. */
    public static int nlayerVersion(long struct) { return memGetInt(struct + XrApiLayerProperties.LAYERVERSION); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + XrApiLayerProperties.DESCRIPTION, XR_MAX_API_LAYER_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + XrApiLayerProperties.DESCRIPTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrApiLayerProperties.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrApiLayerProperties.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrApiLayerProperties} structs. */
    public static class Buffer extends StructBuffer<XrApiLayerProperties, Buffer> implements NativeResource {

        private static final XrApiLayerProperties ELEMENT_FACTORY = XrApiLayerProperties.create(-1L);

        /**
         * Creates a new {@code XrApiLayerProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrApiLayerProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrApiLayerProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrApiLayerProperties.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrApiLayerProperties.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code layerName} field. */
        @NativeType("char[XR_MAX_API_LAYER_NAME_SIZE]")
        public ByteBuffer layerName() { return XrApiLayerProperties.nlayerName(address()); }
        /** @return the null-terminated string stored in the {@code layerName} field. */
        @NativeType("char[XR_MAX_API_LAYER_NAME_SIZE]")
        public String layerNameString() { return XrApiLayerProperties.nlayerNameString(address()); }
        /** @return the value of the {@code specVersion} field. */
        @NativeType("XrVersion")
        public long specVersion() { return XrApiLayerProperties.nspecVersion(address()); }
        /** @return the value of the {@code layerVersion} field. */
        @NativeType("uint32_t")
        public int layerVersion() { return XrApiLayerProperties.nlayerVersion(address()); }
        /** @return a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[XR_MAX_API_LAYER_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return XrApiLayerProperties.ndescription(address()); }
        /** @return the null-terminated string stored in the {@code description} field. */
        @NativeType("char[XR_MAX_API_LAYER_DESCRIPTION_SIZE]")
        public String descriptionString() { return XrApiLayerProperties.ndescriptionString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrApiLayerProperties.Buffer type(@NativeType("XrStructureType") int value) { XrApiLayerProperties.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_API_LAYER_PROPERTIES TYPE_API_LAYER_PROPERTIES} value to the {@code type} field. */
        public XrApiLayerProperties.Buffer type$Default() { return type(XR10.XR_TYPE_API_LAYER_PROPERTIES); }
        /** Sets the specified value to the {@code next} field. */
        public XrApiLayerProperties.Buffer next(@NativeType("void *") long value) { XrApiLayerProperties.nnext(address(), value); return this; }

    }

}