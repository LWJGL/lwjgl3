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
 * Structure specifying a indirect dispatching command.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkDispatchIndirectCommand} have the same meaning as the corresponding parameters of {@link VK10#vkCmdDispatch CmdDispatch}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code x} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0]</li>
 * <li>{@code y} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
 * <li>{@code z} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2]</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCmdDispatchIndirect CmdDispatchIndirect}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDispatchIndirectCommand {
 *     uint32_t {@link #x};
 *     uint32_t {@link #y};
 *     uint32_t {@link #z};
 * }</code></pre>
 */
public class VkDispatchIndirectCommand extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDispatchIndirectCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDispatchIndirectCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of local workgroups to dispatch in the X dimension. */
    @NativeType("uint32_t")
    public int x() { return nx(address()); }
    /** the number of local workgroups to dispatch in the Y dimension. */
    @NativeType("uint32_t")
    public int y() { return ny(address()); }
    /** the number of local workgroups to dispatch in the Z dimension. */
    @NativeType("uint32_t")
    public int z() { return nz(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public VkDispatchIndirectCommand x(@NativeType("uint32_t") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public VkDispatchIndirectCommand y(@NativeType("uint32_t") int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #z} field. */
    public VkDispatchIndirectCommand z(@NativeType("uint32_t") int value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDispatchIndirectCommand set(
        int x,
        int y,
        int z
    ) {
        x(x);
        y(y);
        z(z);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDispatchIndirectCommand set(VkDispatchIndirectCommand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDispatchIndirectCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDispatchIndirectCommand malloc() {
        return wrap(VkDispatchIndirectCommand.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDispatchIndirectCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDispatchIndirectCommand calloc() {
        return wrap(VkDispatchIndirectCommand.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDispatchIndirectCommand} instance allocated with {@link BufferUtils}. */
    public static VkDispatchIndirectCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDispatchIndirectCommand.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDispatchIndirectCommand} instance for the specified memory address. */
    public static VkDispatchIndirectCommand create(long address) {
        return wrap(VkDispatchIndirectCommand.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDispatchIndirectCommand createSafe(long address) {
        return address == NULL ? null : wrap(VkDispatchIndirectCommand.class, address);
    }

    /**
     * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirectCommand.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirectCommand.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirectCommand.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDispatchIndirectCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirectCommand.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDispatchIndirectCommand.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDispatchIndirectCommand mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDispatchIndirectCommand callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDispatchIndirectCommand mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDispatchIndirectCommand callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDispatchIndirectCommand.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDispatchIndirectCommand.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDispatchIndirectCommand.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDispatchIndirectCommand.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDispatchIndirectCommand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchIndirectCommand malloc(MemoryStack stack) {
        return wrap(VkDispatchIndirectCommand.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDispatchIndirectCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchIndirectCommand calloc(MemoryStack stack) {
        return wrap(VkDispatchIndirectCommand.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirectCommand.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirectCommand.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + VkDispatchIndirectCommand.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + VkDispatchIndirectCommand.Y); }
    /** Unsafe version of {@link #z}. */
    public static int nz(long struct) { return UNSAFE.getInt(null, struct + VkDispatchIndirectCommand.Z); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + VkDispatchIndirectCommand.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + VkDispatchIndirectCommand.Y, value); }
    /** Unsafe version of {@link #z(int) z}. */
    public static void nz(long struct, int value) { UNSAFE.putInt(null, struct + VkDispatchIndirectCommand.Z, value); }

    // -----------------------------------

    /** An array of {@link VkDispatchIndirectCommand} structs. */
    public static class Buffer extends StructBuffer<VkDispatchIndirectCommand, Buffer> implements NativeResource {

        private static final VkDispatchIndirectCommand ELEMENT_FACTORY = VkDispatchIndirectCommand.create(-1L);

        /**
         * Creates a new {@code VkDispatchIndirectCommand.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDispatchIndirectCommand#SIZEOF}, and its mark will be undefined.
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
        protected VkDispatchIndirectCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDispatchIndirectCommand#x} field. */
        @NativeType("uint32_t")
        public int x() { return VkDispatchIndirectCommand.nx(address()); }
        /** @return the value of the {@link VkDispatchIndirectCommand#y} field. */
        @NativeType("uint32_t")
        public int y() { return VkDispatchIndirectCommand.ny(address()); }
        /** @return the value of the {@link VkDispatchIndirectCommand#z} field. */
        @NativeType("uint32_t")
        public int z() { return VkDispatchIndirectCommand.nz(address()); }

        /** Sets the specified value to the {@link VkDispatchIndirectCommand#x} field. */
        public VkDispatchIndirectCommand.Buffer x(@NativeType("uint32_t") int value) { VkDispatchIndirectCommand.nx(address(), value); return this; }
        /** Sets the specified value to the {@link VkDispatchIndirectCommand#y} field. */
        public VkDispatchIndirectCommand.Buffer y(@NativeType("uint32_t") int value) { VkDispatchIndirectCommand.ny(address(), value); return this; }
        /** Sets the specified value to the {@link VkDispatchIndirectCommand#z} field. */
        public VkDispatchIndirectCommand.Buffer z(@NativeType("uint32_t") int value) { VkDispatchIndirectCommand.nz(address(), value); return this; }

    }

}