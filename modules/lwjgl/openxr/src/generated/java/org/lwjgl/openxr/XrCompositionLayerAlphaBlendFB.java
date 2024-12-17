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

/**
 * <pre>{@code
 * struct XrCompositionLayerAlphaBlendFB {
 *     XrStructureType type;
 *     void * next;
 *     XrBlendFactorFB srcFactorColor;
 *     XrBlendFactorFB dstFactorColor;
 *     XrBlendFactorFB srcFactorAlpha;
 *     XrBlendFactorFB dstFactorAlpha;
 * }}</pre>
 */
public class XrCompositionLayerAlphaBlendFB extends Struct<XrCompositionLayerAlphaBlendFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SRCFACTORCOLOR,
        DSTFACTORCOLOR,
        SRCFACTORALPHA,
        DSTFACTORALPHA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SRCFACTORCOLOR = layout.offsetof(2);
        DSTFACTORCOLOR = layout.offsetof(3);
        SRCFACTORALPHA = layout.offsetof(4);
        DSTFACTORALPHA = layout.offsetof(5);
    }

    protected XrCompositionLayerAlphaBlendFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerAlphaBlendFB create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerAlphaBlendFB(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerAlphaBlendFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerAlphaBlendFB(ByteBuffer container) {
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
    /** @return the value of the {@code srcFactorColor} field. */
    @NativeType("XrBlendFactorFB")
    public int srcFactorColor() { return nsrcFactorColor(address()); }
    /** @return the value of the {@code dstFactorColor} field. */
    @NativeType("XrBlendFactorFB")
    public int dstFactorColor() { return ndstFactorColor(address()); }
    /** @return the value of the {@code srcFactorAlpha} field. */
    @NativeType("XrBlendFactorFB")
    public int srcFactorAlpha() { return nsrcFactorAlpha(address()); }
    /** @return the value of the {@code dstFactorAlpha} field. */
    @NativeType("XrBlendFactorFB")
    public int dstFactorAlpha() { return ndstFactorAlpha(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerAlphaBlendFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBCompositionLayerAlphaBlend#XR_TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB} value to the {@code type} field. */
    public XrCompositionLayerAlphaBlendFB type$Default() { return type(FBCompositionLayerAlphaBlend.XR_TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerAlphaBlendFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code srcFactorColor} field. */
    public XrCompositionLayerAlphaBlendFB srcFactorColor(@NativeType("XrBlendFactorFB") int value) { nsrcFactorColor(address(), value); return this; }
    /** Sets the specified value to the {@code dstFactorColor} field. */
    public XrCompositionLayerAlphaBlendFB dstFactorColor(@NativeType("XrBlendFactorFB") int value) { ndstFactorColor(address(), value); return this; }
    /** Sets the specified value to the {@code srcFactorAlpha} field. */
    public XrCompositionLayerAlphaBlendFB srcFactorAlpha(@NativeType("XrBlendFactorFB") int value) { nsrcFactorAlpha(address(), value); return this; }
    /** Sets the specified value to the {@code dstFactorAlpha} field. */
    public XrCompositionLayerAlphaBlendFB dstFactorAlpha(@NativeType("XrBlendFactorFB") int value) { ndstFactorAlpha(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerAlphaBlendFB set(
        int type,
        long next,
        int srcFactorColor,
        int dstFactorColor,
        int srcFactorAlpha,
        int dstFactorAlpha
    ) {
        type(type);
        next(next);
        srcFactorColor(srcFactorColor);
        dstFactorColor(dstFactorColor);
        srcFactorAlpha(srcFactorAlpha);
        dstFactorAlpha(dstFactorAlpha);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerAlphaBlendFB set(XrCompositionLayerAlphaBlendFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerAlphaBlendFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerAlphaBlendFB malloc() {
        return new XrCompositionLayerAlphaBlendFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerAlphaBlendFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerAlphaBlendFB calloc() {
        return new XrCompositionLayerAlphaBlendFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerAlphaBlendFB} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerAlphaBlendFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerAlphaBlendFB(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerAlphaBlendFB} instance for the specified memory address. */
    public static XrCompositionLayerAlphaBlendFB create(long address) {
        return new XrCompositionLayerAlphaBlendFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerAlphaBlendFB createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerAlphaBlendFB(address, null);
    }

    /**
     * Returns a new {@link XrCompositionLayerAlphaBlendFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerAlphaBlendFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerAlphaBlendFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerAlphaBlendFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerAlphaBlendFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerAlphaBlendFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerAlphaBlendFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerAlphaBlendFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerAlphaBlendFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerAlphaBlendFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerAlphaBlendFB malloc(MemoryStack stack) {
        return new XrCompositionLayerAlphaBlendFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerAlphaBlendFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerAlphaBlendFB calloc(MemoryStack stack) {
        return new XrCompositionLayerAlphaBlendFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerAlphaBlendFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerAlphaBlendFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerAlphaBlendFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerAlphaBlendFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerAlphaBlendFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerAlphaBlendFB.NEXT); }
    /** Unsafe version of {@link #srcFactorColor}. */
    public static int nsrcFactorColor(long struct) { return memGetInt(struct + XrCompositionLayerAlphaBlendFB.SRCFACTORCOLOR); }
    /** Unsafe version of {@link #dstFactorColor}. */
    public static int ndstFactorColor(long struct) { return memGetInt(struct + XrCompositionLayerAlphaBlendFB.DSTFACTORCOLOR); }
    /** Unsafe version of {@link #srcFactorAlpha}. */
    public static int nsrcFactorAlpha(long struct) { return memGetInt(struct + XrCompositionLayerAlphaBlendFB.SRCFACTORALPHA); }
    /** Unsafe version of {@link #dstFactorAlpha}. */
    public static int ndstFactorAlpha(long struct) { return memGetInt(struct + XrCompositionLayerAlphaBlendFB.DSTFACTORALPHA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerAlphaBlendFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerAlphaBlendFB.NEXT, value); }
    /** Unsafe version of {@link #srcFactorColor(int) srcFactorColor}. */
    public static void nsrcFactorColor(long struct, int value) { memPutInt(struct + XrCompositionLayerAlphaBlendFB.SRCFACTORCOLOR, value); }
    /** Unsafe version of {@link #dstFactorColor(int) dstFactorColor}. */
    public static void ndstFactorColor(long struct, int value) { memPutInt(struct + XrCompositionLayerAlphaBlendFB.DSTFACTORCOLOR, value); }
    /** Unsafe version of {@link #srcFactorAlpha(int) srcFactorAlpha}. */
    public static void nsrcFactorAlpha(long struct, int value) { memPutInt(struct + XrCompositionLayerAlphaBlendFB.SRCFACTORALPHA, value); }
    /** Unsafe version of {@link #dstFactorAlpha(int) dstFactorAlpha}. */
    public static void ndstFactorAlpha(long struct, int value) { memPutInt(struct + XrCompositionLayerAlphaBlendFB.DSTFACTORALPHA, value); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerAlphaBlendFB} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerAlphaBlendFB, Buffer> implements NativeResource {

        private static final XrCompositionLayerAlphaBlendFB ELEMENT_FACTORY = XrCompositionLayerAlphaBlendFB.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerAlphaBlendFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerAlphaBlendFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerAlphaBlendFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerAlphaBlendFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrCompositionLayerAlphaBlendFB.nnext(address()); }
        /** @return the value of the {@code srcFactorColor} field. */
        @NativeType("XrBlendFactorFB")
        public int srcFactorColor() { return XrCompositionLayerAlphaBlendFB.nsrcFactorColor(address()); }
        /** @return the value of the {@code dstFactorColor} field. */
        @NativeType("XrBlendFactorFB")
        public int dstFactorColor() { return XrCompositionLayerAlphaBlendFB.ndstFactorColor(address()); }
        /** @return the value of the {@code srcFactorAlpha} field. */
        @NativeType("XrBlendFactorFB")
        public int srcFactorAlpha() { return XrCompositionLayerAlphaBlendFB.nsrcFactorAlpha(address()); }
        /** @return the value of the {@code dstFactorAlpha} field. */
        @NativeType("XrBlendFactorFB")
        public int dstFactorAlpha() { return XrCompositionLayerAlphaBlendFB.ndstFactorAlpha(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerAlphaBlendFB.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerAlphaBlendFB.ntype(address(), value); return this; }
        /** Sets the {@link FBCompositionLayerAlphaBlend#XR_TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB} value to the {@code type} field. */
        public XrCompositionLayerAlphaBlendFB.Buffer type$Default() { return type(FBCompositionLayerAlphaBlend.XR_TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerAlphaBlendFB.Buffer next(@NativeType("void *") long value) { XrCompositionLayerAlphaBlendFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code srcFactorColor} field. */
        public XrCompositionLayerAlphaBlendFB.Buffer srcFactorColor(@NativeType("XrBlendFactorFB") int value) { XrCompositionLayerAlphaBlendFB.nsrcFactorColor(address(), value); return this; }
        /** Sets the specified value to the {@code dstFactorColor} field. */
        public XrCompositionLayerAlphaBlendFB.Buffer dstFactorColor(@NativeType("XrBlendFactorFB") int value) { XrCompositionLayerAlphaBlendFB.ndstFactorColor(address(), value); return this; }
        /** Sets the specified value to the {@code srcFactorAlpha} field. */
        public XrCompositionLayerAlphaBlendFB.Buffer srcFactorAlpha(@NativeType("XrBlendFactorFB") int value) { XrCompositionLayerAlphaBlendFB.nsrcFactorAlpha(address(), value); return this; }
        /** Sets the specified value to the {@code dstFactorAlpha} field. */
        public XrCompositionLayerAlphaBlendFB.Buffer dstFactorAlpha(@NativeType("XrBlendFactorFB") int value) { XrCompositionLayerAlphaBlendFB.ndstFactorAlpha(address(), value); return this; }

    }

}