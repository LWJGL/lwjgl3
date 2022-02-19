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
 * Structure specifying the parameters of private data slot construction.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK13#vkCreatePrivateDataSlot CreatePrivateDataSlot}, {@link EXTPrivateData#vkCreatePrivateDataSlotEXT CreatePrivateDataSlotEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPrivateDataSlotCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPrivateDataSlotCreateFlags {@link #flags};
 * }</code></pre>
 */
public class VkPrivateDataSlotCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPrivateDataSlotCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPrivateDataSlotCreateInfo(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkPrivateDataSlotCreateFlags")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPrivateDataSlotCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO} value to the {@link #sType} field. */
    public VkPrivateDataSlotCreateInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPrivateDataSlotCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPrivateDataSlotCreateInfo flags(@NativeType("VkPrivateDataSlotCreateFlags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPrivateDataSlotCreateInfo set(
        int sType,
        long pNext,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkPrivateDataSlotCreateInfo set(VkPrivateDataSlotCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPrivateDataSlotCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPrivateDataSlotCreateInfo malloc() {
        return wrap(VkPrivateDataSlotCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPrivateDataSlotCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPrivateDataSlotCreateInfo calloc() {
        return wrap(VkPrivateDataSlotCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPrivateDataSlotCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPrivateDataSlotCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPrivateDataSlotCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPrivateDataSlotCreateInfo} instance for the specified memory address. */
    public static VkPrivateDataSlotCreateInfo create(long address) {
        return wrap(VkPrivateDataSlotCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPrivateDataSlotCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPrivateDataSlotCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPrivateDataSlotCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPrivateDataSlotCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPrivateDataSlotCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPrivateDataSlotCreateInfo malloc(MemoryStack stack) {
        return wrap(VkPrivateDataSlotCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPrivateDataSlotCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPrivateDataSlotCreateInfo calloc(MemoryStack stack) {
        return wrap(VkPrivateDataSlotCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPrivateDataSlotCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPrivateDataSlotCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPrivateDataSlotCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPrivateDataSlotCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPrivateDataSlotCreateInfo.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPrivateDataSlotCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPrivateDataSlotCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPrivateDataSlotCreateInfo.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkPrivateDataSlotCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPrivateDataSlotCreateInfo, Buffer> implements NativeResource {

        private static final VkPrivateDataSlotCreateInfo ELEMENT_FACTORY = VkPrivateDataSlotCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPrivateDataSlotCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPrivateDataSlotCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPrivateDataSlotCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPrivateDataSlotCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPrivateDataSlotCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkPrivateDataSlotCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPrivateDataSlotCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkPrivateDataSlotCreateInfo#flags} field. */
        @NativeType("VkPrivateDataSlotCreateFlags")
        public int flags() { return VkPrivateDataSlotCreateInfo.nflags(address()); }

        /** Sets the specified value to the {@link VkPrivateDataSlotCreateInfo#sType} field. */
        public VkPrivateDataSlotCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPrivateDataSlotCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO} value to the {@link VkPrivateDataSlotCreateInfo#sType} field. */
        public VkPrivateDataSlotCreateInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO); }
        /** Sets the specified value to the {@link VkPrivateDataSlotCreateInfo#pNext} field. */
        public VkPrivateDataSlotCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPrivateDataSlotCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPrivateDataSlotCreateInfo#flags} field. */
        public VkPrivateDataSlotCreateInfo.Buffer flags(@NativeType("VkPrivateDataSlotCreateFlags") int value) { VkPrivateDataSlotCreateInfo.nflags(address(), value); return this; }

    }

}