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

import static org.lwjgl.openxr.FBPassthrough.*;

/**
 * <pre>{@code
 * struct XrPassthroughColorMapMonoToMonoFB {
 *     XrStructureType type;
 *     void const * next;
 *     uint8_t textureColorMap[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB];
 * }}</pre>
 */
public class XrPassthroughColorMapMonoToMonoFB extends Struct<XrPassthroughColorMapMonoToMonoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TEXTURECOLORMAP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TEXTURECOLORMAP = layout.offsetof(2);
    }

    protected XrPassthroughColorMapMonoToMonoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughColorMapMonoToMonoFB create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughColorMapMonoToMonoFB(address, container);
    }

    /**
     * Creates a {@code XrPassthroughColorMapMonoToMonoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughColorMapMonoToMonoFB(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code textureColorMap} field. */
    @NativeType("uint8_t[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB]")
    public ByteBuffer textureColorMap() { return ntextureColorMap(address()); }
    /** @return the value at the specified index of the {@code textureColorMap} field. */
    @NativeType("uint8_t")
    public byte textureColorMap(int index) { return ntextureColorMap(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughColorMapMonoToMonoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB} value to the {@code type} field. */
    public XrPassthroughColorMapMonoToMonoFB type$Default() { return type(FBPassthrough.XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughColorMapMonoToMonoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code textureColorMap} field. */
    public XrPassthroughColorMapMonoToMonoFB textureColorMap(@NativeType("uint8_t[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB]") ByteBuffer value) { ntextureColorMap(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code textureColorMap} field. */
    public XrPassthroughColorMapMonoToMonoFB textureColorMap(int index, @NativeType("uint8_t") byte value) { ntextureColorMap(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughColorMapMonoToMonoFB set(
        int type,
        long next,
        ByteBuffer textureColorMap
    ) {
        type(type);
        next(next);
        textureColorMap(textureColorMap);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughColorMapMonoToMonoFB set(XrPassthroughColorMapMonoToMonoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughColorMapMonoToMonoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorMapMonoToMonoFB malloc() {
        return new XrPassthroughColorMapMonoToMonoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorMapMonoToMonoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorMapMonoToMonoFB calloc() {
        return new XrPassthroughColorMapMonoToMonoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorMapMonoToMonoFB} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughColorMapMonoToMonoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughColorMapMonoToMonoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughColorMapMonoToMonoFB} instance for the specified memory address. */
    public static XrPassthroughColorMapMonoToMonoFB create(long address) {
        return new XrPassthroughColorMapMonoToMonoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughColorMapMonoToMonoFB createSafe(long address) {
        return address == NULL ? null : new XrPassthroughColorMapMonoToMonoFB(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToMonoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToMonoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToMonoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToMonoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToMonoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToMonoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughColorMapMonoToMonoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToMonoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughColorMapMonoToMonoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughColorMapMonoToMonoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorMapMonoToMonoFB malloc(MemoryStack stack) {
        return new XrPassthroughColorMapMonoToMonoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughColorMapMonoToMonoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorMapMonoToMonoFB calloc(MemoryStack stack) {
        return new XrPassthroughColorMapMonoToMonoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToMonoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToMonoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToMonoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToMonoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughColorMapMonoToMonoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughColorMapMonoToMonoFB.NEXT); }
    /** Unsafe version of {@link #textureColorMap}. */
    public static ByteBuffer ntextureColorMap(long struct) { return memByteBuffer(struct + XrPassthroughColorMapMonoToMonoFB.TEXTURECOLORMAP, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB); }
    /** Unsafe version of {@link #textureColorMap(int) textureColorMap}. */
    public static byte ntextureColorMap(long struct, int index) {
        return memGetByte(struct + XrPassthroughColorMapMonoToMonoFB.TEXTURECOLORMAP + check(index, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB) * 1);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughColorMapMonoToMonoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughColorMapMonoToMonoFB.NEXT, value); }
    /** Unsafe version of {@link #textureColorMap(ByteBuffer) textureColorMap}. */
    public static void ntextureColorMap(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB); }
        memCopy(memAddress(value), struct + XrPassthroughColorMapMonoToMonoFB.TEXTURECOLORMAP, value.remaining() * 1);
    }
    /** Unsafe version of {@link #textureColorMap(int, byte) textureColorMap}. */
    public static void ntextureColorMap(long struct, int index, byte value) {
        memPutByte(struct + XrPassthroughColorMapMonoToMonoFB.TEXTURECOLORMAP + check(index, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughColorMapMonoToMonoFB} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughColorMapMonoToMonoFB, Buffer> implements NativeResource {

        private static final XrPassthroughColorMapMonoToMonoFB ELEMENT_FACTORY = XrPassthroughColorMapMonoToMonoFB.create(-1L);

        /**
         * Creates a new {@code XrPassthroughColorMapMonoToMonoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughColorMapMonoToMonoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughColorMapMonoToMonoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughColorMapMonoToMonoFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughColorMapMonoToMonoFB.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code textureColorMap} field. */
        @NativeType("uint8_t[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB]")
        public ByteBuffer textureColorMap() { return XrPassthroughColorMapMonoToMonoFB.ntextureColorMap(address()); }
        /** @return the value at the specified index of the {@code textureColorMap} field. */
        @NativeType("uint8_t")
        public byte textureColorMap(int index) { return XrPassthroughColorMapMonoToMonoFB.ntextureColorMap(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughColorMapMonoToMonoFB.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughColorMapMonoToMonoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB} value to the {@code type} field. */
        public XrPassthroughColorMapMonoToMonoFB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughColorMapMonoToMonoFB.Buffer next(@NativeType("void const *") long value) { XrPassthroughColorMapMonoToMonoFB.nnext(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code textureColorMap} field. */
        public XrPassthroughColorMapMonoToMonoFB.Buffer textureColorMap(@NativeType("uint8_t[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB]") ByteBuffer value) { XrPassthroughColorMapMonoToMonoFB.ntextureColorMap(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code textureColorMap} field. */
        public XrPassthroughColorMapMonoToMonoFB.Buffer textureColorMap(int index, @NativeType("uint8_t") byte value) { XrPassthroughColorMapMonoToMonoFB.ntextureColorMap(address(), index, value); return this; }

    }

}