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
 * specifies depth test for composition layer.
 * 
 * <h5>Description</h5>
 * 
 * <p>To specify that a layer should be depth tested, a {@link XrCompositionLayerDepthTestFB} structure <b>must</b> be passed via the polymorphic {@link XrCompositionLayerBaseHeader} structure’s {@code next} parameter chain.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBCompositionLayerDepthTest XR_FB_composition_layer_depth_test} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerDepthTestFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBCompositionLayerDepthTest#XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code compareOp} <b>must</b> be a valid {@code XrCompareOpFB} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerDepthTestFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrBool32 {@link #depthMask};
 *     XrCompareOpFB {@link #compareOp};
 * }</code></pre>
 */
public class XrCompositionLayerDepthTestFB extends Struct<XrCompositionLayerDepthTestFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DEPTHMASK,
        COMPAREOP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DEPTHMASK = layout.offsetof(2);
        COMPAREOP = layout.offsetof(3);
    }

    protected XrCompositionLayerDepthTestFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerDepthTestFB create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerDepthTestFB(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerDepthTestFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerDepthTestFB(ByteBuffer container) {
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
    /** a boolean indicating whether writes to the composition depth buffer are enabled. */
    @NativeType("XrBool32")
    public boolean depthMask() { return ndepthMask(address()) != 0; }
    /** an enum that indicates which compare operation is used in the depth test. */
    @NativeType("XrCompareOpFB")
    public int compareOp() { return ncompareOp(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerDepthTestFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBCompositionLayerDepthTest#XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB} value to the {@link #type} field. */
    public XrCompositionLayerDepthTestFB type$Default() { return type(FBCompositionLayerDepthTest.XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerDepthTestFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #depthMask} field. */
    public XrCompositionLayerDepthTestFB depthMask(@NativeType("XrBool32") boolean value) { ndepthMask(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #compareOp} field. */
    public XrCompositionLayerDepthTestFB compareOp(@NativeType("XrCompareOpFB") int value) { ncompareOp(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerDepthTestFB set(
        int type,
        long next,
        boolean depthMask,
        int compareOp
    ) {
        type(type);
        next(next);
        depthMask(depthMask);
        compareOp(compareOp);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerDepthTestFB set(XrCompositionLayerDepthTestFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerDepthTestFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerDepthTestFB malloc() {
        return new XrCompositionLayerDepthTestFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerDepthTestFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerDepthTestFB calloc() {
        return new XrCompositionLayerDepthTestFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerDepthTestFB} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerDepthTestFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerDepthTestFB(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerDepthTestFB} instance for the specified memory address. */
    public static XrCompositionLayerDepthTestFB create(long address) {
        return new XrCompositionLayerDepthTestFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerDepthTestFB createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerDepthTestFB(address, null);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerDepthTestFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerDepthTestFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerDepthTestFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerDepthTestFB malloc(MemoryStack stack) {
        return new XrCompositionLayerDepthTestFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerDepthTestFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerDepthTestFB calloc(MemoryStack stack) {
        return new XrCompositionLayerDepthTestFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerDepthTestFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerDepthTestFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerDepthTestFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerDepthTestFB.NEXT); }
    /** Unsafe version of {@link #depthMask}. */
    public static int ndepthMask(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerDepthTestFB.DEPTHMASK); }
    /** Unsafe version of {@link #compareOp}. */
    public static int ncompareOp(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerDepthTestFB.COMPAREOP); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerDepthTestFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerDepthTestFB.NEXT, value); }
    /** Unsafe version of {@link #depthMask(boolean) depthMask}. */
    public static void ndepthMask(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerDepthTestFB.DEPTHMASK, value); }
    /** Unsafe version of {@link #compareOp(int) compareOp}. */
    public static void ncompareOp(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerDepthTestFB.COMPAREOP, value); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerDepthTestFB} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerDepthTestFB, Buffer> implements NativeResource {

        private static final XrCompositionLayerDepthTestFB ELEMENT_FACTORY = XrCompositionLayerDepthTestFB.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerDepthTestFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerDepthTestFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerDepthTestFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerDepthTestFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerDepthTestFB.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthTestFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerDepthTestFB.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerDepthTestFB#depthMask} field. */
        @NativeType("XrBool32")
        public boolean depthMask() { return XrCompositionLayerDepthTestFB.ndepthMask(address()) != 0; }
        /** @return the value of the {@link XrCompositionLayerDepthTestFB#compareOp} field. */
        @NativeType("XrCompareOpFB")
        public int compareOp() { return XrCompositionLayerDepthTestFB.ncompareOp(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerDepthTestFB#type} field. */
        public XrCompositionLayerDepthTestFB.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerDepthTestFB.ntype(address(), value); return this; }
        /** Sets the {@link FBCompositionLayerDepthTest#XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB} value to the {@link XrCompositionLayerDepthTestFB#type} field. */
        public XrCompositionLayerDepthTestFB.Buffer type$Default() { return type(FBCompositionLayerDepthTest.XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB); }
        /** Sets the specified value to the {@link XrCompositionLayerDepthTestFB#next} field. */
        public XrCompositionLayerDepthTestFB.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerDepthTestFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerDepthTestFB#depthMask} field. */
        public XrCompositionLayerDepthTestFB.Buffer depthMask(@NativeType("XrBool32") boolean value) { XrCompositionLayerDepthTestFB.ndepthMask(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerDepthTestFB#compareOp} field. */
        public XrCompositionLayerDepthTestFB.Buffer compareOp(@NativeType("XrCompareOpFB") int value) { XrCompositionLayerDepthTestFB.ncompareOp(address(), value); return this; }

    }

}