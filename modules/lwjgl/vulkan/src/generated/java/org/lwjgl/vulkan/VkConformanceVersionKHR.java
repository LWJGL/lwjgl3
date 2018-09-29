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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code major} &ndash; the major version number of the conformance test suite.</li>
 * <li>{@code minor} &ndash; the minor version number of the conformance test suite.</li>
 * <li>{@code subminor} &ndash; the subminor version number of the conformance test suite.</li>
 * <li>{@code patch} &ndash; the patch version number of the conformance test suite.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkConformanceVersionKHR {
 *     uint8_t major;
 *     uint8_t minor;
 *     uint8_t subminor;
 *     uint8_t patch;
 * }</code></pre>
 */
public class VkConformanceVersionKHR extends Struct implements NativeResource {

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

    VkConformanceVersionKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkConformanceVersionKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkConformanceVersionKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code major} field. */
    @NativeType("uint8_t")
    public byte major() { return nmajor(address()); }
    /** Returns the value of the {@code minor} field. */
    @NativeType("uint8_t")
    public byte minor() { return nminor(address()); }
    /** Returns the value of the {@code subminor} field. */
    @NativeType("uint8_t")
    public byte subminor() { return nsubminor(address()); }
    /** Returns the value of the {@code patch} field. */
    @NativeType("uint8_t")
    public byte patch() { return npatch(address()); }

    /** Sets the specified value to the {@code major} field. */
    public VkConformanceVersionKHR major(@NativeType("uint8_t") byte value) { nmajor(address(), value); return this; }
    /** Sets the specified value to the {@code minor} field. */
    public VkConformanceVersionKHR minor(@NativeType("uint8_t") byte value) { nminor(address(), value); return this; }
    /** Sets the specified value to the {@code subminor} field. */
    public VkConformanceVersionKHR subminor(@NativeType("uint8_t") byte value) { nsubminor(address(), value); return this; }
    /** Sets the specified value to the {@code patch} field. */
    public VkConformanceVersionKHR patch(@NativeType("uint8_t") byte value) { npatch(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkConformanceVersionKHR set(
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
    public VkConformanceVersionKHR set(VkConformanceVersionKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkConformanceVersionKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkConformanceVersionKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkConformanceVersionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkConformanceVersionKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkConformanceVersionKHR} instance allocated with {@link BufferUtils}. */
    public static VkConformanceVersionKHR create() {
        return new VkConformanceVersionKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkConformanceVersionKHR} instance for the specified memory address. */
    public static VkConformanceVersionKHR create(long address) {
        return new VkConformanceVersionKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkConformanceVersionKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkConformanceVersionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkConformanceVersionKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkConformanceVersionKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkConformanceVersionKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkConformanceVersionKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkConformanceVersionKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConformanceVersionKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConformanceVersionKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #major}. */
    public static byte nmajor(long struct) { return memGetByte(struct + VkConformanceVersionKHR.MAJOR); }
    /** Unsafe version of {@link #minor}. */
    public static byte nminor(long struct) { return memGetByte(struct + VkConformanceVersionKHR.MINOR); }
    /** Unsafe version of {@link #subminor}. */
    public static byte nsubminor(long struct) { return memGetByte(struct + VkConformanceVersionKHR.SUBMINOR); }
    /** Unsafe version of {@link #patch}. */
    public static byte npatch(long struct) { return memGetByte(struct + VkConformanceVersionKHR.PATCH); }

    /** Unsafe version of {@link #major(byte) major}. */
    public static void nmajor(long struct, byte value) { memPutByte(struct + VkConformanceVersionKHR.MAJOR, value); }
    /** Unsafe version of {@link #minor(byte) minor}. */
    public static void nminor(long struct, byte value) { memPutByte(struct + VkConformanceVersionKHR.MINOR, value); }
    /** Unsafe version of {@link #subminor(byte) subminor}. */
    public static void nsubminor(long struct, byte value) { memPutByte(struct + VkConformanceVersionKHR.SUBMINOR, value); }
    /** Unsafe version of {@link #patch(byte) patch}. */
    public static void npatch(long struct, byte value) { memPutByte(struct + VkConformanceVersionKHR.PATCH, value); }

    // -----------------------------------

    /** An array of {@link VkConformanceVersionKHR} structs. */
    public static class Buffer extends StructBuffer<VkConformanceVersionKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkConformanceVersionKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkConformanceVersionKHR#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkConformanceVersionKHR newInstance(long address) {
            return new VkConformanceVersionKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code major} field. */
        @NativeType("uint8_t")
        public byte major() { return VkConformanceVersionKHR.nmajor(address()); }
        /** Returns the value of the {@code minor} field. */
        @NativeType("uint8_t")
        public byte minor() { return VkConformanceVersionKHR.nminor(address()); }
        /** Returns the value of the {@code subminor} field. */
        @NativeType("uint8_t")
        public byte subminor() { return VkConformanceVersionKHR.nsubminor(address()); }
        /** Returns the value of the {@code patch} field. */
        @NativeType("uint8_t")
        public byte patch() { return VkConformanceVersionKHR.npatch(address()); }

        /** Sets the specified value to the {@code major} field. */
        public VkConformanceVersionKHR.Buffer major(@NativeType("uint8_t") byte value) { VkConformanceVersionKHR.nmajor(address(), value); return this; }
        /** Sets the specified value to the {@code minor} field. */
        public VkConformanceVersionKHR.Buffer minor(@NativeType("uint8_t") byte value) { VkConformanceVersionKHR.nminor(address(), value); return this; }
        /** Sets the specified value to the {@code subminor} field. */
        public VkConformanceVersionKHR.Buffer subminor(@NativeType("uint8_t") byte value) { VkConformanceVersionKHR.nsubminor(address(), value); return this; }
        /** Sets the specified value to the {@code patch} field. */
        public VkConformanceVersionKHR.Buffer patch(@NativeType("uint8_t") byte value) { VkConformanceVersionKHR.npatch(address(), value); return this; }

    }

}