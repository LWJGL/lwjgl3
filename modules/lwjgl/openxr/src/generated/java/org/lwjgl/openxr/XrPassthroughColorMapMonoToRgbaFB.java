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

import static org.lwjgl.openxr.FBPassthrough.*;

/**
 * A layer color map.
 * 
 * <h5>Member Descriptions</h5>
 * 
 * <ul>
 * <li>{@code type} is the {@code XrStructureType} of this structure.</li>
 * <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
 * <li>{@code textureColorMap} is the array of {@link XrColor4f} colors that map to intensity values.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using {@link XrPassthroughColorMapMonoToRgbaFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBPassthrough#XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrColor4f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPassthroughColorMapMonoToRgbaFB {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrColor4f XrColor4f} textureColorMap[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB];
 * }</code></pre>
 */
public class XrPassthroughColorMapMonoToRgbaFB extends Struct implements NativeResource {

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
            __array(XrColor4f.SIZEOF, XrColor4f.ALIGNOF, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TEXTURECOLORMAP = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrPassthroughColorMapMonoToRgbaFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughColorMapMonoToRgbaFB(ByteBuffer container) {
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
    /** @return a {@link XrColor4f}.Buffer view of the {@code textureColorMap} field. */
    @NativeType("XrColor4f[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB]")
    public XrColor4f.Buffer textureColorMap() { return ntextureColorMap(address()); }
    /** @return a {@link XrColor4f} view of the struct at the specified index of the {@code textureColorMap} field. */
    public XrColor4f textureColorMap(int index) { return ntextureColorMap(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughColorMapMonoToRgbaFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB} value to the {@code type} field. */
    public XrPassthroughColorMapMonoToRgbaFB type$Default() { return type(FBPassthrough.XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughColorMapMonoToRgbaFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrColor4f.Buffer} to the {@code textureColorMap} field. */
    public XrPassthroughColorMapMonoToRgbaFB textureColorMap(@NativeType("XrColor4f[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB]") XrColor4f.Buffer value) { ntextureColorMap(address(), value); return this; }
    /** Copies the specified {@link XrColor4f} at the specified index of the {@code textureColorMap} field. */
    public XrPassthroughColorMapMonoToRgbaFB textureColorMap(int index, XrColor4f value) { ntextureColorMap(address(), index, value); return this; }
    /** Passes the {@code textureColorMap} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPassthroughColorMapMonoToRgbaFB textureColorMap(java.util.function.Consumer<XrColor4f.Buffer> consumer) { consumer.accept(textureColorMap()); return this; }
    /** Passes the element at {@code index} of the {@code textureColorMap} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPassthroughColorMapMonoToRgbaFB textureColorMap(int index, java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(textureColorMap(index)); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughColorMapMonoToRgbaFB set(
        int type,
        long next,
        XrColor4f.Buffer textureColorMap
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
    public XrPassthroughColorMapMonoToRgbaFB set(XrPassthroughColorMapMonoToRgbaFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughColorMapMonoToRgbaFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorMapMonoToRgbaFB malloc() {
        return wrap(XrPassthroughColorMapMonoToRgbaFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrPassthroughColorMapMonoToRgbaFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorMapMonoToRgbaFB calloc() {
        return wrap(XrPassthroughColorMapMonoToRgbaFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrPassthroughColorMapMonoToRgbaFB} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughColorMapMonoToRgbaFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrPassthroughColorMapMonoToRgbaFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughColorMapMonoToRgbaFB} instance for the specified memory address. */
    public static XrPassthroughColorMapMonoToRgbaFB create(long address) {
        return wrap(XrPassthroughColorMapMonoToRgbaFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorMapMonoToRgbaFB createSafe(long address) {
        return address == NULL ? null : wrap(XrPassthroughColorMapMonoToRgbaFB.class, address);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToRgbaFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToRgbaFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToRgbaFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToRgbaFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToRgbaFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToRgbaFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrPassthroughColorMapMonoToRgbaFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToRgbaFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorMapMonoToRgbaFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughColorMapMonoToRgbaFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorMapMonoToRgbaFB malloc(MemoryStack stack) {
        return wrap(XrPassthroughColorMapMonoToRgbaFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrPassthroughColorMapMonoToRgbaFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorMapMonoToRgbaFB calloc(MemoryStack stack) {
        return wrap(XrPassthroughColorMapMonoToRgbaFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToRgbaFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToRgbaFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorMapMonoToRgbaFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorMapMonoToRgbaFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughColorMapMonoToRgbaFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughColorMapMonoToRgbaFB.NEXT); }
    /** Unsafe version of {@link #textureColorMap}. */
    public static XrColor4f.Buffer ntextureColorMap(long struct) { return XrColor4f.create(struct + XrPassthroughColorMapMonoToRgbaFB.TEXTURECOLORMAP, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB); }
    /** Unsafe version of {@link #textureColorMap(int) textureColorMap}. */
    public static XrColor4f ntextureColorMap(long struct, int index) {
        return XrColor4f.create(struct + XrPassthroughColorMapMonoToRgbaFB.TEXTURECOLORMAP + check(index, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB) * XrColor4f.SIZEOF);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughColorMapMonoToRgbaFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughColorMapMonoToRgbaFB.NEXT, value); }
    /** Unsafe version of {@link #textureColorMap(XrColor4f.Buffer) textureColorMap}. */
    public static void ntextureColorMap(long struct, XrColor4f.Buffer value) {
        if (CHECKS) { checkGT(value, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB); }
        memCopy(value.address(), struct + XrPassthroughColorMapMonoToRgbaFB.TEXTURECOLORMAP, value.remaining() * XrColor4f.SIZEOF);
    }
    /** Unsafe version of {@link #textureColorMap(int, XrColor4f) textureColorMap}. */
    public static void ntextureColorMap(long struct, int index, XrColor4f value) {
        memCopy(value.address(), struct + XrPassthroughColorMapMonoToRgbaFB.TEXTURECOLORMAP + check(index, XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB) * XrColor4f.SIZEOF, XrColor4f.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughColorMapMonoToRgbaFB} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughColorMapMonoToRgbaFB, Buffer> implements NativeResource {

        private static final XrPassthroughColorMapMonoToRgbaFB ELEMENT_FACTORY = XrPassthroughColorMapMonoToRgbaFB.create(-1L);

        /**
         * Creates a new {@code XrPassthroughColorMapMonoToRgbaFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughColorMapMonoToRgbaFB#SIZEOF}, and its mark will be undefined.
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
        protected XrPassthroughColorMapMonoToRgbaFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughColorMapMonoToRgbaFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughColorMapMonoToRgbaFB.nnext(address()); }
        /** @return a {@link XrColor4f}.Buffer view of the {@code textureColorMap} field. */
        @NativeType("XrColor4f[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB]")
        public XrColor4f.Buffer textureColorMap() { return XrPassthroughColorMapMonoToRgbaFB.ntextureColorMap(address()); }
        /** @return a {@link XrColor4f} view of the struct at the specified index of the {@code textureColorMap} field. */
        public XrColor4f textureColorMap(int index) { return XrPassthroughColorMapMonoToRgbaFB.ntextureColorMap(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughColorMapMonoToRgbaFB.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughColorMapMonoToRgbaFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB} value to the {@code type} field. */
        public XrPassthroughColorMapMonoToRgbaFB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughColorMapMonoToRgbaFB.Buffer next(@NativeType("void const *") long value) { XrPassthroughColorMapMonoToRgbaFB.nnext(address(), value); return this; }
        /** Copies the specified {@link XrColor4f.Buffer} to the {@code textureColorMap} field. */
        public XrPassthroughColorMapMonoToRgbaFB.Buffer textureColorMap(@NativeType("XrColor4f[XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB]") XrColor4f.Buffer value) { XrPassthroughColorMapMonoToRgbaFB.ntextureColorMap(address(), value); return this; }
        /** Copies the specified {@link XrColor4f} at the specified index of the {@code textureColorMap} field. */
        public XrPassthroughColorMapMonoToRgbaFB.Buffer textureColorMap(int index, XrColor4f value) { XrPassthroughColorMapMonoToRgbaFB.ntextureColorMap(address(), index, value); return this; }
        /** Passes the {@code textureColorMap} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPassthroughColorMapMonoToRgbaFB.Buffer textureColorMap(java.util.function.Consumer<XrColor4f.Buffer> consumer) { consumer.accept(textureColorMap()); return this; }
        /** Passes the element at {@code index} of the {@code textureColorMap} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPassthroughColorMapMonoToRgbaFB.Buffer textureColorMap(int index, java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(textureColorMap(index)); return this; }

    }

}