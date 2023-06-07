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
 * Local dimming meta data for the current submitted frame.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrLocalDimmingFrameEndInfoMETA} is a structure that an application <b>can</b> chain in {@link XrFrameEndInfo} in order to request a local dimming mode.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METALocalDimming XR_META_local_dimming} extension <b>must</b> be enabled prior to using {@link XrLocalDimmingFrameEndInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METALocalDimming#XR_TYPE_LOCAL_DIMMING_FRAME_END_INFO_META TYPE_LOCAL_DIMMING_FRAME_END_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code localDimmingMode} <b>must</b> be a valid {@code XrLocalDimmingModeMETA} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFrameEndInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrLocalDimmingFrameEndInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrLocalDimmingModeMETA {@link #localDimmingMode};
 * }</code></pre>
 */
public class XrLocalDimmingFrameEndInfoMETA extends Struct<XrLocalDimmingFrameEndInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCALDIMMINGMODE;

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
        LOCALDIMMINGMODE = layout.offsetof(2);
    }

    protected XrLocalDimmingFrameEndInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrLocalDimmingFrameEndInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrLocalDimmingFrameEndInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrLocalDimmingFrameEndInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrLocalDimmingFrameEndInfoMETA(ByteBuffer container) {
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
    /** the local dimming mode for current submitted frame. */
    @NativeType("XrLocalDimmingModeMETA")
    public int localDimmingMode() { return nlocalDimmingMode(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrLocalDimmingFrameEndInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METALocalDimming#XR_TYPE_LOCAL_DIMMING_FRAME_END_INFO_META TYPE_LOCAL_DIMMING_FRAME_END_INFO_META} value to the {@link #type} field. */
    public XrLocalDimmingFrameEndInfoMETA type$Default() { return type(METALocalDimming.XR_TYPE_LOCAL_DIMMING_FRAME_END_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrLocalDimmingFrameEndInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #localDimmingMode} field. */
    public XrLocalDimmingFrameEndInfoMETA localDimmingMode(@NativeType("XrLocalDimmingModeMETA") int value) { nlocalDimmingMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrLocalDimmingFrameEndInfoMETA set(
        int type,
        long next,
        int localDimmingMode
    ) {
        type(type);
        next(next);
        localDimmingMode(localDimmingMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrLocalDimmingFrameEndInfoMETA set(XrLocalDimmingFrameEndInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrLocalDimmingFrameEndInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrLocalDimmingFrameEndInfoMETA malloc() {
        return new XrLocalDimmingFrameEndInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrLocalDimmingFrameEndInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrLocalDimmingFrameEndInfoMETA calloc() {
        return new XrLocalDimmingFrameEndInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrLocalDimmingFrameEndInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrLocalDimmingFrameEndInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrLocalDimmingFrameEndInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrLocalDimmingFrameEndInfoMETA} instance for the specified memory address. */
    public static XrLocalDimmingFrameEndInfoMETA create(long address) {
        return new XrLocalDimmingFrameEndInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrLocalDimmingFrameEndInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrLocalDimmingFrameEndInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrLocalDimmingFrameEndInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLocalDimmingFrameEndInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrLocalDimmingFrameEndInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrLocalDimmingFrameEndInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLocalDimmingFrameEndInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrLocalDimmingFrameEndInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrLocalDimmingFrameEndInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrLocalDimmingFrameEndInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrLocalDimmingFrameEndInfoMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrLocalDimmingFrameEndInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLocalDimmingFrameEndInfoMETA malloc(MemoryStack stack) {
        return new XrLocalDimmingFrameEndInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrLocalDimmingFrameEndInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrLocalDimmingFrameEndInfoMETA calloc(MemoryStack stack) {
        return new XrLocalDimmingFrameEndInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrLocalDimmingFrameEndInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLocalDimmingFrameEndInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrLocalDimmingFrameEndInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrLocalDimmingFrameEndInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrLocalDimmingFrameEndInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrLocalDimmingFrameEndInfoMETA.NEXT); }
    /** Unsafe version of {@link #localDimmingMode}. */
    public static int nlocalDimmingMode(long struct) { return UNSAFE.getInt(null, struct + XrLocalDimmingFrameEndInfoMETA.LOCALDIMMINGMODE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrLocalDimmingFrameEndInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrLocalDimmingFrameEndInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #localDimmingMode(int) localDimmingMode}. */
    public static void nlocalDimmingMode(long struct, int value) { UNSAFE.putInt(null, struct + XrLocalDimmingFrameEndInfoMETA.LOCALDIMMINGMODE, value); }

    // -----------------------------------

    /** An array of {@link XrLocalDimmingFrameEndInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrLocalDimmingFrameEndInfoMETA, Buffer> implements NativeResource {

        private static final XrLocalDimmingFrameEndInfoMETA ELEMENT_FACTORY = XrLocalDimmingFrameEndInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrLocalDimmingFrameEndInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrLocalDimmingFrameEndInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrLocalDimmingFrameEndInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrLocalDimmingFrameEndInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrLocalDimmingFrameEndInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrLocalDimmingFrameEndInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrLocalDimmingFrameEndInfoMETA.nnext(address()); }
        /** @return the value of the {@link XrLocalDimmingFrameEndInfoMETA#localDimmingMode} field. */
        @NativeType("XrLocalDimmingModeMETA")
        public int localDimmingMode() { return XrLocalDimmingFrameEndInfoMETA.nlocalDimmingMode(address()); }

        /** Sets the specified value to the {@link XrLocalDimmingFrameEndInfoMETA#type} field. */
        public XrLocalDimmingFrameEndInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrLocalDimmingFrameEndInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METALocalDimming#XR_TYPE_LOCAL_DIMMING_FRAME_END_INFO_META TYPE_LOCAL_DIMMING_FRAME_END_INFO_META} value to the {@link XrLocalDimmingFrameEndInfoMETA#type} field. */
        public XrLocalDimmingFrameEndInfoMETA.Buffer type$Default() { return type(METALocalDimming.XR_TYPE_LOCAL_DIMMING_FRAME_END_INFO_META); }
        /** Sets the specified value to the {@link XrLocalDimmingFrameEndInfoMETA#next} field. */
        public XrLocalDimmingFrameEndInfoMETA.Buffer next(@NativeType("void const *") long value) { XrLocalDimmingFrameEndInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrLocalDimmingFrameEndInfoMETA#localDimmingMode} field. */
        public XrLocalDimmingFrameEndInfoMETA.Buffer localDimmingMode(@NativeType("XrLocalDimmingModeMETA") int value) { XrLocalDimmingFrameEndInfoMETA.nlocalDimmingMode(address(), value); return this; }

    }

}