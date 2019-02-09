/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a color component mapping.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code r} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
 * <li>{@code g} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
 * <li>{@code b} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
 * <li>{@code a} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageViewCreateInfo}, {@link VkSamplerYcbcrConversionCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code r} &ndash; a {@code VkComponentSwizzle} specifying the component value placed in the R component of the output vector.</li>
 * <li>{@code g} &ndash; a {@code VkComponentSwizzle} specifying the component value placed in the G component of the output vector.</li>
 * <li>{@code b} &ndash; a {@code VkComponentSwizzle} specifying the component value placed in the B component of the output vector.</li>
 * <li>{@code a} &ndash; a {@code VkComponentSwizzle} specifying the component value placed in the A component of the output vector.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkComponentMapping {
 *     VkComponentSwizzle r;
 *     VkComponentSwizzle g;
 *     VkComponentSwizzle b;
 *     VkComponentSwizzle a;
 * }</code></pre>
 */
public class VkComponentMapping extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B,
        A;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkComponentMapping} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkComponentMapping(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code r} field. */
    @NativeType("VkComponentSwizzle")
    public int r() { return nr(address()); }
    /** Returns the value of the {@code g} field. */
    @NativeType("VkComponentSwizzle")
    public int g() { return ng(address()); }
    /** Returns the value of the {@code b} field. */
    @NativeType("VkComponentSwizzle")
    public int b() { return nb(address()); }
    /** Returns the value of the {@code a} field. */
    @NativeType("VkComponentSwizzle")
    public int a() { return na(address()); }

    /** Sets the specified value to the {@code r} field. */
    public VkComponentMapping r(@NativeType("VkComponentSwizzle") int value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public VkComponentMapping g(@NativeType("VkComponentSwizzle") int value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public VkComponentMapping b(@NativeType("VkComponentSwizzle") int value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public VkComponentMapping a(@NativeType("VkComponentSwizzle") int value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkComponentMapping set(
        int r,
        int g,
        int b,
        int a
    ) {
        r(r);
        g(g);
        b(b);
        a(a);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkComponentMapping set(VkComponentMapping src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkComponentMapping} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkComponentMapping malloc() {
        return wrap(VkComponentMapping.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkComponentMapping} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkComponentMapping calloc() {
        return wrap(VkComponentMapping.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkComponentMapping} instance allocated with {@link BufferUtils}. */
    public static VkComponentMapping create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkComponentMapping.class, memAddress(container), container);
    }

    /** Returns a new {@code VkComponentMapping} instance for the specified memory address. */
    public static VkComponentMapping create(long address) {
        return wrap(VkComponentMapping.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkComponentMapping createSafe(long address) {
        return address == NULL ? null : wrap(VkComponentMapping.class, address);
    }

    /**
     * Returns a new {@link VkComponentMapping.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComponentMapping.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkComponentMapping.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComponentMapping.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComponentMapping.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkComponentMapping.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkComponentMapping.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkComponentMapping.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkComponentMapping.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkComponentMapping} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkComponentMapping mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkComponentMapping} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkComponentMapping callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkComponentMapping} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComponentMapping mallocStack(MemoryStack stack) {
        return wrap(VkComponentMapping.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkComponentMapping} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComponentMapping callocStack(MemoryStack stack) {
        return wrap(VkComponentMapping.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkComponentMapping.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkComponentMapping.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkComponentMapping.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkComponentMapping.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkComponentMapping.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComponentMapping.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComponentMapping.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComponentMapping.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static int nr(long struct) { return UNSAFE.getInt(null, struct + VkComponentMapping.R); }
    /** Unsafe version of {@link #g}. */
    public static int ng(long struct) { return UNSAFE.getInt(null, struct + VkComponentMapping.G); }
    /** Unsafe version of {@link #b}. */
    public static int nb(long struct) { return UNSAFE.getInt(null, struct + VkComponentMapping.B); }
    /** Unsafe version of {@link #a}. */
    public static int na(long struct) { return UNSAFE.getInt(null, struct + VkComponentMapping.A); }

    /** Unsafe version of {@link #r(int) r}. */
    public static void nr(long struct, int value) { UNSAFE.putInt(null, struct + VkComponentMapping.R, value); }
    /** Unsafe version of {@link #g(int) g}. */
    public static void ng(long struct, int value) { UNSAFE.putInt(null, struct + VkComponentMapping.G, value); }
    /** Unsafe version of {@link #b(int) b}. */
    public static void nb(long struct, int value) { UNSAFE.putInt(null, struct + VkComponentMapping.B, value); }
    /** Unsafe version of {@link #a(int) a}. */
    public static void na(long struct, int value) { UNSAFE.putInt(null, struct + VkComponentMapping.A, value); }

    // -----------------------------------

    /** An array of {@link VkComponentMapping} structs. */
    public static class Buffer extends StructBuffer<VkComponentMapping, Buffer> implements NativeResource {

        private static final VkComponentMapping ELEMENT_FACTORY = VkComponentMapping.create(-1L);

        /**
         * Creates a new {@code VkComponentMapping.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkComponentMapping#SIZEOF}, and its mark will be undefined.
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
        protected VkComponentMapping getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code r} field. */
        @NativeType("VkComponentSwizzle")
        public int r() { return VkComponentMapping.nr(address()); }
        /** Returns the value of the {@code g} field. */
        @NativeType("VkComponentSwizzle")
        public int g() { return VkComponentMapping.ng(address()); }
        /** Returns the value of the {@code b} field. */
        @NativeType("VkComponentSwizzle")
        public int b() { return VkComponentMapping.nb(address()); }
        /** Returns the value of the {@code a} field. */
        @NativeType("VkComponentSwizzle")
        public int a() { return VkComponentMapping.na(address()); }

        /** Sets the specified value to the {@code r} field. */
        public VkComponentMapping.Buffer r(@NativeType("VkComponentSwizzle") int value) { VkComponentMapping.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public VkComponentMapping.Buffer g(@NativeType("VkComponentSwizzle") int value) { VkComponentMapping.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public VkComponentMapping.Buffer b(@NativeType("VkComponentSwizzle") int value) { VkComponentMapping.nb(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public VkComponentMapping.Buffer a(@NativeType("VkComponentSwizzle") int value) { VkComponentMapping.na(address(), value); return this; }

    }

}