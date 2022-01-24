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
 * specifies image layout for composition layers.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrCompositionLayerImageLayoutFB} contains additional flags used to change the interpretation of the image layout for a composition layer.</p>
 * 
 * <p>To specify the additional flags, you <b>must</b> create a {@link XrCompositionLayerImageLayoutFB} structure and pass it via the {@link XrCompositionLayerBaseHeader} structure’s {@code next} parameter.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBCompositionLayerImageLayout XR_FB_composition_layer_image_layout} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerImageLayoutFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBCompositionLayerImageLayout#XR_TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrCompositionLayerImageLayoutFlagBitsFB} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerImageLayoutFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrCompositionLayerImageLayoutFlagsFB {@link #flags};
 * }</code></pre>
 */
public class XrCompositionLayerImageLayoutFB extends Struct implements NativeResource {

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

    /**
     * Creates a {@code XrCompositionLayerImageLayoutFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerImageLayoutFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code XrCompositionLayerImageLayoutFlagBitsFB}. */
    @NativeType("XrCompositionLayerImageLayoutFlagsFB")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrCompositionLayerImageLayoutFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBCompositionLayerImageLayout#XR_TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB} value to the {@link #type} field. */
    public XrCompositionLayerImageLayoutFB type$Default() { return type(FBCompositionLayerImageLayout.XR_TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrCompositionLayerImageLayoutFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public XrCompositionLayerImageLayoutFB flags(@NativeType("XrCompositionLayerImageLayoutFlagsFB") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerImageLayoutFB set(
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
    public XrCompositionLayerImageLayoutFB set(XrCompositionLayerImageLayoutFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerImageLayoutFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerImageLayoutFB malloc() {
        return wrap(XrCompositionLayerImageLayoutFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerImageLayoutFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerImageLayoutFB calloc() {
        return wrap(XrCompositionLayerImageLayoutFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerImageLayoutFB} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerImageLayoutFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerImageLayoutFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerImageLayoutFB} instance for the specified memory address. */
    public static XrCompositionLayerImageLayoutFB create(long address) {
        return wrap(XrCompositionLayerImageLayoutFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerImageLayoutFB createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerImageLayoutFB.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerImageLayoutFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerImageLayoutFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerImageLayoutFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerImageLayoutFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerImageLayoutFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerImageLayoutFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerImageLayoutFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerImageLayoutFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerImageLayoutFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerImageLayoutFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerImageLayoutFB malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerImageLayoutFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerImageLayoutFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerImageLayoutFB calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerImageLayoutFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerImageLayoutFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerImageLayoutFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerImageLayoutFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerImageLayoutFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerImageLayoutFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerImageLayoutFB.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerImageLayoutFB.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerImageLayoutFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerImageLayoutFB.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerImageLayoutFB.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerImageLayoutFB} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerImageLayoutFB, Buffer> implements NativeResource {

        private static final XrCompositionLayerImageLayoutFB ELEMENT_FACTORY = XrCompositionLayerImageLayoutFB.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerImageLayoutFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerImageLayoutFB#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerImageLayoutFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrCompositionLayerImageLayoutFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerImageLayoutFB.ntype(address()); }
        /** @return the value of the {@link XrCompositionLayerImageLayoutFB#next} field. */
        @NativeType("void *")
        public long next() { return XrCompositionLayerImageLayoutFB.nnext(address()); }
        /** @return the value of the {@link XrCompositionLayerImageLayoutFB#flags} field. */
        @NativeType("XrCompositionLayerImageLayoutFlagsFB")
        public long flags() { return XrCompositionLayerImageLayoutFB.nflags(address()); }

        /** Sets the specified value to the {@link XrCompositionLayerImageLayoutFB#type} field. */
        public XrCompositionLayerImageLayoutFB.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerImageLayoutFB.ntype(address(), value); return this; }
        /** Sets the {@link FBCompositionLayerImageLayout#XR_TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB} value to the {@link XrCompositionLayerImageLayoutFB#type} field. */
        public XrCompositionLayerImageLayoutFB.Buffer type$Default() { return type(FBCompositionLayerImageLayout.XR_TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB); }
        /** Sets the specified value to the {@link XrCompositionLayerImageLayoutFB#next} field. */
        public XrCompositionLayerImageLayoutFB.Buffer next(@NativeType("void *") long value) { XrCompositionLayerImageLayoutFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrCompositionLayerImageLayoutFB#flags} field. */
        public XrCompositionLayerImageLayoutFB.Buffer flags(@NativeType("XrCompositionLayerImageLayoutFlagsFB") long value) { XrCompositionLayerImageLayoutFB.nflags(address(), value); return this; }

    }

}