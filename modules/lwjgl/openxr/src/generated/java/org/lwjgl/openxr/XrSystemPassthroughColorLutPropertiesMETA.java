/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Passthrough color LUT system properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>When the {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension is enabled, an application <b>may</b> pass in an {@link XrSystemPassthroughColorLutPropertiesMETA} structure in next chain structure when calling {@link XR10#xrGetSystemProperties GetSystemProperties} to acquire information about the connected system.</p>
 * 
 * <p>The runtime <b>must</b> populate the {@link XrSystemPassthroughColorLutPropertiesMETA} structure with the relevant information to the {@link XrSystemProperties} returned by the {@link XR10#xrGetSystemProperties GetSystemProperties} call.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using {@link XrSystemPassthroughColorLutPropertiesMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAPassthroughColorLut#XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemPassthroughColorLutPropertiesMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #maxColorLutResolution};
 * }</code></pre>
 */
public class XrSystemPassthroughColorLutPropertiesMETA extends Struct<XrSystemPassthroughColorLutPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MAXCOLORLUTRESOLUTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MAXCOLORLUTRESOLUTION = layout.offsetof(2);
    }

    protected XrSystemPassthroughColorLutPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemPassthroughColorLutPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemPassthroughColorLutPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemPassthroughColorLutPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemPassthroughColorLutPropertiesMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** Maximum value for {@link XrPassthroughColorLutCreateInfoMETA}{@code ::resolution} supported by the system. Runtimes implementing this extension <b>must</b> support a value of at least 32 for this property. */
    @NativeType("uint32_t")
    public int maxColorLutResolution() { return nmaxColorLutResolution(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemPassthroughColorLutPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPassthroughColorLut#XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META} value to the {@link #type} field. */
    public XrSystemPassthroughColorLutPropertiesMETA type$Default() { return type(METAPassthroughColorLut.XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemPassthroughColorLutPropertiesMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemPassthroughColorLutPropertiesMETA set(
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
    public XrSystemPassthroughColorLutPropertiesMETA set(XrSystemPassthroughColorLutPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughColorLutPropertiesMETA malloc() {
        return new XrSystemPassthroughColorLutPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughColorLutPropertiesMETA calloc() {
        return new XrSystemPassthroughColorLutPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemPassthroughColorLutPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemPassthroughColorLutPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance for the specified memory address. */
    public static XrSystemPassthroughColorLutPropertiesMETA create(long address) {
        return new XrSystemPassthroughColorLutPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemPassthroughColorLutPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemPassthroughColorLutPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughColorLutPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemPassthroughColorLutPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemPassthroughColorLutPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughColorLutPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemPassthroughColorLutPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughColorLutPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemPassthroughColorLutPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemPassthroughColorLutPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #maxColorLutResolution}. */
    public static int nmaxColorLutResolution(long struct) { return UNSAFE.getInt(null, struct + XrSystemPassthroughColorLutPropertiesMETA.MAXCOLORLUTRESOLUTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemPassthroughColorLutPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemPassthroughColorLutPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemPassthroughColorLutPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemPassthroughColorLutPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemPassthroughColorLutPropertiesMETA ELEMENT_FACTORY = XrSystemPassthroughColorLutPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemPassthroughColorLutPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemPassthroughColorLutPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemPassthroughColorLutPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemPassthroughColorLutPropertiesMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemPassthroughColorLutPropertiesMETA.ntype(address()); }
        /** @return the value of the {@link XrSystemPassthroughColorLutPropertiesMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrSystemPassthroughColorLutPropertiesMETA.nnext(address()); }
        /** @return the value of the {@link XrSystemPassthroughColorLutPropertiesMETA#maxColorLutResolution} field. */
        @NativeType("uint32_t")
        public int maxColorLutResolution() { return XrSystemPassthroughColorLutPropertiesMETA.nmaxColorLutResolution(address()); }

        /** Sets the specified value to the {@link XrSystemPassthroughColorLutPropertiesMETA#type} field. */
        public XrSystemPassthroughColorLutPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemPassthroughColorLutPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPassthroughColorLut#XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META} value to the {@link XrSystemPassthroughColorLutPropertiesMETA#type} field. */
        public XrSystemPassthroughColorLutPropertiesMETA.Buffer type$Default() { return type(METAPassthroughColorLut.XR_TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META); }
        /** Sets the specified value to the {@link XrSystemPassthroughColorLutPropertiesMETA#next} field. */
        public XrSystemPassthroughColorLutPropertiesMETA.Buffer next(@NativeType("void const *") long value) { XrSystemPassthroughColorLutPropertiesMETA.nnext(address(), value); return this; }

    }

}