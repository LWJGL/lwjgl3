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
 * specifies secure content mode for composition layers.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrCompositionLayerSecureContentFB} contains additional flags to indicate a composition layer contains secure content and must not be written to external outputs.</p>
 * 
 * <p>If both {@link FBCompositionLayerSecureContent#XR_COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB} and {@link FBCompositionLayerSecureContent#XR_COMPOSITION_LAYER_SECURE_CONTENT_REPLACE_LAYER_BIT_FB COMPOSITION_LAYER_SECURE_CONTENT_REPLACE_LAYER_BIT_FB} are set, {@link FBCompositionLayerSecureContent#XR_COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB} will take precedence.</p>
 * 
 * <p>To specify the additional flags, you <b>must</b> create a {@link XrCompositionLayerSecureContentFB} structure and pass it via the {@link XrCompositionLayerBaseHeader} structure’s {@code next} parameter.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBCompositionLayerSecureContent XR_FB_composition_layer_secure_content} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerSecureContentFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBCompositionLayerSecureContent#XR_TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code XrCompositionLayerSecureContentFlagBitsFB} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerSecureContentFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrCompositionLayerSecureContentFlagsFB {@link #flags};
 * }</code></pre>
 */
public class XrCompositionLayerSecureContentFB extends Struct<XrCompositionLayerSecureContentFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS;

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
        FLAGS = layout.offsetof(2);
    }

    protected XrCompositionLayerSecureContentFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerSecureContentFB create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerSecureContentFB(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerSecureContentFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerSecureContentFB(ByteBuffer container) {
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
    /** a bitmask of {@code XrCompositionLayerSecureContentFlagBitsFB}. */
    @NativeType("XrCompositionLayerSecureContentFlagsFB")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerSecureContentFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBCompositionLayerSecureContent#XR_TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB} value to the {@link #type} field. */
    public XrCompositionLayerSecureContentFB type$Default() { return type(FBCompositionLayerSecureContent.XR_TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerSecureContentFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public XrCompositionLayerSecureContentFB flags(@NativeType("XrCompositionLayerSecureContentFlagsFB") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerSecureContentFB set(
        int type,
        long next,
        long flags
    ) {
        type(type);
        next(next);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerSecureContentFB set(XrCompositionLayerSecureContentFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerSecureContentFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerSecureContentFB malloc() {
        return new XrCompositionLayerSecureContentFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerSecureContentFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerSecureContentFB calloc() {
        return new XrCompositionLayerSecureContentFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerSecureContentFB} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerSecureContentFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerSecureContentFB(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerSecureContentFB} instance for the specified memory address. */
    public static XrCompositionLayerSecureContentFB create(long address) {
        return new XrCompositionLayerSecureContentFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerSecureContentFB createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerSecureContentFB(address, null);
    }

    /**
     * Returns a new {@link XrCompositionLayerSecureContentFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSecureContentFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerSecureContentFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSecureContentFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerSecureContentFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSecureContentFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerSecureContentFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSecureContentFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerSecureContentFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerSecureContentFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerSecureContentFB malloc(MemoryStack stack) {
        return new XrCompositionLayerSecureContentFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerSecureContentFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerSecureContentFB calloc(MemoryStack stack) {
        return new XrCompositionLayerSecureContentFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerSecureContentFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSecureContentFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerSecureContentFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerSecureContentFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerSecureContentFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerSecureContentFB.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrCompositionLayerSecureContentFB.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerSecureContentFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerSecureContentFB.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + XrCompositionLayerSecureContentFB.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerSecureContentFB} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerSecureContentFB, Buffer> implements NativeResource {

        private static final XrCompositionLayerSecureContentFB ELEMENT_FACTORY = XrCompositionLayerSecureContentFB.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerSecureContentFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerSecureContentFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerSecureContentFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerSecureContentFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerSecureContentFB.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerSecureContentFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerSecureContentFB.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerSecureContentFB#flags} field. */
        @NativeType("XrCompositionLayerSecureContentFlagsFB")
        public long flags() { return XrCompositionLayerSecureContentFB.nflags(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerSecureContentFB#type} field. */
        public XrCompositionLayerSecureContentFB.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerSecureContentFB.ntype(address(), value); return this; }
        /** Sets the {@link FBCompositionLayerSecureContent#XR_TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB} value to the {@link XrCompositionLayerSecureContentFB#type} field. */
        public XrCompositionLayerSecureContentFB.Buffer type$Default() { return type(FBCompositionLayerSecureContent.XR_TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB); }
        /** Sets the specified value to the {@link XrCompositionLayerSecureContentFB#next} field. */
        public XrCompositionLayerSecureContentFB.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerSecureContentFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerSecureContentFB#flags} field. */
        public XrCompositionLayerSecureContentFB.Buffer flags(@NativeType("XrCompositionLayerSecureContentFlagsFB") long value) { XrCompositionLayerSecureContentFB.nflags(address(), value); return this; }

    }

}