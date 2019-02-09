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
 * Structure specifying parameters for the reservation of command buffer space.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code buffer}&#8217;s usage flag <b>must</b> have the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set.</li>
 * <li>The {@code offset} <b>must</b> be aligned to {@link VkDeviceGeneratedCommandsLimitsNVX}{@code ::minCommandsTokenBufferOffsetAlignment}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code tokenType} <b>must</b> be a valid {@code VkIndirectCommandsTokenTypeNVX} value</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCmdProcessCommandsInfoNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code tokenType} &ndash; specifies the token command type.</li>
 * <li>{@code buffer} &ndash; specifies the {@code VkBuffer} storing the functional arguments for each squence. These argumetns can be written by the device.</li>
 * <li>{@code offset} &ndash; specified an offset into {@code buffer} where the arguments start.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkIndirectCommandsTokenNVX {
 *     VkIndirectCommandsTokenTypeNVX tokenType;
 *     VkBuffer buffer;
 *     VkDeviceSize offset;
 * }</code></pre>
 */
public class VkIndirectCommandsTokenNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TOKENTYPE,
        BUFFER,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TOKENTYPE = layout.offsetof(0);
        BUFFER = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkIndirectCommandsTokenNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsTokenNVX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code tokenType} field. */
    @NativeType("VkIndirectCommandsTokenTypeNVX")
    public int tokenType() { return ntokenType(address()); }
    /** Returns the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** Returns the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }

    /** Sets the specified value to the {@code tokenType} field. */
    public VkIndirectCommandsTokenNVX tokenType(@NativeType("VkIndirectCommandsTokenTypeNVX") int value) { ntokenType(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkIndirectCommandsTokenNVX buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkIndirectCommandsTokenNVX offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsTokenNVX set(
        int tokenType,
        long buffer,
        long offset
    ) {
        tokenType(tokenType);
        buffer(buffer);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsTokenNVX set(VkIndirectCommandsTokenNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsTokenNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsTokenNVX malloc() {
        return wrap(VkIndirectCommandsTokenNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkIndirectCommandsTokenNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsTokenNVX calloc() {
        return wrap(VkIndirectCommandsTokenNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkIndirectCommandsTokenNVX} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsTokenNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkIndirectCommandsTokenNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsTokenNVX} instance for the specified memory address. */
    public static VkIndirectCommandsTokenNVX create(long address) {
        return wrap(VkIndirectCommandsTokenNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectCommandsTokenNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkIndirectCommandsTokenNVX.class, address);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkIndirectCommandsTokenNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectCommandsTokenNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsTokenNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkIndirectCommandsTokenNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkIndirectCommandsTokenNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkIndirectCommandsTokenNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkIndirectCommandsTokenNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsTokenNVX mallocStack(MemoryStack stack) {
        return wrap(VkIndirectCommandsTokenNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkIndirectCommandsTokenNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsTokenNVX callocStack(MemoryStack stack) {
        return wrap(VkIndirectCommandsTokenNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tokenType}. */
    public static int ntokenType(long struct) { return UNSAFE.getInt(null, struct + VkIndirectCommandsTokenNVX.TOKENTYPE); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkIndirectCommandsTokenNVX.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VkIndirectCommandsTokenNVX.OFFSET); }

    /** Unsafe version of {@link #tokenType(int) tokenType}. */
    public static void ntokenType(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectCommandsTokenNVX.TOKENTYPE, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkIndirectCommandsTokenNVX.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { UNSAFE.putLong(null, struct + VkIndirectCommandsTokenNVX.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsTokenNVX} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsTokenNVX, Buffer> implements NativeResource {

        private static final VkIndirectCommandsTokenNVX ELEMENT_FACTORY = VkIndirectCommandsTokenNVX.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsTokenNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsTokenNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkIndirectCommandsTokenNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code tokenType} field. */
        @NativeType("VkIndirectCommandsTokenTypeNVX")
        public int tokenType() { return VkIndirectCommandsTokenNVX.ntokenType(address()); }
        /** Returns the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkIndirectCommandsTokenNVX.nbuffer(address()); }
        /** Returns the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkIndirectCommandsTokenNVX.noffset(address()); }

        /** Sets the specified value to the {@code tokenType} field. */
        public VkIndirectCommandsTokenNVX.Buffer tokenType(@NativeType("VkIndirectCommandsTokenTypeNVX") int value) { VkIndirectCommandsTokenNVX.ntokenType(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkIndirectCommandsTokenNVX.Buffer buffer(@NativeType("VkBuffer") long value) { VkIndirectCommandsTokenNVX.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkIndirectCommandsTokenNVX.Buffer offset(@NativeType("VkDeviceSize") long value) { VkIndirectCommandsTokenNVX.noffset(address(), value); return this; }

    }

}