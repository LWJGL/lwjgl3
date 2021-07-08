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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a command buffer submission.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code commandBuffer} <b>must</b> not have been allocated with {@link VK10#VK_COMMAND_BUFFER_LEVEL_SECONDARY COMMAND_BUFFER_LEVEL_SECONDARY}</li>
 * <li>If {@code deviceMask} is not 0, it <b>must</b> be a valid device mask</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSynchronization2#VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSubmitInfo2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferSubmitInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkCommandBuffer {@link #commandBuffer};
 *     uint32_t {@link #deviceMask};
 * }</code></pre>
 */
public class VkCommandBufferSubmitInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMMANDBUFFER,
        DEVICEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMMANDBUFFER = layout.offsetof(2);
        DEVICEMASK = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkCommandBufferSubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferSubmitInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkCommandBuffer} to be submitted for execution. */
    @NativeType("VkCommandBuffer")
    public long commandBuffer() { return ncommandBuffer(address()); }
    /** a bitmask indicating which devices in a device group execute the command buffer. A {@code deviceMask} of 0 is equivalent to setting all bits corresponding to valid devices in the group to 1. */
    @NativeType("uint32_t")
    public int deviceMask() { return ndeviceMask(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCommandBufferSubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCommandBufferSubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #commandBuffer} field. */
    public VkCommandBufferSubmitInfoKHR commandBuffer(VkCommandBuffer value) { ncommandBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceMask} field. */
    public VkCommandBufferSubmitInfoKHR deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferSubmitInfoKHR set(
        int sType,
        long pNext,
        VkCommandBuffer commandBuffer,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        commandBuffer(commandBuffer);
        deviceMask(deviceMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferSubmitInfoKHR set(VkCommandBufferSubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferSubmitInfoKHR malloc() {
        return wrap(VkCommandBufferSubmitInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferSubmitInfoKHR calloc() {
        return wrap(VkCommandBufferSubmitInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferSubmitInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance for the specified memory address. */
    public static VkCommandBufferSubmitInfoKHR create(long address) {
        return wrap(VkCommandBufferSubmitInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferSubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferSubmitInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferSubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferSubmitInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkCommandBufferSubmitInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkCommandBufferSubmitInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferSubmitInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkCommandBufferSubmitInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferSubmitInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkCommandBufferSubmitInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferSubmitInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferSubmitInfoKHR.PNEXT); }
    /** Unsafe version of {@link #commandBuffer}. */
    public static long ncommandBuffer(long struct) { return memGetAddress(struct + VkCommandBufferSubmitInfoKHR.COMMANDBUFFER); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return UNSAFE.getInt(null, struct + VkCommandBufferSubmitInfoKHR.DEVICEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferSubmitInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferSubmitInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #commandBuffer(VkCommandBuffer) commandBuffer}. */
    public static void ncommandBuffer(long struct, VkCommandBuffer value) { memPutAddress(struct + VkCommandBufferSubmitInfoKHR.COMMANDBUFFER, value.address()); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { UNSAFE.putInt(null, struct + VkCommandBufferSubmitInfoKHR.DEVICEMASK, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCommandBufferSubmitInfoKHR.COMMANDBUFFER));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkCommandBufferSubmitInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferSubmitInfoKHR, Buffer> implements NativeResource {

        private static final VkCommandBufferSubmitInfoKHR ELEMENT_FACTORY = VkCommandBufferSubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferSubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferSubmitInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandBufferSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCommandBufferSubmitInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferSubmitInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkCommandBufferSubmitInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferSubmitInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkCommandBufferSubmitInfoKHR#commandBuffer} field. */
        @NativeType("VkCommandBuffer")
        public long commandBuffer() { return VkCommandBufferSubmitInfoKHR.ncommandBuffer(address()); }
        /** @return the value of the {@link VkCommandBufferSubmitInfoKHR#deviceMask} field. */
        @NativeType("uint32_t")
        public int deviceMask() { return VkCommandBufferSubmitInfoKHR.ndeviceMask(address()); }

        /** Sets the specified value to the {@link VkCommandBufferSubmitInfoKHR#sType} field. */
        public VkCommandBufferSubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferSubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferSubmitInfoKHR#pNext} field. */
        public VkCommandBufferSubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferSubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferSubmitInfoKHR#commandBuffer} field. */
        public VkCommandBufferSubmitInfoKHR.Buffer commandBuffer(VkCommandBuffer value) { VkCommandBufferSubmitInfoKHR.ncommandBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkCommandBufferSubmitInfoKHR#deviceMask} field. */
        public VkCommandBufferSubmitInfoKHR.Buffer deviceMask(@NativeType("uint32_t") int value) { VkCommandBufferSubmitInfoKHR.ndeviceMask(address(), value); return this; }

    }

}