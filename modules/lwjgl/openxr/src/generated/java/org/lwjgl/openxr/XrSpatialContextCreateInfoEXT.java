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
 * <pre><code>
 * struct XrSpatialContextCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t capabilityConfigCount;
 *     {@link XrSpatialCapabilityConfigurationBaseHeaderEXT XrSpatialCapabilityConfigurationBaseHeaderEXT} const * const * capabilityConfigs;
 * }</code></pre>
 */
public class XrSpatialContextCreateInfoEXT extends Struct<XrSpatialContextCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CAPABILITYCONFIGCOUNT,
        CAPABILITYCONFIGS;

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
        CAPABILITYCONFIGCOUNT = layout.offsetof(2);
        CAPABILITYCONFIGS = layout.offsetof(3);
    }

    protected XrSpatialContextCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialContextCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialContextCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialContextCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialContextCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code capabilityConfigCount} field. */
    @NativeType("uint32_t")
    public int capabilityConfigCount() { return ncapabilityConfigCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code capabilityConfigs} field. */
    @NativeType("XrSpatialCapabilityConfigurationBaseHeaderEXT const * const *")
    public PointerBuffer capabilityConfigs() { return ncapabilityConfigs(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialContextCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_CONTEXT_CREATE_INFO_EXT TYPE_SPATIAL_CONTEXT_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrSpatialContextCreateInfoEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_CONTEXT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialContextCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpatialContextPersistenceConfigEXT} value to the {@code next} chain. */
    public XrSpatialContextCreateInfoEXT next(XrSpatialContextPersistenceConfigEXT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code capabilityConfigs} field. */
    public XrSpatialContextCreateInfoEXT capabilityConfigs(@NativeType("XrSpatialCapabilityConfigurationBaseHeaderEXT const * const *") PointerBuffer value) { ncapabilityConfigs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialContextCreateInfoEXT set(
        int type,
        long next,
        PointerBuffer capabilityConfigs
    ) {
        type(type);
        next(next);
        capabilityConfigs(capabilityConfigs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialContextCreateInfoEXT set(XrSpatialContextCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialContextCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialContextCreateInfoEXT malloc() {
        return new XrSpatialContextCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialContextCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialContextCreateInfoEXT calloc() {
        return new XrSpatialContextCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialContextCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialContextCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialContextCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialContextCreateInfoEXT} instance for the specified memory address. */
    public static XrSpatialContextCreateInfoEXT create(long address) {
        return new XrSpatialContextCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialContextCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialContextCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialContextCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialContextCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialContextCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialContextCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialContextCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialContextCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialContextCreateInfoEXT malloc(MemoryStack stack) {
        return new XrSpatialContextCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialContextCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialContextCreateInfoEXT calloc(MemoryStack stack) {
        return new XrSpatialContextCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialContextCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialContextCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialContextCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialContextCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialContextCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #capabilityConfigCount}. */
    public static int ncapabilityConfigCount(long struct) { return memGetInt(struct + XrSpatialContextCreateInfoEXT.CAPABILITYCONFIGCOUNT); }
    /** Unsafe version of {@link #capabilityConfigs() capabilityConfigs}. */
    public static PointerBuffer ncapabilityConfigs(long struct) { return memPointerBuffer(memGetAddress(struct + XrSpatialContextCreateInfoEXT.CAPABILITYCONFIGS), ncapabilityConfigCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialContextCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialContextCreateInfoEXT.NEXT, value); }
    /** Sets the specified value to the {@code capabilityConfigCount} field of the specified {@code struct}. */
    public static void ncapabilityConfigCount(long struct, int value) { memPutInt(struct + XrSpatialContextCreateInfoEXT.CAPABILITYCONFIGCOUNT, value); }
    /** Unsafe version of {@link #capabilityConfigs(PointerBuffer) capabilityConfigs}. */
    public static void ncapabilityConfigs(long struct, PointerBuffer value) { memPutAddress(struct + XrSpatialContextCreateInfoEXT.CAPABILITYCONFIGS, memAddress(value)); ncapabilityConfigCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialContextCreateInfoEXT.CAPABILITYCONFIGS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialContextCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialContextCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrSpatialContextCreateInfoEXT ELEMENT_FACTORY = XrSpatialContextCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialContextCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialContextCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialContextCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialContextCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialContextCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@code capabilityConfigCount} field. */
        @NativeType("uint32_t")
        public int capabilityConfigCount() { return XrSpatialContextCreateInfoEXT.ncapabilityConfigCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code capabilityConfigs} field. */
        @NativeType("XrSpatialCapabilityConfigurationBaseHeaderEXT const * const *")
        public PointerBuffer capabilityConfigs() { return XrSpatialContextCreateInfoEXT.ncapabilityConfigs(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialContextCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialContextCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_CONTEXT_CREATE_INFO_EXT TYPE_SPATIAL_CONTEXT_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrSpatialContextCreateInfoEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_CONTEXT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialContextCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialContextCreateInfoEXT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpatialContextPersistenceConfigEXT} value to the {@code next} chain. */
        public XrSpatialContextCreateInfoEXT.Buffer next(XrSpatialContextPersistenceConfigEXT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code capabilityConfigs} field. */
        public XrSpatialContextCreateInfoEXT.Buffer capabilityConfigs(@NativeType("XrSpatialCapabilityConfigurationBaseHeaderEXT const * const *") PointerBuffer value) { XrSpatialContextCreateInfoEXT.ncapabilityConfigs(address(), value); return this; }

    }

}