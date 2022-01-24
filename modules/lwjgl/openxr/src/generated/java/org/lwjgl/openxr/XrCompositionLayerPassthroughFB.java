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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A composition layer for passthrough.
 * 
 * <h5>Member Descriptions</h5>
 * 
 * <ul>
 * <li>{@code type} is the {@code XrStructureType} of this structure.</li>
 * <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
 * <li>{@code flags} is a bitmask of {@code XrCompositionLayerFlagBits} that specify additional behavior.</li>
 * <li>{@code space} is the {@code XrSpace} that specifies the layer’s space - <b>must</b> be {@link XR10#XR_NULL_HANDLE NULL_HANDLE}.</li>
 * <li>{@code layer} is the {@code XrPassthroughLayerFB} that defines this layer’s behavior.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using {@link XrCompositionLayerPassthroughFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code XrCompositionLayerFlagBits} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * <li>{@code layerHandle} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
 * <li>Both of {@code layerHandle} and {@code space} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerBaseHeader}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerPassthroughFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags flags;
 *     XrSpace space;
 *     XrPassthroughLayerFB layerHandle;
 * }</code></pre>
 */
public class XrCompositionLayerPassthroughFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS,
        SPACE,
        LAYERHANDLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        LAYERHANDLE = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrCompositionLayerPassthroughFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerPassthroughFB(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("XrCompositionLayerFlags")
    public long flags() { return nflags(address()); }
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code layerHandle} field. */
    @NativeType("XrPassthroughLayerFB")
    public long layerHandle() { return nlayerHandle(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerPassthroughFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB} value to the {@code type} field. */
    public XrCompositionLayerPassthroughFB type$Default() { return type(FBPassthrough.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerPassthroughFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public XrCompositionLayerPassthroughFB flags(@NativeType("XrCompositionLayerFlags") long value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerPassthroughFB space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code layerHandle} field. */
    public XrCompositionLayerPassthroughFB layerHandle(XrPassthroughLayerFB value) { nlayerHandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerPassthroughFB set(
        int type,
        long next,
        long flags,
        XrSpace space,
        XrPassthroughLayerFB layerHandle
    ) {
        type(type);
        next(next);
        flags(flags);
        space(space);
        layerHandle(layerHandle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerPassthroughFB set(XrCompositionLayerPassthroughFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughFB malloc() {
        return wrap(XrCompositionLayerPassthroughFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerPassthroughFB calloc() {
        return wrap(XrCompositionLayerPassthroughFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerPassthroughFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerPassthroughFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerPassthroughFB} instance for the specified memory address. */
    public static XrCompositionLayerPassthroughFB create(long address) {
        return wrap(XrCompositionLayerPassthroughFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerPassthroughFB createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerPassthroughFB.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerPassthroughFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerPassthroughFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughFB malloc(MemoryStack stack) {
        return wrap(XrCompositionLayerPassthroughFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerPassthroughFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerPassthroughFB calloc(MemoryStack stack) {
        return wrap(XrCompositionLayerPassthroughFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerPassthroughFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerPassthroughFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerPassthroughFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughFB.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerPassthroughFB.FLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughFB.SPACE); }
    /** Unsafe version of {@link #layerHandle}. */
    public static long nlayerHandle(long struct) { return memGetAddress(struct + XrCompositionLayerPassthroughFB.LAYERHANDLE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerPassthroughFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerPassthroughFB.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerPassthroughFB.FLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerPassthroughFB.SPACE, value.address()); }
    /** Unsafe version of {@link #layerHandle(XrPassthroughLayerFB) layerHandle}. */
    public static void nlayerHandle(long struct, XrPassthroughLayerFB value) { memPutAddress(struct + XrCompositionLayerPassthroughFB.LAYERHANDLE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerPassthroughFB.SPACE));
        check(memGetAddress(struct + XrCompositionLayerPassthroughFB.LAYERHANDLE));
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerPassthroughFB} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerPassthroughFB, Buffer> implements NativeResource {

        private static final XrCompositionLayerPassthroughFB ELEMENT_FACTORY = XrCompositionLayerPassthroughFB.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerPassthroughFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerPassthroughFB#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerPassthroughFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerPassthroughFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerPassthroughFB.nnext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long flags() { return XrCompositionLayerPassthroughFB.nflags(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerPassthroughFB.nspace(address()); }
        /** @return the value of the {@code layerHandle} field. */
        @NativeType("XrPassthroughLayerFB")
        public long layerHandle() { return XrCompositionLayerPassthroughFB.nlayerHandle(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerPassthroughFB.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerPassthroughFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB} value to the {@code type} field. */
        public XrCompositionLayerPassthroughFB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerPassthroughFB.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerPassthroughFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public XrCompositionLayerPassthroughFB.Buffer flags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerPassthroughFB.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerPassthroughFB.Buffer space(XrSpace value) { XrCompositionLayerPassthroughFB.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code layerHandle} field. */
        public XrCompositionLayerPassthroughFB.Buffer layerHandle(XrPassthroughLayerFB value) { XrCompositionLayerPassthroughFB.nlayerHandle(address(), value); return this; }

    }

}