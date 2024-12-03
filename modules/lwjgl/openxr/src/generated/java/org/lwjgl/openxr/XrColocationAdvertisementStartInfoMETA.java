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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Information about start colocation visibility request.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrColocationAdvertisementStartInfoMETA} is the input data for {@link METAColocationDiscovery#xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA}. Implicitly, while the application has an active advertisement, the runtime will retain a copy of the {@link XrColocationAdvertisementStartInfoMETA} submitted with {@link METAColocationDiscovery#xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to using {@link XrColocationAdvertisementStartInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAColocationDiscovery#XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code buffer} <b>must</b> be a pointer to an array of {@code bufferSize} {@code uint8_t} values</li>
 * <li>The {@code bufferSize} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAColocationDiscovery#xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrColocationAdvertisementStartInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #bufferSize};
 *     uint8_t * {@link #buffer};
 * }</code></pre>
 */
public class XrColocationAdvertisementStartInfoMETA extends Struct<XrColocationAdvertisementStartInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BUFFERSIZE,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BUFFERSIZE = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
    }

    protected XrColocationAdvertisementStartInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrColocationAdvertisementStartInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrColocationAdvertisementStartInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrColocationAdvertisementStartInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrColocationAdvertisementStartInfoMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the count of bytes used in the {@code buffer} array. If {@code bufferSize} is greater than {@link METAColocationDiscovery#XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META}, then the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}. The maximum supported count is {@link METAColocationDiscovery#XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META}. */
    @NativeType("uint32_t")
    public int bufferSize() { return nbufferSize(address()); }
    /** a byte array which allows the application to define app buffer. It is the advertisement payload. */
    @NativeType("uint8_t *")
    public ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrColocationAdvertisementStartInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META} value to the {@link #type} field. */
    public XrColocationAdvertisementStartInfoMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrColocationAdvertisementStartInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #buffer} field. */
    public XrColocationAdvertisementStartInfoMETA buffer(@NativeType("uint8_t *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrColocationAdvertisementStartInfoMETA set(
        int type,
        long next,
        ByteBuffer buffer
    ) {
        type(type);
        next(next);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrColocationAdvertisementStartInfoMETA set(XrColocationAdvertisementStartInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrColocationAdvertisementStartInfoMETA malloc() {
        return new XrColocationAdvertisementStartInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrColocationAdvertisementStartInfoMETA calloc() {
        return new XrColocationAdvertisementStartInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrColocationAdvertisementStartInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrColocationAdvertisementStartInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance for the specified memory address. */
    public static XrColocationAdvertisementStartInfoMETA create(long address) {
        return new XrColocationAdvertisementStartInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrColocationAdvertisementStartInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrColocationAdvertisementStartInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrColocationAdvertisementStartInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColocationAdvertisementStartInfoMETA malloc(MemoryStack stack) {
        return new XrColocationAdvertisementStartInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrColocationAdvertisementStartInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColocationAdvertisementStartInfoMETA calloc(MemoryStack stack) {
        return new XrColocationAdvertisementStartInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColocationAdvertisementStartInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColocationAdvertisementStartInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrColocationAdvertisementStartInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrColocationAdvertisementStartInfoMETA.NEXT); }
    /** Unsafe version of {@link #bufferSize}. */
    public static int nbufferSize(long struct) { return memGetInt(struct + XrColocationAdvertisementStartInfoMETA.BUFFERSIZE); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(memGetAddress(struct + XrColocationAdvertisementStartInfoMETA.BUFFER), nbufferSize(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrColocationAdvertisementStartInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrColocationAdvertisementStartInfoMETA.NEXT, value); }
    /** Sets the specified value to the {@code bufferSize} field of the specified {@code struct}. */
    public static void nbufferSize(long struct, int value) { memPutInt(struct + XrColocationAdvertisementStartInfoMETA.BUFFERSIZE, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, ByteBuffer value) { memPutAddress(struct + XrColocationAdvertisementStartInfoMETA.BUFFER, memAddress(value)); nbufferSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrColocationAdvertisementStartInfoMETA.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link XrColocationAdvertisementStartInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrColocationAdvertisementStartInfoMETA, Buffer> implements NativeResource {

        private static final XrColocationAdvertisementStartInfoMETA ELEMENT_FACTORY = XrColocationAdvertisementStartInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrColocationAdvertisementStartInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrColocationAdvertisementStartInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrColocationAdvertisementStartInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrColocationAdvertisementStartInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrColocationAdvertisementStartInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrColocationAdvertisementStartInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrColocationAdvertisementStartInfoMETA.nnext(address()); }
        /** @return the value of the {@link XrColocationAdvertisementStartInfoMETA#bufferSize} field. */
        @NativeType("uint32_t")
        public int bufferSize() { return XrColocationAdvertisementStartInfoMETA.nbufferSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link XrColocationAdvertisementStartInfoMETA#buffer} field. */
        @NativeType("uint8_t *")
        public ByteBuffer buffer() { return XrColocationAdvertisementStartInfoMETA.nbuffer(address()); }

        /** Sets the specified value to the {@link XrColocationAdvertisementStartInfoMETA#type} field. */
        public XrColocationAdvertisementStartInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrColocationAdvertisementStartInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META} value to the {@link XrColocationAdvertisementStartInfoMETA#type} field. */
        public XrColocationAdvertisementStartInfoMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META); }
        /** Sets the specified value to the {@link XrColocationAdvertisementStartInfoMETA#next} field. */
        public XrColocationAdvertisementStartInfoMETA.Buffer next(@NativeType("void const *") long value) { XrColocationAdvertisementStartInfoMETA.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link XrColocationAdvertisementStartInfoMETA#buffer} field. */
        public XrColocationAdvertisementStartInfoMETA.Buffer buffer(@NativeType("uint8_t *") ByteBuffer value) { XrColocationAdvertisementStartInfoMETA.nbuffer(address(), value); return this; }

    }

}