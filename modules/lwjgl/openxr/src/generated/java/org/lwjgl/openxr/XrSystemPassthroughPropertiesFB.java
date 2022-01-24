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
 * A passthrough system property.
 * 
 * <h5>Member Descriptions</h5>
 * 
 * <ul>
 * <li>{@code type} is the {@code XrStructureType} of this structure.</li>
 * <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension.</li>
 * <li>{@code supportsPassthrough} defines whether the system supports the passthrough feature.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to using {@link XrSystemPassthroughPropertiesFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBPassthrough#XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemPassthroughPropertiesFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 supportsPassthrough;
 * }</code></pre>
 */
public class XrSystemPassthroughPropertiesFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSPASSTHROUGH;

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
        SUPPORTSPASSTHROUGH = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSystemPassthroughPropertiesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemPassthroughPropertiesFB(ByteBuffer container) {
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
    /** @return the value of the {@code supportsPassthrough} field. */
    @NativeType("XrBool32")
    public boolean supportsPassthrough() { return nsupportsPassthrough(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemPassthroughPropertiesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthrough#XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB} value to the {@code type} field. */
    public XrSystemPassthroughPropertiesFB type$Default() { return type(FBPassthrough.XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemPassthroughPropertiesFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code supportsPassthrough} field. */
    public XrSystemPassthroughPropertiesFB supportsPassthrough(@NativeType("XrBool32") boolean value) { nsupportsPassthrough(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemPassthroughPropertiesFB set(
        int type,
        long next,
        boolean supportsPassthrough
    ) {
        type(type);
        next(next);
        supportsPassthrough(supportsPassthrough);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemPassthroughPropertiesFB set(XrSystemPassthroughPropertiesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemPassthroughPropertiesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughPropertiesFB malloc() {
        return wrap(XrSystemPassthroughPropertiesFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemPassthroughPropertiesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemPassthroughPropertiesFB calloc() {
        return wrap(XrSystemPassthroughPropertiesFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemPassthroughPropertiesFB} instance allocated with {@link BufferUtils}. */
    public static XrSystemPassthroughPropertiesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemPassthroughPropertiesFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemPassthroughPropertiesFB} instance for the specified memory address. */
    public static XrSystemPassthroughPropertiesFB create(long address) {
        return wrap(XrSystemPassthroughPropertiesFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemPassthroughPropertiesFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemPassthroughPropertiesFB.class, address);
    }

    /**
     * Returns a new {@link XrSystemPassthroughPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughPropertiesFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughPropertiesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughPropertiesFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughPropertiesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughPropertiesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemPassthroughPropertiesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughPropertiesFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemPassthroughPropertiesFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSystemPassthroughPropertiesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughPropertiesFB malloc(MemoryStack stack) {
        return wrap(XrSystemPassthroughPropertiesFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemPassthroughPropertiesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPassthroughPropertiesFB calloc(MemoryStack stack) {
        return wrap(XrSystemPassthroughPropertiesFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemPassthroughPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughPropertiesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPassthroughPropertiesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPassthroughPropertiesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemPassthroughPropertiesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemPassthroughPropertiesFB.NEXT); }
    /** Unsafe version of {@link #supportsPassthrough}. */
    public static int nsupportsPassthrough(long struct) { return UNSAFE.getInt(null, struct + XrSystemPassthroughPropertiesFB.SUPPORTSPASSTHROUGH); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemPassthroughPropertiesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemPassthroughPropertiesFB.NEXT, value); }
    /** Unsafe version of {@link #supportsPassthrough(boolean) supportsPassthrough}. */
    public static void nsupportsPassthrough(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemPassthroughPropertiesFB.SUPPORTSPASSTHROUGH, value); }

    // -----------------------------------

    /** An array of {@link XrSystemPassthroughPropertiesFB} structs. */
    public static class Buffer extends StructBuffer<XrSystemPassthroughPropertiesFB, Buffer> implements NativeResource {

        private static final XrSystemPassthroughPropertiesFB ELEMENT_FACTORY = XrSystemPassthroughPropertiesFB.create(-1L);

        /**
         * Creates a new {@code XrSystemPassthroughPropertiesFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemPassthroughPropertiesFB#SIZEOF}, and its mark will be undefined.
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
        protected XrSystemPassthroughPropertiesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemPassthroughPropertiesFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSystemPassthroughPropertiesFB.nnext(address()); }
        /** @return the value of the {@code supportsPassthrough} field. */
        @NativeType("XrBool32")
        public boolean supportsPassthrough() { return XrSystemPassthroughPropertiesFB.nsupportsPassthrough(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemPassthroughPropertiesFB.Buffer type(@NativeType("XrStructureType") int value) { XrSystemPassthroughPropertiesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthrough#XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB} value to the {@code type} field. */
        public XrSystemPassthroughPropertiesFB.Buffer type$Default() { return type(FBPassthrough.XR_TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemPassthroughPropertiesFB.Buffer next(@NativeType("void const *") long value) { XrSystemPassthroughPropertiesFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code supportsPassthrough} field. */
        public XrSystemPassthroughPropertiesFB.Buffer supportsPassthrough(@NativeType("XrBool32") boolean value) { XrSystemPassthroughPropertiesFB.nsupportsPassthrough(address(), value ? 1 : 0); return this; }

    }

}