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
 * Passthrough system properties.
 * 
 * <h5>Member Descriptions</h5>
 * 
 * <ul>
 * <li>{@code type} is the {@code XrStructureType} of this structure.</li>
 * <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
 * <li>{@code capabilities} defines a set of features supported by the passthrough system.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using {@link XrSystemPassthroughProperties2FB}</li>
 * <li>{@code type} <b>must</b> be {@link FBPassthrough#XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemPassthroughProperties2FB {
 *     XrStructureType type;
 *     void const * next;
 *     XrPassthroughCapabilityFlagsFB capabilities;
 * }</code></pre>
 */
public class XrSystemPassthroughProperties2FB extends Struct<XrSystemPassthroughProperties2FB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CAPABILITIES;

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
        CAPABILITIES = layout.offsetof(2);
    }

    protected XrSystemPassthroughProperties2FB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemPassthroughProperties2FB create(long address, @Nullable ByteBuffer container) {
        return new XrSystemPassthroughProperties2FB(address, container);
    }

    /**
     * Creates a {@code XrSystemPassthroughProperties2FB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemPassthroughProperties2FB(ByteBuffer container) {
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
    /** @return the value of the {@code capabilities} field. */
    @NativeType("XrPassthroughCapabilityFlagsFB")
    public long capabilities() { return ncapabilities(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemPassthroughProperties2FB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB} value to the {@code type} field. */
    public XrSystemPassthroughProperties2FB type$Default() { return type(FBPassthrough.XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemPassthroughProperties2FB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemPassthroughProperties2FB set(
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
    public XrSystemPassthroughProperties2FB set(XrSystemPassthroughProperties2FB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemPassthroughProperties2FB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughProperties2FB malloc() {
        return new XrSystemPassthroughProperties2FB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughProperties2FB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughProperties2FB calloc() {
        return new XrSystemPassthroughProperties2FB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPassthroughProperties2FB} instance allocated with {@link BufferUtils}. */
    public static XrSystemPassthroughProperties2FB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemPassthroughProperties2FB(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemPassthroughProperties2FB} instance for the specified memory address. */
    public static XrSystemPassthroughProperties2FB create(long address) {
        return new XrSystemPassthroughProperties2FB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemPassthroughProperties2FB createSafe(long address) {
        return address == NULL ? null : new XrSystemPassthroughProperties2FB(address, null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughProperties2FB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughProperties2FB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughProperties2FB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughProperties2FB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughProperties2FB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughProperties2FB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemPassthroughProperties2FB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughProperties2FB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemPassthroughProperties2FB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemPassthroughProperties2FB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughProperties2FB malloc(MemoryStack stack) {
        return new XrSystemPassthroughProperties2FB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemPassthroughProperties2FB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughProperties2FB calloc(MemoryStack stack) {
        return new XrSystemPassthroughProperties2FB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemPassthroughProperties2FB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughProperties2FB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughProperties2FB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughProperties2FB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemPassthroughProperties2FB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemPassthroughProperties2FB.NEXT); }
    /** Unsafe version of {@link #capabilities}. */
    public static long ncapabilities(long struct) { return UNSAFE.getLong(null, struct + XrSystemPassthroughProperties2FB.CAPABILITIES); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemPassthroughProperties2FB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemPassthroughProperties2FB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemPassthroughProperties2FB} structs. */
    public static class Buffer extends StructBuffer<XrSystemPassthroughProperties2FB, Buffer> implements NativeResource {

        private static final XrSystemPassthroughProperties2FB ELEMENT_FACTORY = XrSystemPassthroughProperties2FB.create(-1L);

        /**
         * Creates a new {@code XrSystemPassthroughProperties2FB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemPassthroughProperties2FB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemPassthroughProperties2FB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemPassthroughProperties2FB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSystemPassthroughProperties2FB.nnext(address()); }
        /** @return the value of the {@code capabilities} field. */
        @NativeType("XrPassthroughCapabilityFlagsFB")
        public long capabilities() { return XrSystemPassthroughProperties2FB.ncapabilities(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemPassthroughProperties2FB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemPassthroughProperties2FB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB} value to the {@code type} field. */
        public XrSystemPassthroughProperties2FB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemPassthroughProperties2FB.Buffer next(@NativeType("void const *") long value) { XrSystemPassthroughProperties2FB.nnext(address(), value); return this; }

    }

}