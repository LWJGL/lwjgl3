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
 * Structure containing the conformance test suite version the implementation is compliant with.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceDriverProperties}, {@link VkPhysicalDeviceVulkan12Properties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkConformanceVersion {
 *     uint8_t {@link #major};
 *     uint8_t {@link #minor};
 *     uint8_t {@link #subminor};
 *     uint8_t {@link #patch};
 * }</code></pre>
 */
public class VkConformanceVersion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAJOR,
        MINOR,
        SUBMINOR,
        PATCH;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAJOR = layout.offsetof(0);
        MINOR = layout.offsetof(1);
        SUBMINOR = layout.offsetof(2);
        PATCH = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkConformanceVersion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkConformanceVersion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the major version number of the conformance test suite. */
    @NativeType("uint8_t")
    public byte major() { return nmajor(address()); }
    /** the minor version number of the conformance test suite. */
    @NativeType("uint8_t")
    public byte minor() { return nminor(address()); }
    /** the subminor version number of the conformance test suite. */
    @NativeType("uint8_t")
    public byte subminor() { return nsubminor(address()); }
    /** the patch version number of the conformance test suite. */
    @NativeType("uint8_t")
    public byte patch() { return npatch(address()); }

    /** Sets the specified value to the {@link #major} field. */
    public VkConformanceVersion major(@NativeType("uint8_t") byte value) { nmajor(address(), value); return this; }
    /** Sets the specified value to the {@link #minor} field. */
    public VkConformanceVersion minor(@NativeType("uint8_t") byte value) { nminor(address(), value); return this; }
    /** Sets the specified value to the {@link #subminor} field. */
    public VkConformanceVersion subminor(@NativeType("uint8_t") byte value) { nsubminor(address(), value); return this; }
    /** Sets the specified value to the {@link #patch} field. */
    public VkConformanceVersion patch(@NativeType("uint8_t") byte value) { npatch(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkConformanceVersion set(
        byte major,
        byte minor,
        byte subminor,
        byte patch
    ) {
        major(major);
        minor(minor);
        subminor(subminor);
        patch(patch);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkConformanceVersion set(VkConformanceVersion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkConformanceVersion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkConformanceVersion malloc() {
        return wrap(VkConformanceVersion.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkConformanceVersion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkConformanceVersion calloc() {
        return wrap(VkConformanceVersion.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkConformanceVersion} instance allocated with {@link BufferUtils}. */
    public static VkConformanceVersion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkConformanceVersion.class, memAddress(container), container);
    }

    /** Returns a new {@code VkConformanceVersion} instance for the specified memory address. */
    public static VkConformanceVersion create(long address) {
        return wrap(VkConformanceVersion.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkConformanceVersion createSafe(long address) {
        return address == NULL ? null : wrap(VkConformanceVersion.class, address);
    }

    /**
     * Returns a new {@link VkConformanceVersion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersion.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkConformanceVersion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersion.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConformanceVersion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkConformanceVersion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersion.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkConformanceVersion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkConformanceVersion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConformanceVersion malloc(MemoryStack stack) {
        return wrap(VkConformanceVersion.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkConformanceVersion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConformanceVersion calloc(MemoryStack stack) {
        return wrap(VkConformanceVersion.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkConformanceVersion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersion.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConformanceVersion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersion.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #major}. */
    public static byte nmajor(long struct) { return UNSAFE.getByte(null, struct + VkConformanceVersion.MAJOR); }
    /** Unsafe version of {@link #minor}. */
    public static byte nminor(long struct) { return UNSAFE.getByte(null, struct + VkConformanceVersion.MINOR); }
    /** Unsafe version of {@link #subminor}. */
    public static byte nsubminor(long struct) { return UNSAFE.getByte(null, struct + VkConformanceVersion.SUBMINOR); }
    /** Unsafe version of {@link #patch}. */
    public static byte npatch(long struct) { return UNSAFE.getByte(null, struct + VkConformanceVersion.PATCH); }

    /** Unsafe version of {@link #major(byte) major}. */
    public static void nmajor(long struct, byte value) { UNSAFE.putByte(null, struct + VkConformanceVersion.MAJOR, value); }
    /** Unsafe version of {@link #minor(byte) minor}. */
    public static void nminor(long struct, byte value) { UNSAFE.putByte(null, struct + VkConformanceVersion.MINOR, value); }
    /** Unsafe version of {@link #subminor(byte) subminor}. */
    public static void nsubminor(long struct, byte value) { UNSAFE.putByte(null, struct + VkConformanceVersion.SUBMINOR, value); }
    /** Unsafe version of {@link #patch(byte) patch}. */
    public static void npatch(long struct, byte value) { UNSAFE.putByte(null, struct + VkConformanceVersion.PATCH, value); }

    // -----------------------------------

    /** An array of {@link VkConformanceVersion} structs. */
    public static class Buffer extends StructBuffer<VkConformanceVersion, Buffer> implements NativeResource {

        private static final VkConformanceVersion ELEMENT_FACTORY = VkConformanceVersion.create(-1L);

        /**
         * Creates a new {@code VkConformanceVersion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkConformanceVersion#SIZEOF}, and its mark will be undefined.
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
        protected VkConformanceVersion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkConformanceVersion#major} field. */
        @NativeType("uint8_t")
        public byte major() { return VkConformanceVersion.nmajor(address()); }
        /** @return the value of the {@link VkConformanceVersion#minor} field. */
        @NativeType("uint8_t")
        public byte minor() { return VkConformanceVersion.nminor(address()); }
        /** @return the value of the {@link VkConformanceVersion#subminor} field. */
        @NativeType("uint8_t")
        public byte subminor() { return VkConformanceVersion.nsubminor(address()); }
        /** @return the value of the {@link VkConformanceVersion#patch} field. */
        @NativeType("uint8_t")
        public byte patch() { return VkConformanceVersion.npatch(address()); }

        /** Sets the specified value to the {@link VkConformanceVersion#major} field. */
        public VkConformanceVersion.Buffer major(@NativeType("uint8_t") byte value) { VkConformanceVersion.nmajor(address(), value); return this; }
        /** Sets the specified value to the {@link VkConformanceVersion#minor} field. */
        public VkConformanceVersion.Buffer minor(@NativeType("uint8_t") byte value) { VkConformanceVersion.nminor(address(), value); return this; }
        /** Sets the specified value to the {@link VkConformanceVersion#subminor} field. */
        public VkConformanceVersion.Buffer subminor(@NativeType("uint8_t") byte value) { VkConformanceVersion.nsubminor(address(), value); return this; }
        /** Sets the specified value to the {@link VkConformanceVersion#patch} field. */
        public VkConformanceVersion.Buffer patch(@NativeType("uint8_t") byte value) { VkConformanceVersion.npatch(address(), value); return this; }

    }

}