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
 * Configuration for dynamic mode.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>must</b> chain an {@link XrFoveationDynamicModeInfoHTC} structure to {@link XrFoveationApplyInfoHTC} if dynamic mode is set.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to using {@link XrFoveationDynamicModeInfoHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCFoveation#XR_TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code dynamicFlags} <b>must</b> be 0 or a valid combination of {@code XrFoveationDynamicFlagBitsHTC} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFoveationDynamicModeInfoHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrFoveationDynamicFlagsHTC {@link #dynamicFlags};
 * }</code></pre>
 */
public class XrFoveationDynamicModeInfoHTC extends Struct<XrFoveationDynamicModeInfoHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DYNAMICFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DYNAMICFLAGS = layout.offsetof(2);
    }

    protected XrFoveationDynamicModeInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFoveationDynamicModeInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrFoveationDynamicModeInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrFoveationDynamicModeInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveationDynamicModeInfoHTC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code XrFoveationDynamicFlagBitsHTC} indicated which item <b>may</b> be changed during dynamic mode. */
    @NativeType("XrFoveationDynamicFlagsHTC")
    public long dynamicFlags() { return ndynamicFlags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFoveationDynamicModeInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCFoveation#XR_TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC} value to the {@link #type} field. */
    public XrFoveationDynamicModeInfoHTC type$Default() { return type(HTCFoveation.XR_TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFoveationDynamicModeInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #dynamicFlags} field. */
    public XrFoveationDynamicModeInfoHTC dynamicFlags(@NativeType("XrFoveationDynamicFlagsHTC") long value) { ndynamicFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFoveationDynamicModeInfoHTC set(
        int type,
        long next,
        long dynamicFlags
    ) {
        type(type);
        next(next);
        dynamicFlags(dynamicFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFoveationDynamicModeInfoHTC set(XrFoveationDynamicModeInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveationDynamicModeInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveationDynamicModeInfoHTC malloc() {
        return new XrFoveationDynamicModeInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationDynamicModeInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveationDynamicModeInfoHTC calloc() {
        return new XrFoveationDynamicModeInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationDynamicModeInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrFoveationDynamicModeInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFoveationDynamicModeInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrFoveationDynamicModeInfoHTC} instance for the specified memory address. */
    public static XrFoveationDynamicModeInfoHTC create(long address) {
        return new XrFoveationDynamicModeInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationDynamicModeInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrFoveationDynamicModeInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrFoveationDynamicModeInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationDynamicModeInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveationDynamicModeInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationDynamicModeInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationDynamicModeInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationDynamicModeInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFoveationDynamicModeInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveationDynamicModeInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationDynamicModeInfoHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFoveationDynamicModeInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationDynamicModeInfoHTC malloc(MemoryStack stack) {
        return new XrFoveationDynamicModeInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFoveationDynamicModeInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationDynamicModeInfoHTC calloc(MemoryStack stack) {
        return new XrFoveationDynamicModeInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFoveationDynamicModeInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationDynamicModeInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationDynamicModeInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationDynamicModeInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFoveationDynamicModeInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFoveationDynamicModeInfoHTC.NEXT); }
    /** Unsafe version of {@link #dynamicFlags}. */
    public static long ndynamicFlags(long struct) { return UNSAFE.getLong(null, struct + XrFoveationDynamicModeInfoHTC.DYNAMICFLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationDynamicModeInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFoveationDynamicModeInfoHTC.NEXT, value); }
    /** Unsafe version of {@link #dynamicFlags(long) dynamicFlags}. */
    public static void ndynamicFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrFoveationDynamicModeInfoHTC.DYNAMICFLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrFoveationDynamicModeInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrFoveationDynamicModeInfoHTC, Buffer> implements NativeResource {

        private static final XrFoveationDynamicModeInfoHTC ELEMENT_FACTORY = XrFoveationDynamicModeInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrFoveationDynamicModeInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveationDynamicModeInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFoveationDynamicModeInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFoveationDynamicModeInfoHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFoveationDynamicModeInfoHTC.ntype(address()); }
        /** @return the value of the {@link XrFoveationDynamicModeInfoHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrFoveationDynamicModeInfoHTC.nnext(address()); }
        /** @return the value of the {@link XrFoveationDynamicModeInfoHTC#dynamicFlags} field. */
        @NativeType("XrFoveationDynamicFlagsHTC")
        public long dynamicFlags() { return XrFoveationDynamicModeInfoHTC.ndynamicFlags(address()); }

        /** Sets the specified value to the {@link XrFoveationDynamicModeInfoHTC#type} field. */
        public XrFoveationDynamicModeInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrFoveationDynamicModeInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCFoveation#XR_TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC} value to the {@link XrFoveationDynamicModeInfoHTC#type} field. */
        public XrFoveationDynamicModeInfoHTC.Buffer type$Default() { return type(HTCFoveation.XR_TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC); }
        /** Sets the specified value to the {@link XrFoveationDynamicModeInfoHTC#next} field. */
        public XrFoveationDynamicModeInfoHTC.Buffer next(@NativeType("void const *") long value) { XrFoveationDynamicModeInfoHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrFoveationDynamicModeInfoHTC#dynamicFlags} field. */
        public XrFoveationDynamicModeInfoHTC.Buffer dynamicFlags(@NativeType("XrFoveationDynamicFlagsHTC") long value) { XrFoveationDynamicModeInfoHTC.ndynamicFlags(address(), value); return this; }

    }

}